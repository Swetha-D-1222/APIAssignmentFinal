package productSelectionResponsePojo;

public class StoreClosingInfo{
	private boolean delayShipping;
	private int endDate;
	private boolean storeClosed;

	public void setDelayShipping(boolean delayShipping){
		this.delayShipping = delayShipping;
	}

	public boolean isDelayShipping(){
		return delayShipping;
	}

	public void setEndDate(int endDate){
		this.endDate = endDate;
	}

	public int getEndDate(){
		return endDate;
	}

	public void setStoreClosed(boolean storeClosed){
		this.storeClosed = storeClosed;
	}

	public boolean isStoreClosed(){
		return storeClosed;
	}
}
