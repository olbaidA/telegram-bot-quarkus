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
 * SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.JSON_PROPERTY_AMOUNT,
  SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.JSON_PROPERTY_ASSET,
  SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.JSON_PROPERTY_TIME,
  SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.JSON_PROPERTY_PROJECT_ID,
  SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.JSON_PROPERTY_REDEEM_ID,
  SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.JSON_PROPERTY_DEST_ACCOUNT,
  SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.JSON_PROPERTY_STATUS
})
@JsonTypeName("_sapi_v1_simple_earn_flexible_history_redemptionRecord_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public static final String JSON_PROPERTY_PROJECT_ID = "projectId";
  private String projectId;

  public static final String JSON_PROPERTY_REDEEM_ID = "redeemId";
  private Long redeemId;

  public static final String JSON_PROPERTY_DEST_ACCOUNT = "destAccount";
  private String destAccount;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner() {
  }

  public SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10.54000000", required = true, value = "")
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


  public SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "")
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


  public SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1577257222000", required = true, value = "")
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


  public SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "USDT001", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getProjectId() {
    return projectId;
  }


  @JsonProperty(JSON_PROPERTY_PROJECT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner redeemId(Long redeemId) {
    
    this.redeemId = redeemId;
    return this;
  }

   /**
   * Get redeemId
   * @return redeemId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "40607", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REDEEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRedeemId() {
    return redeemId;
  }


  @JsonProperty(JSON_PROPERTY_REDEEM_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedeemId(Long redeemId) {
    this.redeemId = redeemId;
  }


  public SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner destAccount(String destAccount) {
    
    this.destAccount = destAccount;
    return this;
  }

   /**
   * SPOT, FUNDING
   * @return destAccount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SPOT", required = true, value = "SPOT, FUNDING")
  @JsonProperty(JSON_PROPERTY_DEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDestAccount() {
    return destAccount;
  }


  @JsonProperty(JSON_PROPERTY_DEST_ACCOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDestAccount(String destAccount) {
    this.destAccount = destAccount;
  }


  public SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "PAID", required = true, value = "")
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
    SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner sapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner = (SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner) o;
    return Objects.equals(this.amount, sapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.amount) &&
        Objects.equals(this.asset, sapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.asset) &&
        Objects.equals(this.time, sapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.time) &&
        Objects.equals(this.projectId, sapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.projectId) &&
        Objects.equals(this.redeemId, sapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.redeemId) &&
        Objects.equals(this.destAccount, sapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.destAccount) &&
        Objects.equals(this.status, sapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, asset, time, projectId, redeemId, destAccount, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200ResponseRowsInner {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    redeemId: ").append(toIndentedString(redeemId)).append("\n");
    sb.append("    destAccount: ").append(toIndentedString(destAccount)).append("\n");
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

