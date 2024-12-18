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
 * ApiV3AvgPriceGet200Response
 */
@JsonPropertyOrder({
  ApiV3AvgPriceGet200Response.JSON_PROPERTY_MINS,
  ApiV3AvgPriceGet200Response.JSON_PROPERTY_PRICE,
  ApiV3AvgPriceGet200Response.JSON_PROPERTY_CLOSE_TIME
})
@JsonTypeName("_api_v3_avgPrice_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3AvgPriceGet200Response {
  public static final String JSON_PROPERTY_MINS = "mins";
  private Long mins;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_CLOSE_TIME = "closeTime";
  private Long closeTime;

  public ApiV3AvgPriceGet200Response() {
  }

  public ApiV3AvgPriceGet200Response mins(Long mins) {
    
    this.mins = mins;
    return this;
  }

   /**
   * Average price interval (in minutes)
   * @return mins
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "Average price interval (in minutes)")
  @JsonProperty(JSON_PROPERTY_MINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMins() {
    return mins;
  }


  @JsonProperty(JSON_PROPERTY_MINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMins(Long mins) {
    this.mins = mins;
  }


  public ApiV3AvgPriceGet200Response price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Average price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "9.35751834", required = true, value = "Average price")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(String price) {
    this.price = price;
  }


  public ApiV3AvgPriceGet200Response closeTime(Long closeTime) {
    
    this.closeTime = closeTime;
    return this;
  }

   /**
   * Last trade time
   * @return closeTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1694061154503", required = true, value = "Last trade time")
  @JsonProperty(JSON_PROPERTY_CLOSE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCloseTime() {
    return closeTime;
  }


  @JsonProperty(JSON_PROPERTY_CLOSE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloseTime(Long closeTime) {
    this.closeTime = closeTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3AvgPriceGet200Response apiV3AvgPriceGet200Response = (ApiV3AvgPriceGet200Response) o;
    return Objects.equals(this.mins, apiV3AvgPriceGet200Response.mins) &&
        Objects.equals(this.price, apiV3AvgPriceGet200Response.price) &&
        Objects.equals(this.closeTime, apiV3AvgPriceGet200Response.closeTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mins, price, closeTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3AvgPriceGet200Response {\n");
    sb.append("    mins: ").append(toIndentedString(mins)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    closeTime: ").append(toIndentedString(closeTime)).append("\n");
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

