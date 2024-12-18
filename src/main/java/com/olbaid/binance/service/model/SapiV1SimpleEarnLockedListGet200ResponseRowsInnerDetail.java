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
 * SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail
 */
@JsonPropertyOrder({
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_ASSET,
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_REWARD_ASSET,
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_DURATION,
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_RENEWABLE,
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_IS_SOLD_OUT,
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_APR,
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_STATUS,
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_SUBSCRIPTION_START_TIME,
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_EXTRA_REWARD_ASSET,
  SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.JSON_PROPERTY_EXTRA_REWARD_A_P_R
})
@JsonTypeName("_sapi_v1_simple_earn_locked_list_get_200_response_rows_inner_detail")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail {
  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_REWARD_ASSET = "rewardAsset";
  private String rewardAsset;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Long duration;

  public static final String JSON_PROPERTY_RENEWABLE = "renewable";
  private Boolean renewable;

  public static final String JSON_PROPERTY_IS_SOLD_OUT = "isSoldOut";
  private Boolean isSoldOut;

  public static final String JSON_PROPERTY_APR = "apr";
  private String apr;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SUBSCRIPTION_START_TIME = "subscriptionStartTime";
  private String subscriptionStartTime;

  public static final String JSON_PROPERTY_EXTRA_REWARD_ASSET = "extraRewardAsset";
  private String extraRewardAsset;

  public static final String JSON_PROPERTY_EXTRA_REWARD_A_P_R = "extraRewardAPR";
  private String extraRewardAPR;

  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail() {
  }

  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * Get asset
   * @return asset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "AXS", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAsset() {
    return asset;
  }


  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAsset(String asset) {
    this.asset = asset;
  }


  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail rewardAsset(String rewardAsset) {
    
    this.rewardAsset = rewardAsset;
    return this;
  }

   /**
   * Get rewardAsset
   * @return rewardAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "AXS", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REWARD_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRewardAsset() {
    return rewardAsset;
  }


  @JsonProperty(JSON_PROPERTY_REWARD_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRewardAsset(String rewardAsset) {
    this.rewardAsset = rewardAsset;
  }


  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Get duration
   * @return duration
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "90", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail renewable(Boolean renewable) {
    
    this.renewable = renewable;
    return this;
  }

   /**
   * Get renewable
   * @return renewable
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RENEWABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getRenewable() {
    return renewable;
  }


  @JsonProperty(JSON_PROPERTY_RENEWABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRenewable(Boolean renewable) {
    this.renewable = renewable;
  }


  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail isSoldOut(Boolean isSoldOut) {
    
    this.isSoldOut = isSoldOut;
    return this;
  }

   /**
   * Get isSoldOut
   * @return isSoldOut
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_SOLD_OUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsSoldOut() {
    return isSoldOut;
  }


  @JsonProperty(JSON_PROPERTY_IS_SOLD_OUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsSoldOut(Boolean isSoldOut) {
    this.isSoldOut = isSoldOut;
  }


  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail apr(String apr) {
    
    this.apr = apr;
    return this;
  }

   /**
   * Get apr
   * @return apr
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.2069", required = true, value = "")
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


  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "CREATED", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(String status) {
    this.status = status;
  }


  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail subscriptionStartTime(String subscriptionStartTime) {
    
    this.subscriptionStartTime = subscriptionStartTime;
    return this;
  }

   /**
   * Get subscriptionStartTime
   * @return subscriptionStartTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1646182276000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubscriptionStartTime() {
    return subscriptionStartTime;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionStartTime(String subscriptionStartTime) {
    this.subscriptionStartTime = subscriptionStartTime;
  }


  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail extraRewardAsset(String extraRewardAsset) {
    
    this.extraRewardAsset = extraRewardAsset;
    return this;
  }

   /**
   * Get extraRewardAsset
   * @return extraRewardAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BNB", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA_REWARD_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExtraRewardAsset() {
    return extraRewardAsset;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA_REWARD_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExtraRewardAsset(String extraRewardAsset) {
    this.extraRewardAsset = extraRewardAsset;
  }


  public SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail extraRewardAPR(String extraRewardAPR) {
    
    this.extraRewardAPR = extraRewardAPR;
    return this;
  }

   /**
   * Get extraRewardAPR
   * @return extraRewardAPR
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.23", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA_REWARD_A_P_R)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExtraRewardAPR() {
    return extraRewardAPR;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA_REWARD_A_P_R)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExtraRewardAPR(String extraRewardAPR) {
    this.extraRewardAPR = extraRewardAPR;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail = (SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail) o;
    return Objects.equals(this.asset, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.asset) &&
        Objects.equals(this.rewardAsset, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.rewardAsset) &&
        Objects.equals(this.duration, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.duration) &&
        Objects.equals(this.renewable, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.renewable) &&
        Objects.equals(this.isSoldOut, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.isSoldOut) &&
        Objects.equals(this.apr, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.apr) &&
        Objects.equals(this.status, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.status) &&
        Objects.equals(this.subscriptionStartTime, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.subscriptionStartTime) &&
        Objects.equals(this.extraRewardAsset, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.extraRewardAsset) &&
        Objects.equals(this.extraRewardAPR, sapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail.extraRewardAPR);
  }

  @Override
  public int hashCode() {
    return Objects.hash(asset, rewardAsset, duration, renewable, isSoldOut, apr, status, subscriptionStartTime, extraRewardAsset, extraRewardAPR);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SimpleEarnLockedListGet200ResponseRowsInnerDetail {\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    rewardAsset: ").append(toIndentedString(rewardAsset)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    renewable: ").append(toIndentedString(renewable)).append("\n");
    sb.append("    isSoldOut: ").append(toIndentedString(isSoldOut)).append("\n");
    sb.append("    apr: ").append(toIndentedString(apr)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subscriptionStartTime: ").append(toIndentedString(subscriptionStartTime)).append("\n");
    sb.append("    extraRewardAsset: ").append(toIndentedString(extraRewardAsset)).append("\n");
    sb.append("    extraRewardAPR: ").append(toIndentedString(extraRewardAPR)).append("\n");
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

