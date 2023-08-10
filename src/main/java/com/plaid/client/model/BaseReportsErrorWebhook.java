/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.406.1
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
import com.plaid.client.model.PlaidError;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when Base Report generation has failed. The resulting &#x60;error&#x60; will have an &#x60;error_type&#x60; of &#x60;BASE_REPORT_ERROR&#x60;.
 */
@ApiModel(description = "Fired when Base Report generation has failed. The resulting `error` will have an `error_type` of `BASE_REPORT_ERROR`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T22:39:54.038561Z[Etc/UTC]")
public class BaseReportsErrorWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_ASSET_REPORT_ID = "asset_report_id";
  @SerializedName(SERIALIZED_NAME_ASSET_REPORT_ID)
  private String assetReportId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public BaseReportsErrorWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;BASE_REPORT&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`BASE_REPORT`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public BaseReportsErrorWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;ERROR&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`ERROR`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public BaseReportsErrorWebhook error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public BaseReportsErrorWebhook assetReportId(String assetReportId) {
    
    this.assetReportId = assetReportId;
    return this;
  }

   /**
   * The ID associated with the Asset Report.
   * @return assetReportId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID associated with the Asset Report.")

  public String getAssetReportId() {
    return assetReportId;
  }


  public void setAssetReportId(String assetReportId) {
    this.assetReportId = assetReportId;
  }


  public BaseReportsErrorWebhook environment(WebhookEnvironmentValues environment) {
    
    this.environment = environment;
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(required = true, value = "")

  public WebhookEnvironmentValues getEnvironment() {
    return environment;
  }


  public void setEnvironment(WebhookEnvironmentValues environment) {
    this.environment = environment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportsErrorWebhook baseReportsErrorWebhook = (BaseReportsErrorWebhook) o;
    return Objects.equals(this.webhookType, baseReportsErrorWebhook.webhookType) &&
        Objects.equals(this.webhookCode, baseReportsErrorWebhook.webhookCode) &&
        Objects.equals(this.error, baseReportsErrorWebhook.error) &&
        Objects.equals(this.assetReportId, baseReportsErrorWebhook.assetReportId) &&
        Objects.equals(this.environment, baseReportsErrorWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, error, assetReportId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportsErrorWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    assetReportId: ").append(toIndentedString(assetReportId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
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
