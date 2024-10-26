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
 * SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.JSON_PROPERTY_ORDER_ID,
  SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.JSON_PROPERTY_COLLATERAL_COIN,
  SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.JSON_PROPERTY_PRE_MARGIN_CALL,
  SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.JSON_PROPERTY_AFTER_MARGIN_CALL,
  SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.JSON_PROPERTY_CUSTOMIZE_TIME
})
@JsonTypeName("_sapi_v1_loan_customize_margin_call_post_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner {
  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private String orderId;

  public static final String JSON_PROPERTY_COLLATERAL_COIN = "collateralCoin";
  private String collateralCoin;

  public static final String JSON_PROPERTY_PRE_MARGIN_CALL = "preMarginCall";
  private String preMarginCall;

  public static final String JSON_PROPERTY_AFTER_MARGIN_CALL = "afterMarginCall";
  private String afterMarginCall;

  public static final String JSON_PROPERTY_CUSTOMIZE_TIME = "customizeTime";
  private Long customizeTime;

  public SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner() {
  }

  public SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner orderId(String orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "100000001", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner collateralCoin(String collateralCoin) {
    
    this.collateralCoin = collateralCoin;
    return this;
  }

   /**
   * Get collateralCoin
   * @return collateralCoin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COLLATERAL_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCollateralCoin() {
    return collateralCoin;
  }


  @JsonProperty(JSON_PROPERTY_COLLATERAL_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCollateralCoin(String collateralCoin) {
    this.collateralCoin = collateralCoin;
  }


  public SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner preMarginCall(String preMarginCall) {
    
    this.preMarginCall = preMarginCall;
    return this;
  }

   /**
   * Get preMarginCall
   * @return preMarginCall
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.8", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRE_MARGIN_CALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPreMarginCall() {
    return preMarginCall;
  }


  @JsonProperty(JSON_PROPERTY_PRE_MARGIN_CALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreMarginCall(String preMarginCall) {
    this.preMarginCall = preMarginCall;
  }


  public SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner afterMarginCall(String afterMarginCall) {
    
    this.afterMarginCall = afterMarginCall;
    return this;
  }

   /**
   * Get afterMarginCall
   * @return afterMarginCall
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.7", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AFTER_MARGIN_CALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAfterMarginCall() {
    return afterMarginCall;
  }


  @JsonProperty(JSON_PROPERTY_AFTER_MARGIN_CALL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAfterMarginCall(String afterMarginCall) {
    this.afterMarginCall = afterMarginCall;
  }


  public SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner customizeTime(Long customizeTime) {
    
    this.customizeTime = customizeTime;
    return this;
  }

   /**
   * Get customizeTime
   * @return customizeTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1575018510000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMIZE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCustomizeTime() {
    return customizeTime;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMIZE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomizeTime(Long customizeTime) {
    this.customizeTime = customizeTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner sapiV1LoanCustomizeMarginCallPost200ResponseRowsInner = (SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner) o;
    return Objects.equals(this.orderId, sapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.orderId) &&
        Objects.equals(this.collateralCoin, sapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.collateralCoin) &&
        Objects.equals(this.preMarginCall, sapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.preMarginCall) &&
        Objects.equals(this.afterMarginCall, sapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.afterMarginCall) &&
        Objects.equals(this.customizeTime, sapiV1LoanCustomizeMarginCallPost200ResponseRowsInner.customizeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, collateralCoin, preMarginCall, afterMarginCall, customizeTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LoanCustomizeMarginCallPost200ResponseRowsInner {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    collateralCoin: ").append(toIndentedString(collateralCoin)).append("\n");
    sb.append("    preMarginCall: ").append(toIndentedString(preMarginCall)).append("\n");
    sb.append("    afterMarginCall: ").append(toIndentedString(afterMarginCall)).append("\n");
    sb.append("    customizeTime: ").append(toIndentedString(customizeTime)).append("\n");
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

