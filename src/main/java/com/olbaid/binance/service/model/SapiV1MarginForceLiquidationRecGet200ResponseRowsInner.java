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
 * SapiV1MarginForceLiquidationRecGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_AVG_PRICE,
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_EXECUTED_QTY,
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_ORDER_ID,
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_PRICE,
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_QTY,
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_SIDE,
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_SYMBOL,
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_TIME_IN_FORCE,
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_IS_ISOLATED,
  SapiV1MarginForceLiquidationRecGet200ResponseRowsInner.JSON_PROPERTY_UPDATED_TIME
})
@JsonTypeName("_sapi_v1_margin_forceLiquidationRec_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MarginForceLiquidationRecGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_AVG_PRICE = "avgPrice";
  private String avgPrice;

  public static final String JSON_PROPERTY_EXECUTED_QTY = "executedQty";
  private String executedQty;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_QTY = "qty";
  private String qty;

  public static final String JSON_PROPERTY_SIDE = "side";
  private String side;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_TIME_IN_FORCE = "timeInForce";
  private String timeInForce;

  public static final String JSON_PROPERTY_IS_ISOLATED = "isIsolated";
  private Boolean isIsolated;

  public static final String JSON_PROPERTY_UPDATED_TIME = "updatedTime";
  private Long updatedTime;

  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner() {
  }

  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner avgPrice(String avgPrice) {
    
    this.avgPrice = avgPrice;
    return this;
  }

   /**
   * Get avgPrice
   * @return avgPrice
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner executedQty(String executedQty) {
    
    this.executedQty = executedQty;
    return this;
  }

   /**
   * Get executedQty
   * @return executedQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner qty(String qty) {
    
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQty() {
    return qty;
  }


  @JsonProperty(JSON_PROPERTY_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQty(String qty) {
    this.qty = qty;
  }


  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner side(String side) {
    
    this.side = side;
    return this;
  }

   /**
   * Get side
   * @return side
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner timeInForce(String timeInForce) {
    
    this.timeInForce = timeInForce;
    return this;
  }

   /**
   * Get timeInForce
   * @return timeInForce
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner isIsolated(Boolean isIsolated) {
    
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


  public SapiV1MarginForceLiquidationRecGet200ResponseRowsInner updatedTime(Long updatedTime) {
    
    this.updatedTime = updatedTime;
    return this;
  }

   /**
   * Get updatedTime
   * @return updatedTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UPDATED_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUpdatedTime() {
    return updatedTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdatedTime(Long updatedTime) {
    this.updatedTime = updatedTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1MarginForceLiquidationRecGet200ResponseRowsInner sapiV1MarginForceLiquidationRecGet200ResponseRowsInner = (SapiV1MarginForceLiquidationRecGet200ResponseRowsInner) o;
    return Objects.equals(this.avgPrice, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.avgPrice) &&
        Objects.equals(this.executedQty, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.executedQty) &&
        Objects.equals(this.orderId, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.orderId) &&
        Objects.equals(this.price, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.price) &&
        Objects.equals(this.qty, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.qty) &&
        Objects.equals(this.side, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.side) &&
        Objects.equals(this.symbol, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.symbol) &&
        Objects.equals(this.timeInForce, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.timeInForce) &&
        Objects.equals(this.isIsolated, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.isIsolated) &&
        Objects.equals(this.updatedTime, sapiV1MarginForceLiquidationRecGet200ResponseRowsInner.updatedTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgPrice, executedQty, orderId, price, qty, side, symbol, timeInForce, isIsolated, updatedTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MarginForceLiquidationRecGet200ResponseRowsInner {\n");
    sb.append("    avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
    sb.append("    executedQty: ").append(toIndentedString(executedQty)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    side: ").append(toIndentedString(side)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
    sb.append("    isIsolated: ").append(toIndentedString(isIsolated)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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

