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
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountQueryTransLogForInvestorGet200ResponseManagerSubTransferHistoryVosInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response
 */
@JsonPropertyOrder({
  SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response.JSON_PROPERTY_COUNT,
  SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response.JSON_PROPERTY_MANAGER_SUB_TRANSFER_HISTORY_VOS
})
@JsonTypeName("_sapi_v1_managed_subaccount_queryTransLogForInvestor_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response {
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_MANAGER_SUB_TRANSFER_HISTORY_VOS = "managerSubTransferHistoryVos";
  private List<SapiV1ManagedSubaccountQueryTransLogForInvestorGet200ResponseManagerSubTransferHistoryVosInner> managerSubTransferHistoryVos = new ArrayList<>();

  public SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response() {
  }

  public SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * Get count
   * @return count
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCount() {
    return count;
  }


  @JsonProperty(JSON_PROPERTY_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCount(Integer count) {
    this.count = count;
  }


  public SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response managerSubTransferHistoryVos(List<SapiV1ManagedSubaccountQueryTransLogForInvestorGet200ResponseManagerSubTransferHistoryVosInner> managerSubTransferHistoryVos) {
    
    this.managerSubTransferHistoryVos = managerSubTransferHistoryVos;
    return this;
  }

  public SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response addManagerSubTransferHistoryVosItem(SapiV1ManagedSubaccountQueryTransLogForInvestorGet200ResponseManagerSubTransferHistoryVosInner managerSubTransferHistoryVosItem) {
    this.managerSubTransferHistoryVos.add(managerSubTransferHistoryVosItem);
    return this;
  }

   /**
   * Get managerSubTransferHistoryVos
   * @return managerSubTransferHistoryVos
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MANAGER_SUB_TRANSFER_HISTORY_VOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1ManagedSubaccountQueryTransLogForInvestorGet200ResponseManagerSubTransferHistoryVosInner> getManagerSubTransferHistoryVos() {
    return managerSubTransferHistoryVos;
  }


  @JsonProperty(JSON_PROPERTY_MANAGER_SUB_TRANSFER_HISTORY_VOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setManagerSubTransferHistoryVos(List<SapiV1ManagedSubaccountQueryTransLogForInvestorGet200ResponseManagerSubTransferHistoryVosInner> managerSubTransferHistoryVos) {
    this.managerSubTransferHistoryVos = managerSubTransferHistoryVos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response sapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response = (SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response) o;
    return Objects.equals(this.count, sapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response.count) &&
        Objects.equals(this.managerSubTransferHistoryVos, sapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response.managerSubTransferHistoryVos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, managerSubTransferHistoryVos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    managerSubTransferHistoryVos: ").append(toIndentedString(managerSubTransferHistoryVos)).append("\n");
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
