/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
import com.plaid.client.model.RecurringInsightsStream;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Insights object for recurring transactions for &#x60;/beta/transactions/user_insights/v1/get&#x60; endpoint
 */
@ApiModel(description = "Insights object for recurring transactions for `/beta/transactions/user_insights/v1/get` endpoint")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T20:14:45.051727Z[Etc/UTC]")
public class RecurringTransactions {
  public static final String SERIALIZED_NAME_INFLOW_STREAMS = "inflow_streams";
  @SerializedName(SERIALIZED_NAME_INFLOW_STREAMS)
  private List<RecurringInsightsStream> inflowStreams = new ArrayList<>();

  public static final String SERIALIZED_NAME_OUTFLOW_STREAMS = "outflow_streams";
  @SerializedName(SERIALIZED_NAME_OUTFLOW_STREAMS)
  private List<RecurringInsightsStream> outflowStreams = new ArrayList<>();


  public RecurringTransactions inflowStreams(List<RecurringInsightsStream> inflowStreams) {
    
    this.inflowStreams = inflowStreams;
    return this;
  }

  public RecurringTransactions addInflowStreamsItem(RecurringInsightsStream inflowStreamsItem) {
    this.inflowStreams.add(inflowStreamsItem);
    return this;
  }

   /**
   * An array of inflow transaction streams (e.g., income).
   * @return inflowStreams
  **/
  @ApiModelProperty(required = true, value = "An array of inflow transaction streams (e.g., income).")

  public List<RecurringInsightsStream> getInflowStreams() {
    return inflowStreams;
  }


  public void setInflowStreams(List<RecurringInsightsStream> inflowStreams) {
    this.inflowStreams = inflowStreams;
  }


  public RecurringTransactions outflowStreams(List<RecurringInsightsStream> outflowStreams) {
    
    this.outflowStreams = outflowStreams;
    return this;
  }

  public RecurringTransactions addOutflowStreamsItem(RecurringInsightsStream outflowStreamsItem) {
    this.outflowStreams.add(outflowStreamsItem);
    return this;
  }

   /**
   * An array of outflow transaction streams (e.g., subscriptions, bills, loan payments).
   * @return outflowStreams
  **/
  @ApiModelProperty(required = true, value = "An array of outflow transaction streams (e.g., subscriptions, bills, loan payments).")

  public List<RecurringInsightsStream> getOutflowStreams() {
    return outflowStreams;
  }


  public void setOutflowStreams(List<RecurringInsightsStream> outflowStreams) {
    this.outflowStreams = outflowStreams;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringTransactions recurringTransactions = (RecurringTransactions) o;
    return Objects.equals(this.inflowStreams, recurringTransactions.inflowStreams) &&
        Objects.equals(this.outflowStreams, recurringTransactions.outflowStreams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(inflowStreams, outflowStreams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringTransactions {\n");
    sb.append("    inflowStreams: ").append(toIndentedString(inflowStreams)).append("\n");
    sb.append("    outflowStreams: ").append(toIndentedString(outflowStreams)).append("\n");
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

