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
 * SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_TIME,
  SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_ASSET,
  SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_HOLDING,
  SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_AMOUNT,
  SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_ANNUAL_PERCENTAGE_RATE,
  SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.JSON_PROPERTY_STATUS
})
@JsonTypeName("_sapi_v1_eth_staking_eth_history_rewardsHistory_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_HOLDING = "holding";
  private String holding;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_ANNUAL_PERCENTAGE_RATE = "annualPercentageRate";
  private String annualPercentageRate;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner() {
  }

  public SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner time(Long time) {
    
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


  public SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ETH", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAsset() {
    return asset;
  }


  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAsset(String asset) {
    this.asset = asset;
  }


  public SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner holding(String holding) {
    
    this.holding = holding;
    return this;
  }

   /**
   * BETH holding balance
   * @return holding
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2.3223", required = true, value = "BETH holding balance")
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


  public SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Distributed rewards
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.23223", required = true, value = "Distributed rewards")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner annualPercentageRate(String annualPercentageRate) {
    
    this.annualPercentageRate = annualPercentageRate;
    return this;
  }

   /**
   * 0.5 means 50% here
   * @return annualPercentageRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "0.5 means 50% here")
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


  public SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SUCCESS", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner sapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner = (SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner) o;
    return Objects.equals(this.time, sapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.time) &&
        Objects.equals(this.asset, sapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.asset) &&
        Objects.equals(this.holding, sapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.holding) &&
        Objects.equals(this.amount, sapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.amount) &&
        Objects.equals(this.annualPercentageRate, sapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.annualPercentageRate) &&
        Objects.equals(this.status, sapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, asset, holding, amount, annualPercentageRate, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1EthStakingEthHistoryRewardsHistoryGet200ResponseRowsInner {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    holding: ").append(toIndentedString(holding)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    annualPercentageRate: ").append(toIndentedString(annualPercentageRate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

