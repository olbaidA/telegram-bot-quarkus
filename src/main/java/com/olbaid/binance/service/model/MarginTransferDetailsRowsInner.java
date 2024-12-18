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
 * MarginTransferDetailsRowsInner
 */
@JsonPropertyOrder({
  MarginTransferDetailsRowsInner.JSON_PROPERTY_AMOUNT,
  MarginTransferDetailsRowsInner.JSON_PROPERTY_ASSET,
  MarginTransferDetailsRowsInner.JSON_PROPERTY_STATUS,
  MarginTransferDetailsRowsInner.JSON_PROPERTY_TIMESTAMP,
  MarginTransferDetailsRowsInner.JSON_PROPERTY_TX_ID,
  MarginTransferDetailsRowsInner.JSON_PROPERTY_TYPE,
  MarginTransferDetailsRowsInner.JSON_PROPERTY_TRANS_FROM,
  MarginTransferDetailsRowsInner.JSON_PROPERTY_TRANS_TO
})
@JsonTypeName("marginTransferDetails_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarginTransferDetailsRowsInner {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_TX_ID = "txId";
  private Long txId;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_TRANS_FROM = "transFrom";
  private String transFrom;

  public static final String JSON_PROPERTY_TRANS_TO = "transTo";
  private String transTo;

  public MarginTransferDetailsRowsInner() {
  }

  public MarginTransferDetailsRowsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.10000000", required = true, value = "")
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


  public MarginTransferDetailsRowsInner asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
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


  public MarginTransferDetailsRowsInner status(String status) {
    
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


  public MarginTransferDetailsRowsInner timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1566898617000", required = true, value = "")
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


  public MarginTransferDetailsRowsInner txId(Long txId) {
    
    this.txId = txId;
    return this;
  }

   /**
   * Get txId
   * @return txId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "5240372201", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTxId() {
    return txId;
  }


  @JsonProperty(JSON_PROPERTY_TX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTxId(Long txId) {
    this.txId = txId;
  }


  public MarginTransferDetailsRowsInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "ROLL_IN", value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(String type) {
    this.type = type;
  }


  public MarginTransferDetailsRowsInner transFrom(String transFrom) {
    
    this.transFrom = transFrom;
    return this;
  }

   /**
   * Get transFrom
   * @return transFrom
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SPOT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransFrom() {
    return transFrom;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransFrom(String transFrom) {
    this.transFrom = transFrom;
  }


  public MarginTransferDetailsRowsInner transTo(String transTo) {
    
    this.transTo = transTo;
    return this;
  }

   /**
   * Get transTo
   * @return transTo
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ISOLATED_MARGIN", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANS_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTransTo() {
    return transTo;
  }


  @JsonProperty(JSON_PROPERTY_TRANS_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransTo(String transTo) {
    this.transTo = transTo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarginTransferDetailsRowsInner marginTransferDetailsRowsInner = (MarginTransferDetailsRowsInner) o;
    return Objects.equals(this.amount, marginTransferDetailsRowsInner.amount) &&
        Objects.equals(this.asset, marginTransferDetailsRowsInner.asset) &&
        Objects.equals(this.status, marginTransferDetailsRowsInner.status) &&
        Objects.equals(this.timestamp, marginTransferDetailsRowsInner.timestamp) &&
        Objects.equals(this.txId, marginTransferDetailsRowsInner.txId) &&
        Objects.equals(this.type, marginTransferDetailsRowsInner.type) &&
        Objects.equals(this.transFrom, marginTransferDetailsRowsInner.transFrom) &&
        Objects.equals(this.transTo, marginTransferDetailsRowsInner.transTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, asset, status, timestamp, txId, type, transFrom, transTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarginTransferDetailsRowsInner {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    transFrom: ").append(toIndentedString(transFrom)).append("\n");
    sb.append("    transTo: ").append(toIndentedString(transTo)).append("\n");
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

