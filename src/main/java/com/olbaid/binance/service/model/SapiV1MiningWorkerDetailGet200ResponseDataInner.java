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
import com.olbaid.binance.service.model.SapiV1MiningWorkerDetailGet200ResponseDataInnerHashrateDatasInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1MiningWorkerDetailGet200ResponseDataInner
 */
@JsonPropertyOrder({
  SapiV1MiningWorkerDetailGet200ResponseDataInner.JSON_PROPERTY_WORKER_NAME,
  SapiV1MiningWorkerDetailGet200ResponseDataInner.JSON_PROPERTY_TYPE,
  SapiV1MiningWorkerDetailGet200ResponseDataInner.JSON_PROPERTY_HASHRATE_DATAS
})
@JsonTypeName("_sapi_v1_mining_worker_detail_get_200_response_data_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MiningWorkerDetailGet200ResponseDataInner {
  public static final String JSON_PROPERTY_WORKER_NAME = "workerName";
  private String workerName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_HASHRATE_DATAS = "hashrateDatas";
  private List<SapiV1MiningWorkerDetailGet200ResponseDataInnerHashrateDatasInner> hashrateDatas = new ArrayList<>();

  public SapiV1MiningWorkerDetailGet200ResponseDataInner() {
  }

  public SapiV1MiningWorkerDetailGet200ResponseDataInner workerName(String workerName) {
    
    this.workerName = workerName;
    return this;
  }

   /**
   * Mining Account name
   * @return workerName
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "bhdc1.16A10404B", required = true, value = "Mining Account name")
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


  public SapiV1MiningWorkerDetailGet200ResponseDataInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of hourly hashrate
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "H_hashrate", required = true, value = "Type of hourly hashrate")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public SapiV1MiningWorkerDetailGet200ResponseDataInner hashrateDatas(List<SapiV1MiningWorkerDetailGet200ResponseDataInnerHashrateDatasInner> hashrateDatas) {
    
    this.hashrateDatas = hashrateDatas;
    return this;
  }

  public SapiV1MiningWorkerDetailGet200ResponseDataInner addHashrateDatasItem(SapiV1MiningWorkerDetailGet200ResponseDataInnerHashrateDatasInner hashrateDatasItem) {
    this.hashrateDatas.add(hashrateDatasItem);
    return this;
  }

   /**
   * Get hashrateDatas
   * @return hashrateDatas
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_HASHRATE_DATAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1MiningWorkerDetailGet200ResponseDataInnerHashrateDatasInner> getHashrateDatas() {
    return hashrateDatas;
  }


  @JsonProperty(JSON_PROPERTY_HASHRATE_DATAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHashrateDatas(List<SapiV1MiningWorkerDetailGet200ResponseDataInnerHashrateDatasInner> hashrateDatas) {
    this.hashrateDatas = hashrateDatas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1MiningWorkerDetailGet200ResponseDataInner sapiV1MiningWorkerDetailGet200ResponseDataInner = (SapiV1MiningWorkerDetailGet200ResponseDataInner) o;
    return Objects.equals(this.workerName, sapiV1MiningWorkerDetailGet200ResponseDataInner.workerName) &&
        Objects.equals(this.type, sapiV1MiningWorkerDetailGet200ResponseDataInner.type) &&
        Objects.equals(this.hashrateDatas, sapiV1MiningWorkerDetailGet200ResponseDataInner.hashrateDatas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workerName, type, hashrateDatas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MiningWorkerDetailGet200ResponseDataInner {\n");
    sb.append("    workerName: ").append(toIndentedString(workerName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    hashrateDatas: ").append(toIndentedString(hashrateDatas)).append("\n");
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
