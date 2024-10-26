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
 * SapiV1AssetConvertTransferPost200Response
 */
@JsonPropertyOrder({
  SapiV1AssetConvertTransferPost200Response.JSON_PROPERTY_TRAN_ID,
  SapiV1AssetConvertTransferPost200Response.JSON_PROPERTY_STATUS
})
@JsonTypeName("_sapi_v1_asset_convert_transfer_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AssetConvertTransferPost200Response {
  public static final String JSON_PROPERTY_TRAN_ID = "tranId";
  private Long tranId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public SapiV1AssetConvertTransferPost200Response() {
  }

  public SapiV1AssetConvertTransferPost200Response tranId(Long tranId) {
    
    this.tranId = tranId;
    return this;
  }

   /**
   * Get tranId
   * @return tranId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "118263407119", required = true, value = "")
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


  public SapiV1AssetConvertTransferPost200Response status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "S", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1AssetConvertTransferPost200Response sapiV1AssetConvertTransferPost200Response = (SapiV1AssetConvertTransferPost200Response) o;
    return Objects.equals(this.tranId, sapiV1AssetConvertTransferPost200Response.tranId) &&
        Objects.equals(this.status, sapiV1AssetConvertTransferPost200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AssetConvertTransferPost200Response {\n");
    sb.append("    tranId: ").append(toIndentedString(tranId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
