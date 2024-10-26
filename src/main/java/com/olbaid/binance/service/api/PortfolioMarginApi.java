package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1MarginBorrowRepayGet200Response1;
import com.olbaid.binance.service.model.SapiV1PortfolioAccountGet200Response;
import com.olbaid.binance.service.model.SapiV1PortfolioAssetIndexPriceGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1PortfolioAutoCollectionPost200Response;
import com.olbaid.binance.service.model.SapiV1PortfolioCollateralRateGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1PortfolioInterestHistoryGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1PortfolioMarginAssetLeverageGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1PortfolioPmLoanGet200Response;
import com.olbaid.binance.service.model.SapiV1PortfolioRepayFuturesSwitchGet200Response;
import com.olbaid.binance.service.model.SapiV1PortfolioRepayPost200Response;
import com.olbaid.binance.service.model.SapiV2PortfolioCollateralRateGet200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PortfolioMarginApi {
  private ApiClient apiClient;

  public PortfolioMarginApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PortfolioMarginApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Portfolio Margin Account (USER_DATA)
   * Get the account info  &#39;Weight(IP): 1&#39;
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1PortfolioAccountGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1PortfolioAccountGet200Response sapiV1PortfolioAccountGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioAccountGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioAccountGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/account".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1PortfolioAccountGet200Response> localVarReturnType = new GenericType<SapiV1PortfolioAccountGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fund Collection by Asset (USER_DATA)
   * Transfers specific asset from Futures Account to Margin account  Weight(IP): 60
   * @param asset  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1PortfolioAutoCollectionPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1PortfolioAutoCollectionPost200Response sapiV1PortfolioAssetCollectionPost(String asset, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1PortfolioAssetCollectionPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioAssetCollectionPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioAssetCollectionPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/asset-collection".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1PortfolioAutoCollectionPost200Response> localVarReturnType = new GenericType<SapiV1PortfolioAutoCollectionPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Portfolio Margin Asset Index Price (MARKET_DATA)
   * Query Portfolio Margin Asset Index Price  Weight(IP): - 1 if send asset - 50 if not send asset
   * @param asset  (optional)
   * @return a {@code List<SapiV1PortfolioAssetIndexPriceGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1PortfolioAssetIndexPriceGet200ResponseInner> sapiV1PortfolioAssetIndexPriceGet(String asset) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/asset-index-price".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1PortfolioAssetIndexPriceGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1PortfolioAssetIndexPriceGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fund Auto-collection (USER_DATA)
   * Transfers all assets from Futures Account to Margin account  Weight(IP): 1500
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1PortfolioAutoCollectionPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1PortfolioAutoCollectionPost200Response sapiV1PortfolioAutoCollectionPost(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioAutoCollectionPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioAutoCollectionPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/auto-collection".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1PortfolioAutoCollectionPost200Response> localVarReturnType = new GenericType<SapiV1PortfolioAutoCollectionPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * BNB Transfer (USER_DATA)
   * BNB transfer can be between Margin Account and USDM Account  Weight(IP): 1500
   * @param transferSide  (required)
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1MarginBorrowRepayGet200Response1}
   * @throws ApiException if fails to make API call
   */
  public SapiV1MarginBorrowRepayGet200Response1 sapiV1PortfolioBnbTransferPost(String transferSide, Double amount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'transferSide' is set
    if (transferSide == null) {
      throw new ApiException(400, "Missing the required parameter 'transferSide' when calling sapiV1PortfolioBnbTransferPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1PortfolioBnbTransferPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioBnbTransferPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioBnbTransferPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/bnb-transfer".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "transferSide", transferSide));
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

    GenericType<SapiV1MarginBorrowRepayGet200Response1> localVarReturnType = new GenericType<SapiV1MarginBorrowRepayGet200Response1>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Portfolio Margin Collateral Rate (MARKET_DATA)
   * Portfolio Margin Collateral Rate.  Weight(IP): 50
   * @return a {@code List<SapiV1PortfolioCollateralRateGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1PortfolioCollateralRateGet200ResponseInner> sapiV1PortfolioCollateralRateGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/collateralRate".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1PortfolioCollateralRateGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1PortfolioCollateralRateGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Classic Portfolio Margin Negative Balance Interest History (USER_DATA)
   * Query interest history of negative balance for portfolio margin.  Weight(IP): 50
   * @param asset  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param size Default:10 Max:100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1PortfolioInterestHistoryGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1PortfolioInterestHistoryGet200ResponseInner> sapiV1PortfolioInterestHistoryGet(String asset, Long timestamp, String signature, Long startTime, Long endTime, Integer size, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'asset' is set
    if (asset == null) {
      throw new ApiException(400, "Missing the required parameter 'asset' when calling sapiV1PortfolioInterestHistoryGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioInterestHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioInterestHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/interest-history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "asset", asset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
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

    GenericType<List<SapiV1PortfolioInterestHistoryGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1PortfolioInterestHistoryGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Portfolio Margin Asset Leverage (USER_DATA)
   * Weight(IP): 50
   * @return a {@code List<SapiV1PortfolioMarginAssetLeverageGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1PortfolioMarginAssetLeverageGet200ResponseInner> sapiV1PortfolioMarginAssetLeverageGet() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/margin-asset-leverage".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1PortfolioMarginAssetLeverageGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1PortfolioMarginAssetLeverageGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Portfolio Margin Bankruptcy Loan Amount (USER_DATA)
   * Query Portfolio Margin Bankruptcy Loan Amount.  Weight(UID): 500
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1PortfolioPmLoanGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1PortfolioPmLoanGet200Response sapiV1PortfolioPmLoanGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioPmLoanGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioPmLoanGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/pmLoan".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1PortfolioPmLoanGet200Response> localVarReturnType = new GenericType<SapiV1PortfolioPmLoanGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Repay futures Negative Balance (USER_DATA)
   * Repay futures Negative Balance  Weight(IP): 1500
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1PortfolioAutoCollectionPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1PortfolioAutoCollectionPost200Response sapiV1PortfolioRepayFuturesNegativeBalancePost(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioRepayFuturesNegativeBalancePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioRepayFuturesNegativeBalancePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/repay-futures-negative-balance".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1PortfolioAutoCollectionPost200Response> localVarReturnType = new GenericType<SapiV1PortfolioAutoCollectionPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Auto-repay-futures Status (USER_DATA)
   * Query Auto-repay-futures Status  Weight(IP): 30
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1PortfolioRepayFuturesSwitchGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1PortfolioRepayFuturesSwitchGet200Response sapiV1PortfolioRepayFuturesSwitchGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioRepayFuturesSwitchGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioRepayFuturesSwitchGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/repay-futures-switch".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1PortfolioRepayFuturesSwitchGet200Response> localVarReturnType = new GenericType<SapiV1PortfolioRepayFuturesSwitchGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Change Auto-repay-futures Status (USER_DATA)
   * Change Auto-repay-futures Status  Weight(IP): 1500
   * @param autoRepay  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1PortfolioAutoCollectionPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1PortfolioAutoCollectionPost200Response sapiV1PortfolioRepayFuturesSwitchPost(Boolean autoRepay, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'autoRepay' is set
    if (autoRepay == null) {
      throw new ApiException(400, "Missing the required parameter 'autoRepay' when calling sapiV1PortfolioRepayFuturesSwitchPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioRepayFuturesSwitchPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioRepayFuturesSwitchPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/repay-futures-switch".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "autoRepay", autoRepay));
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

    GenericType<SapiV1PortfolioAutoCollectionPost200Response> localVarReturnType = new GenericType<SapiV1PortfolioAutoCollectionPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Portfolio Margin Bankruptcy Loan Repay (USER_DATA)
   * Repay Portfolio Margin Bankruptcy Loan.  Weight(UID): 3000
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param from  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1PortfolioRepayPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1PortfolioRepayPost200Response sapiV1PortfolioRepayPost(Long timestamp, String signature, String from, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1PortfolioRepayPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1PortfolioRepayPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/portfolio/repay".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "from", from));
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

    GenericType<SapiV1PortfolioRepayPost200Response> localVarReturnType = new GenericType<SapiV1PortfolioRepayPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Portfolio Margin Pro Tiered Collateral Rate(USER_DATA)
   * Portfolio Margin PRO Tiered Collateral Rate  Weight(IP): 50
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV2PortfolioCollateralRateGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV2PortfolioCollateralRateGet200ResponseInner> sapiV2PortfolioCollateralRateGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2PortfolioCollateralRateGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2PortfolioCollateralRateGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/portfolio/collateralRate".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV2PortfolioCollateralRateGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV2PortfolioCollateralRateGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
