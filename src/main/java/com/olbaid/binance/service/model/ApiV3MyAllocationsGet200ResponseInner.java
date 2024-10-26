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
 * ApiV3MyAllocationsGet200ResponseInner
 */
@JsonPropertyOrder({
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_SYMBOL,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_ALLOCATION_ID,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_ALLOCATION_TYPE,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_ORDER_ID,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_ORDER_LIST_ID,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_PRICE,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_QTY,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_QUOTE_QTY,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_COMMISSION,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_COMMISSION_ASSET,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_TIME,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_IS_BUYER,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_IS_MAKER,
  ApiV3MyAllocationsGet200ResponseInner.JSON_PROPERTY_IS_ALLOCATOR
})
@JsonTypeName("_api_v3_myAllocations_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3MyAllocationsGet200ResponseInner {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_ALLOCATION_ID = "allocationId";
  private Long allocationId;

  public static final String JSON_PROPERTY_ALLOCATION_TYPE = "allocationType";
  private String allocationType;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_ORDER_LIST_ID = "orderListId";
  private Long orderListId;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_QTY = "qty";
  private String qty;

  public static final String JSON_PROPERTY_QUOTE_QTY = "quoteQty";
  private String quoteQty;

  public static final String JSON_PROPERTY_COMMISSION = "commission";
  private String commission;

  public static final String JSON_PROPERTY_COMMISSION_ASSET = "commissionAsset";
  private String commissionAsset;

  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public static final String JSON_PROPERTY_IS_BUYER = "isBuyer";
  private Boolean isBuyer;

  public static final String JSON_PROPERTY_IS_MAKER = "isMaker";
  private Boolean isMaker;

  public static final String JSON_PROPERTY_IS_ALLOCATOR = "isAllocator";
  private Boolean isAllocator;

  public ApiV3MyAllocationsGet200ResponseInner() {
  }

  public ApiV3MyAllocationsGet200ResponseInner symbol(String symbol) {
    
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


  public ApiV3MyAllocationsGet200ResponseInner allocationId(Long allocationId) {
    
    this.allocationId = allocationId;
    return this;
  }

   /**
   * Get allocationId
   * @return allocationId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ALLOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAllocationId() {
    return allocationId;
  }


  @JsonProperty(JSON_PROPERTY_ALLOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllocationId(Long allocationId) {
    this.allocationId = allocationId;
  }


  public ApiV3MyAllocationsGet200ResponseInner allocationType(String allocationType) {
    
    this.allocationType = allocationType;
    return this;
  }

   /**
   * Get allocationType
   * @return allocationType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SOR", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ALLOCATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAllocationType() {
    return allocationType;
  }


  @JsonProperty(JSON_PROPERTY_ALLOCATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllocationType(String allocationType) {
    this.allocationType = allocationType;
  }


  public ApiV3MyAllocationsGet200ResponseInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
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


  public ApiV3MyAllocationsGet200ResponseInner orderListId(Long orderListId) {
    
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


  public ApiV3MyAllocationsGet200ResponseInner price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.00000000", required = true, value = "")
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


  public ApiV3MyAllocationsGet200ResponseInner qty(String qty) {
    
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "5.00000000", required = true, value = "")
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


  public ApiV3MyAllocationsGet200ResponseInner quoteQty(String quoteQty) {
    
    this.quoteQty = quoteQty;
    return this;
  }

   /**
   * Get quoteQty
   * @return quoteQty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "5.00000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_QUOTE_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQuoteQty() {
    return quoteQty;
  }


  @JsonProperty(JSON_PROPERTY_QUOTE_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuoteQty(String quoteQty) {
    this.quoteQty = quoteQty;
  }


  public ApiV3MyAllocationsGet200ResponseInner commission(String commission) {
    
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00000000", required = true, value = "")
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


  public ApiV3MyAllocationsGet200ResponseInner commissionAsset(String commissionAsset) {
    
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


  public ApiV3MyAllocationsGet200ResponseInner time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1687506878118", required = true, value = "")
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


  public ApiV3MyAllocationsGet200ResponseInner isBuyer(Boolean isBuyer) {
    
    this.isBuyer = isBuyer;
    return this;
  }

   /**
   * Get isBuyer
   * @return isBuyer
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
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


  public ApiV3MyAllocationsGet200ResponseInner isMaker(Boolean isMaker) {
    
    this.isMaker = isMaker;
    return this;
  }

   /**
   * Get isMaker
   * @return isMaker
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")
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


  public ApiV3MyAllocationsGet200ResponseInner isAllocator(Boolean isAllocator) {
    
    this.isAllocator = isAllocator;
    return this;
  }

   /**
   * Get isAllocator
   * @return isAllocator
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_ALLOCATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsAllocator() {
    return isAllocator;
  }


  @JsonProperty(JSON_PROPERTY_IS_ALLOCATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsAllocator(Boolean isAllocator) {
    this.isAllocator = isAllocator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3MyAllocationsGet200ResponseInner apiV3MyAllocationsGet200ResponseInner = (ApiV3MyAllocationsGet200ResponseInner) o;
    return Objects.equals(this.symbol, apiV3MyAllocationsGet200ResponseInner.symbol) &&
        Objects.equals(this.allocationId, apiV3MyAllocationsGet200ResponseInner.allocationId) &&
        Objects.equals(this.allocationType, apiV3MyAllocationsGet200ResponseInner.allocationType) &&
        Objects.equals(this.orderId, apiV3MyAllocationsGet200ResponseInner.orderId) &&
        Objects.equals(this.orderListId, apiV3MyAllocationsGet200ResponseInner.orderListId) &&
        Objects.equals(this.price, apiV3MyAllocationsGet200ResponseInner.price) &&
        Objects.equals(this.qty, apiV3MyAllocationsGet200ResponseInner.qty) &&
        Objects.equals(this.quoteQty, apiV3MyAllocationsGet200ResponseInner.quoteQty) &&
        Objects.equals(this.commission, apiV3MyAllocationsGet200ResponseInner.commission) &&
        Objects.equals(this.commissionAsset, apiV3MyAllocationsGet200ResponseInner.commissionAsset) &&
        Objects.equals(this.time, apiV3MyAllocationsGet200ResponseInner.time) &&
        Objects.equals(this.isBuyer, apiV3MyAllocationsGet200ResponseInner.isBuyer) &&
        Objects.equals(this.isMaker, apiV3MyAllocationsGet200ResponseInner.isMaker) &&
        Objects.equals(this.isAllocator, apiV3MyAllocationsGet200ResponseInner.isAllocator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, allocationId, allocationType, orderId, orderListId, price, qty, quoteQty, commission, commissionAsset, time, isBuyer, isMaker, isAllocator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3MyAllocationsGet200ResponseInner {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    allocationId: ").append(toIndentedString(allocationId)).append("\n");
    sb.append("    allocationType: ").append(toIndentedString(allocationType)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    orderListId: ").append(toIndentedString(orderListId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    quoteQty: ").append(toIndentedString(quoteQty)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    commissionAsset: ").append(toIndentedString(commissionAsset)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    isBuyer: ").append(toIndentedString(isBuyer)).append("\n");
    sb.append("    isMaker: ").append(toIndentedString(isMaker)).append("\n");
    sb.append("    isAllocator: ").append(toIndentedString(isAllocator)).append("\n");
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
