package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1BlvtRedeemPost200Response;
import com.olbaid.binance.service.model.SapiV1BlvtRedeemRecordGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1BlvtSubscribePost200Response;
import com.olbaid.binance.service.model.SapiV1BlvtSubscribeRecordGet200Response;
import com.olbaid.binance.service.model.SapiV1BlvtTokenInfoGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1BlvtUserLimitGet200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BlvtApi {
  private ApiClient apiClient;

  public BlvtApi() {
    this(Configuration.getDefaultApiClient());
  }

  public BlvtApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Redeem BLVT (USER_DATA)
   * Weight(IP): 1
   * @param tokenName BTCDOWN, BTCUP (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1BlvtRedeemPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1BlvtRedeemPost200Response sapiV1BlvtRedeemPost(String tokenName, Double amount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tokenName' is set
    if (tokenName == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenName' when calling sapiV1BlvtRedeemPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1BlvtRedeemPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1BlvtRedeemPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1BlvtRedeemPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/blvt/redeem".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tokenName", tokenName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
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

    GenericType<SapiV1BlvtRedeemPost200Response> localVarReturnType = new GenericType<SapiV1BlvtRedeemPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Redemption Record (USER_DATA)
   * - Only the data of the latest 90 days is available  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param tokenName BTCDOWN, BTCUP (optional)
   * @param id  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit default 1000, max 1000 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1BlvtRedeemRecordGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1BlvtRedeemRecordGet200ResponseInner> sapiV1BlvtRedeemRecordGet(Long timestamp, String signature, String tokenName, Long id, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1BlvtRedeemRecordGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1BlvtRedeemRecordGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/blvt/redeem/record".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tokenName", tokenName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
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

    GenericType<List<SapiV1BlvtRedeemRecordGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1BlvtRedeemRecordGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Subscribe BLVT (USER_DATA)
   * Weight(IP): 1
   * @param tokenName BTCDOWN, BTCUP (required)
   * @param cost Spot balance (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1BlvtSubscribePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1BlvtSubscribePost200Response sapiV1BlvtSubscribePost(String tokenName, Double cost, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tokenName' is set
    if (tokenName == null) {
      throw new ApiException(400, "Missing the required parameter 'tokenName' when calling sapiV1BlvtSubscribePost");
    }
    
    // verify the required parameter 'cost' is set
    if (cost == null) {
      throw new ApiException(400, "Missing the required parameter 'cost' when calling sapiV1BlvtSubscribePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1BlvtSubscribePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1BlvtSubscribePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/blvt/subscribe".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tokenName", tokenName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cost", cost));
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

    GenericType<SapiV1BlvtSubscribePost200Response> localVarReturnType = new GenericType<SapiV1BlvtSubscribePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Subscription Record (USER_DATA)
   * - Only the data of the latest 90 days is available  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param tokenName BTCDOWN, BTCUP (optional)
   * @param id  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1BlvtSubscribeRecordGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1BlvtSubscribeRecordGet200Response sapiV1BlvtSubscribeRecordGet(Long timestamp, String signature, String tokenName, Long id, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1BlvtSubscribeRecordGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1BlvtSubscribeRecordGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/blvt/subscribe/record".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tokenName", tokenName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
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

    GenericType<SapiV1BlvtSubscribeRecordGet200Response> localVarReturnType = new GenericType<SapiV1BlvtSubscribeRecordGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * BLVT Info (MARKET_DATA)
   * Weight(IP): 1
   * @param tokenName BTCDOWN, BTCUP (optional)
   * @return a {@code List<SapiV1BlvtTokenInfoGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1BlvtTokenInfoGet200ResponseInner> sapiV1BlvtTokenInfoGet(String tokenName) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/blvt/tokenInfo".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tokenName", tokenName));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<List<SapiV1BlvtTokenInfoGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1BlvtTokenInfoGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * BLVT User Limit Info (USER_DATA)
   * Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param tokenName BTCDOWN, BTCUP (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1BlvtUserLimitGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1BlvtUserLimitGet200ResponseInner> sapiV1BlvtUserLimitGet(Long timestamp, String signature, String tokenName, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1BlvtUserLimitGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1BlvtUserLimitGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/blvt/userLimit".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tokenName", tokenName));
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

    GenericType<List<SapiV1BlvtUserLimitGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1BlvtUserLimitGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
