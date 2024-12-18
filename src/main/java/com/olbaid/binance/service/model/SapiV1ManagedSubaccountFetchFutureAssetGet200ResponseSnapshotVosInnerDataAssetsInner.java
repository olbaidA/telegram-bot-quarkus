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
 * SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner
 */
@JsonPropertyOrder({
  SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner.JSON_PROPERTY_ASSET,
  SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner.JSON_PROPERTY_MARGIN_BALANCE,
  SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner.JSON_PROPERTY_WALLET_BALANCE
})
@JsonTypeName("_sapi_v1_managed_subaccount_fetch_future_asset_get_200_response_snapshotVos_inner_data_assets_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_MARGIN_BALANCE = "marginBalance";
  private Float marginBalance;

  public static final String JSON_PROPERTY_WALLET_BALANCE = "walletBalance";
  private Float walletBalance;

  public SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner() {
  }

  public SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "")
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


  public SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner marginBalance(Float marginBalance) {
    
    this.marginBalance = marginBalance;
    return this;
  }

   /**
   * Get marginBalance
   * @return marginBalance
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MARGIN_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getMarginBalance() {
    return marginBalance;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMarginBalance(Float marginBalance) {
    this.marginBalance = marginBalance;
  }


  public SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner walletBalance(Float walletBalance) {
    
    this.walletBalance = walletBalance;
    return this;
  }

   /**
   * Get walletBalance
   * @return walletBalance
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WALLET_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getWalletBalance() {
    return walletBalance;
  }


  @JsonProperty(JSON_PROPERTY_WALLET_BALANCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWalletBalance(Float walletBalance) {
    this.walletBalance = walletBalance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner sapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner = (SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner) o;
    return Objects.equals(this.asset, sapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner.asset) &&
        Objects.equals(this.marginBalance, sapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner.marginBalance) &&
        Objects.equals(this.walletBalance, sapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner.walletBalance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, marginBalance, walletBalance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1ManagedSubaccountFetchFutureAssetGet200ResponseSnapshotVosInnerDataAssetsInner {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    marginBalance: ").append(toIndentedString(marginBalance)).append("\n");
    sb.append("    walletBalance: ").append(toIndentedString(walletBalance)).append("\n");
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

