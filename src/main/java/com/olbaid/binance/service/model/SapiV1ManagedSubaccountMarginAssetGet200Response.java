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
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1ManagedSubaccountMarginAssetGet200Response
 */
@JsonPropertyOrder({
  SapiV1ManagedSubaccountMarginAssetGet200Response.JSON_PROPERTY_MARGIN_LEVEL,
  SapiV1ManagedSubaccountMarginAssetGet200Response.JSON_PROPERTY_TOTAL_ASSET_OF_BTC,
  SapiV1ManagedSubaccountMarginAssetGet200Response.JSON_PROPERTY_TOTAL_LIABILITY_OF_BTC,
  SapiV1ManagedSubaccountMarginAssetGet200Response.JSON_PROPERTY_TOTAL_NET_ASSET_OF_BTC,
  SapiV1ManagedSubaccountMarginAssetGet200Response.JSON_PROPERTY_USER_ASSETS
})
@JsonTypeName("_sapi_v1_managed_subaccount_marginAsset_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1ManagedSubaccountMarginAssetGet200Response {
  public static final String JSON_PROPERTY_MARGIN_LEVEL = "marginLevel";
  private String marginLevel;

  public static final String JSON_PROPERTY_TOTAL_ASSET_OF_BTC = "totalAssetOfBtc";
  private String totalAssetOfBtc;

  public static final String JSON_PROPERTY_TOTAL_LIABILITY_OF_BTC = "totalLiabilityOfBtc";
  private String totalLiabilityOfBtc;

  public static final String JSON_PROPERTY_TOTAL_NET_ASSET_OF_BTC = "totalNetAssetOfBtc";
  private String totalNetAssetOfBtc;

  public static final String JSON_PROPERTY_USER_ASSETS = "userAssets";
  private List<SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner> userAssets = new ArrayList<>();

  public SapiV1ManagedSubaccountMarginAssetGet200Response() {
  }

  public SapiV1ManagedSubaccountMarginAssetGet200Response marginLevel(String marginLevel) {
    
    this.marginLevel = marginLevel;
    return this;
  }

   /**
   * Get marginLevel
   * @return marginLevel
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "999", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MARGIN_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMarginLevel() {
    return marginLevel;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMarginLevel(String marginLevel) {
    this.marginLevel = marginLevel;
  }


  public SapiV1ManagedSubaccountMarginAssetGet200Response totalAssetOfBtc(String totalAssetOfBtc) {
    
    this.totalAssetOfBtc = totalAssetOfBtc;
    return this;
  }

   /**
   * Get totalAssetOfBtc
   * @return totalAssetOfBtc
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ASSET_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalAssetOfBtc() {
    return totalAssetOfBtc;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ASSET_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAssetOfBtc(String totalAssetOfBtc) {
    this.totalAssetOfBtc = totalAssetOfBtc;
  }


  public SapiV1ManagedSubaccountMarginAssetGet200Response totalLiabilityOfBtc(String totalLiabilityOfBtc) {
    
    this.totalLiabilityOfBtc = totalLiabilityOfBtc;
    return this;
  }

   /**
   * Get totalLiabilityOfBtc
   * @return totalLiabilityOfBtc
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_LIABILITY_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalLiabilityOfBtc() {
    return totalLiabilityOfBtc;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_LIABILITY_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalLiabilityOfBtc(String totalLiabilityOfBtc) {
    this.totalLiabilityOfBtc = totalLiabilityOfBtc;
  }


  public SapiV1ManagedSubaccountMarginAssetGet200Response totalNetAssetOfBtc(String totalNetAssetOfBtc) {
    
    this.totalNetAssetOfBtc = totalNetAssetOfBtc;
    return this;
  }

   /**
   * Get totalNetAssetOfBtc
   * @return totalNetAssetOfBtc
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_NET_ASSET_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalNetAssetOfBtc() {
    return totalNetAssetOfBtc;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NET_ASSET_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalNetAssetOfBtc(String totalNetAssetOfBtc) {
    this.totalNetAssetOfBtc = totalNetAssetOfBtc;
  }


  public SapiV1ManagedSubaccountMarginAssetGet200Response userAssets(List<SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner> userAssets) {
    
    this.userAssets = userAssets;
    return this;
  }

  public SapiV1ManagedSubaccountMarginAssetGet200Response addUserAssetsItem(SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner userAssetsItem) {
    this.userAssets.add(userAssetsItem);
    return this;
  }

   /**
   * Get userAssets
   * @return userAssets
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USER_ASSETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner> getUserAssets() {
    return userAssets;
  }


  @JsonProperty(JSON_PROPERTY_USER_ASSETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserAssets(List<SapiV1ManagedSubaccountMarginAssetGet200ResponseUserAssetsInner> userAssets) {
    this.userAssets = userAssets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1ManagedSubaccountMarginAssetGet200Response sapiV1ManagedSubaccountMarginAssetGet200Response = (SapiV1ManagedSubaccountMarginAssetGet200Response) o;
    return Objects.equals(this.marginLevel, sapiV1ManagedSubaccountMarginAssetGet200Response.marginLevel) &&
        Objects.equals(this.totalAssetOfBtc, sapiV1ManagedSubaccountMarginAssetGet200Response.totalAssetOfBtc) &&
        Objects.equals(this.totalLiabilityOfBtc, sapiV1ManagedSubaccountMarginAssetGet200Response.totalLiabilityOfBtc) &&
        Objects.equals(this.totalNetAssetOfBtc, sapiV1ManagedSubaccountMarginAssetGet200Response.totalNetAssetOfBtc) &&
        Objects.equals(this.userAssets, sapiV1ManagedSubaccountMarginAssetGet200Response.userAssets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(marginLevel, totalAssetOfBtc, totalLiabilityOfBtc, totalNetAssetOfBtc, userAssets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1ManagedSubaccountMarginAssetGet200Response {\n");
    sb.append("    marginLevel: ").append(toIndentedString(marginLevel)).append("\n");
    sb.append("    totalAssetOfBtc: ").append(toIndentedString(totalAssetOfBtc)).append("\n");
    sb.append("    totalLiabilityOfBtc: ").append(toIndentedString(totalLiabilityOfBtc)).append("\n");
    sb.append("    totalNetAssetOfBtc: ").append(toIndentedString(totalNetAssetOfBtc)).append("\n");
    sb.append("    userAssets: ").append(toIndentedString(userAssets)).append("\n");
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

