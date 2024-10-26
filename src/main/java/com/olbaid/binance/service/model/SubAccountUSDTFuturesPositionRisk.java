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
import com.olbaid.binance.service.model.SapiV1SubAccountFuturesPositionRiskGet200ResponseInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SubAccountUSDTFuturesPositionRisk
 */
@JsonPropertyOrder({
  SubAccountUSDTFuturesPositionRisk.JSON_PROPERTY_FUTURE_POSITION_RISK_VOS
})
@JsonTypeName("subAccountUSDTFuturesPositionRisk")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubAccountUSDTFuturesPositionRisk {
  public static final String JSON_PROPERTY_FUTURE_POSITION_RISK_VOS = "futurePositionRiskVos";
  private List<SapiV1SubAccountFuturesPositionRiskGet200ResponseInner> futurePositionRiskVos = new ArrayList<>();

  public SubAccountUSDTFuturesPositionRisk() {
  }

  public SubAccountUSDTFuturesPositionRisk futurePositionRiskVos(List<SapiV1SubAccountFuturesPositionRiskGet200ResponseInner> futurePositionRiskVos) {
    
    this.futurePositionRiskVos = futurePositionRiskVos;
    return this;
  }

  public SubAccountUSDTFuturesPositionRisk addFuturePositionRiskVosItem(SapiV1SubAccountFuturesPositionRiskGet200ResponseInner futurePositionRiskVosItem) {
    this.futurePositionRiskVos.add(futurePositionRiskVosItem);
    return this;
  }

   /**
   * Get futurePositionRiskVos
   * @return futurePositionRiskVos
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FUTURE_POSITION_RISK_VOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1SubAccountFuturesPositionRiskGet200ResponseInner> getFuturePositionRiskVos() {
    return futurePositionRiskVos;
  }


  @JsonProperty(JSON_PROPERTY_FUTURE_POSITION_RISK_VOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFuturePositionRiskVos(List<SapiV1SubAccountFuturesPositionRiskGet200ResponseInner> futurePositionRiskVos) {
    this.futurePositionRiskVos = futurePositionRiskVos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubAccountUSDTFuturesPositionRisk subAccountUSDTFuturesPositionRisk = (SubAccountUSDTFuturesPositionRisk) o;
    return Objects.equals(this.futurePositionRiskVos, subAccountUSDTFuturesPositionRisk.futurePositionRiskVos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(futurePositionRiskVos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountUSDTFuturesPositionRisk {\n");
    sb.append("    futurePositionRiskVos: ").append(toIndentedString(futurePositionRiskVos)).append("\n");
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
