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
 * SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.JSON_PROPERTY_ASSET,
  SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.JSON_PROPERTY_AMOUNT,
  SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.JSON_PROPERTY_TARGET_ASSET,
  SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.JSON_PROPERTY_TARGET_AMOUNT,
  SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.JSON_PROPERTY_BIZ_TYPE,
  SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.JSON_PROPERTY_TIMESTAMP
})
@JsonTypeName("_sapi_v1_margin_exchange_small_liability_history_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_TARGET_ASSET = "targetAsset";
  private String targetAsset;

  public static final String JSON_PROPERTY_TARGET_AMOUNT = "targetAmount";
  private String targetAmount;

  public static final String JSON_PROPERTY_BIZ_TYPE = "bizType";
  private String bizType;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner() {
  }

  public SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ETH", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAsset() {
    return asset;
  }


  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAsset(String asset) {
    this.asset = asset;
  }


  public SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00083434", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner targetAsset(String targetAsset) {
    
    this.targetAsset = targetAsset;
    return this;
  }

   /**
   * Get targetAsset
   * @return targetAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BUSD", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetAsset() {
    return targetAsset;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetAsset(String targetAsset) {
    this.targetAsset = targetAsset;
  }


  public SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner targetAmount(String targetAmount) {
    
    this.targetAmount = targetAmount;
    return this;
  }

   /**
   * Get targetAmount
   * @return targetAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.37576819", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetAmount() {
    return targetAmount;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetAmount(String targetAmount) {
    this.targetAmount = targetAmount;
  }


  public SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * Get bizType
   * @return bizType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "EXCHANGE_SMALL_LIABILITY", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BIZ_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBizType() {
    return bizType;
  }


  @JsonProperty(JSON_PROPERTY_BIZ_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1672801339253", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner sapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner = (SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner) o;
    return Objects.equals(this.asset, sapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.asset) &&
        Objects.equals(this.amount, sapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.amount) &&
        Objects.equals(this.targetAsset, sapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.targetAsset) &&
        Objects.equals(this.targetAmount, sapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.targetAmount) &&
        Objects.equals(this.bizType, sapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.bizType) &&
        Objects.equals(this.timestamp, sapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, amount, targetAsset, targetAmount, bizType, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MarginExchangeSmallLiabilityHistoryGet200ResponseRowsInner {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    targetAsset: ").append(toIndentedString(targetAsset)).append("\n");
    sb.append("    targetAmount: ").append(toIndentedString(targetAmount)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
