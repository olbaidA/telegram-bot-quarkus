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
 * SapiV1SubAccountUniversalTransferGet200Response
 */
@JsonPropertyOrder({
  SapiV1SubAccountUniversalTransferGet200Response.JSON_PROPERTY_TRAN_ID,
  SapiV1SubAccountUniversalTransferGet200Response.JSON_PROPERTY_CLIENT_TRAN_ID
})
@JsonTypeName("_sapi_v1_sub_account_universalTransfer_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SubAccountUniversalTransferGet200Response {
  public static final String JSON_PROPERTY_TRAN_ID = "tranId";
  private Long tranId;

  public static final String JSON_PROPERTY_CLIENT_TRAN_ID = "clientTranId";
  private String clientTranId;

  public SapiV1SubAccountUniversalTransferGet200Response() {
  }

  public SapiV1SubAccountUniversalTransferGet200Response tranId(Long tranId) {
    
    this.tranId = tranId;
    return this;
  }

   /**
   * Get tranId
   * @return tranId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "11945860693", required = true, value = "")
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


  public SapiV1SubAccountUniversalTransferGet200Response clientTranId(String clientTranId) {
    
    this.clientTranId = clientTranId;
    return this;
  }

   /**
   * Get clientTranId
   * @return clientTranId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "11945860694", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLIENT_TRAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientTranId() {
    return clientTranId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_TRAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientTranId(String clientTranId) {
    this.clientTranId = clientTranId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SubAccountUniversalTransferGet200Response sapiV1SubAccountUniversalTransferGet200Response = (SapiV1SubAccountUniversalTransferGet200Response) o;
    return Objects.equals(this.tranId, sapiV1SubAccountUniversalTransferGet200Response.tranId) &&
        Objects.equals(this.clientTranId, sapiV1SubAccountUniversalTransferGet200Response.clientTranId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranId, clientTranId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SubAccountUniversalTransferGet200Response {\n");
    sb.append("    tranId: ").append(toIndentedString(tranId)).append("\n");
    sb.append("    clientTranId: ").append(toIndentedString(clientTranId)).append("\n");
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

