/*
 * Binance Public Spot API
 * OpenAPI Specifications for the Binance Public Spot API  API documents:   - [https://github.com/binance/binance-spot-api-docs](https://github.com/binance/binance-spot-api-docs)   - [https://binance-docs.github.io/apidocs/spot/en](https://binance-docs.github.io/apidocs/spot/en)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.olbaid.binance.service.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.olbaid.binance.service.model.SapiV1MarginOrderOcoPost200ResponseOrderReportsInner;
import com.olbaid.binance.service.model.SapiV1MarginOrderOcoPost200ResponseOrdersInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1MarginOrderOcoPost200Response
 */
@JsonPropertyOrder({
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_ORDER_LIST_ID,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_CONTINGENCY_TYPE,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_LIST_STATUS_TYPE,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_LIST_ORDER_STATUS,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_LIST_CLIENT_ORDER_ID,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_TRANSACTION_TIME,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_SYMBOL,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_MARGIN_BUY_BORROW_AMOUNT,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_MARGIN_BUY_BORROW_ASSET,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_IS_ISOLATED,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_ORDERS,
  SapiV1MarginOrderOcoPost200Response.JSON_PROPERTY_ORDER_REPORTS
})
@JsonTypeName("_sapi_v1_margin_order_oco_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MarginOrderOcoPost200Response {
  public static final String JSON_PROPERTY_ORDER_LIST_ID = "orderListId";
  private Long orderListId;

  public static final String JSON_PROPERTY_CONTINGENCY_TYPE = "contingencyType";
  private String contingencyType;

  public static final String JSON_PROPERTY_LIST_STATUS_TYPE = "listStatusType";
  private String listStatusType;

  public static final String JSON_PROPERTY_LIST_ORDER_STATUS = "listOrderStatus";
  private String listOrderStatus;

  public static final String JSON_PROPERTY_LIST_CLIENT_ORDER_ID = "listClientOrderId";
  private String listClientOrderId;

  public static final String JSON_PROPERTY_TRANSACTION_TIME = "transactionTime";
  private Long transactionTime;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_MARGIN_BUY_BORROW_AMOUNT = "marginBuyBorrowAmount";
  private String marginBuyBorrowAmount;

  public static final String JSON_PROPERTY_MARGIN_BUY_BORROW_ASSET = "marginBuyBorrowAsset";
  private String marginBuyBorrowAsset;

  public static final String JSON_PROPERTY_IS_ISOLATED = "isIsolated";
  private Boolean isIsolated;

  public static final String JSON_PROPERTY_ORDERS = "orders";
  private List<SapiV1MarginOrderOcoPost200ResponseOrdersInner> orders = new ArrayList<>();

  public static final String JSON_PROPERTY_ORDER_REPORTS = "orderReports";
  private List<SapiV1MarginOrderOcoPost200ResponseOrderReportsInner> orderReports = new ArrayList<>();

  public SapiV1MarginOrderOcoPost200Response() {
  }

  public SapiV1MarginOrderOcoPost200Response orderListId(Long orderListId) {
    
    this.orderListId = orderListId;
    return this;
  }

   /**
   * Get orderListId
   * @return orderListId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getOrderListId() {
    return orderListId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_LIST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderListId(Long orderListId) {
    this.orderListId = orderListId;
  }


  public SapiV1MarginOrderOcoPost200Response contingencyType(String contingencyType) {
    
    this.contingencyType = contingencyType;
    return this;
  }

   /**
   * Get contingencyType
   * @return contingencyType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "OCO", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CONTINGENCY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getContingencyType() {
    return contingencyType;
  }


  @JsonProperty(JSON_PROPERTY_CONTINGENCY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setContingencyType(String contingencyType) {
    this.contingencyType = contingencyType;
  }


  public SapiV1MarginOrderOcoPost200Response listStatusType(String listStatusType) {
    
    this.listStatusType = listStatusType;
    return this;
  }

   /**
   * Get listStatusType
   * @return listStatusType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "EXEC_STARTED", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIST_STATUS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getListStatusType() {
    return listStatusType;
  }


  @JsonProperty(JSON_PROPERTY_LIST_STATUS_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListStatusType(String listStatusType) {
    this.listStatusType = listStatusType;
  }


  public SapiV1MarginOrderOcoPost200Response listOrderStatus(String listOrderStatus) {
    
    this.listOrderStatus = listOrderStatus;
    return this;
  }

   /**
   * Get listOrderStatus
   * @return listOrderStatus
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "EXECUTING", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIST_ORDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getListOrderStatus() {
    return listOrderStatus;
  }


  @JsonProperty(JSON_PROPERTY_LIST_ORDER_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListOrderStatus(String listOrderStatus) {
    this.listOrderStatus = listOrderStatus;
  }


  public SapiV1MarginOrderOcoPost200Response listClientOrderId(String listClientOrderId) {
    
    this.listClientOrderId = listClientOrderId;
    return this;
  }

   /**
   * Get listClientOrderId
   * @return listClientOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "JYVpp3F0f5CAG15DhtrqLp", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LIST_CLIENT_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getListClientOrderId() {
    return listClientOrderId;
  }


  @JsonProperty(JSON_PROPERTY_LIST_CLIENT_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListClientOrderId(String listClientOrderId) {
    this.listClientOrderId = listClientOrderId;
  }


  public SapiV1MarginOrderOcoPost200Response transactionTime(Long transactionTime) {
    
    this.transactionTime = transactionTime;
    return this;
  }

   /**
   * Get transactionTime
   * @return transactionTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1563417480525", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTransactionTime() {
    return transactionTime;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransactionTime(Long transactionTime) {
    this.transactionTime = transactionTime;
  }


  public SapiV1MarginOrderOcoPost200Response symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "LTCBTC", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSymbol() {
    return symbol;
  }


  @JsonProperty(JSON_PROPERTY_SYMBOL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  public SapiV1MarginOrderOcoPost200Response marginBuyBorrowAmount(String marginBuyBorrowAmount) {
    
    this.marginBuyBorrowAmount = marginBuyBorrowAmount;
    return this;
  }

   /**
   * will not return if no margin trade happens
   * @return marginBuyBorrowAmount
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "5", required = true, value = "will not return if no margin trade happens")
  @JsonProperty(JSON_PROPERTY_MARGIN_BUY_BORROW_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMarginBuyBorrowAmount() {
    return marginBuyBorrowAmount;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_BUY_BORROW_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMarginBuyBorrowAmount(String marginBuyBorrowAmount) {
    this.marginBuyBorrowAmount = marginBuyBorrowAmount;
  }


  public SapiV1MarginOrderOcoPost200Response marginBuyBorrowAsset(String marginBuyBorrowAsset) {
    
    this.marginBuyBorrowAsset = marginBuyBorrowAsset;
    return this;
  }

   /**
   * will not return if no margin trade happens
   * @return marginBuyBorrowAsset
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTC", required = true, value = "will not return if no margin trade happens")
  @JsonProperty(JSON_PROPERTY_MARGIN_BUY_BORROW_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMarginBuyBorrowAsset() {
    return marginBuyBorrowAsset;
  }


  @JsonProperty(JSON_PROPERTY_MARGIN_BUY_BORROW_ASSET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMarginBuyBorrowAsset(String marginBuyBorrowAsset) {
    this.marginBuyBorrowAsset = marginBuyBorrowAsset;
  }


  public SapiV1MarginOrderOcoPost200Response isIsolated(Boolean isIsolated) {
    
    this.isIsolated = isIsolated;
    return this;
  }

   /**
   * Get isIsolated
   * @return isIsolated
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "false", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_IS_ISOLATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsIsolated() {
    return isIsolated;
  }


  @JsonProperty(JSON_PROPERTY_IS_ISOLATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsIsolated(Boolean isIsolated) {
    this.isIsolated = isIsolated;
  }


  public SapiV1MarginOrderOcoPost200Response orders(List<SapiV1MarginOrderOcoPost200ResponseOrdersInner> orders) {
    
    this.orders = orders;
    return this;
  }

  public SapiV1MarginOrderOcoPost200Response addOrdersItem(SapiV1MarginOrderOcoPost200ResponseOrdersInner ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[{\"symbol\":\"LTCBTC\",\"orderId\":2,\"clientOrderId\":\"Kk7sqHb9J6mJWTMDVW7Vos\"},{\"symbol\":\"LTCBTC\",\"orderId\":3,\"clientOrderId\":\"xTXKaGYd4bluPVp78IVRvl\"}]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1MarginOrderOcoPost200ResponseOrdersInner> getOrders() {
    return orders;
  }


  @JsonProperty(JSON_PROPERTY_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrders(List<SapiV1MarginOrderOcoPost200ResponseOrdersInner> orders) {
    this.orders = orders;
  }


  public SapiV1MarginOrderOcoPost200Response orderReports(List<SapiV1MarginOrderOcoPost200ResponseOrderReportsInner> orderReports) {
    
    this.orderReports = orderReports;
    return this;
  }

  public SapiV1MarginOrderOcoPost200Response addOrderReportsItem(SapiV1MarginOrderOcoPost200ResponseOrderReportsInner orderReportsItem) {
    this.orderReports.add(orderReportsItem);
    return this;
  }

   /**
   * Get orderReports
   * @return orderReports
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "[{\"symbol\":\"LTCBTC\",\"orderId\":2,\"orderListId\":0,\"clientOrderId\":\"Kk7sqHb9J6mJWTMDVW7Vos\",\"transactTime\":1563417480525,\"price\":\"0.000000\",\"origQty\":\"0.624363\",\"executedQty\":\"0.000000\",\"cummulativeQuoteQty\":\"0.000000\",\"status\":\"NEW\",\"timeInForce\":\"GTC\",\"type\":\"STOP_LOSS\",\"side\":\"BUY\",\"stopPrice\":\"0.960664\"},{\"symbol\":\"LTCBTC\",\"orderId\":3,\"orderListId\":0,\"clientOrderId\":\"xTXKaGYd4bluPVp78IVRvl\",\"transactTime\":1563417480525,\"price\":\"0.036435\",\"origQty\":\"0.624363\",\"executedQty\":\"0.000000\",\"cummulativeQuoteQty\":\"0.000000\",\"status\":\"NEW\",\"timeInForce\":\"GTC\",\"type\":\"LIMIT_MAKER\",\"side\":\"BUY\"}]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1MarginOrderOcoPost200ResponseOrderReportsInner> getOrderReports() {
    return orderReports;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderReports(List<SapiV1MarginOrderOcoPost200ResponseOrderReportsInner> orderReports) {
    this.orderReports = orderReports;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SapiV1MarginOrderOcoPost200Response sapiV1MarginOrderOcoPost200Response = (SapiV1MarginOrderOcoPost200Response) o;
    return Objects.equals(this.orderListId, sapiV1MarginOrderOcoPost200Response.orderListId) &&
        Objects.equals(this.contingencyType, sapiV1MarginOrderOcoPost200Response.contingencyType) &&
        Objects.equals(this.listStatusType, sapiV1MarginOrderOcoPost200Response.listStatusType) &&
        Objects.equals(this.listOrderStatus, sapiV1MarginOrderOcoPost200Response.listOrderStatus) &&
        Objects.equals(this.listClientOrderId, sapiV1MarginOrderOcoPost200Response.listClientOrderId) &&
        Objects.equals(this.transactionTime, sapiV1MarginOrderOcoPost200Response.transactionTime) &&
        Objects.equals(this.symbol, sapiV1MarginOrderOcoPost200Response.symbol) &&
        Objects.equals(this.marginBuyBorrowAmount, sapiV1MarginOrderOcoPost200Response.marginBuyBorrowAmount) &&
        Objects.equals(this.marginBuyBorrowAsset, sapiV1MarginOrderOcoPost200Response.marginBuyBorrowAsset) &&
        Objects.equals(this.isIsolated, sapiV1MarginOrderOcoPost200Response.isIsolated) &&
        Objects.equals(this.orders, sapiV1MarginOrderOcoPost200Response.orders) &&
        Objects.equals(this.orderReports, sapiV1MarginOrderOcoPost200Response.orderReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderListId, contingencyType, listStatusType, listOrderStatus, listClientOrderId, transactionTime, symbol, marginBuyBorrowAmount, marginBuyBorrowAsset, isIsolated, orders, orderReports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MarginOrderOcoPost200Response {\n");
    sb.append("    orderListId: ").append(toIndentedString(orderListId)).append("\n");
    sb.append("    contingencyType: ").append(toIndentedString(contingencyType)).append("\n");
    sb.append("    listStatusType: ").append(toIndentedString(listStatusType)).append("\n");
    sb.append("    listOrderStatus: ").append(toIndentedString(listOrderStatus)).append("\n");
    sb.append("    listClientOrderId: ").append(toIndentedString(listClientOrderId)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    marginBuyBorrowAmount: ").append(toIndentedString(marginBuyBorrowAmount)).append("\n");
    sb.append("    marginBuyBorrowAsset: ").append(toIndentedString(marginBuyBorrowAsset)).append("\n");
    sb.append("    isIsolated: ").append(toIndentedString(isIsolated)).append("\n");
    sb.append("    orders: ").append(toIndentedString(orders)).append("\n");
    sb.append("    orderReports: ").append(toIndentedString(orderReports)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

