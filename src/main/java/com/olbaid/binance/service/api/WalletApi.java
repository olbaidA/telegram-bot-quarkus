package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1AccountApiRestrictionsGet200Response;
import com.olbaid.binance.service.model.SapiV1AccountApiTradingStatusGet200Response;
import com.olbaid.binance.service.model.SapiV1AccountInfoGet200Response;
import com.olbaid.binance.service.model.SapiV1AccountSnapshotGet200Response;
import com.olbaid.binance.service.model.SapiV1AccountStatusGet200Response;
import com.olbaid.binance.service.model.SapiV1AssetAssetDetailGet200Response;
import com.olbaid.binance.service.model.SapiV1AssetAssetDividendGet200Response;
import com.olbaid.binance.service.model.SapiV1AssetConvertTransferPost200Response;
import com.olbaid.binance.service.model.SapiV1AssetConvertTransferQueryByPageGet200Response;
import com.olbaid.binance.service.model.SapiV1AssetCustodyTransferHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV1AssetDribbletGet200Response;
import com.olbaid.binance.service.model.SapiV1AssetDustBtcPost200Response;
import com.olbaid.binance.service.model.SapiV1AssetDustPost200Response;
import com.olbaid.binance.service.model.SapiV1AssetGetFundingAssetPost200ResponseInner;
import com.olbaid.binance.service.model.SapiV1AssetLedgerTransferCloudMiningQueryByPageGet200Response;
import com.olbaid.binance.service.model.SapiV1AssetTradeFeeGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1AssetTransferGet200Response;
import com.olbaid.binance.service.model.SapiV1AssetTransferGet200Response1;
import com.olbaid.binance.service.model.SapiV1AssetWalletBalanceGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1CapitalConfigGetallGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1CapitalContractConvertibleCoinsGet200Response;
import com.olbaid.binance.service.model.SapiV1CapitalDepositAddressGet200Response;
import com.olbaid.binance.service.model.SapiV1CapitalDepositAddressListGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1CapitalDepositCreditApplyPost200Response;
import com.olbaid.binance.service.model.SapiV1CapitalDepositHisrecGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1CapitalWithdrawAddressListGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1CapitalWithdrawApplyPost200Response;
import com.olbaid.binance.service.model.SapiV1CapitalWithdrawHistoryGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1SpotDelistScheduleGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1SystemStatusGet200Response;
import com.olbaid.binance.service.model.SapiV3AssetGetUserAssetPost200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class WalletApi {
  private ApiClient apiClient;

  public WalletApi() {
    this(Configuration.getDefaultApiClient());
  }

  public WalletApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get API Key Permission (USER_DATA)
   * Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AccountApiRestrictionsGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AccountApiRestrictionsGet200Response sapiV1AccountApiRestrictionsGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AccountApiRestrictionsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AccountApiRestrictionsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/account/apiRestrictions".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1AccountApiRestrictionsGet200Response> localVarReturnType = new GenericType<SapiV1AccountApiRestrictionsGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Account API Trading Status (USER_DATA)
   * Fetch account API trading status with details.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AccountApiTradingStatusGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AccountApiTradingStatusGet200Response sapiV1AccountApiTradingStatusGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AccountApiTradingStatusGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AccountApiTradingStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/account/apiTradingStatus".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1AccountApiTradingStatusGet200Response> localVarReturnType = new GenericType<SapiV1AccountApiTradingStatusGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Disable Fast Withdraw Switch (USER_DATA)
   * - This request will disable fastwithdraw switch under your account. - You need to enable \&quot;trade\&quot; option for the api key which requests this endpoint.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object sapiV1AccountDisableFastWithdrawSwitchPost(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AccountDisableFastWithdrawSwitchPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AccountDisableFastWithdrawSwitchPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/account/disableFastWithdrawSwitch".replaceAll("\\{format\\}","json");

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Enable Fast Withdraw Switch (USER_DATA)
   * - This request will enable fastwithdraw switch under your account. You need to enable \&quot;trade\&quot; option for the api key which requests this endpoint. - When Fast Withdraw Switch is on, transferring funds to a Binance account will be done instantly. There is no on-chain transaction, no transaction ID and no withdrawal fee.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object sapiV1AccountEnableFastWithdrawSwitchPost(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AccountEnableFastWithdrawSwitchPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AccountEnableFastWithdrawSwitchPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/account/enableFastWithdrawSwitch".replaceAll("\\{format\\}","json");

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Account info (USER_DATA)
   * Fetch account info detail.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AccountInfoGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AccountInfoGet200Response sapiV1AccountInfoGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AccountInfoGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AccountInfoGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/account/info".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1AccountInfoGet200Response> localVarReturnType = new GenericType<SapiV1AccountInfoGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Daily Account Snapshot (USER_DATA)
   * - The query time period must be less than 30 days - Support query within the last one month only - If startTimeand endTime not sent, return records of the last 7 days by default  Weight(IP): 2400
   * @param type  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit  (optional, default to 7)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AccountSnapshotGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AccountSnapshotGet200Response sapiV1AccountSnapshotGet(String type, Long timestamp, String signature, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1AccountSnapshotGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AccountSnapshotGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AccountSnapshotGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/accountSnapshot".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<SapiV1AccountSnapshotGet200Response> localVarReturnType = new GenericType<SapiV1AccountSnapshotGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Account Status (USER_DATA)
   * Fetch account status detail.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AccountStatusGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AccountStatusGet200Response sapiV1AccountStatusGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AccountStatusGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AccountStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/account/status".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1AccountStatusGet200Response> localVarReturnType = new GenericType<SapiV1AccountStatusGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Asset Detail (USER_DATA)
   * Fetch details of assets supported on Binance.  - Please get network and other deposit or withdraw details from &#x60;GET /sapi/v1/capital/config/getall&#x60;.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetAssetDetailGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetAssetDetailGet200Response sapiV1AssetAssetDetailGet(Long timestamp, String signature, String asset, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetAssetDetailGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetAssetDetailGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/assetDetail".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<SapiV1AssetAssetDetailGet200Response> localVarReturnType = new GenericType<SapiV1AssetAssetDetailGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Asset Dividend Record (USER_DATA)
   * Query asset Dividend Record  Weight(IP): 10
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit  (optional, default to 20)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetAssetDividendGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetAssetDividendGet200Response sapiV1AssetAssetDividendGet(Long timestamp, String signature, String asset, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetAssetDividendGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetAssetDividendGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/assetDividend".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
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

    GenericType<SapiV1AssetAssetDividendGet200Response> localVarReturnType = new GenericType<SapiV1AssetAssetDividendGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Convert Transfer (USER_DATA)
   * Convert transfer, convert between BUSD and stablecoins. If the clientId has been used before, will not do the convert transfer, the original transfer will be returned.  Weight(UID): 5
   * @param clientTranId The unique flag, the min length is 20 (required)
   * @param asset  (required)
   * @param amount  (required)
   * @param targetAsset Target asset you want to convert (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetConvertTransferPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetConvertTransferPost200Response sapiV1AssetConvertTransferPost(String clientTranId, String asset, Double amount, String targetAsset, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'clientTranId' is set
    if (clientTranId == null) {
      throw new ApiException(400, "Missing the required parameter 'clientTranId' when calling sapiV1AssetConvertTransferPost");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1AssetConvertTransferPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1AssetConvertTransferPost");
    }
    
    // verify the required parameter 'targetAsset' is set
    if (targetAsset == null) {
      throw new ApiException(400, "Missing the required parameter 'targetAsset' when calling sapiV1AssetConvertTransferPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetConvertTransferPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetConvertTransferPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/convert-transfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientTranId", clientTranId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "targetAsset", targetAsset));
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

    GenericType<SapiV1AssetConvertTransferPost200Response> localVarReturnType = new GenericType<SapiV1AssetConvertTransferPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Convert Transfer (USER_DATA)
   * Weight(UID): 5
   * @param startTime UTC timestamp in ms (required)
   * @param endTime UTC timestamp in ms (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param tranId The transaction id (optional)
   * @param asset If it is blank, we will match deducted asset and target asset. (optional)
   * @param accountType MAIN: main account. CARD: funding account. If it is blank, we will query spot and card wallet, otherwise, we just query the corresponding wallet (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetConvertTransferQueryByPageGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetConvertTransferQueryByPageGet200Response sapiV1AssetConvertTransferQueryByPageGet(Long startTime, Long endTime, Long timestamp, String signature, Long tranId, String asset, String accountType, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(400, "Missing the required parameter 'startTime' when calling sapiV1AssetConvertTransferQueryByPageGet");
    }
    
    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(400, "Missing the required parameter 'endTime' when calling sapiV1AssetConvertTransferQueryByPageGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetConvertTransferQueryByPageGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetConvertTransferQueryByPageGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/convert-transfer/queryByPage".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tranId", tranId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountType", accountType));
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

    GenericType<SapiV1AssetConvertTransferQueryByPageGet200Response> localVarReturnType = new GenericType<SapiV1AssetConvertTransferQueryByPageGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query User Delegation History(For Master Account) (USER_DATA)
   * Query User Delegation History  Weight(IP): 60
   * @param email  (required)
   * @param startTime  (required)
   * @param endTime  (required)
   * @param asset  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param type  (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetCustodyTransferHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetCustodyTransferHistoryGet200Response sapiV1AssetCustodyTransferHistoryGet(String email, Long startTime, Long endTime, String asset, Long timestamp, String signature, String type, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1AssetCustodyTransferHistoryGet");
    }
    
    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(400, "Missing the required parameter 'startTime' when calling sapiV1AssetCustodyTransferHistoryGet");
    }
    
    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(400, "Missing the required parameter 'endTime' when calling sapiV1AssetCustodyTransferHistoryGet");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1AssetCustodyTransferHistoryGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetCustodyTransferHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetCustodyTransferHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/custody/transfer-history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
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

    GenericType<SapiV1AssetCustodyTransferHistoryGet200Response> localVarReturnType = new GenericType<SapiV1AssetCustodyTransferHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * DustLog(USER_DATA)
   * Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param accountType SPOT or MARGIN, default SPOT (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetDribbletGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetDribbletGet200Response sapiV1AssetDribbletGet(Long timestamp, String signature, String accountType, Long startTime, Long endTime, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetDribbletGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetDribbletGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/dribblet".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountType", accountType));
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

    GenericType<SapiV1AssetDribbletGet200Response> localVarReturnType = new GenericType<SapiV1AssetDribbletGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Assets That Can Be Converted Into BNB (USER_DATA)
   * Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param accountType SPOT or MARGIN, default SPOT (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetDustBtcPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetDustBtcPost200Response sapiV1AssetDustBtcPost(Long timestamp, String signature, String accountType, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetDustBtcPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetDustBtcPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/dust-btc".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountType", accountType));
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

    GenericType<SapiV1AssetDustBtcPost200Response> localVarReturnType = new GenericType<SapiV1AssetDustBtcPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Dust Transfer (USER_DATA)
   * Convert dust assets to BNB.  Weight(UID): 10
   * @param asset The asset being converted. For example, asset&#x3D;BTC&amp;asset&#x3D;USDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param accountType SPOT or MARGIN, default SPOT (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetDustPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetDustPost200Response sapiV1AssetDustPost(List<String> asset, Long timestamp, String signature, String accountType, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1AssetDustPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetDustPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetDustPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/dust".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "accountType", accountType));
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

    GenericType<SapiV1AssetDustPost200Response> localVarReturnType = new GenericType<SapiV1AssetDustPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Funding Wallet (USER_DATA)
   * - Currently supports querying the following business assetsï¼šBinance Pay, Binance Card, Binance Gift Card, Stock Token  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param needBtcValuation  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1AssetGetFundingAssetPost200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1AssetGetFundingAssetPost200ResponseInner> sapiV1AssetGetFundingAssetPost(Long timestamp, String signature, String asset, String needBtcValuation, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetGetFundingAssetPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetGetFundingAssetPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/get-funding-asset".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needBtcValuation", needBtcValuation));
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

    GenericType<List<SapiV1AssetGetFundingAssetPost200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1AssetGetFundingAssetPost200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Cloud-Mining payment and refund history (USER_DATA)
   * The query of Cloud-Mining payment and refund history  Weight(UID): 600
   * @param startTime UTC timestamp in ms (required)
   * @param endTime UTC timestamp in ms (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param tranId The transaction id (optional)
   * @param clientTranId The unique flag (optional)
   * @param asset If it is blank, we will query all assets (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetLedgerTransferCloudMiningQueryByPageGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetLedgerTransferCloudMiningQueryByPageGet200Response sapiV1AssetLedgerTransferCloudMiningQueryByPageGet(Long startTime, Long endTime, Long timestamp, String signature, Long tranId, String clientTranId, String asset, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(400, "Missing the required parameter 'startTime' when calling sapiV1AssetLedgerTransferCloudMiningQueryByPageGet");
    }
    
    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(400, "Missing the required parameter 'endTime' when calling sapiV1AssetLedgerTransferCloudMiningQueryByPageGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetLedgerTransferCloudMiningQueryByPageGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetLedgerTransferCloudMiningQueryByPageGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/ledger-transfer/cloud-mining/queryByPage".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tranId", tranId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientTranId", clientTranId));
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

    GenericType<SapiV1AssetLedgerTransferCloudMiningQueryByPageGet200Response> localVarReturnType = new GenericType<SapiV1AssetLedgerTransferCloudMiningQueryByPageGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Trade Fee (USER_DATA)
   * Fetch trade fee  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1AssetTradeFeeGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1AssetTradeFeeGet200ResponseInner> sapiV1AssetTradeFeeGet(Long timestamp, String signature, String symbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetTradeFeeGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetTradeFeeGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/tradeFee".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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

    GenericType<List<SapiV1AssetTradeFeeGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1AssetTradeFeeGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query User Universal Transfer History (USER_DATA)
   * - &#x60;fromSymbol&#x60; must be sent when type are ISOLATEDMARGIN_MARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN - &#x60;toSymbol&#x60; must be sent when type are MARGIN_ISOLATEDMARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN - Support query within the last 6 months only - If &#x60;startTime&#x60; and &#x60;endTime&#x60; not sent, return records of the last 7 days by default  Weight(IP): 1
   * @param type Universal transfer type (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param fromSymbol Must be sent when type are ISOLATEDMARGIN_MARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN (optional)
   * @param toSymbol Must be sent when type are MARGIN_ISOLATEDMARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetTransferGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetTransferGet200Response sapiV1AssetTransferGet(String type, Long timestamp, String signature, Long startTime, Long endTime, Integer current, Integer size, String fromSymbol, String toSymbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1AssetTransferGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetTransferGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetTransferGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/transfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromSymbol", fromSymbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toSymbol", toSymbol));
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

    GenericType<SapiV1AssetTransferGet200Response> localVarReturnType = new GenericType<SapiV1AssetTransferGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * User Universal Transfer (USER_DATA)
   * You need to enable &#x60;Permits Universal Transfer&#x60; option for the api key which requests this endpoint.  - &#x60;fromSymbol&#x60; must be sent when type are ISOLATEDMARGIN_MARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN - &#x60;toSymbol&#x60; must be sent when type are MARGIN_ISOLATEDMARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN  ENUM of transfer types:   - MAIN_UMFUTURE Spot account transfer to USDâ“ˆ-M Futures account   - MAIN_CMFUTURE Spot account transfer to COIN-M Futures account   - MAIN_MARGIN Spot account transfer to Margin(cross)account   - UMFUTURE_MAIN USDâ“ˆ-M Futures account transfer to Spot account   - UMFUTURE_MARGIN USDâ“ˆ-M Futures account transfer to Margin(cross)account   - CMFUTURE_MAIN COIN-M Futures account transfer to Spot account   - CMFUTURE_MARGIN COIN-M Futures account transfer to Margin(cross) account   - MARGIN_MAIN Margin(cross)account transfer to Spot account   - MARGIN_UMFUTURE Margin(cross)account transfer to USDâ“ˆ-M Futures   - MARGIN_CMFUTURE Margin(cross)account transfer to COIN-M Futures   - ISOLATEDMARGIN_MARGIN Isolated margin account transfer to Margin(cross) account   - MARGIN_ISOLATEDMARGIN Margin(cross) account transfer to Isolated margin account   - ISOLATEDMARGIN_ISOLATEDMARGIN Isolated margin account transfer to Isolated margin account   - MAIN_FUNDING Spot account transfer to Funding account   - FUNDING_MAIN Funding account transfer to Spot account   - FUNDING_UMFUTURE Funding account transfer to UMFUTURE account   - UMFUTURE_FUNDING UMFUTURE account transfer to Funding account   - MARGIN_FUNDING MARGIN account transfer to Funding account   - FUNDING_MARGIN Funding account transfer to Margin account   - FUNDING_CMFUTURE Funding account transfer to CMFUTURE account   - CMFUTURE_FUNDING CMFUTURE account transfer to Funding account   - MAIN_OPTION Spot account transfer to Options account   - OPTION_MAIN Options account transfer to Spot account   - UMFUTURE_OPTION USDâ“ˆ-M Futures account transfer to Options account   - OPTION_UMFUTURE Options account transfer to USDâ“ˆ-M Futures account   - MARGIN_OPTION Margin(cross)account transfer to Options account   - OPTION_MARGIN Options account transfer to Margin(cross)account   - FUNDING_OPTION Funding account transfer to Options account   - OPTION_FUNDING Options account transfer to Funding account   - MAIN_PORTFOLIO_MARGIN Spot account transfer to Portfolio Margin account   - PORTFOLIO_MARGIN_MAIN Portfolio Margin account transfer to Spot account   - MAIN_ISOLATED_MARGIN Spot account transfer to Isolated margin account   - ISOLATED_MARGIN_MAIN Isolated margin account transfer to Spot account  Weight(IP): 1
   * @param type Universal transfer type (required)
   * @param asset  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param fromSymbol Must be sent when type are ISOLATEDMARGIN_MARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN (optional)
   * @param toSymbol Must be sent when type are MARGIN_ISOLATEDMARGIN and ISOLATEDMARGIN_ISOLATEDMARGIN (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AssetTransferGet200Response1}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AssetTransferGet200Response1 sapiV1AssetTransferPost(String type, String asset, Double amount, Long timestamp, String signature, String fromSymbol, String toSymbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1AssetTransferPost");
    }
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1AssetTransferPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1AssetTransferPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetTransferPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetTransferPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/transfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromSymbol", fromSymbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toSymbol", toSymbol));
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

    GenericType<SapiV1AssetTransferGet200Response1> localVarReturnType = new GenericType<SapiV1AssetTransferGet200Response1>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query User Wallet Balance (USER_DATA)
   * Query User Wallet Balance  Weight(IP): 60
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1AssetWalletBalanceGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1AssetWalletBalanceGet200ResponseInner> sapiV1AssetWalletBalanceGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AssetWalletBalanceGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AssetWalletBalanceGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/asset/wallet/balance".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1AssetWalletBalanceGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1AssetWalletBalanceGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * All Coins&#39; Information (USER_DATA)
   * Get information of coins (available for deposit and withdraw) for user.  Weight(IP): 10
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1CapitalConfigGetallGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1CapitalConfigGetallGet200ResponseInner> sapiV1CapitalConfigGetallGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1CapitalConfigGetallGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1CapitalConfigGetallGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/config/getall".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1CapitalConfigGetallGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1CapitalConfigGetallGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query auto-converting stable coins (USER_DATA)
   * Get a user&#39;s auto-conversion settings in deposit/withdrawal  Weight(UID): 600&#39;
   * @return a {@code SapiV1CapitalContractConvertibleCoinsGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1CapitalContractConvertibleCoinsGet200Response sapiV1CapitalContractConvertibleCoinsGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/contract/convertible-coins".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1CapitalContractConvertibleCoinsGet200Response> localVarReturnType = new GenericType<SapiV1CapitalContractConvertibleCoinsGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Switch on/off BUSD and stable coins conversion (USER_DATA) (USER_DATA)
   * User can use it to turn on or turn off the BUSD auto-conversion from/to a specific stable coin.  Weight(UID): 600&#39;
   * @param coin Must be USDC, USDP or TUSD (required)
   * @param enable true: turn on the auto-conversion. false: turn off the auto-conversion (required)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object sapiV1CapitalContractConvertibleCoinsPost(String coin, Boolean enable) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'coin' is set
    if (coin == null) {
      throw new ApiException(400, "Missing the required parameter 'coin' when calling sapiV1CapitalContractConvertibleCoinsPost");
    }
    
    // verify the required parameter 'enable' is set
    if (enable == null) {
      throw new ApiException(400, "Missing the required parameter 'enable' when calling sapiV1CapitalContractConvertibleCoinsPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/contract/convertible-coins".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "enable", enable));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deposit Address (supporting network) (USER_DATA)
   * Fetch deposit address with network.  - If network is not send, return with default network of the coin. - You can get network and isDefault in networkList in the response of Get /sapi/v1/capital/config/getall (HMAC SHA256).  Weight(IP): 10
   * @param coin Coin name (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param network  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1CapitalDepositAddressGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1CapitalDepositAddressGet200Response sapiV1CapitalDepositAddressGet(String coin, Long timestamp, String signature, String network, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'coin' is set
    if (coin == null) {
      throw new ApiException(400, "Missing the required parameter 'coin' when calling sapiV1CapitalDepositAddressGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1CapitalDepositAddressGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1CapitalDepositAddressGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/deposit/address".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<SapiV1CapitalDepositAddressGet200Response> localVarReturnType = new GenericType<SapiV1CapitalDepositAddressGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetch deposit address list with network (USER_DATA)
   * Fetch deposit address list with network.  Weight(IP): 10
   * @param coin  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param network  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1CapitalDepositAddressListGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1CapitalDepositAddressListGet200ResponseInner> sapiV1CapitalDepositAddressListGet(String coin, Long timestamp, String signature, String network, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'coin' is set
    if (coin == null) {
      throw new ApiException(400, "Missing the required parameter 'coin' when calling sapiV1CapitalDepositAddressListGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1CapitalDepositAddressListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1CapitalDepositAddressListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/deposit/address/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<List<SapiV1CapitalDepositAddressListGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1CapitalDepositAddressListGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * One click arrival deposit apply (USER_DATA)
   * Apply deposit credit for expired address (One click arrival)  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param depositId Deposit record Id, priority use (optional)
   * @param txId Deposit txId, used when depositId is not specified (optional)
   * @param subAccountId  (optional)
   * @param subUserId  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1CapitalDepositCreditApplyPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1CapitalDepositCreditApplyPost200Response sapiV1CapitalDepositCreditApplyPost(Long timestamp, String signature, Long depositId, String txId, Long subAccountId, Long subUserId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1CapitalDepositCreditApplyPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1CapitalDepositCreditApplyPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/deposit/credit-apply".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "depositId", depositId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "txId", txId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subAccountId", subAccountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "subUserId", subUserId));
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

    GenericType<SapiV1CapitalDepositCreditApplyPost200Response> localVarReturnType = new GenericType<SapiV1CapitalDepositCreditApplyPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Deposit History(supporting network) (USER_DATA)
   * Fetch deposit history.  - Please notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within 0-90 days. - If both &#x60;startTime&#x60; and &#x60;endTime&#x60; are sent, time between &#x60;startTime&#x60; and &#x60;endTime&#x60; must be less than 90 days.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param coin Coin name (optional)
   * @param status * &#x60;0&#x60; - pending * &#x60;6&#x60; - credited but cannot withdraw * &#x60;1&#x60; - success (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param offset  (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1CapitalDepositHisrecGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1CapitalDepositHisrecGet200ResponseInner> sapiV1CapitalDepositHisrecGet(Long timestamp, String signature, String coin, Integer status, Long startTime, Long endTime, Integer offset, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1CapitalDepositHisrecGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1CapitalDepositHisrecGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/deposit/hisrec".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
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

    GenericType<List<SapiV1CapitalDepositHisrecGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1CapitalDepositHisrecGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetch withdraw address list (USER_DATA)
   * Fetch withdraw address list  Weight(IP): 10
   * @return a {@code List<SapiV1CapitalWithdrawAddressListGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1CapitalWithdrawAddressListGet200ResponseInner> sapiV1CapitalWithdrawAddressListGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/withdraw/address/list".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1CapitalWithdrawAddressListGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1CapitalWithdrawAddressListGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Withdraw (USER_DATA)
   * Submit a withdraw request.  - If &#x60;network&#x60; not send, return with default network of the coin. - You can get &#x60;network&#x60; and &#x60;isDefault&#x60; in &#x60;networkList&#x60; of a coin in the response of &#x60;Get /sapi/v1/capital/config/getall (HMAC SHA256)&#x60;.  Weight(IP): 1
   * @param coin Coin name (required)
   * @param address  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param withdrawOrderId Client id for withdraw (optional)
   * @param network  (optional)
   * @param addressTag Secondary address identifier for coins like XRP,XMR etc. (optional)
   * @param transactionFeeFlag When making internal transfer - &#x60;true&#x60; -&gt;  returning the fee to the destination account; - &#x60;false&#x60; -&gt; returning the fee back to the departure account. (optional, default to false)
   * @param name  (optional)
   * @param walletType The wallet type for withdrawï¼Œ0-Spot wallet, 1- Funding wallet. Default is Spot wallet (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1CapitalWithdrawApplyPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1CapitalWithdrawApplyPost200Response sapiV1CapitalWithdrawApplyPost(String coin, String address, Double amount, Long timestamp, String signature, String withdrawOrderId, String network, String addressTag, Boolean transactionFeeFlag, String name, Integer walletType, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'coin' is set
    if (coin == null) {
      throw new ApiException(400, "Missing the required parameter 'coin' when calling sapiV1CapitalWithdrawApplyPost");
    }
    
    // verify the required parameter 'address' is set
    if (address == null) {
      throw new ApiException(400, "Missing the required parameter 'address' when calling sapiV1CapitalWithdrawApplyPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1CapitalWithdrawApplyPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1CapitalWithdrawApplyPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1CapitalWithdrawApplyPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/withdraw/apply".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withdrawOrderId", withdrawOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "network", network));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "address", address));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "addressTag", addressTag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transactionFeeFlag", transactionFeeFlag));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletType", walletType));
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

    GenericType<SapiV1CapitalWithdrawApplyPost200Response> localVarReturnType = new GenericType<SapiV1CapitalWithdrawApplyPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Withdraw History (supporting network) (USER_DATA)
   * Fetch withdraw history.  This endpoint specifically uses per second UID rate limit, user&#39;s total second level IP rate limit is 180000/second. Response from the endpoint contains header key X-SAPI-USED-UID-WEIGHT-1S, which defines weight used by the current IP.  - &#x60;network&#x60; may not be in the response for old withdraw. - Please notice the default &#x60;startTime&#x60; and &#x60;endTime&#x60; to make sure that time interval is within 0-90 days. - If both &#x60;startTime&#x60; and &#x60;endTime&#x60; are sent, time between &#x60;startTime&#x60; and &#x60;endTime&#x60; must be less than 90 days - If withdrawOrderId is sent, time between startTime and endTime must be less than 7 days. - If withdrawOrderId is sent, startTime and endTime are not sent, will return last 7 days records by default.  Weight(UID): 18000 Request Limit: 10 requests per second
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param coin Coin name (optional)
   * @param withdrawOrderId  (optional)
   * @param status * &#x60;0&#x60; - Email Sent * &#x60;1&#x60; - Cancelled * &#x60;2&#x60; - Awaiting Approval * &#x60;3&#x60; - Rejected * &#x60;4&#x60; - Processing * &#x60;5&#x60; - Failure * &#x60;6&#x60; - Completed (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param offset  (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1CapitalWithdrawHistoryGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1CapitalWithdrawHistoryGet200ResponseInner> sapiV1CapitalWithdrawHistoryGet(Long timestamp, String signature, String coin, String withdrawOrderId, Integer status, Long startTime, Long endTime, Integer offset, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1CapitalWithdrawHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1CapitalWithdrawHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/capital/withdraw/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "withdrawOrderId", withdrawOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
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

    GenericType<List<SapiV1CapitalWithdrawHistoryGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1CapitalWithdrawHistoryGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get symbols delist schedule for spot (MARKET_DATA)
   * Get symbols delist schedule for spot  Weight(IP): 100
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1SpotDelistScheduleGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1SpotDelistScheduleGet200ResponseInner> sapiV1SpotDelistScheduleGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1SpotDelistScheduleGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1SpotDelistScheduleGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/spot/delist-schedule".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1SpotDelistScheduleGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1SpotDelistScheduleGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * System Status (System)
   * Fetch system status.  Weight(IP): 1
   * @return a {@code SapiV1SystemStatusGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1SystemStatusGet200Response sapiV1SystemStatusGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/system/status".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<SapiV1SystemStatusGet200Response> localVarReturnType = new GenericType<SapiV1SystemStatusGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * User Asset (USER_DATA)
   * Get user assets, just for positive data.  Weight(IP): 5
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param needBtcValuation  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV3AssetGetUserAssetPost200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV3AssetGetUserAssetPost200ResponseInner> sapiV3AssetGetUserAssetPost(Long timestamp, String signature, String asset, String needBtcValuation, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV3AssetGetUserAssetPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV3AssetGetUserAssetPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v3/asset/getUserAsset".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "needBtcValuation", needBtcValuation));
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

    GenericType<List<SapiV3AssetGetUserAssetPost200ResponseInner>> localVarReturnType = new GenericType<List<SapiV3AssetGetUserAssetPost200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
