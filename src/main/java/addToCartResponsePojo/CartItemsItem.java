package addToCartResponsePojo;

import java.util.List;

public class CartItemsItem{
	private Object originalPrice;
	private String itemSku;
	private Object discount;
	private String itemId;
	private String productSku;
	private List<Object> wholesale;
	private Object price;
	private int qty;
	private String imageUrl;
	private String name;
	private AtcData atcData;
	private List<AttributesItem> attributes;
	private String productUrl;
	private Object itemWeight;

	public void setOriginalPrice(Object originalPrice){
		this.originalPrice = originalPrice;
	}

	public Object getOriginalPrice(){
		return originalPrice;
	}

	public void setItemSku(String itemSku){
		this.itemSku = itemSku;
	}

	public String getItemSku(){
		return itemSku;
	}

	public void setDiscount(Object discount){
		this.discount = discount;
	}

	public Object getDiscount(){
		return discount;
	}

	public void setItemId(String itemId){
		this.itemId = itemId;
	}

	public String getItemId(){
		return itemId;
	}

	public void setProductSku(String productSku){
		this.productSku = productSku;
	}

	public String getProductSku(){
		return productSku;
	}

	public void setWholesale(List<Object> wholesale){
		this.wholesale = wholesale;
	}

	public List<Object> getWholesale(){
		return wholesale;
	}

	public void setPrice(Object price){
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public int getQty(){
		return qty;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setAtcData(AtcData atcData){
		this.atcData = atcData;
	}

	public AtcData getAtcData(){
		return atcData;
	}

	public void setAttributes(List<AttributesItem> attributes){
		this.attributes = attributes;
	}

	public List<AttributesItem> getAttributes(){
		return attributes;
	}

	public void setProductUrl(String productUrl){
		this.productUrl = productUrl;
	}

	public String getProductUrl(){
		return productUrl;
	}

	public void setItemWeight(Object itemWeight){
		this.itemWeight = itemWeight;
	}

	public Object getItemWeight(){
		return itemWeight;
	}
}