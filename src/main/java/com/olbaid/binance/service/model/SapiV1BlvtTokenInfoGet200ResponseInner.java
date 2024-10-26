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
import com.olbaid.binance.service.model.SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1BlvtTokenInfoGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_TOKEN_NAME,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_DESCRIPTION,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_UNDERLYING,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_TOKEN_ISSUED,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_BASKET,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_CURRENT_BASKETS,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_NAV,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_REAL_LEVERAGE,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_FUNDING_RATE,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_DAILY_MANAGEMENT_FEE,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_PURCHASE_FEE_PCT,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_DAILY_PURCHASE_LIMIT,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_REDEEM_FEE_PCT,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_DAILY_REDEEM_LIMIT,
  SapiV1BlvtTokenInfoGet200ResponseInner.JSON_PROPERTY_TIMESTAMP
})
@JsonTypeName("_sapi_v1_blvt_tokenInfo_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1BlvtTokenInfoGet200ResponseInner {
  public static final String JSON_PROPERTY_TOKEN_NAME = "tokenName";
  private String tokenName;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_UNDERLYING = "underlying";
  private String underlying;

  public static final String JSON_PROPERTY_TOKEN_ISSUED = "tokenIssued";
  private String tokenIssued;

  public static final String JSON_PROPERTY_BASKET = "basket";
  private String basket;

  public static final String JSON_PROPERTY_CURRENT_BASKETS = "currentBaskets";
  private List<SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner> currentBaskets = new ArrayList<>();

  public static final String JSON_PROPERTY_NAV = "nav";
  private String nav;

  public static final String JSON_PROPERTY_REAL_LEVERAGE = "realLeverage";
  private String realLeverage;

  public static final String JSON_PROPERTY_FUNDING_RATE = "fundingRate";
  private String fundingRate;

  public static final String JSON_PROPERTY_DAILY_MANAGEMENT_FEE = "dailyManagementFee";
  private String dailyManagementFee;

  public static final String JSON_PROPERTY_PURCHASE_FEE_PCT = "purchaseFeePct";
  private String purchaseFeePct;

  public static final String JSON_PROPERTY_DAILY_PURCHASE_LIMIT = "dailyPurchaseLimit";
  private String dailyPurchaseLimit;

  public static final String JSON_PROPERTY_REDEEM_FEE_PCT = "redeemFeePct";
  private String redeemFeePct;

  public static final String JSON_PROPERTY_DAILY_REDEEM_LIMIT = "dailyRedeemLimit";
  private String dailyRedeemLimit;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public SapiV1BlvtTokenInfoGet200ResponseInner() {
  }

  public SapiV1BlvtTokenInfoGet200ResponseInner tokenName(String tokenName) {
    
    this.tokenName = tokenName;
    return this;
  }

   /**
   * Get tokenName
   * @return tokenName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTCDOWN", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenName() {
    return tokenName;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenName(String tokenName) {
    this.tokenName = tokenName;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "3X Short Bitcoin Token", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner underlying(String underlying) {
    
    this.underlying = underlying;
    return this;
  }

   /**
   * Get underlying
   * @return underlying
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UNDERLYING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnderlying() {
    return underlying;
  }


  @JsonProperty(JSON_PROPERTY_UNDERLYING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnderlying(String underlying) {
    this.underlying = underlying;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner tokenIssued(String tokenIssued) {
    
    this.tokenIssued = tokenIssued;
    return this;
  }

   /**
   * Get tokenIssued
   * @return tokenIssued
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "717953.95", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOKEN_ISSUED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenIssued() {
    return tokenIssued;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_ISSUED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenIssued(String tokenIssued) {
    this.tokenIssued = tokenIssued;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner basket(String basket) {
    
    this.basket = basket;
    return this;
  }

   /**
   * Get basket
   * @return basket
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "-821.474 BTCUSDT Futures", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BASKET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBasket() {
    return basket;
  }


  @JsonProperty(JSON_PROPERTY_BASKET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBasket(String basket) {
    this.basket = basket;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner currentBaskets(List<SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner> currentBaskets) {
    
    this.currentBaskets = currentBaskets;
    return this;
  }

  public SapiV1BlvtTokenInfoGet200ResponseInner addCurrentBasketsItem(SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner currentBasketsItem) {
    this.currentBaskets.add(currentBasketsItem);
    return this;
  }

   /**
   * Get currentBaskets
   * @return currentBaskets
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_BASKETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner> getCurrentBaskets() {
    return currentBaskets;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_BASKETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentBaskets(List<SapiV1BlvtTokenInfoGet200ResponseInnerCurrentBasketsInner> currentBaskets) {
    this.currentBaskets = currentBaskets;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner nav(String nav) {
    
    this.nav = nav;
    return this;
  }

   /**
   * Get nav
   * @return nav
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "4.79", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNav() {
    return nav;
  }


  @JsonProperty(JSON_PROPERTY_NAV)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNav(String nav) {
    this.nav = nav;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner realLeverage(String realLeverage) {
    
    this.realLeverage = realLeverage;
    return this;
  }

   /**
   * Get realLeverage
   * @return realLeverage
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "-2.316", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REAL_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRealLeverage() {
    return realLeverage;
  }


  @JsonProperty(JSON_PROPERTY_REAL_LEVERAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRealLeverage(String realLeverage) {
    this.realLeverage = realLeverage;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner fundingRate(String fundingRate) {
    
    this.fundingRate = fundingRate;
    return this;
  }

   /**
   * Get fundingRate
   * @return fundingRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.001020", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FUNDING_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFundingRate() {
    return fundingRate;
  }


  @JsonProperty(JSON_PROPERTY_FUNDING_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFundingRate(String fundingRate) {
    this.fundingRate = fundingRate;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner dailyManagementFee(String dailyManagementFee) {
    
    this.dailyManagementFee = dailyManagementFee;
    return this;
  }

   /**
   * Get dailyManagementFee
   * @return dailyManagementFee
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.0001", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DAILY_MANAGEMENT_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDailyManagementFee() {
    return dailyManagementFee;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_MANAGEMENT_FEE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDailyManagementFee(String dailyManagementFee) {
    this.dailyManagementFee = dailyManagementFee;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner purchaseFeePct(String purchaseFeePct) {
    
    this.purchaseFeePct = purchaseFeePct;
    return this;
  }

   /**
   * Get purchaseFeePct
   * @return purchaseFeePct
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.0010", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PURCHASE_FEE_PCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPurchaseFeePct() {
    return purchaseFeePct;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASE_FEE_PCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPurchaseFeePct(String purchaseFeePct) {
    this.purchaseFeePct = purchaseFeePct;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner dailyPurchaseLimit(String dailyPurchaseLimit) {
    
    this.dailyPurchaseLimit = dailyPurchaseLimit;
    return this;
  }

   /**
   * Get dailyPurchaseLimit
   * @return dailyPurchaseLimit
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "100000.00", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DAILY_PURCHASE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDailyPurchaseLimit() {
    return dailyPurchaseLimit;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_PURCHASE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDailyPurchaseLimit(String dailyPurchaseLimit) {
    this.dailyPurchaseLimit = dailyPurchaseLimit;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner redeemFeePct(String redeemFeePct) {
    
    this.redeemFeePct = redeemFeePct;
    return this;
  }

   /**
   * Get redeemFeePct
   * @return redeemFeePct
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.0010", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REDEEM_FEE_PCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRedeemFeePct() {
    return redeemFeePct;
  }


  @JsonProperty(JSON_PROPERTY_REDEEM_FEE_PCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedeemFeePct(String redeemFeePct) {
    this.redeemFeePct = redeemFeePct;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner dailyRedeemLimit(String dailyRedeemLimit) {
    
    this.dailyRedeemLimit = dailyRedeemLimit;
    return this;
  }

   /**
   * Get dailyRedeemLimit
   * @return dailyRedeemLimit
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1000000.00", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DAILY_REDEEM_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDailyRedeemLimit() {
    return dailyRedeemLimit;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_REDEEM_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDailyRedeemLimit(String dailyRedeemLimit) {
    this.dailyRedeemLimit = dailyRedeemLimit;
  }


  public SapiV1BlvtTokenInfoGet200ResponseInner timestamp(Long timestamp) {
    
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1583127900000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1BlvtTokenInfoGet200ResponseInner sapiV1BlvtTokenInfoGet200ResponseInner = (SapiV1BlvtTokenInfoGet200ResponseInner) o;
    return Objects.equals(this.tokenName, sapiV1BlvtTokenInfoGet200ResponseInner.tokenName) &&
        Objects.equals(this.description, sapiV1BlvtTokenInfoGet200ResponseInner.description) &&
        Objects.equals(this.underlying, sapiV1BlvtTokenInfoGet200ResponseInner.underlying) &&
        Objects.equals(this.tokenIssued, sapiV1BlvtTokenInfoGet200ResponseInner.tokenIssued) &&
        Objects.equals(this.basket, sapiV1BlvtTokenInfoGet200ResponseInner.basket) &&
        Objects.equals(this.currentBaskets, sapiV1BlvtTokenInfoGet200ResponseInner.currentBaskets) &&
        Objects.equals(this.nav, sapiV1BlvtTokenInfoGet200ResponseInner.nav) &&
        Objects.equals(this.realLeverage, sapiV1BlvtTokenInfoGet200ResponseInner.realLeverage) &&
        Objects.equals(this.fundingRate, sapiV1BlvtTokenInfoGet200ResponseInner.fundingRate) &&
        Objects.equals(this.dailyManagementFee, sapiV1BlvtTokenInfoGet200ResponseInner.dailyManagementFee) &&
        Objects.equals(this.purchaseFeePct, sapiV1BlvtTokenInfoGet200ResponseInner.purchaseFeePct) &&
        Objects.equals(this.dailyPurchaseLimit, sapiV1BlvtTokenInfoGet200ResponseInner.dailyPurchaseLimit) &&
        Objects.equals(this.redeemFeePct, sapiV1BlvtTokenInfoGet200ResponseInner.redeemFeePct) &&
        Objects.equals(this.dailyRedeemLimit, sapiV1BlvtTokenInfoGet200ResponseInner.dailyRedeemLimit) &&
        Objects.equals(this.timestamp, sapiV1BlvtTokenInfoGet200ResponseInner.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenName, description, underlying, tokenIssued, basket, currentBaskets, nav, realLeverage, fundingRate, dailyManagementFee, purchaseFeePct, dailyPurchaseLimit, redeemFeePct, dailyRedeemLimit, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1BlvtTokenInfoGet200ResponseInner {\n");
    sb.append("    tokenName: ").append(toIndentedString(tokenName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    underlying: ").append(toIndentedString(underlying)).append("\n");
    sb.append("    tokenIssued: ").append(toIndentedString(tokenIssued)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    currentBaskets: ").append(toIndentedString(currentBaskets)).append("\n");
    sb.append("    nav: ").append(toIndentedString(nav)).append("\n");
    sb.append("    realLeverage: ").append(toIndentedString(realLeverage)).append("\n");
    sb.append("    fundingRate: ").append(toIndentedString(fundingRate)).append("\n");
    sb.append("    dailyManagementFee: ").append(toIndentedString(dailyManagementFee)).append("\n");
    sb.append("    purchaseFeePct: ").append(toIndentedString(purchaseFeePct)).append("\n");
    sb.append("    dailyPurchaseLimit: ").append(toIndentedString(dailyPurchaseLimit)).append("\n");
    sb.append("    redeemFeePct: ").append(toIndentedString(redeemFeePct)).append("\n");
    sb.append("    dailyRedeemLimit: ").append(toIndentedString(dailyRedeemLimit)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

