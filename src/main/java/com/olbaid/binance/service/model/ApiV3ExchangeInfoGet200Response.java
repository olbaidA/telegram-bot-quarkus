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
import com.olbaid.binance.service.model.ApiV3ExchangeInfoGet200ResponseRateLimitsInner;
import com.olbaid.binance.service.model.ApiV3ExchangeInfoGet200ResponseSymbolsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ApiV3ExchangeInfoGet200Response
 */
@JsonPropertyOrder({
  ApiV3ExchangeInfoGet200Response.JSON_PROPERTY_TIMEZONE,
  ApiV3ExchangeInfoGet200Response.JSON_PROPERTY_SERVER_TIME,
  ApiV3ExchangeInfoGet200Response.JSON_PROPERTY_RATE_LIMITS,
  ApiV3ExchangeInfoGet200Response.JSON_PROPERTY_EXCHANGE_FILTERS,
  ApiV3ExchangeInfoGet200Response.JSON_PROPERTY_SYMBOLS
})
@JsonTypeName("_api_v3_exchangeInfo_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3ExchangeInfoGet200Response {
  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_SERVER_TIME = "serverTime";
  private Long serverTime;

  public static final String JSON_PROPERTY_RATE_LIMITS = "rateLimits";
  private List<ApiV3ExchangeInfoGet200ResponseRateLimitsInner> rateLimits = new ArrayList<>();

  public static final String JSON_PROPERTY_EXCHANGE_FILTERS = "exchangeFilters";
  private List<Object> exchangeFilters = new ArrayList<>();

  public static final String JSON_PROPERTY_SYMBOLS = "symbols";
  private List<ApiV3ExchangeInfoGet200ResponseSymbolsInner> symbols = new ArrayList<>();

  public ApiV3ExchangeInfoGet200Response() {
  }

  public ApiV3ExchangeInfoGet200Response timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Get timezone
   * @return timezone
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "UTC", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTimezone() {
    return timezone;
  }


  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public ApiV3ExchangeInfoGet200Response serverTime(Long serverTime) {
    
    this.serverTime = serverTime;
    return this;
  }

   /**
   * Get serverTime
   * @return serverTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1592882214236", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SERVER_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getServerTime() {
    return serverTime;
  }


  @JsonProperty(JSON_PROPERTY_SERVER_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServerTime(Long serverTime) {
    this.serverTime = serverTime;
  }


  public ApiV3ExchangeInfoGet200Response rateLimits(List<ApiV3ExchangeInfoGet200ResponseRateLimitsInner> rateLimits) {
    
    this.rateLimits = rateLimits;
    return this;
  }

  public ApiV3ExchangeInfoGet200Response addRateLimitsItem(ApiV3ExchangeInfoGet200ResponseRateLimitsInner rateLimitsItem) {
    this.rateLimits.add(rateLimitsItem);
    return this;
  }

   /**
   * Get rateLimits
   * @return rateLimits
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RATE_LIMITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ApiV3ExchangeInfoGet200ResponseRateLimitsInner> getRateLimits() {
    return rateLimits;
  }


  @JsonProperty(JSON_PROPERTY_RATE_LIMITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRateLimits(List<ApiV3ExchangeInfoGet200ResponseRateLimitsInner> rateLimits) {
    this.rateLimits = rateLimits;
  }


  public ApiV3ExchangeInfoGet200Response exchangeFilters(List<Object> exchangeFilters) {
    
    this.exchangeFilters = exchangeFilters;
    return this;
  }

  public ApiV3ExchangeInfoGet200Response addExchangeFiltersItem(Object exchangeFiltersItem) {
    this.exchangeFilters.add(exchangeFiltersItem);
    return this;
  }

   /**
   * Get exchangeFilters
   * @return exchangeFilters
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXCHANGE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Object> getExchangeFilters() {
    return exchangeFilters;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_FILTERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchangeFilters(List<Object> exchangeFilters) {
    this.exchangeFilters = exchangeFilters;
  }


  public ApiV3ExchangeInfoGet200Response symbols(List<ApiV3ExchangeInfoGet200ResponseSymbolsInner> symbols) {
    
    this.symbols = symbols;
    return this;
  }

  public ApiV3ExchangeInfoGet200Response addSymbolsItem(ApiV3ExchangeInfoGet200ResponseSymbolsInner symbolsItem) {
    this.symbols.add(symbolsItem);
    return this;
  }

   /**
   * Get symbols
   * @return symbols
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<ApiV3ExchangeInfoGet200ResponseSymbolsInner> getSymbols() {
    return symbols;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOLS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbols(List<ApiV3ExchangeInfoGet200ResponseSymbolsInner> symbols) {
    this.symbols = symbols;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3ExchangeInfoGet200Response apiV3ExchangeInfoGet200Response = (ApiV3ExchangeInfoGet200Response) o;
    return Objects.equals(this.timezone, apiV3ExchangeInfoGet200Response.timezone) &&
        Objects.equals(this.serverTime, apiV3ExchangeInfoGet200Response.serverTime) &&
        Objects.equals(this.rateLimits, apiV3ExchangeInfoGet200Response.rateLimits) &&
        Objects.equals(this.exchangeFilters, apiV3ExchangeInfoGet200Response.exchangeFilters) &&
        Objects.equals(this.symbols, apiV3ExchangeInfoGet200Response.symbols);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timezone, serverTime, rateLimits, exchangeFilters, symbols);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3ExchangeInfoGet200Response {\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    serverTime: ").append(toIndentedString(serverTime)).append("\n");
    sb.append("    rateLimits: ").append(toIndentedString(rateLimits)).append("\n");
    sb.append("    exchangeFilters: ").append(toIndentedString(exchangeFilters)).append("\n");
    sb.append("    symbols: ").append(toIndentedString(symbols)).append("\n");
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

