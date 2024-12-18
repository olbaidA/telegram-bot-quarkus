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
 * SapiV1EthStakingWbethWrapPost200Response
 */
@JsonPropertyOrder({
  SapiV1EthStakingWbethWrapPost200Response.JSON_PROPERTY_SUCCESS,
  SapiV1EthStakingWbethWrapPost200Response.JSON_PROPERTY_WBETH_AMOUNT,
  SapiV1EthStakingWbethWrapPost200Response.JSON_PROPERTY_EXCHANGE_RATE
})
@JsonTypeName("_sapi_v1_eth_staking_wbeth_wrap_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1EthStakingWbethWrapPost200Response {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_WBETH_AMOUNT = "wbethAmount";
  private String wbethAmount;

  public static final String JSON_PROPERTY_EXCHANGE_RATE = "exchangeRate";
  private String exchangeRate;

  public SapiV1EthStakingWbethWrapPost200Response() {
  }

  public SapiV1EthStakingWbethWrapPost200Response success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public SapiV1EthStakingWbethWrapPost200Response wbethAmount(String wbethAmount) {
    
    this.wbethAmount = wbethAmount;
    return this;
  }

   /**
   * Get wbethAmount
   * @return wbethAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.22330928", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WBETH_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWbethAmount() {
    return wbethAmount;
  }


  @JsonProperty(JSON_PROPERTY_WBETH_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWbethAmount(String wbethAmount) {
    this.wbethAmount = wbethAmount;
  }


  public SapiV1EthStakingWbethWrapPost200Response exchangeRate(String exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Get exchangeRate
   * @return exchangeRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.001212343432", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExchangeRate() {
    return exchangeRate;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchangeRate(String exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1EthStakingWbethWrapPost200Response sapiV1EthStakingWbethWrapPost200Response = (SapiV1EthStakingWbethWrapPost200Response) o;
    return Objects.equals(this.success, sapiV1EthStakingWbethWrapPost200Response.success) &&
        Objects.equals(this.wbethAmount, sapiV1EthStakingWbethWrapPost200Response.wbethAmount) &&
        Objects.equals(this.exchangeRate, sapiV1EthStakingWbethWrapPost200Response.exchangeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, wbethAmount, exchangeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1EthStakingWbethWrapPost200Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    wbethAmount: ").append(toIndentedString(wbethAmount)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
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

