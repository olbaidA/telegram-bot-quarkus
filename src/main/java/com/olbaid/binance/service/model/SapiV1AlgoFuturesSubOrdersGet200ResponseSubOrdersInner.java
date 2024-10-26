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
 * SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner
 */
@JsonPropertyOrder({
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_ALGO_ID,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_ORDER_ID,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_ORDER_STATUS,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_EXECUTED_QTY,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_EXECUTED_AMT,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_FEE_AMT,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_FEE_ASSET,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_BOOK_TIME,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_AVG_PRICE,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_SIDE,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_SYMBOL,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_SUB_ID,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_TIME_IN_FORCE,
  SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.JSON_PROPERTY_ORIG_QTY
})
@JsonTypeName("_sapi_v1_algo_futures_subOrders_get_200_response_subOrders_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner {
  public static final String JSON_PROPERTY_ALGO_ID = "algoId";
  private Long algoId;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_ORDER_STATUS = "orderStatus";
  private String orderStatus;

  public static final String JSON_PROPERTY_EXECUTED_QTY = "executedQty";
  private String executedQty;

  public static final String JSON_PROPERTY_EXECUTED_AMT = "executedAmt";
  private String executedAmt;

  public static final String JSON_PROPERTY_FEE_AMT = "feeAmt";
  private String feeAmt;

  public static final String JSON_PROPERTY_FEE_ASSET = "feeAsset";
  private String feeAsset;

  public static final String JSON_PROPERTY_BOOK_TIME = "bookTime";
  private Long bookTime;

  public static final String JSON_PROPERTY_AVG_PRICE = "avgPrice";
  private String avgPrice;

  public static final String JSON_PROPERTY_SIDE = "side";
  private String side;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_SUB_ID = "subId";
  private Long subId;

  public static final String JSON_PROPERTY_TIME_IN_FORCE = "timeInForce";
  private String timeInForce;

  public static final String JSON_PROPERTY_ORIG_QTY = "origQty";
  private String origQty;

  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner() {
  }

  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner algoId(Long algoId) {
    
    this.algoId = algoId;
    return this;
  }

   /**
   * Get algoId
   * @return algoId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "13723", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ALGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAlgoId() {
    return algoId;
  }


  @JsonProperty(JSON_PROPERTY_ALGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlgoId(Long algoId) {
    this.algoId = algoId;
  }


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "8389765519993908929", required = true, value = "")
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


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner orderStatus(String orderStatus) {
    
    this.orderStatus = orderStatus;
    return this;
  }

   /**
   * Get orderStatus
   * @return orderStatus
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "FILLED", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrderStatus() {
    return orderStatus;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderStatus(String orderStatus) {
    this.orderStatus = orderStatus;
  }


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner executedQty(String executedQty) {
    
    this.executedQty = executedQty;
    return this;
  }

   /**
   * Get executedQty
   * @return executedQty
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.000", value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTED_QTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExecutedQty() {
    return executedQty;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTED_QTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutedQty(String executedQty) {
    this.executedQty = executedQty;
  }


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner executedAmt(String executedAmt) {
    
    this.executedAmt = executedAmt;
    return this;
  }

   /**
   * Get executedAmt
   * @return executedAmt
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "3229.44000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTED_AMT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExecutedAmt() {
    return executedAmt;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTED_AMT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExecutedAmt(String executedAmt) {
    this.executedAmt = executedAmt;
  }


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner feeAmt(String feeAmt) {
    
    this.feeAmt = feeAmt;
    return this;
  }

   /**
   * Get feeAmt
   * @return feeAmt
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "-1.61471999", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FEE_AMT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFeeAmt() {
    return feeAmt;
  }


  @JsonProperty(JSON_PROPERTY_FEE_AMT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeeAmt(String feeAmt) {
    this.feeAmt = feeAmt;
  }


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner feeAsset(String feeAsset) {
    
    this.feeAsset = feeAsset;
    return this;
  }

   /**
   * Get feeAsset
   * @return feeAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FEE_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFeeAsset() {
    return feeAsset;
  }


  @JsonProperty(JSON_PROPERTY_FEE_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeeAsset(String feeAsset) {
    this.feeAsset = feeAsset;
  }


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner bookTime(Long bookTime) {
    
    this.bookTime = bookTime;
    return this;
  }

   /**
   * Get bookTime
   * @return bookTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1649756817004", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BOOK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getBookTime() {
    return bookTime;
  }


  @JsonProperty(JSON_PROPERTY_BOOK_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBookTime(Long bookTime) {
    this.bookTime = bookTime;
  }


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner avgPrice(String avgPrice) {
    
    this.avgPrice = avgPrice;
    return this;
  }

   /**
   * Get avgPrice
   * @return avgPrice
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "3229.44", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AVG_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAvgPrice() {
    return avgPrice;
  }


  @JsonProperty(JSON_PROPERTY_AVG_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvgPrice(String avgPrice) {
    this.avgPrice = avgPrice;
  }


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner side(String side) {
    
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


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ETHUSDT", required = true, value = "")
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


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner subId(Long subId) {
    
    this.subId = subId;
    return this;
  }

   /**
   * Get subId
   * @return subId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUB_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSubId() {
    return subId;
  }


  @JsonProperty(JSON_PROPERTY_SUB_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubId(Long subId) {
    this.subId = subId;
  }


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner timeInForce(String timeInForce) {
    
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "IMMEDIATE_OR_CANCEL", required = true, value = "")
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


  public SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner origQty(String origQty) {
    
    this.origQty = origQty;
    return this;
  }

   /**
   * Get origQty
   * @return origQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.000", required = true, value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner = (SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner) o;
    return Objects.equals(this.algoId, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.algoId) &&
        Objects.equals(this.orderId, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.orderId) &&
        Objects.equals(this.orderStatus, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.orderStatus) &&
        Objects.equals(this.executedQty, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.executedQty) &&
        Objects.equals(this.executedAmt, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.executedAmt) &&
        Objects.equals(this.feeAmt, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.feeAmt) &&
        Objects.equals(this.feeAsset, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.feeAsset) &&
        Objects.equals(this.bookTime, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.bookTime) &&
        Objects.equals(this.avgPrice, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.avgPrice) &&
        Objects.equals(this.side, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.side) &&
        Objects.equals(this.symbol, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.symbol) &&
        Objects.equals(this.subId, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.subId) &&
        Objects.equals(this.timeInForce, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.timeInForce) &&
        Objects.equals(this.origQty, sapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner.origQty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algoId, orderId, orderStatus, executedQty, executedAmt, feeAmt, feeAsset, bookTime, avgPrice, side, symbol, subId, timeInForce, origQty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AlgoFuturesSubOrdersGet200ResponseSubOrdersInner {\n");
    sb.append("    algoId: ").append(toIndentedString(algoId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
    sb.append("    executedQty: ").append(toIndentedString(executedQty)).append("\n");
    sb.append("    executedAmt: ").append(toIndentedString(executedAmt)).append("\n");
    sb.append("    feeAmt: ").append(toIndentedString(feeAmt)).append("\n");
    sb.append("    feeAsset: ").append(toIndentedString(feeAsset)).append("\n");
    sb.append("    bookTime: ").append(toIndentedString(bookTime)).append("\n");
    sb.append("    avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    subId: ").append(toIndentedString(subId)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    origQty: ").append(toIndentedString(origQty)).append("\n");
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

