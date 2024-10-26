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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * SnapshotFuturesSnapshotVosInnerDataPositionInner
 */
@JsonPropertyOrder({
  SnapshotFuturesSnapshotVosInnerDataPositionInner.JSON_PROPERTY_ENTRY_PRICE,
  SnapshotFuturesSnapshotVosInnerDataPositionInner.JSON_PROPERTY_MARK_PRICE,
  SnapshotFuturesSnapshotVosInnerDataPositionInner.JSON_PROPERTY_POSITION_AMT,
  SnapshotFuturesSnapshotVosInnerDataPositionInner.JSON_PROPERTY_SYMBOL,
  SnapshotFuturesSnapshotVosInnerDataPositionInner.JSON_PROPERTY_UN_REALIZED_PROFIT
})
@JsonTypeName("snapshotFutures_snapshotVos_inner_data_position_inner")
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SnapshotFuturesSnapshotVosInnerDataPositionInner {
  public static final String JSON_PROPERTY_ENTRY_PRICE = "entryPrice";
  private String entryPrice;

  public static final String JSON_PROPERTY_MARK_PRICE = "markPrice";
  private String markPrice;

  public static final String JSON_PROPERTY_POSITION_AMT = "positionAmt";
  private String positionAmt;

  public static final String JSON_PROPERTY_SYMBOL = "symbol";
  private String symbol;

  public static final String JSON_PROPERTY_UN_REALIZED_PROFIT = "unRealizedProfit";
  private String unRealizedProfit;

  public SnapshotFuturesSnapshotVosInnerDataPositionInner() {
  }

  public SnapshotFuturesSnapshotVosInnerDataPositionInner entryPrice(String entryPrice) {
    
    this.entryPrice = entryPrice;
    return this;
  }

   /**
   * Get entryPrice
   * @return entryPrice
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "7130.41000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENTRY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEntryPrice() {
    return entryPrice;
  }


  @JsonProperty(JSON_PROPERTY_ENTRY_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEntryPrice(String entryPrice) {
    this.entryPrice = entryPrice;
  }


  public SnapshotFuturesSnapshotVosInnerDataPositionInner markPrice(String markPrice) {
    
    this.markPrice = markPrice;
    return this;
  }

   /**
   * Get markPrice
   * @return markPrice
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "7257.66239673", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_MARK_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMarkPrice() {
    return markPrice;
  }


  @JsonProperty(JSON_PROPERTY_MARK_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMarkPrice(String markPrice) {
    this.markPrice = markPrice;
  }


  public SnapshotFuturesSnapshotVosInnerDataPositionInner positionAmt(String positionAmt) {
    
    this.positionAmt = positionAmt;
    return this;
  }

   /**
   * Get positionAmt
   * @return positionAmt
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "0.01000000", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_POSITION_AMT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPositionAmt() {
    return positionAmt;
  }


  @JsonProperty(JSON_PROPERTY_POSITION_AMT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPositionAmt(String positionAmt) {
    this.positionAmt = positionAmt;
  }


  public SnapshotFuturesSnapshotVosInnerDataPositionInner symbol(String symbol) {
    
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


  public SnapshotFuturesSnapshotVosInnerDataPositionInner unRealizedProfit(String unRealizedProfit) {
    
    this.unRealizedProfit = unRealizedProfit;
    return this;
  }

   /**
   * Get unRealizedProfit
   * @return unRealizedProfit
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(example = "1.24029054", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UN_REALIZED_PROFIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUnRealizedProfit() {
    return unRealizedProfit;
  }


  @JsonProperty(JSON_PROPERTY_UN_REALIZED_PROFIT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnRealizedProfit(String unRealizedProfit) {
    this.unRealizedProfit = unRealizedProfit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotFuturesSnapshotVosInnerDataPositionInner snapshotFuturesSnapshotVosInnerDataPositionInner = (SnapshotFuturesSnapshotVosInnerDataPositionInner) o;
    return Objects.equals(this.entryPrice, snapshotFuturesSnapshotVosInnerDataPositionInner.entryPrice) &&
        Objects.equals(this.markPrice, snapshotFuturesSnapshotVosInnerDataPositionInner.markPrice) &&
        Objects.equals(this.positionAmt, snapshotFuturesSnapshotVosInnerDataPositionInner.positionAmt) &&
        Objects.equals(this.symbol, snapshotFuturesSnapshotVosInnerDataPositionInner.symbol) &&
        Objects.equals(this.unRealizedProfit, snapshotFuturesSnapshotVosInnerDataPositionInner.unRealizedProfit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryPrice, markPrice, positionAmt, symbol, unRealizedProfit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotFuturesSnapshotVosInnerDataPositionInner {\n");
    sb.append("    entryPrice: ").append(toIndentedString(entryPrice)).append("\n");
    sb.append("    markPrice: ").append(toIndentedString(markPrice)).append("\n");
    sb.append("    positionAmt: ").append(toIndentedString(positionAmt)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    unRealizedProfit: ").append(toIndentedString(unRealizedProfit)).append("\n");
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

