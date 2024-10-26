package com.olbaid.binance.service.api;

import com.olbaid.binance.service.invoker.ApiException;
import com.olbaid.binance.service.invoker.ApiClient;
import com.olbaid.binance.service.invoker.Configuration;
import com.olbaid.binance.service.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.olbaid.binance.service.model.Error;
import com.olbaid.binance.service.model.SapiV1GiftcardBuyCodeTokenLimitGet200Response;
import com.olbaid.binance.service.model.SapiV1GiftcardCreateCodePost200Response;
import com.olbaid.binance.service.model.SapiV1GiftcardCryptographyRsaPublicKeyGet200Response;
import com.olbaid.binance.service.model.SapiV1GiftcardRedeemCodePost200Response;
import com.olbaid.binance.service.model.SapiV1GiftcardVerifyGet200Response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GiftCardApi {
  private ApiClient apiClient;

  public GiftCardApi() {
    this(Configuration.getDefaultApiClient());
  }

  public GiftCardApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Buy a Binance Code (TRADE)
   * This API is for buying a fixed-value Binance Code, which means your Binance Code will be redeemable to a token that is different to the token that you are paying in. If the token youâ€™re paying and the redeemable token are the same, please use the Create Binance Code endpoint. You can use supported crypto currency or fiat token as baseToken to buy Binance Code that is redeemable to your chosen faceToken. Once successfully purchased, the amount of baseToken would be deducted from your funding wallet.  To get started with, please make sure: - You have a Binance account - You have passed kyc - You have a sufficient balance in your Binance funding wallet - You need Enable Withdrawals for the API Key which requests this endpoint.  Daily creation volume: 2 BTC / 24H Daily creation times: 200 Codes / 24H  Weight(IP): 1
   * @param baseToken The token you want to pay, example BUSD (required)
   * @param faceToken The token you want to buy, example BNB. If faceToken &#x3D; baseToken, it&#39;s the same as createCode endpoint. (required)
   * @param baseTokenAmount The base token asset quantity, example  1.002 (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1GiftcardCreateCodePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1GiftcardCreateCodePost200Response sapiV1GiftcardBuyCodePost(String baseToken, String faceToken, Double baseTokenAmount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'baseToken' is set
    if (baseToken == null) {
      throw new ApiException(400, "Missing the required parameter 'baseToken' when calling sapiV1GiftcardBuyCodePost");
    }
    
    // verify the required parameter 'faceToken' is set
    if (faceToken == null) {
      throw new ApiException(400, "Missing the required parameter 'faceToken' when calling sapiV1GiftcardBuyCodePost");
    }
    
    // verify the required parameter 'baseTokenAmount' is set
    if (baseTokenAmount == null) {
      throw new ApiException(400, "Missing the required parameter 'baseTokenAmount' when calling sapiV1GiftcardBuyCodePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1GiftcardBuyCodePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1GiftcardBuyCodePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/giftcard/buyCode".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseToken", baseToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "faceToken", faceToken));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseTokenAmount", baseTokenAmount));
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

    GenericType<SapiV1GiftcardCreateCodePost200Response> localVarReturnType = new GenericType<SapiV1GiftcardCreateCodePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetch Token Limit (USER_DATA)
   * This API is to help you verify which tokens are available for you to purchase fixed-value gift cards as mentioned in section 2 and it&#39;s limitation.  Weight(IP): 1
   * @param baseToken The token you want to pay, example BUSD (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1GiftcardBuyCodeTokenLimitGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1GiftcardBuyCodeTokenLimitGet200Response sapiV1GiftcardBuyCodeTokenLimitGet(String baseToken, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'baseToken' is set
    if (baseToken == null) {
      throw new ApiException(400, "Missing the required parameter 'baseToken' when calling sapiV1GiftcardBuyCodeTokenLimitGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1GiftcardBuyCodeTokenLimitGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1GiftcardBuyCodeTokenLimitGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/giftcard/buyCode/token-limit".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "baseToken", baseToken));
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

    GenericType<SapiV1GiftcardBuyCodeTokenLimitGet200Response> localVarReturnType = new GenericType<SapiV1GiftcardBuyCodeTokenLimitGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Create a Binance Code (USER_DATA)
   * This API is for creating a Binance Code. To get started with, please make sure:  - You have a Binance account - You have passed kyc - You have a sufficient balance in your Binance funding wallet - You need Enable Withdrawals for the API Key which requests this endpoint.  Daily creation volume: 2 BTC / 24H Daily creation times: 200 Codes / 24H  Weight(IP): 1
   * @param token The coin type contained in the Binance Code (required)
   * @param amount The amount of the coin (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1GiftcardCreateCodePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1GiftcardCreateCodePost200Response sapiV1GiftcardCreateCodePost(String token, Double amount, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'token' is set
    if (token == null) {
      throw new ApiException(400, "Missing the required parameter 'token' when calling sapiV1GiftcardCreateCodePost");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling sapiV1GiftcardCreateCodePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1GiftcardCreateCodePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1GiftcardCreateCodePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/giftcard/createCode".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "token", token));
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

    GenericType<SapiV1GiftcardCreateCodePost200Response> localVarReturnType = new GenericType<SapiV1GiftcardCreateCodePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Fetch RSA Public Key (USER_DATA)
   * This API is for fetching the RSA Public Key. This RSA Public key will be used to encrypt the card code. Please note that the RSA Public key fetched is valid only for the current day.  Weight(IP): 1
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1GiftcardCryptographyRsaPublicKeyGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1GiftcardCryptographyRsaPublicKeyGet200Response sapiV1GiftcardCryptographyRsaPublicKeyGet(Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1GiftcardCryptographyRsaPublicKeyGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1GiftcardCryptographyRsaPublicKeyGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/giftcard/cryptography/rsa-public-key".replaceAll("\\{format\\}","json");

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

    GenericType<SapiV1GiftcardCryptographyRsaPublicKeyGet200Response> localVarReturnType = new GenericType<SapiV1GiftcardCryptographyRsaPublicKeyGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Redeem a Binance Code (USER_DATA)
   * This API is for redeeming the Binance Code. Once redeemed, the coins will be deposited in your funding wallet.  Please note that if you enter the wrong code 5 times within 24 hours, you will no longer be able to redeem any Binance Code that day.  Weight(IP): 1
   * @param code Binance Code (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param externalUid Each external unique ID represents a unique user on the partner platform. The function helps you to identify the redemption behavior of different users, such as redemption frequency and amount. It also helps risk and limit control of a single account, such as daily limit on redemption volume, frequency, and incorrect number of entries. This will also prevent a single user account reach the partner&#39;s daily redemption limits. We strongly recommend you to use this feature and transfer us the User ID of your users if you have different users redeeming Binance codes on your platform. To protect user data privacy, you may choose to transfer the user id in any desired format (max. 400 characters). (optional)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1GiftcardRedeemCodePost200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1GiftcardRedeemCodePost200Response sapiV1GiftcardRedeemCodePost(String code, Long timestamp, String signature, String externalUid, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'code' is set
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling sapiV1GiftcardRedeemCodePost");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1GiftcardRedeemCodePost");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1GiftcardRedeemCodePost");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/giftcard/redeemCode".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "code", code));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "externalUid", externalUid));
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

    GenericType<SapiV1GiftcardRedeemCodePost200Response> localVarReturnType = new GenericType<SapiV1GiftcardRedeemCodePost200Response>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Verify a Binance Code (USER_DATA)
   * This API is for verifying whether the Binance Code is valid or not by entering Binance Code or reference number.  Please note that if you enter the wrong binance code 5 times within an hour, you will no longer be able to verify any binance code for that hour.  Weight(IP): 1
   * @param referenceNo reference number (required)
   * @param timestamp UTC timestamp in ms (required)
   * @param signature Signature (required)
   * @param recvWindow The value cannot be greater than 60000 (optional)
   * @return a {@code SapiV1GiftcardVerifyGet200Response}
   * @throws ApiException if fails to make API call
   */
  public SapiV1GiftcardVerifyGet200Response sapiV1GiftcardVerifyGet(String referenceNo, Long timestamp, String signature, Long recvWindow) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'referenceNo' is set
    if (referenceNo == null) {
      throw new ApiException(400, "Missing the required parameter 'referenceNo' when calling sapiV1GiftcardVerifyGet");
    }
    
    // verify the required parameter 'timestamp' is set
    if (timestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'timestamp' when calling sapiV1GiftcardVerifyGet");
    }
    
    // verify the required parameter 'signature' is set
    if (signature == null) {
      throw new ApiException(400, "Missing the required parameter 'signature' when calling sapiV1GiftcardVerifyGet");
    }
    
    // create path and map variables
    String localVarPath = "/sapi/v1/giftcard/verify".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "referenceNo", referenceNo));
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

    GenericType<SapiV1GiftcardVerifyGet200Response> localVarReturnType = new GenericType<SapiV1GiftcardVerifyGet200Response>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
