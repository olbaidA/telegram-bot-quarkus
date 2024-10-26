package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1AlgoFuturesHistoricalOrdersGet200Response;
import com.olbaid.binance.service.model.SapiV1AlgoFuturesNewOrderVpPost200Response;
import com.olbaid.binance.service.model.SapiV1AlgoFuturesOpenOrdersGet200Response;
import com.olbaid.binance.service.model.SapiV1AlgoFuturesOrderDelete200Response;
import com.olbaid.binance.service.model.SapiV1AlgoFuturesSubOrdersGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FuturesAlgoApi {
  private ApiClient apiClient;

  public FuturesAlgoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FuturesAlgoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Query Historical Algo Orders (USER_DATA)
   * - You need to enable Futures Trading Permission for the api key which requests this endpoint. - Base URL: https://api.binance.com  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param side  (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param pageSize MIN 1, MAX 100; Default 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoFuturesHistoricalOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoFuturesHistoricalOrdersGet200Response sapiV1AlgoFuturesHistoricalOrdersGet(Long timestamp, String signature, String symbol, String side, Long startTime, Long endTime, Integer page, String pageSize, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoFuturesHistoricalOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoFuturesHistoricalOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/futures/historicalOrders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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

    GenericType<SapiV1AlgoFuturesHistoricalOrdersGet200Response> localVarReturnType = new GenericType<SapiV1AlgoFuturesHistoricalOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Time-Weighted Average Price(Twap) New Order (TRADE)
   * Send in a Twap new order. Only support on USDâ“ˆ-M Contracts.  You need to enable Futures Trading Permission for the api key which requests this endpoint. Base URL: https://api.binance.com  - Total Algo open orders max allowed: 10 orders. - Leverage of symbols and position mode will be the same as your futures account settings. You can set up through the trading page or fapi. - Receiving \&quot;success\&quot;: true does not mean that your order will be executed. Please use the query order endpoints(GET sapi/v1/algo/futures/openOrders or GET sapi/v1/algo/futures/historicalOrders) to check the order status. For example: Your futures balance is insufficient, or open position with reduce only or position side is inconsistent with your own setting. In these cases you will receive \&quot;success\&quot;: true, but the order status will be expired after we check it. - quantity * 60 / duration should be larger than minQty - duration cannot be less than 5 mins or more than 24 hours. - For delivery contracts, TWAP end time should be one hour earlier than the delivery time of the symbol.  Weight(UID): 3000
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param quantity Quantity of base asset; The notional (quantity * mark price(base asset)) must be more than the equivalent of 10,000 USDT and less than the equivalent of 1,000,000 USDT (required)
   * @param duration Duration for TWAP orders in seconds. [300, 86400];Less than 5min &#x3D;&gt; defaults to 5 min; Greater than 24h &#x3D;&gt; defaults to 24h (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param positionSide Default BOTH for One-way Mode ; LONG or SHORT for Hedge Mode. It must be sent in Hedge Mode. (optional)
   * @param clientAlgoId A unique id among Algo orders (length should be 32 characters)ï¼Œ If it is not sent, we will give default value (optional)
   * @param reduceOnly &#39;true&#39; or &#39;false&#39;. Default &#39;false&#39;; Cannot be sent in Hedge Mode; Cannot be sent when you open a position (optional)
   * @param limitPrice Limit price of the order; If it is not sent, will place order by market price by default (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoFuturesNewOrderVpPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoFuturesNewOrderVpPost200Response sapiV1AlgoFuturesNewOrderTwapPost(String symbol, String side, Double quantity, Long duration, Long timestamp, String signature, String positionSide, String clientAlgoId, Boolean reduceOnly, Double limitPrice, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1AlgoFuturesNewOrderTwapPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling sapiV1AlgoFuturesNewOrderTwapPost");
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == null) {
      throw new ApiException(400, "Missing the required parameter 'quantity' when calling sapiV1AlgoFuturesNewOrderTwapPost");
    }
    
    // verify the required parameter 'duration' is set
    if (duration == null) {
      throw new ApiException(400, "Missing the required parameter 'duration' when calling sapiV1AlgoFuturesNewOrderTwapPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoFuturesNewOrderTwapPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoFuturesNewOrderTwapPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/futures/newOrderTwap".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "positionSide", positionSide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientAlgoId", clientAlgoId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reduceOnly", reduceOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPrice", limitPrice));
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

    GenericType<SapiV1AlgoFuturesNewOrderVpPost200Response> localVarReturnType = new GenericType<SapiV1AlgoFuturesNewOrderVpPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Volume Participation(VP) New Order (TRADE)
   * Send in a VP new order. Only support on USDâ“ˆ-M Contracts.  - You need to enable &#x60;Futures Trading Permission&#x60; for the api key which requests this endpoint. - Base URL: https://api.binance.com  - Total Algo open orders max allowed: 10 orders. - Leverage of symbols and position mode will be the same as your futures account settings. You can set up through the trading page or fapi. - Receiving \&quot;success\&quot;: true does not mean that your order will be executed. Please use the query order endpoints(GET sapi/v1/algo/futures/openOrders or GET sapi/v1/algo/futures/historicalOrders) to check the order status. For example: Your futures balance is insufficient, or open position with reduce only or position side is inconsistent with your own setting. In these cases you will receive \&quot;success\&quot;: true, but the order status will be expired after we check it.  Weight(UID): 3000
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param quantity Quantity of base asset; The notional (quantity * mark price(base asset)) must be more than the equivalent of 10,000 USDT and less than the equivalent of 1,000,000 USDT (required)
   * @param urgency Represent the relative speed of the current execution; ENUM: LOW, MEDIUM, HIGH (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param positionSide Default BOTH for One-way Mode ; LONG or SHORT for Hedge Mode. It must be sent in Hedge Mode. (optional)
   * @param clientAlgoId A unique id among Algo orders (length should be 32 characters)ï¼Œ If it is not sent, we will give default value (optional)
   * @param reduceOnly &#39;true&#39; or &#39;false&#39;. Default &#39;false&#39;; Cannot be sent in Hedge Mode; Cannot be sent when you open a position (optional)
   * @param limitPrice Limit price of the order; If it is not sent, will place order by market price by default (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoFuturesNewOrderVpPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoFuturesNewOrderVpPost200Response sapiV1AlgoFuturesNewOrderVpPost(String symbol, String side, Double quantity, String urgency, Long timestamp, String signature, String positionSide, String clientAlgoId, Boolean reduceOnly, Double limitPrice, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1AlgoFuturesNewOrderVpPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling sapiV1AlgoFuturesNewOrderVpPost");
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == null) {
      throw new ApiException(400, "Missing the required parameter 'quantity' when calling sapiV1AlgoFuturesNewOrderVpPost");
    }
    
    // verify the required parameter 'urgency' is set
    if (urgency == null) {
      throw new ApiException(400, "Missing the required parameter 'urgency' when calling sapiV1AlgoFuturesNewOrderVpPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoFuturesNewOrderVpPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoFuturesNewOrderVpPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/futures/newOrderVp".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "positionSide", positionSide));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "urgency", urgency));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientAlgoId", clientAlgoId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "reduceOnly", reduceOnly));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limitPrice", limitPrice));
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

    GenericType<SapiV1AlgoFuturesNewOrderVpPost200Response> localVarReturnType = new GenericType<SapiV1AlgoFuturesNewOrderVpPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Current Algo Open Orders (USER_DATA)
   * - You need to enable Futures Trading Permission for the api key which requests this endpoint. - Base URL: https://api.binance.com  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoFuturesOpenOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoFuturesOpenOrdersGet200Response sapiV1AlgoFuturesOpenOrdersGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoFuturesOpenOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoFuturesOpenOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/futures/openOrders".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1AlgoFuturesOpenOrdersGet200Response> localVarReturnType = new GenericType<SapiV1AlgoFuturesOpenOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel Algo Order(TRADE)
   * Cancel an active order. - You need to enable Futures Trading Permission for the api key which requests this endpoint. - Base URL: https://api.binance.com  Weight(IP): 1
   * @param algoId Eg. 14511 (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoFuturesOrderDelete200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoFuturesOrderDelete200Response sapiV1AlgoFuturesOrderDelete(Long algoId, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algoId' is set
    if (algoId == null) {
      throw new ApiException(400, "Missing the required parameter 'algoId' when calling sapiV1AlgoFuturesOrderDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoFuturesOrderDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoFuturesOrderDelete");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/futures/order".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algoId", algoId));
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

    GenericType<SapiV1AlgoFuturesOrderDelete200Response> localVarReturnType = new GenericType<SapiV1AlgoFuturesOrderDelete200Response>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Sub Orders (USER_DATA)
   * - You need to enable Futures Trading Permission for the api key which requests this endpoint. - Base URL: https://api.binance.com  Weight(IP): 1
   * @param algoId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param page Default 1 (optional)
   * @param pageSize MIN 1, MAX 100; Default 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoFuturesSubOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoFuturesSubOrdersGet200Response sapiV1AlgoFuturesSubOrdersGet(Long algoId, Long timestamp, String signature, Integer page, String pageSize, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algoId' is set
    if (algoId == null) {
      throw new ApiException(400, "Missing the required parameter 'algoId' when calling sapiV1AlgoFuturesSubOrdersGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoFuturesSubOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoFuturesSubOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/futures/subOrders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "algoId", algoId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));
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

    GenericType<SapiV1AlgoFuturesSubOrdersGet200Response> localVarReturnType = new GenericType<SapiV1AlgoFuturesSubOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
