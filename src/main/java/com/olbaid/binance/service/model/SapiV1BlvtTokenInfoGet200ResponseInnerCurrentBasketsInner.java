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
 * SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner
 */
@JsonPropertyOrder({
  SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner.JSON_PROPERTY_SYMBOL,
  SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner.JSON_PROPERTY_AMOUNT,
  SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner.JSON_PROPERTY_NOTIONAL_VALUE
})
@JsonTypeName("_sapi_v1_blvt_tokenInfo_get_200_response_inner_currentBaskets_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner {
  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_NOTIONAL_VALUE = "notionalValue";
  private String notionalValue;

  public SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner() {
  }

  public SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTCUSDT", required = true, value = "")
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


  public SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "-1183.984", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner notionalValue(String notionalValue) {
    
    this.notionalValue = notionalValue;
    return this;
  }

   /**
   * Get notionalValue
   * @return notionalValue
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "-22871089.96704", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NOTIONAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNotionalValue() {
    return notionalValue;
  }


  @JsonProperty(JSON_PROPERTY_NOTIONAL_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNotionalValue(String notionalValue) {
    this.notionalValue = notionalValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner sapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner = (SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner) o;
    return Objects.equals(this.symbol, sapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner.symbol) &&
        Objects.equals(this.amount, sapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner.amount) &&
        Objects.equals(this.notionalValue, sapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner.notionalValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(symbol, amount, notionalValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner {\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    notionalValue: ").append(toIndentedString(notionalValue)).append("\n");
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
