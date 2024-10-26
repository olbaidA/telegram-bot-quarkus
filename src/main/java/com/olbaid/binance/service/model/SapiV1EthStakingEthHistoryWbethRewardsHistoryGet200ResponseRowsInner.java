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
 * SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_TIME,
  SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_AMOUNT_IN_E_T_H,
  SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_HOLDING,
  SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_HOLDING_IN_E_T_H,
  SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_ANNUAL_PERCENTAGE_RATE
})
@JsonTypeName("_sapi_v1_eth_staking_eth_history_wbethRewardsHistory_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public static final String JSON_PROPERTY_AMOUNT_IN_E_T_H = "amountInETH";
  private String amountInETH;

  public static final String JSON_PROPERTY_HOLDING = "holding";
  private String holding;

  public static final String JSON_PROPERTY_HOLDING_IN_E_T_H = "holdingInETH";
  private String holdingInETH;

  public static final String JSON_PROPERTY_ANNUAL_PERCENTAGE_RATE = "annualPercentageRate";
  private String annualPercentageRate;

  public SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner() {
  }

  public SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1575018510000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTime() {
    return time;
  }


  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTime(Long time) {
    this.time = time;
  }


  public SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner amountInETH(String amountInETH) {
    
    this.amountInETH = amountInETH;
    return this;
  }

   /**
   * Estimated rewards accrued within WBETH
   * @return amountInETH
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.23223", required = true, value = "Estimated rewards accrued within WBETH")
  @JsonProperty(JSON_PROPERTY_AMOUNT_IN_E_T_H)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmountInETH() {
    return amountInETH;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT_IN_E_T_H)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmountInETH(String amountInETH) {
    this.amountInETH = amountInETH;
  }


  public SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner holding(String holding) {
    
    this.holding = holding;
    return this;
  }

   /**
   * WBETH holding balance
   * @return holding
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2.3223", required = true, value = "WBETH holding balance")
  @JsonProperty(JSON_PROPERTY_HOLDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHolding() {
    return holding;
  }


  @JsonProperty(JSON_PROPERTY_HOLDING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHolding(String holding) {
    this.holding = holding;
  }


  public SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner holdingInETH(String holdingInETH) {
    
    this.holdingInETH = holdingInETH;
    return this;
  }

   /**
   * Get holdingInETH
   * @return holdingInETH
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2.4231", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HOLDING_IN_E_T_H)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHoldingInETH() {
    return holdingInETH;
  }


  @JsonProperty(JSON_PROPERTY_HOLDING_IN_E_T_H)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHoldingInETH(String holdingInETH) {
    this.holdingInETH = holdingInETH;
  }


  public SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner annualPercentageRate(String annualPercentageRate) {
    
    this.annualPercentageRate = annualPercentageRate;
    return this;
  }

   /**
   * Get annualPercentageRate
   * @return annualPercentageRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ANNUAL_PERCENTAGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAnnualPercentageRate() {
    return annualPercentageRate;
  }


  @JsonProperty(JSON_PROPERTY_ANNUAL_PERCENTAGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAnnualPercentageRate(String annualPercentageRate) {
    this.annualPercentageRate = annualPercentageRate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner sapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner = (SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner) o;
    return Objects.equals(this.time, sapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.time) &&
        Objects.equals(this.amountInETH, sapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.amountInETH) &&
        Objects.equals(this.holding, sapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.holding) &&
        Objects.equals(this.holdingInETH, sapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.holdingInETH) &&
        Objects.equals(this.annualPercentageRate, sapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner.annualPercentageRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, amountInETH, holding, holdingInETH, annualPercentageRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1EthStakingEthHistoryWbethRewardsHistoryGet200ResponseRowsInner {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    amountInETH: ").append(toIndentedString(amountInETH)).append("\n");
    sb.append("    holding: ").append(toIndentedString(holding)).append("\n");
    sb.append("    holdingInETH: ").append(toIndentedString(holdingInETH)).append("\n");
    sb.append("    annualPercentageRate: ").append(toIndentedString(annualPercentageRate)).append("\n");
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

