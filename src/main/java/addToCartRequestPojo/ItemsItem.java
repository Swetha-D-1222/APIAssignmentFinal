package addToCartRequestPojo;

public class ItemsItem{
	private int quantity;
	private String pickupPointCode;
	private Object latitude;
	private String id;
	private String type;
	private String warehouseCode;
	private Object longitude;
	private boolean instantPickup;

	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public int getQuantity(){
		return quantity;
	}

	public void setPickupPointCode(String pickupPointCode){
		this.pickupPointCode = pickupPointCode;
	}

	public String getPickupPointCode(){
		return pickupPointCode;
	}

	public void setLatitude(Object latitude){
		this.latitude = latitude;
	}

	public Object getLatitude(){
		return latitude;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setWarehouseCode(String warehouseCode){
		this.warehouseCode = warehouseCode;
	}

	public String getWarehouseCode(){
		return warehouseCode;
	}

	public void setLongitude(Object longitude){
		this.longitude = longitude;
	}

	public Object getLongitude(){
		return longitude;
	}

	public void setInstantPickup(boolean instantPickup){
		this.instantPickup = instantPickup;
	}

	public boolean isInstantPickup(){
		return instantPickup;
	}
}
