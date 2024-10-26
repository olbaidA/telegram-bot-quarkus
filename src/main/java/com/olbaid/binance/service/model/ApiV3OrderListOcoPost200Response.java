/*
 * Binance Public Spot API
 * OpenAPI Specifications for the Binance Public Spot API  API documents:   - [https://github.com/binance/binance-spot-api-docs](https://github.com/binance/binance-spot-api-docs)   - [https://binance-docs.github.io/apidocs/spot/en](https://binance-docs.github.io/apidocs/spot/en)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.olbaid.binance.service.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.olbaid.binance.service.model.ApiV3OrderListOcoPost200ResponseOrderReportsInner;
import com.olbaid.binance.service.model.ApiV3OrderListOcoPost200ResponseOrdersInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiV3OrderListOcoPost200Response
 */
@JsonPropertyOrder({
  ApiV3OrderListOcoPost200Response.JSON_PROPERTY_ORDER_LIST_ID,
  ApiV3OrderListOcoPost200Response.JSON_PROPERTY_CONTINGENCY_TYPE,
  ApiV3OrderListOcoPost200Response.JSON_PROPERTY_LIST_STATUS_TYPE,
  ApiV3OrderListOcoPost200Response.JSON_PROPERTY_LIST_ORDER_STATUS,
  ApiV3OrderListOcoPost200Response.JSON_PROPERTY_LIST_CLIENT_ORDER_ID,
  ApiV3OrderListOcoPost200Response.JSON_PROPERTY_TRANSACTION_TIME,
  ApiV3OrderListOcoPost200Response.JSON_PROPERTY_SYMBOL,
  ApiV3OrderListOcoPost200Response.JSON_PROPERTY_ORDERS,
  ApiV3OrderListOcoPost200Response.JSON_PROPERTY_ORDER_REPORTS
})
@JsonTypeName("_api_v3_orderList_oco_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3OrderListOcoPost200Response {
  public static final String JSON_PROPERTY_ORDER_LIST_ID = "orderListId";
  private Long orderListId;

  public static final String JSON_PROPERTY_CONTINGENCY_TYPE = "contingencyType";
  private String contingencyType;

  public static final String JSON_PROPERTY_LIST_STATUS_TYPE = "listStatusType";
  private String listStatusType;

  public static final String JSON_PROPERTY_LIST_ORDER_STATUS = "listOrderStatus";
  private String listOrderStatus;

  public static final String JSON_PROPERTY_LIST_CLIENT_ORDER_ID = "listClientOrderId";
  private String listClientOrderId;

  public static final String JSON_PROPERTY_TRANSACTION_TIME = "transactionTime";
  private Long transactionTime;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_ORDERS = "orders";
  private List<ApiV3OrderListOcoPost200ResponseOrdersInner> orders = new ArrayList<>();

  public static final String JSON_PROPERTY_ORDER_REPORTS = "orderReports";
  private List<ApiV3OrderListOcoPost200ResponseOrderReportsInner> orderReports = new ArrayList<>();

  public ApiV3OrderListOcoPost200Response() {
  }

  public ApiV3OrderListOcoPost200Response orderListId(Long orderListId) {
    
    this.orderListId = orderListId;
    return this;
  }

   /**
   * Get orderListId
   * @return orderListId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getOrderListId() {
    return orderListId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderListId(Long orderListId) {
    this.orderListId = orderListId;
  }


  public ApiV3OrderListOcoPost200Response contingencyType(String contingencyType) {
    
    this.contingencyType = contingencyType;
    return this;
  }

   /**
   * Get contingencyType
   * @return contingencyType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "OCO", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTINGENCY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContingencyType() {
    return contingencyType;
  }


  @JsonProperty(JSON_PROPERTY_CONTINGENCY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContingencyType(String contingencyType) {
    this.contingencyType = contingencyType;
  }


  public ApiV3OrderListOcoPost200Response listStatusType(String listStatusType) {
    
    this.listStatusType = listStatusType;
    return this;
  }

   /**
   * Get listStatusType
   * @return listStatusType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "EXEC_STARTED", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIST_STATUS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getListStatusType() {
    return listStatusType;
  }


  @JsonProperty(JSON_PROPERTY_LIST_STATUS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListStatusType(String listStatusType) {
    this.listStatusType = listStatusType;
  }


  public ApiV3OrderListOcoPost200Response listOrderStatus(String listOrderStatus) {
    
    this.listOrderStatus = listOrderStatus;
    return this;
  }

   /**
   * Get listOrderStatus
   * @return listOrderStatus
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "EXECUTING", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIST_ORDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getListOrderStatus() {
    return listOrderStatus;
  }


  @JsonProperty(JSON_PROPERTY_LIST_ORDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListOrderStatus(String listOrderStatus) {
    this.listOrderStatus = listOrderStatus;
  }


  public ApiV3OrderListOcoPost200Response listClientOrderId(String listClientOrderId) {
    
    this.listClientOrderId = listClientOrderId;
    return this;
  }

   /**
   * Get listClientOrderId
   * @return listClientOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "lH1YDkuQKWiXVXHPSKYEIp", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIST_CLIENT_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getListClientOrderId() {
    return listClientOrderId;
  }


  @JsonProperty(JSON_PROPERTY_LIST_CLIENT_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListClientOrderId(String listClientOrderId) {
    this.listClientOrderId = listClientOrderId;
  }


  public ApiV3OrderListOcoPost200Response transactionTime(Long transactionTime) {
    
    this.transactionTime = transactionTime;
    return this;
  }

   /**
   * Get transactionTime
   * @return transactionTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1710485608839", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTransactionTime() {
    return transactionTime;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
  }


  public ApiV3OrderListOcoPost200Response symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "LTCBTC", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public ApiV3OrderListOcoPost200Response orders(List<ApiV3OrderListOcoPost200ResponseOrdersInner> orders) {
    
    this.orders = orders;
    return this;
  }

  public ApiV3OrderListOcoPost200Response addOrdersItem(ApiV3OrderListOcoPost200ResponseOrdersInner ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ApiV3OrderListOcoPost200ResponseOrdersInner> getOrders() {
    return orders;
  }


  @JsonProperty(JSON_PROPERTY_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrders(List<ApiV3OrderListOcoPost200ResponseOrdersInner> orders) {
    this.orders = orders;
  }


  public ApiV3OrderListOcoPost200Response orderReports(List<ApiV3OrderListOcoPost200ResponseOrderReportsInner> orderReports) {
    
    this.orderReports = orderReports;
    return this;
  }

  public ApiV3OrderListOcoPost200Response addOrderReportsItem(ApiV3OrderListOcoPost200ResponseOrderReportsInner orderReportsItem) {
    this.orderReports.add(orderReportsItem);
    return this;
  }

   /**
   * Get orderReports
   * @return orderReports
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[{\"symbol\":\"LTCBTC\",\"orderId\":10,\"orderListId\":1,\"clientOrderId\":\"44nZvqpemY7sVYgPYbvPih\",\"transactTime\":1710485608839,\"price\":\"1.000000\",\"origQty\":\"5.00000000\",\"executedQty\":\"0.000000\",\"cummulativeQuoteQty\":\"0.000000\",\"status\":\"NEW\",\"timeInForce\":\"GTC\",\"type\":\"STOP_LOSS_LIMIT\",\"side\":\"SELL\",\"stopPrice\":\"1.00000000\",\"workingTime\":-1,\"icebergQty\":\"1.00000000\",\"selfTradePreventionMode\":\"NONE\"},{\"symbol\":\"LTCBTC\",\"orderId\":11,\"orderListId\":1,\"clientOrderId\":\"NuMp0nVYnciDiFmVqfpBqK\",\"transactTime\":1710485608839,\"price\":\"3.00000000\",\"origQty\":\"5.00000000\",\"executedQty\":\"0.000000\",\"cummulativeQuoteQty\":\"0.000000\",\"status\":\"NEW\",\"timeInForce\":\"GTC\",\"type\":\"LIMIT_MAKER\",\"side\":\"SELL\",\"workingTime\":1710485608839,\"selfTradePreventionMode\":\"NONE\"}]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ApiV3OrderListOcoPost200ResponseOrderReportsInner> getOrderReports() {
    return orderReports;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderReports(List<ApiV3OrderListOcoPost200ResponseOrderReportsInner> orderReports) {
    this.orderReports = orderReports;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3OrderListOcoPost200Response apiV3OrderListOcoPost200Response = (ApiV3OrderListOcoPost200Response) o;
    return Objects.equals(this.orderListId, apiV3OrderListOcoPost200Response.orderListId) &&
        Objects.equals(this.contingencyType, apiV3OrderListOcoPost200Response.contingencyType) &&
        Objects.equals(this.listStatusType, apiV3OrderListOcoPost200Response.listStatusType) &&
        Objects.equals(this.listOrderStatus, apiV3OrderListOcoPost200Response.listOrderStatus) &&
        Objects.equals(this.listClientOrderId, apiV3OrderListOcoPost200Response.listClientOrderId) &&
        Objects.equals(this.transactionTime, apiV3OrderListOcoPost200Response.transactionTime) &&
        Objects.equals(this.symbol, apiV3OrderListOcoPost200Response.symbol) &&
        Objects.equals(this.orders, apiV3OrderListOcoPost200Response.orders) &&
        Objects.equals(this.orderReports, apiV3OrderListOcoPost200Response.orderReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderListId, contingencyType, listStatusType, listOrderStatus, listClientOrderId, transactionTime, symbol, orders, orderReports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3OrderListOcoPost200Response {\n");
    sb.append("    orderListId: ").append(toIndentedString(orderListId)).append("\n");
    sb.append("    contingencyType: ").append(toIndentedString(contingencyType)).append("\n");
    sb.append("    listStatusType: ").append(toIndentedString(listStatusType)).append("\n");
    sb.append("    listOrderStatus: ").append(toIndentedString(listOrderStatus)).append("\n");
    sb.append("    listClientOrderId: ").append(toIndentedString(listClientOrderId)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    orderReports: ").append(toIndentedString(orderReports)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
