package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1LoanVipBorrowPost200Response;
import com.olbaid.binance.service.model.SapiV1LoanVipCollateralAccountGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanVipCollateralDataGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanVipLoanableDataGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanVipOngoingOrdersGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanVipRenewPost200Response;
import com.olbaid.binance.service.model.SapiV1LoanVipRepayHistoryGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanVipRepayPost200Response;
import com.olbaid.binance.service.model.SapiV1LoanVipRequestDataGet200Response;
import com.olbaid.binance.service.model.SapiV1LoanVipRequestInterestRateGet200ResponseInner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VipLoansApi {
  private ApiClient apiClient;

  public VipLoansApi() {
    this(Configuration.getDefaultApiClient());
  }

  public VipLoansApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * VIP Loan Borrow
   * VIP loan is available for VIP users only.  Weight(UID): 6000
   * @param loanAccountId  (required)
   * @param loanAmount  (required)
   * @param collateralAccountId  (required)
   * @param collateralCoin  (required)
   * @param isFlexibleRate  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param loanTerm  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanVipBorrowPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanVipBorrowPost200Response sapiV1LoanVipBorrowPost(Long loanAccountId, Float loanAmount, String collateralAccountId, String collateralCoin, String isFlexibleRate, Long timestamp, String signature, String loanCoin, Integer loanTerm, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'loanAccountId' is set
    if (loanAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'loanAccountId' when calling sapiV1LoanVipBorrowPost");
    }
    
    // verify the required parameter 'loanAmount' is set
    if (loanAmount == null) {
      throw new ApiException(400, "Missing the required parameter 'loanAmount' when calling sapiV1LoanVipBorrowPost");
    }
    
    // verify the required parameter 'collateralAccountId' is set
    if (collateralAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'collateralAccountId' when calling sapiV1LoanVipBorrowPost");
    }
    
    // verify the required parameter 'collateralCoin' is set
    if (collateralCoin == null) {
      throw new ApiException(400, "Missing the required parameter 'collateralCoin' when calling sapiV1LoanVipBorrowPost");
    }
    
    // verify the required parameter 'isFlexibleRate' is set
    if (isFlexibleRate == null) {
      throw new ApiException(400, "Missing the required parameter 'isFlexibleRate' when calling sapiV1LoanVipBorrowPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipBorrowPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipBorrowPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/borrow".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanAccountId", loanAccountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanAmount", loanAmount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralAccountId", collateralAccountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralCoin", collateralCoin));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "isFlexibleRate", isFlexibleRate));
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

    GenericType<SapiV1LoanVipBorrowPost200Response> localVarReturnType = new GenericType<SapiV1LoanVipBorrowPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Check Locked Value of VIP Collateral Account (USER_DATA)
   * VIP loan is available for VIP users only.  Weight(IP): 6000
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order id (optional)
   * @param collateralAccountId  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanVipCollateralAccountGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanVipCollateralAccountGet200Response sapiV1LoanVipCollateralAccountGet(Long timestamp, String signature, Long orderId, Long collateralAccountId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipCollateralAccountGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipCollateralAccountGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/collateral/account".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralAccountId", collateralAccountId));
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

    GenericType<SapiV1LoanVipCollateralAccountGet200Response> localVarReturnType = new GenericType<SapiV1LoanVipCollateralAccountGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Collateral Asset Data (USER_DATA)
   * Get collateral asset data.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param collateralCoin Coin used as collateral (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanVipCollateralDataGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanVipCollateralDataGet200Response sapiV1LoanVipCollateralDataGet(Long timestamp, String signature, String collateralCoin, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipCollateralDataGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipCollateralDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/collateral/data".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1LoanVipCollateralDataGet200Response> localVarReturnType = new GenericType<SapiV1LoanVipCollateralDataGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Loanable Assets Data
   * Get interest rate and borrow limit of loanable assets. The borrow limit is shown in USD value.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Coin loaned (optional)
   * @param vipLevel Defaults to user&#39;s vip level (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanVipLoanableDataGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanVipLoanableDataGet200Response sapiV1LoanVipLoanableDataGet(Long timestamp, String signature, String loanCoin, Integer vipLevel, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipLoanableDataGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipLoanableDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/loanable/data".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1LoanVipLoanableDataGet200Response> localVarReturnType = new GenericType<SapiV1LoanVipLoanableDataGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get VIP Loan Ongoing Orders (USER_DATA)
   * VIP loan is available for VIP users only.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order id (optional)
   * @param collateralAccountId  (optional)
   * @param loanCoin Coin loaned (optional)
   * @param collateralCoin Coin used as collateral (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit Default 10; max 100. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanVipOngoingOrdersGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanVipOngoingOrdersGet200Response sapiV1LoanVipOngoingOrdersGet(Long timestamp, String signature, Long orderId, Long collateralAccountId, String loanCoin, String collateralCoin, Integer current, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipOngoingOrdersGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipOngoingOrdersGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/ongoing/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "collateralAccountId", collateralAccountId));
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

    GenericType<SapiV1LoanVipOngoingOrdersGet200Response> localVarReturnType = new GenericType<SapiV1LoanVipOngoingOrdersGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * VIP Loan Renew
   * VIP loan is available for VIP users only.  Weight(UID): 6000
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order id (optional)
   * @param loanTerm  (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanVipRenewPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanVipRenewPost200Response sapiV1LoanVipRenewPost(Long timestamp, String signature, Long orderId, Integer loanTerm, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipRenewPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipRenewPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/renew".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
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

    GenericType<SapiV1LoanVipRenewPost200Response> localVarReturnType = new GenericType<SapiV1LoanVipRenewPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get VIP Loan Repayment History (USER_DATA)
   * VIP loan is available for VIP users only.  Weight(IP): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order id (optional)
   * @param loanCoin Coin loaned (optional)
   * @param startTime UTC timestamp in ms (optional)
   * @param endTime UTC timestamp in ms (optional)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit Default 10; max 100. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanVipRepayHistoryGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanVipRepayHistoryGet200Response sapiV1LoanVipRepayHistoryGet(Long timestamp, String signature, Long orderId, String loanCoin, Long startTime, Long endTime, Integer current, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipRepayHistoryGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipRepayHistoryGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/repay/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "loanCoin", loanCoin));
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

    GenericType<SapiV1LoanVipRepayHistoryGet200Response> localVarReturnType = new GenericType<SapiV1LoanVipRepayHistoryGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * VIP Loan Repay (TRADE)
   * VIP loan is available for VIP users only.  Weight(UID): 6000
   * @param amount  (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param orderId Order id (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanVipRepayPost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanVipRepayPost200Response sapiV1LoanVipRepayPost(Double amount, Long timestamp, String signature, Long orderId, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1LoanVipRepayPost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipRepayPost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipRepayPost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/repay".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "orderId", orderId));
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

    GenericType<SapiV1LoanVipRepayPost200Response> localVarReturnType = new GenericType<SapiV1LoanVipRepayPost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Query Application Status (USER_DATA)
   * Get Application Status  Weight(UID): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param current Current querying page. Start from 1. Default:1 (optional)
   * @param limit Default 500; max 1000. (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1LoanVipRequestDataGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1LoanVipRequestDataGet200Response sapiV1LoanVipRequestDataGet(Long timestamp, String signature, Integer current, Integer limit, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipRequestDataGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipRequestDataGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/request/data".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

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

    GenericType<SapiV1LoanVipRequestDataGet200Response> localVarReturnType = new GenericType<SapiV1LoanVipRequestDataGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get Borrow Interest Rate (USER_DATA)
   * Get borrow interest rate.  Weight(UID): 400
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param loanCoin Max 10 assets, Multiple split by \&quot;,\&quot; (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code List<SapiV1LoanVipRequestInterestRateGet200ResponseInner>}
   * @throws ApiException if fails to make API call
   */
  public List<SapiV1LoanVipRequestInterestRateGet200ResponseInner> sapiV1LoanVipRequestInterestRateGet(Long timestamp, String signature, String loanCoin, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1LoanVipRequestInterestRateGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1LoanVipRequestInterestRateGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/loan/vip/request/interestRate".replaceAll("\\{format\\}","json");

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

    GenericType<List<SapiV1LoanVipRequestInterestRateGet200ResponseInner>> localVarReturnType = new GenericType<List<SapiV1LoanVipRequestInterestRateGet200ResponseInner>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
