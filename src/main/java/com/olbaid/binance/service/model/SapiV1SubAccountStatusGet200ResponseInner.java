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
 * SapiV1SubAccountStatusGet200ResponseInner
 */
@JsonPropertyOrder({
  SapiV1SubAccountStatusGet200ResponseInner.JSON_PROPERTY_EMAIL,
  SapiV1SubAccountStatusGet200ResponseInner.JSON_PROPERTY_IS_SUB_USER_ENABLED,
  SapiV1SubAccountStatusGet200ResponseInner.JSON_PROPERTY_IS_USER_ACTIVE,
  SapiV1SubAccountStatusGet200ResponseInner.JSON_PROPERTY_INSERT_TIME,
  SapiV1SubAccountStatusGet200ResponseInner.JSON_PROPERTY_IS_MARGIN_ENABLED,
  SapiV1SubAccountStatusGet200ResponseInner.JSON_PROPERTY_IS_FUTURE_ENABLED,
  SapiV1SubAccountStatusGet200ResponseInner.JSON_PROPERTY_MOBILE
})
@JsonTypeName("_sapi_v1_sub_account_status_get_200_response_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1SubAccountStatusGet200ResponseInner {
  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_IS_SUB_USER_ENABLED = "isSubUserEnabled";
  private Boolean isSubUserEnabled;

  public static final String JSON_PROPERTY_IS_USER_ACTIVE = "isUserActive";
  private Boolean isUserActive;

  public static final String JSON_PROPERTY_INSERT_TIME = "insertTime";
  private Long insertTime;

  public static final String JSON_PROPERTY_IS_MARGIN_ENABLED = "isMarginEnabled";
  private Boolean isMarginEnabled;

  public static final String JSON_PROPERTY_IS_FUTURE_ENABLED = "isFutureEnabled";
  private Boolean isFutureEnabled;

  public static final String JSON_PROPERTY_MOBILE = "mobile";
  private Long mobile;

  public SapiV1SubAccountStatusGet200ResponseInner() {
  }

  public SapiV1SubAccountStatusGet200ResponseInner email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "123@test.com", required = true, value = "")
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


  public SapiV1SubAccountStatusGet200ResponseInner isSubUserEnabled(Boolean isSubUserEnabled) {
    
    this.isSubUserEnabled = isSubUserEnabled;
    return this;
  }

   /**
   * Get isSubUserEnabled
   * @return isSubUserEnabled
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_SUB_USER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsSubUserEnabled() {
    return isSubUserEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_SUB_USER_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsSubUserEnabled(Boolean isSubUserEnabled) {
    this.isSubUserEnabled = isSubUserEnabled;
  }


  public SapiV1SubAccountStatusGet200ResponseInner isUserActive(Boolean isUserActive) {
    
    this.isUserActive = isUserActive;
    return this;
  }

   /**
   * Get isUserActive
   * @return isUserActive
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_USER_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsUserActive() {
    return isUserActive;
  }


  @JsonProperty(JSON_PROPERTY_IS_USER_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsUserActive(Boolean isUserActive) {
    this.isUserActive = isUserActive;
  }


  public SapiV1SubAccountStatusGet200ResponseInner insertTime(Long insertTime) {
    
    this.insertTime = insertTime;
    return this;
  }

   /**
   * sub account create time
   * @return insertTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1570791523523", required = true, value = "sub account create time")
  @JsonProperty(JSON_PROPERTY_INSERT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getInsertTime() {
    return insertTime;
  }


  @JsonProperty(JSON_PROPERTY_INSERT_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setInsertTime(Long insertTime) {
    this.insertTime = insertTime;
  }


  public SapiV1SubAccountStatusGet200ResponseInner isMarginEnabled(Boolean isMarginEnabled) {
    
    this.isMarginEnabled = isMarginEnabled;
    return this;
  }

   /**
   * Get isMarginEnabled
   * @return isMarginEnabled
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_MARGIN_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsMarginEnabled() {
    return isMarginEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_MARGIN_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsMarginEnabled(Boolean isMarginEnabled) {
    this.isMarginEnabled = isMarginEnabled;
  }


  public SapiV1SubAccountStatusGet200ResponseInner isFutureEnabled(Boolean isFutureEnabled) {
    
    this.isFutureEnabled = isFutureEnabled;
    return this;
  }

   /**
   * Get isFutureEnabled
   * @return isFutureEnabled
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_FUTURE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsFutureEnabled() {
    return isFutureEnabled;
  }


  @JsonProperty(JSON_PROPERTY_IS_FUTURE_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsFutureEnabled(Boolean isFutureEnabled) {
    this.isFutureEnabled = isFutureEnabled;
  }


  public SapiV1SubAccountStatusGet200ResponseInner mobile(Long mobile) {
    
    this.mobile = mobile;
    return this;
  }

   /**
   * user mobile number
   * @return mobile
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1570791523523", required = true, value = "user mobile number")
  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getMobile() {
    return mobile;
  }


  @JsonProperty(JSON_PROPERTY_MOBILE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMobile(Long mobile) {
    this.mobile = mobile;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1SubAccountStatusGet200ResponseInner sapiV1SubAccountStatusGet200ResponseInner = (SapiV1SubAccountStatusGet200ResponseInner) o;
    return Objects.equals(this.email, sapiV1SubAccountStatusGet200ResponseInner.email) &&
        Objects.equals(this.isSubUserEnabled, sapiV1SubAccountStatusGet200ResponseInner.isSubUserEnabled) &&
        Objects.equals(this.isUserActive, sapiV1SubAccountStatusGet200ResponseInner.isUserActive) &&
        Objects.equals(this.insertTime, sapiV1SubAccountStatusGet200ResponseInner.insertTime) &&
        Objects.equals(this.isMarginEnabled, sapiV1SubAccountStatusGet200ResponseInner.isMarginEnabled) &&
        Objects.equals(this.isFutureEnabled, sapiV1SubAccountStatusGet200ResponseInner.isFutureEnabled) &&
        Objects.equals(this.mobile, sapiV1SubAccountStatusGet200ResponseInner.mobile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, isSubUserEnabled, isUserActive, insertTime, isMarginEnabled, isFutureEnabled, mobile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1SubAccountStatusGet200ResponseInner {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    isSubUserEnabled: ").append(toIndentedString(isSubUserEnabled)).append("\n");
    sb.append("    isUserActive: ").append(toIndentedString(isUserActive)).append("\n");
    sb.append("    insertTime: ").append(toIndentedString(insertTime)).append("\n");
    sb.append("    isMarginEnabled: ").append(toIndentedString(isMarginEnabled)).append("\n");
    sb.append("    isFutureEnabled: ").append(toIndentedString(isFutureEnabled)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
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

