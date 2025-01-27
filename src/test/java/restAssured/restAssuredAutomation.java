package restAssured;

import addToCartRequestPojo.AddToCartRequest;
import addToCartRequestPojo.AtcData;
import addToCartRequestPojo.ItemsItem;
import addToCartResponsePojo.AddToCartResponse;
import checkOutApiRequest.CheckOutRequest;
import io.cucumber.core.internal.com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.cucumberexpressions.Group;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Method;
import org.testng.Assert;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import productSelectionResponsePojo.ProductSelectionResponse;
import productSelectionResponsePojo.ProductsItem;
import storeApiRequestPojo.StoreApiRequest;
import storeApiResponsePojo.DataItem;
import storeApiResponsePojo.StoreApiResponse;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class restAssuredAutomation
{
    Response response;
    String requestBody = "";
    static RequestSpecification requestSpecification = null;
    static StoreApiRequest storeApiRequest = new StoreApiRequest();
    static StoreApiResponse storeApiResponse;
    static ProductSelectionResponse productSelectionResponse;
    static AddToCartRequest addToCartRequest = new AddToCartRequest();
    static AtcData atcData = new AtcData();
    static ItemsItem items = new ItemsItem();
    static AddToCartResponse addToCartResponse;
    static ProductsItem productsItem;
    static CheckOutRequest checkOutRequest = new CheckOutRequest();
    static DataItem dataItem = new DataItem();
    static Map<Integer, Object> requestMap = new HashMap<>();
    ObjectMapper obj = new ObjectMapper();
    String groupName = "";
    String groupCode = "";

    @Given("The base URI {string}")
    public void theBaseURI(String baseUri) {
        requestSpecification = given().baseUri(baseUri).contentType("application/JSON");
    }

    @When("The user gives longitude and latitude {string},{string}")
    public void theUserGivesLongitudeAndLatitude(String longitude, String latitude) throws JsonProcessingException {
        storeApiRequest.setLatitude(latitude);
        storeApiRequest.setLongitude(longitude);
        requestBody = obj.writeValueAsString(storeApiRequest);
        response = requestSpecification.body(requestBody).request(Method.POST, "/backend/store-picker/api/store/nearBy");
        response.prettyPrint();
        storeApiResponse = obj.readValue(response.asString(), StoreApiResponse.class);
        storeApiResponse = response.getBody().as(StoreApiResponse.class);
    }

    @Then("Validate the response")
    public void validateTheResponse() {
        Assert.assertEquals(response.getStatusCode(), 200, "Data not created");
    }

    String productname="";
    @When("The user searches the product {string} in the fresh store")
    public void theUserSearchesTheProductInTheFreshStore(String productName) throws JsonProcessingException {
        groupCode = storeApiResponse.getData().get(0).getCode();
        groupName = storeApiResponse.getData().get(0).getGroupName();
        productname=productName;
        response = requestSpecification
                .queryParam("storeCode", groupCode)
                .queryParam("sellerGroup", groupName)
                .queryParam("searchTerm", productname)
                .queryParam("page", 1)
                .queryParam("start", 0)
                .request(Method.GET, "/backend/search/grocery/v1/products");

        productSelectionResponse = response.getBody().as(ProductSelectionResponse.class);
        response.prettyPrint();
    }

    @Then("Validate whether the users request and response is same")
    public void validateWhetherTheUsersRequestAndResponseIsSame()
    {
        Assert.assertTrue(productSelectionResponse.getData().getProducts().get(0).getName().contains(productname),"Product is available");
        Assert.assertEquals(response.getStatusCode(), 200, "Product not available");
    }

    @When("The user clicks the add to cart button the products gets added to the cart {string},{string},{string},{string},{string},{string}")
    public void theUserClicksTheAddToCartButtonTheProductsGetsAddedToTheCart(String quantity, String id, String source, String instantPickUp, String latitude, String longitude) throws JsonProcessingException {

        List<ItemsItem> itemsList = new LinkedList<>();
        items.setId(productSelectionResponse.getData().getProducts().get(0).getItemSku());
        items.setQuantity(Integer.parseInt(quantity));
        System.out.println(productSelectionResponse.getData().getProducts().get(0).getTags().get(0));
        items.setType(productSelectionResponse.getData().getProducts().get(0).getTags().get(0));
        items.setPickupPointCode(productSelectionResponse.getData().getProducts().get(0).getPickupPointCode());
        items.setWarehouseCode(storeApiResponse.getData().get(0).getCode());
        items.setLatitude(latitude);
        items.setLongitude(longitude);
        items.setInstantPickup(Boolean.parseBoolean(instantPickUp));
        itemsList.add(items);
        atcData.setId(id);
        atcData.setSource(source);
        addToCartRequest.setAtcData(atcData);
        System.out.println(productSelectionResponse.getData().getProducts().get(0).getPickupPointCode());
        addToCartRequest.setItems(itemsList);
        requestBody = obj.writeValueAsString(addToCartRequest);
        System.out.println(requestBody);
        response = requestSpecification.body(requestBody)
                .queryParam("sellerGroup", storeApiResponse.getData().get(0).getGroupName())
                .request(Method.POST, "/backend/retail/checkouts/_add");
        addToCartResponse = obj.readValue(response.asString(), AddToCartResponse.class);
        response.prettyPrint();

    }

    @Then("Validate whether the product is added to the cart")
    public void validateWhetherTheProductIsAddedToTheCart()
    {
        Assert.assertEquals(addToCartResponse.getSuccessMessages().getQuantity().get(0),"Berhasil menambah produk ke Bag.","Product not added to cart!!");
        Assert.assertEquals(productSelectionResponse.getData().getProducts().get(0).getPrice().getMinPrice(),addToCartResponse.getData().getAmount(),"Sorry price don't match");
        Assert.assertEquals(productSelectionResponse.getData().getProducts().get(0).getSku(),addToCartResponse.getData().getCartItems().get(0).getProductSku(),"Product id's don't match");
        Assert.assertEquals(addToCartRequest.getAtcData().getId(),addToCartResponse.getData().getCartItems().get(0).getAtcData().getId(),"Id's don't match");
        Assert.assertEquals(addToCartRequest.getAtcData().getSource(),addToCartResponse.getData().getCartItems().get(0).getAtcData().getSource(),"Id's don't match");
        Assert.assertEquals(addToCartRequest.getItems().get(0).getQuantity(), addToCartResponse.getData().getItemQty(), "Quantity of items not same");
    }

    @When("The user gives longitude and latitude {string},{string} for checkout")
    public void theUserGivesLongitudeAndLatitudeForCheckout(String longitude, String latitude) throws JsonProcessingException {
        System.out.println(addToCartResponse.getStatus());
        checkOutRequest.setLatitude(latitude);
        checkOutRequest.setLongitude(longitude);
        requestBody = obj.writeValueAsString(checkOutRequest);
        response = requestSpecification
                .header("Host", "wwwuatb.gdn-app.com")
                .header("Accept", "application/json")
//                .header("Authorization", "Bearer AT-B7DFA924-9CEB-4755-9ACC-65A4F06F13EA")
                .header("Blibli-Session-Id", "1faef5f5-c5e4-47f1-96ea-92861f23495b--08156234234")
                .header("Accept-Language", "en-GB,en-US;q=0.9,en;q=0.8")
                .header("Accept-Encoding", "gzip, deflate, br")
                .header("Content-Type", "application/json")
                .header("Blibli-User-Id", "6f127adb-adc9-4d8c-814b-86144c39a248%40blibli")
                .header("User-Agent","Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/132.0.0.0 Mobile Safari/537.36")
                .header("Connection", "keep-alive")
                .body(requestBody)
                .queryParam("sellerGroup", storeApiResponse.getData().get(0).getGroupName())
                .request(Method.POST, "/backend/retail/checkouts/_summary");

        response.prettyPrint();
    }

    @Then("The response is validated for checkout")
    public void theResponseIsValidatedForCheckout()
    {
        Assert.assertEquals(response.getStatusCode(),200,"Expected result not found");
    }


    @When("The user clicks of the payment button and pays the amount for the product {string}")
    public void theUserClicksOfThePaymentButtonAndPaysTheAmountForTheProduct(String productId)
    {
        response = requestSpecification
                .queryParam("sellerGroup", storeApiResponse.getData().get(0).getGroupName())
                .request(Method.GET, "/backend/retail/checkouts/" + productId + "/payments");
        response.prettyPrint();
    }

    @Then("validate the response for payment")
    public void validateTheResponseForPayment()
    {
        Assert.assertEquals(response.getStatusCode(),200,"Expected result not found");
    }


    @When("The user completes the payment")
    public void theUserCompletesThePayment()
    {
        long orderId=0;
        response = requestSpecification
                .queryParam("sellerGroup", storeApiResponse.getData().get(0).getGroupName())
                .request(Method.GET, "/backend/retail/orders/"+orderId);
        response.prettyPrint();
    }

    @Then("Validate the thank you message")
    public void validateTheThankYouMessage()
    {
        Assert.assertEquals(response.getStatusCode(),200,"Order placement not successfull!");
    }
}
