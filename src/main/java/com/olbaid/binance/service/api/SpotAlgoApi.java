package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1AlgoSpotHistoricalOrdersGet200Response;
import com.olbaid.binance.service.model.SapiV1AlgoSpotNewOrderTwapPost200Response;
import com.olbaid.binance.service.model.SapiV1AlgoSpotOpenOrdersGet200Response;
import com.olbaid.binance.service.model.SapiV1AlgoSpotOrderDelete200Response;
import com.olbaid.binance.service.model.SapiV1AlgoSpotSubOrdersGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpotAlgoApi {
  private ApiClient apiClient;

  public SpotAlgoApi() {
    this(Configuration.getDefaultApiClient());
  }

  public SpotAlgoApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Query Historical Algo Orders
   * Get all historical SPOT TWAP orders  Weight(IP): 1
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param page Default 1 (optional)
   * @param pageSize MIN 1, MAX 100; Default 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoSpotHistoricalOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoSpotHistoricalOrdersGet200Response sapiV1AlgoSpotHistoricalOrdersGet(String symbol, String side, Long timestamp, String signature, Long startTime, Long endTime, Integer page, String pageSize, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1AlgoSpotHistoricalOrdersGet");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling sapiV1AlgoSpotHistoricalOrdersGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoSpotHistoricalOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoSpotHistoricalOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/spot/historicalOrders".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1AlgoSpotHistoricalOrdersGet200Response> localVarReturnType = new GenericType<SapiV1AlgoSpotHistoricalOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Time-Weighted Average Price (Twap) New Order
   * Place a new spot TWAP order with Algo service.  Weight(UID): 3000
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param side  (required)
   * @param quantity  (required)
   * @param duration  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param clientAlgoId  (optional)
   * @param limitPrice  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoSpotNewOrderTwapPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoSpotNewOrderTwapPost200Response sapiV1AlgoSpotNewOrderTwapPost(String symbol, String side, Double quantity, Integer duration, Long timestamp, String signature, String clientAlgoId, Float limitPrice, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling sapiV1AlgoSpotNewOrderTwapPost");
    }
    
    // verify the required parameter 'side' is set
    if (side == null) {
      throw new ApiException(400, "Missing the required parameter 'side' when calling sapiV1AlgoSpotNewOrderTwapPost");
    }
    
    // verify the required parameter 'quantity' is set
    if (quantity == null) {
      throw new ApiException(400, "Missing the required parameter 'quantity' when calling sapiV1AlgoSpotNewOrderTwapPost");
    }
    
    // verify the required parameter 'duration' is set
    if (duration == null) {
      throw new ApiException(400, "Missing the required parameter 'duration' when calling sapiV1AlgoSpotNewOrderTwapPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoSpotNewOrderTwapPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoSpotNewOrderTwapPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/spot/newOrderTwap".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "side", side));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "quantity", quantity));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "duration", duration));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clientAlgoId", clientAlgoId));
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

    GenericType<SapiV1AlgoSpotNewOrderTwapPost200Response> localVarReturnType = new GenericType<SapiV1AlgoSpotNewOrderTwapPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Current Algo Open Orders
   * Get all open SPOT TWAP orders  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoSpotOpenOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoSpotOpenOrdersGet200Response sapiV1AlgoSpotOpenOrdersGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoSpotOpenOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoSpotOpenOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/spot/openOrders".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1AlgoSpotOpenOrdersGet200Response> localVarReturnType = new GenericType<SapiV1AlgoSpotOpenOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Cancel Algo Order
   * Cancel an open TWAP order  Weight(IP): 1
   * @param algoId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoSpotOrderDelete200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoSpotOrderDelete200Response sapiV1AlgoSpotOrderDelete(Long algoId, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algoId' is set
    if (algoId == null) {
      throw new ApiException(400, "Missing the required parameter 'algoId' when calling sapiV1AlgoSpotOrderDelete");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoSpotOrderDelete");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoSpotOrderDelete");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/spot/order".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1AlgoSpotOrderDelete200Response> localVarReturnType = new GenericType<SapiV1AlgoSpotOrderDelete200Response>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Sub Orders
   * Get respective sub orders for a specified algoId  Weight(IP): 1
   * @param algoId  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param page Default 1 (optional)
   * @param pageSize MIN 1, MAX 100; Default 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1AlgoSpotSubOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1AlgoSpotSubOrdersGet200Response sapiV1AlgoSpotSubOrdersGet(Long algoId, Long timestamp, String signature, Integer page, String pageSize, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'algoId' is set
    if (algoId == null) {
      throw new ApiException(400, "Missing the required parameter 'algoId' when calling sapiV1AlgoSpotSubOrdersGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1AlgoSpotSubOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1AlgoSpotSubOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/algo/spot/subOrders".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1AlgoSpotSubOrdersGet200Response> localVarReturnType = new GenericType<SapiV1AlgoSpotSubOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
