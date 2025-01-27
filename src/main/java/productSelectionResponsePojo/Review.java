package productSelectionResponsePojo;

public class Review{
	private boolean isNewSeller;
	private Object sellerRating;
	private Object absoluteRating;
	private int rating;
	private int count;

	public void setIsNewSeller(boolean isNewSeller){
		this.isNewSeller = isNewSeller;
	}

	public boolean isIsNewSeller(){
		return isNewSeller;
	}

	public void setSellerRating(Object sellerRating){
		this.sellerRating = sellerRating;
	}

	public Object getSellerRating(){
		return sellerRating;
	}

	public void setAbsoluteRating(Object absoluteRating){
		this.absoluteRating = absoluteRating;
	}

	public Object getAbsoluteRating(){
		return absoluteRating;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}
}
