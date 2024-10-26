package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.ApiV3AvgPriceGet200Response;
import com.olbaid.binance.service.model.ApiV3DepthGet200Response;
import com.olbaid.binance.service.model.ApiV3ExchangeInfoGet200Response;
import com.olbaid.binance.service.model.ApiV3KlinesGet200ResponseInnerInner;
import com.olbaid.binance.service.model.ApiV3Ticker24hrGet200Response;
import com.olbaid.binance.service.model.ApiV3TickerBookTickerGet200Response;
import com.olbaid.binance.service.model.ApiV3TickerGet200Response;
import com.olbaid.binance.service.model.ApiV3TickerPriceGet200Response;
import com.olbaid.binance.service.model.ApiV3TickerTradingDayGet200Response;
import com.olbaid.binance.service.model.ApiV3TimeGet200Response;
import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.Trade;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MarketApi {
  private ApiClient apiClient;

  public MarketApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MarketApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Current Average Price
   * Current average price for a symbol.  Weight(IP): 2
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @return a {@code ApiV3AvgPriceGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3AvgPriceGet200Response apiV3AvgPriceGet(String symbol) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3AvgPriceGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/avgPrice".replaceAll("\\{format\\}","json");

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

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiV3AvgPriceGet200Response> localVarReturnType = new GenericType<ApiV3AvgPriceGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Order Book
   * | Limit               | Weight(IP)  | |---------------------|-------------| | 1-100               | 5           | | 101-500             | 25          | | 501-1000            | 50          | | 1001-5000           | 250         |
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param limit If limit &gt; 5000, then the response will truncate to 5000 (optional, default to 100)
   * @return a {@code ApiV3DepthGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3DepthGet200Response apiV3DepthGet(String symbol, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3DepthGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/depth".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiV3DepthGet200Response> localVarReturnType = new GenericType<ApiV3DepthGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Exchange Information
   * Current exchange trading rules and symbol information  - If any symbol provided in either symbol or symbols do not exist, the endpoint will throw an error. - All parameters are optional. - permissions can support single or multiple values (e.g. SPOT, [\&quot;MARGIN\&quot;,\&quot;LEVERAGED\&quot;]) - If permissions parameter not provided, the default values will be [\&quot;SPOT\&quot;,\&quot;MARGIN\&quot;,\&quot;LEVERAGED\&quot;].   - To display all permissions you need to specify them explicitly. (e.g. SPOT, MARGIN,...)  Examples of Symbol Permissions Interpretation from the Response: - [[\&quot;A\&quot;,\&quot;B\&quot;]] means you may place an order if your account has either permission \&quot;A\&quot; or permission \&quot;B\&quot;. - [[\&quot;A\&quot;],[\&quot;B\&quot;]] means you can place an order if your account has permission \&quot;A\&quot; and permission \&quot;B\&quot;. - [[\&quot;A\&quot;],[\&quot;B\&quot;,\&quot;C\&quot;]] means you can place an order if your account has permission \&quot;A\&quot; and permission \&quot;B\&quot; or permission \&quot;C\&quot;. (Inclusive or is applied here, not exclusive or, so your account may have both permission \&quot;B\&quot; and permission \&quot;C\&quot;.)  Weight(IP): 10
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param symbols  (optional)
   * @param permissions  (optional)
   * @return a {@code ApiV3ExchangeInfoGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3ExchangeInfoGet200Response apiV3ExchangeInfoGet(String symbol, String symbols, String permissions) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v3/exchangeInfo".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbols", symbols));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "permissions", permissions));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiV3ExchangeInfoGet200Response> localVarReturnType = new GenericType<ApiV3ExchangeInfoGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Old Trade Lookup
   * Get older market trades.  Weight(IP): 10
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param limit Default 500; max 1000. (optional)
   * @param fromId Trade id to fetch from. Default gets most recent trades. (optional)
   * @return a {@code List<Trade>}
   * @throws ApiException if fails to make API call
   */
  public List<Trade> apiV3HistoricalTradesGet(String symbol, Integer limit, Long fromId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3HistoricalTradesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/historicalTrades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fromId", fromId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Trade>> localVarReturnType = new GenericType<List<Trade>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Kline/Candlestick Data
   * Kline/candlestick bars for a symbol. Klines are uniquely identified by their open time.  - If &#x60;startTime&#x60; and &#x60;endTime&#x60; are not sent, the most recent klines are returned.  Weight(IP): 2
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param interval kline intervals (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param timeZone Default: 0 (UTC) (optional)
   * @param limit Default 500; max 1000. (optional)
   * @return a {@code List<List<ApiV3KlinesGet200ResponseInnerInner>>}
   * @throws ApiException if fails to make API call
   */
  public List<List<ApiV3KlinesGet200ResponseInnerInner>> apiV3KlinesGet(String symbol, String interval, Long startTime, Long endTime, String timeZone, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3KlinesGet");
    }
    
    // verify the required parameter 'interval' is set
    if (interval == null) {
      throw new ApiException(400, "Missing the required parameter 'interval' when calling apiV3KlinesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/klines".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeZone", timeZone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<List<ApiV3KlinesGet200ResponseInnerInner>>> localVarReturnType = new GenericType<List<List<ApiV3KlinesGet200ResponseInnerInner>>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Test Connectivity
   * Test connectivity to the Rest API.  Weight(IP): 1
   * @return a {@code Object}
   * @throws ApiException if fails to make API call
   */
  public Object apiV3PingGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v3/ping".replaceAll("\\{format\\}","json");

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

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 24hr Ticker Price Change Statistics
   * 24 hour rolling window price change statistics. Careful when accessing this with no symbol.  - If the symbol is not sent, tickers for all symbols will be returned in an array.  Weight(IP): - &#x60;2&#x60; for a single symbol; - &#x60;80&#x60; when the symbol parameter is omitted;
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param symbols  (optional)
   * @param type Supported values: FULL or MINI. If none provided, the default is FULL (optional)
   * @return a {@code ApiV3Ticker24hrGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3Ticker24hrGet200Response apiV3Ticker24hrGet(String symbol, String symbols, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v3/ticker/24hr".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbols", symbols));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiV3Ticker24hrGet200Response> localVarReturnType = new GenericType<ApiV3Ticker24hrGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Symbol Order Book Ticker
   * Best price/qty on the order book for a symbol or symbols.  - If the symbol is not sent, bookTickers for all symbols will be returned in an array.  Weight(IP): - &#x60;2&#x60; for a single symbol; - &#x60;4&#x60; when the symbol parameter is omitted;
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param symbols  (optional)
   * @return a {@code ApiV3TickerBookTickerGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3TickerBookTickerGet200Response apiV3TickerBookTickerGet(String symbol, String symbols) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v3/ticker/bookTicker".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbols", symbols));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiV3TickerBookTickerGet200Response> localVarReturnType = new GenericType<ApiV3TickerBookTickerGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Rolling window price change statistics
   * The window used to compute statistics is typically slightly wider than requested windowSize.  openTime for /api/v3/ticker always starts on a minute, while the closeTime is the current time of the request. As such, the effective window might be up to 1 minute wider than requested.  E.g. If the closeTime is 1641287867099 (January 04, 2022 09:17:47:099 UTC) , and the windowSize is 1d. the openTime will be: 1641201420000 (January 3, 2022, 09:17:00 UTC)  Weight(IP): 4 for each requested symbol regardless of windowSize.  The weight for this request will cap at 200 once the number of symbols in the request is more than 50.
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param symbols  (optional)
   * @param windowSize Defaults to 1d if no parameter provided. Supported windowSize values: 1m,2m....59m for minutes 1h, 2h....23h - for hours 1d...7d - for days.  Units cannot be combined (e.g. 1d2h is not allowed) (optional)
   * @param type Supported values: FULL or MINI. If none provided, the default is FULL (optional)
   * @return a {@code ApiV3TickerGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3TickerGet200Response apiV3TickerGet(String symbol, String symbols, String windowSize, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v3/ticker".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbols", symbols));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "windowSize", windowSize));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiV3TickerGet200Response> localVarReturnType = new GenericType<ApiV3TickerGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Symbol Price Ticker
   * Latest price for a symbol or symbols.  - If the symbol is not sent, prices for all symbols will be returned in an array.  Weight(IP): - &#x60;2&#x60; for a single symbol; - &#x60;4&#x60; when the symbol parameter is omitted;
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param symbols  (optional)
   * @return a {@code ApiV3TickerPriceGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3TickerPriceGet200Response apiV3TickerPriceGet(String symbol, String symbols) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v3/ticker/price".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbols", symbols));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiV3TickerPriceGet200Response> localVarReturnType = new GenericType<ApiV3TickerPriceGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Trading Day Ticker
   * Price change statistics for a trading day.  Notes: - Supported values for timeZone:   - Hours and minutes (e.g. -1:00, 05:45)   - Only hours (e.g. 0, 8, 4)  Weight: - &#x60;4&#x60; for each requested symbol. - The weight for this request will cap at &#x60;200&#x60; once the number of symbols in the request is more than &#x60;50&#x60;.
   * @param symbol Trading symbol, e.g. BNBUSDT (optional)
   * @param symbols  (optional)
   * @param timeZone Default: 0 (UTC) (optional)
   * @param type Supported values: FULL or MINI. If none provided, the default is FULL (optional)
   * @return a {@code ApiV3TickerTradingDayGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3TickerTradingDayGet200Response apiV3TickerTradingDayGet(String symbol, String symbols, String timeZone, String type) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v3/ticker/tradingDay".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbols", symbols));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeZone", timeZone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<ApiV3TickerTradingDayGet200Response> localVarReturnType = new GenericType<ApiV3TickerTradingDayGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Check Server Time
   * Test connectivity to the Rest API and get the current server time.  Weight(IP): 1
   * @return a {@code ApiV3TimeGet200Response}
   * @throws ApiException if fails to make API call
   */
  public ApiV3TimeGet200Response apiV3TimeGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v3/time".replaceAll("\\{format\\}","json");

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

    GenericType<ApiV3TimeGet200Response> localVarReturnType = new GenericType<ApiV3TimeGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Recent Trades List
   * Get recent trades.  Weight(IP): 10
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param limit Default 500; max 1000. (optional)
   * @return a {@code List<Trade>}
   * @throws ApiException if fails to make API call
   */
  public List<Trade> apiV3TradesGet(String symbol, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3TradesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/trades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<Trade>> localVarReturnType = new GenericType<List<Trade>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * UIKlines
   * The request is similar to klines having the same parameters and response.  uiKlines return modified kline data, optimized for presentation of candlestick charts.  Weight(IP): 2
   * @param symbol Trading symbol, e.g. BNBUSDT (required)
   * @param interval kline intervals (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param timeZone Default: 0 (UTC) (optional)
   * @param limit Default 500; max 1000. (optional)
   * @return a {@code List<List<ApiV3KlinesGet200ResponseInnerInner>>}
   * @throws ApiException if fails to make API call
   */
  public List<List<ApiV3KlinesGet200ResponseInnerInner>> apiV3UiKlinesGet(String symbol, String interval, Long startTime, Long endTime, String timeZone, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'symbol' is set
    if (symbol == null) {
      throw new ApiException(400, "Missing the required parameter 'symbol' when calling apiV3UiKlinesGet");
    }
    
    // verify the required parameter 'interval' is set
    if (interval == null) {
      throw new ApiException(400, "Missing the required parameter 'interval' when calling apiV3UiKlinesGet");
    }
    
    // create path and map variables
    String localVarPath = "/api/v3/uiKlines".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "symbol", symbol));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "interval", interval));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeZone", timeZone));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<List<ApiV3KlinesGet200ResponseInnerInner>>> localVarReturnType = new GenericType<List<List<ApiV3KlinesGet200ResponseInnerInner>>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
