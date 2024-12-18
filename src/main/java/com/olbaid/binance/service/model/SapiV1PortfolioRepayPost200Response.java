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
 * SapiV1PortfolioRepayPost200Response
 */
@JsonPropertyOrder({
  SapiV1PortfolioRepayPost200Response.JSON_PROPERTY_TRAN_ID
})
@JsonTypeName("_sapi_v1_portfolio_repay_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1PortfolioRepayPost200Response {
  public static final String JSON_PROPERTY_TRAN_ID = "tranId";
  private Long tranId;

  public SapiV1PortfolioRepayPost200Response() {
  }

  public SapiV1PortfolioRepayPost200Response tranId(Long tranId) {
    
    this.tranId = tranId;
    return this;
  }

   /**
   * Get tranId
   * @return tranId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "58203331886213500", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTranId() {
    return tranId;
  }


  @JsonProperty(JSON_PROPERTY_TRAN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTranId(Long tranId) {
    this.tranId = tranId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1PortfolioRepayPost200Response sapiV1PortfolioRepayPost200Response = (SapiV1PortfolioRepayPost200Response) o;
    return Objects.equals(this.tranId, sapiV1PortfolioRepayPost200Response.tranId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1PortfolioRepayPost200Response {\n");
    sb.append("    tranId: ").append(toIndentedString(tranId)).append("\n");
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

