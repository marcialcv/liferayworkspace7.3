package commerce.integration.api.model.catalog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "actions", "items", "lastPage", "page", "pageSize", "totalCount" })
public class SkuSearchResponse {

	@JsonProperty("actions")
	private Actions actions;
	@JsonProperty("items")
	private List<Product> items = null;
	@JsonProperty("lastPage")
	private long lastPage;
	@JsonProperty("page")
	private long page;
	@JsonProperty("pageSize")
	private long pageSize;
	@JsonProperty("totalCount")
	private long totalCount;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("actions")
	public Actions getActions() {
		return actions;
	}

	@JsonProperty("actions")
	public void setActions(Actions actions) {
		this.actions = actions;
	}

	@JsonProperty("items")
	public List<Product> getItems() {
		return items;
	}

	@JsonProperty("items")
	public void setItems(List<Product> items) {
		this.items = items;
	}

	@JsonProperty("lastPage")
	public long getLastPage() {
		return lastPage;
	}

	@JsonProperty("lastPage")
	public void setLastPage(long lastPage) {
		this.lastPage = lastPage;
	}

	@JsonProperty("page")
	public long getPage() {
		return page;
	}

	@JsonProperty("page")
	public void setPage(long page) {
		this.page = page;
	}

	@JsonProperty("pageSize")
	public long getPageSize() {
		return pageSize;
	}

	@JsonProperty("pageSize")
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	@JsonProperty("totalCount")
	public long getTotalCount() {
		return totalCount;
	}

	@JsonProperty("totalCount")
	public void setTotalCount(long totalCount) {
		this.totalCount = totalCount;
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