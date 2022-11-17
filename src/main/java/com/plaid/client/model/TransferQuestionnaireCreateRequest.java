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
import com.plaid.client.model.DisbursementLimits;
import com.plaid.client.model.PaymentLimits;
import com.plaid.client.model.TransactionFrequency;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/transfer/questionnaire/create&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/questionnaire/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T17:52:41.932844Z[Etc/UTC]")
public class TransferQuestionnaireCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ORIGINATOR_CLIENT_ID = "originator_client_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_CLIENT_ID)
  private String originatorClientId;

  public static final String SERIALIZED_NAME_REDIRECT_URI = "redirect_uri";
  @SerializedName(SERIALIZED_NAME_REDIRECT_URI)
  private String redirectUri;

  public static final String SERIALIZED_NAME_DISBURSEMENT_LIMITS = "disbursement_limits";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT_LIMITS)
  private DisbursementLimits disbursementLimits;

  public static final String SERIALIZED_NAME_PAYMENT_LIMITS = "payment_limits";
  @SerializedName(SERIALIZED_NAME_PAYMENT_LIMITS)
  private PaymentLimits paymentLimits;

  public static final String SERIALIZED_NAME_TRANSACTION_FREQUENCY = "transaction_frequency";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_FREQUENCY)
  private TransactionFrequency transactionFrequency;


  public TransferQuestionnaireCreateRequest clientId(String clientId) {
    
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


  public TransferQuestionnaireCreateRequest secret(String secret) {
    
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


  public TransferQuestionnaireCreateRequest originatorClientId(String originatorClientId) {
    
    this.originatorClientId = originatorClientId;
    return this;
  }

   /**
   * Client ID of the end customer.
   * @return originatorClientId
  **/
  @ApiModelProperty(required = true, value = "Client ID of the end customer.")

  public String getOriginatorClientId() {
    return originatorClientId;
  }


  public void setOriginatorClientId(String originatorClientId) {
    this.originatorClientId = originatorClientId;
  }


  public TransferQuestionnaireCreateRequest redirectUri(String redirectUri) {
    
    this.redirectUri = redirectUri;
    return this;
  }

   /**
   * URL the end customer will be redirected to after completing questions in Plaid-hosted onboarding flow.
   * @return redirectUri
  **/
  @ApiModelProperty(required = true, value = "URL the end customer will be redirected to after completing questions in Plaid-hosted onboarding flow.")

  public String getRedirectUri() {
    return redirectUri;
  }


  public void setRedirectUri(String redirectUri) {
    this.redirectUri = redirectUri;
  }


  public TransferQuestionnaireCreateRequest disbursementLimits(DisbursementLimits disbursementLimits) {
    
    this.disbursementLimits = disbursementLimits;
    return this;
  }

   /**
   * Get disbursementLimits
   * @return disbursementLimits
  **/
  @ApiModelProperty(required = true, value = "")

  public DisbursementLimits getDisbursementLimits() {
    return disbursementLimits;
  }


  public void setDisbursementLimits(DisbursementLimits disbursementLimits) {
    this.disbursementLimits = disbursementLimits;
  }


  public TransferQuestionnaireCreateRequest paymentLimits(PaymentLimits paymentLimits) {
    
    this.paymentLimits = paymentLimits;
    return this;
  }

   /**
   * Get paymentLimits
   * @return paymentLimits
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentLimits getPaymentLimits() {
    return paymentLimits;
  }


  public void setPaymentLimits(PaymentLimits paymentLimits) {
    this.paymentLimits = paymentLimits;
  }


  public TransferQuestionnaireCreateRequest transactionFrequency(TransactionFrequency transactionFrequency) {
    
    this.transactionFrequency = transactionFrequency;
    return this;
  }

   /**
   * Get transactionFrequency
   * @return transactionFrequency
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionFrequency getTransactionFrequency() {
    return transactionFrequency;
  }


  public void setTransactionFrequency(TransactionFrequency transactionFrequency) {
    this.transactionFrequency = transactionFrequency;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferQuestionnaireCreateRequest transferQuestionnaireCreateRequest = (TransferQuestionnaireCreateRequest) o;
    return Objects.equals(this.clientId, transferQuestionnaireCreateRequest.clientId) &&
        Objects.equals(this.secret, transferQuestionnaireCreateRequest.secret) &&
        Objects.equals(this.originatorClientId, transferQuestionnaireCreateRequest.originatorClientId) &&
        Objects.equals(this.redirectUri, transferQuestionnaireCreateRequest.redirectUri) &&
        Objects.equals(this.disbursementLimits, transferQuestionnaireCreateRequest.disbursementLimits) &&
        Objects.equals(this.paymentLimits, transferQuestionnaireCreateRequest.paymentLimits) &&
        Objects.equals(this.transactionFrequency, transferQuestionnaireCreateRequest.transactionFrequency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, originatorClientId, redirectUri, disbursementLimits, paymentLimits, transactionFrequency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferQuestionnaireCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    originatorClientId: ").append(toIndentedString(originatorClientId)).append("\n");
    sb.append("    redirectUri: ").append(toIndentedString(redirectUri)).append("\n");
    sb.append("    disbursementLimits: ").append(toIndentedString(disbursementLimits)).append("\n");
    sb.append("    paymentLimits: ").append(toIndentedString(paymentLimits)).append("\n");
    sb.append("    transactionFrequency: ").append(toIndentedString(transactionFrequency)).append("\n");
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

