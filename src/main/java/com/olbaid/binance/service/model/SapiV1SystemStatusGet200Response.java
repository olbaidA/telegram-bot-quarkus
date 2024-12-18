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
 * SapiV1SystemStatusGet200Response
 */
@JsonPropertyOrder({
  SapiV1SystemStatusGet200Response.JSON_PROPERTY_STATUS,
  SapiV1SystemStatusGet200Response.JSON_PROPERTY_MSG
})
@JsonTypeName("_sapi_v1_system_status_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SystemStatusGet200Response {
  public static final String JSON_PROPERTY_STATUS = "status";
  private Integer status;

  public static final String JSON_PROPERTY_MSG = "msg";
  private String msg;

  public SapiV1SystemStatusGet200Response() {
  }

  public SapiV1SystemStatusGet200Response status(Integer status) {
    
    this.status = status;
    return this;
  }

   /**
   * 0: normal, 1ï¼šsystem maintenance
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "0: normal, 1ï¼šsystem maintenance")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(Integer status) {
    this.status = status;
  }


  public SapiV1SystemStatusGet200Response msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * \&quot;normal\&quot;, \&quot;system_maintenance\&quot;
   * @return msg
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "normal", required = true, value = "\"normal\", \"system_maintenance\"")
  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMsg() {
    return msg;
  }


  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsg(String msg) {
    this.msg = msg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SystemStatusGet200Response sapiV1SystemStatusGet200Response = (SapiV1SystemStatusGet200Response) o;
    return Objects.equals(this.status, sapiV1SystemStatusGet200Response.status) &&
        Objects.equals(this.msg, sapiV1SystemStatusGet200Response.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SystemStatusGet200Response {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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

