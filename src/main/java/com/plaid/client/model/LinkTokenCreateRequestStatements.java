/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.485.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * Specifies options for initializing Link for use with the Statements product.
 */
@ApiModel(description = "Specifies options for initializing Link for use with the Statements product.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class LinkTokenCreateRequestStatements {
  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;


  public LinkTokenCreateRequestStatements startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The start date for statements, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) “YYYY-MM-DD” format, e.g. \&quot;2020-10-30\&quot;. If no value is provided, this will default to 3 months prior to the current date.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The start date for statements, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) “YYYY-MM-DD” format, e.g. \"2020-10-30\". If no value is provided, this will default to 3 months prior to the current date.")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public LinkTokenCreateRequestStatements endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * The end date for statements, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) “YYYY-MM-DD” format, e.g. \&quot;2020-10-30\&quot;. If no value is provided, this will default to the current date. You can request up to two years of data.
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The end date for statements, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) “YYYY-MM-DD” format, e.g. \"2020-10-30\". If no value is provided, this will default to the current date. You can request up to two years of data.")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkTokenCreateRequestStatements linkTokenCreateRequestStatements = (LinkTokenCreateRequestStatements) o;
    return Objects.equals(this.startDate, linkTokenCreateRequestStatements.startDate) &&
        Objects.equals(this.endDate, linkTokenCreateRequestStatements.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkTokenCreateRequestStatements {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
