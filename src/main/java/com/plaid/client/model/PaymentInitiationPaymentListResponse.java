/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.11.0
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
import com.plaid.client.model.PaymentInitiationPaymentGetResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentInitiationPaymentListResponse defines the response schema for &#x60;/payment_initiation/payment/list&#x60;
 */
@ApiModel(description = "PaymentInitiationPaymentListResponse defines the response schema for `/payment_initiation/payment/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-31T09:49:55.055Z[GMT]")
public class PaymentInitiationPaymentListResponse {
  public static final String SERIALIZED_NAME_PAYMENTS = "payments";
  @SerializedName(SERIALIZED_NAME_PAYMENTS)
  private List<PaymentInitiationPaymentGetResponse> payments = new ArrayList<>();

  public static final String SERIALIZED_NAME_NEXT_CURSOR = "next_cursor";
  @SerializedName(SERIALIZED_NAME_NEXT_CURSOR)
  private String nextCursor;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public PaymentInitiationPaymentListResponse payments(List<PaymentInitiationPaymentGetResponse> payments) {
    
    this.payments = payments;
    return this;
  }

  public PaymentInitiationPaymentListResponse addPaymentsItem(PaymentInitiationPaymentGetResponse paymentsItem) {
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * An array of payments that have been created, associated with the given &#x60;client_id&#x60;.
   * @return payments
  **/
  @ApiModelProperty(required = true, value = "An array of payments that have been created, associated with the given `client_id`.")

  public List<PaymentInitiationPaymentGetResponse> getPayments() {
    return payments;
  }


  public void setPayments(List<PaymentInitiationPaymentGetResponse> payments) {
    this.payments = payments;
  }


  public PaymentInitiationPaymentListResponse nextCursor(String nextCursor) {
    
    this.nextCursor = nextCursor;
    return this;
  }

   /**
   * The value that, when used as the optional &#x60;cursor&#x60; parameter to &#x60;/payment_initiation/payment/list&#x60;, will return the next unreturned payment as its first payment.
   * @return nextCursor
  **/
  @ApiModelProperty(required = true, value = "The value that, when used as the optional `cursor` parameter to `/payment_initiation/payment/list`, will return the next unreturned payment as its first payment.")

  public String getNextCursor() {
    return nextCursor;
  }


  public void setNextCursor(String nextCursor) {
    this.nextCursor = nextCursor;
  }


  public PaymentInitiationPaymentListResponse requestId(String requestId) {
    
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
    PaymentInitiationPaymentListResponse paymentInitiationPaymentListResponse = (PaymentInitiationPaymentListResponse) o;
    return Objects.equals(this.payments, paymentInitiationPaymentListResponse.payments) &&
        Objects.equals(this.nextCursor, paymentInitiationPaymentListResponse.nextCursor) &&
        Objects.equals(this.requestId, paymentInitiationPaymentListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payments, nextCursor, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInitiationPaymentListResponse {\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
    sb.append("    nextCursor: ").append(toIndentedString(nextCursor)).append("\n");
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

