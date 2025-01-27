package addToCartResponsePojo;

import java.util.List;

public class Data{
	private int itemQty;
	private Object amount;
	private String imageUrl;
	private Object amountWithoutAdjustment;
	private String id;
	private List<CartItemsItem> cartItems;
	private Indicators indicators;

	public void setItemQty(int itemQty){
		this.itemQty = itemQty;
	}

	public int getItemQty(){
		return itemQty;
	}

	public void setAmount(Object amount){
		this.amount = amount;
	}

	public Object getAmount(){
		return amount;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setAmountWithoutAdjustment(Object amountWithoutAdjustment){
		this.amountWithoutAdjustment = amountWithoutAdjustment;
	}

	public Object getAmountWithoutAdjustment(){
		return amountWithoutAdjustment;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setCartItems(List<CartItemsItem> cartItems){
		this.cartItems = cartItems;
	}

	public List<CartItemsItem> getCartItems(){
		return cartItems;
	}

	public void setIndicators(Indicators indicators){
		this.indicators = indicators;
	}

	public Indicators getIndicators(){
		return indicators;
	}
}