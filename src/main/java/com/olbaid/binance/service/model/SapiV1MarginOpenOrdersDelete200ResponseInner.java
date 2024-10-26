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
import com.olbaid.binance.service.model.CanceledMarginOrderDetail;
import com.olbaid.binance.service.model.MarginOcoOrder;
import com.olbaid.binance.service.model.MarginOcoOrderOrderReportsInner;
import com.olbaid.binance.service.model.MarginOcoOrderOrdersInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1MarginOpenOrdersDelete200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_SYMBOL,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_IS_ISOLATED,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_ORIG_CLIENT_ORDER_ID,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_ORDER_ID,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_ORDER_LIST_ID,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_CLIENT_ORDER_ID,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_PRICE,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_ORIG_QTY,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_EXECUTED_QTY,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_CUMMULATIVE_QUOTE_QTY,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_STATUS,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_TIME_IN_FORCE,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_TYPE,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_SIDE,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_CONTINGENCY_TYPE,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_LIST_STATUS_TYPE,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_LIST_ORDER_STATUS,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_LIST_CLIENT_ORDER_ID,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_TRANSACTION_TIME,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_ORDERS,
  SapiV1MarginOpenOrdersDelete200ResponseInner.JSON_PROPERTY_ORDER_REPORTS
})
@JsonTypeName("_sapi_v1_margin_openOrders_delete_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MarginOpenOrdersDelete200ResponseInner {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_IS_ISOLATED = "isIsolated";
  private Boolean isIsolated;

  public static final String JSON_PROPERTY_ORIG_CLIENT_ORDER_ID = "origClientOrderId";
  private String origClientOrderId;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_ORDER_LIST_ID = "orderListId";
  private Long orderListId;

  public static final String JSON_PROPERTY_CLIENT_ORDER_ID = "clientOrderId";
  private String clientOrderId;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_ORIG_QTY = "origQty";
  private String origQty;

  public static final String JSON_PROPERTY_EXECUTED_QTY = "executedQty";
  private String executedQty;

  public static final String JSON_PROPERTY_CUMMULATIVE_QUOTE_QTY = "cummulativeQuoteQty";
  private String cummulativeQuoteQty;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TIME_IN_FORCE = "timeInForce";
  private String timeInForce;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_SIDE = "side";
  private String side;

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

  public static final String JSON_PROPERTY_ORDERS = "orders";
  private List<MarginOcoOrderOrdersInner> orders = new ArrayList<>();

  public static final String JSON_PROPERTY_ORDER_REPORTS = "orderReports";
  private List<MarginOcoOrderOrderReportsInner> orderReports = new ArrayList<>();

  public SapiV1MarginOpenOrdersDelete200ResponseInner() {
  }

  public SapiV1MarginOpenOrdersDelete200ResponseInner symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNBUSDT", required = true, value = "")
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


  public SapiV1MarginOpenOrdersDelete200ResponseInner isIsolated(Boolean isIsolated) {
    
    this.isIsolated = isIsolated;
    return this;
  }

   /**
   * Get isIsolated
   * @return isIsolated
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_ISOLATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsIsolated() {
    return isIsolated;
  }


  @JsonProperty(JSON_PROPERTY_IS_ISOLATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsIsolated(Boolean isIsolated) {
    this.isIsolated = isIsolated;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner origClientOrderId(String origClientOrderId) {
    
    this.origClientOrderId = origClientOrderId;
    return this;
  }

   /**
   * Get origClientOrderId
   * @return origClientOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "E6APeyTJvkMvLMYMqu1KQ4", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORIG_CLIENT_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrigClientOrderId() {
    return origClientOrderId;
  }


  @JsonProperty(JSON_PROPERTY_ORIG_CLIENT_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrigClientOrderId(String origClientOrderId) {
    this.origClientOrderId = origClientOrderId;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "11", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner orderListId(Long orderListId) {
    
    this.orderListId = orderListId;
    return this;
  }

   /**
   * Get orderListId
   * @return orderListId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
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


  public SapiV1MarginOpenOrdersDelete200ResponseInner clientOrderId(String clientOrderId) {
    
    this.clientOrderId = clientOrderId;
    return this;
  }

   /**
   * Get clientOrderId
   * @return clientOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "pXLV6Hz6mprAcVYpVMTGgx", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLIENT_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientOrderId() {
    return clientOrderId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientOrderId(String clientOrderId) {
    this.clientOrderId = clientOrderId;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.089853", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(String price) {
    this.price = price;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner origQty(String origQty) {
    
    this.origQty = origQty;
    return this;
  }

   /**
   * Get origQty
   * @return origQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.178622", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORIG_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrigQty() {
    return origQty;
  }


  @JsonProperty(JSON_PROPERTY_ORIG_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrigQty(String origQty) {
    this.origQty = origQty;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner executedQty(String executedQty) {
    
    this.executedQty = executedQty;
    return this;
  }

   /**
   * Get executedQty
   * @return executedQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTED_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExecutedQty() {
    return executedQty;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTED_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExecutedQty(String executedQty) {
    this.executedQty = executedQty;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner cummulativeQuoteQty(String cummulativeQuoteQty) {
    
    this.cummulativeQuoteQty = cummulativeQuoteQty;
    return this;
  }

   /**
   * Get cummulativeQuoteQty
   * @return cummulativeQuoteQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CUMMULATIVE_QUOTE_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCummulativeQuoteQty() {
    return cummulativeQuoteQty;
  }


  @JsonProperty(JSON_PROPERTY_CUMMULATIVE_QUOTE_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCummulativeQuoteQty(String cummulativeQuoteQty) {
    this.cummulativeQuoteQty = cummulativeQuoteQty;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "CANCELED", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner timeInForce(String timeInForce) {
    
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "GTC", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIME_IN_FORCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTimeInForce() {
    return timeInForce;
  }


  @JsonProperty(JSON_PROPERTY_TIME_IN_FORCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "LIMIT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner side(String side) {
    
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BUY", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSide() {
    return side;
  }


  @JsonProperty(JSON_PROPERTY_SIDE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSide(String side) {
    this.side = side;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner contingencyType(String contingencyType) {
    
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


  public SapiV1MarginOpenOrdersDelete200ResponseInner listStatusType(String listStatusType) {
    
    this.listStatusType = listStatusType;
    return this;
  }

   /**
   * Get listStatusType
   * @return listStatusType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ALL_DONE", required = true, value = "")
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


  public SapiV1MarginOpenOrdersDelete200ResponseInner listOrderStatus(String listOrderStatus) {
    
    this.listOrderStatus = listOrderStatus;
    return this;
  }

   /**
   * Get listOrderStatus
   * @return listOrderStatus
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ALL_DONE", required = true, value = "")
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


  public SapiV1MarginOpenOrdersDelete200ResponseInner listClientOrderId(String listClientOrderId) {
    
    this.listClientOrderId = listClientOrderId;
    return this;
  }

   /**
   * Get listClientOrderId
   * @return listClientOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "C3wyj4WVEktd7u9aVBRXcN", required = true, value = "")
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


  public SapiV1MarginOpenOrdersDelete200ResponseInner transactionTime(Long transactionTime) {
    
    this.transactionTime = transactionTime;
    return this;
  }

   /**
   * Get transactionTime
   * @return transactionTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1574040868128", required = true, value = "")
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


  public SapiV1MarginOpenOrdersDelete200ResponseInner orders(List<MarginOcoOrderOrdersInner> orders) {
    
    this.orders = orders;
    return this;
  }

  public SapiV1MarginOpenOrdersDelete200ResponseInner addOrdersItem(MarginOcoOrderOrdersInner ordersItem) {
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

  public List<MarginOcoOrderOrdersInner> getOrders() {
    return orders;
  }


  @JsonProperty(JSON_PROPERTY_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrders(List<MarginOcoOrderOrdersInner> orders) {
    this.orders = orders;
  }


  public SapiV1MarginOpenOrdersDelete200ResponseInner orderReports(List<MarginOcoOrderOrderReportsInner> orderReports) {
    
    this.orderReports = orderReports;
    return this;
  }

  public SapiV1MarginOpenOrdersDelete200ResponseInner addOrderReportsItem(MarginOcoOrderOrderReportsInner orderReportsItem) {
    this.orderReports.add(orderReportsItem);
    return this;
  }

   /**
   * Get orderReports
   * @return orderReports
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MarginOcoOrderOrderReportsInner> getOrderReports() {
    return orderReports;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderReports(List<MarginOcoOrderOrderReportsInner> orderReports) {
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
    SapiV1MarginOpenOrdersDelete200ResponseInner sapiV1MarginOpenOrdersDelete200ResponseInner = (SapiV1MarginOpenOrdersDelete200ResponseInner) o;
    return Objects.equals(this.symbol, sapiV1MarginOpenOrdersDelete200ResponseInner.symbol) &&
        Objects.equals(this.isIsolated, sapiV1MarginOpenOrdersDelete200ResponseInner.isIsolated) &&
        Objects.equals(this.origClientOrderId, sapiV1MarginOpenOrdersDelete200ResponseInner.origClientOrderId) &&
        Objects.equals(this.orderId, sapiV1MarginOpenOrdersDelete200ResponseInner.orderId) &&
        Objects.equals(this.orderListId, sapiV1MarginOpenOrdersDelete200ResponseInner.orderListId) &&
        Objects.equals(this.clientOrderId, sapiV1MarginOpenOrdersDelete200ResponseInner.clientOrderId) &&
        Objects.equals(this.price, sapiV1MarginOpenOrdersDelete200ResponseInner.price) &&
        Objects.equals(this.origQty, sapiV1MarginOpenOrdersDelete200ResponseInner.origQty) &&
        Objects.equals(this.executedQty, sapiV1MarginOpenOrdersDelete200ResponseInner.executedQty) &&
        Objects.equals(this.cummulativeQuoteQty, sapiV1MarginOpenOrdersDelete200ResponseInner.cummulativeQuoteQty) &&
        Objects.equals(this.status, sapiV1MarginOpenOrdersDelete200ResponseInner.status) &&
        Objects.equals(this.timeInForce, sapiV1MarginOpenOrdersDelete200ResponseInner.timeInForce) &&
        Objects.equals(this.type, sapiV1MarginOpenOrdersDelete200ResponseInner.type) &&
        Objects.equals(this.side, sapiV1MarginOpenOrdersDelete200ResponseInner.side) &&
        Objects.equals(this.contingencyType, sapiV1MarginOpenOrdersDelete200ResponseInner.contingencyType) &&
        Objects.equals(this.listStatusType, sapiV1MarginOpenOrdersDelete200ResponseInner.listStatusType) &&
        Objects.equals(this.listOrderStatus, sapiV1MarginOpenOrdersDelete200ResponseInner.listOrderStatus) &&
        Objects.equals(this.listClientOrderId, sapiV1MarginOpenOrdersDelete200ResponseInner.listClientOrderId) &&
        Objects.equals(this.transactionTime, sapiV1MarginOpenOrdersDelete200ResponseInner.transactionTime) &&
        Objects.equals(this.orders, sapiV1MarginOpenOrdersDelete200ResponseInner.orders) &&
        Objects.equals(this.orderReports, sapiV1MarginOpenOrdersDelete200ResponseInner.orderReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, isIsolated, origClientOrderId, orderId, orderListId, clientOrderId, price, origQty, executedQty, cummulativeQuoteQty, status, timeInForce, type, side, contingencyType, listStatusType, listOrderStatus, listClientOrderId, transactionTime, orders, orderReports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MarginOpenOrdersDelete200ResponseInner {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    isIsolated: ").append(toIndentedString(isIsolated)).append("\n");
    sb.append("    origClientOrderId: ").append(toIndentedString(origClientOrderId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderListId: ").append(toIndentedString(orderListId)).append("\n");
    sb.append("    clientOrderId: ").append(toIndentedString(clientOrderId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    origQty: ").append(toIndentedString(origQty)).append("\n");
    sb.append("    executedQty: ").append(toIndentedString(executedQty)).append("\n");
    sb.append("    cummulativeQuoteQty: ").append(toIndentedString(cummulativeQuoteQty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    contingencyType: ").append(toIndentedString(contingencyType)).append("\n");
    sb.append("    listStatusType: ").append(toIndentedString(listStatusType)).append("\n");
    sb.append("    listOrderStatus: ").append(toIndentedString(listOrderStatus)).append("\n");
    sb.append("    listClientOrderId: ").append(toIndentedString(listClientOrderId)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
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

