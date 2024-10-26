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
import com.olbaid.binance.service.model.SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner
 */
@JsonPropertyOrder({
  SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.JSON_PROPERTY_OPERATE_TIME,
  SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.JSON_PROPERTY_TOTAL_TRANSFERED_AMOUNT,
  SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.JSON_PROPERTY_TOTAL_SERVICE_CHARGE_AMOUNT,
  SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.JSON_PROPERTY_TRANS_ID,
  SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.JSON_PROPERTY_USER_ASSET_DRIBBLET_DETAILS
})
@JsonTypeName("_sapi_v1_asset_dribblet_get_200_response_userAssetDribblets_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner {
  public static final String JSON_PROPERTY_OPERATE_TIME = "operateTime";
  private Long operateTime;

  public static final String JSON_PROPERTY_TOTAL_TRANSFERED_AMOUNT = "totalTransferedAmount";
  private String totalTransferedAmount;

  public static final String JSON_PROPERTY_TOTAL_SERVICE_CHARGE_AMOUNT = "totalServiceChargeAmount";
  private String totalServiceChargeAmount;

  public static final String JSON_PROPERTY_TRANS_ID = "transId";
  private Long transId;

  public static final String JSON_PROPERTY_USER_ASSET_DRIBBLET_DETAILS = "userAssetDribbletDetails";
  private List<SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner> userAssetDribbletDetails = new ArrayList<>();

  public SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner() {
  }

  public SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner operateTime(Long operateTime) {
    
    this.operateTime = operateTime;
    return this;
  }

   /**
   * Get operateTime
   * @return operateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1615985535000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPERATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getOperateTime() {
    return operateTime;
  }


  @JsonProperty(JSON_PROPERTY_OPERATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOperateTime(Long operateTime) {
    this.operateTime = operateTime;
  }


  public SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner totalTransferedAmount(String totalTransferedAmount) {
    
    this.totalTransferedAmount = totalTransferedAmount;
    return this;
  }

   /**
   * Total transfered BNB amount for this exchange.
   * @return totalTransferedAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00132256", required = true, value = "Total transfered BNB amount for this exchange.")
  @JsonProperty(JSON_PROPERTY_TOTAL_TRANSFERED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalTransferedAmount() {
    return totalTransferedAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TRANSFERED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalTransferedAmount(String totalTransferedAmount) {
    this.totalTransferedAmount = totalTransferedAmount;
  }


  public SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner totalServiceChargeAmount(String totalServiceChargeAmount) {
    
    this.totalServiceChargeAmount = totalServiceChargeAmount;
    return this;
  }

   /**
   * Total service charge amount for this exchange.
   * @return totalServiceChargeAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00002699", required = true, value = "Total service charge amount for this exchange.")
  @JsonProperty(JSON_PROPERTY_TOTAL_SERVICE_CHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalServiceChargeAmount() {
    return totalServiceChargeAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SERVICE_CHARGE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalServiceChargeAmount(String totalServiceChargeAmount) {
    this.totalServiceChargeAmount = totalServiceChargeAmount;
  }


  public SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner transId(Long transId) {
    
    this.transId = transId;
    return this;
  }

   /**
   * Get transId
   * @return transId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "45178372831", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTransId() {
    return transId;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransId(Long transId) {
    this.transId = transId;
  }


  public SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner userAssetDribbletDetails(List<SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner> userAssetDribbletDetails) {
    
    this.userAssetDribbletDetails = userAssetDribbletDetails;
    return this;
  }

  public SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner addUserAssetDribbletDetailsItem(SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner userAssetDribbletDetailsItem) {
    this.userAssetDribbletDetails.add(userAssetDribbletDetailsItem);
    return this;
  }

   /**
   * Get userAssetDribbletDetails
   * @return userAssetDribbletDetails
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_USER_ASSET_DRIBBLET_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner> getUserAssetDribbletDetails() {
    return userAssetDribbletDetails;
  }


  @JsonProperty(JSON_PROPERTY_USER_ASSET_DRIBBLET_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserAssetDribbletDetails(List<SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner> userAssetDribbletDetails) {
    this.userAssetDribbletDetails = userAssetDribbletDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner sapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner = (SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner) o;
    return Objects.equals(this.operateTime, sapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.operateTime) &&
        Objects.equals(this.totalTransferedAmount, sapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.totalTransferedAmount) &&
        Objects.equals(this.totalServiceChargeAmount, sapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.totalServiceChargeAmount) &&
        Objects.equals(this.transId, sapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.transId) &&
        Objects.equals(this.userAssetDribbletDetails, sapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner.userAssetDribbletDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operateTime, totalTransferedAmount, totalServiceChargeAmount, transId, userAssetDribbletDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AssetDribbletGet200ResponseUserAssetDribbletsInner {\n");
    sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
    sb.append("    totalTransferedAmount: ").append(toIndentedString(totalTransferedAmount)).append("\n");
    sb.append("    totalServiceChargeAmount: ").append(toIndentedString(totalServiceChargeAmount)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    userAssetDribbletDetails: ").append(toIndentedString(userAssetDribbletDetails)).append("\n");
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
