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
 * SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner
 */
@JsonPropertyOrder({
  SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner.JSON_PROPERTY_MIN_USD_VALUE,
  SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner.JSON_PROPERTY_MAX_USD_VALUE,
  SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner.JSON_PROPERTY_DISCOUNT_RATE
})
@JsonTypeName("_sapi_v1_margin_crossMarginCollateralRatio_get_200_response_inner_collaterals_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner {
  public static final String JSON_PROPERTY_MIN_USD_VALUE = "minUsdValue";
  private String minUsdValue;

  public static final String JSON_PROPERTY_MAX_USD_VALUE = "maxUsdValue";
  private String maxUsdValue;

  public static final String JSON_PROPERTY_DISCOUNT_RATE = "discountRate";
  private String discountRate;

  public SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner() {
  }

  public SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner minUsdValue(String minUsdValue) {
    
    this.minUsdValue = minUsdValue;
    return this;
  }

   /**
   * Get minUsdValue
   * @return minUsdValue
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MIN_USD_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMinUsdValue() {
    return minUsdValue;
  }


  @JsonProperty(JSON_PROPERTY_MIN_USD_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinUsdValue(String minUsdValue) {
    this.minUsdValue = minUsdValue;
  }


  public SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner maxUsdValue(String maxUsdValue) {
    
    this.maxUsdValue = maxUsdValue;
    return this;
  }

   /**
   * Get maxUsdValue
   * @return maxUsdValue
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "13000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MAX_USD_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxUsdValue() {
    return maxUsdValue;
  }


  @JsonProperty(JSON_PROPERTY_MAX_USD_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxUsdValue(String maxUsdValue) {
    this.maxUsdValue = maxUsdValue;
  }


  public SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner discountRate(String discountRate) {
    
    this.discountRate = discountRate;
    return this;
  }

   /**
   * Get discountRate
   * @return discountRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DISCOUNT_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDiscountRate() {
    return discountRate;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDiscountRate(String discountRate) {
    this.discountRate = discountRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner sapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner = (SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner) o;
    return Objects.equals(this.minUsdValue, sapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner.minUsdValue) &&
        Objects.equals(this.maxUsdValue, sapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner.maxUsdValue) &&
        Objects.equals(this.discountRate, sapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner.discountRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minUsdValue, maxUsdValue, discountRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MarginCrossMarginCollateralRatioGet200ResponseInnerCollateralsInner {\n");
    sb.append("    minUsdValue: ").append(toIndentedString(minUsdValue)).append("\n");
    sb.append("    maxUsdValue: ").append(toIndentedString(maxUsdValue)).append("\n");
    sb.append("    discountRate: ").append(toIndentedString(discountRate)).append("\n");
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

