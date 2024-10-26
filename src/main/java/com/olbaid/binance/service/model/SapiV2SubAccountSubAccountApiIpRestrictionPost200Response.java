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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV2SubAccountSubAccountApiIpRestrictionPost200Response
 */
@JsonPropertyOrder({
  SapiV2SubAccountSubAccountApiIpRestrictionPost200Response.JSON_PROPERTY_STATUS,
  SapiV2SubAccountSubAccountApiIpRestrictionPost200Response.JSON_PROPERTY_IP_LIST,
  SapiV2SubAccountSubAccountApiIpRestrictionPost200Response.JSON_PROPERTY_UPDATE_TIME,
  SapiV2SubAccountSubAccountApiIpRestrictionPost200Response.JSON_PROPERTY_API_KEY
})
@JsonTypeName("_sapi_v2_sub_account_subAccountApi_ipRestriction_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV2SubAccountSubAccountApiIpRestrictionPost200Response {
  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_IP_LIST = "ipList";
  private List<String> ipList = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private Long updateTime;

  public static final String JSON_PROPERTY_API_KEY = "apiKey";
  private String apiKey;

  public SapiV2SubAccountSubAccountApiIpRestrictionPost200Response() {
  }

  public SapiV2SubAccountSubAccountApiIpRestrictionPost200Response status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2", required = true, value = "")
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


  public SapiV2SubAccountSubAccountApiIpRestrictionPost200Response ipList(List<String> ipList) {
    
    this.ipList = ipList;
    return this;
  }

  public SapiV2SubAccountSubAccountApiIpRestrictionPost200Response addIpListItem(String ipListItem) {
    this.ipList.add(ipListItem);
    return this;
  }

   /**
   * Get ipList
   * @return ipList
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[\"69.210.67.14\",\"8.34.21.10\",\"thirdPartyName\"]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IP_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getIpList() {
    return ipList;
  }


  @JsonProperty(JSON_PROPERTY_IP_LIST)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIpList(List<String> ipList) {
    this.ipList = ipList;
  }


  public SapiV2SubAccountSubAccountApiIpRestrictionPost200Response updateTime(Long updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1636369557189", required = true, value = "")
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


  public SapiV2SubAccountSubAccountApiIpRestrictionPost200Response apiKey(String apiKey) {
    
    this.apiKey = apiKey;
    return this;
  }

   /**
   * Get apiKey
   * @return apiKey
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "k5V49ldtn4tszj6W3hystegdfvmGbqDzjmkCtpTvC0G74WhK7yd4rfCTo4lShf", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getApiKey() {
    return apiKey;
  }


  @JsonProperty(JSON_PROPERTY_API_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV2SubAccountSubAccountApiIpRestrictionPost200Response sapiV2SubAccountSubAccountApiIpRestrictionPost200Response = (SapiV2SubAccountSubAccountApiIpRestrictionPost200Response) o;
    return Objects.equals(this.status, sapiV2SubAccountSubAccountApiIpRestrictionPost200Response.status) &&
        Objects.equals(this.ipList, sapiV2SubAccountSubAccountApiIpRestrictionPost200Response.ipList) &&
        Objects.equals(this.updateTime, sapiV2SubAccountSubAccountApiIpRestrictionPost200Response.updateTime) &&
        Objects.equals(this.apiKey, sapiV2SubAccountSubAccountApiIpRestrictionPost200Response.apiKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, ipList, updateTime, apiKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV2SubAccountSubAccountApiIpRestrictionPost200Response {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    ipList: ").append(toIndentedString(ipList)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
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

