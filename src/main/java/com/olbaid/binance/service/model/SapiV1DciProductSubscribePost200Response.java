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
 * SapiV1DciProductSubscribePost200Response
 */
@JsonPropertyOrder({
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_POSITION_ID,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_INVEST_COIN,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_EXERCISED_COIN,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_SUBSCRIPTION_AMOUNT,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_DURATION,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_AUTO_COMPOUND_PLAN,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_STRIKE_PRICE,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_SETTLE_DATE,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_PURCHASE_STATUS,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_APR,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_ORDER_ID,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_PURCHASE_TIME,
  SapiV1DciProductSubscribePost200Response.JSON_PROPERTY_OPTION_TYPE_DOUBLE_QUOTE
})
@JsonTypeName("_sapi_v1_dci_product_subscribe_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1DciProductSubscribePost200Response {
  public static final String JSON_PROPERTY_POSITION_ID = "positionId";
  private Long positionId;

  public static final String JSON_PROPERTY_INVEST_COIN = "investCoin";
  private String investCoin;

  public static final String JSON_PROPERTY_EXERCISED_COIN = "exercisedCoin";
  private String exercisedCoin;

  public static final String JSON_PROPERTY_SUBSCRIPTION_AMOUNT = "subscriptionAmount";
  private String subscriptionAmount;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_AUTO_COMPOUND_PLAN = "autoCompoundPlan";
  private String autoCompoundPlan;

  public static final String JSON_PROPERTY_STRIKE_PRICE = "strikePrice";
  private String strikePrice;

  public static final String JSON_PROPERTY_SETTLE_DATE = "settleDate";
  private Long settleDate;

  public static final String JSON_PROPERTY_PURCHASE_STATUS = "purchaseStatus";
  private String purchaseStatus;

  public static final String JSON_PROPERTY_APR = "apr";
  private String apr;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_PURCHASE_TIME = "purchaseTime";
  private Long purchaseTime;

  public static final String JSON_PROPERTY_OPTION_TYPE_DOUBLE_QUOTE = "optionType&quot;";
  private String optionTypeDoubleQuote;

  public SapiV1DciProductSubscribePost200Response() {
  }

  public SapiV1DciProductSubscribePost200Response positionId(Long positionId) {
    
    this.positionId = positionId;
    return this;
  }

   /**
   * Get positionId
   * @return positionId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10208824", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POSITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPositionId() {
    return positionId;
  }


  @JsonProperty(JSON_PROPERTY_POSITION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPositionId(Long positionId) {
    this.positionId = positionId;
  }


  public SapiV1DciProductSubscribePost200Response investCoin(String investCoin) {
    
    this.investCoin = investCoin;
    return this;
  }

   /**
   * Get investCoin
   * @return investCoin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_INVEST_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getInvestCoin() {
    return investCoin;
  }


  @JsonProperty(JSON_PROPERTY_INVEST_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInvestCoin(String investCoin) {
    this.investCoin = investCoin;
  }


  public SapiV1DciProductSubscribePost200Response exercisedCoin(String exercisedCoin) {
    
    this.exercisedCoin = exercisedCoin;
    return this;
  }

   /**
   * Get exercisedCoin
   * @return exercisedCoin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXERCISED_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExercisedCoin() {
    return exercisedCoin;
  }


  @JsonProperty(JSON_PROPERTY_EXERCISED_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExercisedCoin(String exercisedCoin) {
    this.exercisedCoin = exercisedCoin;
  }


  public SapiV1DciProductSubscribePost200Response subscriptionAmount(String subscriptionAmount) {
    
    this.subscriptionAmount = subscriptionAmount;
    return this;
  }

   /**
   * Get subscriptionAmount
   * @return subscriptionAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.002", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubscriptionAmount() {
    return subscriptionAmount;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionAmount(String subscriptionAmount) {
    this.subscriptionAmount = subscriptionAmount;
  }


  public SapiV1DciProductSubscribePost200Response duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "4", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public SapiV1DciProductSubscribePost200Response autoCompoundPlan(String autoCompoundPlan) {
    
    this.autoCompoundPlan = autoCompoundPlan;
    return this;
  }

   /**
   * STANDARD, ADVANCED, this field won&#39;t display when autocompound is set to None
   * @return autoCompoundPlan
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "STANDARD", required = true, value = "STANDARD, ADVANCED, this field won't display when autocompound is set to None")
  @JsonProperty(JSON_PROPERTY_AUTO_COMPOUND_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAutoCompoundPlan() {
    return autoCompoundPlan;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_COMPOUND_PLAN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAutoCompoundPlan(String autoCompoundPlan) {
    this.autoCompoundPlan = autoCompoundPlan;
  }


  public SapiV1DciProductSubscribePost200Response strikePrice(String strikePrice) {
    
    this.strikePrice = strikePrice;
    return this;
  }

   /**
   * Get strikePrice
   * @return strikePrice
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "380", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STRIKE_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStrikePrice() {
    return strikePrice;
  }


  @JsonProperty(JSON_PROPERTY_STRIKE_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStrikePrice(String strikePrice) {
    this.strikePrice = strikePrice;
  }


  public SapiV1DciProductSubscribePost200Response settleDate(Long settleDate) {
    
    this.settleDate = settleDate;
    return this;
  }

   /**
   * Get settleDate
   * @return settleDate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1709020800000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SETTLE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSettleDate() {
    return settleDate;
  }


  @JsonProperty(JSON_PROPERTY_SETTLE_DATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSettleDate(Long settleDate) {
    this.settleDate = settleDate;
  }


  public SapiV1DciProductSubscribePost200Response purchaseStatus(String purchaseStatus) {
    
    this.purchaseStatus = purchaseStatus;
    return this;
  }

   /**
   * Get purchaseStatus
   * @return purchaseStatus
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "PURCHASE_SUCCESS", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PURCHASE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPurchaseStatus() {
    return purchaseStatus;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPurchaseStatus(String purchaseStatus) {
    this.purchaseStatus = purchaseStatus;
  }


  public SapiV1DciProductSubscribePost200Response apr(String apr) {
    
    this.apr = apr;
    return this;
  }

   /**
   * Get apr
   * @return apr
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.7397", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_APR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApr() {
    return apr;
  }


  @JsonProperty(JSON_PROPERTY_APR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApr(String apr) {
    this.apr = apr;
  }


  public SapiV1DciProductSubscribePost200Response orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "8259117597", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public SapiV1DciProductSubscribePost200Response purchaseTime(Long purchaseTime) {
    
    this.purchaseTime = purchaseTime;
    return this;
  }

   /**
   * Get purchaseTime
   * @return purchaseTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1708677583874", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PURCHASE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPurchaseTime() {
    return purchaseTime;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPurchaseTime(Long purchaseTime) {
    this.purchaseTime = purchaseTime;
  }


  public SapiV1DciProductSubscribePost200Response optionTypeDoubleQuote(String optionTypeDoubleQuote) {
    
    this.optionTypeDoubleQuote = optionTypeDoubleQuote;
    return this;
  }

   /**
   * Get optionTypeDoubleQuote
   * @return optionTypeDoubleQuote
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(example = "CALL", value = "")
  @JsonProperty(JSON_PROPERTY_OPTION_TYPE_DOUBLE_QUOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOptionTypeDoubleQuote() {
    return optionTypeDoubleQuote;
  }


  @JsonProperty(JSON_PROPERTY_OPTION_TYPE_DOUBLE_QUOTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOptionTypeDoubleQuote(String optionTypeDoubleQuote) {
    this.optionTypeDoubleQuote = optionTypeDoubleQuote;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1DciProductSubscribePost200Response sapiV1DciProductSubscribePost200Response = (SapiV1DciProductSubscribePost200Response) o;
    return Objects.equals(this.positionId, sapiV1DciProductSubscribePost200Response.positionId) &&
        Objects.equals(this.investCoin, sapiV1DciProductSubscribePost200Response.investCoin) &&
        Objects.equals(this.exercisedCoin, sapiV1DciProductSubscribePost200Response.exercisedCoin) &&
        Objects.equals(this.subscriptionAmount, sapiV1DciProductSubscribePost200Response.subscriptionAmount) &&
        Objects.equals(this.duration, sapiV1DciProductSubscribePost200Response.duration) &&
        Objects.equals(this.autoCompoundPlan, sapiV1DciProductSubscribePost200Response.autoCompoundPlan) &&
        Objects.equals(this.strikePrice, sapiV1DciProductSubscribePost200Response.strikePrice) &&
        Objects.equals(this.settleDate, sapiV1DciProductSubscribePost200Response.settleDate) &&
        Objects.equals(this.purchaseStatus, sapiV1DciProductSubscribePost200Response.purchaseStatus) &&
        Objects.equals(this.apr, sapiV1DciProductSubscribePost200Response.apr) &&
        Objects.equals(this.orderId, sapiV1DciProductSubscribePost200Response.orderId) &&
        Objects.equals(this.purchaseTime, sapiV1DciProductSubscribePost200Response.purchaseTime) &&
        Objects.equals(this.optionTypeDoubleQuote, sapiV1DciProductSubscribePost200Response.optionTypeDoubleQuote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positionId, investCoin, exercisedCoin, subscriptionAmount, duration, autoCompoundPlan, strikePrice, settleDate, purchaseStatus, apr, orderId, purchaseTime, optionTypeDoubleQuote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1DciProductSubscribePost200Response {\n");
    sb.append("    positionId: ").append(toIndentedString(positionId)).append("\n");
    sb.append("    investCoin: ").append(toIndentedString(investCoin)).append("\n");
    sb.append("    exercisedCoin: ").append(toIndentedString(exercisedCoin)).append("\n");
    sb.append("    subscriptionAmount: ").append(toIndentedString(subscriptionAmount)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    autoCompoundPlan: ").append(toIndentedString(autoCompoundPlan)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    settleDate: ").append(toIndentedString(settleDate)).append("\n");
    sb.append("    purchaseStatus: ").append(toIndentedString(purchaseStatus)).append("\n");
    sb.append("    apr: ").append(toIndentedString(apr)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    purchaseTime: ").append(toIndentedString(purchaseTime)).append("\n");
    sb.append("    optionTypeDoubleQuote: ").append(toIndentedString(optionTypeDoubleQuote)).append("\n");
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

