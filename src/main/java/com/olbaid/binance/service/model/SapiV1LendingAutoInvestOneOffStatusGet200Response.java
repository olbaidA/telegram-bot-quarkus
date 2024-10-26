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
 * SapiV1LendingAutoInvestOneOffStatusGet200Response
 */
@JsonPropertyOrder({
  SapiV1LendingAutoInvestOneOffStatusGet200Response.JSON_PROPERTY_TRANSACTION_ID,
  SapiV1LendingAutoInvestOneOffStatusGet200Response.JSON_PROPERTY_STATUS
})
@JsonTypeName("_sapi_v1_lending_auto_invest_one_off_status_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1LendingAutoInvestOneOffStatusGet200Response {
  public static final String JSON_PROPERTY_TRANSACTION_ID = "transactionId";
  private Long transactionId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public SapiV1LendingAutoInvestOneOffStatusGet200Response() {
  }

  public SapiV1LendingAutoInvestOneOffStatusGet200Response transactionId(Long transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "12345", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTransactionId() {
    return transactionId;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionId(Long transactionId) {
    this.transactionId = transactionId;
  }


  public SapiV1LendingAutoInvestOneOffStatusGet200Response status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "SUCCESS", required = true, value = "")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1LendingAutoInvestOneOffStatusGet200Response sapiV1LendingAutoInvestOneOffStatusGet200Response = (SapiV1LendingAutoInvestOneOffStatusGet200Response) o;
    return Objects.equals(this.transactionId, sapiV1LendingAutoInvestOneOffStatusGet200Response.transactionId) &&
        Objects.equals(this.status, sapiV1LendingAutoInvestOneOffStatusGet200Response.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1LendingAutoInvestOneOffStatusGet200Response {\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

