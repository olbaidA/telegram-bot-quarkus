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
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.JSON_PROPERTY_INDEX_ID,
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.JSON_PROPERTY_INDEX_NAME,
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.JSON_PROPERTY_REBALANCE_ID,
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.JSON_PROPERTY_STATUS,
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.JSON_PROPERTY_REBALANCE_FEE,
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.JSON_PROPERTY_REBALANCE_FEE_UNIT,
  SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.JSON_PROPERTY_TRANSACTION_DETAILS
})
@JsonTypeName("_sapi_v1_lending_auto_invest_rebalance_history_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner {
  public static final String JSON_PROPERTY_INDEX_ID = "indexId";
  private Long indexId;

  public static final String JSON_PROPERTY_INDEX_NAME = "indexName";
  private String indexName;

  public static final String JSON_PROPERTY_REBALANCE_ID = "rebalanceId";
  private Long rebalanceId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_REBALANCE_FEE = "rebalanceFee";
  private String rebalanceFee;

  public static final String JSON_PROPERTY_REBALANCE_FEE_UNIT = "rebalanceFeeUnit";
  private String rebalanceFeeUnit;

  public static final String JSON_PROPERTY_TRANSACTION_DETAILS = "transactionDetails";
  private List<SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner> transactionDetails = new ArrayList<>();

  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner() {
  }

  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner indexId(Long indexId) {
    
    this.indexId = indexId;
    return this;
  }

   /**
   * Get indexId
   * @return indexId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INDEX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getIndexId() {
    return indexId;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndexId(Long indexId) {
    this.indexId = indexId;
  }


  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner indexName(String indexName) {
    
    this.indexName = indexName;
    return this;
  }

   /**
   * Get indexName
   * @return indexName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BINANCE TOP 10 EW", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INDEX_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getIndexName() {
    return indexName;
  }


  @JsonProperty(JSON_PROPERTY_INDEX_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }


  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner rebalanceId(Long rebalanceId) {
    
    this.rebalanceId = rebalanceId;
    return this;
  }

   /**
   * Get rebalanceId
   * @return rebalanceId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "11", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REBALANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRebalanceId() {
    return rebalanceId;
  }


  @JsonProperty(JSON_PROPERTY_REBALANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRebalanceId(Long rebalanceId) {
    this.rebalanceId = rebalanceId;
  }


  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner status(String status) {
    
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


  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner rebalanceFee(String rebalanceFee) {
    
    this.rebalanceFee = rebalanceFee;
    return this;
  }

   /**
   * Get rebalanceFee
   * @return rebalanceFee
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REBALANCE_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRebalanceFee() {
    return rebalanceFee;
  }


  @JsonProperty(JSON_PROPERTY_REBALANCE_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRebalanceFee(String rebalanceFee) {
    this.rebalanceFee = rebalanceFee;
  }


  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner rebalanceFeeUnit(String rebalanceFeeUnit) {
    
    this.rebalanceFeeUnit = rebalanceFeeUnit;
    return this;
  }

   /**
   * Get rebalanceFeeUnit
   * @return rebalanceFeeUnit
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REBALANCE_FEE_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRebalanceFeeUnit() {
    return rebalanceFeeUnit;
  }


  @JsonProperty(JSON_PROPERTY_REBALANCE_FEE_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRebalanceFeeUnit(String rebalanceFeeUnit) {
    this.rebalanceFeeUnit = rebalanceFeeUnit;
  }


  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner transactionDetails(List<SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner> transactionDetails) {
    
    this.transactionDetails = transactionDetails;
    return this;
  }

  public SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner addTransactionDetailsItem(SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner transactionDetailsItem) {
    this.transactionDetails.add(transactionDetailsItem);
    return this;
  }

   /**
   * Get transactionDetails
   * @return transactionDetails
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner> getTransactionDetails() {
    return transactionDetails;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionDetails(List<SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInnerTransactionDetailsInner> transactionDetails) {
    this.transactionDetails = transactionDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner = (SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner) o;
    return Objects.equals(this.indexId, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.indexId) &&
        Objects.equals(this.indexName, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.indexName) &&
        Objects.equals(this.rebalanceId, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.rebalanceId) &&
        Objects.equals(this.status, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.status) &&
        Objects.equals(this.rebalanceFee, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.rebalanceFee) &&
        Objects.equals(this.rebalanceFeeUnit, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.rebalanceFeeUnit) &&
        Objects.equals(this.transactionDetails, sapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner.transactionDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexId, indexName, rebalanceId, status, rebalanceFee, rebalanceFeeUnit, transactionDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner {\n");
    sb.append("    indexId: ").append(toIndentedString(indexId)).append("\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    rebalanceId: ").append(toIndentedString(rebalanceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    rebalanceFee: ").append(toIndentedString(rebalanceFee)).append("\n");
    sb.append("    rebalanceFeeUnit: ").append(toIndentedString(rebalanceFeeUnit)).append("\n");
    sb.append("    transactionDetails: ").append(toIndentedString(transactionDetails)).append("\n");
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

