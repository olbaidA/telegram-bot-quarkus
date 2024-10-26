package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1ConvertAcceptQuotePost200Response;
import com.olbaid.binance.service.model.SapiV1ConvertAssetInfoGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1ConvertExchangeInfoGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1ConvertGetQuotePost200Response;
import com.olbaid.binance.service.model.SapiV1ConvertLimitCancelOrderPost200Response;
import com.olbaid.binance.service.model.SapiV1ConvertLimitPlaceOrderPost200Response;
import com.olbaid.binance.service.model.SapiV1ConvertLimitQueryOpenOrdersGet200Response;
import com.olbaid.binance.service.model.SapiV1ConvertOrderStatusGet200Response;
import com.olbaid.binance.service.model.SapiV1ConvertTradeFlowGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ConvertApi {
  private ApiClient apiClient;

  public ConvertApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ConvertApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Accept Quote (TRADE)
   * Accept the offered quote by quote ID.  Weight(UID): 500
   * @param quoteId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ConvertAcceptQuotePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ConvertAcceptQuotePost200Response sapiV1ConvertAcceptQuotePost(String quoteId, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'quoteId' is set
    if (quoteId == null) {
      throw new ApiException(400, "Missing the required parameter 'quoteId' when calling sapiV1ConvertAcceptQuotePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ConvertAcceptQuotePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ConvertAcceptQuotePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/convert/acceptQuote".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quoteId", quoteId));
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

    GenericType<SapiV1ConvertAcceptQuotePost200Response> localVarReturnType = new GenericType<SapiV1ConvertAcceptQuotePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query order quantity precision per asset (USER_DATA)
   * Query for supported asset precision information  Weight(IP): 100
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1ConvertAssetInfoGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1ConvertAssetInfoGet200ResponseInner> sapiV1ConvertAssetInfoGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ConvertAssetInfoGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ConvertAssetInfoGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/convert/assetInfo".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1ConvertAssetInfoGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1ConvertAssetInfoGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * List All Convert Pairs
   * Query for all convertible token pairs and the tokensâ€™ respective upper/lower limits  Weight(IP): 3000
   * @param fromAsset User spends coin (optional)
   * @param toAsset User receives coin (optional)
   * @return a {@code List<SapiV1ConvertExchangeInfoGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1ConvertExchangeInfoGet200ResponseInner> sapiV1ConvertExchangeInfoGet(String fromAsset, String toAsset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/convert/exchangeInfo".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromAsset", fromAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toAsset", toAsset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<SapiV1ConvertExchangeInfoGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1ConvertExchangeInfoGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Send quote request (USER_DATA)
   * Request a quote for the requested token pairs  Weight(UID): 200
   * @param fromAsset  (required)
   * @param toAsset  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param fromAmount When specified, it is the amount you will be debited after the conversion (optional)
   * @param toAmount When specified, it is the amount you will be debited after the conversion (optional)
   * @param validTime 10s, 30s, 1m, 2m, default 10s (optional)
   * @param walletType SPOT or FUNDING. Default is SPOT (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ConvertGetQuotePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ConvertGetQuotePost200Response sapiV1ConvertGetQuotePost(String fromAsset, String toAsset, Long timestamp, String signature, Float fromAmount, Float toAmount, String validTime, String walletType, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'fromAsset' is set
    if (fromAsset == null) {
      throw new ApiException(400, "Missing the required parameter 'fromAsset' when calling sapiV1ConvertGetQuotePost");
    }
    
    // verify the required parameter 'toAsset' is set
    if (toAsset == null) {
      throw new ApiException(400, "Missing the required parameter 'toAsset' when calling sapiV1ConvertGetQuotePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ConvertGetQuotePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ConvertGetQuotePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/convert/getQuote".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromAsset", fromAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toAsset", toAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromAmount", fromAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "toAmount", toAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "validTime", validTime));
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

    GenericType<SapiV1ConvertGetQuotePost200Response> localVarReturnType = new GenericType<SapiV1ConvertGetQuotePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel limit order (USER_DATA)
   * Enable users to cancel a limit order  Weight(UID): 200
   * @param orderId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ConvertLimitCancelOrderPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ConvertLimitCancelOrderPost200Response sapiV1ConvertLimitCancelOrderPost(Long orderId, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling sapiV1ConvertLimitCancelOrderPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ConvertLimitCancelOrderPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ConvertLimitCancelOrderPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/convert/limit/cancelOrder".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
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

    GenericType<SapiV1ConvertLimitCancelOrderPost200Response> localVarReturnType = new GenericType<SapiV1ConvertLimitCancelOrderPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Place limit order (USER_DATA)
   * Enable users to place a limit order  - baseAsset or quoteAsset can be determined via exchangeInfo endpoint. - Limit price is defined from baseAsset to quoteAsset. - Either baseAmount or quoteAmount is used.  Weight(UID): 500
   * @param baseAsset  (required)
   * @param quoteAsset  (required)
   * @param limitPrice Symbol limit price (from baseAsset to quoteAsset) (required)
   * @param side  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param baseAmount Base asset amount. (One of baseAmount or quoteAmount is required) (optional)
   * @param quoteAmount Quote asset amount. (One of baseAmount or quoteAmount is required) (optional)
   * @param walletType SPOT or FUNDING or SPOT_FUNDING. It is to use which type of assets. Default is SPOT. (optional)
   * @param expiredType 1_D, 3_D, 7_D, 30_D (D means day) (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ConvertLimitPlaceOrderPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ConvertLimitPlaceOrderPost200Response sapiV1ConvertLimitPlaceOrderPost(String baseAsset, String quoteAsset, Double limitPrice, String side, Long timestamp, String signature, Double baseAmount, Double quoteAmount, String walletType, String expiredType, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'baseAsset' is set
    if (baseAsset == null) {
      throw new ApiException(400, "Missing the required parameter 'baseAsset' when calling sapiV1ConvertLimitPlaceOrderPost");
    }
    
    // verify the required parameter 'quoteAsset' is set
    if (quoteAsset == null) {
      throw new ApiException(400, "Missing the required parameter 'quoteAsset' when calling sapiV1ConvertLimitPlaceOrderPost");
    }
    
    // verify the required parameter 'limitPrice' is set
    if (limitPrice == null) {
      throw new ApiException(400, "Missing the required parameter 'limitPrice' when calling sapiV1ConvertLimitPlaceOrderPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling sapiV1ConvertLimitPlaceOrderPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ConvertLimitPlaceOrderPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ConvertLimitPlaceOrderPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/convert/limit/placeOrder".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseAsset", baseAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quoteAsset", quoteAsset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPrice", limitPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseAmount", baseAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quoteAmount", quoteAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "walletType", walletType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expiredType", expiredType));
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

    GenericType<SapiV1ConvertLimitPlaceOrderPost200Response> localVarReturnType = new GenericType<SapiV1ConvertLimitPlaceOrderPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query limit open orders (USER_DATA)
   * Enable users to query for all existing limit orders  Weight(UID): 3000
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ConvertLimitQueryOpenOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ConvertLimitQueryOpenOrdersGet200Response sapiV1ConvertLimitQueryOpenOrdersGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ConvertLimitQueryOpenOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ConvertLimitQueryOpenOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/convert/limit/queryOpenOrders".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1ConvertLimitQueryOpenOrdersGet200Response> localVarReturnType = new GenericType<SapiV1ConvertLimitQueryOpenOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Order status (USER_DATA)
   * Query order status by order ID.  Weight(UID): 100
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId  (optional)
   * @param quoteId  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ConvertOrderStatusGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ConvertOrderStatusGet200Response sapiV1ConvertOrderStatusGet(Long timestamp, String signature, String orderId, String quoteId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ConvertOrderStatusGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ConvertOrderStatusGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/convert/orderStatus".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quoteId", quoteId));
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

    GenericType<SapiV1ConvertOrderStatusGet200Response> localVarReturnType = new GenericType<SapiV1ConvertOrderStatusGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Convert Trade History (USER_DATA)
   * - The max interval between startTime and endTime is 30 days.  Weight(UID): 3000
   * @param startTime UTC timestamp in ms (required)
   * @param endTime UTC timestamp in ms (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param limit default 100, max 1000 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1ConvertTradeFlowGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1ConvertTradeFlowGet200Response sapiV1ConvertTradeFlowGet(Long startTime, Long endTime, Long timestamp, String signature, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'startTime' is set
    if (startTime == null) {
      throw new ApiException(400, "Missing the required parameter 'startTime' when calling sapiV1ConvertTradeFlowGet");
    }
    
    // verify the required parameter 'endTime' is set
    if (endTime == null) {
      throw new ApiException(400, "Missing the required parameter 'endTime' when calling sapiV1ConvertTradeFlowGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1ConvertTradeFlowGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1ConvertTradeFlowGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/convert/tradeFlow".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<SapiV1ConvertTradeFlowGet200Response> localVarReturnType = new GenericType<SapiV1ConvertTradeFlowGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
