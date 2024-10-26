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
 * SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner
 */
@JsonPropertyOrder({
  SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.JSON_PROPERTY_USER_ID,
  SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.JSON_PROPERTY_BTC,
  SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.JSON_PROPERTY_BTC_FUTURES,
  SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.JSON_PROPERTY_BTC_MARGIN,
  SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.JSON_PROPERTY_BUSD,
  SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.JSON_PROPERTY_BUSD_FUTURES,
  SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.JSON_PROPERTY_BUSD_MARGIN,
  SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.JSON_PROPERTY_DATE
})
@JsonTypeName("_sapi_v1_sub_account_transaction_statistics_get_200_response_tradeInfoVos_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner {
  public static final String JSON_PROPERTY_USER_ID = "userId";
  private Long userId;

  public static final String JSON_PROPERTY_BTC = "btc";
  private Float btc;

  public static final String JSON_PROPERTY_BTC_FUTURES = "btcFutures";
  private Float btcFutures;

  public static final String JSON_PROPERTY_BTC_MARGIN = "btcMargin";
  private Float btcMargin;

  public static final String JSON_PROPERTY_BUSD = "busd";
  private Float busd;

  public static final String JSON_PROPERTY_BUSD_FUTURES = "busdFutures";
  private Float busdFutures;

  public static final String JSON_PROPERTY_BUSD_MARGIN = "busdMargin";
  private Float busdMargin;

  public static final String JSON_PROPERTY_DATE = "date";
  private Long date;

  public SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner() {
  }

  public SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner userId(Long userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1000138138384", value = "")
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserId(Long userId) {
    this.userId = userId;
  }


  public SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner btc(Float btc) {
    
    this.btc = btc;
    return this;
  }

   /**
   * Get btc
   * @return btc
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_BTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getBtc() {
    return btc;
  }


  @JsonProperty(JSON_PROPERTY_BTC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBtc(Float btc) {
    this.btc = btc;
  }


  public SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner btcFutures(Float btcFutures) {
    
    this.btcFutures = btcFutures;
    return this;
  }

   /**
   * Get btcFutures
   * @return btcFutures
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_BTC_FUTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getBtcFutures() {
    return btcFutures;
  }


  @JsonProperty(JSON_PROPERTY_BTC_FUTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBtcFutures(Float btcFutures) {
    this.btcFutures = btcFutures;
  }


  public SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner btcMargin(Float btcMargin) {
    
    this.btcMargin = btcMargin;
    return this;
  }

   /**
   * Get btcMargin
   * @return btcMargin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_BTC_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getBtcMargin() {
    return btcMargin;
  }


  @JsonProperty(JSON_PROPERTY_BTC_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBtcMargin(Float btcMargin) {
    this.btcMargin = btcMargin;
  }


  public SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner busd(Float busd) {
    
    this.busd = busd;
    return this;
  }

   /**
   * Get busd
   * @return busd
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_BUSD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getBusd() {
    return busd;
  }


  @JsonProperty(JSON_PROPERTY_BUSD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusd(Float busd) {
    this.busd = busd;
  }


  public SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner busdFutures(Float busdFutures) {
    
    this.busdFutures = busdFutures;
    return this;
  }

   /**
   * Get busdFutures
   * @return busdFutures
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_BUSD_FUTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getBusdFutures() {
    return busdFutures;
  }


  @JsonProperty(JSON_PROPERTY_BUSD_FUTURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusdFutures(Float busdFutures) {
    this.busdFutures = busdFutures;
  }


  public SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner busdMargin(Float busdMargin) {
    
    this.busdMargin = busdMargin;
    return this;
  }

   /**
   * Get busdMargin
   * @return busdMargin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")
  @JsonProperty(JSON_PROPERTY_BUSD_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getBusdMargin() {
    return busdMargin;
  }


  @JsonProperty(JSON_PROPERTY_BUSD_MARGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusdMargin(Float busdMargin) {
    this.busdMargin = busdMargin;
  }


  public SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner date(Long date) {
    
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "1676851200000", value = "")
  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getDate() {
    return date;
  }


  @JsonProperty(JSON_PROPERTY_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDate(Long date) {
    this.date = date;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner sapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner = (SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner) o;
    return Objects.equals(this.userId, sapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.userId) &&
        Objects.equals(this.btc, sapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.btc) &&
        Objects.equals(this.btcFutures, sapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.btcFutures) &&
        Objects.equals(this.btcMargin, sapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.btcMargin) &&
        Objects.equals(this.busd, sapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.busd) &&
        Objects.equals(this.busdFutures, sapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.busdFutures) &&
        Objects.equals(this.busdMargin, sapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.busdMargin) &&
        Objects.equals(this.date, sapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, btc, btcFutures, btcMargin, busd, busdFutures, busdMargin, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SubAccountTransactionStatisticsGet200ResponseTradeInfoVosInner {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    btc: ").append(toIndentedString(btc)).append("\n");
    sb.append("    btcFutures: ").append(toIndentedString(btcFutures)).append("\n");
    sb.append("    btcMargin: ").append(toIndentedString(btcMargin)).append("\n");
    sb.append("    busd: ").append(toIndentedString(busd)).append("\n");
    sb.append("    busdFutures: ").append(toIndentedString(busdFutures)).append("\n");
    sb.append("    busdMargin: ").append(toIndentedString(busdMargin)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

