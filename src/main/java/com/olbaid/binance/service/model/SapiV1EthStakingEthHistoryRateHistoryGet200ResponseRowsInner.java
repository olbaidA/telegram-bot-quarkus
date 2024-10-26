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
 * SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner.JSON_PROPERTY_ANNUAL_PERCENTAGE_RATE,
  SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner.JSON_PROPERTY_EXCHANGE_RATE,
  SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner.JSON_PROPERTY_TIME
})
@JsonTypeName("_sapi_v1_eth_staking_eth_history_rateHistory_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_ANNUAL_PERCENTAGE_RATE = "annualPercentageRate";
  private String annualPercentageRate;

  public static final String JSON_PROPERTY_EXCHANGE_RATE = "exchangeRate";
  private String exchangeRate;

  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner() {
  }

  public SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner annualPercentageRate(String annualPercentageRate) {
    
    this.annualPercentageRate = annualPercentageRate;
    return this;
  }

   /**
   * BETH APR
   * @return annualPercentageRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "BETH APR")
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


  public SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner exchangeRate(String exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * BETH value per 1 WBETH
   * @return exchangeRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.00121234", required = true, value = "BETH value per 1 WBETH")
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


  public SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner time(Long time) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner sapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner = (SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner) o;
    return Objects.equals(this.annualPercentageRate, sapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner.annualPercentageRate) &&
        Objects.equals(this.exchangeRate, sapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner.exchangeRate) &&
        Objects.equals(this.time, sapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annualPercentageRate, exchangeRate, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1EthStakingEthHistoryRateHistoryGet200ResponseRowsInner {\n");
    sb.append("    annualPercentageRate: ").append(toIndentedString(annualPercentageRate)).append("\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

