package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1LoanAdjustLtvPost200Response;
import com.olbaid.binance.service.model.SapiV1LoanBorrowHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanBorrowPost200Response;
import com.olbaid.binance.service.model.SapiV1LoanCollateralDataGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanCustomizeMarginCallPost200Response;
import com.olbaid.binance.service.model.SapiV1LoanIncomeGet200ResponseInner;
import com.olbaid.binance.service.model.SapiV1LoanLoanableDataGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanLtvAdjustmentHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanOngoingOrdersGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanRepayCollateralRateGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanRepayHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanRepayPost200Response;
import com.olbaid.binance.service.model.SapiV2LoanFlexibleAdjustLtvPost200Response;
import com.olbaid.binance.service.model.SapiV2LoanFlexibleBorrowHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV2LoanFlexibleBorrowPost200Response;
import com.olbaid.binance.service.model.SapiV2LoanFlexibleCollateralDataGet200Response;
import com.olbaid.binance.service.model.SapiV2LoanFlexibleLoanableDataGet200Response;
import com.olbaid.binance.service.model.SapiV2LoanFlexibleLtvAdjustmentHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV2LoanFlexibleOngoingOrdersGet200Response;
import com.olbaid.binance.service.model.SapiV2LoanFlexibleRepayHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV2LoanFlexibleRepayPost200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CryptoLoansApi {
  private ApiClient apiClient;

  public CryptoLoansApi() {
    this(Configuration.getDefaultApiClient());
  }

  public CryptoLoansApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Crypto Loan Adjust LTV (TRADE)
   * Weight(UID): 6000
   * @param orderId Order ID (required)
   * @param amount Amount (required)
   * @param direction &#39;ADDITIONAL&#39;, &#39;REDUCED&#39; (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanAdjustLtvPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanAdjustLtvPost200Response sapiV1LoanAdjustLtvPost(Long orderId, Double amount, String direction, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling sapiV1LoanAdjustLtvPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1LoanAdjustLtvPost");
    }
    
    // verify the required parameter 'direction' is set
    if (direction == null) {
      throw new ApiException(400, "Missing the required parameter 'direction' when calling sapiV1LoanAdjustLtvPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanAdjustLtvPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanAdjustLtvPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/adjust/ltv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
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

    GenericType<SapiV1LoanAdjustLtvPost200Response> localVarReturnType = new GenericType<SapiV1LoanAdjustLtvPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Crypto Loans Borrow History (USER_DATA)
   * - If startTime and endTime are not sent, the recent 90-day data will be returned. - The max interval between startTime and endTime is 180 days.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId orderId in POST /sapi/v1/loan/borrow (optional)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit default 10, max 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanBorrowHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanBorrowHistoryGet200Response sapiV1LoanBorrowHistoryGet(Long timestamp, String signature, Long orderId, String loanCoin, String collateralCoin, Long startTime, Long endTime, Integer current, Long limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanBorrowHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanBorrowHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/borrow/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<SapiV1LoanBorrowHistoryGet200Response> localVarReturnType = new GenericType<SapiV1LoanBorrowHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Crypto Loan Borrow (TRADE)
   * Weight(UID): 6000
   * @param loanCoin Coin loaned (required)
   * @param collateralCoin Coin used as collateral (required)
   * @param loanTerm 7/14/30/90/180 days (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanAmount Loan amount (optional)
   * @param collateralAmount  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanBorrowPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanBorrowPost200Response sapiV1LoanBorrowPost(String loanCoin, String collateralCoin, Integer loanTerm, Long timestamp, String signature, Float loanAmount, Float collateralAmount, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loanCoin' is set
    if (loanCoin == null) {
      throw new ApiException(400, "Missing the required parameter 'loanCoin' when calling sapiV1LoanBorrowPost");
    }
    
    // verify the required parameter 'collateralCoin' is set
    if (collateralCoin == null) {
      throw new ApiException(400, "Missing the required parameter 'collateralCoin' when calling sapiV1LoanBorrowPost");
    }
    
    // verify the required parameter 'loanTerm' is set
    if (loanTerm == null) {
      throw new ApiException(400, "Missing the required parameter 'loanTerm' when calling sapiV1LoanBorrowPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanBorrowPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanBorrowPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/borrow".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanAmount", loanAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralAmount", collateralAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanTerm", loanTerm));
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

    GenericType<SapiV1LoanBorrowPost200Response> localVarReturnType = new GenericType<SapiV1LoanBorrowPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Collateral Assets Data (USER_DATA)
   * Get LTV information and collateral limit of collateral assets. The collateral limit is shown in USD value.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param collateralCoin Coin used as collateral (optional)
   * @param vipLevel Defaults to user&#39;s vip level (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanCollateralDataGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanCollateralDataGet200Response sapiV1LoanCollateralDataGet(Long timestamp, String signature, String collateralCoin, Integer vipLevel, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanCollateralDataGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanCollateralDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/collateral/data".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vipLevel", vipLevel));
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

    GenericType<SapiV1LoanCollateralDataGet200Response> localVarReturnType = new GenericType<SapiV1LoanCollateralDataGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Crypto Loan Customize Margin Call (TRADE)
   * Customize margin call for ongoing orders only.  Weight(UID): 6000
   * @param marginCall  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Mandatory when collateralCoin is empty. Send either orderId or collateralCoin, if both parameters are sent, take orderId only. (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanCustomizeMarginCallPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanCustomizeMarginCallPost200Response sapiV1LoanCustomizeMarginCallPost(Float marginCall, Long timestamp, String signature, Long orderId, String collateralCoin, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'marginCall' is set
    if (marginCall == null) {
      throw new ApiException(400, "Missing the required parameter 'marginCall' when calling sapiV1LoanCustomizeMarginCallPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanCustomizeMarginCallPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanCustomizeMarginCallPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/customize/margin_call".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "marginCall", marginCall));
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

    GenericType<SapiV1LoanCustomizeMarginCallPost200Response> localVarReturnType = new GenericType<SapiV1LoanCustomizeMarginCallPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Crypto Loans Income History (USER_DATA)
   * - If startTime and endTime are not sent, the recent 7-day data will be returned. - The max interval between startTime and endTime is 30 days.  Weight(UID): 6000
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param asset  (optional)
   * @param type All types will be returned by default.   * &#x60;borrowIn&#x60;   * &#x60;collateralSpent&#x60;   * &#x60;repayAmount&#x60;   * &#x60;collateralReturn&#x60; - Collateral return after repayment   * &#x60;addCollateral&#x60;   * &#x60;removeCollateral&#x60;   * &#x60;collateralReturnAfterLiquidation&#x60; (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param limit default 20, max 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1LoanIncomeGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1LoanIncomeGet200ResponseInner> sapiV1LoanIncomeGet(Long timestamp, String signature, String asset, String type, Long startTime, Long endTime, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanIncomeGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanIncomeGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/income".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1LoanIncomeGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1LoanIncomeGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Loanable Assets Data (USER_DATA)
   * Get interest rate and borrow limit of loanable assets. The borrow limit is shown in USD value.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param vipLevel Defaults to user&#39;s vip level (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanLoanableDataGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanLoanableDataGet200Response sapiV1LoanLoanableDataGet(Long timestamp, String signature, String loanCoin, Integer vipLevel, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanLoanableDataGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanLoanableDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/loanable/data".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "vipLevel", vipLevel));
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

    GenericType<SapiV1LoanLoanableDataGet200Response> localVarReturnType = new GenericType<SapiV1LoanLoanableDataGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Loan LTV Adjustment History (USER_DATA)
   * If startTime and endTime are not sent, the recent 90-day data will be returned. The max interval between startTime and endTime is 180 days.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order ID (optional)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit default 10, max 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanLtvAdjustmentHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanLtvAdjustmentHistoryGet200Response sapiV1LoanLtvAdjustmentHistoryGet(Long timestamp, String signature, Long orderId, String loanCoin, String collateralCoin, Long startTime, Long endTime, Integer current, Long limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanLtvAdjustmentHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanLtvAdjustmentHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/ltv/adjustment/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<SapiV1LoanLtvAdjustmentHistoryGet200Response> localVarReturnType = new GenericType<SapiV1LoanLtvAdjustmentHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Loan Ongoing Orders (USER_DATA)
   * Weight(IP): 300
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId orderId in POST /sapi/v1/loan/borrow (optional)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param current Current querying page. Start from 1; default:1, max:1000 (optional)
   * @param limit default 10, max 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanOngoingOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanOngoingOrdersGet200Response sapiV1LoanOngoingOrdersGet(Long timestamp, String signature, Long orderId, String loanCoin, String collateralCoin, Integer current, Long limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanOngoingOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanOngoingOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/ongoing/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<SapiV1LoanOngoingOrdersGet200Response> localVarReturnType = new GenericType<SapiV1LoanOngoingOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Check Collateral Repay Rate (USER_DATA)
   * Get the the rate of collateral coin / loan coin when using collateral repay, the rate will be valid within 8 second.  Weight(IP): 6000
   * @param loanCoin Coin loaned (required)
   * @param collateralCoin Coin used as collateral (required)
   * @param repayAmount repay amount of loanCoin (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanRepayCollateralRateGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanRepayCollateralRateGet200Response sapiV1LoanRepayCollateralRateGet(String loanCoin, String collateralCoin, Float repayAmount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loanCoin' is set
    if (loanCoin == null) {
      throw new ApiException(400, "Missing the required parameter 'loanCoin' when calling sapiV1LoanRepayCollateralRateGet");
    }
    
    // verify the required parameter 'collateralCoin' is set
    if (collateralCoin == null) {
      throw new ApiException(400, "Missing the required parameter 'collateralCoin' when calling sapiV1LoanRepayCollateralRateGet");
    }
    
    // verify the required parameter 'repayAmount' is set
    if (repayAmount == null) {
      throw new ApiException(400, "Missing the required parameter 'repayAmount' when calling sapiV1LoanRepayCollateralRateGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanRepayCollateralRateGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanRepayCollateralRateGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/repay/collateral/rate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "repayAmount", repayAmount));
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

    GenericType<SapiV1LoanRepayCollateralRateGet200Response> localVarReturnType = new GenericType<SapiV1LoanRepayCollateralRateGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Loan Repayment History (USER_DATA)
   * If startTime and endTime are not sent, the recent 90-day data will be returned. The max interval between startTime and endTime is 180 days.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order ID (optional)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit default 10, max 100 (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanRepayHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanRepayHistoryGet200Response sapiV1LoanRepayHistoryGet(Long timestamp, String signature, Long orderId, String loanCoin, String collateralCoin, Long startTime, Long endTime, Integer current, Long limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanRepayHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanRepayHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/repay/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<SapiV1LoanRepayHistoryGet200Response> localVarReturnType = new GenericType<SapiV1LoanRepayHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Crypto Loan Repay (TRADE)
   * Weight(UID): 6000
   * @param orderId Order ID (required)
   * @param amount Repayment Amount (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param type Default: 1. 1 for &#39;repay with borrowed coin&#39;; 2 for &#39;repay with collateral&#39;. (optional)
   * @param collateralReturn Default: TRUE. TRUE: Return extra collateral to spot account; FALSE: Keep extra collateral in the order. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanRepayPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanRepayPost200Response sapiV1LoanRepayPost(Long orderId, Double amount, Long timestamp, String signature, Integer type, Boolean collateralReturn, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling sapiV1LoanRepayPost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1LoanRepayPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanRepayPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanRepayPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/repay".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralReturn", collateralReturn));
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

    GenericType<SapiV1LoanRepayPost200Response> localVarReturnType = new GenericType<SapiV1LoanRepayPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Adjust LTV - Flexible Loan Adjust LTV (TRADE)
   * - API Key needs Spot &amp; Margin Trading permission for this endpoint  Weight(UID): 6000
   * @param adjustmentAmount  (required)
   * @param direction  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2LoanFlexibleAdjustLtvPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2LoanFlexibleAdjustLtvPost200Response sapiV2LoanFlexibleAdjustLtvPost(Float adjustmentAmount, String direction, Long timestamp, String signature, String loanCoin, String collateralCoin, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'adjustmentAmount' is set
    if (adjustmentAmount == null) {
      throw new ApiException(400, "Missing the required parameter 'adjustmentAmount' when calling sapiV2LoanFlexibleAdjustLtvPost");
    }
    
    // verify the required parameter 'direction' is set
    if (direction == null) {
      throw new ApiException(400, "Missing the required parameter 'direction' when calling sapiV2LoanFlexibleAdjustLtvPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2LoanFlexibleAdjustLtvPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2LoanFlexibleAdjustLtvPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/loan/flexible/adjust/ltv".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "adjustmentAmount", adjustmentAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "direction", direction));
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

    GenericType<SapiV2LoanFlexibleAdjustLtvPost200Response> localVarReturnType = new GenericType<SapiV2LoanFlexibleAdjustLtvPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Borrow - Get Flexible Loan Borrow History (USER_DATA)
   * - If startTime and endTime are not sent, the recent 90-day data will be returned. - The max interval between startTime and endTime is 180 days.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2LoanFlexibleBorrowHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2LoanFlexibleBorrowHistoryGet200Response sapiV2LoanFlexibleBorrowHistoryGet(Long timestamp, String signature, String loanCoin, String collateralCoin, Long startTime, Long endTime, Integer current, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2LoanFlexibleBorrowHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2LoanFlexibleBorrowHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/loan/flexible/borrow/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<SapiV2LoanFlexibleBorrowHistoryGet200Response> localVarReturnType = new GenericType<SapiV2LoanFlexibleBorrowHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Borrow - Flexible Loan Borrow (TRADE)
   * - Only available for master account  Weight(UID): 6000
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param loanAmount Loan amount (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param collateralAmount  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2LoanFlexibleBorrowPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2LoanFlexibleBorrowPost200Response sapiV2LoanFlexibleBorrowPost(Long timestamp, String signature, String loanCoin, Float loanAmount, String collateralCoin, Float collateralAmount, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2LoanFlexibleBorrowPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2LoanFlexibleBorrowPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/loan/flexible/borrow".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanAmount", loanAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralAmount", collateralAmount));
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

    GenericType<SapiV2LoanFlexibleBorrowPost200Response> localVarReturnType = new GenericType<SapiV2LoanFlexibleBorrowPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Flexible Loan Collateral Assets Data (USER_DATA)
   * Get LTV information and collateral limit of flexible loan&#39;s collateral assets. The collateral limit is shown in USD value.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param collateralCoin Coin used as collateral (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2LoanFlexibleCollateralDataGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2LoanFlexibleCollateralDataGet200Response sapiV2LoanFlexibleCollateralDataGet(Long timestamp, String signature, String collateralCoin, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2LoanFlexibleCollateralDataGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2LoanFlexibleCollateralDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/loan/flexible/collateral/data".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
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

    GenericType<SapiV2LoanFlexibleCollateralDataGet200Response> localVarReturnType = new GenericType<SapiV2LoanFlexibleCollateralDataGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Flexible Loan Assets Data (USER_DATA)
   * Get interest rate and borrow limit of flexible loanable assets. The borrow limit is shown in USD value.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2LoanFlexibleLoanableDataGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2LoanFlexibleLoanableDataGet200Response sapiV2LoanFlexibleLoanableDataGet(Long timestamp, String signature, String loanCoin, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2LoanFlexibleLoanableDataGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2LoanFlexibleLoanableDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/loan/flexible/loanable/data".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
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

    GenericType<SapiV2LoanFlexibleLoanableDataGet200Response> localVarReturnType = new GenericType<SapiV2LoanFlexibleLoanableDataGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Adjust LTV - Get Flexible Loan LTV Adjustment History (USER_DATA)
   * - If startTime and endTime are not sent, the recent 90-day data will be returned. - The max interval between startTime and endTime is 180 days.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2LoanFlexibleLtvAdjustmentHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2LoanFlexibleLtvAdjustmentHistoryGet200Response sapiV2LoanFlexibleLtvAdjustmentHistoryGet(Long timestamp, String signature, String loanCoin, String collateralCoin, Long startTime, Long endTime, Integer current, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2LoanFlexibleLtvAdjustmentHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2LoanFlexibleLtvAdjustmentHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/loan/flexible/ltv/adjustment/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<SapiV2LoanFlexibleLtvAdjustmentHistoryGet200Response> localVarReturnType = new GenericType<SapiV2LoanFlexibleLtvAdjustmentHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Borrow - Get Flexible Loan Ongoing Orders (USER_DATA)
   *  Weight(IP): 300
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2LoanFlexibleOngoingOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2LoanFlexibleOngoingOrdersGet200Response sapiV2LoanFlexibleOngoingOrdersGet(Long timestamp, String signature, String loanCoin, String collateralCoin, Integer current, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2LoanFlexibleOngoingOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2LoanFlexibleOngoingOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/loan/flexible/ongoing/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<SapiV2LoanFlexibleOngoingOrdersGet200Response> localVarReturnType = new GenericType<SapiV2LoanFlexibleOngoingOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Repay - Get Flexible Loan Repayment History (USER_DATA)
   * - If startTime and endTime are not sent, the recent 90-day data will be returned. - The max interval between startTime and endTime is 180 days.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2LoanFlexibleRepayHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2LoanFlexibleRepayHistoryGet200Response sapiV2LoanFlexibleRepayHistoryGet(Long timestamp, String signature, String loanCoin, String collateralCoin, Long startTime, Long endTime, Integer current, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2LoanFlexibleRepayHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2LoanFlexibleRepayHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/loan/flexible/repay/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "current", current));
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

    GenericType<SapiV2LoanFlexibleRepayHistoryGet200Response> localVarReturnType = new GenericType<SapiV2LoanFlexibleRepayHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Repay - Flexible Loan Repay (TRADE)
   * - repayAmount is mandatory even fullRepayment &#x3D; FALSE  Weight(IP): 6000
   * @param repayAmount repay amount of loanCoin (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param collateralReturn Default: TRUE. TRUE: Return extra collateral to earn account; FALSE: Keep extra collateral in the order, and lower LTV. (optional)
   * @param fullRepayment Default: FALSE. TRUE: Full repayment; FALSE: Partial repayment, based on loanAmount (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV2LoanFlexibleRepayPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV2LoanFlexibleRepayPost200Response sapiV2LoanFlexibleRepayPost(Float repayAmount, Long timestamp, String signature, String loanCoin, String collateralCoin, Boolean collateralReturn, Boolean fullRepayment, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'repayAmount' is set
    if (repayAmount == null) {
      throw new ApiException(400, "Missing the required parameter 'repayAmount' when calling sapiV2LoanFlexibleRepayPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV2LoanFlexibleRepayPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV2LoanFlexibleRepayPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v2/loan/flexible/repay".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "repayAmount", repayAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralReturn", collateralReturn));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "fullRepayment", fullRepayment));
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

    GenericType<SapiV2LoanFlexibleRepayPost200Response> localVarReturnType = new GenericType<SapiV2LoanFlexibleRepayPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
