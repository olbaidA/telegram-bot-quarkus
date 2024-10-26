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
 * SapiV1AccountInfoGet200Response
 */
@JsonPropertyOrder({
  SapiV1AccountInfoGet200Response.JSON_PROPERTY_VIP_LEVEL,
  SapiV1AccountInfoGet200Response.JSON_PROPERTY_IS_MARGIN_ENABLED,
  SapiV1AccountInfoGet200Response.JSON_PROPERTY_IS_FUTURE_ENABLED
})
@JsonTypeName("_sapi_v1_account_info_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AccountInfoGet200Response {
  public static final String JSON_PROPERTY_VIP_LEVEL = "vipLevel";
  private Integer vipLevel;

  public static final String JSON_PROPERTY_IS_MARGIN_ENABLED = "isMarginEnabled";
  private Boolean isMarginEnabled;

  public static final String JSON_PROPERTY_IS_FUTURE_ENABLED = "isFutureEnabled";
  private Boolean isFutureEnabled;

  public SapiV1AccountInfoGet200Response() {
  }

  public SapiV1AccountInfoGet200Response vipLevel(Integer vipLevel) {
    
    this.vipLevel = vipLevel;
    return this;
  }

   /**
   * Get vipLevel
   * @return vipLevel
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VIP_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getVipLevel() {
    return vipLevel;
  }


  @JsonProperty(JSON_PROPERTY_VIP_LEVEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVipLevel(Integer vipLevel) {
    this.vipLevel = vipLevel;
  }


  public SapiV1AccountInfoGet200Response isMarginEnabled(Boolean isMarginEnabled) {
    
    this.isMarginEnabled = isMarginEnabled;
    return this;
  }

   /**
   * true or false for margin.
   * @return isMarginEnabled
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "true or false for margin.")
  @JsonProperty(JSON_PROPERTY_IS_MARGIN_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsMarginEnabled() {
    return isMarginEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_MARGIN_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMarginEnabled(Boolean isMarginEnabled) {
    this.isMarginEnabled = isMarginEnabled;
  }


  public SapiV1AccountInfoGet200Response isFutureEnabled(Boolean isFutureEnabled) {
    
    this.isFutureEnabled = isFutureEnabled;
    return this;
  }

   /**
   * true or false for futures.
   * @return isFutureEnabled
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "true or false for futures.")
  @JsonProperty(JSON_PROPERTY_IS_FUTURE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsFutureEnabled() {
    return isFutureEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_FUTURE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsFutureEnabled(Boolean isFutureEnabled) {
    this.isFutureEnabled = isFutureEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1AccountInfoGet200Response sapiV1AccountInfoGet200Response = (SapiV1AccountInfoGet200Response) o;
    return Objects.equals(this.vipLevel, sapiV1AccountInfoGet200Response.vipLevel) &&
        Objects.equals(this.isMarginEnabled, sapiV1AccountInfoGet200Response.isMarginEnabled) &&
        Objects.equals(this.isFutureEnabled, sapiV1AccountInfoGet200Response.isFutureEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vipLevel, isMarginEnabled, isFutureEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AccountInfoGet200Response {\n");
    sb.append("    vipLevel: ").append(toIndentedString(vipLevel)).append("\n");
    sb.append("    isMarginEnabled: ").append(toIndentedString(isMarginEnabled)).append("\n");
    sb.append("    isFutureEnabled: ").append(toIndentedString(isFutureEnabled)).append("\n");
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
