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
import com.olbaid.binance.service.model.AccountBalancesInner;
import com.olbaid.binance.service.model.AccountCommissionRates;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Account
 */
@JsonPropertyOrder({
  Account.JSON_PROPERTY_MAKER_COMMISSION,
  Account.JSON_PROPERTY_TAKER_COMMISSION,
  Account.JSON_PROPERTY_BUYER_COMMISSION,
  Account.JSON_PROPERTY_SELLER_COMMISSION,
  Account.JSON_PROPERTY_COMMISSION_RATES,
  Account.JSON_PROPERTY_CAN_TRADE,
  Account.JSON_PROPERTY_CAN_WITHDRAW,
  Account.JSON_PROPERTY_CAN_DEPOSIT,
  Account.JSON_PROPERTY_BROKERED,
  Account.JSON_PROPERTY_REQUIRE_SELF_TRADE_PREVENTION,
  Account.JSON_PROPERTY_PREVENT_SOR,
  Account.JSON_PROPERTY_UPDATE_TIME,
  Account.JSON_PROPERTY_ACCOUNT_TYPE,
  Account.JSON_PROPERTY_BALANCES,
  Account.JSON_PROPERTY_PERMISSIONS,
  Account.JSON_PROPERTY_UID
})
@JsonTypeName("account")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Account {
  public static final String JSON_PROPERTY_MAKER_COMMISSION = "makerCommission";
  private Long makerCommission;

  public static final String JSON_PROPERTY_TAKER_COMMISSION = "takerCommission";
  private Long takerCommission;

  public static final String JSON_PROPERTY_BUYER_COMMISSION = "buyerCommission";
  private Long buyerCommission;

  public static final String JSON_PROPERTY_SELLER_COMMISSION = "sellerCommission";
  private Long sellerCommission;

  public static final String JSON_PROPERTY_COMMISSION_RATES = "commissionRates";
  private AccountCommissionRates commissionRates;

  public static final String JSON_PROPERTY_CAN_TRADE = "canTrade";
  private Boolean canTrade;

  public static final String JSON_PROPERTY_CAN_WITHDRAW = "canWithdraw";
  private Boolean canWithdraw;

  public static final String JSON_PROPERTY_CAN_DEPOSIT = "canDeposit";
  private Boolean canDeposit;

  public static final String JSON_PROPERTY_BROKERED = "brokered";
  private Boolean brokered;

  public static final String JSON_PROPERTY_REQUIRE_SELF_TRADE_PREVENTION = "requireSelfTradePrevention";
  private Boolean requireSelfTradePrevention;

  public static final String JSON_PROPERTY_PREVENT_SOR = "preventSor";
  private Boolean preventSor;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private Long updateTime;

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private String accountType;

  public static final String JSON_PROPERTY_BALANCES = "balances";
  private List<AccountBalancesInner> balances = new ArrayList<>();

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<String> permissions = new ArrayList<>();

  public static final String JSON_PROPERTY_UID = "uid";
  private Long uid;

  public Account() {
  }

  public Account makerCommission(Long makerCommission) {
    
    this.makerCommission = makerCommission;
    return this;
  }

   /**
   * Get makerCommission
   * @return makerCommission
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "15", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MAKER_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMakerCommission() {
    return makerCommission;
  }


  @JsonProperty(JSON_PROPERTY_MAKER_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMakerCommission(Long makerCommission) {
    this.makerCommission = makerCommission;
  }


  public Account takerCommission(Long takerCommission) {
    
    this.takerCommission = takerCommission;
    return this;
  }

   /**
   * Get takerCommission
   * @return takerCommission
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "15", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TAKER_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTakerCommission() {
    return takerCommission;
  }


  @JsonProperty(JSON_PROPERTY_TAKER_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTakerCommission(Long takerCommission) {
    this.takerCommission = takerCommission;
  }


  public Account buyerCommission(Long buyerCommission) {
    
    this.buyerCommission = buyerCommission;
    return this;
  }

   /**
   * Get buyerCommission
   * @return buyerCommission
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BUYER_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getBuyerCommission() {
    return buyerCommission;
  }


  @JsonProperty(JSON_PROPERTY_BUYER_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBuyerCommission(Long buyerCommission) {
    this.buyerCommission = buyerCommission;
  }


  public Account sellerCommission(Long sellerCommission) {
    
    this.sellerCommission = sellerCommission;
    return this;
  }

   /**
   * Get sellerCommission
   * @return sellerCommission
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SELLER_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getSellerCommission() {
    return sellerCommission;
  }


  @JsonProperty(JSON_PROPERTY_SELLER_COMMISSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSellerCommission(Long sellerCommission) {
    this.sellerCommission = sellerCommission;
  }


  public Account commissionRates(AccountCommissionRates commissionRates) {
    
    this.commissionRates = commissionRates;
    return this;
  }

   /**
   * Get commissionRates
   * @return commissionRates
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMMISSION_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountCommissionRates getCommissionRates() {
    return commissionRates;
  }


  @JsonProperty(JSON_PROPERTY_COMMISSION_RATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommissionRates(AccountCommissionRates commissionRates) {
    this.commissionRates = commissionRates;
  }


  public Account canTrade(Boolean canTrade) {
    
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


  public Account canWithdraw(Boolean canWithdraw) {
    
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


  public Account canDeposit(Boolean canDeposit) {
    
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


  public Account brokered(Boolean brokered) {
    
    this.brokered = brokered;
    return this;
  }

   /**
   * Get brokered
   * @return brokered
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BROKERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getBrokered() {
    return brokered;
  }


  @JsonProperty(JSON_PROPERTY_BROKERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBrokered(Boolean brokered) {
    this.brokered = brokered;
  }


  public Account requireSelfTradePrevention(Boolean requireSelfTradePrevention) {
    
    this.requireSelfTradePrevention = requireSelfTradePrevention;
    return this;
  }

   /**
   * Get requireSelfTradePrevention
   * @return requireSelfTradePrevention
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REQUIRE_SELF_TRADE_PREVENTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRequireSelfTradePrevention() {
    return requireSelfTradePrevention;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRE_SELF_TRADE_PREVENTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequireSelfTradePrevention(Boolean requireSelfTradePrevention) {
    this.requireSelfTradePrevention = requireSelfTradePrevention;
  }


  public Account preventSor(Boolean preventSor) {
    
    this.preventSor = preventSor;
    return this;
  }

   /**
   * Get preventSor
   * @return preventSor
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PREVENT_SOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getPreventSor() {
    return preventSor;
  }


  @JsonProperty(JSON_PROPERTY_PREVENT_SOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPreventSor(Boolean preventSor) {
    this.preventSor = preventSor;
  }


  public Account updateTime(Long updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "123456789", required = true, value = "")
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


  public Account accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SPOT", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public Account balances(List<AccountBalancesInner> balances) {
    
    this.balances = balances;
    return this;
  }

  public Account addBalancesItem(AccountBalancesInner balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_BALANCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AccountBalancesInner> getBalances() {
    return balances;
  }


  @JsonProperty(JSON_PROPERTY_BALANCES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBalances(List<AccountBalancesInner> balances) {
    this.balances = balances;
  }


  public Account permissions(List<String> permissions) {
    
    this.permissions = permissions;
    return this;
  }

  public Account addPermissionsItem(String permissionsItem) {
    this.permissions.add(permissionsItem);
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getPermissions() {
    return permissions;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPermissions(List<String> permissions) {
    this.permissions = permissions;
  }


  public Account uid(Long uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * Get uid
   * @return uid
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "354937868", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getUid() {
    return uid;
  }


  @JsonProperty(JSON_PROPERTY_UID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUid(Long uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.makerCommission, account.makerCommission) &&
        Objects.equals(this.takerCommission, account.takerCommission) &&
        Objects.equals(this.buyerCommission, account.buyerCommission) &&
        Objects.equals(this.sellerCommission, account.sellerCommission) &&
        Objects.equals(this.commissionRates, account.commissionRates) &&
        Objects.equals(this.canTrade, account.canTrade) &&
        Objects.equals(this.canWithdraw, account.canWithdraw) &&
        Objects.equals(this.canDeposit, account.canDeposit) &&
        Objects.equals(this.brokered, account.brokered) &&
        Objects.equals(this.requireSelfTradePrevention, account.requireSelfTradePrevention) &&
        Objects.equals(this.preventSor, account.preventSor) &&
        Objects.equals(this.updateTime, account.updateTime) &&
        Objects.equals(this.accountType, account.accountType) &&
        Objects.equals(this.balances, account.balances) &&
        Objects.equals(this.permissions, account.permissions) &&
        Objects.equals(this.uid, account.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(makerCommission, takerCommission, buyerCommission, sellerCommission, commissionRates, canTrade, canWithdraw, canDeposit, brokered, requireSelfTradePrevention, preventSor, updateTime, accountType, balances, permissions, uid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    sb.append("    makerCommission: ").append(toIndentedString(makerCommission)).append("\n");
    sb.append("    takerCommission: ").append(toIndentedString(takerCommission)).append("\n");
    sb.append("    buyerCommission: ").append(toIndentedString(buyerCommission)).append("\n");
    sb.append("    sellerCommission: ").append(toIndentedString(sellerCommission)).append("\n");
    sb.append("    commissionRates: ").append(toIndentedString(commissionRates)).append("\n");
    sb.append("    canTrade: ").append(toIndentedString(canTrade)).append("\n");
    sb.append("    canWithdraw: ").append(toIndentedString(canWithdraw)).append("\n");
    sb.append("    canDeposit: ").append(toIndentedString(canDeposit)).append("\n");
    sb.append("    brokered: ").append(toIndentedString(brokered)).append("\n");
    sb.append("    requireSelfTradePrevention: ").append(toIndentedString(requireSelfTradePrevention)).append("\n");
    sb.append("    preventSor: ").append(toIndentedString(preventSor)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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

