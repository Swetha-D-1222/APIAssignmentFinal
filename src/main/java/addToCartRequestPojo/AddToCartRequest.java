package addToCartRequestPojo;

import java.util.List;

public class AddToCartRequest{
	private AtcData atcData;
	private List<ItemsItem> items;

	public void setAtcData(AtcData atcData){
		this.atcData = atcData;
	}

	public AtcData getAtcData(){
		return atcData;
	}

	public void setItems(List<ItemsItem> items){
		this.items = items;
	}

	public List<ItemsItem> getItems(){
		return items;
	}
}