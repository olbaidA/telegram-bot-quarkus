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
 * SapiV1PortfolioRepayFuturesSwitchGet200Response
 */
@JsonPropertyOrder({
  SapiV1PortfolioRepayFuturesSwitchGet200Response.JSON_PROPERTY_AUTO_REPAY
})
@JsonTypeName("_sapi_v1_portfolio_repay_futures_switch_get_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1PortfolioRepayFuturesSwitchGet200Response {
  public static final String JSON_PROPERTY_AUTO_REPAY = "autoRepay";
  private Boolean autoRepay;

  public SapiV1PortfolioRepayFuturesSwitchGet200Response() {
  }

  public SapiV1PortfolioRepayFuturesSwitchGet200Response autoRepay(Boolean autoRepay) {
    
    this.autoRepay = autoRepay;
    return this;
  }

   /**
   * Get autoRepay
   * @return autoRepay
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUTO_REPAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getAutoRepay() {
    return autoRepay;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_REPAY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAutoRepay(Boolean autoRepay) {
    this.autoRepay = autoRepay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1PortfolioRepayFuturesSwitchGet200Response sapiV1PortfolioRepayFuturesSwitchGet200Response = (SapiV1PortfolioRepayFuturesSwitchGet200Response) o;
    return Objects.equals(this.autoRepay, sapiV1PortfolioRepayFuturesSwitchGet200Response.autoRepay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRepay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1PortfolioRepayFuturesSwitchGet200Response {\n");
    sb.append("    autoRepay: ").append(toIndentedString(autoRepay)).append("\n");
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
