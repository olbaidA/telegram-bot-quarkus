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
 * SapiV1NftUserGetAssetGet200ResponseListInner
 */
@JsonPropertyOrder({
  SapiV1NftUserGetAssetGet200ResponseListInner.JSON_PROPERTY_NETWORK,
  SapiV1NftUserGetAssetGet200ResponseListInner.JSON_PROPERTY_CONTRACT_ADDRESS,
  SapiV1NftUserGetAssetGet200ResponseListInner.JSON_PROPERTY_TOKEN_ID
})
@JsonTypeName("_sapi_v1_nft_user_getAsset_get_200_response_list_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1NftUserGetAssetGet200ResponseListInner {
  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_CONTRACT_ADDRESS = "contractAddress";
  private String contractAddress;

  public static final String JSON_PROPERTY_TOKEN_ID = "tokenId";
  private String tokenId;

  public SapiV1NftUserGetAssetGet200ResponseListInner() {
  }

  public SapiV1NftUserGetAssetGet200ResponseListInner network(String network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BSC", required = true, value = "")
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


  public SapiV1NftUserGetAssetGet200ResponseListInner contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Get contractAddress
   * @return contractAddress
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "REGULAR11234567891779", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContractAddress() {
    return contractAddress;
  }


  @JsonProperty(JSON_PROPERTY_CONTRACT_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContractAddress(String contractAddress) {
    this.contractAddress = contractAddress;
  }


  public SapiV1NftUserGetAssetGet200ResponseListInner tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "100900000017", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenId() {
    return tokenId;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1NftUserGetAssetGet200ResponseListInner sapiV1NftUserGetAssetGet200ResponseListInner = (SapiV1NftUserGetAssetGet200ResponseListInner) o;
    return Objects.equals(this.network, sapiV1NftUserGetAssetGet200ResponseListInner.network) &&
        Objects.equals(this.contractAddress, sapiV1NftUserGetAssetGet200ResponseListInner.contractAddress) &&
        Objects.equals(this.tokenId, sapiV1NftUserGetAssetGet200ResponseListInner.tokenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, contractAddress, tokenId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1NftUserGetAssetGet200ResponseListInner {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
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

