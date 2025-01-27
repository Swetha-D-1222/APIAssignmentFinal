package productSelectionResponsePojo;

public class Badge{
	private String logisticBadge_stock;
	private String merchantBadge;
	private String logisticBadge;
	private String merchantBadgeUrl;

	public void setlogisticBadge_stock(String logisticBadge_stock){
		this.logisticBadge_stock = logisticBadge_stock;
	}

	public String getlogisticBadge_stock(){
		return logisticBadge_stock;
	}

	public void setMerchantBadge(String merchantBadge){
		this.merchantBadge = merchantBadge;
	}

	public String getMerchantBadge(){
		return merchantBadge;
	}

	public void setLogisticBadge(String logisticBadge){
		this.logisticBadge = logisticBadge;
	}

	public String getLogisticBadge(){
		return logisticBadge;
	}

	public void setMerchantBadgeUrl(String merchantBadgeUrl){
		this.merchantBadgeUrl = merchantBadgeUrl;
	}

	public String getMerchantBadgeUrl(){
		return merchantBadgeUrl;
	}
}
