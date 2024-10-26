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
 * SapiV1CapitalDepositAddressGet200Response
 */
@JsonPropertyOrder({
  SapiV1CapitalDepositAddressGet200Response.JSON_PROPERTY_ADDRESS,
  SapiV1CapitalDepositAddressGet200Response.JSON_PROPERTY_COIN,
  SapiV1CapitalDepositAddressGet200Response.JSON_PROPERTY_TAG,
  SapiV1CapitalDepositAddressGet200Response.JSON_PROPERTY_URL
})
@JsonTypeName("_sapi_v1_capital_deposit_address_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1CapitalDepositAddressGet200Response {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_COIN = "coin";
  private String coin;

  public static final String JSON_PROPERTY_TAG = "tag";
  private String tag;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SapiV1CapitalDepositAddressGet200Response() {
  }

  public SapiV1CapitalDepositAddressGet200Response address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1HPn8Rx2y6nNSfagQBKy27GB99Vbzg89wv", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(String address) {
    this.address = address;
  }


  public SapiV1CapitalDepositAddressGet200Response coin(String coin) {
    
    this.coin = coin;
    return this;
  }

   /**
   * Get coin
   * @return coin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCoin() {
    return coin;
  }


  @JsonProperty(JSON_PROPERTY_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCoin(String coin) {
    this.coin = coin;
  }


  public SapiV1CapitalDepositAddressGet200Response tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTag() {
    return tag;
  }


  @JsonProperty(JSON_PROPERTY_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTag(String tag) {
    this.tag = tag;
  }


  public SapiV1CapitalDepositAddressGet200Response url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "https://btc.com/1HPn8Rx2y6nNSfagQBKy27GB99Vbzg89wv", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUrl() {
    return url;
  }


  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1CapitalDepositAddressGet200Response sapiV1CapitalDepositAddressGet200Response = (SapiV1CapitalDepositAddressGet200Response) o;
    return Objects.equals(this.address, sapiV1CapitalDepositAddressGet200Response.address) &&
        Objects.equals(this.coin, sapiV1CapitalDepositAddressGet200Response.coin) &&
        Objects.equals(this.tag, sapiV1CapitalDepositAddressGet200Response.tag) &&
        Objects.equals(this.url, sapiV1CapitalDepositAddressGet200Response.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, coin, tag, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1CapitalDepositAddressGet200Response {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
