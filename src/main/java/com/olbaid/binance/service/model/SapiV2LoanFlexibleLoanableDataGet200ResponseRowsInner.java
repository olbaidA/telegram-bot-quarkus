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
 * SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner
 */
@JsonPropertyOrder({
  SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner.JSON_PROPERTY_LOAN_COIN,
  SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner.JSON_PROPERTY_FLEXIBLE_INTEREST_RATE,
  SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner.JSON_PROPERTY_FLEXIBLE_MIN_LIMIT,
  SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner.JSON_PROPERTY_FLEXIBLE_MAX_LIMIT
})
@JsonTypeName("_sapi_v2_loan_flexible_loanable_data_get_200_response_rows_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner {
  public static final String JSON_PROPERTY_LOAN_COIN = "loanCoin";
  private String loanCoin;

  public static final String JSON_PROPERTY_FLEXIBLE_INTEREST_RATE = "flexibleInterestRate";
  private String flexibleInterestRate;

  public static final String JSON_PROPERTY_FLEXIBLE_MIN_LIMIT = "flexibleMinLimit";
  private String flexibleMinLimit;

  public static final String JSON_PROPERTY_FLEXIBLE_MAX_LIMIT = "flexibleMaxLimit";
  private String flexibleMaxLimit;

  public SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner() {
  }

  public SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner loanCoin(String loanCoin) {
    
    this.loanCoin = loanCoin;
    return this;
  }

   /**
   * Get loanCoin
   * @return loanCoin
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
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


  public SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner flexibleInterestRate(String flexibleInterestRate) {
    
    this.flexibleInterestRate = flexibleInterestRate;
    return this;
  }

   /**
   * Get flexibleInterestRate
   * @return flexibleInterestRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.01", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FLEXIBLE_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFlexibleInterestRate() {
    return flexibleInterestRate;
  }


  @JsonProperty(JSON_PROPERTY_FLEXIBLE_INTEREST_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlexibleInterestRate(String flexibleInterestRate) {
    this.flexibleInterestRate = flexibleInterestRate;
  }


  public SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner flexibleMinLimit(String flexibleMinLimit) {
    
    this.flexibleMinLimit = flexibleMinLimit;
    return this;
  }

   /**
   * Get flexibleMinLimit
   * @return flexibleMinLimit
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "100", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FLEXIBLE_MIN_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFlexibleMinLimit() {
    return flexibleMinLimit;
  }


  @JsonProperty(JSON_PROPERTY_FLEXIBLE_MIN_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlexibleMinLimit(String flexibleMinLimit) {
    this.flexibleMinLimit = flexibleMinLimit;
  }


  public SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner flexibleMaxLimit(String flexibleMaxLimit) {
    
    this.flexibleMaxLimit = flexibleMaxLimit;
    return this;
  }

   /**
   * Get flexibleMaxLimit
   * @return flexibleMaxLimit
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FLEXIBLE_MAX_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFlexibleMaxLimit() {
    return flexibleMaxLimit;
  }


  @JsonProperty(JSON_PROPERTY_FLEXIBLE_MAX_LIMIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlexibleMaxLimit(String flexibleMaxLimit) {
    this.flexibleMaxLimit = flexibleMaxLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner sapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner = (SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner) o;
    return Objects.equals(this.loanCoin, sapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner.loanCoin) &&
        Objects.equals(this.flexibleInterestRate, sapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner.flexibleInterestRate) &&
        Objects.equals(this.flexibleMinLimit, sapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner.flexibleMinLimit) &&
        Objects.equals(this.flexibleMaxLimit, sapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner.flexibleMaxLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanCoin, flexibleInterestRate, flexibleMinLimit, flexibleMaxLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV2LoanFlexibleLoanableDataGet200ResponseRowsInner {\n");
    sb.append("    loanCoin: ").append(toIndentedString(loanCoin)).append("\n");
    sb.append("    flexibleInterestRate: ").append(toIndentedString(flexibleInterestRate)).append("\n");
    sb.append("    flexibleMinLimit: ").append(toIndentedString(flexibleMinLimit)).append("\n");
    sb.append("    flexibleMaxLimit: ").append(toIndentedString(flexibleMaxLimit)).append("\n");
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
