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
 * SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner
 */
@JsonPropertyOrder({
  SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner.JSON_PROPERTY_I,
  SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner.JSON_PROPERTY_C,
  SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner.JSON_PROPERTY_V,
  SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner.JSON_PROPERTY_T
})
@JsonTypeName("_sapi_v1_account_apiTradingStatus_get_200_response_data_indicators_BTCUSDT_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner {
  public static final String JSON_PROPERTY_I = "i";
  private String i;

  public static final String JSON_PROPERTY_C = "c";
  private Long c;

  public static final String JSON_PROPERTY_V = "v";
  private Float v;

  public static final String JSON_PROPERTY_T = "t";
  private Float t;

  public SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner() {
  }

  public SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner i(String i) {
    
    this.i = i;
    return this;
  }

   /**
   * Unfilled Ratio (UFR)
   * @return i
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "UFR", required = true, value = "Unfilled Ratio (UFR)")
  @JsonProperty(JSON_PROPERTY_I)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getI() {
    return i;
  }


  @JsonProperty(JSON_PROPERTY_I)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setI(String i) {
    this.i = i;
  }


  public SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner c(Long c) {
    
    this.c = c;
    return this;
  }

   /**
   * Count of all orders
   * @return c
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "Count of all orders")
  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getC() {
    return c;
  }


  @JsonProperty(JSON_PROPERTY_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setC(Long c) {
    this.c = c;
  }


  public SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner v(Float v) {
    
    this.v = v;
    return this;
  }

   /**
   * Current UFR value
   * @return v
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.05", required = true, value = "Current UFR value")
  @JsonProperty(JSON_PROPERTY_V)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getV() {
    return v;
  }


  @JsonProperty(JSON_PROPERTY_V)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setV(Float v) {
    this.v = v;
  }


  public SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner t(Float t) {
    
    this.t = t;
    return this;
  }

   /**
   * Trigger UFR value
   * @return t
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.99", required = true, value = "Trigger UFR value")
  @JsonProperty(JSON_PROPERTY_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Float getT() {
    return t;
  }


  @JsonProperty(JSON_PROPERTY_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setT(Float t) {
    this.t = t;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner sapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner = (SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner) o;
    return Objects.equals(this.i, sapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner.i) &&
        Objects.equals(this.c, sapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner.c) &&
        Objects.equals(this.v, sapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner.v) &&
        Objects.equals(this.t, sapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner.t);
  }

  @Override
  public int hashCode() {
    return Objects.hash(i, c, v, t);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AccountApiTradingStatusGet200ResponseDataIndicatorsBTCUSDTInner {\n");
    sb.append("    i: ").append(toIndentedString(i)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    v: ").append(toIndentedString(v)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
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

