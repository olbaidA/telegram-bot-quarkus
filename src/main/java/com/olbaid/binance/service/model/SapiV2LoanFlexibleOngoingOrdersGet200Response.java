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
import com.olbaid.binance.service.model.SapiV2LoanFlexibleOngoingOrdersGet200ResponseRowsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV2LoanFlexibleOngoingOrdersGet200Response
 */
@JsonPropertyOrder({
  SapiV2LoanFlexibleOngoingOrdersGet200Response.JSON_PROPERTY_TOTAL,
  SapiV2LoanFlexibleOngoingOrdersGet200Response.JSON_PROPERTY_ROWS
})
@JsonTypeName("_sapi_v2_loan_flexible_ongoing_orders_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV2LoanFlexibleOngoingOrdersGet200Response {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private Integer total;

  public static final String JSON_PROPERTY_ROWS = "rows";
  private List<SapiV2LoanFlexibleOngoingOrdersGet200ResponseRowsInner> rows = new ArrayList<>();

  public SapiV2LoanFlexibleOngoingOrdersGet200Response() {
  }

  public SapiV2LoanFlexibleOngoingOrdersGet200Response total(Integer total) {
    
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

  public Integer getTotal() {
    return total;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotal(Integer total) {
    this.total = total;
  }


  public SapiV2LoanFlexibleOngoingOrdersGet200Response rows(List<SapiV2LoanFlexibleOngoingOrdersGet200ResponseRowsInner> rows) {
    
    this.rows = rows;
    return this;
  }

  public SapiV2LoanFlexibleOngoingOrdersGet200Response addRowsItem(SapiV2LoanFlexibleOngoingOrdersGet200ResponseRowsInner rowsItem) {
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

  public List<SapiV2LoanFlexibleOngoingOrdersGet200ResponseRowsInner> getRows() {
    return rows;
  }


  @JsonProperty(JSON_PROPERTY_ROWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRows(List<SapiV2LoanFlexibleOngoingOrdersGet200ResponseRowsInner> rows) {
    this.rows = rows;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV2LoanFlexibleOngoingOrdersGet200Response sapiV2LoanFlexibleOngoingOrdersGet200Response = (SapiV2LoanFlexibleOngoingOrdersGet200Response) o;
    return Objects.equals(this.total, sapiV2LoanFlexibleOngoingOrdersGet200Response.total) &&
        Objects.equals(this.rows, sapiV2LoanFlexibleOngoingOrdersGet200Response.rows);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, rows);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV2LoanFlexibleOngoingOrdersGet200Response {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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

