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
 * SapiV1SimpleEarnAccountGet200Response
 */
@JsonPropertyOrder({
  SapiV1SimpleEarnAccountGet200Response.JSON_PROPERTY_TOTAL_AMOUNT_IN_B_T_C,
  SapiV1SimpleEarnAccountGet200Response.JSON_PROPERTY_TOTAL_AMOUNT_IN_U_S_D_T,
  SapiV1SimpleEarnAccountGet200Response.JSON_PROPERTY_TOTAL_FLEXIBLE_AMOUNT_IN_B_T_C,
  SapiV1SimpleEarnAccountGet200Response.JSON_PROPERTY_TOTAL_FLEXIBLE_AMOUNT_IN_U_S_D_T,
  SapiV1SimpleEarnAccountGet200Response.JSON_PROPERTY_TOTAL_LOCKED_IN_B_T_C,
  SapiV1SimpleEarnAccountGet200Response.JSON_PROPERTY_TOTAL_LOCKED_IN_U_S_D_T
})
@JsonTypeName("_sapi_v1_simple_earn_account_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SimpleEarnAccountGet200Response {
  public static final String JSON_PROPERTY_TOTAL_AMOUNT_IN_B_T_C = "totalAmountInBTC";
  private String totalAmountInBTC;

  public static final String JSON_PROPERTY_TOTAL_AMOUNT_IN_U_S_D_T = "totalAmountInUSDT";
  private String totalAmountInUSDT;

  public static final String JSON_PROPERTY_TOTAL_FLEXIBLE_AMOUNT_IN_B_T_C = "totalFlexibleAmountInBTC";
  private String totalFlexibleAmountInBTC;

  public static final String JSON_PROPERTY_TOTAL_FLEXIBLE_AMOUNT_IN_U_S_D_T = "totalFlexibleAmountInUSDT";
  private String totalFlexibleAmountInUSDT;

  public static final String JSON_PROPERTY_TOTAL_LOCKED_IN_B_T_C = "totalLockedInBTC";
  private String totalLockedInBTC;

  public static final String JSON_PROPERTY_TOTAL_LOCKED_IN_U_S_D_T = "totalLockedInUSDT";
  private String totalLockedInUSDT;

  public SapiV1SimpleEarnAccountGet200Response() {
  }

  public SapiV1SimpleEarnAccountGet200Response totalAmountInBTC(String totalAmountInBTC) {
    
    this.totalAmountInBTC = totalAmountInBTC;
    return this;
  }

   /**
   * Get totalAmountInBTC
   * @return totalAmountInBTC
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.01067982", required = true, value = "")
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


  public SapiV1SimpleEarnAccountGet200Response totalAmountInUSDT(String totalAmountInUSDT) {
    
    this.totalAmountInUSDT = totalAmountInUSDT;
    return this;
  }

   /**
   * Get totalAmountInUSDT
   * @return totalAmountInUSDT
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "77.13289230", required = true, value = "")
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


  public SapiV1SimpleEarnAccountGet200Response totalFlexibleAmountInBTC(String totalFlexibleAmountInBTC) {
    
    this.totalFlexibleAmountInBTC = totalFlexibleAmountInBTC;
    return this;
  }

   /**
   * Get totalFlexibleAmountInBTC
   * @return totalFlexibleAmountInBTC
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_FLEXIBLE_AMOUNT_IN_B_T_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalFlexibleAmountInBTC() {
    return totalFlexibleAmountInBTC;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_FLEXIBLE_AMOUNT_IN_B_T_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalFlexibleAmountInBTC(String totalFlexibleAmountInBTC) {
    this.totalFlexibleAmountInBTC = totalFlexibleAmountInBTC;
  }


  public SapiV1SimpleEarnAccountGet200Response totalFlexibleAmountInUSDT(String totalFlexibleAmountInUSDT) {
    
    this.totalFlexibleAmountInUSDT = totalFlexibleAmountInUSDT;
    return this;
  }

   /**
   * Get totalFlexibleAmountInUSDT
   * @return totalFlexibleAmountInUSDT
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_FLEXIBLE_AMOUNT_IN_U_S_D_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalFlexibleAmountInUSDT() {
    return totalFlexibleAmountInUSDT;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_FLEXIBLE_AMOUNT_IN_U_S_D_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalFlexibleAmountInUSDT(String totalFlexibleAmountInUSDT) {
    this.totalFlexibleAmountInUSDT = totalFlexibleAmountInUSDT;
  }


  public SapiV1SimpleEarnAccountGet200Response totalLockedInBTC(String totalLockedInBTC) {
    
    this.totalLockedInBTC = totalLockedInBTC;
    return this;
  }

   /**
   * Get totalLockedInBTC
   * @return totalLockedInBTC
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.01067982", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_LOCKED_IN_B_T_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalLockedInBTC() {
    return totalLockedInBTC;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_LOCKED_IN_B_T_C)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalLockedInBTC(String totalLockedInBTC) {
    this.totalLockedInBTC = totalLockedInBTC;
  }


  public SapiV1SimpleEarnAccountGet200Response totalLockedInUSDT(String totalLockedInUSDT) {
    
    this.totalLockedInUSDT = totalLockedInUSDT;
    return this;
  }

   /**
   * Get totalLockedInUSDT
   * @return totalLockedInUSDT
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "77.13289230", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_LOCKED_IN_U_S_D_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalLockedInUSDT() {
    return totalLockedInUSDT;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_LOCKED_IN_U_S_D_T)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalLockedInUSDT(String totalLockedInUSDT) {
    this.totalLockedInUSDT = totalLockedInUSDT;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SimpleEarnAccountGet200Response sapiV1SimpleEarnAccountGet200Response = (SapiV1SimpleEarnAccountGet200Response) o;
    return Objects.equals(this.totalAmountInBTC, sapiV1SimpleEarnAccountGet200Response.totalAmountInBTC) &&
        Objects.equals(this.totalAmountInUSDT, sapiV1SimpleEarnAccountGet200Response.totalAmountInUSDT) &&
        Objects.equals(this.totalFlexibleAmountInBTC, sapiV1SimpleEarnAccountGet200Response.totalFlexibleAmountInBTC) &&
        Objects.equals(this.totalFlexibleAmountInUSDT, sapiV1SimpleEarnAccountGet200Response.totalFlexibleAmountInUSDT) &&
        Objects.equals(this.totalLockedInBTC, sapiV1SimpleEarnAccountGet200Response.totalLockedInBTC) &&
        Objects.equals(this.totalLockedInUSDT, sapiV1SimpleEarnAccountGet200Response.totalLockedInUSDT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAmountInBTC, totalAmountInUSDT, totalFlexibleAmountInBTC, totalFlexibleAmountInUSDT, totalLockedInBTC, totalLockedInUSDT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SimpleEarnAccountGet200Response {\n");
    sb.append("    totalAmountInBTC: ").append(toIndentedString(totalAmountInBTC)).append("\n");
    sb.append("    totalAmountInUSDT: ").append(toIndentedString(totalAmountInUSDT)).append("\n");
    sb.append("    totalFlexibleAmountInBTC: ").append(toIndentedString(totalFlexibleAmountInBTC)).append("\n");
    sb.append("    totalFlexibleAmountInUSDT: ").append(toIndentedString(totalFlexibleAmountInUSDT)).append("\n");
    sb.append("    totalLockedInBTC: ").append(toIndentedString(totalLockedInBTC)).append("\n");
    sb.append("    totalLockedInUSDT: ").append(toIndentedString(totalLockedInUSDT)).append("\n");
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

