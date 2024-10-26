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
 * SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner
 */
@JsonPropertyOrder({
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner.JSON_PROPERTY_ASSET,
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner.JSON_PROPERTY_TRANSACTION_DATE_TIME,
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner.JSON_PROPERTY_REBALANCE_DIRECTION,
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner.JSON_PROPERTY_REBALANCE_AMOUNT
})
@JsonTypeName("_sapi_v1_lending_auto_invest_rebalance_history_get_200_response_inner_transactionDetails_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_TRANSACTION_DATE_TIME = "transactionDateTime";
  private Long transactionDateTime;

  public static final String JSON_PROPERTY_REBALANCE_DIRECTION = "rebalanceDirection";
  private String rebalanceDirection;

  public static final String JSON_PROPERTY_REBALANCE_AMOUNT = "rebalanceAmount";
  private String rebalanceAmount;

  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner() {
  }

  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "")
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


  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner transactionDateTime(Long transactionDateTime) {
    
    this.transactionDateTime = transactionDateTime;
    return this;
  }

   /**
   * Get transactionDateTime
   * @return transactionDateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1648378800000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTransactionDateTime() {
    return transactionDateTime;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionDateTime(Long transactionDateTime) {
    this.transactionDateTime = transactionDateTime;
  }


  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner rebalanceDirection(String rebalanceDirection) {
    
    this.rebalanceDirection = rebalanceDirection;
    return this;
  }

   /**
   * Get rebalanceDirection
   * @return rebalanceDirection
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BUY", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REBALANCE_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRebalanceDirection() {
    return rebalanceDirection;
  }


  @JsonProperty(JSON_PROPERTY_REBALANCE_DIRECTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRebalanceDirection(String rebalanceDirection) {
    this.rebalanceDirection = rebalanceDirection;
  }


  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner rebalanceAmount(String rebalanceAmount) {
    
    this.rebalanceAmount = rebalanceAmount;
    return this;
  }

   /**
   * Get rebalanceAmount
   * @return rebalanceAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.005", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REBALANCE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRebalanceAmount() {
    return rebalanceAmount;
  }


  @JsonProperty(JSON_PROPERTY_REBALANCE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRebalanceAmount(String rebalanceAmount) {
    this.rebalanceAmount = rebalanceAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner = (SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner) o;
    return Objects.equals(this.asset, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner.asset) &&
        Objects.equals(this.transactionDateTime, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner.transactionDateTime) &&
        Objects.equals(this.rebalanceDirection, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner.rebalanceDirection) &&
        Objects.equals(this.rebalanceAmount, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner.rebalanceAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, transactionDateTime, rebalanceDirection, rebalanceAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    transactionDateTime: ").append(toIndentedString(transactionDateTime)).append("\n");
    sb.append("    rebalanceDirection: ").append(toIndentedString(rebalanceDirection)).append("\n");
    sb.append("    rebalanceAmount: ").append(toIndentedString(rebalanceAmount)).append("\n");
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

