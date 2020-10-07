package commerce.integration.api.model.catalog;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "cost", "depth", "displayDate", "externalReferenceCode", "gtin", "height", "id",
		"manufacturerPartNumber", "options", "price", "promoPrice", "published", "purchasable", "sku", "unspsc",
		"weight", "width" })
public class Product {

	@JsonProperty("cost")
	private double cost;
	@JsonProperty("depth")
	private double depth;
	@JsonProperty("displayDate")
	private String displayDate;
	@JsonProperty("externalReferenceCode")
	private String externalReferenceCode;
	@JsonProperty("gtin")
	private String gtin;
	@JsonProperty("height")
	private double height;
	@JsonProperty("id")
	private long id;
	@JsonProperty("manufacturerPartNumber")
	private String manufacturerPartNumber;
	@JsonProperty("options")
	private Options options;
	@JsonProperty("price")
	private double price;
	@JsonProperty("promoPrice")
	private double promoPrice;
	@JsonProperty("published")
	private boolean published;
	@JsonProperty("purchasable")
	private boolean purchasable;
	@JsonProperty("sku")
	private String sku;
	@JsonProperty("unspsc")
	private String unspsc;
	@JsonProperty("weight")
	private double weight;
	@JsonProperty("width")
	private double width;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("cost")
	public double getCost() {
		return cost;
	}

	@JsonProperty("cost")
	public void setCost(double cost) {
		this.cost = cost;
	}

	@JsonProperty("depth")
	public double getDepth() {
		return depth;
	}

	@JsonProperty("depth")
	public void setDepth(double depth) {
		this.depth = depth;
	}

	@JsonProperty("displayDate")
	public String getDisplayDate() {
		return displayDate;
	}

	@JsonProperty("displayDate")
	public void setDisplayDate(String displayDate) {
		this.displayDate = displayDate;
	}

	@JsonProperty("externalReferenceCode")
	public String getExternalReferenceCode() {
		return externalReferenceCode;
	}

	@JsonProperty("externalReferenceCode")
	public void setExternalReferenceCode(String externalReferenceCode) {
		this.externalReferenceCode = externalReferenceCode;
	}

	@JsonProperty("gtin")
	public String getGtin() {
		return gtin;
	}

	@JsonProperty("gtin")
	public void setGtin(String gtin) {
		this.gtin = gtin;
	}

	@JsonProperty("height")
	public double getHeight() {
		return height;
	}

	@JsonProperty("height")
	public void setHeight(double height) {
		this.height = height;
	}

	@JsonProperty("id")
	public long getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(long id) {
		this.id = id;
	}

	@JsonProperty("manufacturerPartNumber")
	public String getManufacturerPartNumber() {
		return manufacturerPartNumber;
	}

	@JsonProperty("manufacturerPartNumber")
	public void setManufacturerPartNumber(String manufacturerPartNumber) {
		this.manufacturerPartNumber = manufacturerPartNumber;
	}

	@JsonProperty("options")
	public Options getOptions() {
		return options;
	}

	@JsonProperty("options")
	public void setOptions(Options options) {
		this.options = options;
	}

	@JsonProperty("price")
	public double getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(double price) {
		this.price = price;
	}

	@JsonProperty("promoPrice")
	public double getPromoPrice() {
		return promoPrice;
	}

	@JsonProperty("promoPrice")
	public void setPromoPrice(double promoPrice) {
		this.promoPrice = promoPrice;
	}

	@JsonProperty("published")
	public boolean isPublished() {
		return published;
	}

	@JsonProperty("published")
	public void setPublished(boolean published) {
		this.published = published;
	}

	@JsonProperty("purchasable")
	public boolean isPurchasable() {
		return purchasable;
	}

	@JsonProperty("purchasable")
	public void setPurchasable(boolean purchasable) {
		this.purchasable = purchasable;
	}

	@JsonProperty("sku")
	public String getSku() {
		return sku;
	}

	@JsonProperty("sku")
	public void setSku(String sku) {
		this.sku = sku;
	}

	@JsonProperty("unspsc")
	public String getUnspsc() {
		return unspsc;
	}

	@JsonProperty("unspsc")
	public void setUnspsc(String unspsc) {
		this.unspsc = unspsc;
	}

	@JsonProperty("weight")
	public double getWeight() {
		return weight;
	}

	@JsonProperty("weight")
	public void setWeight(double weight) {
		this.weight = weight;
	}

	@JsonProperty("width")
	public double getWidth() {
		return width;
	}

	@JsonProperty("width")
	public void setWidth(double width) {
		this.width = width;
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