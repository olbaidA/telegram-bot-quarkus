package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1FiatOrdersGet200Response;
import com.olbaid.binance.service.model.SapiV1FiatPaymentsGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FiatApi {
  private ApiClient apiClient;

  public FiatApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FiatApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Fiat Deposit/Withdraw History (USER_DATA)
   * - If beginTime and endTime are not sent, the recent 30-day data will be returned.  Weight(UID): 90000
   * @param transactionType * &#x60;0&#x60; - deposit * &#x60;1&#x60; - withdraw (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param beginTime  (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param rows Default 100, max 500 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1FiatOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1FiatOrdersGet200Response sapiV1FiatOrdersGet(Integer transactionType, Long timestamp, String signature, Long beginTime, Long endTime, Integer page, Integer rows, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionType' is set
    if (transactionType == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionType' when calling sapiV1FiatOrdersGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1FiatOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1FiatOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/fiat/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionType", transactionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginTime", beginTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
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

    GenericType<SapiV1FiatOrdersGet200Response> localVarReturnType = new GenericType<SapiV1FiatOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fiat Payments History (USER_DATA)
   * - If beginTime and endTime are not sent, the recent 30-day data will be returned.  Weight(IP): 1
   * @param transactionType * &#x60;0&#x60; - deposit * &#x60;1&#x60; - withdraw (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param beginTime  (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param rows Default 100, max 500 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1FiatPaymentsGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1FiatPaymentsGet200Response sapiV1FiatPaymentsGet(Integer transactionType, Long timestamp, String signature, Long beginTime, Long endTime, Integer page, Integer rows, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionType' is set
    if (transactionType == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionType' when calling sapiV1FiatPaymentsGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1FiatPaymentsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1FiatPaymentsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/fiat/payments".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionType", transactionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "beginTime", beginTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
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

    GenericType<SapiV1FiatPaymentsGet200Response> localVarReturnType = new GenericType<SapiV1FiatPaymentsGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
