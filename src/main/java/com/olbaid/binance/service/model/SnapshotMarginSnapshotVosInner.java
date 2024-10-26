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
import com.olbaid.binance.service.model.SnapshotMarginSnapshotVosInnerData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SnapshotMarginSnapshotVosInner
 */
@JsonPropertyOrder({
  SnapshotMarginSnapshotVosInner.JSON_PROPERTY_DATA,
  SnapshotMarginSnapshotVosInner.JSON_PROPERTY_TYPE,
  SnapshotMarginSnapshotVosInner.JSON_PROPERTY_UPDATE_TIME
})
@JsonTypeName("snapshotMargin_snapshotVos_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SnapshotMarginSnapshotVosInner {
  public static final String JSON_PROPERTY_DATA = "data";
  private SnapshotMarginSnapshotVosInnerData data;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private Long updateTime;

  public SnapshotMarginSnapshotVosInner() {
  }

  public SnapshotMarginSnapshotVosInner data(SnapshotMarginSnapshotVosInnerData data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SnapshotMarginSnapshotVosInnerData getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(SnapshotMarginSnapshotVosInnerData data) {
    this.data = data;
  }


  public SnapshotMarginSnapshotVosInner type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "margin", required = true, value = "")
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


  public SnapshotMarginSnapshotVosInner updateTime(Long updateTime) {
    
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Get updateTime
   * @return updateTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1576281599000", required = true, value = "")
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
    SnapshotMarginSnapshotVosInner snapshotMarginSnapshotVosInner = (SnapshotMarginSnapshotVosInner) o;
    return Objects.equals(this.data, snapshotMarginSnapshotVosInner.data) &&
        Objects.equals(this.type, snapshotMarginSnapshotVosInner.type) &&
        Objects.equals(this.updateTime, snapshotMarginSnapshotVosInner.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, type, updateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotMarginSnapshotVosInner {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
