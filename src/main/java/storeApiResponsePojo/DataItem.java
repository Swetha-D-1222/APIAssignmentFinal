package storeApiResponsePojo;

public class DataItem{
	private String groupDisplayName;
	private String groupName;
	private String groupType;
	private boolean defaultStore;
	private boolean available;
	private boolean selected;
	private String code;

	public void setGroupDisplayName(String groupDisplayName){
		this.groupDisplayName = groupDisplayName;
	}

	public String getGroupDisplayName(){
		return groupDisplayName;
	}

	public void setGroupName(String groupName){
		this.groupName = groupName;
	}

	public String getGroupName(){
		return groupName;
	}

	public void setGroupType(String groupType){
		this.groupType = groupType;
	}

	public String getGroupType(){
		return groupType;
	}

	public void setDefaultStore(boolean defaultStore){
		this.defaultStore = defaultStore;
	}

	public boolean isDefaultStore(){
		return defaultStore;
	}

	public void setAvailable(boolean available){
		this.available = available;
	}

	public boolean isAvailable(){
		return available;
	}

	public void setSelected(boolean selected){
		this.selected = selected;
	}

	public boolean isSelected(){
		return selected;
	}

	public void setCode(String code){
		this.code = code;
	}

	public String getCode(){
		return code;
	}
}
