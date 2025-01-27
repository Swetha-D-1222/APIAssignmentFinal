package productSelectionResponsePojo;

public class Paging{
	private int total_item;
	private int total_page;
	private int page;
	private int item_per_page;

	public void settotal_item(int total_item){
		this.total_item = total_item;
	}

	public int gettotal_item(){
		return total_item;
	}

	public void settotal_page(int total_page){
		this.total_page = total_page;
	}

	public int gettotal_page(){
		return total_page;
	}

	public void setPage(int page){
		this.page = page;
	}

	public int getPage(){
		return page;
	}

	public void setitem_per_page(int item_per_page){
		this.item_per_page = item_per_page;
	}

	public int getitem_per_page(){
		return item_per_page;
	}
}
