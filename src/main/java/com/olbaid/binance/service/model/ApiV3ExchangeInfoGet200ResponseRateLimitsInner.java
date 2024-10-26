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
 * ApiV3ExchangeInfoGet200ResponseRateLimitsInner
 */
@JsonPropertyOrder({
  ApiV3ExchangeInfoGet200ResponseRateLimitsInner.JSON_PROPERTY_RATE_LIMIT_TYPE,
  ApiV3ExchangeInfoGet200ResponseRateLimitsInner.JSON_PROPERTY_INTERVAL,
  ApiV3ExchangeInfoGet200ResponseRateLimitsInner.JSON_PROPERTY_INTERVAL_NUM,
  ApiV3ExchangeInfoGet200ResponseRateLimitsInner.JSON_PROPERTY_LIMIT
})
@JsonTypeName("_api_v3_exchangeInfo_get_200_response_rateLimits_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3ExchangeInfoGet200ResponseRateLimitsInner {
  public static final String JSON_PROPERTY_RATE_LIMIT_TYPE = "rateLimitType";
  private String rateLimitType;

  public static final String JSON_PROPERTY_INTERVAL = "interval";
  private String interval;

  public static final String JSON_PROPERTY_INTERVAL_NUM = "intervalNum";
  private Integer intervalNum;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit;

  public ApiV3ExchangeInfoGet200ResponseRateLimitsInner() {
  }

  public ApiV3ExchangeInfoGet200ResponseRateLimitsInner rateLimitType(String rateLimitType) {
    
    this.rateLimitType = rateLimitType;
    return this;
  }

   /**
   * Get rateLimitType
   * @return rateLimitType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "REQUEST_WEIGHT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RATE_LIMIT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRateLimitType() {
    return rateLimitType;
  }


  @JsonProperty(JSON_PROPERTY_RATE_LIMIT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRateLimitType(String rateLimitType) {
    this.rateLimitType = rateLimitType;
  }


  public ApiV3ExchangeInfoGet200ResponseRateLimitsInner interval(String interval) {
    
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "MINUTE", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInterval() {
    return interval;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInterval(String interval) {
    this.interval = interval;
  }


  public ApiV3ExchangeInfoGet200ResponseRateLimitsInner intervalNum(Integer intervalNum) {
    
    this.intervalNum = intervalNum;
    return this;
  }

   /**
   * Get intervalNum
   * @return intervalNum
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INTERVAL_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getIntervalNum() {
    return intervalNum;
  }


  @JsonProperty(JSON_PROPERTY_INTERVAL_NUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntervalNum(Integer intervalNum) {
    this.intervalNum = intervalNum;
  }


  public ApiV3ExchangeInfoGet200ResponseRateLimitsInner limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1200", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3ExchangeInfoGet200ResponseRateLimitsInner apiV3ExchangeInfoGet200ResponseRateLimitsInner = (ApiV3ExchangeInfoGet200ResponseRateLimitsInner) o;
    return Objects.equals(this.rateLimitType, apiV3ExchangeInfoGet200ResponseRateLimitsInner.rateLimitType) &&
        Objects.equals(this.interval, apiV3ExchangeInfoGet200ResponseRateLimitsInner.interval) &&
        Objects.equals(this.intervalNum, apiV3ExchangeInfoGet200ResponseRateLimitsInner.intervalNum) &&
        Objects.equals(this.limit, apiV3ExchangeInfoGet200ResponseRateLimitsInner.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateLimitType, interval, intervalNum, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3ExchangeInfoGet200ResponseRateLimitsInner {\n");
    sb.append("    rateLimitType: ").append(toIndentedString(rateLimitType)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    intervalNum: ").append(toIndentedString(intervalNum)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
