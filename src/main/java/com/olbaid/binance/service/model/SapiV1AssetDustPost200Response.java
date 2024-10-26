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
import com.olbaid.binance.service.model.SapiV1AssetDustPost200ResponseTransferResultInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1AssetDustPost200Response
 */
@JsonPropertyOrder({
  SapiV1AssetDustPost200Response.JSON_PROPERTY_TOTAL_SERVICE_CHARGE,
  SapiV1AssetDustPost200Response.JSON_PROPERTY_TOTAL_TRANSFERED,
  SapiV1AssetDustPost200Response.JSON_PROPERTY_TRANSFER_RESULT
})
@JsonTypeName("_sapi_v1_asset_dust_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1AssetDustPost200Response {
  public static final String JSON_PROPERTY_TOTAL_SERVICE_CHARGE = "totalServiceCharge";
  private String totalServiceCharge;

  public static final String JSON_PROPERTY_TOTAL_TRANSFERED = "totalTransfered";
  private String totalTransfered;

  public static final String JSON_PROPERTY_TRANSFER_RESULT = "transferResult";
  private List<SapiV1AssetDustPost200ResponseTransferResultInner> transferResult = new ArrayList<>();

  public SapiV1AssetDustPost200Response() {
  }

  public SapiV1AssetDustPost200Response totalServiceCharge(String totalServiceCharge) {
    
    this.totalServiceCharge = totalServiceCharge;
    return this;
  }

   /**
   * Get totalServiceCharge
   * @return totalServiceCharge
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.02102542", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_SERVICE_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalServiceCharge() {
    return totalServiceCharge;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_SERVICE_CHARGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalServiceCharge(String totalServiceCharge) {
    this.totalServiceCharge = totalServiceCharge;
  }


  public SapiV1AssetDustPost200Response totalTransfered(String totalTransfered) {
    
    this.totalTransfered = totalTransfered;
    return this;
  }

   /**
   * Get totalTransfered
   * @return totalTransfered
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.05127099", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_TRANSFERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalTransfered() {
    return totalTransfered;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_TRANSFERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalTransfered(String totalTransfered) {
    this.totalTransfered = totalTransfered;
  }


  public SapiV1AssetDustPost200Response transferResult(List<SapiV1AssetDustPost200ResponseTransferResultInner> transferResult) {
    
    this.transferResult = transferResult;
    return this;
  }

  public SapiV1AssetDustPost200Response addTransferResultItem(SapiV1AssetDustPost200ResponseTransferResultInner transferResultItem) {
    this.transferResult.add(transferResultItem);
    return this;
  }

   /**
   * Get transferResult
   * @return transferResult
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSFER_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1AssetDustPost200ResponseTransferResultInner> getTransferResult() {
    return transferResult;
  }


  @JsonProperty(JSON_PROPERTY_TRANSFER_RESULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransferResult(List<SapiV1AssetDustPost200ResponseTransferResultInner> transferResult) {
    this.transferResult = transferResult;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1AssetDustPost200Response sapiV1AssetDustPost200Response = (SapiV1AssetDustPost200Response) o;
    return Objects.equals(this.totalServiceCharge, sapiV1AssetDustPost200Response.totalServiceCharge) &&
        Objects.equals(this.totalTransfered, sapiV1AssetDustPost200Response.totalTransfered) &&
        Objects.equals(this.transferResult, sapiV1AssetDustPost200Response.transferResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalServiceCharge, totalTransfered, transferResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1AssetDustPost200Response {\n");
    sb.append("    totalServiceCharge: ").append(toIndentedString(totalServiceCharge)).append("\n");
    sb.append("    totalTransfered: ").append(toIndentedString(totalTransfered)).append("\n");
    sb.append("    transferResult: ").append(toIndentedString(transferResult)).append("\n");
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
