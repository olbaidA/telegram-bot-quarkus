package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1CapitalDepositSubAddressGet200Response;
import com.olbaid.binance.service.model.SapiV1CapitalDepositSubHisrecGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountAccountSnapshotGet200Response;
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountAssetGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountDepositAddressGet200Response;
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountDepositPost200Response;
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountFetchFutureAssetGet200Response;
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountInfoGet200Response;
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountMarginAssetGet200Response;
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response;
import com.olbaid.binance.service.model.SapiV1ManagedSubaccountQueryTransLogGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountBlvtEnablePost200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountEoptionsEnablePost200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountFuturesAccountGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountFuturesAccountSummaryGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountFuturesEnablePost200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountFuturesInternalTransferGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountFuturesInternalTransferGet200Response1;
import com.olbaid.binance.service.model.SapiV1SubAccountFuturesPositionRiskGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1SubAccountFuturesTransferPost200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountListGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountMarginAccountGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountMarginAccountSummaryGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountMarginEnablePost200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountSpotSummaryGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountStatusGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1SubAccountSubAccountApiIpRestrictionGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountSubAccountApiIpRestrictionIpListDelete200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountSubTransferHistoryGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1SubAccountTransactionStatisticsGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1SubAccountUniversalTransferGet200Response;
import com.olbaid.binance.service.model.SapiV1SubAccountUniversalTransferGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1SubAccountVirtualSubAccountPost200Response;
import com.olbaid.binance.service.model.SapiV2SubAccountFuturesAccountGet200Response;
import com.olbaid.binance.service.model.SapiV2SubAccountFuturesAccountSummaryGet200Response;
import com.olbaid.binance.service.model.SapiV2SubAccountFuturesPositionRiskGet200Response;
import com.olbaid.binance.service.model.SapiV2SubAccountSubAccountApiIpRestrictionPost200Response;
import com.olbaid.binance.service.model.SapiV3SubAccountAssetsGet200Response;
import com.olbaid.binance.service.model.SapiV4SubAccountAssetsGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubAccountApi {
  private ApiClient apiClient;

  public SubAccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SubAccountApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Sub-account Spot Assets Summary (For Master Account)
   * Fetch sub-account deposit address  Weight(IP): 1
   * @param email Sub-account email (required)
   * @param coin Coin name (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param network  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1CapitalDepositSubAddressGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1CapitalDepositSubAddressGet200Response sapiV1CapitalDepositSubAddressGet(String email, String coin, Long timestamp, String signature, String network, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1CapitalDepositSubAddressGet");
    }
    
    // verify the required parameter 'coin' is set
    if (coin == null) {
      throw new ApiException(400, "Missing the required parameter 'coin' when calling sapiV1CapitalDepositSubAddressGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1CapitalDepositSubAddressGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1CapitalDepositSubAddressGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/deposit/subAddress".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "network", network));
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

    GenericType<SapiV1CapitalDepositSubAddressGet200Response> localVarReturnType = new GenericType<SapiV1CapitalDepositSubAddressGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sub-account Deposit History (For Master Account)
   * Fetch sub-account deposit history  Weight(IP): 1
   * @param email Sub-account email (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param coin Coin name (optional)
   * @param status 0(0:pending,6: credited but cannot withdraw, 1:success) (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit  (optional)
   * @param offset  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1CapitalDepositSubHisrecGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1CapitalDepositSubHisrecGet200ResponseInner> sapiV1CapitalDepositSubHisrecGet(String email, Long timestamp, String signature, String coin, Integer status, Long startTime, Long endTime, Long limit, Integer offset, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1CapitalDepositSubHisrecGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1CapitalDepositSubHisrecGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1CapitalDepositSubHisrecGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/deposit/subHisrec".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
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

    GenericType<List<SapiV1CapitalDepositSubHisrecGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1CapitalDepositSubHisrecGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Managed sub-account snapshot (For Investor Master Account)
   * - The query time period must be less then 30 days - Support query within the last one month only - If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 7 days by default  Weight(IP): 2400
   * @param email Sub-account email (required)
   * @param type \&quot;SPOT\&quot;, \&quot;MARGIN\&quot;(cross), \&quot;FUTURES\&quot;(UM) (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit min 7, max 30, default 7 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountAccountSnapshotGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountAccountSnapshotGet200Response sapiV1ManagedSubaccountAccountSnapshotGet(String email, String type, Long timestamp, String signature, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1ManagedSubaccountAccountSnapshotGet");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1ManagedSubaccountAccountSnapshotGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountAccountSnapshotGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountAccountSnapshotGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/accountSnapshot".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
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

    String[] localVarAuthNames = new String[] {  };

    GenericType<SapiV1ManagedSubaccountAccountSnapshotGet200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountAccountSnapshotGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Managed sub-account asset details(For Investor Master Account)
   * Weight(IP): 1
   * @param email Sub-account email (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1ManagedSubaccountAssetGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1ManagedSubaccountAssetGet200ResponseInner> sapiV1ManagedSubaccountAssetGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1ManagedSubaccountAssetGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountAssetGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountAssetGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/asset".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<List<SapiV1ManagedSubaccountAssetGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1ManagedSubaccountAssetGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Managed Sub-account Deposit Address (For Investor Master Account)
   * Get investor&#39;s managed sub-account deposit address  Weight(UID): 1
   * @param email  (required)
   * @param coin Coin name (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param network  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountDepositAddressGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountDepositAddressGet200Response sapiV1ManagedSubaccountDepositAddressGet(String email, String coin, Long timestamp, String signature, String network, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1ManagedSubaccountDepositAddressGet");
    }
    
    // verify the required parameter 'coin' is set
    if (coin == null) {
      throw new ApiException(400, "Missing the required parameter 'coin' when calling sapiV1ManagedSubaccountDepositAddressGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountDepositAddressGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountDepositAddressGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/deposit/address".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "network", network));
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

    GenericType<SapiV1ManagedSubaccountDepositAddressGet200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountDepositAddressGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deposit assets into the managed sub-account(For Investor Master Account)
   * Weight(IP): 1
   * @param toEmail Recipient email (required)
   * @param asset  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountDepositPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountDepositPost200Response sapiV1ManagedSubaccountDepositPost(String toEmail, String asset, Double amount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'toEmail' is set
    if (toEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'toEmail' when calling sapiV1ManagedSubaccountDepositPost");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1ManagedSubaccountDepositPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1ManagedSubaccountDepositPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountDepositPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountDepositPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/deposit".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toEmail", toEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<SapiV1ManagedSubaccountDepositPost200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountDepositPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Managed Sub-account Futures Asset Details (For Investor Master Account)
   * Investor can use this api to query managed sub account futures asset details
   * @param email  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountFetchFutureAssetGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountFetchFutureAssetGet200Response sapiV1ManagedSubaccountFetchFutureAssetGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1ManagedSubaccountFetchFutureAssetGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountFetchFutureAssetGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountFetchFutureAssetGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/fetch-future-asset".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1ManagedSubaccountFetchFutureAssetGet200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountFetchFutureAssetGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Managed Sub-account List (For Investor)
   * Get investor&#39;s managed sub-account list.  Weight(UID): 60
   * @param email  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param page Default 1 (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountInfoGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountInfoGet200Response sapiV1ManagedSubaccountInfoGet(String email, Long timestamp, String signature, Integer page, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1ManagedSubaccountInfoGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountInfoGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountInfoGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/info".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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

    GenericType<SapiV1ManagedSubaccountInfoGet200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountInfoGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Managed Sub-account Margin Asset Details (For Investor Master Account)
   * Investor can use this api to query managed sub account margin asset details
   * @param email  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountMarginAssetGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountMarginAssetGet200Response sapiV1ManagedSubaccountMarginAssetGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1ManagedSubaccountMarginAssetGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountMarginAssetGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountMarginAssetGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/marginAsset".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1ManagedSubaccountMarginAssetGet200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountMarginAssetGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Managed Sub Account Transfer Log (For Investor Master Account)
   * Investor can use this api to query managed sub account transfer log. This endpoint is available for investor of Managed Sub-Account. A Managed Sub-Account is an account type for investors who value flexibility in asset allocation and account application, while delegating trades to a professional trading team.  Weight(IP): 1
   * @param email  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param transfers Transfer Direction (FROM/TO) (optional)
   * @param transferFunctionAccountType Transfer function account type (SPOT/MARGIN/ISOLATED_MARGIN/USDT_FUTURE/COIN_FUTURE) (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response sapiV1ManagedSubaccountQueryTransLogForInvestorGet(String email, Long timestamp, String signature, Long startTime, Long endTime, Integer page, Integer limit, String transfers, String transferFunctionAccountType, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1ManagedSubaccountQueryTransLogForInvestorGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountQueryTransLogForInvestorGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountQueryTransLogForInvestorGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/queryTransLogForInvestor".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transfers", transfers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferFunctionAccountType", transferFunctionAccountType));
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

    GenericType<SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Managed Sub Account Transfer Log (For Trading Team Master Account)
   * Trading team can use this api to query managed sub account transfer log. This endpoint is available for trading team of Managed Sub-Account. A Managed Sub-Account is an account type for investors who value flexibility in asset allocation and account application, while delegating trades to a professional trading team  Weight(IP): 60
   * @param email  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param transfers Transfer Direction (FROM/TO) (optional)
   * @param transferFunctionAccountType Transfer function account type (SPOT/MARGIN/ISOLATED_MARGIN/USDT_FUTURE/COIN_FUTURE) (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response sapiV1ManagedSubaccountQueryTransLogForTradeParentGet(String email, Long timestamp, String signature, Long startTime, Long endTime, Integer page, Integer limit, String transfers, String transferFunctionAccountType, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1ManagedSubaccountQueryTransLogForTradeParentGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountQueryTransLogForTradeParentGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountQueryTransLogForTradeParentGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/queryTransLogForTradeParent".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transfers", transfers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferFunctionAccountType", transferFunctionAccountType));
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

    GenericType<SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountQueryTransLogForInvestorGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Managed Sub Account Transfer Log (For Trading Team Sub Account)(USER_DATA)
   * Query Managed Sub Account Transfer Log (For Trading Team Sub Account)  Weight(UID): 60
   * @param transfers Transfer Direction (required)
   * @param transferFunctionAccountType Transfer function account type (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountQueryTransLogGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountQueryTransLogGet200Response sapiV1ManagedSubaccountQueryTransLogGet(String transfers, String transferFunctionAccountType, Long timestamp, String signature, Long startTime, Long endTime, Integer page, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transfers' is set
    if (transfers == null) {
      throw new ApiException(400, "Missing the required parameter 'transfers' when calling sapiV1ManagedSubaccountQueryTransLogGet");
    }
    
    // verify the required parameter 'transferFunctionAccountType' is set
    if (transferFunctionAccountType == null) {
      throw new ApiException(400, "Missing the required parameter 'transferFunctionAccountType' when calling sapiV1ManagedSubaccountQueryTransLogGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountQueryTransLogGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountQueryTransLogGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/query-trans-log".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transfers", transfers));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferFunctionAccountType", transferFunctionAccountType));
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

    GenericType<SapiV1ManagedSubaccountQueryTransLogGet200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountQueryTransLogGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Withdrawl assets from the managed sub-account(For Investor Master Account)
   * Weight(IP): 1
   * @param fromEmail Sender email (required)
   * @param asset  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param transferDate Withdrawals is automatically occur on the transfer date(UTC0). If a date is not selected, the withdrawal occurs right now (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ManagedSubaccountDepositPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ManagedSubaccountDepositPost200Response sapiV1ManagedSubaccountWithdrawPost(String fromEmail, String asset, Double amount, Long timestamp, String signature, Long transferDate, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fromEmail' is set
    if (fromEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'fromEmail' when calling sapiV1ManagedSubaccountWithdrawPost");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1ManagedSubaccountWithdrawPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1ManagedSubaccountWithdrawPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ManagedSubaccountWithdrawPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ManagedSubaccountWithdrawPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/managed-subaccount/withdraw".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromEmail", fromEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferDate", transferDate));
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

    GenericType<SapiV1ManagedSubaccountDepositPost200Response> localVarReturnType = new GenericType<SapiV1ManagedSubaccountDepositPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Enable Leverage Token for Sub-account (For Master Account)
   * Weight(IP): 1
   * @param email Sub-account email (required)
   * @param enableBlvt Only true for now (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountBlvtEnablePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountBlvtEnablePost200Response sapiV1SubAccountBlvtEnablePost(String email, Boolean enableBlvt, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountBlvtEnablePost");
    }
    
    // verify the required parameter 'enableBlvt' is set
    if (enableBlvt == null) {
      throw new ApiException(400, "Missing the required parameter 'enableBlvt' when calling sapiV1SubAccountBlvtEnablePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountBlvtEnablePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountBlvtEnablePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/blvt/enable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enableBlvt", enableBlvt));
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

    GenericType<SapiV1SubAccountBlvtEnablePost200Response> localVarReturnType = new GenericType<SapiV1SubAccountBlvtEnablePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Enable Options for Sub-account (For Master Account)(USER_DATA)
   * Enable Options for Sub-account (For Master Account).  Weight(IP): 1
   * @param email  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountEoptionsEnablePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountEoptionsEnablePost200Response sapiV1SubAccountEoptionsEnablePost(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountEoptionsEnablePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountEoptionsEnablePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountEoptionsEnablePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/eoptions/enable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1SubAccountEoptionsEnablePost200Response> localVarReturnType = new GenericType<SapiV1SubAccountEoptionsEnablePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Detail on Sub-account&#39;s Futures Account (For Master Account)
   * Weight(IP): 10
   * @param email  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountFuturesAccountGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountFuturesAccountGet200Response sapiV1SubAccountFuturesAccountGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountFuturesAccountGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountFuturesAccountGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountFuturesAccountGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/futures/account".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1SubAccountFuturesAccountGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountFuturesAccountGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Summary of Sub-account&#39;s Futures Account (For Master Account)
   * Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountFuturesAccountSummaryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountFuturesAccountSummaryGet200Response sapiV1SubAccountFuturesAccountSummaryGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountFuturesAccountSummaryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountFuturesAccountSummaryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/futures/accountSummary".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1SubAccountFuturesAccountSummaryGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountFuturesAccountSummaryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Enable Futures for Sub-account (For Master Account)
   * Weight(IP): 1
   * @param email Sub-account email (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountFuturesEnablePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountFuturesEnablePost200Response sapiV1SubAccountFuturesEnablePost(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountFuturesEnablePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountFuturesEnablePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountFuturesEnablePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/futures/enable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1SubAccountFuturesEnablePost200Response> localVarReturnType = new GenericType<SapiV1SubAccountFuturesEnablePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sub-account Futures Asset Transfer History (For Master Account)
   * Weight(IP): 1
   * @param email Sub-account email (required)
   * @param futuresType 1:USDT-margined Futures, 2: Coin-margined Futures (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param limit Default value: 50, Max value: 500 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountFuturesInternalTransferGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountFuturesInternalTransferGet200Response sapiV1SubAccountFuturesInternalTransferGet(String email, Integer futuresType, Long timestamp, String signature, Long startTime, Long endTime, Integer page, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountFuturesInternalTransferGet");
    }
    
    // verify the required parameter 'futuresType' is set
    if (futuresType == null) {
      throw new ApiException(400, "Missing the required parameter 'futuresType' when calling sapiV1SubAccountFuturesInternalTransferGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountFuturesInternalTransferGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountFuturesInternalTransferGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/futures/internalTransfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "futuresType", futuresType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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

    GenericType<SapiV1SubAccountFuturesInternalTransferGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountFuturesInternalTransferGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sub-account Futures Asset Transfer (For Master Account)
   * - Master account can transfer max 2000 times a minute  Weight(IP): 1
   * @param fromEmail Sender email (required)
   * @param toEmail Recipient email (required)
   * @param futuresType 1:USDT-margined Futures,2: Coin-margined Futures (required)
   * @param asset  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountFuturesInternalTransferGet200Response1}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountFuturesInternalTransferGet200Response1 sapiV1SubAccountFuturesInternalTransferPost(String fromEmail, String toEmail, Integer futuresType, String asset, Double amount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fromEmail' is set
    if (fromEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'fromEmail' when calling sapiV1SubAccountFuturesInternalTransferPost");
    }
    
    // verify the required parameter 'toEmail' is set
    if (toEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'toEmail' when calling sapiV1SubAccountFuturesInternalTransferPost");
    }
    
    // verify the required parameter 'futuresType' is set
    if (futuresType == null) {
      throw new ApiException(400, "Missing the required parameter 'futuresType' when calling sapiV1SubAccountFuturesInternalTransferPost");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1SubAccountFuturesInternalTransferPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SubAccountFuturesInternalTransferPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountFuturesInternalTransferPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountFuturesInternalTransferPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/futures/internalTransfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromEmail", fromEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toEmail", toEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "futuresType", futuresType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<SapiV1SubAccountFuturesInternalTransferGet200Response1> localVarReturnType = new GenericType<SapiV1SubAccountFuturesInternalTransferGet200Response1>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Futures Position-Risk of Sub-account (For Master Account)
   * Weight(IP): 10
   * @param email Sub-account email (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1SubAccountFuturesPositionRiskGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1SubAccountFuturesPositionRiskGet200ResponseInner> sapiV1SubAccountFuturesPositionRiskGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountFuturesPositionRiskGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountFuturesPositionRiskGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountFuturesPositionRiskGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/futures/positionRisk".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<List<SapiV1SubAccountFuturesPositionRiskGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1SubAccountFuturesPositionRiskGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Transfer for Sub-account (For Master Account)
   * Weight(IP): 1
   * @param email Sub-account email (required)
   * @param asset  (required)
   * @param amount  (required)
   * @param type * &#x60;1&#x60; - transfer from subaccount&#39;s spot account to its USDT-margined futures account * &#x60;2&#x60; - transfer from subaccount&#39;s USDT-margined futures account to its spot account * &#x60;3&#x60; - transfer from subaccount&#39;s spot account to its COIN-margined futures account * &#x60;4&#x60; - transfer from subaccount&#39;s COIN-margined futures account to its spot account (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountFuturesTransferPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountFuturesTransferPost200Response sapiV1SubAccountFuturesTransferPost(String email, String asset, Double amount, Integer type, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountFuturesTransferPost");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1SubAccountFuturesTransferPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SubAccountFuturesTransferPost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1SubAccountFuturesTransferPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountFuturesTransferPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountFuturesTransferPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/futures/transfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1SubAccountFuturesTransferPost200Response> localVarReturnType = new GenericType<SapiV1SubAccountFuturesTransferPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Sub-account List (For Master Account)
   * Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param email Sub-account email (optional)
   * @param isFreeze  (optional)
   * @param page Default 1 (optional)
   * @param limit Default 1; max 200 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountListGet200Response sapiV1SubAccountListGet(Long timestamp, String signature, String email, String isFreeze, Integer page, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isFreeze", isFreeze));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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

    GenericType<SapiV1SubAccountListGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Detail on Sub-account&#39;s Margin Account (For Master Account)
   * Weight(IP): 10
   * @param email Sub-account email (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountMarginAccountGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountMarginAccountGet200Response sapiV1SubAccountMarginAccountGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountMarginAccountGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountMarginAccountGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountMarginAccountGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/margin/account".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1SubAccountMarginAccountGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountMarginAccountGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Summary of Sub-account&#39;s Margin Account (For Master Account)
   * Weight(IP): 10
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountMarginAccountSummaryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountMarginAccountSummaryGet200Response sapiV1SubAccountMarginAccountSummaryGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountMarginAccountSummaryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountMarginAccountSummaryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/margin/accountSummary".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1SubAccountMarginAccountSummaryGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountMarginAccountSummaryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Enable Margin for Sub-account (For Master Account)
   * Weight(IP): 1
   * @param email Sub-account email (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountMarginEnablePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountMarginEnablePost200Response sapiV1SubAccountMarginEnablePost(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountMarginEnablePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountMarginEnablePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountMarginEnablePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/margin/enable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1SubAccountMarginEnablePost200Response> localVarReturnType = new GenericType<SapiV1SubAccountMarginEnablePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin Transfer for Sub-account (For Master Account)
   * Weight(IP): 1
   * @param email Sub-account email (required)
   * @param asset  (required)
   * @param amount  (required)
   * @param type * &#x60;1&#x60; - transfer from subaccount&#39;s spot account to margin account * &#x60;2&#x60; - transfer from subaccount&#39;s margin account to its spot account (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountFuturesTransferPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountFuturesTransferPost200Response sapiV1SubAccountMarginTransferPost(String email, String asset, Double amount, Integer type, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountMarginTransferPost");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1SubAccountMarginTransferPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SubAccountMarginTransferPost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1SubAccountMarginTransferPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountMarginTransferPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountMarginTransferPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/margin/transfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1SubAccountFuturesTransferPost200Response> localVarReturnType = new GenericType<SapiV1SubAccountFuturesTransferPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sub-account Spot Assets Summary (For Master Account)
   * Get BTC valued asset summary of subaccounts.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param email Sub-account email (optional)
   * @param page Default 1 (optional)
   * @param size Default:10 Max:20 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountSpotSummaryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountSpotSummaryGet200Response sapiV1SubAccountSpotSummaryGet(Long timestamp, String signature, String email, Integer page, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountSpotSummaryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountSpotSummaryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/spotSummary".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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

    GenericType<SapiV1SubAccountSpotSummaryGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountSpotSummaryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sub-account&#39;s Status on Margin/Futures (For Master Account)
   * - If no &#x60;email&#x60; sent, all sub-accounts&#39; information will be returned.  Weight(IP): 10
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param email Sub-account email (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1SubAccountStatusGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1SubAccountStatusGet200ResponseInner> sapiV1SubAccountStatusGet(Long timestamp, String signature, String email, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountStatusGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<List<SapiV1SubAccountStatusGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1SubAccountStatusGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get IP Restriction for a Sub-account API Key (For Master Account)
   * Weight(UID): 3000
   * @param email Sub-account email (required)
   * @param subAccountApiKey  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountSubAccountApiIpRestrictionGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountSubAccountApiIpRestrictionGet200Response sapiV1SubAccountSubAccountApiIpRestrictionGet(String email, String subAccountApiKey, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountSubAccountApiIpRestrictionGet");
    }
    
    // verify the required parameter 'subAccountApiKey' is set
    if (subAccountApiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'subAccountApiKey' when calling sapiV1SubAccountSubAccountApiIpRestrictionGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountSubAccountApiIpRestrictionGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountSubAccountApiIpRestrictionGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/subAccountApi/ipRestriction".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subAccountApiKey", subAccountApiKey));
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

    GenericType<SapiV1SubAccountSubAccountApiIpRestrictionGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountSubAccountApiIpRestrictionGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Delete IP List for a Sub-account API Key (For Master Account)
   * Weight(UID): 3000
   * @param email Sub-account email (required)
   * @param subAccountApiKey  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param ipAddress Can be added in batches, separated by commas (optional)
   * @param thirdPartyName third party IP list name (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountSubAccountApiIpRestrictionIpListDelete200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountSubAccountApiIpRestrictionIpListDelete200Response sapiV1SubAccountSubAccountApiIpRestrictionIpListDelete(String email, String subAccountApiKey, Long timestamp, String signature, String ipAddress, String thirdPartyName, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountSubAccountApiIpRestrictionIpListDelete");
    }
    
    // verify the required parameter 'subAccountApiKey' is set
    if (subAccountApiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'subAccountApiKey' when calling sapiV1SubAccountSubAccountApiIpRestrictionIpListDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountSubAccountApiIpRestrictionIpListDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountSubAccountApiIpRestrictionIpListDelete");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/subAccountApi/ipRestriction/ipList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subAccountApiKey", subAccountApiKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ipAddress", ipAddress));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "thirdPartyName", thirdPartyName));
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

    GenericType<SapiV1SubAccountSubAccountApiIpRestrictionIpListDelete200Response> localVarReturnType = new GenericType<SapiV1SubAccountSubAccountApiIpRestrictionIpListDelete200Response>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sub-account Spot Asset Transfer History (For Master Account)
   * - fromEmail and toEmail cannot be sent at the same time. - Return fromEmail equal master account email by default.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param fromEmail Sub-account email (optional)
   * @param toEmail Sub-account email (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param limit Default 1 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1SubAccountSubTransferHistoryGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1SubAccountSubTransferHistoryGet200ResponseInner> sapiV1SubAccountSubTransferHistoryGet(Long timestamp, String signature, String fromEmail, String toEmail, Long startTime, Long endTime, Integer page, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountSubTransferHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountSubTransferHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/sub/transfer/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromEmail", fromEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toEmail", toEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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

    GenericType<List<SapiV1SubAccountSubTransferHistoryGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1SubAccountSubTransferHistoryGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Sub-account Transaction Statistics (For Master Account)
   * Query Sub-account Transaction statistics (For Master Account).  Weight(UID): 60
   * @param email  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountTransactionStatisticsGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountTransactionStatisticsGet200Response sapiV1SubAccountTransactionStatisticsGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1SubAccountTransactionStatisticsGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountTransactionStatisticsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountTransactionStatisticsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/transaction-statistics".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV1SubAccountTransactionStatisticsGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountTransactionStatisticsGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Transfer to Master (For Sub-account)
   * Weight(IP): 1
   * @param asset  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountFuturesTransferPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountFuturesTransferPost200Response sapiV1SubAccountTransferSubToMasterPost(String asset, Double amount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1SubAccountTransferSubToMasterPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SubAccountTransferSubToMasterPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountTransferSubToMasterPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountTransferSubToMasterPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/transfer/subToMaster".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<SapiV1SubAccountFuturesTransferPost200Response> localVarReturnType = new GenericType<SapiV1SubAccountFuturesTransferPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Transfer to Sub-account of Same Master (For Sub-account)
   * Weight(IP): 1
   * @param toEmail Recipient email (required)
   * @param asset  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountFuturesTransferPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountFuturesTransferPost200Response sapiV1SubAccountTransferSubToSubPost(String toEmail, String asset, Double amount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'toEmail' is set
    if (toEmail == null) {
      throw new ApiException(400, "Missing the required parameter 'toEmail' when calling sapiV1SubAccountTransferSubToSubPost");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1SubAccountTransferSubToSubPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SubAccountTransferSubToSubPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountTransferSubToSubPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountTransferSubToSubPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/transfer/subToSub".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toEmail", toEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<SapiV1SubAccountFuturesTransferPost200Response> localVarReturnType = new GenericType<SapiV1SubAccountFuturesTransferPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sub-account Transfer History (For Sub-account)
   * - If &#x60;type&#x60; is not sent, the records of type 2: transfer out will be returned by default. - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the recent 30-day data will be returned.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param type * &#x60;1&#x60; - transfer in * &#x60;2&#x60; - transfer out (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner> sapiV1SubAccountTransferSubUserHistoryGet(Long timestamp, String signature, String asset, Integer type, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountTransferSubUserHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountTransferSubUserHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/transfer/subUserHistory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
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

    GenericType<List<SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1SubAccountTransferSubUserHistoryGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Universal Transfer History (For Master Account)
   * - &#x60;fromEmail&#x60; and &#x60;toEmail&#x60; cannot be sent at the same time. - Return &#x60;fromEmail&#x60; equal master account email by default. - The query time period must be less then 30 days. - If startTime and endTime not sent, return records of the last 30 days by default.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param fromEmail Sub-account email (optional)
   * @param toEmail Sub-account email (optional)
   * @param clientTranId  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param limit Default 500, Max 500 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1SubAccountUniversalTransferGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1SubAccountUniversalTransferGet200ResponseInner> sapiV1SubAccountUniversalTransferGet(Long timestamp, String signature, String fromEmail, String toEmail, String clientTranId, Long startTime, Long endTime, Integer page, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountUniversalTransferGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountUniversalTransferGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/universalTransfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromEmail", fromEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toEmail", toEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientTranId", clientTranId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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

    GenericType<List<SapiV1SubAccountUniversalTransferGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1SubAccountUniversalTransferGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Universal Transfer (For Master Account)
   * - You need to enable \&quot;internal transfer\&quot; option for the api key which requests this endpoint. - Transfer from master account by default if fromEmail is not sent. - Transfer to master account by default if toEmail is not sent. - Supported transfer scenarios:   - Master account SPOT transfer to sub-account SPOT,USDT_FUTURE,COIN_FUTURE,MARGIN(Cross),ISOLATED_MARGIN   - Sub-account SPOT,USDT_FUTURE,COIN_FUTURE,MARGIN(Cross),ISOLATED_MARGIN transfer to master account SPOT   - Transfer between two sub-account SPOT accounts  Weight(IP): 1
   * @param fromAccountType  (required)
   * @param toAccountType  (required)
   * @param asset  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param fromEmail Sub-account email (optional)
   * @param toEmail Sub-account email (optional)
   * @param clientTranId  (optional)
   * @param symbol Only supported under ISOLATED_MARGIN type (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountUniversalTransferGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountUniversalTransferGet200Response sapiV1SubAccountUniversalTransferPost(String fromAccountType, String toAccountType, String asset, Double amount, Long timestamp, String signature, String fromEmail, String toEmail, String clientTranId, String symbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fromAccountType' is set
    if (fromAccountType == null) {
      throw new ApiException(400, "Missing the required parameter 'fromAccountType' when calling sapiV1SubAccountUniversalTransferPost");
    }
    
    // verify the required parameter 'toAccountType' is set
    if (toAccountType == null) {
      throw new ApiException(400, "Missing the required parameter 'toAccountType' when calling sapiV1SubAccountUniversalTransferPost");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1SubAccountUniversalTransferPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1SubAccountUniversalTransferPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountUniversalTransferPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountUniversalTransferPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/universalTransfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromEmail", fromEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toEmail", toEmail));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromAccountType", fromAccountType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toAccountType", toAccountType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientTranId", clientTranId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<SapiV1SubAccountUniversalTransferGet200Response> localVarReturnType = new GenericType<SapiV1SubAccountUniversalTransferGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a Virtual Sub-account(For Master Account)
   * - This request will generate a virtual sub account under your master account. - You need to enable \&quot;trade\&quot; option for the api key which requests this endpoint.  Weight(IP): 1
   * @param subAccountString Please input a string. We will create a virtual email using that string for you to register (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1SubAccountVirtualSubAccountPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SubAccountVirtualSubAccountPost200Response sapiV1SubAccountVirtualSubAccountPost(String subAccountString, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'subAccountString' is set
    if (subAccountString == null) {
      throw new ApiException(400, "Missing the required parameter 'subAccountString' when calling sapiV1SubAccountVirtualSubAccountPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SubAccountVirtualSubAccountPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SubAccountVirtualSubAccountPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/sub-account/virtualSubAccount".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subAccountString", subAccountString));
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

    GenericType<SapiV1SubAccountVirtualSubAccountPost200Response> localVarReturnType = new GenericType<SapiV1SubAccountVirtualSubAccountPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Detail on Sub-account&#39;s Futures Account V2 (For Master Account)
   * Weight(IP): 1
   * @param email Sub-account email (required)
   * @param futuresType * &#x60;1&#x60; - USDT Margined Futures * &#x60;2&#x60; - COIN Margined Futures (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2SubAccountFuturesAccountGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2SubAccountFuturesAccountGet200Response sapiV2SubAccountFuturesAccountGet(String email, Integer futuresType, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV2SubAccountFuturesAccountGet");
    }
    
    // verify the required parameter 'futuresType' is set
    if (futuresType == null) {
      throw new ApiException(400, "Missing the required parameter 'futuresType' when calling sapiV2SubAccountFuturesAccountGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2SubAccountFuturesAccountGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2SubAccountFuturesAccountGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/sub-account/futures/account".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "futuresType", futuresType));
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

    GenericType<SapiV2SubAccountFuturesAccountGet200Response> localVarReturnType = new GenericType<SapiV2SubAccountFuturesAccountGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Summary of Sub-account&#39;s Futures Account V2 (For Master Account)
   * Weight(IP): 10
   * @param futuresType * &#x60;1&#x60; - USDT Margined Futures * &#x60;2&#x60; - COIN Margined Futures (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param page Default 1 (optional)
   * @param limit Default 10, Max 20 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2SubAccountFuturesAccountSummaryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2SubAccountFuturesAccountSummaryGet200Response sapiV2SubAccountFuturesAccountSummaryGet(Integer futuresType, Long timestamp, String signature, Integer page, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'futuresType' is set
    if (futuresType == null) {
      throw new ApiException(400, "Missing the required parameter 'futuresType' when calling sapiV2SubAccountFuturesAccountSummaryGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2SubAccountFuturesAccountSummaryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2SubAccountFuturesAccountSummaryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/sub-account/futures/accountSummary".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "futuresType", futuresType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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

    GenericType<SapiV2SubAccountFuturesAccountSummaryGet200Response> localVarReturnType = new GenericType<SapiV2SubAccountFuturesAccountSummaryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Futures Position-Risk of Sub-account V2 (For Master Account)
   * Weight(IP): 1
   * @param email Sub-account email (required)
   * @param futuresType * &#x60;1&#x60; - USDT Margined Futures * &#x60;2&#x60; - COIN Margined Futures (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2SubAccountFuturesPositionRiskGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2SubAccountFuturesPositionRiskGet200Response sapiV2SubAccountFuturesPositionRiskGet(String email, Integer futuresType, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV2SubAccountFuturesPositionRiskGet");
    }
    
    // verify the required parameter 'futuresType' is set
    if (futuresType == null) {
      throw new ApiException(400, "Missing the required parameter 'futuresType' when calling sapiV2SubAccountFuturesPositionRiskGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2SubAccountFuturesPositionRiskGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2SubAccountFuturesPositionRiskGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/sub-account/futures/positionRisk".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "futuresType", futuresType));
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

    GenericType<SapiV2SubAccountFuturesPositionRiskGet200Response> localVarReturnType = new GenericType<SapiV2SubAccountFuturesPositionRiskGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Update IP Restriction for Sub-Account API key (For Master Account)
   * Update IP Restriction for Sub-Account API key  Weight(UID): 3000
   * @param email Sub-account email (required)
   * @param subAccountApiKey  (required)
   * @param status IP Restriction status. 1 &#x3D; IP Unrestricted. 2 &#x3D; Restrict access to trusted IPs only. 3 &#x3D; Restrict access to users&#39; trusted third party IPs only (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param thirdPartyName third party IP list name (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2SubAccountSubAccountApiIpRestrictionPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2SubAccountSubAccountApiIpRestrictionPost200Response sapiV2SubAccountSubAccountApiIpRestrictionPost(String email, String subAccountApiKey, String status, Long timestamp, String signature, String thirdPartyName, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV2SubAccountSubAccountApiIpRestrictionPost");
    }
    
    // verify the required parameter 'subAccountApiKey' is set
    if (subAccountApiKey == null) {
      throw new ApiException(400, "Missing the required parameter 'subAccountApiKey' when calling sapiV2SubAccountSubAccountApiIpRestrictionPost");
    }
    
    // verify the required parameter 'status' is set
    if (status == null) {
      throw new ApiException(400, "Missing the required parameter 'status' when calling sapiV2SubAccountSubAccountApiIpRestrictionPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2SubAccountSubAccountApiIpRestrictionPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2SubAccountSubAccountApiIpRestrictionPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/sub-account/subAccountApi/ipRestriction".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subAccountApiKey", subAccountApiKey));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "thirdPartyName", thirdPartyName));
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

    GenericType<SapiV2SubAccountSubAccountApiIpRestrictionPost200Response> localVarReturnType = new GenericType<SapiV2SubAccountSubAccountApiIpRestrictionPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Sub-account Assets (For Master Account)
   * Fetch sub-account assets  Weight(IP): 1
   * @param email Sub-account email (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV3SubAccountAssetsGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV3SubAccountAssetsGet200Response sapiV3SubAccountAssetsGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV3SubAccountAssetsGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV3SubAccountAssetsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV3SubAccountAssetsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v3/sub-account/assets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV3SubAccountAssetsGet200Response> localVarReturnType = new GenericType<SapiV3SubAccountAssetsGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Sub-account Assets (For Master Account)
   * Fetch sub-account assets  Weight(UID): 60
   * @param email  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV4SubAccountAssetsGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV4SubAccountAssetsGet200Response sapiV4SubAccountAssetsGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV4SubAccountAssetsGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV4SubAccountAssetsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV4SubAccountAssetsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v4/sub-account/assets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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

    GenericType<SapiV4SubAccountAssetsGet200Response> localVarReturnType = new GenericType<SapiV4SubAccountAssetsGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
