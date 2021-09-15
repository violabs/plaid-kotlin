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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.TransferFailure;
import com.plaid.client.model.TransferNetwork;
import com.plaid.client.model.TransferStatus;
import com.plaid.client.model.TransferType;
import com.plaid.client.model.TransferUserInResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a transfer within the Transfers API.
 */
@ApiModel(description = "Represents a transfer within the Transfers API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-15T21:50:59.429Z[GMT]")
public class Transfer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TransferType type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TransferUserInResponse user;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransferStatus status;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private TransferNetwork network;

  public static final String SERIALIZED_NAME_CANCELLABLE = "cancellable";
  @SerializedName(SERIALIZED_NAME_CANCELLABLE)
  private Boolean cancellable;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private TransferFailure failureReason;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = new HashMap<>();

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;


  public Transfer id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a transfer.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Transfer achClass(ACHClass achClass) {
    
    this.achClass = achClass;
    return this;
  }

   /**
   * Get achClass
   * @return achClass
  **/
  @ApiModelProperty(required = true, value = "")

  public ACHClass getAchClass() {
    return achClass;
  }


  public void setAchClass(ACHClass achClass) {
    this.achClass = achClass;
  }


  public Transfer accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID that should be credited/debited for this transfer.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The account ID that should be credited/debited for this transfer.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Transfer type(TransferType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferType getType() {
    return type;
  }


  public void setType(TransferType type) {
    this.type = type;
  }


  public Transfer user(TransferUserInResponse user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferUserInResponse getUser() {
    return user;
  }


  public void setUser(TransferUserInResponse user) {
    this.user = user;
  }


  public Transfer amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transfer (decimal string with two digits of precision e.g. “10.00”).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transfer (decimal string with two digits of precision e.g. “10.00”).")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public Transfer description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the transfer.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the transfer.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Transfer created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime when this transfer was created. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime when this transfer was created. This will be of the form `2006-01-02T15:04:05Z`")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Transfer status(TransferStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferStatus getStatus() {
    return status;
  }


  public void setStatus(TransferStatus status) {
    this.status = status;
  }


  public Transfer network(TransferNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferNetwork getNetwork() {
    return network;
  }


  public void setNetwork(TransferNetwork network) {
    this.network = network;
  }


  public Transfer cancellable(Boolean cancellable) {
    
    this.cancellable = cancellable;
    return this;
  }

   /**
   * When &#x60;true&#x60;, you can still cancel this transfer.
   * @return cancellable
  **/
  @ApiModelProperty(required = true, value = "When `true`, you can still cancel this transfer.")

  public Boolean getCancellable() {
    return cancellable;
  }


  public void setCancellable(Boolean cancellable) {
    this.cancellable = cancellable;
  }


  public Transfer failureReason(TransferFailure failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferFailure getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(TransferFailure failureReason) {
    this.failureReason = failureReason;
  }


  public Transfer metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public Transfer putMetadataItem(String key, String metadataItem) {
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters ")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  public Transfer originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the origination account that was used for this transfer.
   * @return originationAccountId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for the origination account that was used for this transfer.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transfer transfer = (Transfer) o;
    return Objects.equals(this.id, transfer.id) &&
        Objects.equals(this.achClass, transfer.achClass) &&
        Objects.equals(this.accountId, transfer.accountId) &&
        Objects.equals(this.type, transfer.type) &&
        Objects.equals(this.user, transfer.user) &&
        Objects.equals(this.amount, transfer.amount) &&
        Objects.equals(this.description, transfer.description) &&
        Objects.equals(this.created, transfer.created) &&
        Objects.equals(this.status, transfer.status) &&
        Objects.equals(this.network, transfer.network) &&
        Objects.equals(this.cancellable, transfer.cancellable) &&
        Objects.equals(this.failureReason, transfer.failureReason) &&
        Objects.equals(this.metadata, transfer.metadata) &&
        Objects.equals(this.originationAccountId, transfer.originationAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, achClass, accountId, type, user, amount, description, created, status, network, cancellable, failureReason, metadata, originationAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    cancellable: ").append(toIndentedString(cancellable)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
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

