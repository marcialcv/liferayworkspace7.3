package commerce.integration.api.model.order.request;

import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({ "accountId", "channelId", "currencyCode", "orderItems", "shippingAmount",
		"shippingWithTaxAmount" })
public class OrderRequest {

	@JsonProperty("accountId")
	private long accountId;
	@JsonProperty("channelId")
	private long channelId;
	@JsonProperty("currencyCode")
	private String currencyCode;
	@JsonProperty("orderItems")
	private List<OrderItem> orderItems = null;
	@JsonProperty("shippingAmount")
	private long shippingAmount;
	@JsonProperty("shippingWithTaxAmount")
	private long shippingWithTaxAmount;
	@JsonProperty("orderStatus")
	private String orderStatus = "2";
	
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	@JsonProperty("id")
	private String id;
	
	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("accountId")
	public long getAccountId() {
		return accountId;
	}

	@JsonProperty("accountId")
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	@JsonProperty("channelId")
	public long getChannelId() {
		return channelId;
	}

	@JsonProperty("channelId")
	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}

	@JsonProperty("currencyCode")
	public String getCurrencyCode() {
		return currencyCode;
	}

	@JsonProperty("currencyCode")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@JsonProperty("orderItems")
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	@JsonProperty("orderItems")
	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	@JsonProperty("shippingAmount")
	public long getShippingAmount() {
		return shippingAmount;
	}

	@JsonProperty("shippingAmount")
	public void setShippingAmount(long shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	@JsonProperty("shippingWithTaxAmount")
	public long getShippingWithTaxAmount() {
		return shippingWithTaxAmount;
	}

	@JsonProperty("shippingWithTaxAmount")
	public void setShippingWithTaxAmount(long shippingWithTaxAmount) {
		this.shippingWithTaxAmount = shippingWithTaxAmount;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@JsonProperty("orderStatus")
	public String getOrderStatus() {
		return orderStatus;
	}

	@JsonProperty("orderStatus")
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	

}