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
 * SapiV1AlgoFuturesOrderDelete200Response
 */
@JsonPropertyOrder({
  SapiV1AlgoFuturesOrderDelete200Response.JSON_PROPERTY_ALGO_ID,
  SapiV1AlgoFuturesOrderDelete200Response.JSON_PROPERTY_SUCCESS,
  SapiV1AlgoFuturesOrderDelete200Response.JSON_PROPERTY_CODE,
  SapiV1AlgoFuturesOrderDelete200Response.JSON_PROPERTY_MSG
})
@JsonTypeName("_sapi_v1_algo_futures_order_delete_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AlgoFuturesOrderDelete200Response {
  public static final String JSON_PROPERTY_ALGO_ID = "algoId";
  private Long algoId;

  public static final String JSON_PROPERTY_SUCCESS = "success";
  private Boolean success;

  public static final String JSON_PROPERTY_CODE = "code";
  private Long code;

  public static final String JSON_PROPERTY_MSG = "msg";
  private String msg;

  public SapiV1AlgoFuturesOrderDelete200Response() {
  }

  public SapiV1AlgoFuturesOrderDelete200Response algoId(Long algoId) {
    
    this.algoId = algoId;
    return this;
  }

   /**
   * Get algoId
   * @return algoId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "14511", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ALGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getAlgoId() {
    return algoId;
  }


  @JsonProperty(JSON_PROPERTY_ALGO_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAlgoId(Long algoId) {
    this.algoId = algoId;
  }


  public SapiV1AlgoFuturesOrderDelete200Response success(Boolean success) {
    
    this.success = success;
    return this;
  }

   /**
   * Get success
   * @return success
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getSuccess() {
    return success;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSuccess(Boolean success) {
    this.success = success;
  }


  public SapiV1AlgoFuturesOrderDelete200Response code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(Long code) {
    this.code = code;
  }


  public SapiV1AlgoFuturesOrderDelete200Response msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "OK", required = true, value = "")
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
    SapiV1AlgoFuturesOrderDelete200Response sapiV1AlgoFuturesOrderDelete200Response = (SapiV1AlgoFuturesOrderDelete200Response) o;
    return Objects.equals(this.algoId, sapiV1AlgoFuturesOrderDelete200Response.algoId) &&
        Objects.equals(this.success, sapiV1AlgoFuturesOrderDelete200Response.success) &&
        Objects.equals(this.code, sapiV1AlgoFuturesOrderDelete200Response.code) &&
        Objects.equals(this.msg, sapiV1AlgoFuturesOrderDelete200Response.msg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algoId, success, code, msg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AlgoFuturesOrderDelete200Response {\n");
    sb.append("    algoId: ").append(toIndentedString(algoId)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

