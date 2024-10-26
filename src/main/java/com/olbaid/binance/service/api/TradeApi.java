package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Account;
import com.olbaid.binance.service.model.ApiV3AccountCommissionGet200Response;
import com.olbaid.binance.service.model.ApiV3AllOrderListGet200ResponseInner;
import com.olbaid.binance.service.model.ApiV3MyAllocationsGet200ResponseInner;
import com.olbaid.binance.service.model.ApiV3MyPreventedMatchesGet200ResponseInner;
import com.olbaid.binance.service.model.ApiV3OpenOrderListGet200ResponseInner;
import com.olbaid.binance.service.model.ApiV3OpenOrdersDelete200ResponseInner;
import com.olbaid.binance.service.model.ApiV3OrderCancelReplacePost200Response;
import com.olbaid.binance.service.model.ApiV3OrderDelete200Response;
import com.olbaid.binance.service.model.ApiV3OrderListDelete200Response;
import com.olbaid.binance.service.model.ApiV3OrderListOcoPost200Response;
import com.olbaid.binance.service.model.ApiV3OrderListOtoPost200Response;
import com.olbaid.binance.service.model.ApiV3OrderListOtocoPost200Response;
import com.olbaid.binance.service.model.ApiV3RateLimitOrderGet200ResponseInner;
import com.olbaid.binance.service.model.ApiV3SorOrderPost200Response;
import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.MyTrade;
import com.olbaid.binance.service.model.OcoOrder;
import com.olbaid.binance.service.model.Order;
import com.olbaid.binance.service.model.OrderDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TradeApi {
  private ApiClient apiClient;

  public TradeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TradeApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Query Commission Rates (USER_DATA)
   * Get current account commission rates.  Weight: 20
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @return a {@code ApiV3AccountCommissionGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3AccountCommissionGet200Response apiV3AccountCommissionGet(String symbol, Long timestamp, String signature) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3AccountCommissionGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3AccountCommissionGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3AccountCommissionGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/account/commission".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ApiV3AccountCommissionGet200Response> localVarReturnType = new GenericType<ApiV3AccountCommissionGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Account Information (USER_DATA)
   * Get current account information.  Weight(IP): 20
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code Account}
   * @throws ApiException if fails to make API call
   */
  public Account apiV3AccountGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3AccountGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3AccountGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/account".replaceAll("\\{format\\}","json");

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

    GenericType<Account> localVarReturnType = new GenericType<Account>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query all OCO (USER_DATA)
   * Retrieves all OCO based on provided optional parameters  Weight(IP): 20
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param fromId Trade id to fetch from. Default gets most recent trades. (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<ApiV3AllOrderListGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<ApiV3AllOrderListGet200ResponseInner> apiV3AllOrderListGet(Long timestamp, String signature, Long fromId, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3AllOrderListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3AllOrderListGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/allOrderList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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
   * All Orders (USER_DATA)
   * Get all account orders; active, canceled, or filled..  - If &#x60;orderId&#x60; is set, it will get orders &gt;&#x3D; that &#x60;orderId&#x60;. Otherwise most recent orders are returned. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this time. - If &#x60;startTime&#x60; and/or &#x60;endTime&#x60; provided, &#x60;orderId&#x60; is not required  Weight(IP): 20
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order id (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<OrderDetails>}
   * @throws ApiException if fails to make API call
   */
  public List<OrderDetails> apiV3AllOrdersGet(String symbol, Long timestamp, String signature, Long orderId, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3AllOrdersGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3AllOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3AllOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/allOrders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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

    GenericType<List<OrderDetails>> localVarReturnType = new GenericType<List<OrderDetails>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Allocations (USER_DATA)
   * Retrieves allocations resulting from SOR order placement.  Weight: 20  Supported parameter combinations: Parameters                            Response symbol                                allocations from oldest to newest symbol + startTime                    oldest allocations since startTime symbol + endTime                      newest allocations until endTime symbol + startTime + endTime          allocations within the time range symbol + fromAllocationId            allocations by allocation ID symbol + orderId                      allocations related to an order starting with oldest symbol + orderId + fromAllocationId  allocations related to an order by allocation ID  Note: The time between startTime and endTime can&#39;t be longer than 24 hours.
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param fromAllocationId  (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param orderId Order id (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<ApiV3MyAllocationsGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<ApiV3MyAllocationsGet200ResponseInner> apiV3MyAllocationsGet(String symbol, Long timestamp, String signature, Long startTime, Long endTime, Long fromAllocationId, Integer limit, Long orderId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3MyAllocationsGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3MyAllocationsGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3MyAllocationsGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/myAllocations".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromAllocationId", fromAllocationId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
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

    GenericType<List<ApiV3MyAllocationsGet200ResponseInner>> localVarReturnType = new GenericType<List<ApiV3MyAllocationsGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Prevented Matches
   * Displays the list of orders that were expired because of STP.  For additional information on what a Prevented match is, as well as Self Trade Prevention (STP), please refer to our STP FAQ page.  These are the combinations supported:  * symbol + preventedMatchId * symbol + orderId * symbol + orderId + fromPreventedMatchId (limit will default to 500) * symbol + orderId + fromPreventedMatchId + limit  Weight(IP):  Case                            Weight If symbol is invalid:          2 Querying by preventedMatchId:  2 Querying by orderId:            20
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param preventedMatchId  (optional)
   * @param orderId Order id (optional)
   * @param fromPreventedMatchId  (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<ApiV3MyPreventedMatchesGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<ApiV3MyPreventedMatchesGet200ResponseInner> apiV3MyPreventedMatchesGet(String symbol, Long timestamp, String signature, Long preventedMatchId, Long orderId, Long fromPreventedMatchId, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3MyPreventedMatchesGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3MyPreventedMatchesGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3MyPreventedMatchesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/myPreventedMatches".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "preventedMatchId", preventedMatchId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromPreventedMatchId", fromPreventedMatchId));
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

    GenericType<List<ApiV3MyPreventedMatchesGet200ResponseInner>> localVarReturnType = new GenericType<List<ApiV3MyPreventedMatchesGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Account Trade List (USER_DATA)
   * Get trades for a specific account and symbol.  If &#x60;fromId&#x60; is set, it will get id &gt;&#x3D; that &#x60;fromId&#x60;. Otherwise most recent orders are returned.  The time between startTime and endTime can&#39;t be longer than 24 hours. These are the supported combinations of all parameters:    symbol    symbol + orderId    symbol + startTime    symbol + endTime    symbol + fromId    symbol + startTime + endTime    symbol+ orderId + fromId  Weight(IP): 20
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId This can only be used in combination with symbol. (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param fromId Trade id to fetch from. Default gets most recent trades. (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<MyTrade>}
   * @throws ApiException if fails to make API call
   */
  public List<MyTrade> apiV3MyTradesGet(String symbol, Long timestamp, String signature, Long orderId, Long startTime, Long endTime, Long fromId, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3MyTradesGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3MyTradesGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3MyTradesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/myTrades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
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

    GenericType<List<MyTrade>> localVarReturnType = new GenericType<List<MyTrade>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Open OCO (USER_DATA)
   * Weight(IP): 6
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<ApiV3OpenOrderListGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<ApiV3OpenOrderListGet200ResponseInner> apiV3OpenOrderListGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OpenOrderListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OpenOrderListGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/openOrderList".replaceAll("\\{format\\}","json");

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

    GenericType<List<ApiV3OpenOrderListGet200ResponseInner>> localVarReturnType = new GenericType<List<ApiV3OpenOrderListGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel all Open Orders on a Symbol (TRADE)
   * Cancels all active orders on a symbol. This includes OCO orders.  Weight(IP): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<ApiV3OpenOrdersDelete200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<ApiV3OpenOrdersDelete200ResponseInner> apiV3OpenOrdersDelete(String symbol, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OpenOrdersDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OpenOrdersDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OpenOrdersDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/openOrders".replaceAll("\\{format\\}","json");

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

    GenericType<List<ApiV3OpenOrdersDelete200ResponseInner>> localVarReturnType = new GenericType<List<ApiV3OpenOrdersDelete200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Current Open Orders (USER_DATA)
   * Get all open orders on a symbol. Careful when accessing this with no symbol.  Weight(IP): - &#x60;6&#x60; for a single symbol; - &#x60;80&#x60; when the symbol parameter is omitted;
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<OrderDetails>}
   * @throws ApiException if fails to make API call
   */
  public List<OrderDetails> apiV3OpenOrdersGet(Long timestamp, String signature, String symbol, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OpenOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OpenOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/openOrders".replaceAll("\\{format\\}","json");

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

    GenericType<List<OrderDetails>> localVarReturnType = new GenericType<List<OrderDetails>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel an Existing Order and Send a New Order (Trade)
   * Cancels an existing order and places a new order on the same symbol.  Filters and Order Count are evaluated before the processing of the cancellation and order placement occurs.  A new order that was not attempted (i.e. when newOrderResult: NOT_ATTEMPTED), will still increase the order count by 1.  Weight(IP): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param type Order type (required)
   * @param cancelReplaceMode - &#x60;STOP_ON_FAILURE&#x60; If the cancel request fails, the new order placement will not be attempted. - &#x60;ALLOW_FAILURES&#x60; If new order placement will be attempted even if cancel request fails. (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param cancelRestrictions  (optional)
   * @param timeInForce Order time in force (optional)
   * @param quantity Order quantity (optional)
   * @param quoteOrderQty Quote quantity (optional)
   * @param price Order price (optional)
   * @param cancelNewClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param cancelOrigClientOrderId Either the cancelOrigClientOrderId or cancelOrderId must be provided. If both are provided, cancelOrderId takes precedence. (optional)
   * @param cancelOrderId Either the cancelOrigClientOrderId or cancelOrderId must be provided. If both are provided, cancelOrderId takes precedence. (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param strategyId  (optional)
   * @param strategyType The value cannot be less than 1000000. (optional)
   * @param stopPrice Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. (optional)
   * @param trailingDelta Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. (optional)
   * @param icebergQty Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. (optional)
   * @param newOrderRespType Set the response JSON. MARKET and LIMIT order types default to FULL, all other orders default to ACK. (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code ApiV3OrderCancelReplacePost200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3OrderCancelReplacePost200Response apiV3OrderCancelReplacePost(String symbol, String side, String type, String cancelReplaceMode, Long timestamp, String signature, String cancelRestrictions, String timeInForce, Double quantity, Double quoteOrderQty, Double price, String cancelNewClientOrderId, String cancelOrigClientOrderId, Long cancelOrderId, String newClientOrderId, Long strategyId, Long strategyType, Double stopPrice, Double trailingDelta, Double icebergQty, String newOrderRespType, String selfTradePreventionMode, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OrderCancelReplacePost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling apiV3OrderCancelReplacePost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling apiV3OrderCancelReplacePost");
    }
    
    // verify the required parameter 'cancelReplaceMode' is set
    if (cancelReplaceMode == null) {
      throw new ApiException(400, "Missing the required parameter 'cancelReplaceMode' when calling apiV3OrderCancelReplacePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderCancelReplacePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderCancelReplacePost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/order/cancelReplace".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cancelReplaceMode", cancelReplaceMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cancelRestrictions", cancelRestrictions));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeInForce", timeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quoteOrderQty", quoteOrderQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cancelNewClientOrderId", cancelNewClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cancelOrigClientOrderId", cancelOrigClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cancelOrderId", cancelOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newClientOrderId", newClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyId", strategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyType", strategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopPrice", stopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trailingDelta", trailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "icebergQty", icebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
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

    GenericType<ApiV3OrderCancelReplacePost200Response> localVarReturnType = new GenericType<ApiV3OrderCancelReplacePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel Order (TRADE)
   * Cancel an active order.  Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent.  Weight(IP): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order id (optional)
   * @param origClientOrderId Order id from client (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param cancelRestrictions  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code Order}
   * @throws ApiException if fails to make API call
   */
  public Order apiV3OrderDelete(String symbol, Long timestamp, String signature, Long orderId, String origClientOrderId, String newClientOrderId, String cancelRestrictions, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OrderDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "origClientOrderId", origClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newClientOrderId", newClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "cancelRestrictions", cancelRestrictions));
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

    GenericType<Order> localVarReturnType = new GenericType<Order>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Order (USER_DATA)
   * Check an order&#39;s status.  - Either &#x60;orderId&#x60; or &#x60;origClientOrderId&#x60; must be sent. - For some historical orders &#x60;cummulativeQuoteQty&#x60; will be &lt; 0, meaning the data is not available at this time.  Weight(IP): 4
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order id (optional)
   * @param origClientOrderId Order id from client (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code OrderDetails}
   * @throws ApiException if fails to make API call
   */
  public OrderDetails apiV3OrderGet(String symbol, Long timestamp, String signature, Long orderId, String origClientOrderId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OrderGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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

    GenericType<OrderDetails> localVarReturnType = new GenericType<OrderDetails>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel OCO (TRADE)
   * Cancel an entire Order List  Canceling an individual leg will cancel the entire OCO  Weight(IP): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderListId Order list id (optional)
   * @param listClientOrderId A unique Id for the entire orderList (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code OcoOrder}
   * @throws ApiException if fails to make API call
   */
  public OcoOrder apiV3OrderListDelete(String symbol, Long timestamp, String signature, Long orderListId, String listClientOrderId, String newClientOrderId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OrderListDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderListDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderListDelete");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/orderList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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

    GenericType<OcoOrder> localVarReturnType = new GenericType<OcoOrder>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query OCO (USER_DATA)
   * Retrieves a specific OCO based on provided optional parameters  Weight(IP): 4
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderListId Order list id (optional)
   * @param origClientOrderId Order id from client (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code ApiV3OrderListDelete200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3OrderListDelete200Response apiV3OrderListGet(Long timestamp, String signature, Long orderListId, String origClientOrderId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderListGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderListGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/orderList".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<ApiV3OrderListDelete200Response> localVarReturnType = new GenericType<ApiV3OrderListDelete200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * New Order list - OCO (TRADE)
   * Send in an one-cancels-the-other (OCO) pair, where activation of one order immediately cancels the other.  - An &#x60;OCO&#x60; has 2 orders called the above order and below order. - One of the orders must be a &#x60;LIMIT_MAKER&#x60; order and the other must be &#x60;STOP_LOSS&#x60; or&#x60;STOP_LOSS_LIMIT&#x60; order. - Price restrictions:     - If the &#x60;OCO&#x60; is on the &#x60;SELL&#x60; side: &#x60;LIMIT_MAKER&#x60; price &gt; Last Traded Price &gt; stopPrice     - If the &#x60;OCO&#x60; is on the &#x60;BUY&#x60; side: &#x60;LIMIT_MAKER&#x60; price &lt; Last Traded Price &lt; stopPrice - OCOs add 2 orders to the unfilled order count, &#x60;EXCHANGE_MAX_ORDERS&#x60; filter, and the &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight(IP): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param quantity  (required)
   * @param aboveType Supported values : &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;STOP_LOSS&#x60;, &#x60;LIMIT_MAKER&#x60; (required)
   * @param belowType Supported values : &#x60;STOP_LOSS_LIMIT&#x60;, &#x60;STOP_LOSS&#x60;, &#x60;LIMIT_MAKER&#x60; (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param listClientOrderId Arbitrary unique ID among open order lists. Automatically generated if not sent. A new order list with the same &#x60;listClientOrderId&#x60; is accepted only when the previous one is filled or completely expired. &#x60;listClientOrderId&#x60; is distinct from the &#x60;aboveClientOrderId&#x60; and the &#x60;belowCLientOrderId&#x60;. (optional)
   * @param aboveClientOrderId Arbitrary unique ID among open orders for the above order. Automatically generated if not sent (optional)
   * @param aboveIcebergQty Note that this can only be used if &#x60;aboveTimeInForce&#x60; is &#x60;GTC&#x60;. (optional)
   * @param abovePrice  (optional)
   * @param aboveStopPrice Can be used if &#x60;aboveType&#x60; is &#x60;STOP_LOSS&#x60; or &#x60;STOP_LOSS_LIMIT&#x60;. Either &#x60;aboveStopPrice&#x60; or &#x60;aboveTrailingDelta&#x60; or both, must be specified. (optional)
   * @param aboveTrailingDelta  (optional)
   * @param aboveTimeInForce Required if the &#x60;aboveType&#x60; is &#x60;STOP_LOSS_LIMIT&#x60;. (optional)
   * @param aboveStrategyId Arbitrary numeric value identifying the above order within an order strategy. (optional)
   * @param aboveStrategyType Arbitrary numeric value identifying the above order strategy. Values smaller than 1000000 are reserved and cannot be used. (optional)
   * @param belowClientOrderId Arbitrary unique ID among open orders for the below order. Automatically generated if not sent (optional)
   * @param belowIcebergQty Note that this can only be used if &#x60;belowTimeInForce&#x60; is &#x60;GTC&#x60;. (optional)
   * @param belowPrice Can be used if &#x60;belowType&#x60; is &#x60;STOP_LOSS_LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60; to specify the limit price. (optional)
   * @param belowStopPrice Can be used if &#x60;belowType&#x60; is &#x60;STOP_LOSS&#x60; or &#x60;STOP_LOSS_LIMIT&#x60;. Either &#x60;belowStopPrice&#x60; or &#x60;belowTrailingDelta&#x60; or both, must be specified. (optional)
   * @param belowTrailingDelta  (optional)
   * @param belowTimeInForce Required if the &#x60;belowType&#x60; is &#x60;STOP_LOSS_LIMIT&#x60;. (optional)
   * @param belowStrategyId Arbitrary numeric value identifying the below order within an order strategy. (optional)
   * @param belowStrategyType Arbitrary numeric value identifying the below order strategy. Values smaller than 1000000 are reserved and cannot be used. (optional)
   * @param newOrderRespType Set the response JSON. MARKET and LIMIT order types default to FULL, all other orders default to ACK. (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code ApiV3OrderListOcoPost200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3OrderListOcoPost200Response apiV3OrderListOcoPost(String symbol, String side, Double quantity, String aboveType, String belowType, Long timestamp, String signature, String listClientOrderId, String aboveClientOrderId, Double aboveIcebergQty, Double abovePrice, Double aboveStopPrice, Double aboveTrailingDelta, String aboveTimeInForce, Double aboveStrategyId, Long aboveStrategyType, String belowClientOrderId, Double belowIcebergQty, Double belowPrice, Double belowStopPrice, Double belowTrailingDelta, String belowTimeInForce, Double belowStrategyId, Long belowStrategyType, String newOrderRespType, String selfTradePreventionMode, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OrderListOcoPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling apiV3OrderListOcoPost");
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == null) {
      throw new ApiException(400, "Missing the required parameter 'quantity' when calling apiV3OrderListOcoPost");
    }
    
    // verify the required parameter 'aboveType' is set
    if (aboveType == null) {
      throw new ApiException(400, "Missing the required parameter 'aboveType' when calling apiV3OrderListOcoPost");
    }
    
    // verify the required parameter 'belowType' is set
    if (belowType == null) {
      throw new ApiException(400, "Missing the required parameter 'belowType' when calling apiV3OrderListOcoPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderListOcoPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderListOcoPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/orderList/oco".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "listClientOrderId", listClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aboveType", aboveType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aboveClientOrderId", aboveClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aboveIcebergQty", aboveIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "abovePrice", abovePrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aboveStopPrice", aboveStopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aboveTrailingDelta", aboveTrailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aboveTimeInForce", aboveTimeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aboveStrategyId", aboveStrategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "aboveStrategyType", aboveStrategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "belowType", belowType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "belowClientOrderId", belowClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "belowIcebergQty", belowIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "belowPrice", belowPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "belowStopPrice", belowStopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "belowTrailingDelta", belowTrailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "belowTimeInForce", belowTimeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "belowStrategyId", belowStrategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "belowStrategyType", belowStrategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
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

    GenericType<ApiV3OrderListOcoPost200Response> localVarReturnType = new GenericType<ApiV3OrderListOcoPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * New Order List - OTO (TRADE)
   * Places an &#x60;OTO&#x60;. - An &#x60;OTO&#x60; (One-Triggers-the-Other) is an order list comprised of 2 orders. - The first order is called the working order and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. - The second order is called the pending order. It can be any order type except for &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending order is only placed on the order book when the working order gets fully filled. - If either the working order or the pending order is cancelled individually, the other order in the order list will also be canceled or expired. - When the order list is placed, if the working order gets immediately fully filled, the placement response will show the working order as &#x60;FILLED&#x60; but the pending order will still appear as &#x60;PENDING_NEW&#x60;. You need to query the status of the pending order again to see its updated status. - OTOs add 2 orders to the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight: 1
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
   * @param listClientOrderId Arbitrary unique ID among open order lists. Automatically generated if not sent. A new order list with the same &#x60;listClientOrderId&#x60; is accepted only when the previous one is filled or completely expired. &#x60;listClientOrderId&#x60; is distinct from the &#x60;workingClientOrderId&#x60; and the &#x60;pendingClientOrderId&#x60;. (optional)
   * @param newOrderRespType Set the response JSON. (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param workingClientOrderId Arbitrary unique ID among open orders for the working order. Automatically generated if not sent. (optional)
   * @param workingTimeInForce GTC, IOC, FOK (optional)
   * @param workingStrategyId Arbitrary numeric value identifying the working order within an order strategy. (optional)
   * @param workingStrategyType Arbitrary numeric value identifying the working order strategy. Values smaller than 1000000 are reserved and cannot be used. (optional)
   * @param pendingClientOrderId Arbitrary unique ID among open orders for the pending order. Automatically generated if not sent. (optional)
   * @param pendingPrice  (optional)
   * @param pendingStopPrice  (optional)
   * @param pendingTrailingDelta  (optional)
   * @param pendingIcebergQty This can only be used if pendingTimeInForce is GTC. (optional)
   * @param pendingTimeInForce GTC, IOC, FOK (optional)
   * @param pendingStrategyId Arbitrary numeric value identifying the pending order within an order strategy. (optional)
   * @param pendingStrategyType Arbitrary numeric value identifying the pending order strategy. Values smaller than 1000000 are reserved and cannot be used. (optional)
   * @return a {@code ApiV3OrderListOtoPost200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3OrderListOtoPost200Response apiV3OrderListOtoPost(String symbol, String workingType, String workingSide, Double workingPrice, Double workingQuantity, Double workingIcebergQty, String pendingType, String pendingSide, Double pendingQuantity, Long timestamp, String signature, String listClientOrderId, String newOrderRespType, String selfTradePreventionMode, String workingClientOrderId, String workingTimeInForce, Double workingStrategyId, Long workingStrategyType, String pendingClientOrderId, Double pendingPrice, Double pendingStopPrice, Double pendingTrailingDelta, Double pendingIcebergQty, String pendingTimeInForce, Double pendingStrategyId, Long pendingStrategyType) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'workingType' is set
    if (workingType == null) {
      throw new ApiException(400, "Missing the required parameter 'workingType' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'workingSide' is set
    if (workingSide == null) {
      throw new ApiException(400, "Missing the required parameter 'workingSide' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'workingPrice' is set
    if (workingPrice == null) {
      throw new ApiException(400, "Missing the required parameter 'workingPrice' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'workingQuantity' is set
    if (workingQuantity == null) {
      throw new ApiException(400, "Missing the required parameter 'workingQuantity' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'workingIcebergQty' is set
    if (workingIcebergQty == null) {
      throw new ApiException(400, "Missing the required parameter 'workingIcebergQty' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'pendingType' is set
    if (pendingType == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingType' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'pendingSide' is set
    if (pendingSide == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingSide' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'pendingQuantity' is set
    if (pendingQuantity == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingQuantity' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderListOtoPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderListOtoPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/orderList/oto".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingStrategyId", workingStrategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingStrategyType", workingStrategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingType", pendingType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingSide", pendingSide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingClientOrderId", pendingClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingPrice", pendingPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingStopPrice", pendingStopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingTrailingDelta", pendingTrailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingQuantity", pendingQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingIcebergQty", pendingIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingTimeInForce", pendingTimeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingStrategyId", pendingStrategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingStrategyType", pendingStrategyType));
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

    GenericType<ApiV3OrderListOtoPost200Response> localVarReturnType = new GenericType<ApiV3OrderListOtoPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * New Order List - OTOCO (TRADE)
   * Place an &#x60;OTOCO&#x60;. - An &#x60;OTOCO&#x60; (One-Triggers-One-Cancels-the-Other) is an order list comprised of 3 orders. - The first order is called the working order and must be &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book.   - The behavior of the working order is the same as the &#x60;OTO&#x60;. - &#x60;OTOCO&#x60; has 2 pending orders (pending above and pending below), forming an &#x60;OCO&#x60; pair. The pending orders are only placed on the order book when the working order gets fully filled.   - The rules of the pending above and pending below follow the same rules as the Order List &#x60;OCO&#x60;. - OTOCOs add 3 orders against the unfilled order count, &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter, and &#x60;MAX_NUM_ORDERS&#x60; filter.  Weight: 1
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
   * @param listClientOrderId Arbitrary unique ID among open order lists. Automatically generated if not sent. A new order list with the same &#x60;listClientOrderId&#x60; is accepted only when the previous one is filled or completely expired. &#x60;listClientOrderId&#x60; is distinct from the &#x60;workingClientOrderId&#x60; and the &#x60;pendingClientOrderId&#x60;. (optional)
   * @param newOrderRespType Set the response JSON. (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param workingClientOrderId Arbitrary unique ID among open orders for the working order. Automatically generated if not sent. (optional)
   * @param workingTimeInForce GTC, IOC, FOK (optional)
   * @param workingStrategyId Arbitrary numeric value identifying the working order within an order strategy. (optional)
   * @param workingStrategyType Arbitrary numeric value identifying the working order strategy. Values smaller than 1000000 are reserved and cannot be used. (optional)
   * @param pendingAboveClientOrderId Arbitrary unique ID among open orders for the pending above order. Automatically generated if not sent. (optional)
   * @param pendingAbovePrice  (optional)
   * @param pendingAboveStopPrice  (optional)
   * @param pendingAboveTrailingDelta  (optional)
   * @param pendingAboveIcebergQty This can only be used if pendingAboveTimeInForce is GTC. (optional)
   * @param pendingAboveTimeInForce  (optional)
   * @param pendingAboveStrategyId Arbitrary numeric value identifying the pending above order within an order strategy. (optional)
   * @param pendingAboveStrategyType Arbitrary numeric value identifying the pending above order strategy. Values smaller than 1000000 are reserved and cannot be used. (optional)
   * @param pendingBelowType Supported values: LIMIT_MAKER, STOP_LOSS, and STOP_LOSS_LIMIT (optional)
   * @param pendingBelowClientOrderId Arbitrary unique ID among open orders for the pending below order. Automatically generated if not sent. (optional)
   * @param pendingBelowPrice  (optional)
   * @param pendingBelowStopPrice  (optional)
   * @param pendingBelowTrailingDelta  (optional)
   * @param pendingBelowIcebergQty This can only be used if pendingBelowTimeInForce is GTC. (optional)
   * @param pendingBelowTimeInForce  (optional)
   * @param pendingBelowStrategyId Arbitrary numeric value identifying the pending below order within an order strategy. (optional)
   * @param pendingBelowStrategyType Arbitrary numeric value identifying the pending below order strategy. Values smaller than 1000000 are reserved and cannot be used. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code ApiV3OrderListOtocoPost200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3OrderListOtocoPost200Response apiV3OrderListOtocoPost(String symbol, String workingType, String workingSide, Double workingPrice, Double workingQuantity, Double workingIcebergQty, String pendingSide, Double pendingQuantity, String pendingAboveType, Long timestamp, String signature, String listClientOrderId, String newOrderRespType, String selfTradePreventionMode, String workingClientOrderId, String workingTimeInForce, Double workingStrategyId, Long workingStrategyType, String pendingAboveClientOrderId, Double pendingAbovePrice, Double pendingAboveStopPrice, Double pendingAboveTrailingDelta, Double pendingAboveIcebergQty, String pendingAboveTimeInForce, Double pendingAboveStrategyId, Long pendingAboveStrategyType, String pendingBelowType, String pendingBelowClientOrderId, Double pendingBelowPrice, Double pendingBelowStopPrice, Double pendingBelowTrailingDelta, Double pendingBelowIcebergQty, String pendingBelowTimeInForce, Double pendingBelowStrategyId, Long pendingBelowStrategyType, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'workingType' is set
    if (workingType == null) {
      throw new ApiException(400, "Missing the required parameter 'workingType' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'workingSide' is set
    if (workingSide == null) {
      throw new ApiException(400, "Missing the required parameter 'workingSide' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'workingPrice' is set
    if (workingPrice == null) {
      throw new ApiException(400, "Missing the required parameter 'workingPrice' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'workingQuantity' is set
    if (workingQuantity == null) {
      throw new ApiException(400, "Missing the required parameter 'workingQuantity' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'workingIcebergQty' is set
    if (workingIcebergQty == null) {
      throw new ApiException(400, "Missing the required parameter 'workingIcebergQty' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'pendingSide' is set
    if (pendingSide == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingSide' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'pendingQuantity' is set
    if (pendingQuantity == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingQuantity' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'pendingAboveType' is set
    if (pendingAboveType == null) {
      throw new ApiException(400, "Missing the required parameter 'pendingAboveType' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderListOtocoPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderListOtocoPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/orderList/otoco".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
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
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingStrategyId", workingStrategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "workingStrategyType", workingStrategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingSide", pendingSide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingQuantity", pendingQuantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveType", pendingAboveType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveClientOrderId", pendingAboveClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAbovePrice", pendingAbovePrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveStopPrice", pendingAboveStopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveTrailingDelta", pendingAboveTrailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveIcebergQty", pendingAboveIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveTimeInForce", pendingAboveTimeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveStrategyId", pendingAboveStrategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingAboveStrategyType", pendingAboveStrategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowType", pendingBelowType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowClientOrderId", pendingBelowClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowPrice", pendingBelowPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowStopPrice", pendingBelowStopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowTrailingDelta", pendingBelowTrailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowIcebergQty", pendingBelowIcebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowTimeInForce", pendingBelowTimeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowStrategyId", pendingBelowStrategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "pendingBelowStrategyType", pendingBelowStrategyType));
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

    GenericType<ApiV3OrderListOtocoPost200Response> localVarReturnType = new GenericType<ApiV3OrderListOtocoPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * New Order (TRADE)
   * Send in a new order.  - &#x60;LIMIT_MAKER&#x60; are &#x60;LIMIT&#x60; orders that will be rejected if they would immediately match and trade as a taker. - &#x60;STOP_LOSS&#x60; and &#x60;TAKE_PROFIT&#x60; will execute a &#x60;MARKET&#x60; order when the &#x60;stopPrice&#x60; is reached. - Any &#x60;LIMIT&#x60; or &#x60;LIMIT_MAKER&#x60; type order can be made an iceberg order by sending an &#x60;icebergQty&#x60;. - Any order with an &#x60;icebergQty&#x60; MUST have &#x60;timeInForce&#x60; set to &#x60;GTC&#x60;. - &#x60;MARKET&#x60; orders using &#x60;quantity&#x60; specifies how much a user wants to buy or sell based on the market price. - &#x60;MARKET&#x60; orders using &#x60;quoteOrderQty&#x60; specifies the amount the user wants to spend (when buying) or receive (when selling) of the quote asset; the correct quantity will be determined based on the market liquidity and &#x60;quoteOrderQty&#x60;. - &#x60;MARKET&#x60; orders using &#x60;quoteOrderQty&#x60; will not break &#x60;LOT_SIZE&#x60; filter rules; the order will execute a quantity that will have the notional value as close as possible to &#x60;quoteOrderQty&#x60;. - same &#x60;newClientOrderId&#x60; can be accepted only when the previous one is filled, otherwise the order will be rejected.  Trigger order price rules against market price for both &#x60;MARKET&#x60; and &#x60;LIMIT&#x60; versions:  - Price above market price: &#x60;STOP_LOSS&#x60; &#x60;BUY&#x60;, &#x60;TAKE_PROFIT&#x60; &#x60;SELL&#x60; - Price below market price: &#x60;STOP_LOSS&#x60; &#x60;SELL&#x60;, &#x60;TAKE_PROFIT&#x60; &#x60;BUY&#x60;   Weight(IP): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param type Order type (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param timeInForce Order time in force (optional)
   * @param quantity Order quantity (optional)
   * @param quoteOrderQty Quote quantity (optional)
   * @param price Order price (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param strategyId  (optional)
   * @param strategyType The value cannot be less than 1000000. (optional)
   * @param stopPrice Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. (optional)
   * @param trailingDelta Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. (optional)
   * @param icebergQty Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. (optional)
   * @param newOrderRespType Set the response JSON. MARKET and LIMIT order types default to FULL, all other orders default to ACK. (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code ApiV3OrderDelete200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3OrderDelete200Response apiV3OrderPost(String symbol, String side, String type, Long timestamp, String signature, String timeInForce, Double quantity, Double quoteOrderQty, Double price, String newClientOrderId, Long strategyId, Long strategyType, Double stopPrice, Double trailingDelta, Double icebergQty, String newOrderRespType, String selfTradePreventionMode, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OrderPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling apiV3OrderPost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling apiV3OrderPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeInForce", timeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quoteOrderQty", quoteOrderQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newClientOrderId", newClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyId", strategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyType", strategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopPrice", stopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trailingDelta", trailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "icebergQty", icebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
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

    GenericType<ApiV3OrderDelete200Response> localVarReturnType = new GenericType<ApiV3OrderDelete200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Test New Order (TRADE)
   * Test new order creation and signature/recvWindow long. Creates and validates a new order but does not send it into the matching engine.  Weight(IP):   - Without computeCommissionRates: &#x60;1&#x60;   - With computeCommissionRates: &#x60;20&#x60;
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param type Order type (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param timeInForce Order time in force (optional)
   * @param quantity Order quantity (optional)
   * @param quoteOrderQty Quote quantity (optional)
   * @param price Order price (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param strategyId  (optional)
   * @param strategyType The value cannot be less than 1000000. (optional)
   * @param stopPrice Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. (optional)
   * @param trailingDelta Used with STOP_LOSS, STOP_LOSS_LIMIT, TAKE_PROFIT, and TAKE_PROFIT_LIMIT orders. (optional)
   * @param icebergQty Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. (optional)
   * @param newOrderRespType Set the response JSON. MARKET and LIMIT order types default to FULL, all other orders default to ACK. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @param computeCommissionRates Default: false (optional)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object apiV3OrderTestPost(String symbol, String side, String type, Long timestamp, String signature, String timeInForce, Double quantity, Double quoteOrderQty, Double price, String newClientOrderId, Long strategyId, Long strategyType, Double stopPrice, Double trailingDelta, Double icebergQty, String newOrderRespType, Long recvWindow, Boolean computeCommissionRates) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3OrderTestPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling apiV3OrderTestPost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling apiV3OrderTestPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3OrderTestPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3OrderTestPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/order/test".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeInForce", timeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quoteOrderQty", quoteOrderQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newClientOrderId", newClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyId", strategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyType", strategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "stopPrice", stopPrice));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trailingDelta", trailingDelta));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "icebergQty", icebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "recvWindow", recvWindow));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "computeCommissionRates", computeCommissionRates));
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
   * Query Current Order Count Usage (TRADE)
   * Displays the user&#39;s current order count usage for all intervals.  Weight(IP): 40
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<ApiV3RateLimitOrderGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<ApiV3RateLimitOrderGet200ResponseInner> apiV3RateLimitOrderGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3RateLimitOrderGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3RateLimitOrderGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/rateLimit/order".replaceAll("\\{format\\}","json");

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

    GenericType<List<ApiV3RateLimitOrderGet200ResponseInner>> localVarReturnType = new GenericType<List<ApiV3RateLimitOrderGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * New order using SOR (TRADE)
   * Weight(IP): 6
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param type Order type (required)
   * @param quantity  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param timeInForce Order time in force (optional)
   * @param price  (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param strategyId  (optional)
   * @param strategyType The value cannot be less than 1000000. (optional)
   * @param icebergQty Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. (optional)
   * @param newOrderRespType Set the response JSON. MARKET and LIMIT order types default to FULL, all other orders default to ACK. (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code ApiV3SorOrderPost200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3SorOrderPost200Response apiV3SorOrderPost(String symbol, String side, String type, Double quantity, Long timestamp, String signature, String timeInForce, Double price, String newClientOrderId, Long strategyId, Long strategyType, Double icebergQty, String newOrderRespType, String selfTradePreventionMode, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3SorOrderPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling apiV3SorOrderPost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling apiV3SorOrderPost");
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == null) {
      throw new ApiException(400, "Missing the required parameter 'quantity' when calling apiV3SorOrderPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3SorOrderPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3SorOrderPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/sor/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeInForce", timeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newClientOrderId", newClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyId", strategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyType", strategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "icebergQty", icebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
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

    GenericType<ApiV3SorOrderPost200Response> localVarReturnType = new GenericType<ApiV3SorOrderPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Test new order using SOR (TRADE)
   * Test new order creation and signature/recvWindow using smart order routing (SOR). Creates and validates a new order but does not send it into the matching engine.  Weight(IP):   - Without computeCommissionRates: &#x60;1&#x60;   - With computeCommissionRates: &#x60;20&#x60;
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param type Order type (required)
   * @param quantity  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param timeInForce Order time in force (optional)
   * @param price  (optional)
   * @param newClientOrderId Used to uniquely identify this cancel. Automatically generated by default (optional)
   * @param strategyId  (optional)
   * @param strategyType The value cannot be less than 1000000. (optional)
   * @param icebergQty Used with LIMIT, STOP_LOSS_LIMIT, and TAKE_PROFIT_LIMIT to create an iceberg order. (optional)
   * @param newOrderRespType Set the response JSON. MARKET and LIMIT order types default to FULL, all other orders default to ACK. (optional)
   * @param selfTradePreventionMode The allowed enums is dependent on what is configured on the symbol. The possible supported values are EXPIRE_TAKER, EXPIRE_MAKER, EXPIRE_BOTH, NONE. (optional)
   * @param computeCommissionRates Default: false (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object apiV3SorOrderTestPost(String symbol, String side, String type, Double quantity, Long timestamp, String signature, String timeInForce, Double price, String newClientOrderId, Long strategyId, Long strategyType, Double icebergQty, String newOrderRespType, String selfTradePreventionMode, Boolean computeCommissionRates, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3SorOrderTestPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling apiV3SorOrderTestPost");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling apiV3SorOrderTestPost");
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == null) {
      throw new ApiException(400, "Missing the required parameter 'quantity' when calling apiV3SorOrderTestPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling apiV3SorOrderTestPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling apiV3SorOrderTestPost");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/sor/order/test".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeInForce", timeInForce));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newClientOrderId", newClientOrderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyId", strategyId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "strategyType", strategyType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "icebergQty", icebergQty));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "newOrderRespType", newOrderRespType));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "selfTradePreventionMode", selfTradePreventionMode));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "computeCommissionRates", computeCommissionRates));
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
}
