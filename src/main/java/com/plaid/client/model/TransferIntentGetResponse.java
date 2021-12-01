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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.TransferAuthorizationDecisionRationale;
import com.plaid.client.model.TransferIntentCreateMode;
import com.plaid.client.model.TransferIntentGetFailureReason;
import com.plaid.client.model.TransferUserInResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines the response schema for &#x60;/transfer/intent/get&#x60;
 */
@ApiModel(description = "Defines the response schema for `/transfer/intent/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-01T18:55:04.982Z[GMT]")
public class TransferIntentGetResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  /**
   * The status of the transfer intent.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("PENDING"),
    
    SUCCEEDED("SUCCEEDED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_FAILURE_REASON = "failure_reason";
  @SerializedName(SERIALIZED_NAME_FAILURE_REASON)
  private TransferIntentGetFailureReason failureReason;

  /**
   *  A decision regarding the proposed transfer.  &#x60;APPROVED&#x60; – The proposed transfer has received the end user&#39;s consent and has been approved for processing. Plaid has also reviewed the proposed transfer and has approved it for processing.   &#x60;PERMITTED&#x60; – Plaid was unable to fetch the information required to approve or decline the proposed transfer. You may proceed with the transfer, but further review is recommended. Plaid is awaiting further instructions from the client.  &#x60;DECLINED&#x60; – Plaid reviewed the proposed transfer and declined processing. Refer to the &#x60;code&#x60; field in the &#x60;decision_rationale&#x60; object for details. Null value otherwise.
   */
  @JsonAdapter(AuthorizationDecisionEnum.Adapter.class)
  public enum AuthorizationDecisionEnum {
    APPROVED("APPROVED"),
    
    PERMITTED("PERMITTED"),
    
    DECLINED("DECLINED");

    private String value;

    AuthorizationDecisionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AuthorizationDecisionEnum fromValue(String value) {
      for (AuthorizationDecisionEnum b : AuthorizationDecisionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AuthorizationDecisionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AuthorizationDecisionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AuthorizationDecisionEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return AuthorizationDecisionEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_AUTHORIZATION_DECISION = "authorization_decision";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_DECISION)
  private AuthorizationDecisionEnum authorizationDecision;

  public static final String SERIALIZED_NAME_AUTHORIZATION_DECISION_RATIONALE = "authorization_decision_rationale";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_DECISION_RATIONALE)
  private TransferAuthorizationDecisionRationale authorizationDecisionRationale;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private TransferIntentCreateMode mode;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TransferUserInResponse user;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Map<String, String> metadata = null;


  public TransferIntentGetResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for a transfer intent object.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Plaid's unique identifier for a transfer intent object.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public TransferIntentGetResponse created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime the transfer was created. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;.
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime the transfer was created. This will be of the form `2006-01-02T15:04:05Z`.")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public TransferIntentGetResponse status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The status of the transfer intent.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "The status of the transfer intent.")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public TransferIntentGetResponse transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for the transfer created through the UI. Returned only if the transfer was successfully created. Null value otherwise.
   * @return transferId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Plaid's unique identifier for the transfer created through the UI. Returned only if the transfer was successfully created. Null value otherwise.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public TransferIntentGetResponse failureReason(TransferIntentGetFailureReason failureReason) {
    
    this.failureReason = failureReason;
    return this;
  }

   /**
   * Get failureReason
   * @return failureReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferIntentGetFailureReason getFailureReason() {
    return failureReason;
  }


  public void setFailureReason(TransferIntentGetFailureReason failureReason) {
    this.failureReason = failureReason;
  }


  public TransferIntentGetResponse authorizationDecision(AuthorizationDecisionEnum authorizationDecision) {
    
    this.authorizationDecision = authorizationDecision;
    return this;
  }

   /**
   *  A decision regarding the proposed transfer.  &#x60;APPROVED&#x60; – The proposed transfer has received the end user&#39;s consent and has been approved for processing. Plaid has also reviewed the proposed transfer and has approved it for processing.   &#x60;PERMITTED&#x60; – Plaid was unable to fetch the information required to approve or decline the proposed transfer. You may proceed with the transfer, but further review is recommended. Plaid is awaiting further instructions from the client.  &#x60;DECLINED&#x60; – Plaid reviewed the proposed transfer and declined processing. Refer to the &#x60;code&#x60; field in the &#x60;decision_rationale&#x60; object for details. Null value otherwise.
   * @return authorizationDecision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = " A decision regarding the proposed transfer.  `APPROVED` – The proposed transfer has received the end user's consent and has been approved for processing. Plaid has also reviewed the proposed transfer and has approved it for processing.   `PERMITTED` – Plaid was unable to fetch the information required to approve or decline the proposed transfer. You may proceed with the transfer, but further review is recommended. Plaid is awaiting further instructions from the client.  `DECLINED` – Plaid reviewed the proposed transfer and declined processing. Refer to the `code` field in the `decision_rationale` object for details. Null value otherwise.")

  public AuthorizationDecisionEnum getAuthorizationDecision() {
    return authorizationDecision;
  }


  public void setAuthorizationDecision(AuthorizationDecisionEnum authorizationDecision) {
    this.authorizationDecision = authorizationDecision;
  }


  public TransferIntentGetResponse authorizationDecisionRationale(TransferAuthorizationDecisionRationale authorizationDecisionRationale) {
    
    this.authorizationDecisionRationale = authorizationDecisionRationale;
    return this;
  }

   /**
   * Get authorizationDecisionRationale
   * @return authorizationDecisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationDecisionRationale getAuthorizationDecisionRationale() {
    return authorizationDecisionRationale;
  }


  public void setAuthorizationDecisionRationale(TransferAuthorizationDecisionRationale authorizationDecisionRationale) {
    this.authorizationDecisionRationale = authorizationDecisionRationale;
  }


  public TransferIntentGetResponse accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid &#x60;account_id&#x60; for the account that will be debited or credited.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid `account_id` for the account that will be debited or credited.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TransferIntentGetResponse originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the origination account used for the transfer.
   * @return originationAccountId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for the origination account used for the transfer.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public TransferIntentGetResponse amount(String amount) {
    
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


  public TransferIntentGetResponse mode(TransferIntentCreateMode mode) {
    
    this.mode = mode;
    return this;
  }

   /**
   * Get mode
   * @return mode
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferIntentCreateMode getMode() {
    return mode;
  }


  public void setMode(TransferIntentCreateMode mode) {
    this.mode = mode;
  }


  public TransferIntentGetResponse achClass(ACHClass achClass) {
    
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


  public TransferIntentGetResponse user(TransferUserInResponse user) {
    
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


  public TransferIntentGetResponse description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A description for the underlying transfer. Maximum of 8 characters.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "A description for the underlying transfer. Maximum of 8 characters.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public TransferIntentGetResponse metadata(Map<String, String> metadata) {
    
    this.metadata = metadata;
    return this;
  }

  public TransferIntentGetResponse putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: - The JSON values must be Strings (no nested JSON objects allowed) - Only ASCII characters may be used - Maximum of 50 key/value pairs - Maximum key length of 40 characters - Maximum value length of 500 characters ")

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferIntentGetResponse transferIntentGetResponse = (TransferIntentGetResponse) o;
    return Objects.equals(this.id, transferIntentGetResponse.id) &&
        Objects.equals(this.created, transferIntentGetResponse.created) &&
        Objects.equals(this.status, transferIntentGetResponse.status) &&
        Objects.equals(this.transferId, transferIntentGetResponse.transferId) &&
        Objects.equals(this.failureReason, transferIntentGetResponse.failureReason) &&
        Objects.equals(this.authorizationDecision, transferIntentGetResponse.authorizationDecision) &&
        Objects.equals(this.authorizationDecisionRationale, transferIntentGetResponse.authorizationDecisionRationale) &&
        Objects.equals(this.accountId, transferIntentGetResponse.accountId) &&
        Objects.equals(this.originationAccountId, transferIntentGetResponse.originationAccountId) &&
        Objects.equals(this.amount, transferIntentGetResponse.amount) &&
        Objects.equals(this.mode, transferIntentGetResponse.mode) &&
        Objects.equals(this.achClass, transferIntentGetResponse.achClass) &&
        Objects.equals(this.user, transferIntentGetResponse.user) &&
        Objects.equals(this.description, transferIntentGetResponse.description) &&
        Objects.equals(this.metadata, transferIntentGetResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, status, transferId, failureReason, authorizationDecision, authorizationDecisionRationale, accountId, originationAccountId, amount, mode, achClass, user, description, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferIntentGetResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    authorizationDecision: ").append(toIndentedString(authorizationDecision)).append("\n");
    sb.append("    authorizationDecisionRationale: ").append(toIndentedString(authorizationDecisionRationale)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
