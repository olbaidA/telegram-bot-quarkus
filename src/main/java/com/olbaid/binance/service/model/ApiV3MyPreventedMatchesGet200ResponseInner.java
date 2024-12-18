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
 * ApiV3MyPreventedMatchesGet200ResponseInner
 */
@JsonPropertyOrder({
  ApiV3MyPreventedMatchesGet200ResponseInner.JSON_PROPERTY_SYMBOL,
  ApiV3MyPreventedMatchesGet200ResponseInner.JSON_PROPERTY_PREVENTED_MATCH_ID,
  ApiV3MyPreventedMatchesGet200ResponseInner.JSON_PROPERTY_TAKER_ORDER_ID,
  ApiV3MyPreventedMatchesGet200ResponseInner.JSON_PROPERTY_MAKER_ORDER_ID,
  ApiV3MyPreventedMatchesGet200ResponseInner.JSON_PROPERTY_TRADE_GROUP_ID,
  ApiV3MyPreventedMatchesGet200ResponseInner.JSON_PROPERTY_SELF_TRADE_PREVENTION_MODE,
  ApiV3MyPreventedMatchesGet200ResponseInner.JSON_PROPERTY_PRICE,
  ApiV3MyPreventedMatchesGet200ResponseInner.JSON_PROPERTY_MAKER_PREVENTED_QUANTITY,
  ApiV3MyPreventedMatchesGet200ResponseInner.JSON_PROPERTY_TRANSACT_TIME
})
@JsonTypeName("_api_v3_myPreventedMatches_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3MyPreventedMatchesGet200ResponseInner {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_PREVENTED_MATCH_ID = "preventedMatchId";
  private Long preventedMatchId;

  public static final String JSON_PROPERTY_TAKER_ORDER_ID = "takerOrderId";
  private Long takerOrderId;

  public static final String JSON_PROPERTY_MAKER_ORDER_ID = "makerOrderId";
  private Long makerOrderId;

  public static final String JSON_PROPERTY_TRADE_GROUP_ID = "tradeGroupId";
  private Long tradeGroupId;

  public static final String JSON_PROPERTY_SELF_TRADE_PREVENTION_MODE = "selfTradePreventionMode";
  private String selfTradePreventionMode;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_MAKER_PREVENTED_QUANTITY = "makerPreventedQuantity";
  private String makerPreventedQuantity;

  public static final String JSON_PROPERTY_TRANSACT_TIME = "transactTime";
  private Long transactTime;

  public ApiV3MyPreventedMatchesGet200ResponseInner() {
  }

  public ApiV3MyPreventedMatchesGet200ResponseInner symbol(String symbol) {
    
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


  public ApiV3MyPreventedMatchesGet200ResponseInner preventedMatchId(Long preventedMatchId) {
    
    this.preventedMatchId = preventedMatchId;
    return this;
  }

   /**
   * Get preventedMatchId
   * @return preventedMatchId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PREVENTED_MATCH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPreventedMatchId() {
    return preventedMatchId;
  }


  @JsonProperty(JSON_PROPERTY_PREVENTED_MATCH_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreventedMatchId(Long preventedMatchId) {
    this.preventedMatchId = preventedMatchId;
  }


  public ApiV3MyPreventedMatchesGet200ResponseInner takerOrderId(Long takerOrderId) {
    
    this.takerOrderId = takerOrderId;
    return this;
  }

   /**
   * Get takerOrderId
   * @return takerOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAKER_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTakerOrderId() {
    return takerOrderId;
  }


  @JsonProperty(JSON_PROPERTY_TAKER_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTakerOrderId(Long takerOrderId) {
    this.takerOrderId = takerOrderId;
  }


  public ApiV3MyPreventedMatchesGet200ResponseInner makerOrderId(Long makerOrderId) {
    
    this.makerOrderId = makerOrderId;
    return this;
  }

   /**
   * Get makerOrderId
   * @return makerOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MAKER_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMakerOrderId() {
    return makerOrderId;
  }


  @JsonProperty(JSON_PROPERTY_MAKER_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMakerOrderId(Long makerOrderId) {
    this.makerOrderId = makerOrderId;
  }


  public ApiV3MyPreventedMatchesGet200ResponseInner tradeGroupId(Long tradeGroupId) {
    
    this.tradeGroupId = tradeGroupId;
    return this;
  }

   /**
   * Get tradeGroupId
   * @return tradeGroupId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTradeGroupId() {
    return tradeGroupId;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTradeGroupId(Long tradeGroupId) {
    this.tradeGroupId = tradeGroupId;
  }


  public ApiV3MyPreventedMatchesGet200ResponseInner selfTradePreventionMode(String selfTradePreventionMode) {
    
    this.selfTradePreventionMode = selfTradePreventionMode;
    return this;
  }

   /**
   * Get selfTradePreventionMode
   * @return selfTradePreventionMode
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "EXPIRE_MAKER", required = true, value = "")
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


  public ApiV3MyPreventedMatchesGet200ResponseInner price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.100000", required = true, value = "")
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


  public ApiV3MyPreventedMatchesGet200ResponseInner makerPreventedQuantity(String makerPreventedQuantity) {
    
    this.makerPreventedQuantity = makerPreventedQuantity;
    return this;
  }

   /**
   * Get makerPreventedQuantity
   * @return makerPreventedQuantity
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.300000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MAKER_PREVENTED_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMakerPreventedQuantity() {
    return makerPreventedQuantity;
  }


  @JsonProperty(JSON_PROPERTY_MAKER_PREVENTED_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMakerPreventedQuantity(String makerPreventedQuantity) {
    this.makerPreventedQuantity = makerPreventedQuantity;
  }


  public ApiV3MyPreventedMatchesGet200ResponseInner transactTime(Long transactTime) {
    
    this.transactTime = transactTime;
    return this;
  }

   /**
   * Get transactTime
   * @return transactTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1669101687094", required = true, value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3MyPreventedMatchesGet200ResponseInner apiV3MyPreventedMatchesGet200ResponseInner = (ApiV3MyPreventedMatchesGet200ResponseInner) o;
    return Objects.equals(this.symbol, apiV3MyPreventedMatchesGet200ResponseInner.symbol) &&
        Objects.equals(this.preventedMatchId, apiV3MyPreventedMatchesGet200ResponseInner.preventedMatchId) &&
        Objects.equals(this.takerOrderId, apiV3MyPreventedMatchesGet200ResponseInner.takerOrderId) &&
        Objects.equals(this.makerOrderId, apiV3MyPreventedMatchesGet200ResponseInner.makerOrderId) &&
        Objects.equals(this.tradeGroupId, apiV3MyPreventedMatchesGet200ResponseInner.tradeGroupId) &&
        Objects.equals(this.selfTradePreventionMode, apiV3MyPreventedMatchesGet200ResponseInner.selfTradePreventionMode) &&
        Objects.equals(this.price, apiV3MyPreventedMatchesGet200ResponseInner.price) &&
        Objects.equals(this.makerPreventedQuantity, apiV3MyPreventedMatchesGet200ResponseInner.makerPreventedQuantity) &&
        Objects.equals(this.transactTime, apiV3MyPreventedMatchesGet200ResponseInner.transactTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, preventedMatchId, takerOrderId, makerOrderId, tradeGroupId, selfTradePreventionMode, price, makerPreventedQuantity, transactTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3MyPreventedMatchesGet200ResponseInner {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    preventedMatchId: ").append(toIndentedString(preventedMatchId)).append("\n");
    sb.append("    takerOrderId: ").append(toIndentedString(takerOrderId)).append("\n");
    sb.append("    makerOrderId: ").append(toIndentedString(makerOrderId)).append("\n");
    sb.append("    tradeGroupId: ").append(toIndentedString(tradeGroupId)).append("\n");
    sb.append("    selfTradePreventionMode: ").append(toIndentedString(selfTradePreventionMode)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    makerPreventedQuantity: ").append(toIndentedString(makerPreventedQuantity)).append("\n");
    sb.append("    transactTime: ").append(toIndentedString(transactTime)).append("\n");
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

