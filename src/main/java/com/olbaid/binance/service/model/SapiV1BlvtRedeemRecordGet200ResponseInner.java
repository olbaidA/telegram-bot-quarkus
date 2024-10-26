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
 * SapiV1BlvtRedeemRecordGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1BlvtRedeemRecordGet200ResponseInner.JSON_PROPERTY_ID,
  SapiV1BlvtRedeemRecordGet200ResponseInner.JSON_PROPERTY_TOKEN_NAME,
  SapiV1BlvtRedeemRecordGet200ResponseInner.JSON_PROPERTY_AMOUNT,
  SapiV1BlvtRedeemRecordGet200ResponseInner.JSON_PROPERTY_NAV,
  SapiV1BlvtRedeemRecordGet200ResponseInner.JSON_PROPERTY_FEE,
  SapiV1BlvtRedeemRecordGet200ResponseInner.JSON_PROPERTY_NET_PROCEED,
  SapiV1BlvtRedeemRecordGet200ResponseInner.JSON_PROPERTY_TIMESTAMP
})
@JsonTypeName("_sapi_v1_blvt_redeem_record_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1BlvtRedeemRecordGet200ResponseInner {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_TOKEN_NAME = "tokenName";
  private String tokenName;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_NAV = "nav";
  private String nav;

  public static final String JSON_PROPERTY_FEE = "fee";
  private String fee;

  public static final String JSON_PROPERTY_NET_PROCEED = "netProceed";
  private String netProceed;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public SapiV1BlvtRedeemRecordGet200ResponseInner() {
  }

  public SapiV1BlvtRedeemRecordGet200ResponseInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(Long id) {
    this.id = id;
  }


  public SapiV1BlvtRedeemRecordGet200ResponseInner tokenName(String tokenName) {
    
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Get tokenName
   * @return tokenName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "LINKUP", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenName() {
    return tokenName;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }


  public SapiV1BlvtRedeemRecordGet200ResponseInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Redemption amount
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.54216292", required = true, value = "Redemption amount")
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


  public SapiV1BlvtRedeemRecordGet200ResponseInner nav(String nav) {
    
    this.nav = nav;
    return this;
  }

   /**
   * NAV of redemption
   * @return nav
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "18.36345064", required = true, value = "NAV of redemption")
  @JsonProperty(JSON_PROPERTY_NAV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNav() {
    return nav;
  }


  @JsonProperty(JSON_PROPERTY_NAV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNav(String nav) {
    this.nav = nav;
  }


  public SapiV1BlvtRedeemRecordGet200ResponseInner fee(String fee) {
    
    this.fee = fee;
    return this;
  }

   /**
   * Reemption fee
   * @return fee
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00995598", required = true, value = "Reemption fee")
  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFee() {
    return fee;
  }


  @JsonProperty(JSON_PROPERTY_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFee(String fee) {
    this.fee = fee;
  }


  public SapiV1BlvtRedeemRecordGet200ResponseInner netProceed(String netProceed) {
    
    this.netProceed = netProceed;
    return this;
  }

   /**
   * Net redemption value in usdt
   * @return netProceed
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "9.94602604", required = true, value = "Net redemption value in usdt")
  @JsonProperty(JSON_PROPERTY_NET_PROCEED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNetProceed() {
    return netProceed;
  }


  @JsonProperty(JSON_PROPERTY_NET_PROCEED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetProceed(String netProceed) {
    this.netProceed = netProceed;
  }


  public SapiV1BlvtRedeemRecordGet200ResponseInner timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1599128003050", required = true, value = "")
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
    SapiV1BlvtRedeemRecordGet200ResponseInner sapiV1BlvtRedeemRecordGet200ResponseInner = (SapiV1BlvtRedeemRecordGet200ResponseInner) o;
    return Objects.equals(this.id, sapiV1BlvtRedeemRecordGet200ResponseInner.id) &&
        Objects.equals(this.tokenName, sapiV1BlvtRedeemRecordGet200ResponseInner.tokenName) &&
        Objects.equals(this.amount, sapiV1BlvtRedeemRecordGet200ResponseInner.amount) &&
        Objects.equals(this.nav, sapiV1BlvtRedeemRecordGet200ResponseInner.nav) &&
        Objects.equals(this.fee, sapiV1BlvtRedeemRecordGet200ResponseInner.fee) &&
        Objects.equals(this.netProceed, sapiV1BlvtRedeemRecordGet200ResponseInner.netProceed) &&
        Objects.equals(this.timestamp, sapiV1BlvtRedeemRecordGet200ResponseInner.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tokenName, amount, nav, fee, netProceed, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1BlvtRedeemRecordGet200ResponseInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    netProceed: ").append(toIndentedString(netProceed)).append("\n");
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

