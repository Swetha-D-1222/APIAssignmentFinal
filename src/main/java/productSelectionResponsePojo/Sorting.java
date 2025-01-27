package productSelectionResponsePojo;

import java.util.List;

public class Sorting{
	private String parameter;
	private List<OptionsItem> options;

	public void setParameter(String parameter){
		this.parameter = parameter;
	}

	public String getParameter(){
		return parameter;
	}

	public void setOptions(List<OptionsItem> options){
		this.options = options;
	}

	public List<OptionsItem> getOptions(){
		return options;
	}
}