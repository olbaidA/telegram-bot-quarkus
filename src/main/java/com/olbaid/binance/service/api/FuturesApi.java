package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1FuturesHistDataLinkGet200Response;
import com.olbaid.binance.service.model.SapiV1FuturesTransferGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginBorrowRepayGet200Response1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FuturesApi {
  private ApiClient apiClient;

  public FuturesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FuturesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get Future TickLevel Orderbook Historical Data Download Link (USER_DATA)
   * Weight(IP): 1
   * @param symbol  (required)
   * @param dataType  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1FuturesHistDataLinkGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1FuturesHistDataLinkGet200Response sapiV1FuturesHistDataLinkGet(String symbol, String dataType, Long timestamp, String signature, Long startTime, Long endTime, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1FuturesHistDataLinkGet");
    }
    
    // verify the required parameter 'dataType' is set
    if (dataType == null) {
      throw new ApiException(400, "Missing the required parameter 'dataType' when calling sapiV1FuturesHistDataLinkGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1FuturesHistDataLinkGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1FuturesHistDataLinkGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/futures/histDataLink".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataType", dataType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
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

    GenericType<SapiV1FuturesHistDataLinkGet200Response> localVarReturnType = new GenericType<SapiV1FuturesHistDataLinkGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Future Account Transaction History List (USER_DATA)
   * Weight(IP): 10
   * @param asset  (required)
   * @param startTime UTC timestamp in ms (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1FuturesTransferGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1FuturesTransferGet200Response sapiV1FuturesTransferGet(String asset, Long startTime, Long timestamp, String signature, Long endTime, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1FuturesTransferGet");
    }
    
    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(400, "Missing the required parameter 'startTime' when calling sapiV1FuturesTransferGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1FuturesTransferGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1FuturesTransferGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/futures/transfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
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

    GenericType<SapiV1FuturesTransferGet200Response> localVarReturnType = new GenericType<SapiV1FuturesTransferGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * New Future Account Transfer (USER_DATA)
   * Execute transfer between spot account and futures account.  Weight(IP): 1
   * @param asset  (required)
   * @param amount  (required)
   * @param type 1: transfer from spot account to USDT-â“‚ futures account. 2: transfer from USDT-â“‚ futures account to spot account. 3: transfer from spot account to COIN-â“‚ futures account. 4: transfer from COIN-â“‚ futures account to spot account. (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginBorrowRepayGet200Response1}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginBorrowRepayGet200Response1 sapiV1FuturesTransferPost(String asset, Double amount, Long type, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1FuturesTransferPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1FuturesTransferPost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1FuturesTransferPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1FuturesTransferPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1FuturesTransferPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/futures/transfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
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

    GenericType<SapiV1MarginBorrowRepayGet200Response1> localVarReturnType = new GenericType<SapiV1MarginBorrowRepayGet200Response1>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
