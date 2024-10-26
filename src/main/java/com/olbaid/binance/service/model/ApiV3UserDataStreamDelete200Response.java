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
 * ApiV3UserDataStreamDelete200Response
 */
@JsonPropertyOrder({
  ApiV3UserDataStreamDelete200Response.JSON_PROPERTY_LISTEN_KEY
})
@JsonTypeName("_api_v3_userDataStream_delete_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ApiV3UserDataStreamDelete200Response {
  public static final String JSON_PROPERTY_LISTEN_KEY = "listenKey";
  private String listenKey;

  public ApiV3UserDataStreamDelete200Response() {
  }

  public ApiV3UserDataStreamDelete200Response listenKey(String listenKey) {
    
    this.listenKey = listenKey;
    return this;
  }

   /**
   * Get listenKey
   * @return listenKey
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "pqia91ma19a5s61cv6a81va65sdf19v8a65a1a5s61cv6a81va65sdf19v8a65a1", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LISTEN_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getListenKey() {
    return listenKey;
  }


  @JsonProperty(JSON_PROPERTY_LISTEN_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListenKey(String listenKey) {
    this.listenKey = listenKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiV3UserDataStreamDelete200Response apiV3UserDataStreamDelete200Response = (ApiV3UserDataStreamDelete200Response) o;
    return Objects.equals(this.listenKey, apiV3UserDataStreamDelete200Response.listenKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiV3UserDataStreamDelete200Response {\n");
    sb.append("    listenKey: ").append(toIndentedString(listenKey)).append("\n");
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
