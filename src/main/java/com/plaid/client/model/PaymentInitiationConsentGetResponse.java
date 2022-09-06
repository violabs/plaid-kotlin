/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
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
import com.plaid.client.model.PaymentInitiationConsent;
import com.plaid.client.model.PaymentInitiationConsentConstraints;
import com.plaid.client.model.PaymentInitiationConsentScope;
import com.plaid.client.model.PaymentInitiationConsentStatus;
import com.plaid.client.model.PaymentInitiationRecipientGetResponseAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentInitiationConsentGetResponse defines the response schema for &#x60;/payment_initation/consent/get&#x60;
 */
@ApiModel(description = "PaymentInitiationConsentGetResponse defines the response schema for `/payment_initation/consent/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T16:58:21.384791Z[Etc/UTC]")
public class PaymentInitiationConsentGetResponse {
  public static final String SERIALIZED_NAME_CONSENT_ID = "consent_id";
  @SerializedName(SERIALIZED_NAME_CONSENT_ID)
  private String consentId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private PaymentInitiationConsentStatus status;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_RECIPIENT_ID = "recipient_id";
  @SerializedName(SERIALIZED_NAME_RECIPIENT_ID)
  private String recipientId;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_CONSTRAINTS = "constraints";
  @SerializedName(SERIALIZED_NAME_CONSTRAINTS)
  private PaymentInitiationConsentConstraints constraints;

  public static final String SERIALIZED_NAME_SCOPES = "scopes";
  @SerializedName(SERIALIZED_NAME_SCOPES)
  private List<PaymentInitiationConsentScope> scopes = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PaymentInitiationConsentGetResponse consentId(String consentId) {
    
    this.consentId = consentId;
    return this;
  }

   /**
   * The consent ID.
   * @return consentId
  **/
  @ApiModelProperty(required = true, value = "The consent ID.")

  public String getConsentId() {
    return consentId;
  }


  public void setConsentId(String consentId) {
    this.consentId = consentId;
  }


  public PaymentInitiationConsentGetResponse status(PaymentInitiationConsentStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationConsentStatus getStatus() {
    return status;
  }


  public void setStatus(PaymentInitiationConsentStatus status) {
    this.status = status;
  }


  public PaymentInitiationConsentGetResponse createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Consent creation timestamp, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Consent creation timestamp, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public PaymentInitiationConsentGetResponse recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * The ID of the recipient the payment consent is for.
   * @return recipientId
  **/
  @ApiModelProperty(required = true, value = "The ID of the recipient the payment consent is for.")

  public String getRecipientId() {
    return recipientId;
  }


  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public PaymentInitiationConsentGetResponse reference(String reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * A reference for the payment consent.
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "A reference for the payment consent.")

  public String getReference() {
    return reference;
  }


  public void setReference(String reference) {
    this.reference = reference;
  }


  public PaymentInitiationConsentGetResponse constraints(PaymentInitiationConsentConstraints constraints) {
    
    this.constraints = constraints;
    return this;
  }

   /**
   * Get constraints
   * @return constraints
  **/
  @ApiModelProperty(required = true, value = "")

  public PaymentInitiationConsentConstraints getConstraints() {
    return constraints;
  }


  public void setConstraints(PaymentInitiationConsentConstraints constraints) {
    this.constraints = constraints;
  }


  public PaymentInitiationConsentGetResponse scopes(List<PaymentInitiationConsentScope> scopes) {
    
    this.scopes = scopes;
    return this;
  }

  public PaymentInitiationConsentGetResponse addScopesItem(PaymentInitiationConsentScope scopesItem) {
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * An array of payment consent scopes.
   * @return scopes
  **/
  @ApiModelProperty(required = true, value = "An array of payment consent scopes.")

  public List<PaymentInitiationConsentScope> getScopes() {
    return scopes;
  }


  public void setScopes(List<PaymentInitiationConsentScope> scopes) {
    this.scopes = scopes;
  }


  public PaymentInitiationConsentGetResponse requestId(String requestId) {
    
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
    PaymentInitiationConsentGetResponse paymentInitiationConsentGetResponse = (PaymentInitiationConsentGetResponse) o;
    return Objects.equals(this.consentId, paymentInitiationConsentGetResponse.consentId) &&
        Objects.equals(this.status, paymentInitiationConsentGetResponse.status) &&
        Objects.equals(this.createdAt, paymentInitiationConsentGetResponse.createdAt) &&
        Objects.equals(this.recipientId, paymentInitiationConsentGetResponse.recipientId) &&
        Objects.equals(this.reference, paymentInitiationConsentGetResponse.reference) &&
        Objects.equals(this.constraints, paymentInitiationConsentGetResponse.constraints) &&
        Objects.equals(this.scopes, paymentInitiationConsentGetResponse.scopes) &&
        Objects.equals(this.requestId, paymentInitiationConsentGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consentId, status, createdAt, recipientId, reference, constraints, scopes, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationConsentGetResponse {\n");
    sb.append("    consentId: ").append(toIndentedString(consentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
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

