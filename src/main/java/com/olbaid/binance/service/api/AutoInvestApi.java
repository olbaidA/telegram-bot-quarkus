package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestAllAssetGet200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestHistoryListGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestIndexInfoGet200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestIndexUserSummaryGet200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestOneOffPost200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestOneOffPostDetailsParameterInner;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestOneOffStatusGet200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestPlanAddPost200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestPlanAddPostDetailsParameterInner;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestPlanEditStatusPost200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestPlanIdGet200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestPlanListGet200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestRedeemPost200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestSourceAssetListGet200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestTargetAssetListGet200Response;
import com.olbaid.binance.service.model.SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AutoInvestApi {
  private ApiClient apiClient;

  public AutoInvestApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AutoInvestApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Query all source asset and target asset (USER_DATA)
   * Query all source assets and target assets  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestAllAssetGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestAllAssetGet200Response sapiV1LendingAutoInvestAllAssetGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestAllAssetGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestAllAssetGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/all/asset".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1LendingAutoInvestAllAssetGet200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestAllAssetGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query subscription transaction history
   * Query subscription transaction history of a plan  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param planId  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param targetAsset  (optional)
   * @param planType  (optional)
   * @param size Default:10 Max:100 (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1LendingAutoInvestHistoryListGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1LendingAutoInvestHistoryListGet200ResponseInner> sapiV1LendingAutoInvestHistoryListGet(Long timestamp, String signature, Long planId, Long startTime, Long endTime, BigDecimal targetAsset, String planType, Integer size, Integer current, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestHistoryListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestHistoryListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/history/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planId", planId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetAsset", targetAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planType", planType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<List<SapiV1LendingAutoInvestHistoryListGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1LendingAutoInvestHistoryListGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Index Details(USER_DATA)
   * Query index details  Weight(IP): 1
   * @param indexId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestIndexInfoGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestIndexInfoGet200Response sapiV1LendingAutoInvestIndexInfoGet(Long indexId, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'indexId' is set
    if (indexId == null) {
      throw new ApiException(400, "Missing the required parameter 'indexId' when calling sapiV1LendingAutoInvestIndexInfoGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestIndexInfoGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestIndexInfoGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/index/info".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "indexId", indexId));
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

    GenericType<SapiV1LendingAutoInvestIndexInfoGet200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestIndexInfoGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Index Linked Plan Position Details(USER_DATA)
   * Details on users Index-Linked plan position details  Weight(IP): 1
   * @param indexId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestIndexUserSummaryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestIndexUserSummaryGet200Response sapiV1LendingAutoInvestIndexUserSummaryGet(Long indexId, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'indexId' is set
    if (indexId == null) {
      throw new ApiException(400, "Missing the required parameter 'indexId' when calling sapiV1LendingAutoInvestIndexUserSummaryGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestIndexUserSummaryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestIndexUserSummaryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/index/user-summary".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "indexId", indexId));
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

    GenericType<SapiV1LendingAutoInvestIndexUserSummaryGet200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestIndexUserSummaryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * One Time Transaction(TRADE)
   * One time transaction  Weight(IP): 1
   * @param sourceType  (required)
   * @param subscriptionAmount  (required)
   * @param sourceAsset  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param requestId  (optional)
   * @param flexibleAllowedToUse  (optional)
   * @param planId  (optional)
   * @param indexId  (optional)
   * @param details  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestOneOffPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestOneOffPost200Response sapiV1LendingAutoInvestOneOffPost(String sourceType, Float subscriptionAmount, String sourceAsset, Long timestamp, String signature, String requestId, Boolean flexibleAllowedToUse, Long planId, Long indexId, List<SapiV1LendingAutoInvestOneOffPostDetailsParameterInner> details, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceType' is set
    if (sourceType == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceType' when calling sapiV1LendingAutoInvestOneOffPost");
    }
    
    // verify the required parameter 'subscriptionAmount' is set
    if (subscriptionAmount == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionAmount' when calling sapiV1LendingAutoInvestOneOffPost");
    }
    
    // verify the required parameter 'sourceAsset' is set
    if (sourceAsset == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceAsset' when calling sapiV1LendingAutoInvestOneOffPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestOneOffPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestOneOffPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/one-off".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceType", sourceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestId", requestId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionAmount", subscriptionAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceAsset", sourceAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flexibleAllowedToUse", flexibleAllowedToUse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planId", planId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "indexId", indexId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "details", details));
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

    GenericType<SapiV1LendingAutoInvestOneOffPost200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestOneOffPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query One-Time Transaction Status (USER_DATA)
   * Transaction status for one-time transaction  Weight(IP): 1
   * @param transactionId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param requestId  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestOneOffStatusGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestOneOffStatusGet200Response sapiV1LendingAutoInvestOneOffStatusGet(Long transactionId, Long timestamp, String signature, String requestId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transactionId' is set
    if (transactionId == null) {
      throw new ApiException(400, "Missing the required parameter 'transactionId' when calling sapiV1LendingAutoInvestOneOffStatusGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestOneOffStatusGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestOneOffStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/one-off/status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionId", transactionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestId", requestId));
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

    GenericType<SapiV1LendingAutoInvestOneOffStatusGet200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestOneOffStatusGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Investment plan creation (USER_DATA)
   * Post an investment plan creation  Weight(IP): 1
   * @param sourceType  (required)
   * @param planType  (required)
   * @param subscriptionAmount  (required)
   * @param subscriptionCycle  (required)
   * @param subscriptionStartTime  (required)
   * @param sourceAsset  (required)
   * @param details  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param requestId  (optional)
   * @param indexId  (optional)
   * @param subscriptionStartDay  (optional)
   * @param subscriptionStartWeekday  (optional)
   * @param flexibleAllowedToUse  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestPlanAddPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestPlanAddPost200Response sapiV1LendingAutoInvestPlanAddPost(String sourceType, String planType, Float subscriptionAmount, String subscriptionCycle, Integer subscriptionStartTime, String sourceAsset, List<SapiV1LendingAutoInvestPlanAddPostDetailsParameterInner> details, Long timestamp, String signature, String requestId, Long indexId, Integer subscriptionStartDay, String subscriptionStartWeekday, Boolean flexibleAllowedToUse, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sourceType' is set
    if (sourceType == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceType' when calling sapiV1LendingAutoInvestPlanAddPost");
    }
    
    // verify the required parameter 'planType' is set
    if (planType == null) {
      throw new ApiException(400, "Missing the required parameter 'planType' when calling sapiV1LendingAutoInvestPlanAddPost");
    }
    
    // verify the required parameter 'subscriptionAmount' is set
    if (subscriptionAmount == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionAmount' when calling sapiV1LendingAutoInvestPlanAddPost");
    }
    
    // verify the required parameter 'subscriptionCycle' is set
    if (subscriptionCycle == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionCycle' when calling sapiV1LendingAutoInvestPlanAddPost");
    }
    
    // verify the required parameter 'subscriptionStartTime' is set
    if (subscriptionStartTime == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionStartTime' when calling sapiV1LendingAutoInvestPlanAddPost");
    }
    
    // verify the required parameter 'sourceAsset' is set
    if (sourceAsset == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceAsset' when calling sapiV1LendingAutoInvestPlanAddPost");
    }
    
    // verify the required parameter 'details' is set
    if (details == null) {
      throw new ApiException(400, "Missing the required parameter 'details' when calling sapiV1LendingAutoInvestPlanAddPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestPlanAddPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestPlanAddPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/plan/add".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceType", sourceType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestId", requestId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planType", planType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "IndexId", indexId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionAmount", subscriptionAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionCycle", subscriptionCycle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionStartDay", subscriptionStartDay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionStartWeekday", subscriptionStartWeekday));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionStartTime", subscriptionStartTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceAsset", sourceAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flexibleAllowedToUse", flexibleAllowedToUse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "details", details));
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

    GenericType<SapiV1LendingAutoInvestPlanAddPost200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestPlanAddPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Investment plan adjustment
   * Query Source Asset to be used for investment  Weight(IP): 1
   * @param planId  (required)
   * @param subscriptionAmount  (required)
   * @param subscriptionCycle  (required)
   * @param subscriptionStartTime  (required)
   * @param sourceAsset  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param subscriptionStartDay  (optional)
   * @param subscriptionStartWeekday  (optional)
   * @param flexibleAllowedToUse  (optional)
   * @param details  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestPlanAddPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestPlanAddPost200Response sapiV1LendingAutoInvestPlanEditPost(Integer planId, Float subscriptionAmount, String subscriptionCycle, Integer subscriptionStartTime, String sourceAsset, Long timestamp, String signature, Integer subscriptionStartDay, String subscriptionStartWeekday, Boolean flexibleAllowedToUse, List<SapiV1LendingAutoInvestPlanAddPostDetailsParameterInner> details, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'planId' is set
    if (planId == null) {
      throw new ApiException(400, "Missing the required parameter 'planId' when calling sapiV1LendingAutoInvestPlanEditPost");
    }
    
    // verify the required parameter 'subscriptionAmount' is set
    if (subscriptionAmount == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionAmount' when calling sapiV1LendingAutoInvestPlanEditPost");
    }
    
    // verify the required parameter 'subscriptionCycle' is set
    if (subscriptionCycle == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionCycle' when calling sapiV1LendingAutoInvestPlanEditPost");
    }
    
    // verify the required parameter 'subscriptionStartTime' is set
    if (subscriptionStartTime == null) {
      throw new ApiException(400, "Missing the required parameter 'subscriptionStartTime' when calling sapiV1LendingAutoInvestPlanEditPost");
    }
    
    // verify the required parameter 'sourceAsset' is set
    if (sourceAsset == null) {
      throw new ApiException(400, "Missing the required parameter 'sourceAsset' when calling sapiV1LendingAutoInvestPlanEditPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestPlanEditPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestPlanEditPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/plan/edit".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planId", planId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionAmount", subscriptionAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionCycle", subscriptionCycle));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionStartDay", subscriptionStartDay));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionStartWeekday", subscriptionStartWeekday));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subscriptionStartTime", subscriptionStartTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sourceAsset", sourceAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flexibleAllowedToUse", flexibleAllowedToUse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "details", details));
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

    GenericType<SapiV1LendingAutoInvestPlanAddPost200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestPlanAddPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Change Plan Status
   * Change Plan Status  Weight(IP): 1
   * @param planId  (required)
   * @param status  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestPlanEditStatusPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestPlanEditStatusPost200Response sapiV1LendingAutoInvestPlanEditStatusPost(Integer planId, String status, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'planId' is set
    if (planId == null) {
      throw new ApiException(400, "Missing the required parameter 'planId' when calling sapiV1LendingAutoInvestPlanEditStatusPost");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling sapiV1LendingAutoInvestPlanEditStatusPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestPlanEditStatusPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestPlanEditStatusPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/plan/edit-status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planId", planId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
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

    GenericType<SapiV1LendingAutoInvestPlanEditStatusPost200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestPlanEditStatusPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query holding details of the plan
   * Query holding details of the plan  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param planId  (optional)
   * @param requestId  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestPlanIdGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestPlanIdGet200Response sapiV1LendingAutoInvestPlanIdGet(Long timestamp, String signature, Long planId, String requestId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestPlanIdGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestPlanIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/plan/id".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planId", planId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestId", requestId));
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

    GenericType<SapiV1LendingAutoInvestPlanIdGet200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestPlanIdGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get list of plans
   * Query plan lists  Weight(IP): 1
   * @param planType  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestPlanListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestPlanListGet200Response sapiV1LendingAutoInvestPlanListGet(String planType, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'planType' is set
    if (planType == null) {
      throw new ApiException(400, "Missing the required parameter 'planType' when calling sapiV1LendingAutoInvestPlanListGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestPlanListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestPlanListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/plan/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "planType", planType));
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

    GenericType<SapiV1LendingAutoInvestPlanListGet200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestPlanListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Index Linked Plan Rebalance Details (USER_DATA)
   * Get the history of Index Linked Plan Redemption transactions  Max 30 day difference between startTime and endTime If no startTime and endTime, default to show past 30 day records  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner> sapiV1LendingAutoInvestRebalanceHistoryGet(Long timestamp, String signature, Long startTime, Long endTime, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestRebalanceHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestRebalanceHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/rebalance/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<List<SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1LendingAutoInvestRebalanceHistoryGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Index Linked Plan Redemption History (USER_DATA)
   * Get the history of Index Linked Plan Redemption transactions  Max 30 day difference between startTime and endTime If no startTime and endTime, default to show past 30 day records  Weight(IP): 1
   * @param requestId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param asset  (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner> sapiV1LendingAutoInvestRedeemHistoryGet(Long requestId, Long timestamp, String signature, Long startTime, Long endTime, Integer current, String asset, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'requestId' is set
    if (requestId == null) {
      throw new ApiException(400, "Missing the required parameter 'requestId' when calling sapiV1LendingAutoInvestRedeemHistoryGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestRedeemHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestRedeemHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/redeem/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestId", requestId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<List<SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1LendingAutoInvestRedeemHistoryGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Index Linked Plan Redemption (TRADE)
   * To redeem index-Linked plan holdings  Weight(IP): 1
   * @param indexId PORTFOLIO plan&#39;s Id (required)
   * @param redemptionPercentage user redeem percentage,10/20/100. (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param requestId sourceType + unique, transactionId and requestId cannot be empty at the same time (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestRedeemPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestRedeemPost200Response sapiV1LendingAutoInvestRedeemPost(Long indexId, Integer redemptionPercentage, Long timestamp, String signature, String requestId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'indexId' is set
    if (indexId == null) {
      throw new ApiException(400, "Missing the required parameter 'indexId' when calling sapiV1LendingAutoInvestRedeemPost");
    }
    
    // verify the required parameter 'redemptionPercentage' is set
    if (redemptionPercentage == null) {
      throw new ApiException(400, "Missing the required parameter 'redemptionPercentage' when calling sapiV1LendingAutoInvestRedeemPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestRedeemPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestRedeemPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/redeem".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "indexId", indexId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "requestId", requestId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "redemptionPercentage", redemptionPercentage));
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

    GenericType<SapiV1LendingAutoInvestRedeemPost200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestRedeemPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query source asset list (USER_DATA)
   * Query Source Asset to be used for investment  Weight(IP): 1
   * @param usageType  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param targetAsset  (optional)
   * @param indexId  (optional)
   * @param flexibleAllowedToUse  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestSourceAssetListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestSourceAssetListGet200Response sapiV1LendingAutoInvestSourceAssetListGet(String usageType, Long timestamp, String signature, String targetAsset, Long indexId, Boolean flexibleAllowedToUse, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'usageType' is set
    if (usageType == null) {
      throw new ApiException(400, "Missing the required parameter 'usageType' when calling sapiV1LendingAutoInvestSourceAssetListGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestSourceAssetListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestSourceAssetListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/source-asset/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetAsset", targetAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "indexId", indexId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "usageType", usageType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "flexibleAllowedToUse", flexibleAllowedToUse));
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

    GenericType<SapiV1LendingAutoInvestSourceAssetListGet200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestSourceAssetListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get target asset list (USER_DATA)
   * Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param targetAsset  (optional)
   * @param size Default:10 Max:100 (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LendingAutoInvestTargetAssetListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LendingAutoInvestTargetAssetListGet200Response sapiV1LendingAutoInvestTargetAssetListGet(Long timestamp, String signature, String targetAsset, Integer size, Integer current, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestTargetAssetListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestTargetAssetListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/target-asset/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetAsset", targetAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<SapiV1LendingAutoInvestTargetAssetListGet200Response> localVarReturnType = new GenericType<SapiV1LendingAutoInvestTargetAssetListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get target asset ROI data (USER_DATA)
   * ROI return list for target asset  Weight(IP): 1
   * @param targetAsset  (required)
   * @param hisRoiType  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner> sapiV1LendingAutoInvestTargetAssetRoiListGet(String targetAsset, String hisRoiType, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'targetAsset' is set
    if (targetAsset == null) {
      throw new ApiException(400, "Missing the required parameter 'targetAsset' when calling sapiV1LendingAutoInvestTargetAssetRoiListGet");
    }
    
    // verify the required parameter 'hisRoiType' is set
    if (hisRoiType == null) {
      throw new ApiException(400, "Missing the required parameter 'hisRoiType' when calling sapiV1LendingAutoInvestTargetAssetRoiListGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LendingAutoInvestTargetAssetRoiListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LendingAutoInvestTargetAssetRoiListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/lending/auto-invest/target-asset/roi/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetAsset", targetAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hisRoiType", hisRoiType));
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

    GenericType<List<SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1LendingAutoInvestTargetAssetRoiListGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
