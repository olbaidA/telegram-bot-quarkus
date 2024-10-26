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
 * SapiV1MarginTradeCoeffGet200Response
 */
@JsonPropertyOrder({
  SapiV1MarginTradeCoeffGet200Response.JSON_PROPERTY_NORMAL_BAR,
  SapiV1MarginTradeCoeffGet200Response.JSON_PROPERTY_MARGIN_CALL_BAR,
  SapiV1MarginTradeCoeffGet200Response.JSON_PROPERTY_FORCE_LIQUIDATION_BAR
})
@JsonTypeName("_sapi_v1_margin_tradeCoeff_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MarginTradeCoeffGet200Response {
  public static final String JSON_PROPERTY_NORMAL_BAR = "normalBar";
  private String normalBar;

  public static final String JSON_PROPERTY_MARGIN_CALL_BAR = "marginCallBar";
  private String marginCallBar;

  public static final String JSON_PROPERTY_FORCE_LIQUIDATION_BAR = "forceLiquidationBar";
  private String forceLiquidationBar;

  public SapiV1MarginTradeCoeffGet200Response() {
  }

  public SapiV1MarginTradeCoeffGet200Response normalBar(String normalBar) {
    
    this.normalBar = normalBar;
    return this;
  }

   /**
   * Account&#39;s currently max borrowable amount with sufficient system availability
   * @return normalBar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.5", value = "Account's currently max borrowable amount with sufficient system availability")
  @JsonProperty(JSON_PROPERTY_NORMAL_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNormalBar() {
    return normalBar;
  }


  @JsonProperty(JSON_PROPERTY_NORMAL_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNormalBar(String normalBar) {
    this.normalBar = normalBar;
  }


  public SapiV1MarginTradeCoeffGet200Response marginCallBar(String marginCallBar) {
    
    this.marginCallBar = marginCallBar;
    return this;
  }

   /**
   * Max borrowable amount limited by the account level
   * @return marginCallBar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.3", value = "Max borrowable amount limited by the account level")
  @JsonProperty(JSON_PROPERTY_MARGIN_CALL_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMarginCallBar() {
    return marginCallBar;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_CALL_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarginCallBar(String marginCallBar) {
    this.marginCallBar = marginCallBar;
  }


  public SapiV1MarginTradeCoeffGet200Response forceLiquidationBar(String forceLiquidationBar) {
    
    this.forceLiquidationBar = forceLiquidationBar;
    return this;
  }

   /**
   * Liquidation Margin Ratio
   * @return forceLiquidationBar
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1.1", value = "Liquidation Margin Ratio")
  @JsonProperty(JSON_PROPERTY_FORCE_LIQUIDATION_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getForceLiquidationBar() {
    return forceLiquidationBar;
  }


  @JsonProperty(JSON_PROPERTY_FORCE_LIQUIDATION_BAR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForceLiquidationBar(String forceLiquidationBar) {
    this.forceLiquidationBar = forceLiquidationBar;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1MarginTradeCoeffGet200Response sapiV1MarginTradeCoeffGet200Response = (SapiV1MarginTradeCoeffGet200Response) o;
    return Objects.equals(this.normalBar, sapiV1MarginTradeCoeffGet200Response.normalBar) &&
        Objects.equals(this.marginCallBar, sapiV1MarginTradeCoeffGet200Response.marginCallBar) &&
        Objects.equals(this.forceLiquidationBar, sapiV1MarginTradeCoeffGet200Response.forceLiquidationBar);
  }

  @Override
  public int hashCode() {
    return Objects.hash(normalBar, marginCallBar, forceLiquidationBar);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MarginTradeCoeffGet200Response {\n");
    sb.append("    normalBar: ").append(toIndentedString(normalBar)).append("\n");
    sb.append("    marginCallBar: ").append(toIndentedString(marginCallBar)).append("\n");
    sb.append("    forceLiquidationBar: ").append(toIndentedString(forceLiquidationBar)).append("\n");
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

