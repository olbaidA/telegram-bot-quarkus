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
import com.olbaid.binance.service.model.OrderResponseAck;
import com.olbaid.binance.service.model.OrderResponseFull;
import com.olbaid.binance.service.model.OrderResponseFullFillsInner;
import com.olbaid.binance.service.model.OrderResponseResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiV3OrderDelete200Response
 */
@JsonPropertyOrder({
  ApiV3OrderDelete200Response.JSON_PROPERTY_SYMBOL,
  ApiV3OrderDelete200Response.JSON_PROPERTY_ORDER_ID,
  ApiV3OrderDelete200Response.JSON_PROPERTY_ORDER_LIST_ID,
  ApiV3OrderDelete200Response.JSON_PROPERTY_CLIENT_ORDER_ID,
  ApiV3OrderDelete200Response.JSON_PROPERTY_TRANSACT_TIME,
  ApiV3OrderDelete200Response.JSON_PROPERTY_PRICE,
  ApiV3OrderDelete200Response.JSON_PROPERTY_ORIG_QTY,
  ApiV3OrderDelete200Response.JSON_PROPERTY_EXECUTED_QTY,
  ApiV3OrderDelete200Response.JSON_PROPERTY_CUMMULATIVE_QUOTE_QTY,
  ApiV3OrderDelete200Response.JSON_PROPERTY_STATUS,
  ApiV3OrderDelete200Response.JSON_PROPERTY_TIME_IN_FORCE,
  ApiV3OrderDelete200Response.JSON_PROPERTY_TYPE,
  ApiV3OrderDelete200Response.JSON_PROPERTY_SIDE,
  ApiV3OrderDelete200Response.JSON_PROPERTY_STRATEGY_ID,
  ApiV3OrderDelete200Response.JSON_PROPERTY_STRATEGY_TYPE,
  ApiV3OrderDelete200Response.JSON_PROPERTY_WORKING_TIME,
  ApiV3OrderDelete200Response.JSON_PROPERTY_SELF_TRADE_PREVENTION_MODE,
  ApiV3OrderDelete200Response.JSON_PROPERTY_FILLS
})
@JsonTypeName("_api_v3_order_delete_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3OrderDelete200Response {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_ORDER_LIST_ID = "orderListId";
  private Long orderListId;

  public static final String JSON_PROPERTY_CLIENT_ORDER_ID = "clientOrderId";
  private String clientOrderId;

  public static final String JSON_PROPERTY_TRANSACT_TIME = "transactTime";
  private Long transactTime;

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

  public static final String JSON_PROPERTY_STRATEGY_ID = "strategyId";
  private Long strategyId;

  public static final String JSON_PROPERTY_STRATEGY_TYPE = "strategyType";
  private Long strategyType;

  public static final String JSON_PROPERTY_WORKING_TIME = "workingTime";
  private Long workingTime;

  public static final String JSON_PROPERTY_SELF_TRADE_PREVENTION_MODE = "selfTradePreventionMode";
  private String selfTradePreventionMode;

  public static final String JSON_PROPERTY_FILLS = "fills";
  private List<OrderResponseFullFillsInner> fills = new ArrayList<>();

  public ApiV3OrderDelete200Response() {
  }

  public ApiV3OrderDelete200Response symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTCUSDT", required = true, value = "")
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


  public ApiV3OrderDelete200Response orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "28", required = true, value = "")
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


  public ApiV3OrderDelete200Response orderListId(Long orderListId) {
    
    this.orderListId = orderListId;
    return this;
  }

   /**
   * Get orderListId
   * @return orderListId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "-1", required = true, value = "")
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


  public ApiV3OrderDelete200Response clientOrderId(String clientOrderId) {
    
    this.clientOrderId = clientOrderId;
    return this;
  }

   /**
   * Get clientOrderId
   * @return clientOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "6gCrw2kRUAF9CvJDGP16IP", required = true, value = "")
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


  public ApiV3OrderDelete200Response transactTime(Long transactTime) {
    
    this.transactTime = transactTime;
    return this;
  }

   /**
   * Get transactTime
   * @return transactTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1507725176595", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTransactTime() {
    return transactTime;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactTime(Long transactTime) {
    this.transactTime = transactTime;
  }


  public ApiV3OrderDelete200Response price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00000000", required = true, value = "")
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


  public ApiV3OrderDelete200Response origQty(String origQty) {
    
    this.origQty = origQty;
    return this;
  }

   /**
   * Get origQty
   * @return origQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10.00000000", required = true, value = "")
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


  public ApiV3OrderDelete200Response executedQty(String executedQty) {
    
    this.executedQty = executedQty;
    return this;
  }

   /**
   * Get executedQty
   * @return executedQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10.00000000", required = true, value = "")
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


  public ApiV3OrderDelete200Response cummulativeQuoteQty(String cummulativeQuoteQty) {
    
    this.cummulativeQuoteQty = cummulativeQuoteQty;
    return this;
  }

   /**
   * Get cummulativeQuoteQty
   * @return cummulativeQuoteQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10.00000000", required = true, value = "")
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


  public ApiV3OrderDelete200Response status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "FILLED", required = true, value = "")
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


  public ApiV3OrderDelete200Response timeInForce(String timeInForce) {
    
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


  public ApiV3OrderDelete200Response type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "MARKET", required = true, value = "")
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


  public ApiV3OrderDelete200Response side(String side) {
    
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SELL", required = true, value = "")
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


  public ApiV3OrderDelete200Response strategyId(Long strategyId) {
    
    this.strategyId = strategyId;
    return this;
  }

   /**
   * Get strategyId
   * @return strategyId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrategyId() {
    return strategyId;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyId(Long strategyId) {
    this.strategyId = strategyId;
  }


  public ApiV3OrderDelete200Response strategyType(Long strategyType) {
    
    this.strategyType = strategyType;
    return this;
  }

   /**
   * Get strategyType
   * @return strategyType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1000000", value = "")
  @JsonProperty(JSON_PROPERTY_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getStrategyType() {
    return strategyType;
  }


  @JsonProperty(JSON_PROPERTY_STRATEGY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStrategyType(Long strategyType) {
    this.strategyType = strategyType;
  }


  public ApiV3OrderDelete200Response workingTime(Long workingTime) {
    
    this.workingTime = workingTime;
    return this;
  }

   /**
   * Get workingTime
   * @return workingTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1507725176595", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getWorkingTime() {
    return workingTime;
  }


  @JsonProperty(JSON_PROPERTY_WORKING_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorkingTime(Long workingTime) {
    this.workingTime = workingTime;
  }


  public ApiV3OrderDelete200Response selfTradePreventionMode(String selfTradePreventionMode) {
    
    this.selfTradePreventionMode = selfTradePreventionMode;
    return this;
  }

   /**
   * Get selfTradePreventionMode
   * @return selfTradePreventionMode
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "NONE", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SELF_TRADE_PREVENTION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSelfTradePreventionMode() {
    return selfTradePreventionMode;
  }


  @JsonProperty(JSON_PROPERTY_SELF_TRADE_PREVENTION_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSelfTradePreventionMode(String selfTradePreventionMode) {
    this.selfTradePreventionMode = selfTradePreventionMode;
  }


  public ApiV3OrderDelete200Response fills(List<OrderResponseFullFillsInner> fills) {
    
    this.fills = fills;
    return this;
  }

  public ApiV3OrderDelete200Response addFillsItem(OrderResponseFullFillsInner fillsItem) {
    this.fills.add(fillsItem);
    return this;
  }

   /**
   * Get fills
   * @return fills
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FILLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<OrderResponseFullFillsInner> getFills() {
    return fills;
  }


  @JsonProperty(JSON_PROPERTY_FILLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFills(List<OrderResponseFullFillsInner> fills) {
    this.fills = fills;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3OrderDelete200Response apiV3OrderDelete200Response = (ApiV3OrderDelete200Response) o;
    return Objects.equals(this.symbol, apiV3OrderDelete200Response.symbol) &&
        Objects.equals(this.orderId, apiV3OrderDelete200Response.orderId) &&
        Objects.equals(this.orderListId, apiV3OrderDelete200Response.orderListId) &&
        Objects.equals(this.clientOrderId, apiV3OrderDelete200Response.clientOrderId) &&
        Objects.equals(this.transactTime, apiV3OrderDelete200Response.transactTime) &&
        Objects.equals(this.price, apiV3OrderDelete200Response.price) &&
        Objects.equals(this.origQty, apiV3OrderDelete200Response.origQty) &&
        Objects.equals(this.executedQty, apiV3OrderDelete200Response.executedQty) &&
        Objects.equals(this.cummulativeQuoteQty, apiV3OrderDelete200Response.cummulativeQuoteQty) &&
        Objects.equals(this.status, apiV3OrderDelete200Response.status) &&
        Objects.equals(this.timeInForce, apiV3OrderDelete200Response.timeInForce) &&
        Objects.equals(this.type, apiV3OrderDelete200Response.type) &&
        Objects.equals(this.side, apiV3OrderDelete200Response.side) &&
        Objects.equals(this.strategyId, apiV3OrderDelete200Response.strategyId) &&
        Objects.equals(this.strategyType, apiV3OrderDelete200Response.strategyType) &&
        Objects.equals(this.workingTime, apiV3OrderDelete200Response.workingTime) &&
        Objects.equals(this.selfTradePreventionMode, apiV3OrderDelete200Response.selfTradePreventionMode) &&
        Objects.equals(this.fills, apiV3OrderDelete200Response.fills);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, orderId, orderListId, clientOrderId, transactTime, price, origQty, executedQty, cummulativeQuoteQty, status, timeInForce, type, side, strategyId, strategyType, workingTime, selfTradePreventionMode, fills);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3OrderDelete200Response {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderListId: ").append(toIndentedString(orderListId)).append("\n");
    sb.append("    clientOrderId: ").append(toIndentedString(clientOrderId)).append("\n");
    sb.append("    transactTime: ").append(toIndentedString(transactTime)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    origQty: ").append(toIndentedString(origQty)).append("\n");
    sb.append("    executedQty: ").append(toIndentedString(executedQty)).append("\n");
    sb.append("    cummulativeQuoteQty: ").append(toIndentedString(cummulativeQuoteQty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
    sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
    sb.append("    workingTime: ").append(toIndentedString(workingTime)).append("\n");
    sb.append("    selfTradePreventionMode: ").append(toIndentedString(selfTradePreventionMode)).append("\n");
    sb.append("    fills: ").append(toIndentedString(fills)).append("\n");
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
