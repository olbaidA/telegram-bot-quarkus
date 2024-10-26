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
 * SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner
 */
@JsonPropertyOrder({
  SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner.JSON_PROPERTY_NETWORK,
  SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner.JSON_PROPERTY_TOKEN_ID,
  SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner.JSON_PROPERTY_CONTRACT_ADDRESS
})
@JsonTypeName("_sapi_v1_nft_history_transactions_get_200_response_list_inner_tokens_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner {
  public static final String JSON_PROPERTY_NETWORK = "network";
  private String network;

  public static final String JSON_PROPERTY_TOKEN_ID = "tokenId";
  private String tokenId;

  public static final String JSON_PROPERTY_CONTRACT_ADDRESS = "contractAddress";
  private String contractAddress;

  public SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner() {
  }

  public SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner network(String network) {
    
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


  public SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner tokenId(String tokenId) {
    
    this.tokenId = tokenId;
    return this;
  }

   /**
   * Get tokenId
   * @return tokenId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "216000000496", required = true, value = "")
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


  public SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner contractAddress(String contractAddress) {
    
    this.contractAddress = contractAddress;
    return this;
  }

   /**
   * Get contractAddress
   * @return contractAddress
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "MYSTERY_BOX0000087", required = true, value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner sapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner = (SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner) o;
    return Objects.equals(this.network, sapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner.network) &&
        Objects.equals(this.tokenId, sapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner.tokenId) &&
        Objects.equals(this.contractAddress, sapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner.contractAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(network, tokenId, contractAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner {\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    contractAddress: ").append(toIndentedString(contractAddress)).append("\n");
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
