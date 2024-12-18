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
 * SapiV4SubAccountAssetsGet200ResponseBalancesInner
 */
@JsonPropertyOrder({
  SapiV4SubAccountAssetsGet200ResponseBalancesInner.JSON_PROPERTY_ASSET,
  SapiV4SubAccountAssetsGet200ResponseBalancesInner.JSON_PROPERTY_FREE,
  SapiV4SubAccountAssetsGet200ResponseBalancesInner.JSON_PROPERTY_LOCKED
})
@JsonTypeName("_sapi_v4_sub_account_assets_get_200_response_balances_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV4SubAccountAssetsGet200ResponseBalancesInner {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_FREE = "free";
  private String free;

  public static final String JSON_PROPERTY_LOCKED = "locked";
  private String locked;

  public SapiV4SubAccountAssetsGet200ResponseBalancesInner() {
  }

  public SapiV4SubAccountAssetsGet200ResponseBalancesInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
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


  public SapiV4SubAccountAssetsGet200ResponseBalancesInner free(String free) {
    
    this.free = free;
    return this;
  }

   /**
   * Get free
   * @return free
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10000", required = true, value = "")
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


  public SapiV4SubAccountAssetsGet200ResponseBalancesInner locked(String locked) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV4SubAccountAssetsGet200ResponseBalancesInner sapiV4SubAccountAssetsGet200ResponseBalancesInner = (SapiV4SubAccountAssetsGet200ResponseBalancesInner) o;
    return Objects.equals(this.asset, sapiV4SubAccountAssetsGet200ResponseBalancesInner.asset) &&
        Objects.equals(this.free, sapiV4SubAccountAssetsGet200ResponseBalancesInner.free) &&
        Objects.equals(this.locked, sapiV4SubAccountAssetsGet200ResponseBalancesInner.locked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, free, locked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV4SubAccountAssetsGet200ResponseBalancesInner {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    free: ").append(toIndentedString(free)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
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

