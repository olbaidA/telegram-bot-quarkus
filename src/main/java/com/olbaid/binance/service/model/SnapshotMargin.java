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
import com.olbaid.binance.service.model.SnapshotMarginSnapshotVosInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SnapshotMargin
 */
@JsonPropertyOrder({
  SnapshotMargin.JSON_PROPERTY_CODE,
  SnapshotMargin.JSON_PROPERTY_MSG,
  SnapshotMargin.JSON_PROPERTY_SNAPSHOT_VOS
})
@JsonTypeName("snapshotMargin")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SnapshotMargin {
  public static final String JSON_PROPERTY_CODE = "code";
  private Long code;

  public static final String JSON_PROPERTY_MSG = "msg";
  private String msg;

  public static final String JSON_PROPERTY_SNAPSHOT_VOS = "snapshotVos";
  private List<SnapshotMarginSnapshotVosInner> snapshotVos = new ArrayList<>();

  public SnapshotMargin() {
  }

  public SnapshotMargin code(Long code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(Long code) {
    this.code = code;
  }


  public SnapshotMargin msg(String msg) {
    
    this.msg = msg;
    return this;
  }

   /**
   * Get msg
   * @return msg
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMsg() {
    return msg;
  }


  @JsonProperty(JSON_PROPERTY_MSG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMsg(String msg) {
    this.msg = msg;
  }


  public SnapshotMargin snapshotVos(List<SnapshotMarginSnapshotVosInner> snapshotVos) {
    
    this.snapshotVos = snapshotVos;
    return this;
  }

  public SnapshotMargin addSnapshotVosItem(SnapshotMarginSnapshotVosInner snapshotVosItem) {
    this.snapshotVos.add(snapshotVosItem);
    return this;
  }

   /**
   * Get snapshotVos
   * @return snapshotVos
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_VOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SnapshotMarginSnapshotVosInner> getSnapshotVos() {
    return snapshotVos;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_VOS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSnapshotVos(List<SnapshotMarginSnapshotVosInner> snapshotVos) {
    this.snapshotVos = snapshotVos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotMargin snapshotMargin = (SnapshotMargin) o;
    return Objects.equals(this.code, snapshotMargin.code) &&
        Objects.equals(this.msg, snapshotMargin.msg) &&
        Objects.equals(this.snapshotVos, snapshotMargin.snapshotVos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, msg, snapshotVos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotMargin {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
    sb.append("    snapshotVos: ").append(toIndentedString(snapshotVos)).append("\n");
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

