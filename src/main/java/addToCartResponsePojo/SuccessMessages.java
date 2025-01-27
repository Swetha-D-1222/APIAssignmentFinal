package addToCartResponsePojo;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SuccessMessages
{
	@JsonProperty("Quantity")
	private List<String> Quantity;

	public void setQuantity(List<String> Quantity){
		this.Quantity = Quantity;
	}

	public List<String> getQuantity(){
		return Quantity;
	}
}