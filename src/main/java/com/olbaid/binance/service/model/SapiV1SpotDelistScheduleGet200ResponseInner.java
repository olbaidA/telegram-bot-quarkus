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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1SpotDelistScheduleGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1SpotDelistScheduleGet200ResponseInner.JSON_PROPERTY_DELIST_TIME,
  SapiV1SpotDelistScheduleGet200ResponseInner.JSON_PROPERTY_SYMBOL
})
@JsonTypeName("_sapi_v1_spot_delist_schedule_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SpotDelistScheduleGet200ResponseInner {
  public static final String JSON_PROPERTY_DELIST_TIME = "delistTime";
  private Long delistTime;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private List<String> symbol = new ArrayList<>();

  public SapiV1SpotDelistScheduleGet200ResponseInner() {
  }

  public SapiV1SpotDelistScheduleGet200ResponseInner delistTime(Long delistTime) {
    
    this.delistTime = delistTime;
    return this;
  }

   /**
   * Get delistTime
   * @return delistTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1686161202000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DELIST_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getDelistTime() {
    return delistTime;
  }


  @JsonProperty(JSON_PROPERTY_DELIST_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDelistTime(Long delistTime) {
    this.delistTime = delistTime;
  }


  public SapiV1SpotDelistScheduleGet200ResponseInner symbol(List<String> symbol) {
    
    this.symbol = symbol;
    return this;
  }

  public SapiV1SpotDelistScheduleGet200ResponseInner addSymbolItem(String symbolItem) {
    this.symbol.add(symbolItem);
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"ADAUSDT\",\"BNBUSDT\"]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(List<String> symbol) {
    this.symbol = symbol;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SpotDelistScheduleGet200ResponseInner sapiV1SpotDelistScheduleGet200ResponseInner = (SapiV1SpotDelistScheduleGet200ResponseInner) o;
    return Objects.equals(this.delistTime, sapiV1SpotDelistScheduleGet200ResponseInner.delistTime) &&
        Objects.equals(this.symbol, sapiV1SpotDelistScheduleGet200ResponseInner.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(delistTime, symbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SpotDelistScheduleGet200ResponseInner {\n");
    sb.append("    delistTime: ").append(toIndentedString(delistTime)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

