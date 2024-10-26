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
 * SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.JSON_PROPERTY_CLIENT_TRAN_ID,
  SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.JSON_PROPERTY_TRANSFER_TYPE,
  SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.JSON_PROPERTY_ASSET,
  SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.JSON_PROPERTY_AMOUNT,
  SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.JSON_PROPERTY_TIME
})
@JsonTypeName("_sapi_v1_asset_custody_transfer_history_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_CLIENT_TRAN_ID = "clientTranId";
  private String clientTranId;

  public static final String JSON_PROPERTY_TRANSFER_TYPE = "transferType";
  private String transferType;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner() {
  }

  public SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner clientTranId(String clientTranId) {
    
    this.clientTranId = clientTranId;
    return this;
  }

   /**
   * Get clientTranId
   * @return clientTranId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "293915932290879488", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLIENT_TRAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientTranId() {
    return clientTranId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_TRAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientTranId(String clientTranId) {
    this.clientTranId = clientTranId;
  }


  public SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner transferType(String transferType) {
    
    this.transferType = transferType;
    return this;
  }

   /**
   * Get transferType
   * @return transferType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Undelegate", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSFER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransferType() {
    return transferType;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransferType(String transferType) {
    this.transferType = transferType;
  }


  public SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner asset(String asset) {
    
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


  public SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
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


  public SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1695205406000", required = true, value = "")
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
    SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner sapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner = (SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner) o;
    return Objects.equals(this.clientTranId, sapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.clientTranId) &&
        Objects.equals(this.transferType, sapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.transferType) &&
        Objects.equals(this.asset, sapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.asset) &&
        Objects.equals(this.amount, sapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.amount) &&
        Objects.equals(this.time, sapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientTranId, transferType, asset, amount, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AssetCustodyTransferHistoryGet200ResponseRowsInner {\n");
    sb.append("    clientTranId: ").append(toIndentedString(clientTranId)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

