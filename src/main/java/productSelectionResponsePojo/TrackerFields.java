package productSelectionResponsePojo;

public class TrackerFields{
	private String corrected_search_term;
	private String ds_category_ids;
	private String is_ner_eligible;
	private String group_type;
	private String sales_velocity_components;
	private String eligible_tags;
	private String is_vector_search_applied;

	public void setcorrected_search_term(String corrected_search_term){
		this.corrected_search_term = corrected_search_term;
	}

	public String getcorrected_search_term(){
		return corrected_search_term;
	}

	public void setds_category_ids(String ds_category_ids){
		this.ds_category_ids = ds_category_ids;
	}

	public String getds_category_ids(){
		return ds_category_ids;
	}

	public void setis_ner_eligible(String is_ner_eligible){
		this.is_ner_eligible = is_ner_eligible;
	}

	public String getis_ner_eligible(){
		return is_ner_eligible;
	}

	public void setgroup_type(String group_type){
		this.group_type = group_type;
	}

	public String getgroup_type(){
		return group_type;
	}

	public void setsales_velocity_components(String sales_velocity_components){
		this.sales_velocity_components = sales_velocity_components;
	}

	public String getsales_velocity_components(){
		return sales_velocity_components;
	}

	public void seteligible_tags(String eligible_tags){
		this.eligible_tags = eligible_tags;
	}

	public String geteligible_tags(){
		return eligible_tags;
	}

	public void setis_vector_search_applied(String is_vector_search_applied){
		this.is_vector_search_applied = is_vector_search_applied;
	}

	public String getis_vector_search_applied(){
		return is_vector_search_applied;
	}
}
