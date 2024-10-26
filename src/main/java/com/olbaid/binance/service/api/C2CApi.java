package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1C2cOrderMatchListUserOrderHistoryGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class C2CApi {
  private ApiClient apiClient;

  public C2CApi() {
    this(Configuration.getDefaultApiClient());
  }

  public C2CApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get C2C Trade History (USER_DATA)
   * - If startTimestamp and endTimestamp are not sent, the recent 30-day data will be returned. - The max interval between startTimestamp and endTimestamp is 30 days.  Weight(IP): 1
   * @param tradeType  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTimestamp UTC timestamp in ms (optional)
   * @param endTimestamp UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param rows default 100, max 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1C2cOrderMatchListUserOrderHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1C2cOrderMatchListUserOrderHistoryGet200Response sapiV1C2cOrderMatchListUserOrderHistoryGet(String tradeType, Long timestamp, String signature, Long startTimestamp, Long endTimestamp, Integer page, Integer rows, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tradeType' is set
    if (tradeType == null) {
      throw new ApiException(400, "Missing the required parameter 'tradeType' when calling sapiV1C2cOrderMatchListUserOrderHistoryGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1C2cOrderMatchListUserOrderHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1C2cOrderMatchListUserOrderHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/c2c/orderMatch/listUserOrderHistory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tradeType", tradeType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTimestamp", startTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTimestamp", endTimestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "rows", rows));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recvWindow", recvWindow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timestamp", timestamp));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "signature", signature));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<SapiV1C2cOrderMatchListUserOrderHistoryGet200Response> localVarReturnType = new GenericType<SapiV1C2cOrderMatchListUserOrderHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
