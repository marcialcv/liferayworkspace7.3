package commerce.integration.api.model.order.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "items" })
public class OrderSearchResponse {

	@JsonProperty("items")
	private List<Order> items = null;
	
	
	@JsonProperty("items")
	public List<Order> getItems() {
		return items;
	}

	@JsonProperty("items")
	public void setItems(List<Order> items) {
		this.items = items;
	}

	
}