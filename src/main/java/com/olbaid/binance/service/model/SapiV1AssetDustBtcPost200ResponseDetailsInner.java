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
 * SapiV1AssetDustBtcPost200ResponseDetailsInner
 */
@JsonPropertyOrder({
  SapiV1AssetDustBtcPost200ResponseDetailsInner.JSON_PROPERTY_ASSET,
  SapiV1AssetDustBtcPost200ResponseDetailsInner.JSON_PROPERTY_ASSET_FULL_NAME,
  SapiV1AssetDustBtcPost200ResponseDetailsInner.JSON_PROPERTY_AMOUNT_FREE,
  SapiV1AssetDustBtcPost200ResponseDetailsInner.JSON_PROPERTY_TO_B_T_C,
  SapiV1AssetDustBtcPost200ResponseDetailsInner.JSON_PROPERTY_TO_B_N_B,
  SapiV1AssetDustBtcPost200ResponseDetailsInner.JSON_PROPERTY_TO_B_N_B_OFF_EXCHANGE,
  SapiV1AssetDustBtcPost200ResponseDetailsInner.JSON_PROPERTY_EXCHANGE
})
@JsonTypeName("_sapi_v1_asset_dust_btc_post_200_response_details_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AssetDustBtcPost200ResponseDetailsInner {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_ASSET_FULL_NAME = "assetFullName";
  private String assetFullName;

  public static final String JSON_PROPERTY_AMOUNT_FREE = "amountFree";
  private String amountFree;

  public static final String JSON_PROPERTY_TO_B_T_C = "toBTC";
  private String toBTC;

  public static final String JSON_PROPERTY_TO_B_N_B = "toBNB";
  private String toBNB;

  public static final String JSON_PROPERTY_TO_B_N_B_OFF_EXCHANGE = "toBNBOffExchange";
  private String toBNBOffExchange;

  public static final String JSON_PROPERTY_EXCHANGE = "exchange";
  private String exchange;

  public SapiV1AssetDustBtcPost200ResponseDetailsInner() {
  }

  public SapiV1AssetDustBtcPost200ResponseDetailsInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ADA", required = true, value = "")
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


  public SapiV1AssetDustBtcPost200ResponseDetailsInner assetFullName(String assetFullName) {
    
    this.assetFullName = assetFullName;
    return this;
  }

   /**
   * Get assetFullName
   * @return assetFullName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ADA", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAssetFullName() {
    return assetFullName;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssetFullName(String assetFullName) {
    this.assetFullName = assetFullName;
  }


  public SapiV1AssetDustBtcPost200ResponseDetailsInner amountFree(String amountFree) {
    
    this.amountFree = amountFree;
    return this;
  }

   /**
   * Convertible amount
   * @return amountFree
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "6.21", required = true, value = "Convertible amount")
  @JsonProperty(JSON_PROPERTY_AMOUNT_FREE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmountFree() {
    return amountFree;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_FREE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountFree(String amountFree) {
    this.amountFree = amountFree;
  }


  public SapiV1AssetDustBtcPost200ResponseDetailsInner toBTC(String toBTC) {
    
    this.toBTC = toBTC;
    return this;
  }

   /**
   * BTC amount
   * @return toBTC
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00016848", required = true, value = "BTC amount")
  @JsonProperty(JSON_PROPERTY_TO_B_T_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToBTC() {
    return toBTC;
  }


  @JsonProperty(JSON_PROPERTY_TO_B_T_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToBTC(String toBTC) {
    this.toBTC = toBTC;
  }


  public SapiV1AssetDustBtcPost200ResponseDetailsInner toBNB(String toBNB) {
    
    this.toBNB = toBNB;
    return this;
  }

   /**
   * BNB amount(Not deducted commission fee
   * @return toBNB
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.01777302", required = true, value = "BNB amount(Not deducted commission fee")
  @JsonProperty(JSON_PROPERTY_TO_B_N_B)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToBNB() {
    return toBNB;
  }


  @JsonProperty(JSON_PROPERTY_TO_B_N_B)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToBNB(String toBNB) {
    this.toBNB = toBNB;
  }


  public SapiV1AssetDustBtcPost200ResponseDetailsInner toBNBOffExchange(String toBNBOffExchange) {
    
    this.toBNBOffExchange = toBNBOffExchange;
    return this;
  }

   /**
   * BNB amount(Deducted commission fee
   * @return toBNBOffExchange
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.01741756", required = true, value = "BNB amount(Deducted commission fee")
  @JsonProperty(JSON_PROPERTY_TO_B_N_B_OFF_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToBNBOffExchange() {
    return toBNBOffExchange;
  }


  @JsonProperty(JSON_PROPERTY_TO_B_N_B_OFF_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToBNBOffExchange(String toBNBOffExchange) {
    this.toBNBOffExchange = toBNBOffExchange;
  }


  public SapiV1AssetDustBtcPost200ResponseDetailsInner exchange(String exchange) {
    
    this.exchange = exchange;
    return this;
  }

   /**
   * Commission fee
   * @return exchange
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00035546", required = true, value = "Commission fee")
  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExchange() {
    return exchange;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1AssetDustBtcPost200ResponseDetailsInner sapiV1AssetDustBtcPost200ResponseDetailsInner = (SapiV1AssetDustBtcPost200ResponseDetailsInner) o;
    return Objects.equals(this.asset, sapiV1AssetDustBtcPost200ResponseDetailsInner.asset) &&
        Objects.equals(this.assetFullName, sapiV1AssetDustBtcPost200ResponseDetailsInner.assetFullName) &&
        Objects.equals(this.amountFree, sapiV1AssetDustBtcPost200ResponseDetailsInner.amountFree) &&
        Objects.equals(this.toBTC, sapiV1AssetDustBtcPost200ResponseDetailsInner.toBTC) &&
        Objects.equals(this.toBNB, sapiV1AssetDustBtcPost200ResponseDetailsInner.toBNB) &&
        Objects.equals(this.toBNBOffExchange, sapiV1AssetDustBtcPost200ResponseDetailsInner.toBNBOffExchange) &&
        Objects.equals(this.exchange, sapiV1AssetDustBtcPost200ResponseDetailsInner.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, assetFullName, amountFree, toBTC, toBNB, toBNBOffExchange, exchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AssetDustBtcPost200ResponseDetailsInner {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    assetFullName: ").append(toIndentedString(assetFullName)).append("\n");
    sb.append("    amountFree: ").append(toIndentedString(amountFree)).append("\n");
    sb.append("    toBTC: ").append(toIndentedString(toBTC)).append("\n");
    sb.append("    toBNB: ").append(toIndentedString(toBNB)).append("\n");
    sb.append("    toBNBOffExchange: ").append(toIndentedString(toBNBOffExchange)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
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
