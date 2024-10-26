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
 * SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_COUNTER_PARTY,
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_EMAIL,
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_TYPE,
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_ASSET,
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_QTY,
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_FROM_ACCOUNT_TYPE,
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_TO_ACCOUNT_TYPE,
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_STATUS,
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_TRAN_ID,
  SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.JSON_PROPERTY_TIME
})
@JsonTypeName("_sapi_v1_sub_account_transfer_subUserHistory_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner {
  public static final String JSON_PROPERTY_COUNTER_PARTY = "counterParty";
  private String counterParty;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_TYPE = "type";
  private Integer type;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_QTY = "qty";
  private String qty;

  public static final String JSON_PROPERTY_FROM_ACCOUNT_TYPE = "fromAccountType";
  private String fromAccountType;

  public static final String JSON_PROPERTY_TO_ACCOUNT_TYPE = "toAccountType";
  private String toAccountType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TRAN_ID = "tranId";
  private Long tranId;

  public static final String JSON_PROPERTY_TIME = "time";
  private Long time;

  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner() {
  }

  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner counterParty(String counterParty) {
    
    this.counterParty = counterParty;
    return this;
  }

   /**
   * Get counterParty
   * @return counterParty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "master", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COUNTER_PARTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCounterParty() {
    return counterParty;
  }


  @JsonProperty(JSON_PROPERTY_COUNTER_PARTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCounterParty(String counterParty) {
    this.counterParty = counterParty;
  }


  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "master@test.com", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner type(Integer type) {
    
    this.type = type;
    return this;
  }

   /**
   * 1 for transfer in, 2 for transfer out
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "1 for transfer in, 2 for transfer out")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(Integer type) {
    this.type = type;
  }


  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner asset(String asset) {
    
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


  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner qty(String qty) {
    
    this.qty = qty;
    return this;
  }

   /**
   * Get qty
   * @return qty
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getQty() {
    return qty;
  }


  @JsonProperty(JSON_PROPERTY_QTY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQty(String qty) {
    this.qty = qty;
  }


  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner fromAccountType(String fromAccountType) {
    
    this.fromAccountType = fromAccountType;
    return this;
  }

   /**
   * Get fromAccountType
   * @return fromAccountType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SPOT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFromAccountType() {
    return fromAccountType;
  }


  @JsonProperty(JSON_PROPERTY_FROM_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFromAccountType(String fromAccountType) {
    this.fromAccountType = fromAccountType;
  }


  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner toAccountType(String toAccountType) {
    
    this.toAccountType = toAccountType;
    return this;
  }

   /**
   * Get toAccountType
   * @return toAccountType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SPOT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToAccountType() {
    return toAccountType;
  }


  @JsonProperty(JSON_PROPERTY_TO_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setToAccountType(String toAccountType) {
    this.toAccountType = toAccountType;
  }


  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner status(String status) {
    
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


  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner tranId(Long tranId) {
    
    this.tranId = tranId;
    return this;
  }

   /**
   * Get tranId
   * @return tranId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "11798835829", required = true, value = "")
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


  public SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner time(Long time) {
    
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1544433325000", required = true, value = "")
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
    SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner = (SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner) o;
    return Objects.equals(this.counterParty, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.counterParty) &&
        Objects.equals(this.email, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.email) &&
        Objects.equals(this.type, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.type) &&
        Objects.equals(this.asset, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.asset) &&
        Objects.equals(this.qty, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.qty) &&
        Objects.equals(this.fromAccountType, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.fromAccountType) &&
        Objects.equals(this.toAccountType, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.toAccountType) &&
        Objects.equals(this.status, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.status) &&
        Objects.equals(this.tranId, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.tranId) &&
        Objects.equals(this.time, sapiV1SubAccountTransferSubUserHistoryGet200ResponseInner.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counterParty, email, type, asset, qty, fromAccountType, toAccountType, status, tranId, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner {\n");
    sb.append("    counterParty: ").append(toIndentedString(counterParty)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    qty: ").append(toIndentedString(qty)).append("\n");
    sb.append("    fromAccountType: ").append(toIndentedString(fromAccountType)).append("\n");
    sb.append("    toAccountType: ").append(toIndentedString(toAccountType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tranId: ").append(toIndentedString(tranId)).append("\n");
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

