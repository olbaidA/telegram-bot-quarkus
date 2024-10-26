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
 * SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.JSON_PROPERTY_TIME,
  SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.JSON_PROPERTY_ARRIVAL_TIME,
  SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.JSON_PROPERTY_ASSET,
  SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.JSON_PROPERTY_AMOUNT,
  SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.JSON_PROPERTY_STATUS,
  SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.JSON_PROPERTY_DISTRIBUTE_ASSET,
  SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.JSON_PROPERTY_DISTRIBUTE_AMOUNT,
  SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.JSON_PROPERTY_CONVERSION_RATIO
})
@JsonTypeName("_sapi_v1_eth_staking_eth_history_redemptionHistory_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public static final String JSON_PROPERTY_ARRIVAL_TIME = "arrivalTime";
  private Long arrivalTime;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_DISTRIBUTE_ASSET = "distributeAsset";
  private String distributeAsset;

  public static final String JSON_PROPERTY_DISTRIBUTE_AMOUNT = "distributeAmount";
  private String distributeAmount;

  public static final String JSON_PROPERTY_CONVERSION_RATIO = "conversionRatio";
  private String conversionRatio;

  public SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner() {
  }

  public SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner time(Long time) {
    
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


  public SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner arrivalTime(Long arrivalTime) {
    
    this.arrivalTime = arrivalTime;
    return this;
  }

   /**
   * Get arrivalTime
   * @return arrivalTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1575018510000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getArrivalTime() {
    return arrivalTime;
  }


  @JsonProperty(JSON_PROPERTY_ARRIVAL_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setArrivalTime(Long arrivalTime) {
    this.arrivalTime = arrivalTime;
  }


  public SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BETH", required = true, value = "")
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


  public SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "21312.23223", required = true, value = "")
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


  public SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * PENDING, SUCCESS, FAILED
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SUCCESS", required = true, value = "PENDING, SUCCESS, FAILED")
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


  public SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner distributeAsset(String distributeAsset) {
    
    this.distributeAsset = distributeAsset;
    return this;
  }

   /**
   * Get distributeAsset
   * @return distributeAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ETH", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DISTRIBUTE_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDistributeAsset() {
    return distributeAsset;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTE_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistributeAsset(String distributeAsset) {
    this.distributeAsset = distributeAsset;
  }


  public SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner distributeAmount(String distributeAmount) {
    
    this.distributeAmount = distributeAmount;
    return this;
  }

   /**
   * Get distributeAmount
   * @return distributeAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "21338.0699", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DISTRIBUTE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDistributeAmount() {
    return distributeAmount;
  }


  @JsonProperty(JSON_PROPERTY_DISTRIBUTE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDistributeAmount(String distributeAmount) {
    this.distributeAmount = distributeAmount;
  }


  public SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner conversionRatio(String conversionRatio) {
    
    this.conversionRatio = conversionRatio;
    return this;
  }

   /**
   * Get conversionRatio
   * @return conversionRatio
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.00121234", required = true, value = "")
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
    SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner sapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner = (SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner) o;
    return Objects.equals(this.time, sapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.time) &&
        Objects.equals(this.arrivalTime, sapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.arrivalTime) &&
        Objects.equals(this.asset, sapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.asset) &&
        Objects.equals(this.amount, sapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.amount) &&
        Objects.equals(this.status, sapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.status) &&
        Objects.equals(this.distributeAsset, sapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.distributeAsset) &&
        Objects.equals(this.distributeAmount, sapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.distributeAmount) &&
        Objects.equals(this.conversionRatio, sapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner.conversionRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, arrivalTime, asset, amount, status, distributeAsset, distributeAmount, conversionRatio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1EthStakingEthHistoryRedemptionHistoryGet200ResponseRowsInner {\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    arrivalTime: ").append(toIndentedString(arrivalTime)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    distributeAsset: ").append(toIndentedString(distributeAsset)).append("\n");
    sb.append("    distributeAmount: ").append(toIndentedString(distributeAmount)).append("\n");
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

