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
 * SapiV2EthStakingAccountGet200ResponseProfit
 */
@JsonPropertyOrder({
  SapiV2EthStakingAccountGet200ResponseProfit.JSON_PROPERTY_AMOUNT_FROM_W_B_E_T_H,
  SapiV2EthStakingAccountGet200ResponseProfit.JSON_PROPERTY_AMOUNT_FROM_B_E_T_H
})
@JsonTypeName("_sapi_v2_eth_staking_account_get_200_response_profit")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV2EthStakingAccountGet200ResponseProfit {
  public static final String JSON_PROPERTY_AMOUNT_FROM_W_B_E_T_H = "amountFromWBETH";
  private String amountFromWBETH;

  public static final String JSON_PROPERTY_AMOUNT_FROM_B_E_T_H = "amountFromBETH";
  private String amountFromBETH;

  public SapiV2EthStakingAccountGet200ResponseProfit() {
  }

  public SapiV2EthStakingAccountGet200ResponseProfit amountFromWBETH(String amountFromWBETH) {
    
    this.amountFromWBETH = amountFromWBETH;
    return this;
  }

   /**
   * Get amountFromWBETH
   * @return amountFromWBETH
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.12330928", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_FROM_W_B_E_T_H)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmountFromWBETH() {
    return amountFromWBETH;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_FROM_W_B_E_T_H)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountFromWBETH(String amountFromWBETH) {
    this.amountFromWBETH = amountFromWBETH;
  }


  public SapiV2EthStakingAccountGet200ResponseProfit amountFromBETH(String amountFromBETH) {
    
    this.amountFromBETH = amountFromBETH;
    return this;
  }

   /**
   * Get amountFromBETH
   * @return amountFromBETH
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT_FROM_B_E_T_H)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmountFromBETH() {
    return amountFromBETH;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_FROM_B_E_T_H)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountFromBETH(String amountFromBETH) {
    this.amountFromBETH = amountFromBETH;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV2EthStakingAccountGet200ResponseProfit sapiV2EthStakingAccountGet200ResponseProfit = (SapiV2EthStakingAccountGet200ResponseProfit) o;
    return Objects.equals(this.amountFromWBETH, sapiV2EthStakingAccountGet200ResponseProfit.amountFromWBETH) &&
        Objects.equals(this.amountFromBETH, sapiV2EthStakingAccountGet200ResponseProfit.amountFromBETH);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountFromWBETH, amountFromBETH);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV2EthStakingAccountGet200ResponseProfit {\n");
    sb.append("    amountFromWBETH: ").append(toIndentedString(amountFromWBETH)).append("\n");
    sb.append("    amountFromBETH: ").append(toIndentedString(amountFromBETH)).append("\n");
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

