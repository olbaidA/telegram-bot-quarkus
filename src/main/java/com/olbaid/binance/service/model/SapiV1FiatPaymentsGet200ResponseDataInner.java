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
 * SapiV1FiatPaymentsGet200ResponseDataInner
 */
@JsonPropertyOrder({
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_ORDER_NO,
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_SOURCE_AMOUNT,
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_FIAT_CURRENCY,
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_OBTAIN_AMOUNT,
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_CRYPTO_CURRENCY,
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_TOTAL_FEE,
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_PRICE,
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_STATUS,
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_CREATE_TIME,
  SapiV1FiatPaymentsGet200ResponseDataInner.JSON_PROPERTY_UPDATE_TIME
})
@JsonTypeName("_sapi_v1_fiat_payments_get_200_response_data_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1FiatPaymentsGet200ResponseDataInner {
  public static final String JSON_PROPERTY_ORDER_NO = "orderNo";
  private String orderNo;

  public static final String JSON_PROPERTY_SOURCE_AMOUNT = "sourceAmount";
  private String sourceAmount;

  public static final String JSON_PROPERTY_FIAT_CURRENCY = "fiatCurrency";
  private String fiatCurrency;

  public static final String JSON_PROPERTY_OBTAIN_AMOUNT = "obtainAmount";
  private String obtainAmount;

  public static final String JSON_PROPERTY_CRYPTO_CURRENCY = "cryptoCurrency";
  private String cryptoCurrency;

  public static final String JSON_PROPERTY_TOTAL_FEE = "totalFee";
  private String totalFee;

  public static final String JSON_PROPERTY_PRICE = "price";
  private String price;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private Long createTime;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private Long updateTime;

  public SapiV1FiatPaymentsGet200ResponseDataInner() {
  }

  public SapiV1FiatPaymentsGet200ResponseDataInner orderNo(String orderNo) {
    
    this.orderNo = orderNo;
    return this;
  }

   /**
   * Get orderNo
   * @return orderNo
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "353fca443f06466db0c4dc89f94f027a", required = true, value = "")
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


  public SapiV1FiatPaymentsGet200ResponseDataInner sourceAmount(String sourceAmount) {
    
    this.sourceAmount = sourceAmount;
    return this;
  }

   /**
   * Fiat trade amount
   * @return sourceAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "20.00", required = true, value = "Fiat trade amount")
  @JsonProperty(JSON_PROPERTY_SOURCE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceAmount() {
    return sourceAmount;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceAmount(String sourceAmount) {
    this.sourceAmount = sourceAmount;
  }


  public SapiV1FiatPaymentsGet200ResponseDataInner fiatCurrency(String fiatCurrency) {
    
    this.fiatCurrency = fiatCurrency;
    return this;
  }

   /**
   * Fiat token
   * @return fiatCurrency
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "EUR", required = true, value = "Fiat token")
  @JsonProperty(JSON_PROPERTY_FIAT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFiatCurrency() {
    return fiatCurrency;
  }


  @JsonProperty(JSON_PROPERTY_FIAT_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFiatCurrency(String fiatCurrency) {
    this.fiatCurrency = fiatCurrency;
  }


  public SapiV1FiatPaymentsGet200ResponseDataInner obtainAmount(String obtainAmount) {
    
    this.obtainAmount = obtainAmount;
    return this;
  }

   /**
   * Crypto trade amount
   * @return obtainAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "4.462", required = true, value = "Crypto trade amount")
  @JsonProperty(JSON_PROPERTY_OBTAIN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getObtainAmount() {
    return obtainAmount;
  }


  @JsonProperty(JSON_PROPERTY_OBTAIN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setObtainAmount(String obtainAmount) {
    this.obtainAmount = obtainAmount;
  }


  public SapiV1FiatPaymentsGet200ResponseDataInner cryptoCurrency(String cryptoCurrency) {
    
    this.cryptoCurrency = cryptoCurrency;
    return this;
  }

   /**
   * Crypto token
   * @return cryptoCurrency
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "LUNA", required = true, value = "Crypto token")
  @JsonProperty(JSON_PROPERTY_CRYPTO_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCryptoCurrency() {
    return cryptoCurrency;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCryptoCurrency(String cryptoCurrency) {
    this.cryptoCurrency = cryptoCurrency;
  }


  public SapiV1FiatPaymentsGet200ResponseDataInner totalFee(String totalFee) {
    
    this.totalFee = totalFee;
    return this;
  }

   /**
   * Trade fee
   * @return totalFee
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.2", required = true, value = "Trade fee")
  @JsonProperty(JSON_PROPERTY_TOTAL_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalFee() {
    return totalFee;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }


  public SapiV1FiatPaymentsGet200ResponseDataInner price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "4.437472", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPrice() {
    return price;
  }


  @JsonProperty(JSON_PROPERTY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPrice(String price) {
    this.price = price;
  }


  public SapiV1FiatPaymentsGet200ResponseDataInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Processing, Completed, Failed, Refunded
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Failed", required = true, value = "Processing, Completed, Failed, Refunded")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public SapiV1FiatPaymentsGet200ResponseDataInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1624529919000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreateTime() {
    return createTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public SapiV1FiatPaymentsGet200ResponseDataInner updateTime(Long updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1624529919000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUpdateTime() {
    return updateTime;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUpdateTime(Long updateTime) {
    this.updateTime = updateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1FiatPaymentsGet200ResponseDataInner sapiV1FiatPaymentsGet200ResponseDataInner = (SapiV1FiatPaymentsGet200ResponseDataInner) o;
    return Objects.equals(this.orderNo, sapiV1FiatPaymentsGet200ResponseDataInner.orderNo) &&
        Objects.equals(this.sourceAmount, sapiV1FiatPaymentsGet200ResponseDataInner.sourceAmount) &&
        Objects.equals(this.fiatCurrency, sapiV1FiatPaymentsGet200ResponseDataInner.fiatCurrency) &&
        Objects.equals(this.obtainAmount, sapiV1FiatPaymentsGet200ResponseDataInner.obtainAmount) &&
        Objects.equals(this.cryptoCurrency, sapiV1FiatPaymentsGet200ResponseDataInner.cryptoCurrency) &&
        Objects.equals(this.totalFee, sapiV1FiatPaymentsGet200ResponseDataInner.totalFee) &&
        Objects.equals(this.price, sapiV1FiatPaymentsGet200ResponseDataInner.price) &&
        Objects.equals(this.status, sapiV1FiatPaymentsGet200ResponseDataInner.status) &&
        Objects.equals(this.createTime, sapiV1FiatPaymentsGet200ResponseDataInner.createTime) &&
        Objects.equals(this.updateTime, sapiV1FiatPaymentsGet200ResponseDataInner.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderNo, sourceAmount, fiatCurrency, obtainAmount, cryptoCurrency, totalFee, price, status, createTime, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1FiatPaymentsGet200ResponseDataInner {\n");
    sb.append("    orderNo: ").append(toIndentedString(orderNo)).append("\n");
    sb.append("    sourceAmount: ").append(toIndentedString(sourceAmount)).append("\n");
    sb.append("    fiatCurrency: ").append(toIndentedString(fiatCurrency)).append("\n");
    sb.append("    obtainAmount: ").append(toIndentedString(obtainAmount)).append("\n");
    sb.append("    cryptoCurrency: ").append(toIndentedString(cryptoCurrency)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

