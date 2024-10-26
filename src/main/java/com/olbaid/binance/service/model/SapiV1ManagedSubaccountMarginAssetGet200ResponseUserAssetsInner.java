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
 * SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner
 */
@JsonPropertyOrder({
  SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.JSON_PROPERTY_ASSET,
  SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.JSON_PROPERTY_BORROWED,
  SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.JSON_PROPERTY_FREE,
  SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.JSON_PROPERTY_INTEREST,
  SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.JSON_PROPERTY_LOCKED,
  SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.JSON_PROPERTY_NET_ASSET
})
@JsonTypeName("_sapi_v1_managed_subaccount_marginAsset_get_200_response_userAssets_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_BORROWED = "borrowed";
  private String borrowed;

  public static final String JSON_PROPERTY_FREE = "free";
  private String free;

  public static final String JSON_PROPERTY_INTEREST = "interest";
  private String interest;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private String locked;

  public static final String JSON_PROPERTY_NET_ASSET = "netAsset";
  private String netAsset;

  public SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner() {
  }

  public SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "")
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


  public SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner borrowed(String borrowed) {
    
    this.borrowed = borrowed;
    return this;
  }

   /**
   * Get borrowed
   * @return borrowed
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BORROWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBorrowed() {
    return borrowed;
  }


  @JsonProperty(JSON_PROPERTY_BORROWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBorrowed(String borrowed) {
    this.borrowed = borrowed;
  }


  public SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner free(String free) {
    
    this.free = free;
    return this;
  }

   /**
   * Get free
   * @return free
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
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


  public SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner interest(String interest) {
    
    this.interest = interest;
    return this;
  }

   /**
   * Get interest
   * @return interest
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INTEREST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInterest() {
    return interest;
  }


  @JsonProperty(JSON_PROPERTY_INTEREST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterest(String interest) {
    this.interest = interest;
  }


  public SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner locked(String locked) {
    
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


  public SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner netAsset(String netAsset) {
    
    this.netAsset = netAsset;
    return this;
  }

   /**
   * Get netAsset
   * @return netAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NET_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNetAsset() {
    return netAsset;
  }


  @JsonProperty(JSON_PROPERTY_NET_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetAsset(String netAsset) {
    this.netAsset = netAsset;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner sapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner = (SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner) o;
    return Objects.equals(this.asset, sapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.asset) &&
        Objects.equals(this.borrowed, sapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.borrowed) &&
        Objects.equals(this.free, sapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.free) &&
        Objects.equals(this.interest, sapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.interest) &&
        Objects.equals(this.locked, sapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.locked) &&
        Objects.equals(this.netAsset, sapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner.netAsset);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, borrowed, free, interest, locked, netAsset);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    borrowed: ").append(toIndentedString(borrowed)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    netAsset: ").append(toIndentedString(netAsset)).append("\n");
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

