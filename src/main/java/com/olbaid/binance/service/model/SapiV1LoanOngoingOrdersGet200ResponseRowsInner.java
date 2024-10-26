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
 * SapiV1LoanOngoingOrdersGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV1LoanOngoingOrdersGet200ResponseRowsInner.JSON_PROPERTY_ORDER_ID,
  SapiV1LoanOngoingOrdersGet200ResponseRowsInner.JSON_PROPERTY_LOAN_COIN,
  SapiV1LoanOngoingOrdersGet200ResponseRowsInner.JSON_PROPERTY_TOTAL_DEBT,
  SapiV1LoanOngoingOrdersGet200ResponseRowsInner.JSON_PROPERTY_RESIDUAL_INTEREST,
  SapiV1LoanOngoingOrdersGet200ResponseRowsInner.JSON_PROPERTY_COLLATERAL_COIN,
  SapiV1LoanOngoingOrdersGet200ResponseRowsInner.JSON_PROPERTY_COLLATERAL_AMOUNT,
  SapiV1LoanOngoingOrdersGet200ResponseRowsInner.JSON_PROPERTY_CURRENT_L_T_V,
  SapiV1LoanOngoingOrdersGet200ResponseRowsInner.JSON_PROPERTY_EXPIRATION_TIME
})
@JsonTypeName("_sapi_v1_loan_ongoing_orders_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LoanOngoingOrdersGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private Long orderId;

  public static final String JSON_PROPERTY_LOAN_COIN = "loanCoin";
  private String loanCoin;

  public static final String JSON_PROPERTY_TOTAL_DEBT = "totalDebt";
  private String totalDebt;

  public static final String JSON_PROPERTY_RESIDUAL_INTEREST = "residualInterest";
  private String residualInterest;

  public static final String JSON_PROPERTY_COLLATERAL_COIN = "collateralCoin";
  private String collateralCoin;

  public static final String JSON_PROPERTY_COLLATERAL_AMOUNT = "collateralAmount";
  private String collateralAmount;

  public static final String JSON_PROPERTY_CURRENT_L_T_V = "currentLTV";
  private String currentLTV;

  public static final String JSON_PROPERTY_EXPIRATION_TIME = "expirationTime";
  private Long expirationTime;

  public SapiV1LoanOngoingOrdersGet200ResponseRowsInner() {
  }

  public SapiV1LoanOngoingOrdersGet200ResponseRowsInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * Get orderId
   * @return orderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "100000001", required = true, value = "")
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


  public SapiV1LoanOngoingOrdersGet200ResponseRowsInner loanCoin(String loanCoin) {
    
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


  public SapiV1LoanOngoingOrdersGet200ResponseRowsInner totalDebt(String totalDebt) {
    
    this.totalDebt = totalDebt;
    return this;
  }

   /**
   * Get totalDebt
   * @return totalDebt
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TOTAL_DEBT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTotalDebt() {
    return totalDebt;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_DEBT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalDebt(String totalDebt) {
    this.totalDebt = totalDebt;
  }


  public SapiV1LoanOngoingOrdersGet200ResponseRowsInner residualInterest(String residualInterest) {
    
    this.residualInterest = residualInterest;
    return this;
  }

   /**
   * Get residualInterest
   * @return residualInterest
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "10.27687923", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESIDUAL_INTEREST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResidualInterest() {
    return residualInterest;
  }


  @JsonProperty(JSON_PROPERTY_RESIDUAL_INTEREST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResidualInterest(String residualInterest) {
    this.residualInterest = residualInterest;
  }


  public SapiV1LoanOngoingOrdersGet200ResponseRowsInner collateralCoin(String collateralCoin) {
    
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


  public SapiV1LoanOngoingOrdersGet200ResponseRowsInner collateralAmount(String collateralAmount) {
    
    this.collateralAmount = collateralAmount;
    return this;
  }

   /**
   * Get collateralAmount
   * @return collateralAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "49.27565492", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COLLATERAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCollateralAmount() {
    return collateralAmount;
  }


  @JsonProperty(JSON_PROPERTY_COLLATERAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCollateralAmount(String collateralAmount) {
    this.collateralAmount = collateralAmount;
  }


  public SapiV1LoanOngoingOrdersGet200ResponseRowsInner currentLTV(String currentLTV) {
    
    this.currentLTV = currentLTV;
    return this;
  }

   /**
   * Get currentLTV
   * @return currentLTV
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.57", required = true, value = "")
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


  public SapiV1LoanOngoingOrdersGet200ResponseRowsInner expirationTime(Long expirationTime) {
    
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * Get expirationTime
   * @return expirationTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1575018510000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRATION_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getExpirationTime() {
    return expirationTime;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LoanOngoingOrdersGet200ResponseRowsInner sapiV1LoanOngoingOrdersGet200ResponseRowsInner = (SapiV1LoanOngoingOrdersGet200ResponseRowsInner) o;
    return Objects.equals(this.orderId, sapiV1LoanOngoingOrdersGet200ResponseRowsInner.orderId) &&
        Objects.equals(this.loanCoin, sapiV1LoanOngoingOrdersGet200ResponseRowsInner.loanCoin) &&
        Objects.equals(this.totalDebt, sapiV1LoanOngoingOrdersGet200ResponseRowsInner.totalDebt) &&
        Objects.equals(this.residualInterest, sapiV1LoanOngoingOrdersGet200ResponseRowsInner.residualInterest) &&
        Objects.equals(this.collateralCoin, sapiV1LoanOngoingOrdersGet200ResponseRowsInner.collateralCoin) &&
        Objects.equals(this.collateralAmount, sapiV1LoanOngoingOrdersGet200ResponseRowsInner.collateralAmount) &&
        Objects.equals(this.currentLTV, sapiV1LoanOngoingOrdersGet200ResponseRowsInner.currentLTV) &&
        Objects.equals(this.expirationTime, sapiV1LoanOngoingOrdersGet200ResponseRowsInner.expirationTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, loanCoin, totalDebt, residualInterest, collateralCoin, collateralAmount, currentLTV, expirationTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LoanOngoingOrdersGet200ResponseRowsInner {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    loanCoin: ").append(toIndentedString(loanCoin)).append("\n");
    sb.append("    totalDebt: ").append(toIndentedString(totalDebt)).append("\n");
    sb.append("    residualInterest: ").append(toIndentedString(residualInterest)).append("\n");
    sb.append("    collateralCoin: ").append(toIndentedString(collateralCoin)).append("\n");
    sb.append("    collateralAmount: ").append(toIndentedString(collateralAmount)).append("\n");
    sb.append("    currentLTV: ").append(toIndentedString(currentLTV)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
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

