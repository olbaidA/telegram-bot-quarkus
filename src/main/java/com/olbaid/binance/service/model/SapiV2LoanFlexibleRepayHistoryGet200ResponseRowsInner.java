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
 * SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.JSON_PROPERTY_LOAN_COIN,
  SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.JSON_PROPERTY_REPAY_AMOUNT,
  SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.JSON_PROPERTY_COLLATERAL_COIN,
  SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.JSON_PROPERTY_COLLATERAL_RETURN,
  SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.JSON_PROPERTY_REPAY_STATUS,
  SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.JSON_PROPERTY_REPAY_TIME
})
@JsonTypeName("_sapi_v2_loan_flexible_repay_history_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_LOAN_COIN = "loanCoin";
  private String loanCoin;

  public static final String JSON_PROPERTY_REPAY_AMOUNT = "repayAmount";
  private String repayAmount;

  public static final String JSON_PROPERTY_COLLATERAL_COIN = "collateralCoin";
  private String collateralCoin;

  public static final String JSON_PROPERTY_COLLATERAL_RETURN = "collateralReturn";
  private String collateralReturn;

  public static final String JSON_PROPERTY_REPAY_STATUS = "repayStatus";
  private String repayStatus;

  public static final String JSON_PROPERTY_REPAY_TIME = "repayTime";
  private Long repayTime;

  public SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner() {
  }

  public SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner loanCoin(String loanCoin) {
    
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


  public SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner repayAmount(String repayAmount) {
    
    this.repayAmount = repayAmount;
    return this;
  }

   /**
   * Get repayAmount
   * @return repayAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REPAY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRepayAmount() {
    return repayAmount;
  }


  @JsonProperty(JSON_PROPERTY_REPAY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepayAmount(String repayAmount) {
    this.repayAmount = repayAmount;
  }


  public SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner collateralCoin(String collateralCoin) {
    
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


  public SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner collateralReturn(String collateralReturn) {
    
    this.collateralReturn = collateralReturn;
    return this;
  }

   /**
   * Get collateralReturn
   * @return collateralReturn
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COLLATERAL_RETURN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCollateralReturn() {
    return collateralReturn;
  }


  @JsonProperty(JSON_PROPERTY_COLLATERAL_RETURN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCollateralReturn(String collateralReturn) {
    this.collateralReturn = collateralReturn;
  }


  public SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner repayStatus(String repayStatus) {
    
    this.repayStatus = repayStatus;
    return this;
  }

   /**
   * Get repayStatus
   * @return repayStatus
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "Repaid", required = true, value = "")
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


  public SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner repayTime(Long repayTime) {
    
    this.repayTime = repayTime;
    return this;
  }

   /**
   * Get repayTime
   * @return repayTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1575018510000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REPAY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRepayTime() {
    return repayTime;
  }


  @JsonProperty(JSON_PROPERTY_REPAY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRepayTime(Long repayTime) {
    this.repayTime = repayTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner sapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner = (SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner) o;
    return Objects.equals(this.loanCoin, sapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.loanCoin) &&
        Objects.equals(this.repayAmount, sapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.repayAmount) &&
        Objects.equals(this.collateralCoin, sapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.collateralCoin) &&
        Objects.equals(this.collateralReturn, sapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.collateralReturn) &&
        Objects.equals(this.repayStatus, sapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.repayStatus) &&
        Objects.equals(this.repayTime, sapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner.repayTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanCoin, repayAmount, collateralCoin, collateralReturn, repayStatus, repayTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV2LoanFlexibleRepayHistoryGet200ResponseRowsInner {\n");
    sb.append("    loanCoin: ").append(toIndentedString(loanCoin)).append("\n");
    sb.append("    repayAmount: ").append(toIndentedString(repayAmount)).append("\n");
    sb.append("    collateralCoin: ").append(toIndentedString(collateralCoin)).append("\n");
    sb.append("    collateralReturn: ").append(toIndentedString(collateralReturn)).append("\n");
    sb.append("    repayStatus: ").append(toIndentedString(repayStatus)).append("\n");
    sb.append("    repayTime: ").append(toIndentedString(repayTime)).append("\n");
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

