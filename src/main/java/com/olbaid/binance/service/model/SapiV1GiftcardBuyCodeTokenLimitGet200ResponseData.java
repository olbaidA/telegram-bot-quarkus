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
 * SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData
 */
@JsonPropertyOrder({
  SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData.JSON_PROPERTY_COIN,
  SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData.JSON_PROPERTY_FROM_MIN,
  SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData.JSON_PROPERTY_FROM_MAX
})
@JsonTypeName("_sapi_v1_giftcard_buyCode_token_limit_get_200_response_data")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData {
  public static final String JSON_PROPERTY_COIN = "coin";
  private String coin;

  public static final String JSON_PROPERTY_FROM_MIN = "fromMin";
  private String fromMin;

  public static final String JSON_PROPERTY_FROM_MAX = "fromMax";
  private String fromMax;

  public SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData() {
  }

  public SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData coin(String coin) {
    
    this.coin = coin;
    return this;
  }

   /**
   * Get coin
   * @return coin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "BNB", value = "")
  @JsonProperty(JSON_PROPERTY_COIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoin() {
    return coin;
  }


  @JsonProperty(JSON_PROPERTY_COIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCoin(String coin) {
    this.coin = coin;
  }


  public SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData fromMin(String fromMin) {
    
    this.fromMin = fromMin;
    return this;
  }

   /**
   * Get fromMin
   * @return fromMin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0.01", value = "")
  @JsonProperty(JSON_PROPERTY_FROM_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromMin() {
    return fromMin;
  }


  @JsonProperty(JSON_PROPERTY_FROM_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromMin(String fromMin) {
    this.fromMin = fromMin;
  }


  public SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData fromMax(String fromMax) {
    
    this.fromMax = fromMax;
    return this;
  }

   /**
   * Get fromMax
   * @return fromMax
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")
  @JsonProperty(JSON_PROPERTY_FROM_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFromMax() {
    return fromMax;
  }


  @JsonProperty(JSON_PROPERTY_FROM_MAX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromMax(String fromMax) {
    this.fromMax = fromMax;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData sapiV1GiftcardBuyCodeTokenLimitGet200ResponseData = (SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData) o;
    return Objects.equals(this.coin, sapiV1GiftcardBuyCodeTokenLimitGet200ResponseData.coin) &&
        Objects.equals(this.fromMin, sapiV1GiftcardBuyCodeTokenLimitGet200ResponseData.fromMin) &&
        Objects.equals(this.fromMax, sapiV1GiftcardBuyCodeTokenLimitGet200ResponseData.fromMax);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coin, fromMin, fromMax);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1GiftcardBuyCodeTokenLimitGet200ResponseData {\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    fromMin: ").append(toIndentedString(fromMin)).append("\n");
    sb.append("    fromMax: ").append(toIndentedString(fromMax)).append("\n");
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

