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
 * SapiV1DciProductAccountsGet200Response
 */
@JsonPropertyOrder({
  SapiV1DciProductAccountsGet200Response.JSON_PROPERTY_TOTAL_AMOUNT_IN_B_T_C,
  SapiV1DciProductAccountsGet200Response.JSON_PROPERTY_TOTAL_AMOUNT_IN_U_S_D_T
})
@JsonTypeName("_sapi_v1_dci_product_accounts_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1DciProductAccountsGet200Response {
  public static final String JSON_PROPERTY_TOTAL_AMOUNT_IN_B_T_C = "totalAmountInBTC";
  private String totalAmountInBTC;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_IN_U_S_D_T = "totalAmountInUSDT";
  private String totalAmountInUSDT;

  public SapiV1DciProductAccountsGet200Response() {
  }

  public SapiV1DciProductAccountsGet200Response totalAmountInBTC(String totalAmountInBTC) {
    
    this.totalAmountInBTC = totalAmountInBTC;
    return this;
  }

   /**
   * Total BTC amounts in Dual Investment
   * @return totalAmountInBTC
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.01067982", required = true, value = "Total BTC amounts in Dual Investment")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_IN_B_T_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalAmountInBTC() {
    return totalAmountInBTC;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_IN_B_T_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAmountInBTC(String totalAmountInBTC) {
    this.totalAmountInBTC = totalAmountInBTC;
  }


  public SapiV1DciProductAccountsGet200Response totalAmountInUSDT(String totalAmountInUSDT) {
    
    this.totalAmountInUSDT = totalAmountInUSDT;
    return this;
  }

   /**
   * Total USDT equivalents in BTC in Dual Investment
   * @return totalAmountInUSDT
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "77.13289230", required = true, value = "Total USDT equivalents in BTC in Dual Investment")
  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_IN_U_S_D_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalAmountInUSDT() {
    return totalAmountInUSDT;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_AMOUNT_IN_U_S_D_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalAmountInUSDT(String totalAmountInUSDT) {
    this.totalAmountInUSDT = totalAmountInUSDT;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1DciProductAccountsGet200Response sapiV1DciProductAccountsGet200Response = (SapiV1DciProductAccountsGet200Response) o;
    return Objects.equals(this.totalAmountInBTC, sapiV1DciProductAccountsGet200Response.totalAmountInBTC) &&
        Objects.equals(this.totalAmountInUSDT, sapiV1DciProductAccountsGet200Response.totalAmountInUSDT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmountInBTC, totalAmountInUSDT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1DciProductAccountsGet200Response {\n");
    sb.append("    totalAmountInBTC: ").append(toIndentedString(totalAmountInBTC)).append("\n");
    sb.append("    totalAmountInUSDT: ").append(toIndentedString(totalAmountInUSDT)).append("\n");
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
