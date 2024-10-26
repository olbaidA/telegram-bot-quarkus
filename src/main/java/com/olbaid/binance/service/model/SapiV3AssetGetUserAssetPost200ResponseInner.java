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
 * SapiV3AssetGetUserAssetPost200ResponseInner
 */
@JsonPropertyOrder({
  SapiV3AssetGetUserAssetPost200ResponseInner.JSON_PROPERTY_ASSET,
  SapiV3AssetGetUserAssetPost200ResponseInner.JSON_PROPERTY_FREE,
  SapiV3AssetGetUserAssetPost200ResponseInner.JSON_PROPERTY_LOCKED,
  SapiV3AssetGetUserAssetPost200ResponseInner.JSON_PROPERTY_FREEZE,
  SapiV3AssetGetUserAssetPost200ResponseInner.JSON_PROPERTY_WITHDRAWING,
  SapiV3AssetGetUserAssetPost200ResponseInner.JSON_PROPERTY_IPOABLE,
  SapiV3AssetGetUserAssetPost200ResponseInner.JSON_PROPERTY_BTC_VALUATION
})
@JsonTypeName("_sapi_v3_asset_getUserAsset_post_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV3AssetGetUserAssetPost200ResponseInner {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_FREE = "free";
  private String free;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private String locked;

  public static final String JSON_PROPERTY_FREEZE = "freeze";
  private String freeze;

  public static final String JSON_PROPERTY_WITHDRAWING = "withdrawing";
  private String withdrawing;

  public static final String JSON_PROPERTY_IPOABLE = "ipoable";
  private String ipoable;

  public static final String JSON_PROPERTY_BTC_VALUATION = "btcValuation";
  private String btcValuation;

  public SapiV3AssetGetUserAssetPost200ResponseInner() {
  }

  public SapiV3AssetGetUserAssetPost200ResponseInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "AVAX", required = true, value = "")
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


  public SapiV3AssetGetUserAssetPost200ResponseInner free(String free) {
    
    this.free = free;
    return this;
  }

   /**
   * Get free
   * @return free
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FREE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFree() {
    return free;
  }


  @JsonProperty(JSON_PROPERTY_FREE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFree(String free) {
    this.free = free;
  }


  public SapiV3AssetGetUserAssetPost200ResponseInner locked(String locked) {
    
    this.locked = locked;
    return this;
  }

   /**
   * Get locked
   * @return locked
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocked() {
    return locked;
  }


  @JsonProperty(JSON_PROPERTY_LOCKED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocked(String locked) {
    this.locked = locked;
  }


  public SapiV3AssetGetUserAssetPost200ResponseInner freeze(String freeze) {
    
    this.freeze = freeze;
    return this;
  }

   /**
   * Get freeze
   * @return freeze
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FREEZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFreeze() {
    return freeze;
  }


  @JsonProperty(JSON_PROPERTY_FREEZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFreeze(String freeze) {
    this.freeze = freeze;
  }


  public SapiV3AssetGetUserAssetPost200ResponseInner withdrawing(String withdrawing) {
    
    this.withdrawing = withdrawing;
    return this;
  }

   /**
   * Get withdrawing
   * @return withdrawing
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WITHDRAWING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWithdrawing() {
    return withdrawing;
  }


  @JsonProperty(JSON_PROPERTY_WITHDRAWING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWithdrawing(String withdrawing) {
    this.withdrawing = withdrawing;
  }


  public SapiV3AssetGetUserAssetPost200ResponseInner ipoable(String ipoable) {
    
    this.ipoable = ipoable;
    return this;
  }

   /**
   * Get ipoable
   * @return ipoable
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IPOABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIpoable() {
    return ipoable;
  }


  @JsonProperty(JSON_PROPERTY_IPOABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIpoable(String ipoable) {
    this.ipoable = ipoable;
  }


  public SapiV3AssetGetUserAssetPost200ResponseInner btcValuation(String btcValuation) {
    
    this.btcValuation = btcValuation;
    return this;
  }

   /**
   * Get btcValuation
   * @return btcValuation
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BTC_VALUATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBtcValuation() {
    return btcValuation;
  }


  @JsonProperty(JSON_PROPERTY_BTC_VALUATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBtcValuation(String btcValuation) {
    this.btcValuation = btcValuation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV3AssetGetUserAssetPost200ResponseInner sapiV3AssetGetUserAssetPost200ResponseInner = (SapiV3AssetGetUserAssetPost200ResponseInner) o;
    return Objects.equals(this.asset, sapiV3AssetGetUserAssetPost200ResponseInner.asset) &&
        Objects.equals(this.free, sapiV3AssetGetUserAssetPost200ResponseInner.free) &&
        Objects.equals(this.locked, sapiV3AssetGetUserAssetPost200ResponseInner.locked) &&
        Objects.equals(this.freeze, sapiV3AssetGetUserAssetPost200ResponseInner.freeze) &&
        Objects.equals(this.withdrawing, sapiV3AssetGetUserAssetPost200ResponseInner.withdrawing) &&
        Objects.equals(this.ipoable, sapiV3AssetGetUserAssetPost200ResponseInner.ipoable) &&
        Objects.equals(this.btcValuation, sapiV3AssetGetUserAssetPost200ResponseInner.btcValuation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, free, locked, freeze, withdrawing, ipoable, btcValuation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV3AssetGetUserAssetPost200ResponseInner {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    freeze: ").append(toIndentedString(freeze)).append("\n");
    sb.append("    withdrawing: ").append(toIndentedString(withdrawing)).append("\n");
    sb.append("    ipoable: ").append(toIndentedString(ipoable)).append("\n");
    sb.append("    btcValuation: ").append(toIndentedString(btcValuation)).append("\n");
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

