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
import com.olbaid.binance.service.model.PriceTicker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiV3TickerPriceGet200Response
 */
@JsonPropertyOrder({
  ApiV3TickerPriceGet200Response.JSON_PROPERTY_SYMBOL,
  ApiV3TickerPriceGet200Response.JSON_PROPERTY_PRICE
})
@JsonTypeName("_api_v3_ticker_price_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3TickerPriceGet200Response {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public ApiV3TickerPriceGet200Response() {
  }

  public ApiV3TickerPriceGet200Response symbol(String symbol) {
    
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


  public ApiV3TickerPriceGet200Response price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.17160000", required = true, value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3TickerPriceGet200Response apiV3TickerPriceGet200Response = (ApiV3TickerPriceGet200Response) o;
    return Objects.equals(this.symbol, apiV3TickerPriceGet200Response.symbol) &&
        Objects.equals(this.price, apiV3TickerPriceGet200Response.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3TickerPriceGet200Response {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
