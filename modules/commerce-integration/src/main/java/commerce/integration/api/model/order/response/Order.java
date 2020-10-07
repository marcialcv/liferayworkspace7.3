package commerce.integration.api.model.order.response;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true) 
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Order {

	@JsonProperty("accountExternalReferenceCode")
	private String accountExternalReferenceCode;
	@JsonProperty("accountId")
	private long accountId;
	@JsonProperty("advanceStatus")
	private String advanceStatus;
	@JsonProperty("billingAddressId")
	private long billingAddressId;
	@JsonProperty("channelExternalReferenceCode")
	private String channelExternalReferenceCode;
	@JsonProperty("channelId")
	private long channelId;
	@JsonProperty("couponCode")
	private String couponCode;
	@JsonProperty("createDate")
	private String createDate;
	@JsonProperty("currencyCode")
	private String currencyCode;
	@JsonProperty("externalReferenceCode")
	private String externalReferenceCode;
	@JsonProperty("id")
	private String id;
	@JsonProperty("modifiedDate")
	private String modifiedDate;
	@JsonProperty("orderStatus")
	private long orderStatus;
	@JsonProperty("paymentMethod")
	private String paymentMethod;
	@JsonProperty("paymentStatus")
	private long paymentStatus;
	@JsonProperty("printedNote")
	private String printedNote;
	@JsonProperty("purchaseOrderNumber")
	private String purchaseOrderNumber;
	@JsonProperty("shippingAddressId")
	private long shippingAddressId;
	@JsonProperty("shippingAmountFormatted")
	private String shippingAmountFormatted;
	@JsonProperty("shippingAmountValue")
	private long shippingAmountValue;
	@JsonProperty("shippingOption")
	private String shippingOption;
	@JsonProperty("shippingWithTaxAmountFormatted")
	private String shippingWithTaxAmountFormatted;
	@JsonProperty("shippingWithTaxAmountValue")
	private long shippingWithTaxAmountValue;
	@JsonProperty("subtotalFormatted")
	private String subtotalFormatted;
	@JsonProperty("subtotalWithTaxAmountFormatted")
	private String subtotalWithTaxAmountFormatted;
	@JsonProperty("totalFormatted")
	private String totalFormatted;
	@JsonProperty("totalWithTaxAmountFormatted")
	private String totalWithTaxAmountFormatted;
	@JsonProperty("transactionId")
	private String transactionId;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("accountExternalReferenceCode")
	public String getAccountExternalReferenceCode() {
		return accountExternalReferenceCode;
	}

	@JsonProperty("accountExternalReferenceCode")
	public void setAccountExternalReferenceCode(String accountExternalReferenceCode) {
		this.accountExternalReferenceCode = accountExternalReferenceCode;
	}

	@JsonProperty("accountId")
	public long getAccountId() {
		return accountId;
	}

	@JsonProperty("accountId")
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	@JsonProperty("advanceStatus")
	public String getAdvanceStatus() {
		return advanceStatus;
	}

	@JsonProperty("advanceStatus")
	public void setAdvanceStatus(String advanceStatus) {
		this.advanceStatus = advanceStatus;
	}

	@JsonProperty("billingAddressId")
	public long getBillingAddressId() {
		return billingAddressId;
	}

	@JsonProperty("billingAddressId")
	public void setBillingAddressId(long billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	@JsonProperty("channelExternalReferenceCode")
	public String getChannelExternalReferenceCode() {
		return channelExternalReferenceCode;
	}

	@JsonProperty("channelExternalReferenceCode")
	public void setChannelExternalReferenceCode(String channelExternalReferenceCode) {
		this.channelExternalReferenceCode = channelExternalReferenceCode;
	}

	@JsonProperty("channelId")
	public long getChannelId() {
		return channelId;
	}

	@JsonProperty("channelId")
	public void setChannelId(long channelId) {
		this.channelId = channelId;
	}

	@JsonProperty("couponCode")
	public String getCouponCode() {
		return couponCode;
	}

	@JsonProperty("couponCode")
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	@JsonProperty("createDate")
	public String getCreateDate() {
		return createDate;
	}

	@JsonProperty("createDate")
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	@JsonProperty("currencyCode")
	public String getCurrencyCode() {
		return currencyCode;
	}

	@JsonProperty("currencyCode")
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	@JsonProperty("externalReferenceCode")
	public String getExternalReferenceCode() {
		return externalReferenceCode;
	}

	@JsonProperty("externalReferenceCode")
	public void setExternalReferenceCode(String externalReferenceCode) {
		this.externalReferenceCode = externalReferenceCode;
	}

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("modifiedDate")
	public String getModifiedDate() {
		return modifiedDate;
	}

	@JsonProperty("modifiedDate")
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@JsonProperty("orderStatus")
	public long getOrderStatus() {
		return orderStatus;
	}

	@JsonProperty("orderStatus")
	public void setOrderStatus(long orderStatus) {
		this.orderStatus = orderStatus;
	}

	@JsonProperty("paymentMethod")
	public String getPaymentMethod() {
		return paymentMethod;
	}

	@JsonProperty("paymentMethod")
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	@JsonProperty("paymentStatus")
	public long getPaymentStatus() {
		return paymentStatus;
	}

	@JsonProperty("paymentStatus")
	public void setPaymentStatus(long paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	@JsonProperty("printedNote")
	public String getPrintedNote() {
		return printedNote;
	}

	@JsonProperty("printedNote")
	public void setPrintedNote(String printedNote) {
		this.printedNote = printedNote;
	}

	@JsonProperty("purchaseOrderNumber")
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}

	@JsonProperty("purchaseOrderNumber")
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}

	@JsonProperty("shippingAddressId")
	public long getShippingAddressId() {
		return shippingAddressId;
	}

	@JsonProperty("shippingAddressId")
	public void setShippingAddressId(long shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	@JsonProperty("shippingAmountFormatted")
	public String getShippingAmountFormatted() {
		return shippingAmountFormatted;
	}

	@JsonProperty("shippingAmountFormatted")
	public void setShippingAmountFormatted(String shippingAmountFormatted) {
		this.shippingAmountFormatted = shippingAmountFormatted;
	}

	@JsonProperty("shippingAmountValue")
	public long getShippingAmountValue() {
		return shippingAmountValue;
	}

	@JsonProperty("shippingAmountValue")
	public void setShippingAmountValue(long shippingAmountValue) {
		this.shippingAmountValue = shippingAmountValue;
	}

	@JsonProperty("shippingOption")
	public String getShippingOption() {
		return shippingOption;
	}

	@JsonProperty("shippingOption")
	public void setShippingOption(String shippingOption) {
		this.shippingOption = shippingOption;
	}

	@JsonProperty("shippingWithTaxAmountFormatted")
	public String getShippingWithTaxAmountFormatted() {
		return shippingWithTaxAmountFormatted;
	}

	@JsonProperty("shippingWithTaxAmountFormatted")
	public void setShippingWithTaxAmountFormatted(String shippingWithTaxAmountFormatted) {
		this.shippingWithTaxAmountFormatted = shippingWithTaxAmountFormatted;
	}

	@JsonProperty("shippingWithTaxAmountValue")
	public long getShippingWithTaxAmountValue() {
		return shippingWithTaxAmountValue;
	}

	@JsonProperty("shippingWithTaxAmountValue")
	public void setShippingWithTaxAmountValue(long shippingWithTaxAmountValue) {
		this.shippingWithTaxAmountValue = shippingWithTaxAmountValue;
	}

	@JsonProperty("subtotalFormatted")
	public String getSubtotalFormatted() {
		return subtotalFormatted;
	}

	@JsonProperty("subtotalFormatted")
	public void setSubtotalFormatted(String subtotalFormatted) {
		this.subtotalFormatted = subtotalFormatted;
	}

	@JsonProperty("subtotalWithTaxAmountFormatted")
	public String getSubtotalWithTaxAmountFormatted() {
		return subtotalWithTaxAmountFormatted;
	}

	@JsonProperty("subtotalWithTaxAmountFormatted")
	public void setSubtotalWithTaxAmountFormatted(String subtotalWithTaxAmountFormatted) {
		this.subtotalWithTaxAmountFormatted = subtotalWithTaxAmountFormatted;
	}

	@JsonProperty("totalFormatted")
	public String getTotalFormatted() {
		return totalFormatted;
	}

	@JsonProperty("totalFormatted")
	public void setTotalFormatted(String totalFormatted) {
		this.totalFormatted = totalFormatted;
	}

	@JsonProperty("totalWithTaxAmountFormatted")
	public String getTotalWithTaxAmountFormatted() {
		return totalWithTaxAmountFormatted;
	}

	@JsonProperty("totalWithTaxAmountFormatted")
	public void setTotalWithTaxAmountFormatted(String totalWithTaxAmountFormatted) {
		this.totalWithTaxAmountFormatted = totalWithTaxAmountFormatted;
	}

	@JsonProperty("transactionId")
	public String getTransactionId() {
		return transactionId;
	}

	@JsonProperty("transactionId")
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
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