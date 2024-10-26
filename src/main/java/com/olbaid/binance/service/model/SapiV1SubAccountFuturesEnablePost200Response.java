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
 * SapiV1SubAccountFuturesEnablePost200Response
 */
@JsonPropertyOrder({
  SapiV1SubAccountFuturesEnablePost200Response.JSON_PROPERTY_EMAIL,
  SapiV1SubAccountFuturesEnablePost200Response.JSON_PROPERTY_IS_FUTURES_ENABLED
})
@JsonTypeName("_sapi_v1_sub_account_futures_enable_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SubAccountFuturesEnablePost200Response {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_IS_FUTURES_ENABLED = "isFuturesEnabled";
  private Boolean isFuturesEnabled;

  public SapiV1SubAccountFuturesEnablePost200Response() {
  }

  public SapiV1SubAccountFuturesEnablePost200Response email(String email) {
    
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


  public SapiV1SubAccountFuturesEnablePost200Response isFuturesEnabled(Boolean isFuturesEnabled) {
    
    this.isFuturesEnabled = isFuturesEnabled;
    return this;
  }

   /**
   * Get isFuturesEnabled
   * @return isFuturesEnabled
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_FUTURES_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsFuturesEnabled() {
    return isFuturesEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_FUTURES_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsFuturesEnabled(Boolean isFuturesEnabled) {
    this.isFuturesEnabled = isFuturesEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SubAccountFuturesEnablePost200Response sapiV1SubAccountFuturesEnablePost200Response = (SapiV1SubAccountFuturesEnablePost200Response) o;
    return Objects.equals(this.email, sapiV1SubAccountFuturesEnablePost200Response.email) &&
        Objects.equals(this.isFuturesEnabled, sapiV1SubAccountFuturesEnablePost200Response.isFuturesEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, isFuturesEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SubAccountFuturesEnablePost200Response {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isFuturesEnabled: ").append(toIndentedString(isFuturesEnabled)).append("\n");
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

