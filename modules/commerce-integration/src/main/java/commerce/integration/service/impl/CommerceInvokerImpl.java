package commerce.integration.service.impl;

import static commerce.integration.constants.CommerceIntegrationConstants.ACCOUNT_ID;
import static commerce.integration.constants.CommerceIntegrationConstants.CHANNEL_ID;
import static commerce.integration.constants.CommerceIntegrationConstants.COMMERCE_API_VERSION;
import static commerce.integration.constants.CommerceIntegrationConstants.COMMERCE_HOST;
import static commerce.integration.constants.CommerceIntegrationConstants.CURRENCY_CODE;
import static commerce.integration.constants.CommerceIntegrationConstants.PWD_LOGIN;
import static commerce.integration.constants.CommerceIntegrationConstants.USER_LOGIN;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import commerce.integration.api.model.catalog.Product;
import commerce.integration.api.model.catalog.SkuSearchResponse;
import commerce.integration.api.model.order.request.OrderItem;
import commerce.integration.api.model.order.request.OrderRequest;
import commerce.integration.api.model.order.response.Order;
import commerce.integration.api.model.order.response.OrderSearchResponse;
import commerce.integration.api.model.orderitems.response.Item;
import commerce.integration.api.model.orderitems.response.OrderItemsResponse;
import commerce.integration.api.service.CommerceInvoker;
import rest.consumer.api.Credentials;
import rest.consumer.api.RestConsumer;

@Component(immediate = true, service = CommerceInvoker.class)
public class CommerceInvokerImpl implements CommerceInvoker {
	
	private static Log _log = LogFactoryUtil.getLog(CommerceInvokerImpl.class);
	
	@Reference
	private RestConsumer restConsumer;

	protected ObjectMapper objectMapper = new ObjectMapper()
			.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	
	private Credentials credentials = new Credentials(PropsUtil.get(USER_LOGIN), PropsUtil.get(PWD_LOGIN));

	@Override
	public String addSku(String sku) {

		return createOrUpdateOrder(sku);
	}

	private String createOrUpdateOrder(String sku) {

		String orderId = getOrderId();

		String response = "";
		if (Validator.isNotNull(orderId)) {
			List<Item> orderItems = getOrderItems(orderId);
			Optional<Item> optionalItem = orderItems.stream().filter(item -> item.getSku().equals(sku)).findFirst();
			if (optionalItem.isPresent()) {
				Item orderItem = optionalItem.get();
				long quantity = orderItem.getQuantity();
				quantity++;
				orderItem.setQuantity(quantity);

				response = updateQuantity(orderItem);

			} else {
				OrderItem orderItem = new OrderItem();
				Product itemCatalog = getItemBySku(sku);
				orderItem.setSku(itemCatalog.getSku());
				orderItem.setSkuId(itemCatalog.getId());

				response = postOrderItem(orderId, orderItem);
			}
		} else {

			OrderRequest newOrder = new OrderRequest();
			newOrder.setAccountId(GetterUtil.getLong(PropsUtil.get(ACCOUNT_ID)));
			newOrder.setChannelId(GetterUtil.getLong(PropsUtil.get(CHANNEL_ID)));
			newOrder.setCurrencyCode(CURRENCY_CODE);
			newOrder.setShippingAmount(0);
			newOrder.setShippingWithTaxAmount(0);
			if (!orderId.isEmpty()) {
				newOrder.setId(orderId);
			}

			OrderItem orderItem = new OrderItem();
			Product itemCatalog = getItemBySku(sku);
			orderItem.setSku(itemCatalog.getSku());
			orderItem.setSkuId(itemCatalog.getId());

			newOrder.setOrderItems(Collections.singletonList(orderItem));

			response = postOrder(newOrder);

		}

		return response;

	}

	private String getOrderId() {

		Optional<Order> optionalOrderItem = getOrder();

		return optionalOrderItem.isPresent() ? optionalOrderItem.get().getId() : "";
	}

	private Optional<Order> getOrder() {

		String response = restConsumer.get(
				PropsUtil.get(COMMERCE_HOST)+"/o/headless-commerce-admin-order/"+COMMERCE_API_VERSION+"/orders", credentials,
				null);

		OrderSearchResponse orderSearchResponse = new OrderSearchResponse();
		try {
			orderSearchResponse = objectMapper.readValue(response, OrderSearchResponse.class);
		} catch (JsonProcessingException e) {
			_log.error(e);
		}

		return orderSearchResponse.getItems().stream().findFirst();
	}

	private List<Item> getOrderItems(String orderId) {

		String response = restConsumer
				.get(PropsUtil.get(COMMERCE_HOST)+"/o/headless-commerce-admin-order/"+COMMERCE_API_VERSION+"/orders/" + orderId
						+ "/orderItems", credentials, null);

		OrderItemsResponse orderItemsResponse = new OrderItemsResponse();
		try {
			orderItemsResponse = objectMapper.readValue(response, OrderItemsResponse.class);
		} catch (JsonProcessingException e) {
			_log.error(e);
		}

		return orderItemsResponse.getItems();
	}

	private String updateQuantity(Item item) {
		String json = getJson(item);

		String response = restConsumer
				.patch(PropsUtil.get(COMMERCE_HOST)+"/o/headless-commerce-admin-order/"+COMMERCE_API_VERSION+"/orderItems/"
						+ item.getId(), credentials, json);

		_log.debug(response);
		
		return response;
	}

	private Product getItemBySku(String sku) {

		String response = restConsumer.get(
				PropsUtil.get(COMMERCE_HOST)+"/o/headless-commerce-admin-catalog/"+COMMERCE_API_VERSION+"/skus?search=camiseta",
				credentials, null);

		SkuSearchResponse skuSearch = new SkuSearchResponse();
		try {
			skuSearch = objectMapper.readValue(response, SkuSearchResponse.class);
		} catch (JsonProcessingException e) {
			_log.error(e);
		}
		Product item = skuSearch.getItems().stream().filter(curItem -> curItem.getSku().equals(sku)).findFirst().get();
		
		_log.debug(response);

		return item;

	}

	private String postOrderItem(String orderId, OrderItem orderItem) {

		String json = getJson(orderItem);

		String response = restConsumer
				.post(PropsUtil.get(COMMERCE_HOST)+"/o/headless-commerce-admin-order/"+COMMERCE_API_VERSION+"/orders/"
						+ orderId + "/orderItems", credentials, json);
		
		_log.debug(response);
		
		return response;
	}

	private String postOrder(OrderRequest newOrder) {
		String json = getJson(newOrder);

		String response = restConsumer.post(
				PropsUtil.get(COMMERCE_HOST)+"/o/headless-commerce-admin-order/"+COMMERCE_API_VERSION+"/orders", credentials,
				json);
		
		_log.debug(response);

		return response;
	}
	
	protected String getJson(Object object) {
		String json = "";
		try {
			json = objectMapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			_log.error(e);
		}
		
		return json;
	}

}
