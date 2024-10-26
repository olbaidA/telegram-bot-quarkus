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
 * SapiV1AssetTransferGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1AssetTransferGet200ResponseRowsInner.JSON_PROPERTY_ASSET,
  SapiV1AssetTransferGet200ResponseRowsInner.JSON_PROPERTY_AMOUNT,
  SapiV1AssetTransferGet200ResponseRowsInner.JSON_PROPERTY_TYPE,
  SapiV1AssetTransferGet200ResponseRowsInner.JSON_PROPERTY_STATUS,
  SapiV1AssetTransferGet200ResponseRowsInner.JSON_PROPERTY_TRAN_ID,
  SapiV1AssetTransferGet200ResponseRowsInner.JSON_PROPERTY_TIMESTAMP
})
@JsonTypeName("_sapi_v1_asset_transfer_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AssetTransferGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TRAN_ID = "tranId";
  private Long tranId;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public SapiV1AssetTransferGet200ResponseRowsInner() {
  }

  public SapiV1AssetTransferGet200ResponseRowsInner asset(String asset) {
    
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


  public SapiV1AssetTransferGet200ResponseRowsInner amount(String amount) {
    
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


  public SapiV1AssetTransferGet200ResponseRowsInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "MAIN_UMFUTUR", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public SapiV1AssetTransferGet200ResponseRowsInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "CONFIRMED", required = true, value = "")
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


  public SapiV1AssetTransferGet200ResponseRowsInner tranId(Long tranId) {
    
    this.tranId = tranId;
    return this;
  }

   /**
   * Get tranId
   * @return tranId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "11415955596", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTranId() {
    return tranId;
  }


  @JsonProperty(JSON_PROPERTY_TRAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTranId(Long tranId) {
    this.tranId = tranId;
  }


  public SapiV1AssetTransferGet200ResponseRowsInner timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1544433328000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1AssetTransferGet200ResponseRowsInner sapiV1AssetTransferGet200ResponseRowsInner = (SapiV1AssetTransferGet200ResponseRowsInner) o;
    return Objects.equals(this.asset, sapiV1AssetTransferGet200ResponseRowsInner.asset) &&
        Objects.equals(this.amount, sapiV1AssetTransferGet200ResponseRowsInner.amount) &&
        Objects.equals(this.type, sapiV1AssetTransferGet200ResponseRowsInner.type) &&
        Objects.equals(this.status, sapiV1AssetTransferGet200ResponseRowsInner.status) &&
        Objects.equals(this.tranId, sapiV1AssetTransferGet200ResponseRowsInner.tranId) &&
        Objects.equals(this.timestamp, sapiV1AssetTransferGet200ResponseRowsInner.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, amount, type, status, tranId, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AssetTransferGet200ResponseRowsInner {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tranId: ").append(toIndentedString(tranId)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

