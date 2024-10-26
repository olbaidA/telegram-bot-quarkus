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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1DciProductListGet200ResponseListInner
 */
@JsonPropertyOrder({
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_ID,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_INVEST_COIN,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_EXERCISED_COIN,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_STRIKE_PRICE,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_DURATION,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_SETTLE_DATE,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_PURCHASE_DECIMAL,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_PURCHASE_END_TIME,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_CAN_PURCHASE,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_APR,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_ORDER_ID,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_MIN_AMOUNT,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_MAX_AMOUNT,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_CREATE_TIMESTAMP,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_OPTION_TYPE,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_IS_AUTO_COMPOUND_ENABLE,
  SapiV1DciProductListGet200ResponseListInner.JSON_PROPERTY_AUTO_COMPOUND_PLAN_LIST
})
@JsonTypeName("_sapi_v1_dci_product_list_get_200_response_list_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1DciProductListGet200ResponseListInner {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INVEST_COIN = "investCoin";
  private String investCoin;

  public static final String JSON_PROPERTY_EXERCISED_COIN = "exercisedCoin";
  private String exercisedCoin;

  public static final String JSON_PROPERTY_STRIKE_PRICE = "strikePrice";
  private String strikePrice;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_SETTLE_DATE = "settleDate";
  private Long settleDate;

  public static final String JSON_PROPERTY_PURCHASE_DECIMAL = "purchaseDecimal";
  private Integer purchaseDecimal;

  public static final String JSON_PROPERTY_PURCHASE_END_TIME = "purchaseEndTime";
  private Long purchaseEndTime;

  public static final String JSON_PROPERTY_CAN_PURCHASE = "canPurchase";
  private Boolean canPurchase;

  public static final String JSON_PROPERTY_APR = "apr";
  private String apr;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_MIN_AMOUNT = "minAmount";
  private String minAmount;

  public static final String JSON_PROPERTY_MAX_AMOUNT = "maxAmount";
  private String maxAmount;

  public static final String JSON_PROPERTY_CREATE_TIMESTAMP = "createTimestamp";
  private Long createTimestamp;

  public static final String JSON_PROPERTY_OPTION_TYPE = "optionType";
  private String optionType;

  public static final String JSON_PROPERTY_IS_AUTO_COMPOUND_ENABLE = "isAutoCompoundEnable";
  private Boolean isAutoCompoundEnable;

  public static final String JSON_PROPERTY_AUTO_COMPOUND_PLAN_LIST = "autoCompoundPlanList";
  private List<String> autoCompoundPlanList = new ArrayList<>();

  public SapiV1DciProductListGet200ResponseListInner() {
  }

  public SapiV1DciProductListGet200ResponseListInner id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "741590", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setId(String id) {
    this.id = id;
  }


  public SapiV1DciProductListGet200ResponseListInner investCoin(String investCoin) {
    
    this.investCoin = investCoin;
    return this;
  }

   /**
   * Get investCoin
   * @return investCoin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "USDT", required = true, value = "")
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


  public SapiV1DciProductListGet200ResponseListInner exercisedCoin(String exercisedCoin) {
    
    this.exercisedCoin = exercisedCoin;
    return this;
  }

   /**
   * Get exercisedCoin
   * @return exercisedCoin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
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


  public SapiV1DciProductListGet200ResponseListInner strikePrice(String strikePrice) {
    
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


  public SapiV1DciProductListGet200ResponseListInner duration(Integer duration) {
    
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


  public SapiV1DciProductListGet200ResponseListInner settleDate(Long settleDate) {
    
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


  public SapiV1DciProductListGet200ResponseListInner purchaseDecimal(Integer purchaseDecimal) {
    
    this.purchaseDecimal = purchaseDecimal;
    return this;
  }

   /**
   * Get purchaseDecimal
   * @return purchaseDecimal
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "8", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PURCHASE_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPurchaseDecimal() {
    return purchaseDecimal;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASE_DECIMAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPurchaseDecimal(Integer purchaseDecimal) {
    this.purchaseDecimal = purchaseDecimal;
  }


  public SapiV1DciProductListGet200ResponseListInner purchaseEndTime(Long purchaseEndTime) {
    
    this.purchaseEndTime = purchaseEndTime;
    return this;
  }

   /**
   * Get purchaseEndTime
   * @return purchaseEndTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1708934400000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PURCHASE_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPurchaseEndTime() {
    return purchaseEndTime;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASE_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPurchaseEndTime(Long purchaseEndTime) {
    this.purchaseEndTime = purchaseEndTime;
  }


  public SapiV1DciProductListGet200ResponseListInner canPurchase(Boolean canPurchase) {
    
    this.canPurchase = canPurchase;
    return this;
  }

   /**
   * Get canPurchase
   * @return canPurchase
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CAN_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanPurchase() {
    return canPurchase;
  }


  @JsonProperty(JSON_PROPERTY_CAN_PURCHASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanPurchase(Boolean canPurchase) {
    this.canPurchase = canPurchase;
  }


  public SapiV1DciProductListGet200ResponseListInner apr(String apr) {
    
    this.apr = apr;
    return this;
  }

   /**
   * Get apr
   * @return apr
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.6076", required = true, value = "")
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


  public SapiV1DciProductListGet200ResponseListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "8257205859", required = true, value = "")
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


  public SapiV1DciProductListGet200ResponseListInner minAmount(String minAmount) {
    
    this.minAmount = minAmount;
    return this;
  }

   /**
   * Get minAmount
   * @return minAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MIN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMinAmount() {
    return minAmount;
  }


  @JsonProperty(JSON_PROPERTY_MIN_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMinAmount(String minAmount) {
    this.minAmount = minAmount;
  }


  public SapiV1DciProductListGet200ResponseListInner maxAmount(String maxAmount) {
    
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Get maxAmount
   * @return maxAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "25265.7", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMaxAmount() {
    return maxAmount;
  }


  @JsonProperty(JSON_PROPERTY_MAX_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }


  public SapiV1DciProductListGet200ResponseListInner createTimestamp(Long createTimestamp) {
    
    this.createTimestamp = createTimestamp;
    return this;
  }

   /**
   * Get createTimestamp
   * @return createTimestamp
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1708560084000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreateTimestamp() {
    return createTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreateTimestamp(Long createTimestamp) {
    this.createTimestamp = createTimestamp;
  }


  public SapiV1DciProductListGet200ResponseListInner optionType(String optionType) {
    
    this.optionType = optionType;
    return this;
  }

   /**
   * Get optionType
   * @return optionType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "PUT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_OPTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOptionType() {
    return optionType;
  }


  @JsonProperty(JSON_PROPERTY_OPTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOptionType(String optionType) {
    this.optionType = optionType;
  }


  public SapiV1DciProductListGet200ResponseListInner isAutoCompoundEnable(Boolean isAutoCompoundEnable) {
    
    this.isAutoCompoundEnable = isAutoCompoundEnable;
    return this;
  }

   /**
   * Get isAutoCompoundEnable
   * @return isAutoCompoundEnable
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_AUTO_COMPOUND_ENABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsAutoCompoundEnable() {
    return isAutoCompoundEnable;
  }


  @JsonProperty(JSON_PROPERTY_IS_AUTO_COMPOUND_ENABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsAutoCompoundEnable(Boolean isAutoCompoundEnable) {
    this.isAutoCompoundEnable = isAutoCompoundEnable;
  }


  public SapiV1DciProductListGet200ResponseListInner autoCompoundPlanList(List<String> autoCompoundPlanList) {
    
    this.autoCompoundPlanList = autoCompoundPlanList;
    return this;
  }

  public SapiV1DciProductListGet200ResponseListInner addAutoCompoundPlanListItem(String autoCompoundPlanListItem) {
    this.autoCompoundPlanList.add(autoCompoundPlanListItem);
    return this;
  }

   /**
   * Get autoCompoundPlanList
   * @return autoCompoundPlanList
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"STANDARD\",\"ADVANCE\"]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_COMPOUND_PLAN_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAutoCompoundPlanList() {
    return autoCompoundPlanList;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_COMPOUND_PLAN_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAutoCompoundPlanList(List<String> autoCompoundPlanList) {
    this.autoCompoundPlanList = autoCompoundPlanList;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1DciProductListGet200ResponseListInner sapiV1DciProductListGet200ResponseListInner = (SapiV1DciProductListGet200ResponseListInner) o;
    return Objects.equals(this.id, sapiV1DciProductListGet200ResponseListInner.id) &&
        Objects.equals(this.investCoin, sapiV1DciProductListGet200ResponseListInner.investCoin) &&
        Objects.equals(this.exercisedCoin, sapiV1DciProductListGet200ResponseListInner.exercisedCoin) &&
        Objects.equals(this.strikePrice, sapiV1DciProductListGet200ResponseListInner.strikePrice) &&
        Objects.equals(this.duration, sapiV1DciProductListGet200ResponseListInner.duration) &&
        Objects.equals(this.settleDate, sapiV1DciProductListGet200ResponseListInner.settleDate) &&
        Objects.equals(this.purchaseDecimal, sapiV1DciProductListGet200ResponseListInner.purchaseDecimal) &&
        Objects.equals(this.purchaseEndTime, sapiV1DciProductListGet200ResponseListInner.purchaseEndTime) &&
        Objects.equals(this.canPurchase, sapiV1DciProductListGet200ResponseListInner.canPurchase) &&
        Objects.equals(this.apr, sapiV1DciProductListGet200ResponseListInner.apr) &&
        Objects.equals(this.orderId, sapiV1DciProductListGet200ResponseListInner.orderId) &&
        Objects.equals(this.minAmount, sapiV1DciProductListGet200ResponseListInner.minAmount) &&
        Objects.equals(this.maxAmount, sapiV1DciProductListGet200ResponseListInner.maxAmount) &&
        Objects.equals(this.createTimestamp, sapiV1DciProductListGet200ResponseListInner.createTimestamp) &&
        Objects.equals(this.optionType, sapiV1DciProductListGet200ResponseListInner.optionType) &&
        Objects.equals(this.isAutoCompoundEnable, sapiV1DciProductListGet200ResponseListInner.isAutoCompoundEnable) &&
        Objects.equals(this.autoCompoundPlanList, sapiV1DciProductListGet200ResponseListInner.autoCompoundPlanList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, investCoin, exercisedCoin, strikePrice, duration, settleDate, purchaseDecimal, purchaseEndTime, canPurchase, apr, orderId, minAmount, maxAmount, createTimestamp, optionType, isAutoCompoundEnable, autoCompoundPlanList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1DciProductListGet200ResponseListInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    investCoin: ").append(toIndentedString(investCoin)).append("\n");
    sb.append("    exercisedCoin: ").append(toIndentedString(exercisedCoin)).append("\n");
    sb.append("    strikePrice: ").append(toIndentedString(strikePrice)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    settleDate: ").append(toIndentedString(settleDate)).append("\n");
    sb.append("    purchaseDecimal: ").append(toIndentedString(purchaseDecimal)).append("\n");
    sb.append("    purchaseEndTime: ").append(toIndentedString(purchaseEndTime)).append("\n");
    sb.append("    canPurchase: ").append(toIndentedString(canPurchase)).append("\n");
    sb.append("    apr: ").append(toIndentedString(apr)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    createTimestamp: ").append(toIndentedString(createTimestamp)).append("\n");
    sb.append("    optionType: ").append(toIndentedString(optionType)).append("\n");
    sb.append("    isAutoCompoundEnable: ").append(toIndentedString(isAutoCompoundEnable)).append("\n");
    sb.append("    autoCompoundPlanList: ").append(toIndentedString(autoCompoundPlanList)).append("\n");
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

