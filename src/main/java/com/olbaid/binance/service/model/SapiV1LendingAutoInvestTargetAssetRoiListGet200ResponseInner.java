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
 * SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner.JSON_PROPERTY_DATE,
  SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner.JSON_PROPERTY_SIMULATE_ROI
})
@JsonTypeName("_sapi_v1_lending_auto_invest_target_asset_roi_list_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner {
  public static final String JSON_PROPERTY_DATE = "date";
  private String date;

  public static final String JSON_PROPERTY_SIMULATE_ROI = "simulateRoi";
  private String simulateRoi;

  public SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner() {
  }

  public SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1648378800000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDate(String date) {
    this.date = date;
  }


  public SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner simulateRoi(String simulateRoi) {
    
    this.simulateRoi = simulateRoi;
    return this;
  }

   /**
   * Get simulateRoi
   * @return simulateRoi
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.75", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SIMULATE_ROI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSimulateRoi() {
    return simulateRoi;
  }


  @JsonProperty(JSON_PROPERTY_SIMULATE_ROI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSimulateRoi(String simulateRoi) {
    this.simulateRoi = simulateRoi;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner sapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner = (SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner) o;
    return Objects.equals(this.date, sapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner.date) &&
        Objects.equals(this.simulateRoi, sapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner.simulateRoi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, simulateRoi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner {\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    simulateRoi: ").append(toIndentedString(simulateRoi)).append("\n");
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
