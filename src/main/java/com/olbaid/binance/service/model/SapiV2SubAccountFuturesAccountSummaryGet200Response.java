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
import com.olbaid.binance.service.model.SubAccountCOINFuturesSummary;
import com.olbaid.binance.service.model.SubAccountCOINFuturesSummaryDeliveryAccountSummaryResp;
import com.olbaid.binance.service.model.SubAccountUSDTFuturesSummary;
import com.olbaid.binance.service.model.SubAccountUSDTFuturesSummaryFutureAccountSummaryResp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV2SubAccountFuturesAccountSummaryGet200Response
 */
@JsonPropertyOrder({
  SapiV2SubAccountFuturesAccountSummaryGet200Response.JSON_PROPERTY_FUTURE_ACCOUNT_SUMMARY_RESP,
  SapiV2SubAccountFuturesAccountSummaryGet200Response.JSON_PROPERTY_DELIVERY_ACCOUNT_SUMMARY_RESP
})
@JsonTypeName("_sapi_v2_sub_account_futures_accountSummary_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV2SubAccountFuturesAccountSummaryGet200Response {
  public static final String JSON_PROPERTY_FUTURE_ACCOUNT_SUMMARY_RESP = "futureAccountSummaryResp";
  private SubAccountUSDTFuturesSummaryFutureAccountSummaryResp futureAccountSummaryResp;

  public static final String JSON_PROPERTY_DELIVERY_ACCOUNT_SUMMARY_RESP = "deliveryAccountSummaryResp";
  private SubAccountCOINFuturesSummaryDeliveryAccountSummaryResp deliveryAccountSummaryResp;

  public SapiV2SubAccountFuturesAccountSummaryGet200Response() {
  }

  public SapiV2SubAccountFuturesAccountSummaryGet200Response futureAccountSummaryResp(SubAccountUSDTFuturesSummaryFutureAccountSummaryResp futureAccountSummaryResp) {
    
    this.futureAccountSummaryResp = futureAccountSummaryResp;
    return this;
  }

   /**
   * Get futureAccountSummaryResp
   * @return futureAccountSummaryResp
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FUTURE_ACCOUNT_SUMMARY_RESP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubAccountUSDTFuturesSummaryFutureAccountSummaryResp getFutureAccountSummaryResp() {
    return futureAccountSummaryResp;
  }


  @JsonProperty(JSON_PROPERTY_FUTURE_ACCOUNT_SUMMARY_RESP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFutureAccountSummaryResp(SubAccountUSDTFuturesSummaryFutureAccountSummaryResp futureAccountSummaryResp) {
    this.futureAccountSummaryResp = futureAccountSummaryResp;
  }


  public SapiV2SubAccountFuturesAccountSummaryGet200Response deliveryAccountSummaryResp(SubAccountCOINFuturesSummaryDeliveryAccountSummaryResp deliveryAccountSummaryResp) {
    
    this.deliveryAccountSummaryResp = deliveryAccountSummaryResp;
    return this;
  }

   /**
   * Get deliveryAccountSummaryResp
   * @return deliveryAccountSummaryResp
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_ACCOUNT_SUMMARY_RESP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SubAccountCOINFuturesSummaryDeliveryAccountSummaryResp getDeliveryAccountSummaryResp() {
    return deliveryAccountSummaryResp;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_ACCOUNT_SUMMARY_RESP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeliveryAccountSummaryResp(SubAccountCOINFuturesSummaryDeliveryAccountSummaryResp deliveryAccountSummaryResp) {
    this.deliveryAccountSummaryResp = deliveryAccountSummaryResp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV2SubAccountFuturesAccountSummaryGet200Response sapiV2SubAccountFuturesAccountSummaryGet200Response = (SapiV2SubAccountFuturesAccountSummaryGet200Response) o;
    return Objects.equals(this.futureAccountSummaryResp, sapiV2SubAccountFuturesAccountSummaryGet200Response.futureAccountSummaryResp) &&
        Objects.equals(this.deliveryAccountSummaryResp, sapiV2SubAccountFuturesAccountSummaryGet200Response.deliveryAccountSummaryResp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(futureAccountSummaryResp, deliveryAccountSummaryResp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV2SubAccountFuturesAccountSummaryGet200Response {\n");
    sb.append("    futureAccountSummaryResp: ").append(toIndentedString(futureAccountSummaryResp)).append("\n");
    sb.append("    deliveryAccountSummaryResp: ").append(toIndentedString(deliveryAccountSummaryResp)).append("\n");
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

