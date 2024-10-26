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
import com.olbaid.binance.service.model.SapiV1MarginOrderOtoPost200ResponseOrderReportsInner;
import com.olbaid.binance.service.model.SapiV1MarginOrderOtoPost200ResponseOrdersInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SapiV1MarginOrderOtoPost200Response
 */
@JsonPropertyOrder({
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_ORDER_LIST_ID,
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_CONTINGENCY_TYPE,
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_LIST_STATUS_TYPE,
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_LIST_ORDER_STATUS,
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_LIST_CLIENT_ORDER_ID,
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_TRANSACTION_TIME,
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_SYMBOL,
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_IS_ISOLATED,
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_ORDERS,
  SapiV1MarginOrderOtoPost200Response.JSON_PROPERTY_ORDER_REPORTS
})
@JsonTypeName("_sapi_v1_margin_order_oto_post_200_response")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SapiV1MarginOrderOtoPost200Response {
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

  public static final String JSON_PROPERTY_IS_ISOLATED = "isIsolated";
  private Boolean isIsolated;

  public static final String JSON_PROPERTY_ORDERS = "orders";
  private List<SapiV1MarginOrderOtoPost200ResponseOrdersInner> orders = new ArrayList<>();

  public static final String JSON_PROPERTY_ORDER_REPORTS = "orderReports";
  private List<SapiV1MarginOrderOtoPost200ResponseOrderReportsInner> orderReports = new ArrayList<>();

  public SapiV1MarginOrderOtoPost200Response() {
  }

  public SapiV1MarginOrderOtoPost200Response orderListId(Long orderListId) {
    
    this.orderListId = orderListId;
    return this;
  }

   /**
   * Get orderListId
   * @return orderListId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "13551", required = true, value = "")
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


  public SapiV1MarginOrderOtoPost200Response contingencyType(String contingencyType) {
    
    this.contingencyType = contingencyType;
    return this;
  }

   /**
   * Get contingencyType
   * @return contingencyType
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "OTO", required = true, value = "")
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


  public SapiV1MarginOrderOtoPost200Response listStatusType(String listStatusType) {
    
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


  public SapiV1MarginOrderOtoPost200Response listOrderStatus(String listOrderStatus) {
    
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


  public SapiV1MarginOrderOtoPost200Response listClientOrderId(String listClientOrderId) {
    
    this.listClientOrderId = listClientOrderId;
    return this;
  }

   /**
   * Get listClientOrderId
   * @return listClientOrderId
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "JDuOrsu0Ge8GTyvx8J7VTD", required = true, value = "")
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


  public SapiV1MarginOrderOtoPost200Response transactionTime(Long transactionTime) {
    
    this.transactionTime = transactionTime;
    return this;
  }

   /**
   * Get transactionTime
   * @return transactionTime
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1725521998054", required = true, value = "")
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


  public SapiV1MarginOrderOtoPost200Response symbol(String symbol) {
    
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * @return symbol
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "BTCUSDT", required = true, value = "")
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


  public SapiV1MarginOrderOtoPost200Response isIsolated(Boolean isIsolated) {
    
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


  public SapiV1MarginOrderOtoPost200Response orders(List<SapiV1MarginOrderOtoPost200ResponseOrdersInner> orders) {
    
    this.orders = orders;
    return this;
  }

  public SapiV1MarginOrderOtoPost200Response addOrdersItem(SapiV1MarginOrderOtoPost200ResponseOrdersInner ordersItem) {
    this.orders.add(ordersItem);
    return this;
  }

   /**
   * Get orders
   * @return orders
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1MarginOrderOtoPost200ResponseOrdersInner> getOrders() {
    return orders;
  }


  @JsonProperty(JSON_PROPERTY_ORDERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrders(List<SapiV1MarginOrderOtoPost200ResponseOrdersInner> orders) {
    this.orders = orders;
  }


  public SapiV1MarginOrderOtoPost200Response orderReports(List<SapiV1MarginOrderOtoPost200ResponseOrderReportsInner> orderReports) {
    
    this.orderReports = orderReports;
    return this;
  }

  public SapiV1MarginOrderOtoPost200Response addOrderReportsItem(SapiV1MarginOrderOtoPost200ResponseOrderReportsInner orderReportsItem) {
    this.orderReports.add(orderReportsItem);
    return this;
  }

   /**
   * Get orderReports
   * @return orderReports
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ORDER_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SapiV1MarginOrderOtoPost200ResponseOrderReportsInner> getOrderReports() {
    return orderReports;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_REPORTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOrderReports(List<SapiV1MarginOrderOtoPost200ResponseOrderReportsInner> orderReports) {
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
    SapiV1MarginOrderOtoPost200Response sapiV1MarginOrderOtoPost200Response = (SapiV1MarginOrderOtoPost200Response) o;
    return Objects.equals(this.orderListId, sapiV1MarginOrderOtoPost200Response.orderListId) &&
        Objects.equals(this.contingencyType, sapiV1MarginOrderOtoPost200Response.contingencyType) &&
        Objects.equals(this.listStatusType, sapiV1MarginOrderOtoPost200Response.listStatusType) &&
        Objects.equals(this.listOrderStatus, sapiV1MarginOrderOtoPost200Response.listOrderStatus) &&
        Objects.equals(this.listClientOrderId, sapiV1MarginOrderOtoPost200Response.listClientOrderId) &&
        Objects.equals(this.transactionTime, sapiV1MarginOrderOtoPost200Response.transactionTime) &&
        Objects.equals(this.symbol, sapiV1MarginOrderOtoPost200Response.symbol) &&
        Objects.equals(this.isIsolated, sapiV1MarginOrderOtoPost200Response.isIsolated) &&
        Objects.equals(this.orders, sapiV1MarginOrderOtoPost200Response.orders) &&
        Objects.equals(this.orderReports, sapiV1MarginOrderOtoPost200Response.orderReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderListId, contingencyType, listStatusType, listOrderStatus, listClientOrderId, transactionTime, symbol, isIsolated, orders, orderReports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SapiV1MarginOrderOtoPost200Response {\n");
    sb.append("    orderListId: ").append(toIndentedString(orderListId)).append("\n");
    sb.append("    contingencyType: ").append(toIndentedString(contingencyType)).append("\n");
    sb.append("    listStatusType: ").append(toIndentedString(listStatusType)).append("\n");
    sb.append("    listOrderStatus: ").append(toIndentedString(listOrderStatus)).append("\n");
    sb.append("    listClientOrderId: ").append(toIndentedString(listClientOrderId)).append("\n");
    sb.append("    transactionTime: ").append(toIndentedString(transactionTime)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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

