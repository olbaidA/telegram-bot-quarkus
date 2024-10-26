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
 * SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates
 */
@JsonPropertyOrder({
  SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates.JSON_PROPERTY_U_S_D_C,
  SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates.JSON_PROPERTY_T_U_S_D,
  SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates.JSON_PROPERTY_U_S_D_P
})
@JsonTypeName("_sapi_v1_capital_contract_convertible_coins_get_200_response_exchangeRates")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates {
  public static final String JSON_PROPERTY_U_S_D_C = "USDC";
  private String USDC;

  public static final String JSON_PROPERTY_T_U_S_D = "TUSD";
  private String TUSD;

  public static final String JSON_PROPERTY_U_S_D_P = "USDP";
  private String USDP;

  public SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates() {
  }

  public SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates USDC(String USDC) {
    
    this.USDC = USDC;
    return this;
  }

   /**
   * Get USDC
   * @return USDC
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_U_S_D_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUSDC() {
    return USDC;
  }


  @JsonProperty(JSON_PROPERTY_U_S_D_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUSDC(String USDC) {
    this.USDC = USDC;
  }


  public SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates TUSD(String TUSD) {
    
    this.TUSD = TUSD;
    return this;
  }

   /**
   * Get TUSD
   * @return TUSD
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_T_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTUSD() {
    return TUSD;
  }


  @JsonProperty(JSON_PROPERTY_T_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTUSD(String TUSD) {
    this.TUSD = TUSD;
  }


  public SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates USDP(String USDP) {
    
    this.USDP = USDP;
    return this;
  }

   /**
   * Get USDP
   * @return USDP
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_U_S_D_P)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUSDP() {
    return USDP;
  }


  @JsonProperty(JSON_PROPERTY_U_S_D_P)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUSDP(String USDP) {
    this.USDP = USDP;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates sapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates = (SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates) o;
    return Objects.equals(this.USDC, sapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates.USDC) &&
        Objects.equals(this.TUSD, sapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates.TUSD) &&
        Objects.equals(this.USDP, sapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates.USDP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(USDC, TUSD, USDP);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1CapitalContractConvertibleCoinsGet200ResponseExchangeRates {\n");
    sb.append("    USDC: ").append(toIndentedString(USDC)).append("\n");
    sb.append("    TUSD: ").append(toIndentedString(TUSD)).append("\n");
    sb.append("    USDP: ").append(toIndentedString(USDP)).append("\n");
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

