/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.205.3
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
import java.time.OffsetDateTime;

/**
 * PaymentInitiationPaymentListRequest defines the request schema for &#x60;/payment_initiation/payment/list&#x60;
 */
@ApiModel(description = "PaymentInitiationPaymentListRequest defines the request schema for `/payment_initiation/payment/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T17:52:41.932844Z[Etc/UTC]")
public class PaymentInitiationPaymentListRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private Integer count = 10;

  public static final String SERIALIZED_NAME_CURSOR = "cursor";
  @SerializedName(SERIALIZED_NAME_CURSOR)
  private OffsetDateTime cursor;

  public static final String SERIALIZED_NAME_CONSENT_ID = "consent_id";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;


  public PaymentInitiationPaymentListRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public PaymentInitiationPaymentListRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public PaymentInitiationPaymentListRequest count(Integer count) {
    
    this.count = count;
    return this;
  }

   /**
   * The maximum number of payments to return. If &#x60;count&#x60; is not specified, a maximum of 10 payments will be returned, beginning with the most recent payment before the cursor (if specified).
   * minimum: 1
   * maximum: 200
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The maximum number of payments to return. If `count` is not specified, a maximum of 10 payments will be returned, beginning with the most recent payment before the cursor (if specified).")

  public Integer getCount() {
    return count;
  }


  public void setCount(Integer count) {
    this.count = count;
  }


  public PaymentInitiationPaymentListRequest cursor(OffsetDateTime cursor) {
    
    this.cursor = cursor;
    return this;
  }

   /**
   * A string in RFC 3339 format (i.e. \&quot;2019-12-06T22:35:49Z\&quot;). Only payments created before the cursor will be returned.
   * @return cursor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A string in RFC 3339 format (i.e. \"2019-12-06T22:35:49Z\"). Only payments created before the cursor will be returned.")

  public OffsetDateTime getCursor() {
    return cursor;
  }


  public void setCursor(OffsetDateTime cursor) {
    this.cursor = cursor;
  }


  public PaymentInitiationPaymentListRequest consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * The consent ID. If specified, only payments, executed using this consent, will be returned.
   * @return consentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The consent ID. If specified, only payments, executed using this consent, will be returned.")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInitiationPaymentListRequest paymentInitiationPaymentListRequest = (PaymentInitiationPaymentListRequest) o;
    return Objects.equals(this.clientId, paymentInitiationPaymentListRequest.clientId) &&
        Objects.equals(this.secret, paymentInitiationPaymentListRequest.secret) &&
        Objects.equals(this.count, paymentInitiationPaymentListRequest.count) &&
        Objects.equals(this.cursor, paymentInitiationPaymentListRequest.cursor) &&
        Objects.equals(this.consentId, paymentInitiationPaymentListRequest.consentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, count, cursor, consentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationPaymentListRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
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

