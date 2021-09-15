/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.33.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.EarningsTotal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing both a breakdown of earnings on a paystub and the total earnings.
 */
@ApiModel(description = "An object representing both a breakdown of earnings on a paystub and the total earnings.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-15T21:50:59.429Z[GMT]")
public class Earnings {
  public static final String SERIALIZED_NAME_SUBTOTALS = "subtotals";
  @SerializedName(SERIALIZED_NAME_SUBTOTALS)
  private List<EarningsTotal> subtotals = null;

  public static final String SERIALIZED_NAME_TOTALS = "totals";
  @SerializedName(SERIALIZED_NAME_TOTALS)
  private List<EarningsTotal> totals = null;


  public Earnings subtotals(List<EarningsTotal> subtotals) {
    
    this.subtotals = subtotals;
    return this;
  }

  public Earnings addSubtotalsItem(EarningsTotal subtotalsItem) {
    if (this.subtotals == null) {
      this.subtotals = new ArrayList<>();
    }
    this.subtotals.add(subtotalsItem);
    return this;
  }

   /**
   * Get subtotals
   * @return subtotals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EarningsTotal> getSubtotals() {
    return subtotals;
  }


  public void setSubtotals(List<EarningsTotal> subtotals) {
    this.subtotals = subtotals;
  }


  public Earnings totals(List<EarningsTotal> totals) {
    
    this.totals = totals;
    return this;
  }

  public Earnings addTotalsItem(EarningsTotal totalsItem) {
    if (this.totals == null) {
      this.totals = new ArrayList<>();
    }
    this.totals.add(totalsItem);
    return this;
  }

   /**
   * Get totals
   * @return totals
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<EarningsTotal> getTotals() {
    return totals;
  }


  public void setTotals(List<EarningsTotal> totals) {
    this.totals = totals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Earnings earnings = (Earnings) o;
    return Objects.equals(this.subtotals, earnings.subtotals) &&
        Objects.equals(this.totals, earnings.totals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subtotals, totals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Earnings {\n");
    sb.append("    subtotals: ").append(toIndentedString(subtotals)).append("\n");
    sb.append("    totals: ").append(toIndentedString(totals)).append("\n");
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

