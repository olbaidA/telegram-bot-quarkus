package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.ApiV3AllOrderListGet200ResponseInner;
import com.olbaid.binance.service.model.BnbBurnStatus;
import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.IsolatedMarginAccountInfo;
import com.olbaid.binance.service.model.MarginOcoOrder;
import com.olbaid.binance.service.model.MarginOrder;
import com.olbaid.binance.service.model.MarginOrderDetail;
import com.olbaid.binance.service.model.MarginTrade;
import com.olbaid.binance.service.model.SapiV1MarginAccountGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginAllAssetsGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginAllPairsGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginAvailableInventoryGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginBorrowRepayGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginBorrowRepayGet200Response1;
import com.olbaid.binance.service.model.SapiV1MarginCapitalFlowGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginCrossMarginCollateralRatioGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginCrossMarginDataGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginDelistScheduleGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginExchangeSmallLiabilityGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginExchangeSmallLiabilityHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginForceLiquidationRecGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginInterestHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginInterestRateHistoryGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginIsolatedAccountDelete200Response;
import com.olbaid.binance.service.model.SapiV1MarginIsolatedAccountLimitGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginIsolatedAllPairsGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginIsolatedMarginDataGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginIsolatedMarginTierGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginLeverageBracketGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginMaxBorrowableGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginMaxLeveragePost200Response;
import com.olbaid.binance.service.model.SapiV1MarginMaxTransferableGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginNextHourlyInterestRateGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginOpenOrderListGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginOpenOrdersDelete200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginOrderDelete200Response;
import com.olbaid.binance.service.model.SapiV1MarginOrderListDelete200Response;
import com.olbaid.binance.service.model.SapiV1MarginOrderOcoPost200Response;
import com.olbaid.binance.service.model.SapiV1MarginOrderOtoPost200Response;
import com.olbaid.binance.service.model.SapiV1MarginOrderOtocoPost200Response;
import com.olbaid.binance.service.model.SapiV1MarginPriceIndexGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginRateLimitOrderGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1MarginTradeCoeffGet200Response;
import com.olbaid.binance.service.model.SapiV1MarginTransferGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarginApi {
  private ApiClient apiClient;

  public MarginApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarginApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get BNB Burn Status(USER_DATA)
   * Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code BnbBurnStatus}
   * @throws ApiException if fails to make API call
   */
  public BnbBurnStatus sapiV1BnbBurnGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1BnbBurnGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1BnbBurnGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/bnbBurn".replaceAll("\\{format\\}","json");

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

    GenericType<BnbBurnStatus> localVarReturnType = new GenericType<BnbBurnStatus>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Toggle BNB Burn On Spot Trade And Margin Interest (USER_DATA)
   * - \&quot;spotBNBBurn\&quot; and \&quot;interestBNBBurn\&quot; should be sent at least one.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param spotBNBBurn Determines whether to use BNB to pay for trading fees on SPOT (optional)
   * @param interestBNBBurn Determines whether to use BNB to pay for margin loan&#39;s interest (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code BnbBurnStatus}
   * @throws ApiException if fails to make API call
   */
  public BnbBurnStatus sapiV1BnbBurnPost(Long timestamp, String signature, String spotBNBBurn, String interestBNBBurn, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1BnbBurnPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1BnbBurnPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/bnbBurn".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "spotBNBBurn", spotBNBBurn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interestBNBBurn", interestBNBBurn));
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

    GenericType<BnbBurnStatus> localVarReturnType = new GenericType<BnbBurnStatus>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Cross Margin Account Details (USER_DATA)
   * Weight(IP): 10
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginAccountGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginAccountGet200Response sapiV1MarginAccountGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginAccountGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginAccountGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/account".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1MarginAccountGet200Response> localVarReturnType = new GenericType<SapiV1MarginAccountGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get All Margin Assets (MARKET_DATA)
   * Weight(IP): 1
   * @param asset  (required)
   * @return a {@code List<SapiV1MarginAllAssetsGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginAllAssetsGet200ResponseInner> sapiV1MarginAllAssetsGet(String asset) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1MarginAllAssetsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/allAssets".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<List<SapiV1MarginAllAssetsGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginAllAssetsGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Margin Account&#39;s all OCO (USER_DATA)
   * Retrieves all OCO for a specific margin account based on provided optional parameters  Weight(IP): 200
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param symbol Mandatory for isolated margin, not supported for cross margin (optional)
   * @param fromId If supplied, neither &#x60;startTime&#x60; or &#x60;endTime&#x60; can be provided (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit Default Value: 500; Max Value: 1000 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<ApiV3AllOrderListGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<ApiV3AllOrderListGet200ResponseInner> sapiV1MarginAllOrderListGet(Long timestamp, String signature, String isIsolated, String symbol, String fromId, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginAllOrderListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginAllOrderListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/allOrderList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromId", fromId));
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

    GenericType<List<ApiV3AllOrderListGet200ResponseInner>> localVarReturnType = new GenericType<List<ApiV3AllOrderListGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Margin Account&#39;s All Orders (USER_DATA)
   * - If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D; that orderId. Otherwise most recent orders are returned. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this time.  Weight(IP): 200  Request Limit: 60 times/min per IP
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param orderId Order id (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<MarginOrderDetail>}
   * @throws ApiException if fails to make API call
   */
  public List<MarginOrderDetail> sapiV1MarginAllOrdersGet(String symbol, Long timestamp, String signature, String isIsolated, Long orderId, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginAllOrdersGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginAllOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginAllOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/allOrders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
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

    GenericType<List<MarginOrderDetail>> localVarReturnType = new GenericType<List<MarginOrderDetail>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get All Cross Margin Pairs (MARKET_DATA)
   * Weight(IP): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @return a {@code List<SapiV1MarginAllPairsGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginAllPairsGet200ResponseInner> sapiV1MarginAllPairsGet(String symbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginAllPairsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/allPairs".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<List<SapiV1MarginAllPairsGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginAllPairsGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Margin Available Inventory (USER_DATA)
   * Margin available Inventory query  Weight(UID): 50
   * @param type  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @return a {@code SapiV1MarginAvailableInventoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginAvailableInventoryGet200Response sapiV1MarginAvailableInventoryGet(String type, Long timestamp, String signature) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1MarginAvailableInventoryGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginAvailableInventoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginAvailableInventoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/available-inventory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
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

    GenericType<SapiV1MarginAvailableInventoryGet200Response> localVarReturnType = new GenericType<SapiV1MarginAvailableInventoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query borrow/repay records in Margin account(USER_DATA)
   * Query borrow/repay records in Margin account  - txId or startTime must be sent. txId takes precedence. Response in descending order - If an asset is sent, data within 30 days before endTime; If an asset is not sent, data within 7 days before endTime - If neither startTime nor endTime is sent, the recent 7-day data will be returned. - startTime set as endTime - 7 days by default, endTime set as current time by default  Weight(IP): 10
   * @param asset  (required)
   * @param type BORROW or REPAY (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isolatedSymbol Isolated symbol (optional)
   * @param txId tranId in POST /sapi/v1/margin/loan (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginBorrowRepayGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginBorrowRepayGet200Response sapiV1MarginBorrowRepayGet(String asset, String type, Long timestamp, String signature, String isolatedSymbol, Long txId, Long startTime, Long endTime, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1MarginBorrowRepayGet");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1MarginBorrowRepayGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginBorrowRepayGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginBorrowRepayGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/borrow-repay".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isolatedSymbol", isolatedSymbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "txId", txId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
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

    GenericType<SapiV1MarginBorrowRepayGet200Response> localVarReturnType = new GenericType<SapiV1MarginBorrowRepayGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin account borrow/repay(MARGIN)
   * Margin account borrow/repay(MARGIN)  Weight(UID): 3000
   * @param asset  (required)
   * @param isIsolated TRUE for isolated margin, FALSE for crossed margin (required)
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param amount  (required)
   * @param type BORROW or REPAY (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginBorrowRepayGet200Response1}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginBorrowRepayGet200Response1 sapiV1MarginBorrowRepayPost(String asset, String isIsolated, String symbol, Double amount, String type, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1MarginBorrowRepayPost");
    }
    
    // verify the required parameter 'isIsolated' is set
    if (isIsolated == null) {
      throw new ApiException(400, "Missing the required parameter 'isIsolated' when calling sapiV1MarginBorrowRepayPost");
    }
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginBorrowRepayPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1MarginBorrowRepayPost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1MarginBorrowRepayPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginBorrowRepayPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginBorrowRepayPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/borrow-repay".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
  /**
   * Get cross or isolated margin capital flow(USER_DATA)
   * Get cross or isolated margin capital flow  Weight(IP): 100
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param symbol Required when querying isolated data (optional)
   * @param type  (optional)
   * @param startTime Only supports querying the data of the last 90 days (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param fromId If fromId is set, the data with id &gt; fromId will be returned. Otherwise the latest data will be returned (optional)
   * @param limit The number of data items returned each time is limited. Default 500; Max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginCapitalFlowGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginCapitalFlowGet200ResponseInner> sapiV1MarginCapitalFlowGet(Long timestamp, String signature, String asset, String symbol, String type, Long startTime, Long endTime, Long fromId, Long limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginCapitalFlowGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginCapitalFlowGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/capital-flow".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromId", fromId));
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

    GenericType<List<SapiV1MarginCapitalFlowGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginCapitalFlowGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cross margin collateral ratio (MARKET_DATA)
   *  Weight(IP): 100
   * @return a {@code List<SapiV1MarginCrossMarginCollateralRatioGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginCrossMarginCollateralRatioGet200ResponseInner> sapiV1MarginCrossMarginCollateralRatioGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/crossMarginCollateralRatio".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1MarginCrossMarginCollateralRatioGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginCrossMarginCollateralRatioGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Cross Margin Fee Data (USER_DATA)
   * Get cross margin fee data collection with any vip level or user&#39;s current specific data as https://www.binance.com/en/margin-fee  Weight(IP): 1 when coin is specified; 5 when the coin parameter is omitted
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param vipLevel Defaults to user&#39;s vip level (optional)
   * @param coin Coin name (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginCrossMarginDataGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginCrossMarginDataGet200ResponseInner> sapiV1MarginCrossMarginDataGet(Long timestamp, String signature, Integer vipLevel, String coin, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginCrossMarginDataGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginCrossMarginDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/crossMarginData".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vipLevel", vipLevel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "coin", coin));
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

    GenericType<List<SapiV1MarginCrossMarginDataGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginCrossMarginDataGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get tokens or symbols delist schedule for cross margin and isolated margin (MARKET_DATA)
   * Get tokens or symbols delist schedule for cross margin and isolated margin  Weight(IP): 100
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginDelistScheduleGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginDelistScheduleGet200ResponseInner> sapiV1MarginDelistScheduleGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginDelistScheduleGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginDelistScheduleGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/delist-schedule".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1MarginDelistScheduleGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginDelistScheduleGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Small Liability Exchange Coin List (USER_DATA)
   * Query the coins which can be small liability exchange  Weight(UID): 100
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginExchangeSmallLiabilityGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginExchangeSmallLiabilityGet200ResponseInner> sapiV1MarginExchangeSmallLiabilityGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginExchangeSmallLiabilityGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginExchangeSmallLiabilityGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/exchange-small-liability".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1MarginExchangeSmallLiabilityGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginExchangeSmallLiabilityGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Small Liability Exchange History (USER_DATA)
   * Get Small liability Exchange History  Weight(UID): 100
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginExchangeSmallLiabilityHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginExchangeSmallLiabilityHistoryGet200Response sapiV1MarginExchangeSmallLiabilityHistoryGet(Long timestamp, String signature, Integer current, Integer size, Long startTime, Long endTime, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginExchangeSmallLiabilityHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginExchangeSmallLiabilityHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/exchange-small-liability-history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
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

    GenericType<SapiV1MarginExchangeSmallLiabilityHistoryGet200Response> localVarReturnType = new GenericType<SapiV1MarginExchangeSmallLiabilityHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Force Liquidation Record (USER_DATA)
   * - Response in descending order  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param isolatedSymbol Isolated symbol (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginForceLiquidationRecGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginForceLiquidationRecGet200Response sapiV1MarginForceLiquidationRecGet(Long timestamp, String signature, Long startTime, Long endTime, String isolatedSymbol, Integer current, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginForceLiquidationRecGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginForceLiquidationRecGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/forceLiquidationRec".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isolatedSymbol", isolatedSymbol));
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

    GenericType<SapiV1MarginForceLiquidationRecGet200Response> localVarReturnType = new GenericType<SapiV1MarginForceLiquidationRecGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Interest History (USER_DATA)
   * - Response in descending order - If &#x60;isolatedSymbol&#x60; is not sent, crossed margin data will be returned - Set &#x60;archived&#x60; to &#x60;true&#x60; to query data from 6 months ago - &#x60;type&#x60; in response has 4 enums:   - &#x60;PERIODIC&#x60; interest charged per hour   - &#x60;ON_BORROW&#x60; first interest charged on borrow   - &#x60;PERIODIC_CONVERTED&#x60; interest charged per hour converted into BNB   - &#x60;ON_BORROW_CONVERTED&#x60; first interest charged on borrow converted into BNB  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param isolatedSymbol Isolated symbol (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param archived Default: false. Set to true for archived data from 6 months ago (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginInterestHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginInterestHistoryGet200Response sapiV1MarginInterestHistoryGet(Long timestamp, String signature, String asset, String isolatedSymbol, Long startTime, Long endTime, Integer current, Integer size, String archived, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginInterestHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginInterestHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/interestHistory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isolatedSymbol", isolatedSymbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "archived", archived));
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

    GenericType<SapiV1MarginInterestHistoryGet200Response> localVarReturnType = new GenericType<SapiV1MarginInterestHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin Interest Rate History (USER_DATA)
   * The max interval between startTime and endTime is 30 days.  Weight(IP): 1
   * @param asset  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param vipLevel Defaults to user&#39;s vip level (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginInterestRateHistoryGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginInterestRateHistoryGet200ResponseInner> sapiV1MarginInterestRateHistoryGet(String asset, Long timestamp, String signature, Integer vipLevel, Long startTime, Long endTime, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1MarginInterestRateHistoryGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginInterestRateHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginInterestRateHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/interestRateHistory".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vipLevel", vipLevel));
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

    GenericType<List<SapiV1MarginInterestRateHistoryGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginInterestRateHistoryGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Disable Isolated Margin Account (TRADE)
   * Disable isolated margin account for a specific symbol. Each trading pair can only be deactivated once every 24 hours .  Weight(UID): 300
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginIsolatedAccountDelete200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginIsolatedAccountDelete200Response sapiV1MarginIsolatedAccountDelete(String symbol, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginIsolatedAccountDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginIsolatedAccountDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginIsolatedAccountDelete");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/isolated/account".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1MarginIsolatedAccountDelete200Response> localVarReturnType = new GenericType<SapiV1MarginIsolatedAccountDelete200Response>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Isolated Margin Account Info (USER_DATA)
   * - If \&quot;symbols\&quot; is not sent, all isolated assets will be returned. - If \&quot;symbols\&quot; is sent, only the isolated assets of the sent symbols will be returned.  Weight(IP): 10
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param symbols Max 5 symbols can be sent; separated by &#39;,&#39; (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code IsolatedMarginAccountInfo}
   * @throws ApiException if fails to make API call
   */
  public IsolatedMarginAccountInfo sapiV1MarginIsolatedAccountGet(Long timestamp, String signature, String symbols, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginIsolatedAccountGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginIsolatedAccountGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/isolated/account".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbols", symbols));
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

    GenericType<IsolatedMarginAccountInfo> localVarReturnType = new GenericType<IsolatedMarginAccountInfo>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Enabled Isolated Margin Account Limit (USER_DATA)
   * Query enabled isolated margin account limit.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginIsolatedAccountLimitGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginIsolatedAccountLimitGet200Response sapiV1MarginIsolatedAccountLimitGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginIsolatedAccountLimitGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginIsolatedAccountLimitGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/isolated/accountLimit".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1MarginIsolatedAccountLimitGet200Response> localVarReturnType = new GenericType<SapiV1MarginIsolatedAccountLimitGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Enable Isolated Margin Account (TRADE)
   * Enable isolated margin account for a specific symbol.  Weight(UID): 300
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginIsolatedAccountDelete200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginIsolatedAccountDelete200Response sapiV1MarginIsolatedAccountPost(String symbol, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginIsolatedAccountPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginIsolatedAccountPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginIsolatedAccountPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/isolated/account".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1MarginIsolatedAccountDelete200Response> localVarReturnType = new GenericType<SapiV1MarginIsolatedAccountDelete200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get All Isolated Margin Symbol(USER_DATA)
   * Weight(IP): 10
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginIsolatedAllPairsGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginIsolatedAllPairsGet200ResponseInner> sapiV1MarginIsolatedAllPairsGet(String symbol, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginIsolatedAllPairsGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginIsolatedAllPairsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginIsolatedAllPairsGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/isolated/allPairs".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1MarginIsolatedAllPairsGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginIsolatedAllPairsGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Isolated Margin Fee Data (USER_DATA)
   * Get isolated margin fee data collection with any vip level or user&#39;s current specific data as https://www.binance.com/en/margin-fee  Weight(IP): 1 when a single is specified; 10 when the symbol parameter is omitted
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param vipLevel Defaults to user&#39;s vip level (optional)
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginIsolatedMarginDataGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginIsolatedMarginDataGet200ResponseInner> sapiV1MarginIsolatedMarginDataGet(Long timestamp, String signature, Integer vipLevel, String symbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginIsolatedMarginDataGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginIsolatedMarginDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/isolatedMarginData".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vipLevel", vipLevel));
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

    GenericType<List<SapiV1MarginIsolatedMarginDataGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginIsolatedMarginDataGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Isolated Margin Tier Data (USER_DATA)
   * Get isolated margin tier data collection with any tier as https://www.binance.com/en/margin-data  Weight(IP): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param tier All margin tier data will be returned if tier is omitted (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginIsolatedMarginTierGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginIsolatedMarginTierGet200ResponseInner> sapiV1MarginIsolatedMarginTierGet(String symbol, Long timestamp, String signature, String tier, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginIsolatedMarginTierGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginIsolatedMarginTierGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginIsolatedMarginTierGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/isolatedMarginTier".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "tier", tier));
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

    GenericType<List<SapiV1MarginIsolatedMarginTierGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginIsolatedMarginTierGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Liability Coin Leverage Bracket in Cross Margin Pro Mode (MARKET_DATA)
   * Liability Coin Leverage Bracket in Cross Margin Pro Mode  Weight(IP): 1
   * @return a {@code List<SapiV1MarginLeverageBracketGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginLeverageBracketGet200ResponseInner> sapiV1MarginLeverageBracketGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/leverageBracket".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1MarginLeverageBracketGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginLeverageBracketGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin manual liquidation(MARGIN)
   * Margin manual liquidation  Weight(UID): 3000
   * @param type  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param symbol  (optional)
   * @return a {@code List<SapiV1MarginExchangeSmallLiabilityGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginExchangeSmallLiabilityGet200ResponseInner> sapiV1MarginManualLiquidationPost(String type, Long timestamp, String signature, String symbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1MarginManualLiquidationPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginManualLiquidationPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginManualLiquidationPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/manual-liquidation".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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

    GenericType<List<SapiV1MarginExchangeSmallLiabilityGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginExchangeSmallLiabilityGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Max Borrow (USER_DATA)
   * - If &#x60;isolatedSymbol&#x60; is not sent, crossed margin data will be sent. - &#x60;borrowLimit&#x60; is also available from https://www.binance.com/en/margin-fee  Weight(IP): 50
   * @param asset  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isolatedSymbol Isolated symbol (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginMaxBorrowableGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginMaxBorrowableGet200Response sapiV1MarginMaxBorrowableGet(String asset, Long timestamp, String signature, String isolatedSymbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1MarginMaxBorrowableGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginMaxBorrowableGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginMaxBorrowableGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/maxBorrowable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isolatedSymbol", isolatedSymbol));
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

    GenericType<SapiV1MarginMaxBorrowableGet200Response> localVarReturnType = new GenericType<SapiV1MarginMaxBorrowableGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Adjust cross margin max leverage (USER_DATA)
   * Adjust cross margin max leverage  Weight(UID): 3000
   * @param maxLeverage Can only adjust 3 or 5 (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginMaxLeveragePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginMaxLeveragePost200Response sapiV1MarginMaxLeveragePost(Integer maxLeverage, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'maxLeverage' is set
    if (maxLeverage == null) {
      throw new ApiException(400, "Missing the required parameter 'maxLeverage' when calling sapiV1MarginMaxLeveragePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginMaxLeveragePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginMaxLeveragePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/max-leverage".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxLeverage", maxLeverage));
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
   * Query Max Transfer-Out Amount (USER_DATA)
   * - If &#x60;isolatedSymbol&#x60; is not sent, crossed margin data will be sent.  Weight(IP): 50
   * @param asset  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isolatedSymbol Isolated symbol (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginMaxTransferableGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginMaxTransferableGet200Response sapiV1MarginMaxTransferableGet(String asset, Long timestamp, String signature, String isolatedSymbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1MarginMaxTransferableGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginMaxTransferableGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginMaxTransferableGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/maxTransferable".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isolatedSymbol", isolatedSymbol));
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

    GenericType<SapiV1MarginMaxTransferableGet200Response> localVarReturnType = new GenericType<SapiV1MarginMaxTransferableGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Margin Account&#39;s Trade List (USER_DATA)
   * - If &#x60;fromId&#x60; is set, it will get orders &gt;&#x3D; that &#x60;fromId&#x60;. Otherwise most recent trades are returned.  Weight(IP): 10
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param fromId Trade id to fetch from. Default gets most recent trades. (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<MarginTrade>}
   * @throws ApiException if fails to make API call
   */
  public List<MarginTrade> sapiV1MarginMyTradesGet(String symbol, Long timestamp, String signature, String isIsolated, Long startTime, Long endTime, Long fromId, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginMyTradesGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginMyTradesGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginMyTradesGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/myTrades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromId", fromId));
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

    GenericType<List<MarginTrade>> localVarReturnType = new GenericType<List<MarginTrade>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get a future hourly interest rate (USER_DATA)
   * Get user the next hourly estimate interest  Weight(UID): 100
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param assets List of assets, separated by commas, up to 20 (optional)
   * @param isIsolated for isolated margin or not, \&quot;TRUE\&quot;, \&quot;FALSE\&quot; (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginNextHourlyInterestRateGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginNextHourlyInterestRateGet200ResponseInner> sapiV1MarginNextHourlyInterestRateGet(Long timestamp, String signature, String assets, String isIsolated, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginNextHourlyInterestRateGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginNextHourlyInterestRateGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/next-hourly-interest-rate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "assets", assets));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
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

    GenericType<List<SapiV1MarginNextHourlyInterestRateGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginNextHourlyInterestRateGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Margin Account&#39;s Open OCO (USER_DATA)
   * Weight(IP): 10
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param symbol Mandatory for isolated margin, not supported for cross margin (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginOpenOrderListGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginOpenOrderListGet200ResponseInner> sapiV1MarginOpenOrderListGet(Long timestamp, String signature, String isIsolated, String symbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOpenOrderListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOpenOrderListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/openOrderList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
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

    GenericType<List<SapiV1MarginOpenOrderListGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginOpenOrderListGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin Account Cancel all Open Orders on a Symbol (TRADE)
   * - Cancels all active orders on a symbol for margin account. - This includes OCO orders.  Weight(IP): 1 
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginOpenOrdersDelete200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginOpenOrdersDelete200ResponseInner> sapiV1MarginOpenOrdersDelete(String symbol, Long timestamp, String signature, String isIsolated, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginOpenOrdersDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOpenOrdersDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOpenOrdersDelete");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/openOrders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
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

    GenericType<List<SapiV1MarginOpenOrdersDelete200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginOpenOrdersDelete200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Margin Account&#39;s Open Orders (USER_DATA)
   * - If the &#x60;symbol&#x60; is not sent, orders for all symbols will be returned in an array. - When all symbols are returned, the number of requests counted against the rate limiter is equal to the number of symbols currently trading on the exchange - If isIsolated &#x3D;\&quot;TRUE\&quot;, symbol must be sent.  Weight(IP): 10
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<MarginOrderDetail>}
   * @throws ApiException if fails to make API call
   */
  public List<MarginOrderDetail> sapiV1MarginOpenOrdersGet(Long timestamp, String signature, String symbol, String isIsolated, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOpenOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOpenOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/openOrders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
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

    GenericType<List<MarginOrderDetail>> localVarReturnType = new GenericType<List<MarginOrderDetail>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin Account Cancel Order (TRADE)
   * Cancel an active order for margin account.  Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent.  Weight(IP): 10
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param orderId Order id (optional)
   * @param origClientOrderId Order id from client (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code MarginOrder}
   * @throws ApiException if fails to make API call
   */
  public MarginOrder sapiV1MarginOrderDelete(String symbol, Long timestamp, String signature, String isIsolated, Long orderId, String origClientOrderId, String newClientOrderId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginOrderDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOrderDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOrderDelete");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "origClientOrderId", origClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newClientOrderId", newClientOrderId));
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

    GenericType<MarginOrder> localVarReturnType = new GenericType<MarginOrder>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Margin Account&#39;s Order (USER_DATA)
   * - Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this time.  Weight(IP): 10
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param orderId Order id (optional)
   * @param origClientOrderId Order id from client (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code MarginOrderDetail}
   * @throws ApiException if fails to make API call
   */
  public MarginOrderDetail sapiV1MarginOrderGet(String symbol, Long timestamp, String signature, String isIsolated, Long orderId, String origClientOrderId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginOrderGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOrderGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOrderGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "origClientOrderId", origClientOrderId));
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

    GenericType<MarginOrderDetail> localVarReturnType = new GenericType<MarginOrderDetail>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin Account Cancel OCO (TRADE)
   * Cancel an entire Order List for a margin account  - Canceling an individual leg will cancel the entire OCO - Either &#x60;orderListId&#x60; or &#x60;listClientOrderId&#x60; must be provided  Weight(UID): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param orderListId Order list id (optional)
   * @param listClientOrderId A unique Id for the entire orderList (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code MarginOcoOrder}
   * @throws ApiException if fails to make API call
   */
  public MarginOcoOrder sapiV1MarginOrderListDelete(String symbol, Long timestamp, String signature, String isIsolated, Long orderListId, String listClientOrderId, String newClientOrderId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginOrderListDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOrderListDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOrderListDelete");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/orderList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderListId", orderListId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "listClientOrderId", listClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newClientOrderId", newClientOrderId));
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

    GenericType<MarginOcoOrder> localVarReturnType = new GenericType<MarginOcoOrder>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Margin Account&#39;s OCO (USER_DATA)
   * Retrieves a specific OCO based on provided optional parameters  - Either &#x60;orderListId&#x60; or &#x60;origClientOrderId&#x60; must be provided  Weight(IP): 10
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param symbol Mandatory for isolated margin, not supported for cross margin (optional)
   * @param orderListId Order list id (optional)
   * @param origClientOrderId Order id from client (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginOrderListDelete200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginOrderListDelete200Response sapiV1MarginOrderListGet(Long timestamp, String signature, String isIsolated, String symbol, Long orderListId, String origClientOrderId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOrderListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOrderListGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/orderList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderListId", orderListId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "origClientOrderId", origClientOrderId));
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

    GenericType<SapiV1MarginOrderListDelete200Response> localVarReturnType = new GenericType<SapiV1MarginOrderListDelete200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin Account New OCO (TRADE)
   * Send in a new OCO for a margin account  - Price Restrictions:   - SELL: Limit Price &gt; Last Price &gt; Stop Price   - BUY: Limit Price &lt; Last Price &lt; Stop Price - Quantity Restrictions:   - Both legs must have the same quantity   - ICEBERG quantities however do not have to be the same. - Order Rate Limit   - OCO counts as 2 orders against the order rate limit.  Weight(UID): 6
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param quantity  (required)
   * @param price Order price (required)
   * @param stopPrice  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param listClientOrderId A unique Id for the entire orderList (optional)
   * @param limitClientOrderId A unique Id for the limit order (optional)
   * @param limitIcebergQty  (optional)
   * @param stopClientOrderId A unique Id for the stop loss/stop loss limit leg (optional)
   * @param stopLimitPrice If provided, stopLimitTimeInForce is required. (optional)
   * @param stopIcebergQty  (optional)
   * @param stopLimitTimeInForce  (optional)
   * @param newOrderRespType Set the response JSON. (optional)
   * @param sideEffectType Default &#x60;NO_SIDE_EFFECT&#x60; (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginOrderOcoPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginOrderOcoPost200Response sapiV1MarginOrderOcoPost(String symbol, String side, Double quantity, Double price, Double stopPrice, Long timestamp, String signature, String isIsolated, String listClientOrderId, String limitClientOrderId, Double limitIcebergQty, String stopClientOrderId, Double stopLimitPrice, Double stopIcebergQty, String stopLimitTimeInForce, String newOrderRespType, String sideEffectType, String selfTradePreventionMode, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginOrderOcoPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling sapiV1MarginOrderOcoPost");
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == null) {
      throw new ApiException(400, "Missing the required parameter 'quantity' when calling sapiV1MarginOrderOcoPost");
    }
    
    // verify the required parameter 'price' is set
    if (price == null) {
      throw new ApiException(400, "Missing the required parameter 'price' when calling sapiV1MarginOrderOcoPost");
    }
    
    // verify the required parameter 'stopPrice' is set
    if (stopPrice == null) {
      throw new ApiException(400, "Missing the required parameter 'stopPrice' when calling sapiV1MarginOrderOcoPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOrderOcoPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOrderOcoPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/order/oco".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "listClientOrderId", listClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitClientOrderId", limitClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitIcebergQty", limitIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopClientOrderId", stopClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopPrice", stopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopLimitPrice", stopLimitPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopIcebergQty", stopIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopLimitTimeInForce", stopLimitTimeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sideEffectType", sideEffectType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "selfTradePreventionMode", selfTradePreventionMode));
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

    GenericType<SapiV1MarginOrderOcoPost200Response> localVarReturnType = new GenericType<SapiV1MarginOrderOcoPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin Account New OTO (TRADE)
   * Post a new &#x60;OTO&#x60; order for margin account: - An &#x60;OTO&#x60; (One-Triggers-the-Other) is an order list comprised of 2 orders - The first order is called the working order and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. - The second order is called the pending order. It can be any order type except for &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending order is only placed on the order book when the working order gets fully filled. - If either the working order or the pending order is cancelled individually, the other order in the order list will also be canceled or expired. - When the order list is placed, if the working order gets immediately fully filled, the placement response will show the working order as &#x60;FILLED&#x60; but the pending order will still appear as &#x60;PENDING_NEW&#x60;. You need to query the status of the pending order again to see its updated status. - OTOs add 2 orders to the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight(UID): 6
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param workingType Supported values: LIMIT,LIMIT_MAKER (required)
   * @param workingSide BUY,SELL (required)
   * @param workingPrice  (required)
   * @param workingQuantity Sets the quantity for the working order. (required)
   * @param workingIcebergQty This can only be used if workingTimeInForce is GTC. (required)
   * @param pendingType Supported values: Order Types Note that MARKET orders using quoteOrderQty are not supported. (required)
   * @param pendingSide BUY,SELL (required)
   * @param pendingQuantity Sets the quantity for the pending order. (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param listClientOrderId Arbitrary unique ID among open order lists. Automatically generated if not sent. A new order list with the same &#x60;listClientOrderId&#x60; is accepted only when the previous one is filled or completely expired. &#x60;listClientOrderId&#x60; is distinct from the &#x60;workingClientOrderId&#x60; and the &#x60;pendingClientOrderId&#x60;. (optional)
   * @param newOrderRespType Set the response JSON. (optional)
   * @param sideEffectType Default &#x60;NO_SIDE_EFFECT&#x60; (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param autoRepayAtCancel Only when MARGIN_BUY order takes effect, true means that the debt generated by the order needs to be repay after the order is cancelled. The default is true (optional)
   * @param workingClientOrderId Arbitrary unique ID among open orders for the working order. Automatically generated if not sent. (optional)
   * @param workingTimeInForce GTC, IOC, FOK (optional)
   * @param pendingClientOrderId Arbitrary unique ID among open orders for the pending order. Automatically generated if not sent. (optional)
   * @param pendingPrice  (optional)
   * @param pendingStopPrice  (optional)
   * @param pendingTrailingDelta  (optional)
   * @param pendingIcebergQty This can only be used if pendingTimeInForce is GTC. (optional)
   * @param pendingTimeInForce GTC, IOC, FOK (optional)
   * @return a {@code SapiV1MarginOrderOtoPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginOrderOtoPost200Response sapiV1MarginOrderOtoPost(String symbol, String workingType, String workingSide, Double workingPrice, Double workingQuantity, Double workingIcebergQty, String pendingType, String pendingSide, Double pendingQuantity, Long timestamp, String signature, String isIsolated, String listClientOrderId, String newOrderRespType, String sideEffectType, String selfTradePreventionMode, Boolean autoRepayAtCancel, String workingClientOrderId, String workingTimeInForce, String pendingClientOrderId, Double pendingPrice, Double pendingStopPrice, Double pendingTrailingDelta, Double pendingIcebergQty, String pendingTimeInForce) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'workingType' is set
    if (workingType == null) {
      throw new ApiException(400, "Missing the required parameter 'workingType' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'workingSide' is set
    if (workingSide == null) {
      throw new ApiException(400, "Missing the required parameter 'workingSide' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'workingPrice' is set
    if (workingPrice == null) {
      throw new ApiException(400, "Missing the required parameter 'workingPrice' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'workingQuantity' is set
    if (workingQuantity == null) {
      throw new ApiException(400, "Missing the required parameter 'workingQuantity' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'workingIcebergQty' is set
    if (workingIcebergQty == null) {
      throw new ApiException(400, "Missing the required parameter 'workingIcebergQty' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'pendingType' is set
    if (pendingType == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingType' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'pendingSide' is set
    if (pendingSide == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingSide' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'pendingQuantity' is set
    if (pendingQuantity == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingQuantity' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOrderOtoPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOrderOtoPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/order/oto".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "listClientOrderId", listClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sideEffectType", sideEffectType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "selfTradePreventionMode", selfTradePreventionMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoRepayAtCancel", autoRepayAtCancel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingType", workingType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingSide", workingSide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingClientOrderId", workingClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingPrice", workingPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingQuantity", workingQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingIcebergQty", workingIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingTimeInForce", workingTimeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingType", pendingType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingSide", pendingSide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingClientOrderId", pendingClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingPrice", pendingPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingStopPrice", pendingStopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingTrailingDelta", pendingTrailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingQuantity", pendingQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingIcebergQty", pendingIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingTimeInForce", pendingTimeInForce));
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

    GenericType<SapiV1MarginOrderOtoPost200Response> localVarReturnType = new GenericType<SapiV1MarginOrderOtoPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin Account New OTOCO (TRADE)
   * Post a new &#x60;OTOCO&#x60; order for margin account: - An &#x60;OTOCO&#x60; (One-Triggers-the-Other-Cancel-the-Other) is an order list comprised of 3 orders - The first order is called the working order and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book.   - The behavior of the working order is the same as the &#x60;OTO&#x60;. - &#x60;OTOCO&#x60; has 2 pending orders (pending above and pending below), forming an &#x60;OCO&#x60; pair. The pending orders are only placed on the order book when the working order gets fully filled.   - The rules of the pending above and pending below follow the same rules as the Order List &#x60;OCO&#x60;. - OTOCOs add 3 orders to the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight(UID): 6
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param workingType Supported values: LIMIT,LIMIT_MAKER (required)
   * @param workingSide BUY,SELL (required)
   * @param workingPrice  (required)
   * @param workingQuantity Sets the quantity for the working order. (required)
   * @param workingIcebergQty This can only be used if workingTimeInForce is GTC. (required)
   * @param pendingSide BUY,SELL (required)
   * @param pendingQuantity Sets the quantity for the pending order. (required)
   * @param pendingAboveType Supported values: LIMIT_MAKER, STOP_LOSS, and STOP_LOSS_LIMIT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param sideEffectType Default &#x60;NO_SIDE_EFFECT&#x60; (optional)
   * @param autoRepayAtCancel Only when MARGIN_BUY order takes effect, true means that the debt generated by the order needs to be repay after the order is cancelled. The default is true (optional)
   * @param listClientOrderId Arbitrary unique ID among open order lists. Automatically generated if not sent. A new order list with the same &#x60;listClientOrderId&#x60; is accepted only when the previous one is filled or completely expired. &#x60;listClientOrderId&#x60; is distinct from the &#x60;workingClientOrderId&#x60; and the &#x60;pendingClientOrderId&#x60;. (optional)
   * @param newOrderRespType Set the response JSON. (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param workingClientOrderId Arbitrary unique ID among open orders for the working order. Automatically generated if not sent. (optional)
   * @param workingTimeInForce GTC, IOC, FOK (optional)
   * @param pendingAboveClientOrderId Arbitrary unique ID among open orders for the pending above order. Automatically generated if not sent. (optional)
   * @param pendingAbovePrice  (optional)
   * @param pendingAboveStopPrice  (optional)
   * @param pendingAboveTrailingDelta  (optional)
   * @param pendingAboveIcebergQty This can only be used if pendingAboveTimeInForce is GTC. (optional)
   * @param pendingAboveTimeInForce  (optional)
   * @param pendingBelowType Supported values: LIMIT_MAKER, STOP_LOSS, and STOP_LOSS_LIMIT (optional)
   * @param pendingBelowClientOrderId Arbitrary unique ID among open orders for the pending below order. Automatically generated if not sent. (optional)
   * @param pendingBelowPrice  (optional)
   * @param pendingBelowStopPrice  (optional)
   * @param pendingBelowTrailingDelta  (optional)
   * @param pendingBelowIcebergQty This can only be used if pendingBelowTimeInForce is GTC. (optional)
   * @param pendingBelowTimeInForce  (optional)
   * @return a {@code SapiV1MarginOrderOtocoPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginOrderOtocoPost200Response sapiV1MarginOrderOtocoPost(String symbol, String workingType, String workingSide, Double workingPrice, Double workingQuantity, Double workingIcebergQty, String pendingSide, Double pendingQuantity, String pendingAboveType, Long timestamp, String signature, String isIsolated, String sideEffectType, Boolean autoRepayAtCancel, String listClientOrderId, String newOrderRespType, String selfTradePreventionMode, String workingClientOrderId, String workingTimeInForce, String pendingAboveClientOrderId, Double pendingAbovePrice, Double pendingAboveStopPrice, Double pendingAboveTrailingDelta, Double pendingAboveIcebergQty, String pendingAboveTimeInForce, String pendingBelowType, String pendingBelowClientOrderId, Double pendingBelowPrice, Double pendingBelowStopPrice, Double pendingBelowTrailingDelta, Double pendingBelowIcebergQty, String pendingBelowTimeInForce) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'workingType' is set
    if (workingType == null) {
      throw new ApiException(400, "Missing the required parameter 'workingType' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'workingSide' is set
    if (workingSide == null) {
      throw new ApiException(400, "Missing the required parameter 'workingSide' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'workingPrice' is set
    if (workingPrice == null) {
      throw new ApiException(400, "Missing the required parameter 'workingPrice' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'workingQuantity' is set
    if (workingQuantity == null) {
      throw new ApiException(400, "Missing the required parameter 'workingQuantity' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'workingIcebergQty' is set
    if (workingIcebergQty == null) {
      throw new ApiException(400, "Missing the required parameter 'workingIcebergQty' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'pendingSide' is set
    if (pendingSide == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingSide' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'pendingQuantity' is set
    if (pendingQuantity == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingQuantity' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'pendingAboveType' is set
    if (pendingAboveType == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingAboveType' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOrderOtocoPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/order/otoco".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sideEffectType", sideEffectType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoRepayAtCancel", autoRepayAtCancel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "listClientOrderId", listClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "selfTradePreventionMode", selfTradePreventionMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingType", workingType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingSide", workingSide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingClientOrderId", workingClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingPrice", workingPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingQuantity", workingQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingIcebergQty", workingIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingTimeInForce", workingTimeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingSide", pendingSide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingQuantity", pendingQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveType", pendingAboveType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveClientOrderId", pendingAboveClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAbovePrice", pendingAbovePrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveStopPrice", pendingAboveStopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveTrailingDelta", pendingAboveTrailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveIcebergQty", pendingAboveIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveTimeInForce", pendingAboveTimeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowType", pendingBelowType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowClientOrderId", pendingBelowClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowPrice", pendingBelowPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowStopPrice", pendingBelowStopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowTrailingDelta", pendingBelowTrailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowIcebergQty", pendingBelowIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowTimeInForce", pendingBelowTimeInForce));
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

    GenericType<SapiV1MarginOrderOtocoPost200Response> localVarReturnType = new GenericType<SapiV1MarginOrderOtocoPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Margin Account New Order (TRADE)
   * Post a new order for margin account.  Weight(UID): 6
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param type Order type (required)
   * @param quantity  (required)
   * @param autoRepayAtCancel  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param quoteOrderQty Quote quantity (optional)
   * @param price Order price (optional)
   * @param stopPrice Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param icebergQty Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. (optional)
   * @param newOrderRespType Set the response JSON. (optional)
   * @param sideEffectType Default &#x60;NO_SIDE_EFFECT&#x60; (optional)
   * @param timeInForce Order time in force (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginOrderDelete200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginOrderDelete200Response sapiV1MarginOrderPost(String symbol, String side, String type, Double quantity, Boolean autoRepayAtCancel, Long timestamp, String signature, String isIsolated, Double quoteOrderQty, Double price, Double stopPrice, String newClientOrderId, Double icebergQty, String newOrderRespType, String sideEffectType, String timeInForce, String selfTradePreventionMode, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginOrderPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling sapiV1MarginOrderPost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling sapiV1MarginOrderPost");
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == null) {
      throw new ApiException(400, "Missing the required parameter 'quantity' when calling sapiV1MarginOrderPost");
    }
    
    // verify the required parameter 'autoRepayAtCancel' is set
    if (autoRepayAtCancel == null) {
      throw new ApiException(400, "Missing the required parameter 'autoRepayAtCancel' when calling sapiV1MarginOrderPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginOrderPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginOrderPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quoteOrderQty", quoteOrderQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopPrice", stopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newClientOrderId", newClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "icebergQty", icebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sideEffectType", sideEffectType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeInForce", timeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoRepayAtCancel", autoRepayAtCancel));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "selfTradePreventionMode", selfTradePreventionMode));
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

    GenericType<SapiV1MarginOrderDelete200Response> localVarReturnType = new GenericType<SapiV1MarginOrderDelete200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Margin PriceIndex (MARKET_DATA)
   * Weight(IP): 10
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @return a {@code SapiV1MarginPriceIndexGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginPriceIndexGet200Response sapiV1MarginPriceIndexGet(String symbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1MarginPriceIndexGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/priceIndex".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

    GenericType<SapiV1MarginPriceIndexGet200Response> localVarReturnType = new GenericType<SapiV1MarginPriceIndexGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Current Margin Order Count Usage (TRADE)
   * Displays the user&#39;s current margin order count usage for all intervals.  Weight(IP): 20
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param isIsolated * &#x60;TRUE&#x60; - For isolated margin * &#x60;FALSE&#x60; - Default, not for isolated margin (optional)
   * @param symbol isolated symbol, mandatory for isolated margin (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1MarginRateLimitOrderGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1MarginRateLimitOrderGet200ResponseInner> sapiV1MarginRateLimitOrderGet(Long timestamp, String signature, String isIsolated, String symbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginRateLimitOrderGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginRateLimitOrderGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/rateLimit/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isIsolated", isIsolated));
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

    GenericType<List<SapiV1MarginRateLimitOrderGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1MarginRateLimitOrderGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Summary of Margin account (USER_DATA)
   * Get personal margin level information  Weight(IP): 10
   * @param email Email Address (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginTradeCoeffGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginTradeCoeffGet200Response sapiV1MarginTradeCoeffGet(String email, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'email' is set
    if (email == null) {
      throw new ApiException(400, "Missing the required parameter 'email' when calling sapiV1MarginTradeCoeffGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginTradeCoeffGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginTradeCoeffGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/tradeCoeff".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1MarginTradeCoeffGet200Response> localVarReturnType = new GenericType<SapiV1MarginTradeCoeffGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Cross Margin Transfer History (USER_DATA)
   * - Response in descending order - Returns data for last 7 days by default - Set &#x60;archived&#x60; to &#x60;true&#x60; to query data from 6 months ago  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param type  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param size Default:10 Max:100 (optional)
   * @param isolatedSymbol Isolated symbol (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginTransferGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginTransferGet200Response sapiV1MarginTransferGet(Long timestamp, String signature, String asset, String type, Long startTime, Long endTime, Integer current, Integer size, String isolatedSymbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1MarginTransferGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1MarginTransferGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/margin/transfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "size", size));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isolatedSymbol", isolatedSymbol));
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

    GenericType<SapiV1MarginTransferGet200Response> localVarReturnType = new GenericType<SapiV1MarginTransferGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
