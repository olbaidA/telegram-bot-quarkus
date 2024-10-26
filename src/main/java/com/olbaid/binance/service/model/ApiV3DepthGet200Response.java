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
 * ApiV3DepthGet200Response
 */
@JsonPropertyOrder({
  ApiV3DepthGet200Response.JSON_PROPERTY_LAST_UPDATE_ID,
  ApiV3DepthGet200Response.JSON_PROPERTY_BIDS,
  ApiV3DepthGet200Response.JSON_PROPERTY_ASKS
})
@JsonTypeName("_api_v3_depth_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3DepthGet200Response {
  public static final String JSON_PROPERTY_LAST_UPDATE_ID = "lastUpdateId";
  private Long lastUpdateId;

  public static final String JSON_PROPERTY_BIDS = "bids";
  private List<List<String>> bids = new ArrayList<>();

  public static final String JSON_PROPERTY_ASKS = "asks";
  private List<List<String>> asks = new ArrayList<>();

  public ApiV3DepthGet200Response() {
  }

  public ApiV3DepthGet200Response lastUpdateId(Long lastUpdateId) {
    
    this.lastUpdateId = lastUpdateId;
    return this;
  }

   /**
   * Get lastUpdateId
   * @return lastUpdateId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LAST_UPDATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getLastUpdateId() {
    return lastUpdateId;
  }


  @JsonProperty(JSON_PROPERTY_LAST_UPDATE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastUpdateId(Long lastUpdateId) {
    this.lastUpdateId = lastUpdateId;
  }


  public ApiV3DepthGet200Response bids(List<List<String>> bids) {
    
    this.bids = bids;
    return this;
  }

  public ApiV3DepthGet200Response addBidsItem(List<String> bidsItem) {
    this.bids.add(bidsItem);
    return this;
  }

   /**
   * Get bids
   * @return bids
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BIDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<List<String>> getBids() {
    return bids;
  }


  @JsonProperty(JSON_PROPERTY_BIDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBids(List<List<String>> bids) {
    this.bids = bids;
  }


  public ApiV3DepthGet200Response asks(List<List<String>> asks) {
    
    this.asks = asks;
    return this;
  }

  public ApiV3DepthGet200Response addAsksItem(List<String> asksItem) {
    this.asks.add(asksItem);
    return this;
  }

   /**
   * Get asks
   * @return asks
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<List<String>> getAsks() {
    return asks;
  }


  @JsonProperty(JSON_PROPERTY_ASKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAsks(List<List<String>> asks) {
    this.asks = asks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3DepthGet200Response apiV3DepthGet200Response = (ApiV3DepthGet200Response) o;
    return Objects.equals(this.lastUpdateId, apiV3DepthGet200Response.lastUpdateId) &&
        Objects.equals(this.bids, apiV3DepthGet200Response.bids) &&
        Objects.equals(this.asks, apiV3DepthGet200Response.asks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastUpdateId, bids, asks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3DepthGet200Response {\n");
    sb.append("    lastUpdateId: ").append(toIndentedString(lastUpdateId)).append("\n");
    sb.append("    bids: ").append(toIndentedString(bids)).append("\n");
    sb.append("    asks: ").append(toIndentedString(asks)).append("\n");
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
