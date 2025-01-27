package productSelectionResponsePojo;

public class SubCategoryItem{
	private boolean valid;
	private int level;
	private int count;
	private String label;
	private int priority;
	private String value;
	private boolean popular;
	private boolean selected;
	private String logoUrl;

	public void setValid(boolean valid){
		this.valid = valid;
	}

	public boolean isValid(){
		return valid;
	}

	public void setLevel(int level){
		this.level = level;
	}

	public int getLevel(){
		return level;
	}

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setPriority(int priority){
		this.priority = priority;
	}

	public int getPriority(){
		return priority;
	}

	public void setValue(String value){
		this.value = value;
	}

	public String getValue(){
		return value;
	}

	public void setPopular(boolean popular){
		this.popular = popular;
	}

	public boolean isPopular(){
		return popular;
	}

	public void setSelected(boolean selected){
		this.selected = selected;
	}

	public boolean isSelected(){
		return selected;
	}

	public void setLogoUrl(String logoUrl){
		this.logoUrl = logoUrl;
	}

	public String getLogoUrl(){
		return logoUrl;
	}
}
