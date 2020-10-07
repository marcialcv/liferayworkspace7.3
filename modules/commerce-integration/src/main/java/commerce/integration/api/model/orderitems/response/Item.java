package commerce.integration.api.model.orderitems.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "bookedQuantityId", "deliveryGroup", "discountAmount", "discountPercentageLevel1",
		"discountPercentageLevel1WithTaxAmount", "discountPercentageLevel2", "discountPercentageLevel2WithTaxAmount",
		"discountPercentageLevel3", "discountPercentageLevel3WithTaxAmount", "discountPercentageLevel4",
		"discountPercentageLevel4WithTaxAmount", "discountWithTaxAmount", "externalReferenceCode", "finalPrice",
		"finalPriceWithTaxAmount", "id", "name", "orderExternalReferenceCode", "orderId", "printedNote", "promoPrice",
		"promoPriceWithTaxAmount", "quantity", "shippedQuantity", "shippingAddressId", "sku",
		"skuExternalReferenceCode", "skuId", "subscription", "unitPrice", "unitPriceWithTaxAmount" })
public class Item {

	@JsonProperty("bookedQuantityId")
	private long bookedQuantityId;
	@JsonProperty("deliveryGroup")
	private String deliveryGroup;
	@JsonProperty("discountAmount")
	private long discountAmount;
	@JsonProperty("discountPercentageLevel1")
	private long discountPercentageLevel1;
	@JsonProperty("discountPercentageLevel1WithTaxAmount")
	private long discountPercentageLevel1WithTaxAmount;
	@JsonProperty("discountPercentageLevel2")
	private long discountPercentageLevel2;
	@JsonProperty("discountPercentageLevel2WithTaxAmount")
	private long discountPercentageLevel2WithTaxAmount;
	@JsonProperty("discountPercentageLevel3")
	private long discountPercentageLevel3;
	@JsonProperty("discountPercentageLevel3WithTaxAmount")
	private long discountPercentageLevel3WithTaxAmount;
	@JsonProperty("discountPercentageLevel4")
	private long discountPercentageLevel4;
	@JsonProperty("discountPercentageLevel4WithTaxAmount")
	private long discountPercentageLevel4WithTaxAmount;
	@JsonProperty("discountWithTaxAmount")
	private long discountWithTaxAmount;
	@JsonProperty("externalReferenceCode")
	private String externalReferenceCode;
	@JsonProperty("finalPrice")
	private long finalPrice;
	@JsonProperty("finalPriceWithTaxAmount")
	private long finalPriceWithTaxAmount;
	@JsonProperty("id")
	private long id;
	@JsonProperty("name")
	private Name name;
	@JsonProperty("orderExternalReferenceCode")
	private String orderExternalReferenceCode;
	@JsonProperty("orderId")
	private long orderId;
	@JsonProperty("printedNote")
	private String printedNote;
	@JsonProperty("promoPrice")
	private long promoPrice;
	@JsonProperty("promoPriceWithTaxAmount")
	private long promoPriceWithTaxAmount;
	@JsonProperty("quantity")
	private long quantity;
	@JsonProperty("shippedQuantity")
	private long shippedQuantity;
	@JsonProperty("shippingAddressId")
	private long shippingAddressId;
	@JsonProperty("sku")
	private String sku;
	@JsonProperty("skuExternalReferenceCode")
	private String skuExternalReferenceCode;
	@JsonProperty("skuId")
	private long skuId;
	@JsonProperty("subscription")
	private boolean subscription;
	@JsonProperty("unitPrice")
	private long unitPrice;
	@JsonProperty("unitPriceWithTaxAmount")
	private long unitPriceWithTaxAmount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("bookedQuantityId")
	public long getBookedQuantityId() {
		return bookedQuantityId;
	}

	@JsonProperty("bookedQuantityId")
	public void setBookedQuantityId(long bookedQuantityId) {
		this.bookedQuantityId = bookedQuantityId;
	}

	@JsonProperty("deliveryGroup")
	public String getDeliveryGroup() {
		return deliveryGroup;
	}

	@JsonProperty("deliveryGroup")
	public void setDeliveryGroup(String deliveryGroup) {
		this.deliveryGroup = deliveryGroup;
	}

	@JsonProperty("discountAmount")
	public long getDiscountAmount() {
		return discountAmount;
	}

	@JsonProperty("discountAmount")
	public void setDiscountAmount(long discountAmount) {
		this.discountAmount = discountAmount;
	}

	@JsonProperty("discountPercentageLevel1")
	public long getDiscountPercentageLevel1() {
		return discountPercentageLevel1;
	}

	@JsonProperty("discountPercentageLevel1")
	public void setDiscountPercentageLevel1(long discountPercentageLevel1) {
		this.discountPercentageLevel1 = discountPercentageLevel1;
	}

	@JsonProperty("discountPercentageLevel1WithTaxAmount")
	public long getDiscountPercentageLevel1WithTaxAmount() {
		return discountPercentageLevel1WithTaxAmount;
	}

	@JsonProperty("discountPercentageLevel1WithTaxAmount")
	public void setDiscountPercentageLevel1WithTaxAmount(long discountPercentageLevel1WithTaxAmount) {
		this.discountPercentageLevel1WithTaxAmount = discountPercentageLevel1WithTaxAmount;
	}

	@JsonProperty("discountPercentageLevel2")
	public long getDiscountPercentageLevel2() {
		return discountPercentageLevel2;
	}

	@JsonProperty("discountPercentageLevel2")
	public void setDiscountPercentageLevel2(long discountPercentageLevel2) {
		this.discountPercentageLevel2 = discountPercentageLevel2;
	}

	@JsonProperty("discountPercentageLevel2WithTaxAmount")
	public long getDiscountPercentageLevel2WithTaxAmount() {
		return discountPercentageLevel2WithTaxAmount;
	}

	@JsonProperty("discountPercentageLevel2WithTaxAmount")
	public void setDiscountPercentageLevel2WithTaxAmount(long discountPercentageLevel2WithTaxAmount) {
		this.discountPercentageLevel2WithTaxAmount = discountPercentageLevel2WithTaxAmount;
	}

	@JsonProperty("discountPercentageLevel3")
	public long getDiscountPercentageLevel3() {
		return discountPercentageLevel3;
	}

	@JsonProperty("discountPercentageLevel3")
	public void setDiscountPercentageLevel3(long discountPercentageLevel3) {
		this.discountPercentageLevel3 = discountPercentageLevel3;
	}

	@JsonProperty("discountPercentageLevel3WithTaxAmount")
	public long getDiscountPercentageLevel3WithTaxAmount() {
		return discountPercentageLevel3WithTaxAmount;
	}

	@JsonProperty("discountPercentageLevel3WithTaxAmount")
	public void setDiscountPercentageLevel3WithTaxAmount(long discountPercentageLevel3WithTaxAmount) {
		this.discountPercentageLevel3WithTaxAmount = discountPercentageLevel3WithTaxAmount;
	}

	@JsonProperty("discountPercentageLevel4")
	public long getDiscountPercentageLevel4() {
		return discountPercentageLevel4;
	}

	@JsonProperty("discountPercentageLevel4")
	public void setDiscountPercentageLevel4(long discountPercentageLevel4) {
		this.discountPercentageLevel4 = discountPercentageLevel4;
	}

	@JsonProperty("discountPercentageLevel4WithTaxAmount")
	public long getDiscountPercentageLevel4WithTaxAmount() {
		return discountPercentageLevel4WithTaxAmount;
	}

	@JsonProperty("discountPercentageLevel4WithTaxAmount")
	public void setDiscountPercentageLevel4WithTaxAmount(long discountPercentageLevel4WithTaxAmount) {
		this.discountPercentageLevel4WithTaxAmount = discountPercentageLevel4WithTaxAmount;
	}

	@JsonProperty("discountWithTaxAmount")
	public long getDiscountWithTaxAmount() {
		return discountWithTaxAmount;
	}

	@JsonProperty("discountWithTaxAmount")
	public void setDiscountWithTaxAmount(long discountWithTaxAmount) {
		this.discountWithTaxAmount = discountWithTaxAmount;
	}

	@JsonProperty("externalReferenceCode")
	public String getExternalReferenceCode() {
		return externalReferenceCode;
	}

	@JsonProperty("externalReferenceCode")
	public void setExternalReferenceCode(String externalReferenceCode) {
		this.externalReferenceCode = externalReferenceCode;
	}

	@JsonProperty("finalPrice")
	public long getFinalPrice() {
		return finalPrice;
	}

	@JsonProperty("finalPrice")
	public void setFinalPrice(long finalPrice) {
		this.finalPrice = finalPrice;
	}

	@JsonProperty("finalPriceWithTaxAmount")
	public long getFinalPriceWithTaxAmount() {
		return finalPriceWithTaxAmount;
	}

	@JsonProperty("finalPriceWithTaxAmount")
	public void setFinalPriceWithTaxAmount(long finalPriceWithTaxAmount) {
		this.finalPriceWithTaxAmount = finalPriceWithTaxAmount;
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	@JsonProperty("name")
	public Name getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(Name name) {
		this.name = name;
	}

	@JsonProperty("orderExternalReferenceCode")
	public String getOrderExternalReferenceCode() {
		return orderExternalReferenceCode;
	}

	@JsonProperty("orderExternalReferenceCode")
	public void setOrderExternalReferenceCode(String orderExternalReferenceCode) {
		this.orderExternalReferenceCode = orderExternalReferenceCode;
	}

	@JsonProperty("orderId")
	public long getOrderId() {
		return orderId;
	}

	@JsonProperty("orderId")
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	@JsonProperty("printedNote")
	public String getPrintedNote() {
		return printedNote;
	}

	@JsonProperty("printedNote")
	public void setPrintedNote(String printedNote) {
		this.printedNote = printedNote;
	}

	@JsonProperty("promoPrice")
	public long getPromoPrice() {
		return promoPrice;
	}

	@JsonProperty("promoPrice")
	public void setPromoPrice(long promoPrice) {
		this.promoPrice = promoPrice;
	}

	@JsonProperty("promoPriceWithTaxAmount")
	public long getPromoPriceWithTaxAmount() {
		return promoPriceWithTaxAmount;
	}

	@JsonProperty("promoPriceWithTaxAmount")
	public void setPromoPriceWithTaxAmount(long promoPriceWithTaxAmount) {
		this.promoPriceWithTaxAmount = promoPriceWithTaxAmount;
	}

	@JsonProperty("quantity")
	public long getQuantity() {
		return quantity;
	}

	@JsonProperty("quantity")
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	@JsonProperty("shippedQuantity")
	public long getShippedQuantity() {
		return shippedQuantity;
	}

	@JsonProperty("shippedQuantity")
	public void setShippedQuantity(long shippedQuantity) {
		this.shippedQuantity = shippedQuantity;
	}

	@JsonProperty("shippingAddressId")
	public long getShippingAddressId() {
		return shippingAddressId;
	}

	@JsonProperty("shippingAddressId")
	public void setShippingAddressId(long shippingAddressId) {
		this.shippingAddressId = shippingAddressId;
	}

	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}

	@JsonProperty("sku")
	public void setSku(String sku) {
		this.sku = sku;
	}

	@JsonProperty("skuExternalReferenceCode")
	public String getSkuExternalReferenceCode() {
		return skuExternalReferenceCode;
	}

	@JsonProperty("skuExternalReferenceCode")
	public void setSkuExternalReferenceCode(String skuExternalReferenceCode) {
		this.skuExternalReferenceCode = skuExternalReferenceCode;
	}

	@JsonProperty("skuId")
	public long getSkuId() {
		return skuId;
	}

	@JsonProperty("skuId")
	public void setSkuId(long skuId) {
		this.skuId = skuId;
	}

	@JsonProperty("subscription")
	public boolean isSubscription() {
		return subscription;
	}

	@JsonProperty("subscription")
	public void setSubscription(boolean subscription) {
		this.subscription = subscription;
	}

	@JsonProperty("unitPrice")
	public long getUnitPrice() {
		return unitPrice;
	}

	@JsonProperty("unitPrice")
	public void setUnitPrice(long unitPrice) {
		this.unitPrice = unitPrice;
	}

	@JsonProperty("unitPriceWithTaxAmount")
	public long getUnitPriceWithTaxAmount() {
		return unitPriceWithTaxAmount;
	}

	@JsonProperty("unitPriceWithTaxAmount")
	public void setUnitPriceWithTaxAmount(long unitPriceWithTaxAmount) {
		this.unitPriceWithTaxAmount = unitPriceWithTaxAmount;
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
