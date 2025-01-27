package productSelectionResponsePojo;

public class PageMetadata{
	private String productComparisonOverriddenC2s;
	private String categoryWithMaxProductCount;
	private String productComparisonAllowedC1s;
	private String showProductComparison;

	public void setProductComparisonOverriddenC2s(String productComparisonOverriddenC2s){
		this.productComparisonOverriddenC2s = productComparisonOverriddenC2s;
	}

	public String getProductComparisonOverriddenC2s(){
		return productComparisonOverriddenC2s;
	}

	public void setCategoryWithMaxProductCount(String categoryWithMaxProductCount){
		this.categoryWithMaxProductCount = categoryWithMaxProductCount;
	}

	public String getCategoryWithMaxProductCount(){
		return categoryWithMaxProductCount;
	}

	public void setProductComparisonAllowedC1s(String productComparisonAllowedC1s){
		this.productComparisonAllowedC1s = productComparisonAllowedC1s;
	}

	public String getProductComparisonAllowedC1s(){
		return productComparisonAllowedC1s;
	}

	public void setShowProductComparison(String showProductComparison){
		this.showProductComparison = showProductComparison;
	}

	public String getShowProductComparison(){
		return showProductComparison;
	}
}
