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
import com.plaid.client.model.TransferRefundFailure;
import com.plaid.client.model.TransferRefundStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Represents a refund within the Transfers API.
 */
@ApiModel(description = "Represents a refund within the Transfers API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T22:39:54.038561Z[Etc/UTC]")
public class TransferRefund {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransferRefundStatus status;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private TransferRefundFailure failureReason;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;


  public TransferRefund id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Plaid’s unique identifier for a refund.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a refund.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransferRefund transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * The ID of the transfer to refund.
   * @return transferId
  **/
  @ApiModelProperty(required = true, value = "The ID of the transfer to refund.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public TransferRefund amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the refund (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the refund (decimal string with two digits of precision e.g. \"10.00\").")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferRefund status(TransferRefundStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferRefundStatus getStatus() {
    return status;
  }


  public void setStatus(TransferRefundStatus status) {
    this.status = status;
  }


  public TransferRefund failureReason(TransferRefundFailure failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferRefundFailure getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(TransferRefundFailure failureReason) {
    this.failureReason = failureReason;
  }


  public TransferRefund created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime when this refund was created. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime when this refund was created. This will be of the form `2006-01-02T15:04:05Z`")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRefund transferRefund = (TransferRefund) o;
    return Objects.equals(this.id, transferRefund.id) &&
        Objects.equals(this.transferId, transferRefund.transferId) &&
        Objects.equals(this.amount, transferRefund.amount) &&
        Objects.equals(this.status, transferRefund.status) &&
        Objects.equals(this.failureReason, transferRefund.failureReason) &&
        Objects.equals(this.created, transferRefund.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transferId, amount, status, failureReason, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRefund {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

