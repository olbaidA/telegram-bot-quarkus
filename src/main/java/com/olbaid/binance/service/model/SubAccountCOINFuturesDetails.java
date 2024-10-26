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
import com.olbaid.binance.service.model.SubAccountCOINFuturesDetailsAssetsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SubAccountCOINFuturesDetails
 */
@JsonPropertyOrder({
  SubAccountCOINFuturesDetails.JSON_PROPERTY_EMAIL,
  SubAccountCOINFuturesDetails.JSON_PROPERTY_ASSETS,
  SubAccountCOINFuturesDetails.JSON_PROPERTY_CAN_DEPOSIT,
  SubAccountCOINFuturesDetails.JSON_PROPERTY_CAN_TRADE,
  SubAccountCOINFuturesDetails.JSON_PROPERTY_CAN_WITHDRAW,
  SubAccountCOINFuturesDetails.JSON_PROPERTY_FEE_TIER,
  SubAccountCOINFuturesDetails.JSON_PROPERTY_UPDATE_TIME
})
@JsonTypeName("subAccountCOINFuturesDetails")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubAccountCOINFuturesDetails {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_ASSETS = "assets";
  private List<SubAccountCOINFuturesDetailsAssetsInner> assets = new ArrayList<>();

  public static final String JSON_PROPERTY_CAN_DEPOSIT = "canDeposit";
  private Boolean canDeposit;

  public static final String JSON_PROPERTY_CAN_TRADE = "canTrade";
  private Boolean canTrade;

  public static final String JSON_PROPERTY_CAN_WITHDRAW = "canWithdraw";
  private Boolean canWithdraw;

  public static final String JSON_PROPERTY_FEE_TIER = "feeTier";
  private Long feeTier;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private Long updateTime;

  public SubAccountCOINFuturesDetails() {
  }

  public SubAccountCOINFuturesDetails email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "abc@test.com", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmail(String email) {
    this.email = email;
  }


  public SubAccountCOINFuturesDetails assets(List<SubAccountCOINFuturesDetailsAssetsInner> assets) {
    
    this.assets = assets;
    return this;
  }

  public SubAccountCOINFuturesDetails addAssetsItem(SubAccountCOINFuturesDetailsAssetsInner assetsItem) {
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SubAccountCOINFuturesDetailsAssetsInner> getAssets() {
    return assets;
  }


  @JsonProperty(JSON_PROPERTY_ASSETS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAssets(List<SubAccountCOINFuturesDetailsAssetsInner> assets) {
    this.assets = assets;
  }


  public SubAccountCOINFuturesDetails canDeposit(Boolean canDeposit) {
    
    this.canDeposit = canDeposit;
    return this;
  }

   /**
   * Get canDeposit
   * @return canDeposit
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CAN_DEPOSIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanDeposit() {
    return canDeposit;
  }


  @JsonProperty(JSON_PROPERTY_CAN_DEPOSIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanDeposit(Boolean canDeposit) {
    this.canDeposit = canDeposit;
  }


  public SubAccountCOINFuturesDetails canTrade(Boolean canTrade) {
    
    this.canTrade = canTrade;
    return this;
  }

   /**
   * Get canTrade
   * @return canTrade
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CAN_TRADE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanTrade() {
    return canTrade;
  }


  @JsonProperty(JSON_PROPERTY_CAN_TRADE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanTrade(Boolean canTrade) {
    this.canTrade = canTrade;
  }


  public SubAccountCOINFuturesDetails canWithdraw(Boolean canWithdraw) {
    
    this.canWithdraw = canWithdraw;
    return this;
  }

   /**
   * Get canWithdraw
   * @return canWithdraw
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CAN_WITHDRAW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getCanWithdraw() {
    return canWithdraw;
  }


  @JsonProperty(JSON_PROPERTY_CAN_WITHDRAW)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCanWithdraw(Boolean canWithdraw) {
    this.canWithdraw = canWithdraw;
  }


  public SubAccountCOINFuturesDetails feeTier(Long feeTier) {
    
    this.feeTier = feeTier;
    return this;
  }

   /**
   * Get feeTier
   * @return feeTier
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FEE_TIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getFeeTier() {
    return feeTier;
  }


  @JsonProperty(JSON_PROPERTY_FEE_TIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFeeTier(Long feeTier) {
    this.feeTier = feeTier;
  }


  public SubAccountCOINFuturesDetails updateTime(Long updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1598959682001", required = true, value = "")
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
    SubAccountCOINFuturesDetails subAccountCOINFuturesDetails = (SubAccountCOINFuturesDetails) o;
    return Objects.equals(this.email, subAccountCOINFuturesDetails.email) &&
        Objects.equals(this.assets, subAccountCOINFuturesDetails.assets) &&
        Objects.equals(this.canDeposit, subAccountCOINFuturesDetails.canDeposit) &&
        Objects.equals(this.canTrade, subAccountCOINFuturesDetails.canTrade) &&
        Objects.equals(this.canWithdraw, subAccountCOINFuturesDetails.canWithdraw) &&
        Objects.equals(this.feeTier, subAccountCOINFuturesDetails.feeTier) &&
        Objects.equals(this.updateTime, subAccountCOINFuturesDetails.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, assets, canDeposit, canTrade, canWithdraw, feeTier, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubAccountCOINFuturesDetails {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
    sb.append("    canDeposit: ").append(toIndentedString(canDeposit)).append("\n");
    sb.append("    canTrade: ").append(toIndentedString(canTrade)).append("\n");
    sb.append("    canWithdraw: ").append(toIndentedString(canWithdraw)).append("\n");
    sb.append("    feeTier: ").append(toIndentedString(feeTier)).append("\n");
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
