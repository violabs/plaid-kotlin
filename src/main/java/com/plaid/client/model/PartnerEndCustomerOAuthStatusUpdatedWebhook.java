/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.457.0
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
import com.plaid.client.model.PartnerEndCustomerOAuthStatusUpdatedValues;
import com.plaid.client.model.WebhookEnvironmentValues;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The webhook of type &#x60;PARTNER&#x60; and code &#x60;END_CUSTOMER_OAUTH_STATUS_UPDATED&#x60; will be fired when a partner&#39;s end customer has an update on their OAuth registration status with an institution.
 */
@ApiModel(description = "The webhook of type `PARTNER` and code `END_CUSTOMER_OAUTH_STATUS_UPDATED` will be fired when a partner's end customer has an update on their OAuth registration status with an institution.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class PartnerEndCustomerOAuthStatusUpdatedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_END_CUSTOMER_CLIENT_ID = "end_customer_client_id";
  @SerializedName(SERIALIZED_NAME_END_CUSTOMER_CLIENT_ID)
  private String endCustomerClientId;

  public static final String SERIALIZED_NAME_ENVIRONMENT = "environment";
  @SerializedName(SERIALIZED_NAME_ENVIRONMENT)
  private WebhookEnvironmentValues environment;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PartnerEndCustomerOAuthStatusUpdatedValues status;


  public PartnerEndCustomerOAuthStatusUpdatedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;PARTNER&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`PARTNER`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public PartnerEndCustomerOAuthStatusUpdatedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;END_CUSTOMER_OAUTH_STATUS_UPDATED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`END_CUSTOMER_OAUTH_STATUS_UPDATED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public PartnerEndCustomerOAuthStatusUpdatedWebhook endCustomerClientId(String endCustomerClientId) {
    
    this.endCustomerClientId = endCustomerClientId;
    return this;
  }

   /**
   * The client ID of the end customer
   * @return endCustomerClientId
  **/
  @ApiModelProperty(required = true, value = "The client ID of the end customer")

  public String getEndCustomerClientId() {
    return endCustomerClientId;
  }


  public void setEndCustomerClientId(String endCustomerClientId) {
    this.endCustomerClientId = endCustomerClientId;
  }


  public PartnerEndCustomerOAuthStatusUpdatedWebhook environment(WebhookEnvironmentValues environment) {
    
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


  public PartnerEndCustomerOAuthStatusUpdatedWebhook institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The institution ID
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "The institution ID")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public PartnerEndCustomerOAuthStatusUpdatedWebhook institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The institution name
   * @return institutionName
  **/
  @ApiModelProperty(required = true, value = "The institution name")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public PartnerEndCustomerOAuthStatusUpdatedWebhook status(PartnerEndCustomerOAuthStatusUpdatedValues status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public PartnerEndCustomerOAuthStatusUpdatedValues getStatus() {
    return status;
  }


  public void setStatus(PartnerEndCustomerOAuthStatusUpdatedValues status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartnerEndCustomerOAuthStatusUpdatedWebhook partnerEndCustomerOAuthStatusUpdatedWebhook = (PartnerEndCustomerOAuthStatusUpdatedWebhook) o;
    return Objects.equals(this.webhookType, partnerEndCustomerOAuthStatusUpdatedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, partnerEndCustomerOAuthStatusUpdatedWebhook.webhookCode) &&
        Objects.equals(this.endCustomerClientId, partnerEndCustomerOAuthStatusUpdatedWebhook.endCustomerClientId) &&
        Objects.equals(this.environment, partnerEndCustomerOAuthStatusUpdatedWebhook.environment) &&
        Objects.equals(this.institutionId, partnerEndCustomerOAuthStatusUpdatedWebhook.institutionId) &&
        Objects.equals(this.institutionName, partnerEndCustomerOAuthStatusUpdatedWebhook.institutionName) &&
        Objects.equals(this.status, partnerEndCustomerOAuthStatusUpdatedWebhook.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, endCustomerClientId, environment, institutionId, institutionName, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartnerEndCustomerOAuthStatusUpdatedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    endCustomerClientId: ").append(toIndentedString(endCustomerClientId)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

