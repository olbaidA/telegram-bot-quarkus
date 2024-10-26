package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1DciProductAccountsGet200Response;
import com.olbaid.binance.service.model.SapiV1DciProductAutoCompoundEditStatusPost200Response;
import com.olbaid.binance.service.model.SapiV1DciProductListGet200Response;
import com.olbaid.binance.service.model.SapiV1DciProductPositionsGet200Response;
import com.olbaid.binance.service.model.SapiV1DciProductSubscribePost200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DualInvestmentApi {
  private ApiClient apiClient;

  public DualInvestmentApi() {
    this(Configuration.getDefaultApiClient());
  }

  public DualInvestmentApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Check Dual Investment accounts(USER_DATA)
   * Check Dual Investment accounts  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1DciProductAccountsGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1DciProductAccountsGet200Response sapiV1DciProductAccountsGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1DciProductAccountsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1DciProductAccountsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/dci/product/accounts".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1DciProductAccountsGet200Response> localVarReturnType = new GenericType<SapiV1DciProductAccountsGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Change Auto-Compound status(USER_DATA)
   * Change Auto-Compound status  - 15:31 ~ 16:00 UTC+8 This function is disabled  Weight(IP): 1  Rate Limit: Maximum 1 time/s per account
   * @param positionId Get positionId from /sapi/v1/dci/product/positions (required)
   * @param autoCompoundPlan NONE: switch off the plan, STANDARD: standard plan, ADVANCED: advanced plan; (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1DciProductAutoCompoundEditStatusPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1DciProductAutoCompoundEditStatusPost200Response sapiV1DciProductAutoCompoundEditStatusPost(Long positionId, String autoCompoundPlan, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'positionId' is set
    if (positionId == null) {
      throw new ApiException(400, "Missing the required parameter 'positionId' when calling sapiV1DciProductAutoCompoundEditStatusPost");
    }
    
    // verify the required parameter 'autoCompoundPlan' is set
    if (autoCompoundPlan == null) {
      throw new ApiException(400, "Missing the required parameter 'autoCompoundPlan' when calling sapiV1DciProductAutoCompoundEditStatusPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1DciProductAutoCompoundEditStatusPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1DciProductAutoCompoundEditStatusPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/dci/product/auto_compound/edit-status".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "positionId", positionId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoCompoundPlan", autoCompoundPlan));
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

    GenericType<SapiV1DciProductAutoCompoundEditStatusPost200Response> localVarReturnType = new GenericType<SapiV1DciProductAutoCompoundEditStatusPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Dual Investment product list(USER_DATA)
   * Get Dual Investment product list  Weight(IP): 1
   * @param optionType Input CALL or PUT (required)
   * @param exercisedCoin Target exercised asset, e.g.: if you subscribe to a high sell product (call option), you should input:   - optionType: CALL,   - exercisedCoin: USDT,   - investCoin: BNB;  if you subscribe to a low buy product (put option), you should input:   - optionType: PUT,   - exercisedCoin: BNB,   - investCoin: USDT; (required)
   * @param investCoin Asset used for subscribing, e.g.: if you subscribe to a high sell product (call option), you should input:   - optionType: CALL,   - exercisedCoin: USDT,   - investCoin: BNB;  if you subscribe to a low buy product (put option), you should input:   - optionType: PUT,   - exercisedCoin: BNB,   - investCoin: USDT; (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param pageSize MIN 1, MAX 100; Default 100 (optional)
   * @param pageIndex Page number, default is first page, start form 1 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1DciProductListGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1DciProductListGet200Response sapiV1DciProductListGet(String optionType, String exercisedCoin, String investCoin, Long timestamp, String signature, String pageSize, Integer pageIndex, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'optionType' is set
    if (optionType == null) {
      throw new ApiException(400, "Missing the required parameter 'optionType' when calling sapiV1DciProductListGet");
    }
    
    // verify the required parameter 'exercisedCoin' is set
    if (exercisedCoin == null) {
      throw new ApiException(400, "Missing the required parameter 'exercisedCoin' when calling sapiV1DciProductListGet");
    }
    
    // verify the required parameter 'investCoin' is set
    if (investCoin == null) {
      throw new ApiException(400, "Missing the required parameter 'investCoin' when calling sapiV1DciProductListGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1DciProductListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1DciProductListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/dci/product/list".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "optionType", optionType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "exercisedCoin", exercisedCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "investCoin", investCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
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

    GenericType<SapiV1DciProductListGet200Response> localVarReturnType = new GenericType<SapiV1DciProductListGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Dual Investment positions(USER_DATA)
   * Get Dual Investment positions (batch)  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param status - PENDING: Products are purchasing, will give results later; - PURCHASE_SUCCESS: purchase successfully; - SETTLED: Products are finish settling; - PURCHASE_FAIL: fail to purchase; - REFUNDING: refund ongoing; - REFUND_SUCCESS: refund to spot account successfully; - SETTLING: Products are settling. If don&#39;t fill this field, will response all the position status. (optional)
   * @param pageSize MIN 1, MAX 100; Default 100 (optional)
   * @param pageIndex Page number, default is first page, start form 1 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1DciProductPositionsGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1DciProductPositionsGet200Response sapiV1DciProductPositionsGet(Long timestamp, String signature, String status, String pageSize, Integer pageIndex, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1DciProductPositionsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1DciProductPositionsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/dci/product/positions".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageSize", pageSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", pageIndex));
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

    GenericType<SapiV1DciProductPositionsGet200Response> localVarReturnType = new GenericType<SapiV1DciProductPositionsGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Subscribe Dual Investment products(USER_DATA)
   * Subscribe Dual Investment products  - &#x60;Products are not available.&#x60; means that the APR changes to lower value, or the orders are not available. - &#x60;Failed&#x60; is a system or network errors.  Weight(IP): 1
   * @param id get id from /sapi/v1/dci/product/list (required)
   * @param orderId get orderId from /sapi/v1/dci/product/list (required)
   * @param depositAmount  (required)
   * @param autoCompoundPlan NONE: switch off the plan, STANDARD: standard plan, ADVANCED: advanced plan; (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1DciProductSubscribePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1DciProductSubscribePost200Response sapiV1DciProductSubscribePost(String id, String orderId, Double depositAmount, String autoCompoundPlan, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling sapiV1DciProductSubscribePost");
    }
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling sapiV1DciProductSubscribePost");
    }
    
    // verify the required parameter 'depositAmount' is set
    if (depositAmount == null) {
      throw new ApiException(400, "Missing the required parameter 'depositAmount' when calling sapiV1DciProductSubscribePost");
    }
    
    // verify the required parameter 'autoCompoundPlan' is set
    if (autoCompoundPlan == null) {
      throw new ApiException(400, "Missing the required parameter 'autoCompoundPlan' when calling sapiV1DciProductSubscribePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1DciProductSubscribePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1DciProductSubscribePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/dci/product/subscribe".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "depositAmount", depositAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoCompoundPlan", autoCompoundPlan));
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

    GenericType<SapiV1DciProductSubscribePost200Response> localVarReturnType = new GenericType<SapiV1DciProductSubscribePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
