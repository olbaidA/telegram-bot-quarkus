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
 * SapiV1MarginIsolatedMarginTierGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1MarginIsolatedMarginTierGet200ResponseInner.JSON_PROPERTY_SYMBOL,
  SapiV1MarginIsolatedMarginTierGet200ResponseInner.JSON_PROPERTY_TIER,
  SapiV1MarginIsolatedMarginTierGet200ResponseInner.JSON_PROPERTY_EFFECTIVE_MULTIPLE,
  SapiV1MarginIsolatedMarginTierGet200ResponseInner.JSON_PROPERTY_INITIAL_RISK_RATIO,
  SapiV1MarginIsolatedMarginTierGet200ResponseInner.JSON_PROPERTY_LIQUIDATION_RISK_RATIO,
  SapiV1MarginIsolatedMarginTierGet200ResponseInner.JSON_PROPERTY_BASE_ASSET_MAX_BORROWABLE,
  SapiV1MarginIsolatedMarginTierGet200ResponseInner.JSON_PROPERTY_QUOTE_ASSET_MAX_BORROWABLE
})
@JsonTypeName("_sapi_v1_margin_isolatedMarginTier_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MarginIsolatedMarginTierGet200ResponseInner {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_TIER = "tier";
  private Integer tier;

  public static final String JSON_PROPERTY_EFFECTIVE_MULTIPLE = "effectiveMultiple";
  private String effectiveMultiple;

  public static final String JSON_PROPERTY_INITIAL_RISK_RATIO = "initialRiskRatio";
  private String initialRiskRatio;

  public static final String JSON_PROPERTY_LIQUIDATION_RISK_RATIO = "liquidationRiskRatio";
  private String liquidationRiskRatio;

  public static final String JSON_PROPERTY_BASE_ASSET_MAX_BORROWABLE = "baseAssetMaxBorrowable";
  private String baseAssetMaxBorrowable;

  public static final String JSON_PROPERTY_QUOTE_ASSET_MAX_BORROWABLE = "quoteAssetMaxBorrowable";
  private String quoteAssetMaxBorrowable;

  public SapiV1MarginIsolatedMarginTierGet200ResponseInner() {
  }

  public SapiV1MarginIsolatedMarginTierGet200ResponseInner symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "BTCUSDT", value = "")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public SapiV1MarginIsolatedMarginTierGet200ResponseInner tier(Integer tier) {
    
    this.tier = tier;
    return this;
  }

   /**
   * Get tier
   * @return tier
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTier() {
    return tier;
  }


  @JsonProperty(JSON_PROPERTY_TIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTier(Integer tier) {
    this.tier = tier;
  }


  public SapiV1MarginIsolatedMarginTierGet200ResponseInner effectiveMultiple(String effectiveMultiple) {
    
    this.effectiveMultiple = effectiveMultiple;
    return this;
  }

   /**
   * Get effectiveMultiple
   * @return effectiveMultiple
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "10", value = "")
  @JsonProperty(JSON_PROPERTY_EFFECTIVE_MULTIPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEffectiveMultiple() {
    return effectiveMultiple;
  }


  @JsonProperty(JSON_PROPERTY_EFFECTIVE_MULTIPLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEffectiveMultiple(String effectiveMultiple) {
    this.effectiveMultiple = effectiveMultiple;
  }


  public SapiV1MarginIsolatedMarginTierGet200ResponseInner initialRiskRatio(String initialRiskRatio) {
    
    this.initialRiskRatio = initialRiskRatio;
    return this;
  }

   /**
   * Get initialRiskRatio
   * @return initialRiskRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.111", value = "")
  @JsonProperty(JSON_PROPERTY_INITIAL_RISK_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInitialRiskRatio() {
    return initialRiskRatio;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_RISK_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialRiskRatio(String initialRiskRatio) {
    this.initialRiskRatio = initialRiskRatio;
  }


  public SapiV1MarginIsolatedMarginTierGet200ResponseInner liquidationRiskRatio(String liquidationRiskRatio) {
    
    this.liquidationRiskRatio = liquidationRiskRatio;
    return this;
  }

   /**
   * Get liquidationRiskRatio
   * @return liquidationRiskRatio
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.05", value = "")
  @JsonProperty(JSON_PROPERTY_LIQUIDATION_RISK_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLiquidationRiskRatio() {
    return liquidationRiskRatio;
  }


  @JsonProperty(JSON_PROPERTY_LIQUIDATION_RISK_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLiquidationRiskRatio(String liquidationRiskRatio) {
    this.liquidationRiskRatio = liquidationRiskRatio;
  }


  public SapiV1MarginIsolatedMarginTierGet200ResponseInner baseAssetMaxBorrowable(String baseAssetMaxBorrowable) {
    
    this.baseAssetMaxBorrowable = baseAssetMaxBorrowable;
    return this;
  }

   /**
   * Get baseAssetMaxBorrowable
   * @return baseAssetMaxBorrowable
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "9", value = "")
  @JsonProperty(JSON_PROPERTY_BASE_ASSET_MAX_BORROWABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBaseAssetMaxBorrowable() {
    return baseAssetMaxBorrowable;
  }


  @JsonProperty(JSON_PROPERTY_BASE_ASSET_MAX_BORROWABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBaseAssetMaxBorrowable(String baseAssetMaxBorrowable) {
    this.baseAssetMaxBorrowable = baseAssetMaxBorrowable;
  }


  public SapiV1MarginIsolatedMarginTierGet200ResponseInner quoteAssetMaxBorrowable(String quoteAssetMaxBorrowable) {
    
    this.quoteAssetMaxBorrowable = quoteAssetMaxBorrowable;
    return this;
  }

   /**
   * Get quoteAssetMaxBorrowable
   * @return quoteAssetMaxBorrowable
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "70000", value = "")
  @JsonProperty(JSON_PROPERTY_QUOTE_ASSET_MAX_BORROWABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getQuoteAssetMaxBorrowable() {
    return quoteAssetMaxBorrowable;
  }


  @JsonProperty(JSON_PROPERTY_QUOTE_ASSET_MAX_BORROWABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQuoteAssetMaxBorrowable(String quoteAssetMaxBorrowable) {
    this.quoteAssetMaxBorrowable = quoteAssetMaxBorrowable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1MarginIsolatedMarginTierGet200ResponseInner sapiV1MarginIsolatedMarginTierGet200ResponseInner = (SapiV1MarginIsolatedMarginTierGet200ResponseInner) o;
    return Objects.equals(this.symbol, sapiV1MarginIsolatedMarginTierGet200ResponseInner.symbol) &&
        Objects.equals(this.tier, sapiV1MarginIsolatedMarginTierGet200ResponseInner.tier) &&
        Objects.equals(this.effectiveMultiple, sapiV1MarginIsolatedMarginTierGet200ResponseInner.effectiveMultiple) &&
        Objects.equals(this.initialRiskRatio, sapiV1MarginIsolatedMarginTierGet200ResponseInner.initialRiskRatio) &&
        Objects.equals(this.liquidationRiskRatio, sapiV1MarginIsolatedMarginTierGet200ResponseInner.liquidationRiskRatio) &&
        Objects.equals(this.baseAssetMaxBorrowable, sapiV1MarginIsolatedMarginTierGet200ResponseInner.baseAssetMaxBorrowable) &&
        Objects.equals(this.quoteAssetMaxBorrowable, sapiV1MarginIsolatedMarginTierGet200ResponseInner.quoteAssetMaxBorrowable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, tier, effectiveMultiple, initialRiskRatio, liquidationRiskRatio, baseAssetMaxBorrowable, quoteAssetMaxBorrowable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MarginIsolatedMarginTierGet200ResponseInner {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    effectiveMultiple: ").append(toIndentedString(effectiveMultiple)).append("\n");
    sb.append("    initialRiskRatio: ").append(toIndentedString(initialRiskRatio)).append("\n");
    sb.append("    liquidationRiskRatio: ").append(toIndentedString(liquidationRiskRatio)).append("\n");
    sb.append("    baseAssetMaxBorrowable: ").append(toIndentedString(baseAssetMaxBorrowable)).append("\n");
    sb.append("    quoteAssetMaxBorrowable: ").append(toIndentedString(quoteAssetMaxBorrowable)).append("\n");
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

