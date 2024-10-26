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
 * SapiV2LoanFlexibleRepayPost200Response
 */
@JsonPropertyOrder({
  SapiV2LoanFlexibleRepayPost200Response.JSON_PROPERTY_LOAN_COIN,
  SapiV2LoanFlexibleRepayPost200Response.JSON_PROPERTY_COLLATERAL_COIN,
  SapiV2LoanFlexibleRepayPost200Response.JSON_PROPERTY_REMAINING_DEBT,
  SapiV2LoanFlexibleRepayPost200Response.JSON_PROPERTY_REMAINING_COLLATERAL,
  SapiV2LoanFlexibleRepayPost200Response.JSON_PROPERTY_FULL_REPAYMENT,
  SapiV2LoanFlexibleRepayPost200Response.JSON_PROPERTY_CURRENT_L_T_V,
  SapiV2LoanFlexibleRepayPost200Response.JSON_PROPERTY_REPAY_STATUS
})
@JsonTypeName("_sapi_v2_loan_flexible_repay_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV2LoanFlexibleRepayPost200Response {
  public static final String JSON_PROPERTY_LOAN_COIN = "loanCoin";
  private String loanCoin;

  public static final String JSON_PROPERTY_COLLATERAL_COIN = "collateralCoin";
  private String collateralCoin;

  public static final String JSON_PROPERTY_REMAINING_DEBT = "remainingDebt";
  private String remainingDebt;

  public static final String JSON_PROPERTY_REMAINING_COLLATERAL = "remainingCollateral";
  private String remainingCollateral;

  public static final String JSON_PROPERTY_FULL_REPAYMENT = "fullRepayment";
  private Boolean fullRepayment;

  public static final String JSON_PROPERTY_CURRENT_L_T_V = "currentLTV";
  private String currentLTV;

  public static final String JSON_PROPERTY_REPAY_STATUS = "repayStatus";
  private String repayStatus;

  public SapiV2LoanFlexibleRepayPost200Response() {
  }

  public SapiV2LoanFlexibleRepayPost200Response loanCoin(String loanCoin) {
    
    this.loanCoin = loanCoin;
    return this;
  }

   /**
   * Get loanCoin
   * @return loanCoin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BUSD", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LOAN_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLoanCoin() {
    return loanCoin;
  }


  @JsonProperty(JSON_PROPERTY_LOAN_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLoanCoin(String loanCoin) {
    this.loanCoin = loanCoin;
  }


  public SapiV2LoanFlexibleRepayPost200Response collateralCoin(String collateralCoin) {
    
    this.collateralCoin = collateralCoin;
    return this;
  }

   /**
   * Get collateralCoin
   * @return collateralCoin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COLLATERAL_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCollateralCoin() {
    return collateralCoin;
  }


  @JsonProperty(JSON_PROPERTY_COLLATERAL_COIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCollateralCoin(String collateralCoin) {
    this.collateralCoin = collateralCoin;
  }


  public SapiV2LoanFlexibleRepayPost200Response remainingDebt(String remainingDebt) {
    
    this.remainingDebt = remainingDebt;
    return this;
  }

   /**
   * Get remainingDebt
   * @return remainingDebt
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "50.5", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REMAINING_DEBT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRemainingDebt() {
    return remainingDebt;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_DEBT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRemainingDebt(String remainingDebt) {
    this.remainingDebt = remainingDebt;
  }


  public SapiV2LoanFlexibleRepayPost200Response remainingCollateral(String remainingCollateral) {
    
    this.remainingCollateral = remainingCollateral;
    return this;
  }

   /**
   * Get remainingCollateral
   * @return remainingCollateral
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "50.5", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REMAINING_COLLATERAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRemainingCollateral() {
    return remainingCollateral;
  }


  @JsonProperty(JSON_PROPERTY_REMAINING_COLLATERAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRemainingCollateral(String remainingCollateral) {
    this.remainingCollateral = remainingCollateral;
  }


  public SapiV2LoanFlexibleRepayPost200Response fullRepayment(Boolean fullRepayment) {
    
    this.fullRepayment = fullRepayment;
    return this;
  }

   /**
   * Get fullRepayment
   * @return fullRepayment
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FULL_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getFullRepayment() {
    return fullRepayment;
  }


  @JsonProperty(JSON_PROPERTY_FULL_REPAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFullRepayment(Boolean fullRepayment) {
    this.fullRepayment = fullRepayment;
  }


  public SapiV2LoanFlexibleRepayPost200Response currentLTV(String currentLTV) {
    
    this.currentLTV = currentLTV;
    return this;
  }

   /**
   * Get currentLTV
   * @return currentLTV
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "50.5", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CURRENT_L_T_V)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrentLTV() {
    return currentLTV;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_L_T_V)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrentLTV(String currentLTV) {
    this.currentLTV = currentLTV;
  }


  public SapiV2LoanFlexibleRepayPost200Response repayStatus(String repayStatus) {
    
    this.repayStatus = repayStatus;
    return this;
  }

   /**
   * Repaid, Repaying, Failed
   * @return repayStatus
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Repaid", required = true, value = "Repaid, Repaying, Failed")
  @JsonProperty(JSON_PROPERTY_REPAY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRepayStatus() {
    return repayStatus;
  }


  @JsonProperty(JSON_PROPERTY_REPAY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepayStatus(String repayStatus) {
    this.repayStatus = repayStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV2LoanFlexibleRepayPost200Response sapiV2LoanFlexibleRepayPost200Response = (SapiV2LoanFlexibleRepayPost200Response) o;
    return Objects.equals(this.loanCoin, sapiV2LoanFlexibleRepayPost200Response.loanCoin) &&
        Objects.equals(this.collateralCoin, sapiV2LoanFlexibleRepayPost200Response.collateralCoin) &&
        Objects.equals(this.remainingDebt, sapiV2LoanFlexibleRepayPost200Response.remainingDebt) &&
        Objects.equals(this.remainingCollateral, sapiV2LoanFlexibleRepayPost200Response.remainingCollateral) &&
        Objects.equals(this.fullRepayment, sapiV2LoanFlexibleRepayPost200Response.fullRepayment) &&
        Objects.equals(this.currentLTV, sapiV2LoanFlexibleRepayPost200Response.currentLTV) &&
        Objects.equals(this.repayStatus, sapiV2LoanFlexibleRepayPost200Response.repayStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanCoin, collateralCoin, remainingDebt, remainingCollateral, fullRepayment, currentLTV, repayStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV2LoanFlexibleRepayPost200Response {\n");
    sb.append("    loanCoin: ").append(toIndentedString(loanCoin)).append("\n");
    sb.append("    collateralCoin: ").append(toIndentedString(collateralCoin)).append("\n");
    sb.append("    remainingDebt: ").append(toIndentedString(remainingDebt)).append("\n");
    sb.append("    remainingCollateral: ").append(toIndentedString(remainingCollateral)).append("\n");
    sb.append("    fullRepayment: ").append(toIndentedString(fullRepayment)).append("\n");
    sb.append("    currentLTV: ").append(toIndentedString(currentLTV)).append("\n");
    sb.append("    repayStatus: ").append(toIndentedString(repayStatus)).append("\n");
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

