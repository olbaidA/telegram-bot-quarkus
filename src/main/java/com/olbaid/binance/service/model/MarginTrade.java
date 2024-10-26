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
 * MarginTrade
 */
@JsonPropertyOrder({
  MarginTrade.JSON_PROPERTY_COMMISSION,
  MarginTrade.JSON_PROPERTY_COMMISSION_ASSET,
  MarginTrade.JSON_PROPERTY_ID,
  MarginTrade.JSON_PROPERTY_IS_BEST_MATCH,
  MarginTrade.JSON_PROPERTY_IS_BUYER,
  MarginTrade.JSON_PROPERTY_IS_MAKER,
  MarginTrade.JSON_PROPERTY_ORDER_ID,
  MarginTrade.JSON_PROPERTY_PRICE,
  MarginTrade.JSON_PROPERTY_QTY,
  MarginTrade.JSON_PROPERTY_SYMBOL,
  MarginTrade.JSON_PROPERTY_IS_ISOLATED,
  MarginTrade.JSON_PROPERTY_TIME
})
@JsonTypeName("marginTrade")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarginTrade {
  public static final String JSON_PROPERTY_COMMISSION = "commission";
  private String commission;

  public static final String JSON_PROPERTY_COMMISSION_ASSET = "commissionAsset";
  private String commissionAsset;

  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_IS_BEST_MATCH = "isBestMatch";
  private Boolean isBestMatch;

  public static final String JSON_PROPERTY_IS_BUYER = "isBuyer";
  private Boolean isBuyer;

  public static final String JSON_PROPERTY_IS_MAKER = "isMaker";
  private Boolean isMaker;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_QTY = "qty";
  private String qty;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_IS_ISOLATED = "isIsolated";
  private Boolean isIsolated;

  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public MarginTrade() {
  }

  public MarginTrade commission(String commission) {
    
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00006000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCommission() {
    return commission;
  }


  @JsonProperty(JSON_PROPERTY_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommission(String commission) {
    this.commission = commission;
  }


  public MarginTrade commissionAsset(String commissionAsset) {
    
    this.commissionAsset = commissionAsset;
    return this;
  }

   /**
   * Get commissionAsset
   * @return commissionAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMMISSION_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCommissionAsset() {
    return commissionAsset;
  }


  @JsonProperty(JSON_PROPERTY_COMMISSION_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommissionAsset(String commissionAsset) {
    this.commissionAsset = commissionAsset;
  }


  public MarginTrade id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "28", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Long id) {
    this.id = id;
  }


  public MarginTrade isBestMatch(Boolean isBestMatch) {
    
    this.isBestMatch = isBestMatch;
    return this;
  }

   /**
   * Get isBestMatch
   * @return isBestMatch
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_BEST_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsBestMatch() {
    return isBestMatch;
  }


  @JsonProperty(JSON_PROPERTY_IS_BEST_MATCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsBestMatch(Boolean isBestMatch) {
    this.isBestMatch = isBestMatch;
  }


  public MarginTrade isBuyer(Boolean isBuyer) {
    
    this.isBuyer = isBuyer;
    return this;
  }

   /**
   * Get isBuyer
   * @return isBuyer
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_BUYER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsBuyer() {
    return isBuyer;
  }


  @JsonProperty(JSON_PROPERTY_IS_BUYER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsBuyer(Boolean isBuyer) {
    this.isBuyer = isBuyer;
  }


  public MarginTrade isMaker(Boolean isMaker) {
    
    this.isMaker = isMaker;
    return this;
  }

   /**
   * Get isMaker
   * @return isMaker
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_MAKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsMaker() {
    return isMaker;
  }


  @JsonProperty(JSON_PROPERTY_IS_MAKER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMaker(Boolean isMaker) {
    this.isMaker = isMaker;
  }


  public MarginTrade orderId(Long orderId) {
    
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


  public MarginTrade price(String price) {
    
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


  public MarginTrade qty(String qty) {
    
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.02000000", required = true, value = "")
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


  public MarginTrade symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNBBTC", required = true, value = "")
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


  public MarginTrade isIsolated(Boolean isIsolated) {
    
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


  public MarginTrade time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1507725176595", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTime(Long time) {
    this.time = time;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginTrade marginTrade = (MarginTrade) o;
    return Objects.equals(this.commission, marginTrade.commission) &&
        Objects.equals(this.commissionAsset, marginTrade.commissionAsset) &&
        Objects.equals(this.id, marginTrade.id) &&
        Objects.equals(this.isBestMatch, marginTrade.isBestMatch) &&
        Objects.equals(this.isBuyer, marginTrade.isBuyer) &&
        Objects.equals(this.isMaker, marginTrade.isMaker) &&
        Objects.equals(this.orderId, marginTrade.orderId) &&
        Objects.equals(this.price, marginTrade.price) &&
        Objects.equals(this.qty, marginTrade.qty) &&
        Objects.equals(this.symbol, marginTrade.symbol) &&
        Objects.equals(this.isIsolated, marginTrade.isIsolated) &&
        Objects.equals(this.time, marginTrade.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commission, commissionAsset, id, isBestMatch, isBuyer, isMaker, orderId, price, qty, symbol, isIsolated, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginTrade {\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    commissionAsset: ").append(toIndentedString(commissionAsset)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBestMatch: ").append(toIndentedString(isBestMatch)).append("\n");
    sb.append("    isBuyer: ").append(toIndentedString(isBuyer)).append("\n");
    sb.append("    isMaker: ").append(toIndentedString(isMaker)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    isIsolated: ").append(toIndentedString(isIsolated)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
