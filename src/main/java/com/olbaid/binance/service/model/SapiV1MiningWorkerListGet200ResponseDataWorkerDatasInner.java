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
 * SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner
 */
@JsonPropertyOrder({
  SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.JSON_PROPERTY_WORKER_ID,
  SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.JSON_PROPERTY_WORKER_NAME,
  SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.JSON_PROPERTY_STATUS,
  SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.JSON_PROPERTY_HASH_RATE,
  SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.JSON_PROPERTY_DAY_HASH_RATE,
  SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.JSON_PROPERTY_REJECT_RATE,
  SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.JSON_PROPERTY_LAST_SHARE_TIME
})
@JsonTypeName("_sapi_v1_mining_worker_list_get_200_response_data_workerDatas_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner {
  public static final String JSON_PROPERTY_WORKER_ID = "workerId";
  private String workerId;

  public static final String JSON_PROPERTY_WORKER_NAME = "workerName";
  private String workerName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Long status;

  public static final String JSON_PROPERTY_HASH_RATE = "hashRate";
  private Long hashRate;

  public static final String JSON_PROPERTY_DAY_HASH_RATE = "dayHashRate";
  private Long dayHashRate;

  public static final String JSON_PROPERTY_REJECT_RATE = "rejectRate";
  private Long rejectRate;

  public static final String JSON_PROPERTY_LAST_SHARE_TIME = "lastShareTime";
  private Long lastShareTime;

  public SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner() {
  }

  public SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner workerId(String workerId) {
    
    this.workerId = workerId;
    return this;
  }

   /**
   * Get workerId
   * @return workerId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1420554439452400131", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWorkerId() {
    return workerId;
  }


  @JsonProperty(JSON_PROPERTY_WORKER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  public SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner workerName(String workerName) {
    
    this.workerName = workerName;
    return this;
  }

   /**
   * Get workerName
   * @return workerName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "2X73", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWorkerName() {
    return workerName;
  }


  @JsonProperty(JSON_PROPERTY_WORKER_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorkerName(String workerName) {
    this.workerName = workerName;
  }


  public SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * Statusï¼š1 valid, 2 invalid, 3 no longer valid
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "3", required = true, value = "Statusï¼š1 valid, 2 invalid, 3 no longer valid")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(Long status) {
    this.status = status;
  }


  public SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner hashRate(Long hashRate) {
    
    this.hashRate = hashRate;
    return this;
  }

   /**
   * Real-time rate
   * @return hashRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Real-time rate")
  @JsonProperty(JSON_PROPERTY_HASH_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getHashRate() {
    return hashRate;
  }


  @JsonProperty(JSON_PROPERTY_HASH_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHashRate(Long hashRate) {
    this.hashRate = hashRate;
  }


  public SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner dayHashRate(Long dayHashRate) {
    
    this.dayHashRate = dayHashRate;
    return this;
  }

   /**
   * 24H Hashrate
   * @return dayHashRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "24H Hashrate")
  @JsonProperty(JSON_PROPERTY_DAY_HASH_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getDayHashRate() {
    return dayHashRate;
  }


  @JsonProperty(JSON_PROPERTY_DAY_HASH_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDayHashRate(Long dayHashRate) {
    this.dayHashRate = dayHashRate;
  }


  public SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner rejectRate(Long rejectRate) {
    
    this.rejectRate = rejectRate;
    return this;
  }

   /**
   * Real-time Rejection Rate
   * @return rejectRate
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Real-time Rejection Rate")
  @JsonProperty(JSON_PROPERTY_REJECT_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getRejectRate() {
    return rejectRate;
  }


  @JsonProperty(JSON_PROPERTY_REJECT_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRejectRate(Long rejectRate) {
    this.rejectRate = rejectRate;
  }


  public SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner lastShareTime(Long lastShareTime) {
    
    this.lastShareTime = lastShareTime;
    return this;
  }

   /**
   * Last submission time
   * @return lastShareTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1587712919000", required = true, value = "Last submission time")
  @JsonProperty(JSON_PROPERTY_LAST_SHARE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getLastShareTime() {
    return lastShareTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SHARE_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLastShareTime(Long lastShareTime) {
    this.lastShareTime = lastShareTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner sapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner = (SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner) o;
    return Objects.equals(this.workerId, sapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.workerId) &&
        Objects.equals(this.workerName, sapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.workerName) &&
        Objects.equals(this.status, sapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.status) &&
        Objects.equals(this.hashRate, sapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.hashRate) &&
        Objects.equals(this.dayHashRate, sapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.dayHashRate) &&
        Objects.equals(this.rejectRate, sapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.rejectRate) &&
        Objects.equals(this.lastShareTime, sapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner.lastShareTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerId, workerName, status, hashRate, dayHashRate, rejectRate, lastShareTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MiningWorkerListGet200ResponseDataWorkerDatasInner {\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    workerName: ").append(toIndentedString(workerName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    hashRate: ").append(toIndentedString(hashRate)).append("\n");
    sb.append("    dayHashRate: ").append(toIndentedString(dayHashRate)).append("\n");
    sb.append("    rejectRate: ").append(toIndentedString(rejectRate)).append("\n");
    sb.append("    lastShareTime: ").append(toIndentedString(lastShareTime)).append("\n");
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

