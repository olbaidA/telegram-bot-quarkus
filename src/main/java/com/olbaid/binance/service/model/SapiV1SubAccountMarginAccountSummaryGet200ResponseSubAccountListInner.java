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
 * SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner
 */
@JsonPropertyOrder({
  SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner.JSON_PROPERTY_EMAIL,
  SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner.JSON_PROPERTY_TOTAL_ASSET_OF_BTC,
  SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner.JSON_PROPERTY_TOTAL_LIABILITY_OF_BTC,
  SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner.JSON_PROPERTY_TOTAL_NET_ASSET_OF_BTC
})
@JsonTypeName("_sapi_v1_sub_account_margin_accountSummary_get_200_response_subAccountList_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_TOTAL_ASSET_OF_BTC = "totalAssetOfBtc";
  private String totalAssetOfBtc;

  public static final String JSON_PROPERTY_TOTAL_LIABILITY_OF_BTC = "totalLiabilityOfBtc";
  private String totalLiabilityOfBtc;

  public static final String JSON_PROPERTY_TOTAL_NET_ASSET_OF_BTC = "totalNetAssetOfBtc";
  private String totalNetAssetOfBtc;

  public SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner() {
  }

  public SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "123@test.com", required = true, value = "")
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


  public SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner totalAssetOfBtc(String totalAssetOfBtc) {
    
    this.totalAssetOfBtc = totalAssetOfBtc;
    return this;
  }

   /**
   * Get totalAssetOfBtc
   * @return totalAssetOfBtc
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2.11111111", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_ASSET_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalAssetOfBtc() {
    return totalAssetOfBtc;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ASSET_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAssetOfBtc(String totalAssetOfBtc) {
    this.totalAssetOfBtc = totalAssetOfBtc;
  }


  public SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner totalLiabilityOfBtc(String totalLiabilityOfBtc) {
    
    this.totalLiabilityOfBtc = totalLiabilityOfBtc;
    return this;
  }

   /**
   * Get totalLiabilityOfBtc
   * @return totalLiabilityOfBtc
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.11111111", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_LIABILITY_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalLiabilityOfBtc() {
    return totalLiabilityOfBtc;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_LIABILITY_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalLiabilityOfBtc(String totalLiabilityOfBtc) {
    this.totalLiabilityOfBtc = totalLiabilityOfBtc;
  }


  public SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner totalNetAssetOfBtc(String totalNetAssetOfBtc) {
    
    this.totalNetAssetOfBtc = totalNetAssetOfBtc;
    return this;
  }

   /**
   * Get totalNetAssetOfBtc
   * @return totalNetAssetOfBtc
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.00000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_NET_ASSET_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalNetAssetOfBtc() {
    return totalNetAssetOfBtc;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NET_ASSET_OF_BTC)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalNetAssetOfBtc(String totalNetAssetOfBtc) {
    this.totalNetAssetOfBtc = totalNetAssetOfBtc;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner sapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner = (SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner) o;
    return Objects.equals(this.email, sapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner.email) &&
        Objects.equals(this.totalAssetOfBtc, sapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner.totalAssetOfBtc) &&
        Objects.equals(this.totalLiabilityOfBtc, sapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner.totalLiabilityOfBtc) &&
        Objects.equals(this.totalNetAssetOfBtc, sapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner.totalNetAssetOfBtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, totalAssetOfBtc, totalLiabilityOfBtc, totalNetAssetOfBtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SubAccountMarginAccountSummaryGet200ResponseSubAccountListInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    totalAssetOfBtc: ").append(toIndentedString(totalAssetOfBtc)).append("\n");
    sb.append("    totalLiabilityOfBtc: ").append(toIndentedString(totalLiabilityOfBtc)).append("\n");
    sb.append("    totalNetAssetOfBtc: ").append(toIndentedString(totalNetAssetOfBtc)).append("\n");
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
