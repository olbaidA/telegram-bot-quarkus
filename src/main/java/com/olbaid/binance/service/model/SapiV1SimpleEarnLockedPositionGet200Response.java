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
import com.olbaid.binance.service.model.SapiV1SimpleEarnLockedPositionGet200ResponseRowsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1SimpleEarnLockedPositionGet200Response
 */
@JsonPropertyOrder({
  SapiV1SimpleEarnLockedPositionGet200Response.JSON_PROPERTY_ROWS,
  SapiV1SimpleEarnLockedPositionGet200Response.JSON_PROPERTY_TOTAL
})
@JsonTypeName("_sapi_v1_simple_earn_locked_position_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SimpleEarnLockedPositionGet200Response {
  public static final String JSON_PROPERTY_ROWS = "rows";
  private List<SapiV1SimpleEarnLockedPositionGet200ResponseRowsInner> rows = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public SapiV1SimpleEarnLockedPositionGet200Response() {
  }

  public SapiV1SimpleEarnLockedPositionGet200Response rows(List<SapiV1SimpleEarnLockedPositionGet200ResponseRowsInner> rows) {
    
    this.rows = rows;
    return this;
  }

  public SapiV1SimpleEarnLockedPositionGet200Response addRowsItem(SapiV1SimpleEarnLockedPositionGet200ResponseRowsInner rowsItem) {
    this.rows.add(rowsItem);
    return this;
  }

   /**
   * Get rows
   * @return rows
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1SimpleEarnLockedPositionGet200ResponseRowsInner> getRows() {
    return rows;
  }


  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRows(List<SapiV1SimpleEarnLockedPositionGet200ResponseRowsInner> rows) {
    this.rows = rows;
  }


  public SapiV1SimpleEarnLockedPositionGet200Response total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotal(Long total) {
    this.total = total;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SimpleEarnLockedPositionGet200Response sapiV1SimpleEarnLockedPositionGet200Response = (SapiV1SimpleEarnLockedPositionGet200Response) o;
    return Objects.equals(this.rows, sapiV1SimpleEarnLockedPositionGet200Response.rows) &&
        Objects.equals(this.total, sapiV1SimpleEarnLockedPositionGet200Response.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rows, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SimpleEarnLockedPositionGet200Response {\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

