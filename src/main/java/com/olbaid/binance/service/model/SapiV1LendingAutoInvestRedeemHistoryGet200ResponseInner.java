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
 * SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.JSON_PROPERTY_INDEX_ID,
  SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.JSON_PROPERTY_INDEX_NAME,
  SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.JSON_PROPERTY_REDEMPTION_ID,
  SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.JSON_PROPERTY_STATUS,
  SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.JSON_PROPERTY_ASSET,
  SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.JSON_PROPERTY_AMOUNT,
  SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.JSON_PROPERTY_REDEMPTION_DATE_TIME,
  SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.JSON_PROPERTY_TRANSACTION_FEE,
  SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.JSON_PROPERTY_TRANSACTION_FEE_UNIT
})
@JsonTypeName("_sapi_v1_lending_auto_invest_redeem_history_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner {
  public static final String JSON_PROPERTY_INDEX_ID = "indexId";
  private Long indexId;

  public static final String JSON_PROPERTY_INDEX_NAME = "indexName";
  private String indexName;

  public static final String JSON_PROPERTY_REDEMPTION_ID = "redemptionId";
  private Long redemptionId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_REDEMPTION_DATE_TIME = "redemptionDateTime";
  private Long redemptionDateTime;

  public static final String JSON_PROPERTY_TRANSACTION_FEE = "transactionFee";
  private String transactionFee;

  public static final String JSON_PROPERTY_TRANSACTION_FEE_UNIT = "transactionFeeUnit";
  private String transactionFeeUnit;

  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner() {
  }

  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner indexId(Long indexId) {
    
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


  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner indexName(String indexName) {
    
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


  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner redemptionId(Long redemptionId) {
    
    this.redemptionId = redemptionId;
    return this;
  }

   /**
   * Get redemptionId
   * @return redemptionId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "11", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REDEMPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRedemptionId() {
    return redemptionId;
  }


  @JsonProperty(JSON_PROPERTY_REDEMPTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedemptionId(Long redemptionId) {
    this.redemptionId = redemptionId;
  }


  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner status(String status) {
    
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


  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner asset(String asset) {
    
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


  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.005", required = true, value = "")
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


  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner redemptionDateTime(Long redemptionDateTime) {
    
    this.redemptionDateTime = redemptionDateTime;
    return this;
  }

   /**
   * Get redemptionDateTime
   * @return redemptionDateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1648378800000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REDEMPTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRedemptionDateTime() {
    return redemptionDateTime;
  }


  @JsonProperty(JSON_PROPERTY_REDEMPTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedemptionDateTime(Long redemptionDateTime) {
    this.redemptionDateTime = redemptionDateTime;
  }


  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner transactionFee(String transactionFee) {
    
    this.transactionFee = transactionFee;
    return this;
  }

   /**
   * Get transactionFee
   * @return transactionFee
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransactionFee() {
    return transactionFee;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionFee(String transactionFee) {
    this.transactionFee = transactionFee;
  }


  public SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner transactionFeeUnit(String transactionFeeUnit) {
    
    this.transactionFeeUnit = transactionFeeUnit;
    return this;
  }

   /**
   * Get transactionFeeUnit
   * @return transactionFeeUnit
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_FEE_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransactionFeeUnit() {
    return transactionFeeUnit;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_FEE_UNIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionFeeUnit(String transactionFeeUnit) {
    this.transactionFeeUnit = transactionFeeUnit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner = (SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner) o;
    return Objects.equals(this.indexId, sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.indexId) &&
        Objects.equals(this.indexName, sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.indexName) &&
        Objects.equals(this.redemptionId, sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.redemptionId) &&
        Objects.equals(this.status, sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.status) &&
        Objects.equals(this.asset, sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.asset) &&
        Objects.equals(this.amount, sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.amount) &&
        Objects.equals(this.redemptionDateTime, sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.redemptionDateTime) &&
        Objects.equals(this.transactionFee, sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.transactionFee) &&
        Objects.equals(this.transactionFeeUnit, sapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner.transactionFeeUnit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(indexId, indexName, redemptionId, status, asset, amount, redemptionDateTime, transactionFee, transactionFeeUnit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner {\n");
    sb.append("    indexId: ").append(toIndentedString(indexId)).append("\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    redemptionId: ").append(toIndentedString(redemptionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    redemptionDateTime: ").append(toIndentedString(redemptionDateTime)).append("\n");
    sb.append("    transactionFee: ").append(toIndentedString(transactionFee)).append("\n");
    sb.append("    transactionFeeUnit: ").append(toIndentedString(transactionFeeUnit)).append("\n");
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
