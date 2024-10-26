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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CanceledMarginOrderDetail
 */
@JsonPropertyOrder({
  CanceledMarginOrderDetail.JSON_PROPERTY_SYMBOL,
  CanceledMarginOrderDetail.JSON_PROPERTY_IS_ISOLATED,
  CanceledMarginOrderDetail.JSON_PROPERTY_ORIG_CLIENT_ORDER_ID,
  CanceledMarginOrderDetail.JSON_PROPERTY_ORDER_ID,
  CanceledMarginOrderDetail.JSON_PROPERTY_ORDER_LIST_ID,
  CanceledMarginOrderDetail.JSON_PROPERTY_CLIENT_ORDER_ID,
  CanceledMarginOrderDetail.JSON_PROPERTY_PRICE,
  CanceledMarginOrderDetail.JSON_PROPERTY_ORIG_QTY,
  CanceledMarginOrderDetail.JSON_PROPERTY_EXECUTED_QTY,
  CanceledMarginOrderDetail.JSON_PROPERTY_CUMMULATIVE_QUOTE_QTY,
  CanceledMarginOrderDetail.JSON_PROPERTY_STATUS,
  CanceledMarginOrderDetail.JSON_PROPERTY_TIME_IN_FORCE,
  CanceledMarginOrderDetail.JSON_PROPERTY_TYPE,
  CanceledMarginOrderDetail.JSON_PROPERTY_SIDE
})
@JsonTypeName("canceledMarginOrderDetail")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CanceledMarginOrderDetail {
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

  public CanceledMarginOrderDetail() {
  }

  public CanceledMarginOrderDetail symbol(String symbol) {
    
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


  public CanceledMarginOrderDetail isIsolated(Boolean isIsolated) {
    
    this.isIsolated = isIsolated;
    return this;
  }

   /**
   * Get isIsolated
   * @return isIsolated
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public CanceledMarginOrderDetail origClientOrderId(String origClientOrderId) {
    
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


  public CanceledMarginOrderDetail orderId(Long orderId) {
    
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


  public CanceledMarginOrderDetail orderListId(Long orderListId) {
    
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


  public CanceledMarginOrderDetail clientOrderId(String clientOrderId) {
    
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


  public CanceledMarginOrderDetail price(String price) {
    
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


  public CanceledMarginOrderDetail origQty(String origQty) {
    
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


  public CanceledMarginOrderDetail executedQty(String executedQty) {
    
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


  public CanceledMarginOrderDetail cummulativeQuoteQty(String cummulativeQuoteQty) {
    
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


  public CanceledMarginOrderDetail status(String status) {
    
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


  public CanceledMarginOrderDetail timeInForce(String timeInForce) {
    
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


  public CanceledMarginOrderDetail type(String type) {
    
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


  public CanceledMarginOrderDetail side(String side) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CanceledMarginOrderDetail canceledMarginOrderDetail = (CanceledMarginOrderDetail) o;
    return Objects.equals(this.symbol, canceledMarginOrderDetail.symbol) &&
        Objects.equals(this.isIsolated, canceledMarginOrderDetail.isIsolated) &&
        Objects.equals(this.origClientOrderId, canceledMarginOrderDetail.origClientOrderId) &&
        Objects.equals(this.orderId, canceledMarginOrderDetail.orderId) &&
        Objects.equals(this.orderListId, canceledMarginOrderDetail.orderListId) &&
        Objects.equals(this.clientOrderId, canceledMarginOrderDetail.clientOrderId) &&
        Objects.equals(this.price, canceledMarginOrderDetail.price) &&
        Objects.equals(this.origQty, canceledMarginOrderDetail.origQty) &&
        Objects.equals(this.executedQty, canceledMarginOrderDetail.executedQty) &&
        Objects.equals(this.cummulativeQuoteQty, canceledMarginOrderDetail.cummulativeQuoteQty) &&
        Objects.equals(this.status, canceledMarginOrderDetail.status) &&
        Objects.equals(this.timeInForce, canceledMarginOrderDetail.timeInForce) &&
        Objects.equals(this.type, canceledMarginOrderDetail.type) &&
        Objects.equals(this.side, canceledMarginOrderDetail.side);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, isIsolated, origClientOrderId, orderId, orderListId, clientOrderId, price, origQty, executedQty, cummulativeQuoteQty, status, timeInForce, type, side);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CanceledMarginOrderDetail {\n");
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

