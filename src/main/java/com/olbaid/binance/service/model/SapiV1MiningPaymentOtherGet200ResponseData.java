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
import com.olbaid.binance.service.model.SapiV1MiningPaymentOtherGet200ResponseDataOtherProfitsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1MiningPaymentOtherGet200ResponseData
 */
@JsonPropertyOrder({
  SapiV1MiningPaymentOtherGet200ResponseData.JSON_PROPERTY_OTHER_PROFITS,
  SapiV1MiningPaymentOtherGet200ResponseData.JSON_PROPERTY_TOTAL_NUM,
  SapiV1MiningPaymentOtherGet200ResponseData.JSON_PROPERTY_PAGE_SIZE
})
@JsonTypeName("_sapi_v1_mining_payment_other_get_200_response_data")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MiningPaymentOtherGet200ResponseData {
  public static final String JSON_PROPERTY_OTHER_PROFITS = "otherProfits";
  private List<SapiV1MiningPaymentOtherGet200ResponseDataOtherProfitsInner> otherProfits = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_NUM = "totalNum";
  private Long totalNum;

  public static final String JSON_PROPERTY_PAGE_SIZE = "pageSize";
  private Long pageSize;

  public SapiV1MiningPaymentOtherGet200ResponseData() {
  }

  public SapiV1MiningPaymentOtherGet200ResponseData otherProfits(List<SapiV1MiningPaymentOtherGet200ResponseDataOtherProfitsInner> otherProfits) {
    
    this.otherProfits = otherProfits;
    return this;
  }

  public SapiV1MiningPaymentOtherGet200ResponseData addOtherProfitsItem(SapiV1MiningPaymentOtherGet200ResponseDataOtherProfitsInner otherProfitsItem) {
    this.otherProfits.add(otherProfitsItem);
    return this;
  }

   /**
   * Get otherProfits
   * @return otherProfits
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OTHER_PROFITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1MiningPaymentOtherGet200ResponseDataOtherProfitsInner> getOtherProfits() {
    return otherProfits;
  }


  @JsonProperty(JSON_PROPERTY_OTHER_PROFITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOtherProfits(List<SapiV1MiningPaymentOtherGet200ResponseDataOtherProfitsInner> otherProfits) {
    this.otherProfits = otherProfits;
  }


  public SapiV1MiningPaymentOtherGet200ResponseData totalNum(Long totalNum) {
    
    this.totalNum = totalNum;
    return this;
  }

   /**
   * Total Rows
   * @return totalNum
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Total Rows")
  @JsonProperty(JSON_PROPERTY_TOTAL_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTotalNum() {
    return totalNum;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalNum(Long totalNum) {
    this.totalNum = totalNum;
  }


  public SapiV1MiningPaymentOtherGet200ResponseData pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Rows per page
   * @return pageSize
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "20", required = true, value = "Rows per page")
  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPageSize() {
    return pageSize;
  }


  @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1MiningPaymentOtherGet200ResponseData sapiV1MiningPaymentOtherGet200ResponseData = (SapiV1MiningPaymentOtherGet200ResponseData) o;
    return Objects.equals(this.otherProfits, sapiV1MiningPaymentOtherGet200ResponseData.otherProfits) &&
        Objects.equals(this.totalNum, sapiV1MiningPaymentOtherGet200ResponseData.totalNum) &&
        Objects.equals(this.pageSize, sapiV1MiningPaymentOtherGet200ResponseData.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(otherProfits, totalNum, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MiningPaymentOtherGet200ResponseData {\n");
    sb.append("    otherProfits: ").append(toIndentedString(otherProfits)).append("\n");
    sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

