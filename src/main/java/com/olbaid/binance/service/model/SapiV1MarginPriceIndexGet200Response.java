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
 * SapiV1MarginPriceIndexGet200Response
 */
@JsonPropertyOrder({
  SapiV1MarginPriceIndexGet200Response.JSON_PROPERTY_CALC_TIME,
  SapiV1MarginPriceIndexGet200Response.JSON_PROPERTY_PRICE,
  SapiV1MarginPriceIndexGet200Response.JSON_PROPERTY_SYMBOL
})
@JsonTypeName("_sapi_v1_margin_priceIndex_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MarginPriceIndexGet200Response {
  public static final String JSON_PROPERTY_CALC_TIME = "calcTime";
  private Long calcTime;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public SapiV1MarginPriceIndexGet200Response() {
  }

  public SapiV1MarginPriceIndexGet200Response calcTime(Long calcTime) {
    
    this.calcTime = calcTime;
    return this;
  }

   /**
   * Get calcTime
   * @return calcTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1562046418000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CALC_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCalcTime() {
    return calcTime;
  }


  @JsonProperty(JSON_PROPERTY_CALC_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCalcTime(Long calcTime) {
    this.calcTime = calcTime;
  }


  public SapiV1MarginPriceIndexGet200Response price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.00333930", required = true, value = "")
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


  public SapiV1MarginPriceIndexGet200Response symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNBBTC", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
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
    SapiV1MarginPriceIndexGet200Response sapiV1MarginPriceIndexGet200Response = (SapiV1MarginPriceIndexGet200Response) o;
    return Objects.equals(this.calcTime, sapiV1MarginPriceIndexGet200Response.calcTime) &&
        Objects.equals(this.price, sapiV1MarginPriceIndexGet200Response.price) &&
        Objects.equals(this.symbol, sapiV1MarginPriceIndexGet200Response.symbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calcTime, price, symbol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MarginPriceIndexGet200Response {\n");
    sb.append("    calcTime: ").append(toIndentedString(calcTime)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
