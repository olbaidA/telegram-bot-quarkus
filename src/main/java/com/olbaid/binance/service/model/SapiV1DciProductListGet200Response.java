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
import com.olbaid.binance.service.model.SapiV1DciProductListGet200ResponseListInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1DciProductListGet200Response
 */
@JsonPropertyOrder({
  SapiV1DciProductListGet200Response.JSON_PROPERTY_TOTAL,
  SapiV1DciProductListGet200Response.JSON_PROPERTY_LIST
})
@JsonTypeName("_sapi_v1_dci_product_list_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1DciProductListGet200Response {
  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_LIST = "list";
  private List<SapiV1DciProductListGet200ResponseListInner> _list = new ArrayList<>();

  public SapiV1DciProductListGet200Response() {
  }

  public SapiV1DciProductListGet200Response total(Long total) {
    
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


  public SapiV1DciProductListGet200Response _list(List<SapiV1DciProductListGet200ResponseListInner> _list) {
    
    this._list = _list;
    return this;
  }

  public SapiV1DciProductListGet200Response addListItem(SapiV1DciProductListGet200ResponseListInner _listItem) {
    this._list.add(_listItem);
    return this;
  }

   /**
   * Get _list
   * @return _list
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1DciProductListGet200ResponseListInner> getList() {
    return _list;
  }


  @JsonProperty(JSON_PROPERTY_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setList(List<SapiV1DciProductListGet200ResponseListInner> _list) {
    this._list = _list;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1DciProductListGet200Response sapiV1DciProductListGet200Response = (SapiV1DciProductListGet200Response) o;
    return Objects.equals(this.total, sapiV1DciProductListGet200Response.total) &&
        Objects.equals(this._list, sapiV1DciProductListGet200Response._list);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, _list);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1DciProductListGet200Response {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    _list: ").append(toIndentedString(_list)).append("\n");
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

