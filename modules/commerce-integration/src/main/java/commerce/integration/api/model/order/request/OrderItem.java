package commerce.integration.api.model.order.request;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "skuId", "sku", "quantity" })
public class OrderItem {

	@JsonProperty("skuId")
	private long skuId;
	@JsonProperty("sku")
	private String sku;
	@JsonProperty("quantity")
	private long quantity = 1;

	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("skuId")
	public long getSkuId() {
		return skuId;
	}

	@JsonProperty("skuId")
	public void setSkuId(long skuId) {
		this.skuId = skuId;
	}

	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}

	@JsonProperty("sku")
	public void setSku(String sku) {
		this.sku = sku;
	}

	@JsonProperty("quantity")
	public long getQuantity() {
		return quantity;
	}

	@JsonProperty("quantity")
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}