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
import com.olbaid.binance.service.model.SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1NftHistoryTransactionsGet200ResponseListInner
 */
@JsonPropertyOrder({
  SapiV1NftHistoryTransactionsGet200ResponseListInner.JSON_PROPERTY_ORDER_NO,
  SapiV1NftHistoryTransactionsGet200ResponseListInner.JSON_PROPERTY_TOKENS,
  SapiV1NftHistoryTransactionsGet200ResponseListInner.JSON_PROPERTY_TRADE_TIME,
  SapiV1NftHistoryTransactionsGet200ResponseListInner.JSON_PROPERTY_TRADE_AMOUNT,
  SapiV1NftHistoryTransactionsGet200ResponseListInner.JSON_PROPERTY_TRADE_CURRENCY
})
@JsonTypeName("_sapi_v1_nft_history_transactions_get_200_response_list_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1NftHistoryTransactionsGet200ResponseListInner {
  public static final String JSON_PROPERTY_ORDER_NO = "orderNo";
  private String orderNo;

  public static final String JSON_PROPERTY_TOKENS = "tokens";
  private List<SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner> tokens = new ArrayList<>();

  public static final String JSON_PROPERTY_TRADE_TIME = "tradeTime";
  private Long tradeTime;

  public static final String JSON_PROPERTY_TRADE_AMOUNT = "tradeAmount";
  private String tradeAmount;

  public static final String JSON_PROPERTY_TRADE_CURRENCY = "tradeCurrency";
  private String tradeCurrency;

  public SapiV1NftHistoryTransactionsGet200ResponseListInner() {
  }

  public SapiV1NftHistoryTransactionsGet200ResponseListInner orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * 0: purchase order, 1: sell order, 2: royalty income, 3: primary market order, 4: mint fee
   * @return orderNo
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1_470502070600699904", required = true, value = "0: purchase order, 1: sell order, 2: royalty income, 3: primary market order, 4: mint fee")
  @JsonProperty(JSON_PROPERTY_ORDER_NO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOrderNo() {
    return orderNo;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_NO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public SapiV1NftHistoryTransactionsGet200ResponseListInner tokens(List<SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner> tokens) {
    
    this.tokens = tokens;
    return this;
  }

  public SapiV1NftHistoryTransactionsGet200ResponseListInner addTokensItem(SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner tokensItem) {
    this.tokens.add(tokensItem);
    return this;
  }

   /**
   * Get tokens
   * @return tokens
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner> getTokens() {
    return tokens;
  }


  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokens(List<SapiV1NftHistoryTransactionsGet200ResponseListInnerTokensInner> tokens) {
    this.tokens = tokens;
  }


  public SapiV1NftHistoryTransactionsGet200ResponseListInner tradeTime(Long tradeTime) {
    
    this.tradeTime = tradeTime;
    return this;
  }

   /**
   * Get tradeTime
   * @return tradeTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1626941236000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTradeTime() {
    return tradeTime;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTradeTime(Long tradeTime) {
    this.tradeTime = tradeTime;
  }


  public SapiV1NftHistoryTransactionsGet200ResponseListInner tradeAmount(String tradeAmount) {
    
    this.tradeAmount = tradeAmount;
    return this;
  }

   /**
   * Get tradeAmount
   * @return tradeAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "19.60000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTradeAmount() {
    return tradeAmount;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTradeAmount(String tradeAmount) {
    this.tradeAmount = tradeAmount;
  }


  public SapiV1NftHistoryTransactionsGet200ResponseListInner tradeCurrency(String tradeCurrency) {
    
    this.tradeCurrency = tradeCurrency;
    return this;
  }

   /**
   * Get tradeCurrency
   * @return tradeCurrency
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRADE_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTradeCurrency() {
    return tradeCurrency;
  }


  @JsonProperty(JSON_PROPERTY_TRADE_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTradeCurrency(String tradeCurrency) {
    this.tradeCurrency = tradeCurrency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1NftHistoryTransactionsGet200ResponseListInner sapiV1NftHistoryTransactionsGet200ResponseListInner = (SapiV1NftHistoryTransactionsGet200ResponseListInner) o;
    return Objects.equals(this.orderNo, sapiV1NftHistoryTransactionsGet200ResponseListInner.orderNo) &&
        Objects.equals(this.tokens, sapiV1NftHistoryTransactionsGet200ResponseListInner.tokens) &&
        Objects.equals(this.tradeTime, sapiV1NftHistoryTransactionsGet200ResponseListInner.tradeTime) &&
        Objects.equals(this.tradeAmount, sapiV1NftHistoryTransactionsGet200ResponseListInner.tradeAmount) &&
        Objects.equals(this.tradeCurrency, sapiV1NftHistoryTransactionsGet200ResponseListInner.tradeCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNo, tokens, tradeTime, tradeAmount, tradeCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1NftHistoryTransactionsGet200ResponseListInner {\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    tradeTime: ").append(toIndentedString(tradeTime)).append("\n");
    sb.append("    tradeAmount: ").append(toIndentedString(tradeAmount)).append("\n");
    sb.append("    tradeCurrency: ").append(toIndentedString(tradeCurrency)).append("\n");
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

