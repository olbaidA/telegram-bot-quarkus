package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1MiningHashTransferConfigCancelPost200Response;
import com.olbaid.binance.service.model.SapiV1MiningHashTransferConfigDetailsListGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningHashTransferConfigPost200Response;
import com.olbaid.binance.service.model.SapiV1MiningHashTransferProfitDetailsGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningPaymentListGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningPaymentOtherGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningPaymentUidGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningPubAlgoListGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningPubCoinListGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningStatisticsUserListGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningStatisticsUserStatusGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningWorkerDetailGet200Response;
import com.olbaid.binance.service.model.SapiV1MiningWorkerListGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiningApi {
  private ApiClient apiClient;

  public MiningApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MiningApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Cancel Hashrate Resale configuration (USER_DATA)
   * Weight(IP): 5
   * @param configId Mining ID (required)
   * @param userName Mining Account (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningHashTransferConfigCancelPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningHashTransferConfigCancelPost200Response sapiV1MiningHashTransferConfigCancelPost(String configId, String userName, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configId' is set
    if (configId == null) {
      throw new ApiException(400, "Missing the required parameter 'configId' when calling sapiV1MiningHashTransferConfigCancelPost");
    }
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling sapiV1MiningHashTransferConfigCancelPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningHashTransferConfigCancelPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningHashTransferConfigCancelPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/hash-transfer/config/cancel".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "configId", configId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
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

    GenericType<SapiV1MiningHashTransferConfigCancelPost200Response> localVarReturnType = new GenericType<SapiV1MiningHashTransferConfigCancelPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Hashrate Resale List (USER_DATA)
   * Weight(IP): 5
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param pageIndex Page number, default is first page, start form 1 (optional)
   * @param pageSize Number of pages, minimum 10, maximum 200 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningHashTransferConfigDetailsListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningHashTransferConfigDetailsListGet200Response sapiV1MiningHashTransferConfigDetailsListGet(Long timestamp, String signature, Integer pageIndex, String pageSize, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningHashTransferConfigDetailsListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningHashTransferConfigDetailsListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/hash-transfer/config/details/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
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

    GenericType<SapiV1MiningHashTransferConfigDetailsListGet200Response> localVarReturnType = new GenericType<SapiV1MiningHashTransferConfigDetailsListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Hashrate Resale Request (USER_DATA)
   * Weight(IP): 5
   * @param userName Mining Account (required)
   * @param algo Algorithm(sha256) (required)
   * @param toPoolUser Mining Account (required)
   * @param hashRate Resale hashrate h/s must be transferred (BTC is greater than 500000000000 ETH is greater than 500000) (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startDate Search date, millisecond timestamp, while empty query all (optional)
   * @param endDate Search date, millisecond timestamp, while empty query all (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningHashTransferConfigPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningHashTransferConfigPost200Response sapiV1MiningHashTransferConfigPost(String userName, String algo, String toPoolUser, String hashRate, Long timestamp, String signature, String startDate, String endDate, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling sapiV1MiningHashTransferConfigPost");
    }
    
    // verify the required parameter 'algo' is set
    if (algo == null) {
      throw new ApiException(400, "Missing the required parameter 'algo' when calling sapiV1MiningHashTransferConfigPost");
    }
    
    // verify the required parameter 'toPoolUser' is set
    if (toPoolUser == null) {
      throw new ApiException(400, "Missing the required parameter 'toPoolUser' when calling sapiV1MiningHashTransferConfigPost");
    }
    
    // verify the required parameter 'hashRate' is set
    if (hashRate == null) {
      throw new ApiException(400, "Missing the required parameter 'hashRate' when calling sapiV1MiningHashTransferConfigPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningHashTransferConfigPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningHashTransferConfigPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/hash-transfer/config".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algo", algo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toPoolUser", toPoolUser));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "hashRate", hashRate));
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

    GenericType<SapiV1MiningHashTransferConfigPost200Response> localVarReturnType = new GenericType<SapiV1MiningHashTransferConfigPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Hashrate Resale Details (USER_DATA)
   * Weight(IP): 5
   * @param configId Mining ID (required)
   * @param userName Mining Account (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param pageIndex Page number, default is first page, start form 1 (optional)
   * @param pageSize Number of pages, minimum 10, maximum 200 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningHashTransferProfitDetailsGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningHashTransferProfitDetailsGet200Response sapiV1MiningHashTransferProfitDetailsGet(String configId, String userName, Long timestamp, String signature, Integer pageIndex, String pageSize, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'configId' is set
    if (configId == null) {
      throw new ApiException(400, "Missing the required parameter 'configId' when calling sapiV1MiningHashTransferProfitDetailsGet");
    }
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling sapiV1MiningHashTransferProfitDetailsGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningHashTransferProfitDetailsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningHashTransferProfitDetailsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/hash-transfer/profit/details".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "configId", configId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
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

    GenericType<SapiV1MiningHashTransferProfitDetailsGet200Response> localVarReturnType = new GenericType<SapiV1MiningHashTransferProfitDetailsGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Earnings List (USER_DATA)
   * Weight(IP): 5
   * @param algo Algorithm(sha256) (required)
   * @param userName Mining Account (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param coin Coin name (optional)
   * @param startDate Search date, millisecond timestamp, while empty query all (optional)
   * @param endDate Search date, millisecond timestamp, while empty query all (optional)
   * @param pageIndex Page number, default is first page, start form 1 (optional)
   * @param pageSize Number of pages, minimum 10, maximum 200 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningPaymentListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningPaymentListGet200Response sapiV1MiningPaymentListGet(String algo, String userName, Long timestamp, String signature, String coin, String startDate, String endDate, Integer pageIndex, String pageSize, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algo' is set
    if (algo == null) {
      throw new ApiException(400, "Missing the required parameter 'algo' when calling sapiV1MiningPaymentListGet");
    }
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling sapiV1MiningPaymentListGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningPaymentListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningPaymentListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/payment/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algo", algo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
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

    GenericType<SapiV1MiningPaymentListGet200Response> localVarReturnType = new GenericType<SapiV1MiningPaymentListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Extra Bonus List (USER_DATA)
   * Weight(IP): 5
   * @param algo Algorithm(sha256) (required)
   * @param userName Mining Account (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param coin Coin name (optional)
   * @param startDate Search date, millisecond timestamp, while empty query all (optional)
   * @param endDate Search date, millisecond timestamp, while empty query all (optional)
   * @param pageIndex Page number, default is first page, start form 1 (optional)
   * @param pageSize Number of pages, minimum 10, maximum 200 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningPaymentOtherGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningPaymentOtherGet200Response sapiV1MiningPaymentOtherGet(String algo, String userName, Long timestamp, String signature, String coin, String startDate, String endDate, Integer pageIndex, String pageSize, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algo' is set
    if (algo == null) {
      throw new ApiException(400, "Missing the required parameter 'algo' when calling sapiV1MiningPaymentOtherGet");
    }
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling sapiV1MiningPaymentOtherGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningPaymentOtherGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningPaymentOtherGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/payment/other".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algo", algo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
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

    GenericType<SapiV1MiningPaymentOtherGet200Response> localVarReturnType = new GenericType<SapiV1MiningPaymentOtherGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Mining Account Earning (USER_DATA)
   * Weight(IP): 5
   * @param algo Algorithm(sha256) (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startDate Search date, millisecond timestamp, while empty query all (optional)
   * @param endDate Search date, millisecond timestamp, while empty query all (optional)
   * @param pageIndex Page number, default is first page, start form 1 (optional)
   * @param pageSize Number of pages, minimum 10, maximum 200 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningPaymentUidGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningPaymentUidGet200Response sapiV1MiningPaymentUidGet(String algo, Long timestamp, String signature, String startDate, String endDate, Integer pageIndex, String pageSize, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algo' is set
    if (algo == null) {
      throw new ApiException(400, "Missing the required parameter 'algo' when calling sapiV1MiningPaymentUidGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningPaymentUidGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningPaymentUidGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/payment/uid".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algo", algo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
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

    GenericType<SapiV1MiningPaymentUidGet200Response> localVarReturnType = new GenericType<SapiV1MiningPaymentUidGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Acquiring Algorithm (MARKET_DATA)
   * Weight(IP): 1
   * @return a {@code SapiV1MiningPubAlgoListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningPubAlgoListGet200Response sapiV1MiningPubAlgoListGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/pub/algoList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<SapiV1MiningPubAlgoListGet200Response> localVarReturnType = new GenericType<SapiV1MiningPubAlgoListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Acquiring CoinName (MARKET_DATA)
   * Weight(IP): 1
   * @return a {@code SapiV1MiningPubCoinListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningPubCoinListGet200Response sapiV1MiningPubCoinListGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/pub/coinList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<SapiV1MiningPubCoinListGet200Response> localVarReturnType = new GenericType<SapiV1MiningPubCoinListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Account List (USER_DATA)
   * Weight(IP): 5
   * @param algo Algorithm(sha256) (required)
   * @param userName Mining Account (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningStatisticsUserListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningStatisticsUserListGet200Response sapiV1MiningStatisticsUserListGet(String algo, String userName, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algo' is set
    if (algo == null) {
      throw new ApiException(400, "Missing the required parameter 'algo' when calling sapiV1MiningStatisticsUserListGet");
    }
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling sapiV1MiningStatisticsUserListGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningStatisticsUserListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningStatisticsUserListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/statistics/user/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algo", algo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
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

    GenericType<SapiV1MiningStatisticsUserListGet200Response> localVarReturnType = new GenericType<SapiV1MiningStatisticsUserListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Statistic List (USER_DATA)
   * Weight(IP): 5
   * @param algo Algorithm(sha256) (required)
   * @param userName Mining Account (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningStatisticsUserStatusGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningStatisticsUserStatusGet200Response sapiV1MiningStatisticsUserStatusGet(String algo, String userName, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algo' is set
    if (algo == null) {
      throw new ApiException(400, "Missing the required parameter 'algo' when calling sapiV1MiningStatisticsUserStatusGet");
    }
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling sapiV1MiningStatisticsUserStatusGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningStatisticsUserStatusGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningStatisticsUserStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/statistics/user/status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algo", algo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
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

    GenericType<SapiV1MiningStatisticsUserStatusGet200Response> localVarReturnType = new GenericType<SapiV1MiningStatisticsUserStatusGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Request for Detail Miner List (USER_DATA)
   * Weight(IP): 5
   * @param algo Algorithm(sha256) (required)
   * @param userName Mining Account (required)
   * @param workerName Minerâ€™s name (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningWorkerDetailGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningWorkerDetailGet200Response sapiV1MiningWorkerDetailGet(String algo, String userName, String workerName, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algo' is set
    if (algo == null) {
      throw new ApiException(400, "Missing the required parameter 'algo' when calling sapiV1MiningWorkerDetailGet");
    }
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling sapiV1MiningWorkerDetailGet");
    }
    
    // verify the required parameter 'workerName' is set
    if (workerName == null) {
      throw new ApiException(400, "Missing the required parameter 'workerName' when calling sapiV1MiningWorkerDetailGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningWorkerDetailGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningWorkerDetailGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/worker/detail".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algo", algo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workerName", workerName));
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

    GenericType<SapiV1MiningWorkerDetailGet200Response> localVarReturnType = new GenericType<SapiV1MiningWorkerDetailGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Request for Miner List (USER_DATA)
   * Weight(IP): 5
   * @param algo Algorithm(sha256) (required)
   * @param userName Mining Account (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param pageIndex Page number, default is first page, start form 1 (optional)
   * @param sort sort sequence(default&#x3D;0)0 positive sequence, 1 negative sequence (optional)
   * @param sortColumn Sort by( default 1): 1: miner name, 2: real-time computing power, 3: daily average computing power, 4: real-time rejection rate, 5: last submission time (optional)
   * @param workerStatus miners status(default&#x3D;0)0 all, 1 valid, 2 invalid, 3 failure (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MiningWorkerListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MiningWorkerListGet200Response sapiV1MiningWorkerListGet(String algo, String userName, Long timestamp, String signature, Integer pageIndex, Integer sort, Integer sortColumn, Integer workerStatus, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algo' is set
    if (algo == null) {
      throw new ApiException(400, "Missing the required parameter 'algo' when calling sapiV1MiningWorkerListGet");
    }
    
    // verify the required parameter 'userName' is set
    if (userName == null) {
      throw new ApiException(400, "Missing the required parameter 'userName' when calling sapiV1MiningWorkerListGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MiningWorkerListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MiningWorkerListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/mining/worker/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algo", algo));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "userName", userName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sortColumn", sortColumn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workerStatus", workerStatus));
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

    GenericType<SapiV1MiningWorkerListGet200Response> localVarReturnType = new GenericType<SapiV1MiningWorkerListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
