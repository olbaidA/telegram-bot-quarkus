package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1MarginMaxLeveragePost200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnAccountGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexibleHistoryCollateralRecordGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexibleHistoryRateHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexibleHistoryRewardsRecordGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexibleHistorySubscriptionRecordGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexibleListGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexiblePersonalLeftQuotaGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexiblePositionGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexibleRedeemPost200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexibleSubscribePost200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnFlexibleSubscriptionPreviewGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnLockedHistoryRedemptionRecordGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnLockedHistoryRewardsRecordGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnLockedHistorySubscriptionRecordGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnLockedListGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnLockedPositionGet200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnLockedSubscribePost200Response;
import com.olbaid.binance.service.model.SapiV1SimpleEarnLockedSubscriptionPreviewGet200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SimpleEarnApi {
  private ApiClient apiClient;

  public SimpleEarnApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SimpleEarnApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Simple Account (USER_DATA)
   * Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnAccountGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnAccountGet200Response sapiV1SimpleEarnAccountGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnAccountGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnAccountGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/account".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<SapiV1SimpleEarnAccountGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnAccountGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Collateral Record (USER_DATA)
   * Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param productId  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleHistoryCollateralRecordGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleHistoryCollateralRecordGet200Response sapiV1SimpleEarnFlexibleHistoryCollateralRecordGet(Long timestamp, String signature, String productId, Long startTime, Long endTime, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexibleHistoryCollateralRecordGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexibleHistoryCollateralRecordGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/history/collateralRecord".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
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

    GenericType<SapiV1SimpleEarnFlexibleHistoryCollateralRecordGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleHistoryCollateralRecordGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Rate History (USER_DATA)
   * Weight(IP): 150
   * @param productId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleHistoryRateHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleHistoryRateHistoryGet200Response sapiV1SimpleEarnFlexibleHistoryRateHistoryGet(String productId, Long timestamp, String signature, Long startTime, Long endTime, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling sapiV1SimpleEarnFlexibleHistoryRateHistoryGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexibleHistoryRateHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexibleHistoryRateHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/history/rateHistory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
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

    GenericType<SapiV1SimpleEarnFlexibleHistoryRateHistoryGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleHistoryRateHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Flexible Redemption Record (USER_DATA)
   * Weight(IP): 150
   * @param productId  (optional)
   * @param redeemId  (optional)
   * @param asset  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200Response sapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet(String productId, String redeemId, String asset, Long startTime, Long endTime, Integer current, Integer size) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/history/redemptionRecord".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redeemId", redeemId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleHistoryRedemptionRecordGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Flexible Rewards History (USER_DATA)
   * Weight(IP): 150
   * @param type \&quot;BONUS\&quot;, \&quot;REALTIME\&quot;, \&quot;REWARDS\&quot; (required)
   * @param productId  (optional)
   * @param asset  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleHistoryRewardsRecordGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleHistoryRewardsRecordGet200Response sapiV1SimpleEarnFlexibleHistoryRewardsRecordGet(String type, String productId, String asset, Long startTime, Long endTime) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1SimpleEarnFlexibleHistoryRewardsRecordGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/history/rewardsRecord".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<SapiV1SimpleEarnFlexibleHistoryRewardsRecordGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleHistoryRewardsRecordGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Flexible Subscription Record (USER_DATA)
   * Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param productId  (optional)
   * @param purchaseId  (optional)
   * @param asset  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleHistorySubscriptionRecordGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleHistorySubscriptionRecordGet200Response sapiV1SimpleEarnFlexibleHistorySubscriptionRecordGet(Long timestamp, String signature, String productId, String purchaseId, String asset, Long startTime, Long endTime, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexibleHistorySubscriptionRecordGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexibleHistorySubscriptionRecordGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/history/subscriptionRecord".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "purchaseId", purchaseId));
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

    GenericType<SapiV1SimpleEarnFlexibleHistorySubscriptionRecordGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleHistorySubscriptionRecordGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Simple Earn Flexible Product List (USER_DATA)
   * Get available Simple Earn flexible product list  Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleListGet200Response sapiV1SimpleEarnFlexibleListGet(Long timestamp, String signature, String asset, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexibleListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexibleListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<SapiV1SimpleEarnFlexibleListGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Flexible Personal Left Quota (USER_DATA)
   * Weight(IP): 150
   * @param productId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexiblePersonalLeftQuotaGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexiblePersonalLeftQuotaGet200Response sapiV1SimpleEarnFlexiblePersonalLeftQuotaGet(String productId, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling sapiV1SimpleEarnFlexiblePersonalLeftQuotaGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexiblePersonalLeftQuotaGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexiblePersonalLeftQuotaGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/personalLeftQuota".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
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

    GenericType<SapiV1SimpleEarnFlexiblePersonalLeftQuotaGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexiblePersonalLeftQuotaGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Flexible Product Position (USER_DATA)
   * Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param productId  (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexiblePositionGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexiblePositionGet200Response sapiV1SimpleEarnFlexiblePositionGet(Long timestamp, String signature, String asset, String productId, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexiblePositionGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexiblePositionGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/position".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
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

    GenericType<SapiV1SimpleEarnFlexiblePositionGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexiblePositionGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Redeem Flexible Product (TRADE)
   * Weight(IP): 1  Rate Limit: 1/3s per account
   * @param productId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param redeemAll true or false, default to false (optional)
   * @param amount if redeemAll is false, amount is mandatory (optional)
   * @param destAccount SPOT,FUND,ALL, default SPOT (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleRedeemPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleRedeemPost200Response sapiV1SimpleEarnFlexibleRedeemPost(String productId, Long timestamp, String signature, Boolean redeemAll, Double amount, String destAccount, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling sapiV1SimpleEarnFlexibleRedeemPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexibleRedeemPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexibleRedeemPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/redeem".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redeemAll", redeemAll));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "destAccount", destAccount));
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

    GenericType<SapiV1SimpleEarnFlexibleRedeemPost200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleRedeemPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set Flexible Auto Subscribe (USER_DATA)
   * Weight(IP): 150
   * @param productId  (required)
   * @param autoSubscribe true or false (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginMaxLeveragePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginMaxLeveragePost200Response sapiV1SimpleEarnFlexibleSetAutoSubscribePost(String productId, Boolean autoSubscribe, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling sapiV1SimpleEarnFlexibleSetAutoSubscribePost");
    }
    
    // verify the required parameter 'autoSubscribe' is set
    if (autoSubscribe == null) {
      throw new ApiException(400, "Missing the required parameter 'autoSubscribe' when calling sapiV1SimpleEarnFlexibleSetAutoSubscribePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexibleSetAutoSubscribePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexibleSetAutoSubscribePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/setAutoSubscribe".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoSubscribe", autoSubscribe));
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

    GenericType<SapiV1MarginMaxLeveragePost200Response> localVarReturnType = new GenericType<SapiV1MarginMaxLeveragePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Subscribe Flexible Product (TRADE)
   * Weight(IP): 1  Rate Limit: 1/3s per account
   * @param productId  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param autoSubscribe true or false, default true. (optional)
   * @param sourceAccount SPOT,FUND,ALL, default SPOT (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleSubscribePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleSubscribePost200Response sapiV1SimpleEarnFlexibleSubscribePost(String productId, Double amount, Long timestamp, String signature, Boolean autoSubscribe, String sourceAccount, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling sapiV1SimpleEarnFlexibleSubscribePost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SimpleEarnFlexibleSubscribePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexibleSubscribePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexibleSubscribePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/subscribe".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoSubscribe", autoSubscribe));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceAccount", sourceAccount));
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

    GenericType<SapiV1SimpleEarnFlexibleSubscribePost200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleSubscribePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Flexible Subscription Preview (USER_DATA)
   * Weight(IP): 150
   * @param productId  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleSubscriptionPreviewGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleSubscriptionPreviewGet200Response sapiV1SimpleEarnFlexibleSubscriptionPreviewGet(String productId, Double amount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'productId' is set
    if (productId == null) {
      throw new ApiException(400, "Missing the required parameter 'productId' when calling sapiV1SimpleEarnFlexibleSubscriptionPreviewGet");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SimpleEarnFlexibleSubscriptionPreviewGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnFlexibleSubscriptionPreviewGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnFlexibleSubscriptionPreviewGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/flexible/subscriptionPreview".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "productId", productId));
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

    GenericType<SapiV1SimpleEarnFlexibleSubscriptionPreviewGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleSubscriptionPreviewGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Locked Redemption Record (USER_DATA)
   * Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param positionId  (optional)
   * @param redeemId  (optional)
   * @param asset  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnLockedHistoryRedemptionRecordGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnLockedHistoryRedemptionRecordGet200Response sapiV1SimpleEarnLockedHistoryRedemptionRecordGet(Long timestamp, String signature, String positionId, String redeemId, String asset, Long startTime, Long endTime, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedHistoryRedemptionRecordGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedHistoryRedemptionRecordGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/history/redemptionRecord".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "positionId", positionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redeemId", redeemId));
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

    GenericType<SapiV1SimpleEarnLockedHistoryRedemptionRecordGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnLockedHistoryRedemptionRecordGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Locked Rewards History (USER_DATA)
   * Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param positionId  (optional)
   * @param asset  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnLockedHistoryRewardsRecordGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnLockedHistoryRewardsRecordGet200Response sapiV1SimpleEarnLockedHistoryRewardsRecordGet(Long timestamp, String signature, String positionId, String asset, Long startTime, Long endTime, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedHistoryRewardsRecordGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedHistoryRewardsRecordGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/history/rewardsRecord".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "positionId", positionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
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

    GenericType<SapiV1SimpleEarnLockedHistoryRewardsRecordGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnLockedHistoryRewardsRecordGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Locked Subscription Record (USER_DATA)
   * Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param purchaseId  (optional)
   * @param asset  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnLockedHistorySubscriptionRecordGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnLockedHistorySubscriptionRecordGet200Response sapiV1SimpleEarnLockedHistorySubscriptionRecordGet(Long timestamp, String signature, String purchaseId, String asset, Long startTime, Long endTime, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedHistorySubscriptionRecordGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedHistorySubscriptionRecordGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/history/subscriptionRecord".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "purchaseId", purchaseId));
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

    GenericType<SapiV1SimpleEarnLockedHistorySubscriptionRecordGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnLockedHistorySubscriptionRecordGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Simple Earn Locked Product List (USER_DATA)
   * Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnLockedListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnLockedListGet200Response sapiV1SimpleEarnLockedListGet(Long timestamp, String signature, String asset, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<SapiV1SimpleEarnLockedListGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnLockedListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Locked Personal Left Quota (USER_DATA)
   * Weight(IP): 150
   * @param projectId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexiblePersonalLeftQuotaGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexiblePersonalLeftQuotaGet200Response sapiV1SimpleEarnLockedPersonalLeftQuotaGet(String projectId, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling sapiV1SimpleEarnLockedPersonalLeftQuotaGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedPersonalLeftQuotaGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedPersonalLeftQuotaGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/personalLeftQuota".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
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

    GenericType<SapiV1SimpleEarnFlexiblePersonalLeftQuotaGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexiblePersonalLeftQuotaGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Locked Product Position (USER_DATA)
   * Weight(IP): 150
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param positionId  (optional)
   * @param projectId  (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnLockedPositionGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnLockedPositionGet200Response sapiV1SimpleEarnLockedPositionGet(Long timestamp, String signature, String asset, String positionId, String projectId, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedPositionGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedPositionGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/position".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "positionId", positionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
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

    GenericType<SapiV1SimpleEarnLockedPositionGet200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnLockedPositionGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Redeem Locked Product (TRADE)
   * Weight(IP): 1  Rate Limit: 1/3s per account
   * @param positionId 1234 (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnFlexibleRedeemPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnFlexibleRedeemPost200Response sapiV1SimpleEarnLockedRedeemPost(String positionId, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'positionId' is set
    if (positionId == null) {
      throw new ApiException(400, "Missing the required parameter 'positionId' when calling sapiV1SimpleEarnLockedRedeemPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedRedeemPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedRedeemPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/redeem".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "positionId", positionId));
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

    GenericType<SapiV1SimpleEarnFlexibleRedeemPost200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnFlexibleRedeemPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set Locked Auto Subscribe (USER_DATA)
   * Weight(IP): 150
   * @param positionId  (required)
   * @param autoSubscribe true or false (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginMaxLeveragePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginMaxLeveragePost200Response sapiV1SimpleEarnLockedSetAutoSubscribePost(String positionId, Boolean autoSubscribe, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'positionId' is set
    if (positionId == null) {
      throw new ApiException(400, "Missing the required parameter 'positionId' when calling sapiV1SimpleEarnLockedSetAutoSubscribePost");
    }
    
    // verify the required parameter 'autoSubscribe' is set
    if (autoSubscribe == null) {
      throw new ApiException(400, "Missing the required parameter 'autoSubscribe' when calling sapiV1SimpleEarnLockedSetAutoSubscribePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedSetAutoSubscribePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedSetAutoSubscribePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/setAutoSubscribe".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "positionId", positionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoSubscribe", autoSubscribe));
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

    GenericType<SapiV1MarginMaxLeveragePost200Response> localVarReturnType = new GenericType<SapiV1MarginMaxLeveragePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Set Locked Product Redeem Option(USER_DATA)
   * Set redeem option for Locked product  Weight(IP): 50
   * @param positionId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param redeemTo SPOT,FLEXIBLE, default FLEXIBLE (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginMaxLeveragePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginMaxLeveragePost200Response sapiV1SimpleEarnLockedSetRedeemOptionGet(String positionId, Long timestamp, String signature, String redeemTo, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'positionId' is set
    if (positionId == null) {
      throw new ApiException(400, "Missing the required parameter 'positionId' when calling sapiV1SimpleEarnLockedSetRedeemOptionGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedSetRedeemOptionGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedSetRedeemOptionGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/setRedeemOption".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "positionId", positionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redeemTo", redeemTo));
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

    GenericType<SapiV1MarginMaxLeveragePost200Response> localVarReturnType = new GenericType<SapiV1MarginMaxLeveragePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Subscribe Locked Product (TRADE)
   * Weight(IP): 1  Rate Limit: 1/3s per account
   * @param projectId  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param autoSubscribe true or false, default true. (optional)
   * @param sourceAccount SPOT,FUND,ALL, default SPOT (optional)
   * @param redeemTo SPOT,FLEXIBLE, default FLEXIBLE (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SimpleEarnLockedSubscribePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SimpleEarnLockedSubscribePost200Response sapiV1SimpleEarnLockedSubscribePost(String projectId, Double amount, Long timestamp, String signature, Boolean autoSubscribe, String sourceAccount, String redeemTo, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling sapiV1SimpleEarnLockedSubscribePost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SimpleEarnLockedSubscribePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedSubscribePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedSubscribePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/subscribe".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoSubscribe", autoSubscribe));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceAccount", sourceAccount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redeemTo", redeemTo));
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

    GenericType<SapiV1SimpleEarnLockedSubscribePost200Response> localVarReturnType = new GenericType<SapiV1SimpleEarnLockedSubscribePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Locked Subscription Preview (USER_DATA)
   * Weight(IP): 150
   * @param projectId  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param autoSubscribe true or false, default true. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1SimpleEarnLockedSubscriptionPreviewGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1SimpleEarnLockedSubscriptionPreviewGet200ResponseInner> sapiV1SimpleEarnLockedSubscriptionPreviewGet(String projectId, Double amount, Long timestamp, String signature, Boolean autoSubscribe, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'projectId' is set
    if (projectId == null) {
      throw new ApiException(400, "Missing the required parameter 'projectId' when calling sapiV1SimpleEarnLockedSubscriptionPreviewGet");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SimpleEarnLockedSubscriptionPreviewGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SimpleEarnLockedSubscriptionPreviewGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SimpleEarnLockedSubscriptionPreviewGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/simple-earn/locked/subscriptionPreview".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "projectId", projectId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoSubscribe", autoSubscribe));
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

    GenericType<List<SapiV1SimpleEarnLockedSubscriptionPreviewGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1SimpleEarnLockedSubscriptionPreviewGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
