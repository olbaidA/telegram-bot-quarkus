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
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInnerDetailsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner
 */
@JsonPropertyOrder({
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_PLAN_ID,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_PLAN_TYPE,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_EDIT_ALLOWED,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_FLEXIBLE_ALLOWED_TO_USE,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_CREATION_DATE_TIME,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_FIRST_EXECUTION_DATE_TIME,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_NEXT_EXECUTION_DATE_TIME,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_STATUS,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_TARGET_ASSET,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_SOURCE_ASSET,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_TOTAL_INVESTED_IN_U_S_D,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_PLAN_VALUE_IN_U_S_D,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_PNL_IN_U_S_D,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_ROI,
  SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.JSON_PROPERTY_DETAILS
})
@JsonTypeName("_sapi_v1_lending_auto_invest_plan_id_get_200_response_plan_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner {
  public static final String JSON_PROPERTY_PLAN_ID = "planId";
  private Integer planId;

  public static final String JSON_PROPERTY_PLAN_TYPE = "planType";
  private String planType;

  public static final String JSON_PROPERTY_EDIT_ALLOWED = "editAllowed";
  private String editAllowed;

  public static final String JSON_PROPERTY_FLEXIBLE_ALLOWED_TO_USE = "flexibleAllowedToUse";
  private String flexibleAllowedToUse;

  public static final String JSON_PROPERTY_CREATION_DATE_TIME = "creationDateTime";
  private Long creationDateTime;

  public static final String JSON_PROPERTY_FIRST_EXECUTION_DATE_TIME = "firstExecutionDateTime";
  private Long firstExecutionDateTime;

  public static final String JSON_PROPERTY_NEXT_EXECUTION_DATE_TIME = "nextExecutionDateTime";
  private Long nextExecutionDateTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TARGET_ASSET = "targetAsset";
  private String targetAsset;

  public static final String JSON_PROPERTY_SOURCE_ASSET = "sourceAsset";
  private String sourceAsset;

  public static final String JSON_PROPERTY_TOTAL_INVESTED_IN_U_S_D = "totalInvestedInUSD";
  private String totalInvestedInUSD;

  public static final String JSON_PROPERTY_PLAN_VALUE_IN_U_S_D = "planValueInUSD";
  private String planValueInUSD;

  public static final String JSON_PROPERTY_PNL_IN_U_S_D = "pnlInUSD";
  private String pnlInUSD;

  public static final String JSON_PROPERTY_ROI = "roi";
  private String roi;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private List<SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInnerDetailsInner> details = new ArrayList<>();

  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner() {
  }

  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner planId(Integer planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "12345", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getPlanId() {
    return planId;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlanId(Integer planId) {
    this.planId = planId;
  }


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner planType(String planType) {
    
    this.planType = planType;
    return this;
  }

   /**
   * Get planType
   * @return planType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SINGLE", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlanType() {
    return planType;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlanType(String planType) {
    this.planType = planType;
  }


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner editAllowed(String editAllowed) {
    
    this.editAllowed = editAllowed;
    return this;
  }

   /**
   * Get editAllowed
   * @return editAllowed
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EDIT_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEditAllowed() {
    return editAllowed;
  }


  @JsonProperty(JSON_PROPERTY_EDIT_ALLOWED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEditAllowed(String editAllowed) {
    this.editAllowed = editAllowed;
  }


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner flexibleAllowedToUse(String flexibleAllowedToUse) {
    
    this.flexibleAllowedToUse = flexibleAllowedToUse;
    return this;
  }

   /**
   * Get flexibleAllowedToUse
   * @return flexibleAllowedToUse
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FLEXIBLE_ALLOWED_TO_USE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFlexibleAllowedToUse() {
    return flexibleAllowedToUse;
  }


  @JsonProperty(JSON_PROPERTY_FLEXIBLE_ALLOWED_TO_USE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlexibleAllowedToUse(String flexibleAllowedToUse) {
    this.flexibleAllowedToUse = flexibleAllowedToUse;
  }


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner creationDateTime(Long creationDateTime) {
    
    this.creationDateTime = creationDateTime;
    return this;
  }

   /**
   * Get creationDateTime
   * @return creationDateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1648378800000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreationDateTime() {
    return creationDateTime;
  }


  @JsonProperty(JSON_PROPERTY_CREATION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreationDateTime(Long creationDateTime) {
    this.creationDateTime = creationDateTime;
  }


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner firstExecutionDateTime(Long firstExecutionDateTime) {
    
    this.firstExecutionDateTime = firstExecutionDateTime;
    return this;
  }

   /**
   * Get firstExecutionDateTime
   * @return firstExecutionDateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1648378800000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_EXECUTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getFirstExecutionDateTime() {
    return firstExecutionDateTime;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_EXECUTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstExecutionDateTime(Long firstExecutionDateTime) {
    this.firstExecutionDateTime = firstExecutionDateTime;
  }


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner nextExecutionDateTime(Long nextExecutionDateTime) {
    
    this.nextExecutionDateTime = nextExecutionDateTime;
    return this;
  }

   /**
   * Get nextExecutionDateTime
   * @return nextExecutionDateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1648378800000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NEXT_EXECUTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getNextExecutionDateTime() {
    return nextExecutionDateTime;
  }


  @JsonProperty(JSON_PROPERTY_NEXT_EXECUTION_DATE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNextExecutionDateTime(Long nextExecutionDateTime) {
    this.nextExecutionDateTime = nextExecutionDateTime;
  }


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "ONGOING", required = true, value = "")
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


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner targetAsset(String targetAsset) {
    
    this.targetAsset = targetAsset;
    return this;
  }

   /**
   * Get targetAsset
   * @return targetAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "")
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


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner sourceAsset(String sourceAsset) {
    
    this.sourceAsset = sourceAsset;
    return this;
  }

   /**
   * Get sourceAsset
   * @return sourceAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BUSD", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SOURCE_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSourceAsset() {
    return sourceAsset;
  }


  @JsonProperty(JSON_PROPERTY_SOURCE_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSourceAsset(String sourceAsset) {
    this.sourceAsset = sourceAsset;
  }


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner totalInvestedInUSD(String totalInvestedInUSD) {
    
    this.totalInvestedInUSD = totalInvestedInUSD;
    return this;
  }

   /**
   * Get totalInvestedInUSD
   * @return totalInvestedInUSD
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "4.555", required = true, value = "")
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


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner planValueInUSD(String planValueInUSD) {
    
    this.planValueInUSD = planValueInUSD;
    return this;
  }

   /**
   * Get planValueInUSD
   * @return planValueInUSD
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "101.2", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PLAN_VALUE_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPlanValueInUSD() {
    return planValueInUSD;
  }


  @JsonProperty(JSON_PROPERTY_PLAN_VALUE_IN_U_S_D)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlanValueInUSD(String planValueInUSD) {
    this.planValueInUSD = planValueInUSD;
  }


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner pnlInUSD(String pnlInUSD) {
    
    this.pnlInUSD = pnlInUSD;
    return this;
  }

   /**
   * Get pnlInUSD
   * @return pnlInUSD
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "101.2", required = true, value = "")
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


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner roi(String roi) {
    
    this.roi = roi;
    return this;
  }

   /**
   * Get roi
   * @return roi
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.02", required = true, value = "")
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


  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner details(List<SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInnerDetailsInner> details) {
    
    this.details = details;
    return this;
  }

  public SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner addDetailsItem(SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInnerDetailsInner detailsItem) {
    this.details.add(detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInnerDetailsInner> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDetails(List<SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInnerDetailsInner> details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner = (SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner) o;
    return Objects.equals(this.planId, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.planId) &&
        Objects.equals(this.planType, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.planType) &&
        Objects.equals(this.editAllowed, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.editAllowed) &&
        Objects.equals(this.flexibleAllowedToUse, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.flexibleAllowedToUse) &&
        Objects.equals(this.creationDateTime, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.creationDateTime) &&
        Objects.equals(this.firstExecutionDateTime, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.firstExecutionDateTime) &&
        Objects.equals(this.nextExecutionDateTime, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.nextExecutionDateTime) &&
        Objects.equals(this.status, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.status) &&
        Objects.equals(this.targetAsset, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.targetAsset) &&
        Objects.equals(this.sourceAsset, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.sourceAsset) &&
        Objects.equals(this.totalInvestedInUSD, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.totalInvestedInUSD) &&
        Objects.equals(this.planValueInUSD, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.planValueInUSD) &&
        Objects.equals(this.pnlInUSD, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.pnlInUSD) &&
        Objects.equals(this.roi, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.roi) &&
        Objects.equals(this.details, sapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, planType, editAllowed, flexibleAllowedToUse, creationDateTime, firstExecutionDateTime, nextExecutionDateTime, status, targetAsset, sourceAsset, totalInvestedInUSD, planValueInUSD, pnlInUSD, roi, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LendingAutoInvestPlanIdGet200ResponsePlanInner {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planType: ").append(toIndentedString(planType)).append("\n");
    sb.append("    editAllowed: ").append(toIndentedString(editAllowed)).append("\n");
    sb.append("    flexibleAllowedToUse: ").append(toIndentedString(flexibleAllowedToUse)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
    sb.append("    firstExecutionDateTime: ").append(toIndentedString(firstExecutionDateTime)).append("\n");
    sb.append("    nextExecutionDateTime: ").append(toIndentedString(nextExecutionDateTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetAsset: ").append(toIndentedString(targetAsset)).append("\n");
    sb.append("    sourceAsset: ").append(toIndentedString(sourceAsset)).append("\n");
    sb.append("    totalInvestedInUSD: ").append(toIndentedString(totalInvestedInUSD)).append("\n");
    sb.append("    planValueInUSD: ").append(toIndentedString(planValueInUSD)).append("\n");
    sb.append("    pnlInUSD: ").append(toIndentedString(pnlInUSD)).append("\n");
    sb.append("    roi: ").append(toIndentedString(roi)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

