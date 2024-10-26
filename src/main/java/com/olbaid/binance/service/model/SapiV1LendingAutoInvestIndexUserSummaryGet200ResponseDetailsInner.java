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
 * SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner
 */
@JsonPropertyOrder({
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_TARGET_ASSET,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_AVERAGE_PRICE_IN_U_S_D,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_TOTAL_INVESTED_IN_U_S_D,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_CURRENT_INVESTED_IN_U_S_D,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_PURCHASED_AMOUNT,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_PNL_IN_U_S_D,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_ROI,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_PERCENTAGE,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_AVAILABLE_AMOUNT,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_REDEEMED_AMOUNT,
  SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.JSON_PROPERTY_ASSET_VALUE_IN_U_S_D
})
@JsonTypeName("_sapi_v1_lending_auto_invest_index_user_summary_get_200_response_details_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner {
  public static final String JSON_PROPERTY_TARGET_ASSET = "targetAsset";
  private String targetAsset;

  public static final String JSON_PROPERTY_AVERAGE_PRICE_IN_U_S_D = "averagePriceInUSD";
  private String averagePriceInUSD;

  public static final String JSON_PROPERTY_TOTAL_INVESTED_IN_U_S_D = "totalInvestedInUSD";
  private String totalInvestedInUSD;

  public static final String JSON_PROPERTY_CURRENT_INVESTED_IN_U_S_D = "currentInvestedInUSD";
  private String currentInvestedInUSD;

  public static final String JSON_PROPERTY_PURCHASED_AMOUNT = "purchasedAmount";
  private String purchasedAmount;

  public static final String JSON_PROPERTY_PNL_IN_U_S_D = "pnlInUSD";
  private String pnlInUSD;

  public static final String JSON_PROPERTY_ROI = "roi";
  private String roi;

  public static final String JSON_PROPERTY_PERCENTAGE = "percentage";
  private String percentage;

  public static final String JSON_PROPERTY_AVAILABLE_AMOUNT = "availableAmount";
  private String availableAmount;

  public static final String JSON_PROPERTY_REDEEMED_AMOUNT = "redeemedAmount";
  private String redeemedAmount;

  public static final String JSON_PROPERTY_ASSET_VALUE_IN_U_S_D = "assetValueInUSD";
  private String assetValueInUSD;

  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner() {
  }

  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner targetAsset(String targetAsset) {
    
    this.targetAsset = targetAsset;
    return this;
  }

   /**
   * Get targetAsset
   * @return targetAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ADA", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TARGET_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTargetAsset() {
    return targetAsset;
  }


  @JsonProperty(JSON_PROPERTY_TARGET_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTargetAsset(String targetAsset) {
    this.targetAsset = targetAsset;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner averagePriceInUSD(String averagePriceInUSD) {
    
    this.averagePriceInUSD = averagePriceInUSD;
    return this;
  }

   /**
   * average price of the asset in USD
   * @return averagePriceInUSD
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "3.4", required = true, value = "average price of the asset in USD")
  @JsonProperty(JSON_PROPERTY_AVERAGE_PRICE_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAveragePriceInUSD() {
    return averagePriceInUSD;
  }


  @JsonProperty(JSON_PROPERTY_AVERAGE_PRICE_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAveragePriceInUSD(String averagePriceInUSD) {
    this.averagePriceInUSD = averagePriceInUSD;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner totalInvestedInUSD(String totalInvestedInUSD) {
    
    this.totalInvestedInUSD = totalInvestedInUSD;
    return this;
  }

   /**
   * total source asset invested for this target asset in equivilent of USD
   * @return totalInvestedInUSD
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "222.21", required = true, value = "total source asset invested for this target asset in equivilent of USD")
  @JsonProperty(JSON_PROPERTY_TOTAL_INVESTED_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalInvestedInUSD() {
    return totalInvestedInUSD;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_INVESTED_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalInvestedInUSD(String totalInvestedInUSD) {
    this.totalInvestedInUSD = totalInvestedInUSD;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner currentInvestedInUSD(String currentInvestedInUSD) {
    
    this.currentInvestedInUSD = currentInvestedInUSD;
    return this;
  }

   /**
   * current invest
   * @return currentInvestedInUSD
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "101.2", required = true, value = "current invest")
  @JsonProperty(JSON_PROPERTY_CURRENT_INVESTED_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrentInvestedInUSD() {
    return currentInvestedInUSD;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_INVESTED_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentInvestedInUSD(String currentInvestedInUSD) {
    this.currentInvestedInUSD = currentInvestedInUSD;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner purchasedAmount(String purchasedAmount) {
    
    this.purchasedAmount = purchasedAmount;
    return this;
  }

   /**
   * purchased amount of target asset
   * @return purchasedAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "122.2", required = true, value = "purchased amount of target asset")
  @JsonProperty(JSON_PROPERTY_PURCHASED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPurchasedAmount() {
    return purchasedAmount;
  }


  @JsonProperty(JSON_PROPERTY_PURCHASED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPurchasedAmount(String purchasedAmount) {
    this.purchasedAmount = purchasedAmount;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner pnlInUSD(String pnlInUSD) {
    
    this.pnlInUSD = pnlInUSD;
    return this;
  }

   /**
   * PNL denominated in USD
   * @return pnlInUSD
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "109.2", required = true, value = "PNL denominated in USD")
  @JsonProperty(JSON_PROPERTY_PNL_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPnlInUSD() {
    return pnlInUSD;
  }


  @JsonProperty(JSON_PROPERTY_PNL_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPnlInUSD(String pnlInUSD) {
    this.pnlInUSD = pnlInUSD;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner roi(String roi) {
    
    this.roi = roi;
    return this;
  }

   /**
   * ROI calculated in decimal
   * @return roi
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.2", required = true, value = "ROI calculated in decimal")
  @JsonProperty(JSON_PROPERTY_ROI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRoi() {
    return roi;
  }


  @JsonProperty(JSON_PROPERTY_ROI)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRoi(String roi) {
    this.roi = roi;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner percentage(String percentage) {
    
    this.percentage = percentage;
    return this;
  }

   /**
   * asset allocation in the plan. If it&#39;s single plan, then it&#39;s 100
   * @return percentage
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "asset allocation in the plan. If it's single plan, then it's 100")
  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPercentage() {
    return percentage;
  }


  @JsonProperty(JSON_PROPERTY_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner availableAmount(String availableAmount) {
    
    this.availableAmount = availableAmount;
    return this;
  }

   /**
   * Get availableAmount
   * @return availableAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "122.12345678", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAvailableAmount() {
    return availableAmount;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABLE_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAvailableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner redeemedAmount(String redeemedAmount) {
    
    this.redeemedAmount = redeemedAmount;
    return this;
  }

   /**
   * Get redeemedAmount
   * @return redeemedAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "122", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REDEEMED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRedeemedAmount() {
    return redeemedAmount;
  }


  @JsonProperty(JSON_PROPERTY_REDEEMED_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRedeemedAmount(String redeemedAmount) {
    this.redeemedAmount = redeemedAmount;
  }


  public SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner assetValueInUSD(String assetValueInUSD) {
    
    this.assetValueInUSD = assetValueInUSD;
    return this;
  }

   /**
   * Get assetValueInUSD
   * @return assetValueInUSD
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "101", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASSET_VALUE_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAssetValueInUSD() {
    return assetValueInUSD;
  }


  @JsonProperty(JSON_PROPERTY_ASSET_VALUE_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssetValueInUSD(String assetValueInUSD) {
    this.assetValueInUSD = assetValueInUSD;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner = (SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner) o;
    return Objects.equals(this.targetAsset, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.targetAsset) &&
        Objects.equals(this.averagePriceInUSD, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.averagePriceInUSD) &&
        Objects.equals(this.totalInvestedInUSD, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.totalInvestedInUSD) &&
        Objects.equals(this.currentInvestedInUSD, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.currentInvestedInUSD) &&
        Objects.equals(this.purchasedAmount, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.purchasedAmount) &&
        Objects.equals(this.pnlInUSD, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.pnlInUSD) &&
        Objects.equals(this.roi, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.roi) &&
        Objects.equals(this.percentage, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.percentage) &&
        Objects.equals(this.availableAmount, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.availableAmount) &&
        Objects.equals(this.redeemedAmount, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.redeemedAmount) &&
        Objects.equals(this.assetValueInUSD, sapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner.assetValueInUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetAsset, averagePriceInUSD, totalInvestedInUSD, currentInvestedInUSD, purchasedAmount, pnlInUSD, roi, percentage, availableAmount, redeemedAmount, assetValueInUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LendingAutoInvestIndexUserSummaryGet200ResponseDetailsInner {\n");
    sb.append("    targetAsset: ").append(toIndentedString(targetAsset)).append("\n");
    sb.append("    averagePriceInUSD: ").append(toIndentedString(averagePriceInUSD)).append("\n");
    sb.append("    totalInvestedInUSD: ").append(toIndentedString(totalInvestedInUSD)).append("\n");
    sb.append("    currentInvestedInUSD: ").append(toIndentedString(currentInvestedInUSD)).append("\n");
    sb.append("    purchasedAmount: ").append(toIndentedString(purchasedAmount)).append("\n");
    sb.append("    pnlInUSD: ").append(toIndentedString(pnlInUSD)).append("\n");
    sb.append("    roi: ").append(toIndentedString(roi)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
    sb.append("    redeemedAmount: ").append(toIndentedString(redeemedAmount)).append("\n");
    sb.append("    assetValueInUSD: ").append(toIndentedString(assetValueInUSD)).append("\n");
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
