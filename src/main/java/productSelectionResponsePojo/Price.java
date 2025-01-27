package productSelectionResponsePojo;

public class Price{
	private String priceDisplay;
	private String offerPriceDisplay;
	private Object minPrice;
	private Object discountPrice;
	private int discount;
	private boolean isPriceRange;

	public void setPriceDisplay(String priceDisplay){
		this.priceDisplay = priceDisplay;
	}

	public String getPriceDisplay(){
		return priceDisplay;
	}

	public void setOfferPriceDisplay(String offerPriceDisplay){
		this.offerPriceDisplay = offerPriceDisplay;
	}

	public String getOfferPriceDisplay(){
		return offerPriceDisplay;
	}

	public void setMinPrice(Object minPrice){
		this.minPrice = minPrice;
	}

	public Object getMinPrice(){
		return minPrice;
	}

	public void setDiscountPrice(Object discountPrice){
		this.discountPrice = discountPrice;
	}

	public Object getDiscountPrice(){
		return discountPrice;
	}

	public void setDiscount(int discount){
		this.discount = discount;
	}

	public int getDiscount(){
		return discount;
	}

	public void setIsPriceRange(boolean isPriceRange){
		this.isPriceRange = isPriceRange;
	}

	public boolean isIsPriceRange(){
		return isPriceRange;
	}
}
