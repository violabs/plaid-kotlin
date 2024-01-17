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
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when a report created on the Beacon Network matches with one of your Beacon Users.
 */
@ApiModel(description = "Fired when a report created on the Beacon Network matches with one of your Beacon Users.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-01-16T22:23:14.698759Z[Etc/UTC]")
public class BeaconReportSyndicationCreatedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_BEACON_REPORT_SYNDICATION_ID = "beacon_report_syndication_id";
  @SerializedName(SERIALIZED_NAME_BEACON_REPORT_SYNDICATION_ID)
  private String beaconReportSyndicationId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;


  public BeaconReportSyndicationCreatedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;BEACON&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`BEACON`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public BeaconReportSyndicationCreatedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;REPORT_SYNDICATION_CREATED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`REPORT_SYNDICATION_CREATED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public BeaconReportSyndicationCreatedWebhook beaconReportSyndicationId(String beaconReportSyndicationId) {
    
    this.beaconReportSyndicationId = beaconReportSyndicationId;
    return this;
  }

   /**
   * The ID of the associated Beacon Report Syndication.
   * @return beaconReportSyndicationId
  **/
  @ApiModelProperty(required = true, value = "The ID of the associated Beacon Report Syndication.")

  public String getBeaconReportSyndicationId() {
    return beaconReportSyndicationId;
  }


  public void setBeaconReportSyndicationId(String beaconReportSyndicationId) {
    this.beaconReportSyndicationId = beaconReportSyndicationId;
  }


  public BeaconReportSyndicationCreatedWebhook environment(WebhookEnvironmentValues environment) {
    
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
    BeaconReportSyndicationCreatedWebhook beaconReportSyndicationCreatedWebhook = (BeaconReportSyndicationCreatedWebhook) o;
    return Objects.equals(this.webhookType, beaconReportSyndicationCreatedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, beaconReportSyndicationCreatedWebhook.webhookCode) &&
        Objects.equals(this.beaconReportSyndicationId, beaconReportSyndicationCreatedWebhook.beaconReportSyndicationId) &&
        Objects.equals(this.environment, beaconReportSyndicationCreatedWebhook.environment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, beaconReportSyndicationId, environment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeaconReportSyndicationCreatedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    beaconReportSyndicationId: ").append(toIndentedString(beaconReportSyndicationId)).append("\n");
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
