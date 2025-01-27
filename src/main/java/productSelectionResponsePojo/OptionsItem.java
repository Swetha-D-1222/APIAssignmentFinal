package productSelectionResponsePojo;

public class OptionsItem{
	private boolean visibility;
	private String name;
	private String label;
	private int value;
	private boolean selected;

	public void setVisibility(boolean visibility){
		this.visibility = visibility;
	}

	public boolean isVisibility(){
		return visibility;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setLabel(String label){
		this.label = label;
	}

	public String getLabel(){
		return label;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	public void setSelected(boolean selected){
		this.selected = selected;
	}

	public boolean isSelected(){
		return selected;
	}
}
