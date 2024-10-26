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
 * SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner
 */
@JsonPropertyOrder({
  SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner.JSON_PROPERTY_TARGET_ASSET,
  SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner.JSON_PROPERTY_ALLOCATION
})
@JsonTypeName("_sapi_v1_lending_auto_invest_index_info_get_200_response_assetAllocation_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner {
  public static final String JSON_PROPERTY_TARGET_ASSET = "targetAsset";
  private String targetAsset;

  public static final String JSON_PROPERTY_ALLOCATION = "allocation";
  private String allocation;

  public SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner() {
  }

  public SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner targetAsset(String targetAsset) {
    
    this.targetAsset = targetAsset;
    return this;
  }

   /**
   * Get targetAsset
   * @return targetAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ADA", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetAsset() {
    return targetAsset;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetAsset(String targetAsset) {
    this.targetAsset = targetAsset;
  }


  public SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner allocation(String allocation) {
    
    this.allocation = allocation;
    return this;
  }

   /**
   * Get allocation
   * @return allocation
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ALLOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAllocation() {
    return allocation;
  }


  @JsonProperty(JSON_PROPERTY_ALLOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAllocation(String allocation) {
    this.allocation = allocation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner sapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner = (SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner) o;
    return Objects.equals(this.targetAsset, sapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner.targetAsset) &&
        Objects.equals(this.allocation, sapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner.allocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetAsset, allocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LendingAutoInvestIndexInfoGet200ResponseAssetAllocationInner {\n");
    sb.append("    targetAsset: ").append(toIndentedString(targetAsset)).append("\n");
    sb.append("    allocation: ").append(toIndentedString(allocation)).append("\n");
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

