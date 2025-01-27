package productSelectionResponsePojo;

import java.util.List;

public class Data{
	private String code;
	private int productsPerRow;
	private List<Object> countExceedsLimit;
	private Paging paging;
	private PageMetadata pageMetadata;
	private List<FiltersItem> filters;
	private List<Object> responseFlags;
	private List<ProductsItem> products;
	private List<String> selectedCategoryIds;
	private String searchTerm;
	private Sorting sorting;
	private List<Object> suggestions;
	private long serverCurrentTime;
	private TrackerFields trackerFields;
	private int plpSectionGroceryPosition;

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}

	public void setProductsPerRow(int productsPerRow){
		this.productsPerRow = productsPerRow;
	}

	public int getProductsPerRow(){
		return productsPerRow;
	}

	public void setCountExceedsLimit(List<Object> countExceedsLimit){
		this.countExceedsLimit = countExceedsLimit;
	}

	public List<Object> getCountExceedsLimit(){
		return countExceedsLimit;
	}

	public void setPaging(Paging paging){
		this.paging = paging;
	}

	public Paging getPaging(){
		return paging;
	}

	public void setPageMetadata(PageMetadata pageMetadata){
		this.pageMetadata = pageMetadata;
	}

	public PageMetadata getPageMetadata(){
		return pageMetadata;
	}

	public void setFilters(List<FiltersItem> filters){
		this.filters = filters;
	}

	public List<FiltersItem> getFilters(){
		return filters;
	}

	public void setResponseFlags(List<Object> responseFlags){
		this.responseFlags = responseFlags;
	}

	public List<Object> getResponseFlags(){
		return responseFlags;
	}

	public void setProducts(List<ProductsItem> products){
		this.products = products;
	}

	public List<ProductsItem> getProducts(){
		return products;
	}

	public void setSelectedCategoryIds(List<String> selectedCategoryIds){
		this.selectedCategoryIds = selectedCategoryIds;
	}

	public List<String> getSelectedCategoryIds(){
		return selectedCategoryIds;
	}

	public void setSearchTerm(String searchTerm){
		this.searchTerm = searchTerm;
	}

	public String getSearchTerm(){
		return searchTerm;
	}

	public void setSorting(Sorting sorting){
		this.sorting = sorting;
	}

	public Sorting getSorting(){
		return sorting;
	}

	public void setSuggestions(List<Object> suggestions){
		this.suggestions = suggestions;
	}

	public List<Object> getSuggestions(){
		return suggestions;
	}

	public void setServerCurrentTime(long serverCurrentTime){
		this.serverCurrentTime = serverCurrentTime;
	}

	public long getServerCurrentTime(){
		return serverCurrentTime;
	}

	public void setTrackerFields(TrackerFields trackerFields){
		this.trackerFields = trackerFields;
	}

	public TrackerFields getTrackerFields(){
		return trackerFields;
	}

	public void setPlpSectionGroceryPosition(int plpSectionGroceryPosition){
		this.plpSectionGroceryPosition = plpSectionGroceryPosition;
	}

	public int getPlpSectionGroceryPosition(){
		return plpSectionGroceryPosition;
	}
}