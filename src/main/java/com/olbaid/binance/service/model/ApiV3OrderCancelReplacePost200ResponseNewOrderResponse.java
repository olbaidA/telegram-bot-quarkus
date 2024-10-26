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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiV3OrderCancelReplacePost200ResponseNewOrderResponse
 */
@JsonPropertyOrder({
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_SYMBOL,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_ORDER_ID,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_ORDER_LIST_ID,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_CLIENT_ORDER_ID,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_TRANSACT_TIME,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_PRICE,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_ORIG_QTY,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_EXECUTED_QTY,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_CUMMULATIVE_QUOTE_QTY,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_STATUS,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_TIME_IN_FORCE,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_TYPE,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_SIDE,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_WORKING_TIME,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_FILLS,
  ApiV3OrderCancelReplacePost200ResponseNewOrderResponse.JSON_PROPERTY_SELF_TRADE_PREVENTION_MODE
})
@JsonTypeName("_api_v3_order_cancelReplace_post_200_response_newOrderResponse")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3OrderCancelReplacePost200ResponseNewOrderResponse {
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

  public static final String JSON_PROPERTY_WORKING_TIME = "workingTime";
  private Long workingTime;

  public static final String JSON_PROPERTY_FILLS = "fills";
  private List<String> fills = new ArrayList<>();

  public static final String JSON_PROPERTY_SELF_TRADE_PREVENTION_MODE = "selfTradePreventionMode";
  private String selfTradePreventionMode;

  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse() {
  }

  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse symbol(String symbol) {
    
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "")
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse orderListId(Long orderListId) {
    
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse clientOrderId(String clientOrderId) {
    
    this.clientOrderId = clientOrderId;
    return this;
  }

   /**
   * Get clientOrderId
   * @return clientOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "wOceeeOzNORyLiQfw7jd8S", required = true, value = "")
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse transactTime(Long transactTime) {
    
    this.transactTime = transactTime;
    return this;
  }

   /**
   * Get transactTime
   * @return transactTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1652928801803", required = true, value = "")
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.02000000", required = true, value = "")
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse origQty(String origQty) {
    
    this.origQty = origQty;
    return this;
  }

   /**
   * Get origQty
   * @return origQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.040000", required = true, value = "")
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse executedQty(String executedQty) {
    
    this.executedQty = executedQty;
    return this;
  }

   /**
   * Get executedQty
   * @return executedQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00000000", required = true, value = "")
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse cummulativeQuoteQty(String cummulativeQuoteQty) {
    
    this.cummulativeQuoteQty = cummulativeQuoteQty;
    return this;
  }

   /**
   * Get cummulativeQuoteQty
   * @return cummulativeQuoteQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00000000", required = true, value = "")
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "NEW", required = true, value = "")
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse timeInForce(String timeInForce) {
    
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse type(String type) {
    
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse side(String side) {
    
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse workingTime(Long workingTime) {
    
    this.workingTime = workingTime;
    return this;
  }

   /**
   * Get workingTime
   * @return workingTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1669277163808", required = true, value = "")
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


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse fills(List<String> fills) {
    
    this.fills = fills;
    return this;
  }

  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse addFillsItem(String fillsItem) {
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

  public List<String> getFills() {
    return fills;
  }


  @JsonProperty(JSON_PROPERTY_FILLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFills(List<String> fills) {
    this.fills = fills;
  }


  public ApiV3OrderCancelReplacePost200ResponseNewOrderResponse selfTradePreventionMode(String selfTradePreventionMode) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3OrderCancelReplacePost200ResponseNewOrderResponse apiV3OrderCancelReplacePost200ResponseNewOrderResponse = (ApiV3OrderCancelReplacePost200ResponseNewOrderResponse) o;
    return Objects.equals(this.symbol, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.symbol) &&
        Objects.equals(this.orderId, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.orderId) &&
        Objects.equals(this.orderListId, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.orderListId) &&
        Objects.equals(this.clientOrderId, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.clientOrderId) &&
        Objects.equals(this.transactTime, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.transactTime) &&
        Objects.equals(this.price, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.price) &&
        Objects.equals(this.origQty, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.origQty) &&
        Objects.equals(this.executedQty, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.executedQty) &&
        Objects.equals(this.cummulativeQuoteQty, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.cummulativeQuoteQty) &&
        Objects.equals(this.status, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.status) &&
        Objects.equals(this.timeInForce, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.timeInForce) &&
        Objects.equals(this.type, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.type) &&
        Objects.equals(this.side, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.side) &&
        Objects.equals(this.workingTime, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.workingTime) &&
        Objects.equals(this.fills, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.fills) &&
        Objects.equals(this.selfTradePreventionMode, apiV3OrderCancelReplacePost200ResponseNewOrderResponse.selfTradePreventionMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, orderId, orderListId, clientOrderId, transactTime, price, origQty, executedQty, cummulativeQuoteQty, status, timeInForce, type, side, workingTime, fills, selfTradePreventionMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3OrderCancelReplacePost200ResponseNewOrderResponse {\n");
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
    sb.append("    workingTime: ").append(toIndentedString(workingTime)).append("\n");
    sb.append("    fills: ").append(toIndentedString(fills)).append("\n");
    sb.append("    selfTradePreventionMode: ").append(toIndentedString(selfTradePreventionMode)).append("\n");
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

