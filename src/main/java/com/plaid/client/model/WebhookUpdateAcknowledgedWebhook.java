/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.54.2
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
import com.plaid.client.model.Error;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Fired when an Item&#39;s webhook is updated. This will be sent to the newly specified webhook.
 */
@ApiModel(description = "Fired when an Item's webhook is updated. This will be sent to the newly specified webhook.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-01T18:55:04.982Z[GMT]")
public class WebhookUpdateAcknowledgedWebhook {
  public static final String SERIALIZED_NAME_WEBHOOK_TYPE = "webhook_type";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_TYPE)
  private String webhookType;

  public static final String SERIALIZED_NAME_WEBHOOK_CODE = "webhook_code";
  @SerializedName(SERIALIZED_NAME_WEBHOOK_CODE)
  private String webhookCode;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_NEW_WEBHOOK_URL = "new_webhook_url";
  @SerializedName(SERIALIZED_NAME_NEW_WEBHOOK_URL)
  private String newWebhookUrl;

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;


  public WebhookUpdateAcknowledgedWebhook webhookType(String webhookType) {
    
    this.webhookType = webhookType;
    return this;
  }

   /**
   * &#x60;ITEM&#x60;
   * @return webhookType
  **/
  @ApiModelProperty(required = true, value = "`ITEM`")

  public String getWebhookType() {
    return webhookType;
  }


  public void setWebhookType(String webhookType) {
    this.webhookType = webhookType;
  }


  public WebhookUpdateAcknowledgedWebhook webhookCode(String webhookCode) {
    
    this.webhookCode = webhookCode;
    return this;
  }

   /**
   * &#x60;WEBHOOK_UPDATE_ACKNOWLEDGED&#x60;
   * @return webhookCode
  **/
  @ApiModelProperty(required = true, value = "`WEBHOOK_UPDATE_ACKNOWLEDGED`")

  public String getWebhookCode() {
    return webhookCode;
  }


  public void setWebhookCode(String webhookCode) {
    this.webhookCode = webhookCode;
  }


  public WebhookUpdateAcknowledgedWebhook itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The &#x60;item_id&#x60; of the Item associated with this webhook, warning, or error
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The `item_id` of the Item associated with this webhook, warning, or error")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public WebhookUpdateAcknowledgedWebhook newWebhookUrl(String newWebhookUrl) {
    
    this.newWebhookUrl = newWebhookUrl;
    return this;
  }

   /**
   * The new webhook URL
   * @return newWebhookUrl
  **/
  @ApiModelProperty(required = true, value = "The new webhook URL")

  public String getNewWebhookUrl() {
    return newWebhookUrl;
  }


  public void setNewWebhookUrl(String newWebhookUrl) {
    this.newWebhookUrl = newWebhookUrl;
  }


  public WebhookUpdateAcknowledgedWebhook error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookUpdateAcknowledgedWebhook webhookUpdateAcknowledgedWebhook = (WebhookUpdateAcknowledgedWebhook) o;
    return Objects.equals(this.webhookType, webhookUpdateAcknowledgedWebhook.webhookType) &&
        Objects.equals(this.webhookCode, webhookUpdateAcknowledgedWebhook.webhookCode) &&
        Objects.equals(this.itemId, webhookUpdateAcknowledgedWebhook.itemId) &&
        Objects.equals(this.newWebhookUrl, webhookUpdateAcknowledgedWebhook.newWebhookUrl) &&
        Objects.equals(this.error, webhookUpdateAcknowledgedWebhook.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webhookType, webhookCode, itemId, newWebhookUrl, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookUpdateAcknowledgedWebhook {\n");
    sb.append("    webhookType: ").append(toIndentedString(webhookType)).append("\n");
    sb.append("    webhookCode: ").append(toIndentedString(webhookCode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    newWebhookUrl: ").append(toIndentedString(newWebhookUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
