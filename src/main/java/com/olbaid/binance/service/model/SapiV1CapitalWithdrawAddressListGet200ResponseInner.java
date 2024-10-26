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
 * SapiV1CapitalWithdrawAddressListGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1CapitalWithdrawAddressListGet200ResponseInner.JSON_PROPERTY_ADDRESS,
  SapiV1CapitalWithdrawAddressListGet200ResponseInner.JSON_PROPERTY_ADDRESS_TAG,
  SapiV1CapitalWithdrawAddressListGet200ResponseInner.JSON_PROPERTY_COIN,
  SapiV1CapitalWithdrawAddressListGet200ResponseInner.JSON_PROPERTY_NAME,
  SapiV1CapitalWithdrawAddressListGet200ResponseInner.JSON_PROPERTY_NETWORK,
  SapiV1CapitalWithdrawAddressListGet200ResponseInner.JSON_PROPERTY_ORIGIN,
  SapiV1CapitalWithdrawAddressListGet200ResponseInner.JSON_PROPERTY_ORIGIN_TYPE,
  SapiV1CapitalWithdrawAddressListGet200ResponseInner.JSON_PROPERTY_WHITE_STATUS
})
@JsonTypeName("_sapi_v1_capital_withdraw_address_list_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1CapitalWithdrawAddressListGet200ResponseInner {
  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_ADDRESS_TAG = "addressTag";
  private String addressTag;

  public static final String JSON_PROPERTY_COIN = "coin";
  private String coin;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private String origin;

  public static final String JSON_PROPERTY_ORIGIN_TYPE = "originType";
  private String originType;

  public static final String JSON_PROPERTY_WHITE_STATUS = "whiteStatus";
  private Boolean whiteStatus;

  public SapiV1CapitalWithdrawAddressListGet200ResponseInner() {
  }

  public SapiV1CapitalWithdrawAddressListGet200ResponseInner address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0xD316E95Fd9E8E237Cb11f8200Babbc5D8D177BA4", required = true, value = "")
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


  public SapiV1CapitalWithdrawAddressListGet200ResponseInner addressTag(String addressTag) {
    
    this.addressTag = addressTag;
    return this;
  }

   /**
   * Get addressTag
   * @return addressTag
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "101764890", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddressTag() {
    return addressTag;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS_TAG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddressTag(String addressTag) {
    this.addressTag = addressTag;
  }


  public SapiV1CapitalWithdrawAddressListGet200ResponseInner coin(String coin) {
    
    this.coin = coin;
    return this;
  }

   /**
   * Get coin
   * @return coin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
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


  public SapiV1CapitalWithdrawAddressListGet200ResponseInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public SapiV1CapitalWithdrawAddressListGet200ResponseInner network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNetwork() {
    return network;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNetwork(String network) {
    this.network = network;
  }


  public SapiV1CapitalWithdrawAddressListGet200ResponseInner origin(String origin) {
    
    this.origin = origin;
    return this;
  }

   /**
   * Get origin
   * @return origin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrigin() {
    return origin;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrigin(String origin) {
    this.origin = origin;
  }


  public SapiV1CapitalWithdrawAddressListGet200ResponseInner originType(String originType) {
    
    this.originType = originType;
    return this;
  }

   /**
   * Get originType
   * @return originType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORIGIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOriginType() {
    return originType;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOriginType(String originType) {
    this.originType = originType;
  }


  public SapiV1CapitalWithdrawAddressListGet200ResponseInner whiteStatus(Boolean whiteStatus) {
    
    this.whiteStatus = whiteStatus;
    return this;
  }

   /**
   * Get whiteStatus
   * @return whiteStatus
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WHITE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getWhiteStatus() {
    return whiteStatus;
  }


  @JsonProperty(JSON_PROPERTY_WHITE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWhiteStatus(Boolean whiteStatus) {
    this.whiteStatus = whiteStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1CapitalWithdrawAddressListGet200ResponseInner sapiV1CapitalWithdrawAddressListGet200ResponseInner = (SapiV1CapitalWithdrawAddressListGet200ResponseInner) o;
    return Objects.equals(this.address, sapiV1CapitalWithdrawAddressListGet200ResponseInner.address) &&
        Objects.equals(this.addressTag, sapiV1CapitalWithdrawAddressListGet200ResponseInner.addressTag) &&
        Objects.equals(this.coin, sapiV1CapitalWithdrawAddressListGet200ResponseInner.coin) &&
        Objects.equals(this.name, sapiV1CapitalWithdrawAddressListGet200ResponseInner.name) &&
        Objects.equals(this.network, sapiV1CapitalWithdrawAddressListGet200ResponseInner.network) &&
        Objects.equals(this.origin, sapiV1CapitalWithdrawAddressListGet200ResponseInner.origin) &&
        Objects.equals(this.originType, sapiV1CapitalWithdrawAddressListGet200ResponseInner.originType) &&
        Objects.equals(this.whiteStatus, sapiV1CapitalWithdrawAddressListGet200ResponseInner.whiteStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, addressTag, coin, name, network, origin, originType, whiteStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1CapitalWithdrawAddressListGet200ResponseInner {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    addressTag: ").append(toIndentedString(addressTag)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    originType: ").append(toIndentedString(originType)).append("\n");
    sb.append("    whiteStatus: ").append(toIndentedString(whiteStatus)).append("\n");
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

