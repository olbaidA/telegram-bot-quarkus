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
 * SapiV1PortfolioMarginAssetLeverageGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1PortfolioMarginAssetLeverageGet200ResponseInner.JSON_PROPERTY_ASSET,
  SapiV1PortfolioMarginAssetLeverageGet200ResponseInner.JSON_PROPERTY_COLLATERAL_RATE
})
@JsonTypeName("_sapi_v1_portfolio_margin_asset_leverage_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1PortfolioMarginAssetLeverageGet200ResponseInner {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_COLLATERAL_RATE = "collateralRate";
  private String collateralRate;

  public SapiV1PortfolioMarginAssetLeverageGet200ResponseInner() {
  }

  public SapiV1PortfolioMarginAssetLeverageGet200ResponseInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "USDC", value = "")
  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsset() {
    return asset;
  }


  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsset(String asset) {
    this.asset = asset;
  }


  public SapiV1PortfolioMarginAssetLeverageGet200ResponseInner collateralRate(String collateralRate) {
    
    this.collateralRate = collateralRate;
    return this;
  }

   /**
   * Get collateralRate
   * @return collateralRate
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.0000", value = "")
  @JsonProperty(JSON_PROPERTY_COLLATERAL_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCollateralRate() {
    return collateralRate;
  }


  @JsonProperty(JSON_PROPERTY_COLLATERAL_RATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCollateralRate(String collateralRate) {
    this.collateralRate = collateralRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1PortfolioMarginAssetLeverageGet200ResponseInner sapiV1PortfolioMarginAssetLeverageGet200ResponseInner = (SapiV1PortfolioMarginAssetLeverageGet200ResponseInner) o;
    return Objects.equals(this.asset, sapiV1PortfolioMarginAssetLeverageGet200ResponseInner.asset) &&
        Objects.equals(this.collateralRate, sapiV1PortfolioMarginAssetLeverageGet200ResponseInner.collateralRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, collateralRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1PortfolioMarginAssetLeverageGet200ResponseInner {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    collateralRate: ").append(toIndentedString(collateralRate)).append("\n");
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

