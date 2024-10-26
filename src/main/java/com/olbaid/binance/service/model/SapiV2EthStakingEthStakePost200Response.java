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
 * SapiV2EthStakingEthStakePost200Response
 */
@JsonPropertyOrder({
  SapiV2EthStakingEthStakePost200Response.JSON_PROPERTY_SUCCESS,
  SapiV2EthStakingEthStakePost200Response.JSON_PROPERTY_WBETH_AMOUNT,
  SapiV2EthStakingEthStakePost200Response.JSON_PROPERTY_CONVERSION_RATIO
})
@JsonTypeName("_sapi_v2_eth_staking_eth_stake_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV2EthStakingEthStakePost200Response {
  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_WBETH_AMOUNT = "wbethAmount";
  private String wbethAmount;

  public static final String JSON_PROPERTY_CONVERSION_RATIO = "conversionRatio";
  private String conversionRatio;

  public SapiV2EthStakingEthStakePost200Response() {
  }

  public SapiV2EthStakingEthStakePost200Response success(Boolean success) {
    
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


  public SapiV2EthStakingEthStakePost200Response wbethAmount(String wbethAmount) {
    
    this.wbethAmount = wbethAmount;
    return this;
  }

   /**
   * Get wbethAmount
   * @return wbethAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.23092091", required = true, value = "")
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


  public SapiV2EthStakingEthStakePost200Response conversionRatio(String conversionRatio) {
    
    this.conversionRatio = conversionRatio;
    return this;
  }

   /**
   * ETH amount per 1 WBETH
   * @return conversionRatio
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.001212342342", required = true, value = "ETH amount per 1 WBETH")
  @JsonProperty(JSON_PROPERTY_CONVERSION_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getConversionRatio() {
    return conversionRatio;
  }


  @JsonProperty(JSON_PROPERTY_CONVERSION_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setConversionRatio(String conversionRatio) {
    this.conversionRatio = conversionRatio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV2EthStakingEthStakePost200Response sapiV2EthStakingEthStakePost200Response = (SapiV2EthStakingEthStakePost200Response) o;
    return Objects.equals(this.success, sapiV2EthStakingEthStakePost200Response.success) &&
        Objects.equals(this.wbethAmount, sapiV2EthStakingEthStakePost200Response.wbethAmount) &&
        Objects.equals(this.conversionRatio, sapiV2EthStakingEthStakePost200Response.conversionRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, wbethAmount, conversionRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV2EthStakingEthStakePost200Response {\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    wbethAmount: ").append(toIndentedString(wbethAmount)).append("\n");
    sb.append("    conversionRatio: ").append(toIndentedString(conversionRatio)).append("\n");
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

