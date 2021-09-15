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
import com.plaid.client.model.AssetReport;
import com.plaid.client.model.Warning;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * AssetReportGetResponse defines the response schema for &#x60;/asset_report/get&#x60;
 */
@ApiModel(description = "AssetReportGetResponse defines the response schema for `/asset_report/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-15T21:50:59.429Z[GMT]")
public class AssetReportGetResponse {
  public static final String SERIALIZED_NAME_REPORT = "report";
  @SerializedName(SERIALIZED_NAME_REPORT)
  private AssetReport report;

  public static final String SERIALIZED_NAME_WARNINGS = "warnings";
  @SerializedName(SERIALIZED_NAME_WARNINGS)
  private List<Warning> warnings = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public AssetReportGetResponse report(AssetReport report) {
    
    this.report = report;
    return this;
  }

   /**
   * Get report
   * @return report
  **/
  @ApiModelProperty(required = true, value = "")

  public AssetReport getReport() {
    return report;
  }


  public void setReport(AssetReport report) {
    this.report = report;
  }


  public AssetReportGetResponse warnings(List<Warning> warnings) {
    
    this.warnings = warnings;
    return this;
  }

  public AssetReportGetResponse addWarningsItem(Warning warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * If the Asset Report generation was successful but identity information cannot be returned, this array will contain information about the errors causing identity information to be missing
   * @return warnings
  **/
  @ApiModelProperty(required = true, value = "If the Asset Report generation was successful but identity information cannot be returned, this array will contain information about the errors causing identity information to be missing")

  public List<Warning> getWarnings() {
    return warnings;
  }


  public void setWarnings(List<Warning> warnings) {
    this.warnings = warnings;
  }


  public AssetReportGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportGetResponse assetReportGetResponse = (AssetReportGetResponse) o;
    return Objects.equals(this.report, assetReportGetResponse.report) &&
        Objects.equals(this.warnings, assetReportGetResponse.warnings) &&
        Objects.equals(this.requestId, assetReportGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(report, warnings, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportGetResponse {\n");
    sb.append("    report: ").append(toIndentedString(report)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

