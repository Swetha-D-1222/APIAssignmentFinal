package productSelectionResponsePojo;

import java.util.List;

public class FiltersItem{
	private boolean horizontal;
	private boolean grouped;
	private List<DataItem> data;
	private String parameter;
	private String name;
	private String type;
	private boolean searchable;
	private String theme;

	public void setHorizontal(boolean horizontal){
		this.horizontal = horizontal;
	}

	public boolean isHorizontal(){
		return horizontal;
	}

	public void setGrouped(boolean grouped){
		this.grouped = grouped;
	}

	public boolean isGrouped(){
		return grouped;
	}

	public void setData(List<DataItem> data){
		this.data = data;
	}

	public List<DataItem> getData(){
		return data;
	}

	public void setParameter(String parameter){
		this.parameter = parameter;
	}

	public String getParameter(){
		return parameter;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}

	public void setSearchable(boolean searchable){
		this.searchable = searchable;
	}

	public boolean isSearchable(){
		return searchable;
	}

	public void setTheme(String theme){
		this.theme = theme;
	}

	public String getTheme(){
		return theme;
	}
}