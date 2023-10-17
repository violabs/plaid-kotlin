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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.TransferAuthorizationGuaranteeDecision;
import com.plaid.client.model.TransferAuthorizationGuaranteeDecisionRationale;
import com.plaid.client.model.TransferCreditFundsSource;
import com.plaid.client.model.TransferExpectedSweepSettlementScheduleItem;
import com.plaid.client.model.TransferFailure;
import com.plaid.client.model.TransferNetwork;
import com.plaid.client.model.TransferRefund;
import com.plaid.client.model.TransferStatus;
import com.plaid.client.model.TransferSweepStatus;
import com.plaid.client.model.TransferType;
import com.plaid.client.model.TransferUserInResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a transfer within the Transfers API.
 */
@ApiModel(description = "Represents a transfer within the Transfers API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class Transfer {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_AUTHORIZATION_ID = "authorization_id";
  @SerializedName(SERIALIZED_NAME_AUTHORIZATION_ID)
  private String authorizationId;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_FUNDING_ACCOUNT_ID = "funding_account_id";
  @SerializedName(SERIALIZED_NAME_FUNDING_ACCOUNT_ID)
  private String fundingAccountId;

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

  public static final String SERIALIZED_NAME_SWEEP_STATUS = "sweep_status";
  @SerializedName(SERIALIZED_NAME_SWEEP_STATUS)
  private TransferSweepStatus sweepStatus;

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

  public static final String SERIALIZED_NAME_GUARANTEE_DECISION = "guarantee_decision";
  @SerializedName(SERIALIZED_NAME_GUARANTEE_DECISION)
  private TransferAuthorizationGuaranteeDecision guaranteeDecision;

  public static final String SERIALIZED_NAME_GUARANTEE_DECISION_RATIONALE = "guarantee_decision_rationale";
  @SerializedName(SERIALIZED_NAME_GUARANTEE_DECISION_RATIONALE)
  private TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_STANDARD_RETURN_WINDOW = "standard_return_window";
  @SerializedName(SERIALIZED_NAME_STANDARD_RETURN_WINDOW)
  private LocalDate standardReturnWindow;

  public static final String SERIALIZED_NAME_UNAUTHORIZED_RETURN_WINDOW = "unauthorized_return_window";
  @SerializedName(SERIALIZED_NAME_UNAUTHORIZED_RETURN_WINDOW)
  private LocalDate unauthorizedReturnWindow;

  public static final String SERIALIZED_NAME_EXPECTED_SETTLEMENT_DATE = "expected_settlement_date";
  @SerializedName(SERIALIZED_NAME_EXPECTED_SETTLEMENT_DATE)
  private LocalDate expectedSettlementDate;

  public static final String SERIALIZED_NAME_ORIGINATOR_CLIENT_ID = "originator_client_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATOR_CLIENT_ID)
  private String originatorClientId;

  public static final String SERIALIZED_NAME_REFUNDS = "refunds";
  @SerializedName(SERIALIZED_NAME_REFUNDS)
  private List<TransferRefund> refunds = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECURRING_TRANSFER_ID = "recurring_transfer_id";
  @SerializedName(SERIALIZED_NAME_RECURRING_TRANSFER_ID)
  private String recurringTransferId;

  public static final String SERIALIZED_NAME_EXPECTED_SWEEP_SETTLEMENT_SCHEDULE = "expected_sweep_settlement_schedule";
  @SerializedName(SERIALIZED_NAME_EXPECTED_SWEEP_SETTLEMENT_SCHEDULE)
  private List<TransferExpectedSweepSettlementScheduleItem> expectedSweepSettlementSchedule = null;

  public static final String SERIALIZED_NAME_CREDIT_FUNDS_SOURCE = "credit_funds_source";
  @SerializedName(SERIALIZED_NAME_CREDIT_FUNDS_SOURCE)
  private TransferCreditFundsSource creditFundsSource;

  public static final String SERIALIZED_NAME_FACILITATOR_FEE = "facilitator_fee";
  @SerializedName(SERIALIZED_NAME_FACILITATOR_FEE)
  private String facilitatorFee;


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


  public Transfer authorizationId(String authorizationId) {
    
    this.authorizationId = authorizationId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a transfer authorization.
   * @return authorizationId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a transfer authorization.")

  public String getAuthorizationId() {
    return authorizationId;
  }


  public void setAuthorizationId(String authorizationId) {
    this.authorizationId = authorizationId;
  }


  public Transfer achClass(ACHClass achClass) {
    
    this.achClass = achClass;
    return this;
  }

   /**
   * Get achClass
   * @return achClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

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
   * The Plaid &#x60;account_id&#x60; corresponding to the end-user account that will be debited or credited.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The Plaid `account_id` corresponding to the end-user account that will be debited or credited.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public Transfer fundingAccountId(String fundingAccountId) {
    
    this.fundingAccountId = fundingAccountId;
    return this;
  }

   /**
   * The id of the associated funding account, available in the Plaid Dashboard. If present, this indicates which of your business checking accounts will be credited or debited.
   * @return fundingAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The id of the associated funding account, available in the Plaid Dashboard. If present, this indicates which of your business checking accounts will be credited or debited.")

  public String getFundingAccountId() {
    return fundingAccountId;
  }


  public void setFundingAccountId(String fundingAccountId) {
    this.fundingAccountId = fundingAccountId;
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
   * The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transfer (decimal string with two digits of precision e.g. \"10.00\").")

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


  public Transfer sweepStatus(TransferSweepStatus sweepStatus) {
    
    this.sweepStatus = sweepStatus;
    return this;
  }

   /**
   * Get sweepStatus
   * @return sweepStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TransferSweepStatus getSweepStatus() {
    return sweepStatus;
  }


  public void setSweepStatus(TransferSweepStatus sweepStatus) {
    this.sweepStatus = sweepStatus;
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
   * The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: The JSON values must be Strings (no nested JSON objects allowed) Only ASCII characters may be used Maximum of 50 key/value pairs Maximum key length of 40 characters Maximum value length of 500 characters 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The Metadata object is a mapping of client-provided string fields to any string value. The following limitations apply: The JSON values must be Strings (no nested JSON objects allowed) Only ASCII characters may be used Maximum of 50 key/value pairs Maximum key length of 40 characters Maximum value length of 500 characters ")

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


  public Transfer guaranteeDecision(TransferAuthorizationGuaranteeDecision guaranteeDecision) {
    
    this.guaranteeDecision = guaranteeDecision;
    return this;
  }

   /**
   * Get guaranteeDecision
   * @return guaranteeDecision
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationGuaranteeDecision getGuaranteeDecision() {
    return guaranteeDecision;
  }


  public void setGuaranteeDecision(TransferAuthorizationGuaranteeDecision guaranteeDecision) {
    this.guaranteeDecision = guaranteeDecision;
  }


  public Transfer guaranteeDecisionRationale(TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale) {
    
    this.guaranteeDecisionRationale = guaranteeDecisionRationale;
    return this;
  }

   /**
   * Get guaranteeDecisionRationale
   * @return guaranteeDecisionRationale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferAuthorizationGuaranteeDecisionRationale getGuaranteeDecisionRationale() {
    return guaranteeDecisionRationale;
  }


  public void setGuaranteeDecisionRationale(TransferAuthorizationGuaranteeDecisionRationale guaranteeDecisionRationale) {
    this.guaranteeDecisionRationale = guaranteeDecisionRationale;
  }


  public Transfer isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the transfer amount, e.g. \&quot;USD\&quot;
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the transfer amount, e.g. \"USD\"")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public Transfer standardReturnWindow(LocalDate standardReturnWindow) {
    
    this.standardReturnWindow = standardReturnWindow;
    return this;
  }

   /**
   * The date 3 business days from settlement date indicating the following ACH returns can no longer happen: R01, R02, R03, R29. This will be of the form YYYY-MM-DD.
   * @return standardReturnWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date 3 business days from settlement date indicating the following ACH returns can no longer happen: R01, R02, R03, R29. This will be of the form YYYY-MM-DD.")

  public LocalDate getStandardReturnWindow() {
    return standardReturnWindow;
  }


  public void setStandardReturnWindow(LocalDate standardReturnWindow) {
    this.standardReturnWindow = standardReturnWindow;
  }


  public Transfer unauthorizedReturnWindow(LocalDate unauthorizedReturnWindow) {
    
    this.unauthorizedReturnWindow = unauthorizedReturnWindow;
    return this;
  }

   /**
   * The date 61 business days from settlement date indicating the following ACH returns can no longer happen: R05, R07, R10, R11, R51, R33, R37, R38, R51, R52, R53. This will be of the form YYYY-MM-DD.
   * @return unauthorizedReturnWindow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date 61 business days from settlement date indicating the following ACH returns can no longer happen: R05, R07, R10, R11, R51, R33, R37, R38, R51, R52, R53. This will be of the form YYYY-MM-DD.")

  public LocalDate getUnauthorizedReturnWindow() {
    return unauthorizedReturnWindow;
  }


  public void setUnauthorizedReturnWindow(LocalDate unauthorizedReturnWindow) {
    this.unauthorizedReturnWindow = unauthorizedReturnWindow;
  }


  public Transfer expectedSettlementDate(LocalDate expectedSettlementDate) {
    
    this.expectedSettlementDate = expectedSettlementDate;
    return this;
  }

   /**
   * The expected date when the full amount of the transfer settles at the consumers’ account, if the transfer is credit; or at the customer&#39;s business checking account, if the transfer is debit. Only set for ACH transfers and is null for non-ACH transfers. Only set for ACH transfers. This will be of the form YYYY-MM-DD.
   * @return expectedSettlementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The expected date when the full amount of the transfer settles at the consumers’ account, if the transfer is credit; or at the customer's business checking account, if the transfer is debit. Only set for ACH transfers and is null for non-ACH transfers. Only set for ACH transfers. This will be of the form YYYY-MM-DD.")

  public LocalDate getExpectedSettlementDate() {
    return expectedSettlementDate;
  }


  public void setExpectedSettlementDate(LocalDate expectedSettlementDate) {
    this.expectedSettlementDate = expectedSettlementDate;
  }


  public Transfer originatorClientId(String originatorClientId) {
    
    this.originatorClientId = originatorClientId;
    return this;
  }

   /**
   * The Plaid client ID that is the originator of this transfer. Only present if created on behalf of another client as a [Platform customer](https://plaid.com/docs/transfer/application/#originators-vs-platforms).
   * @return originatorClientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The Plaid client ID that is the originator of this transfer. Only present if created on behalf of another client as a [Platform customer](https://plaid.com/docs/transfer/application/#originators-vs-platforms).")

  public String getOriginatorClientId() {
    return originatorClientId;
  }


  public void setOriginatorClientId(String originatorClientId) {
    this.originatorClientId = originatorClientId;
  }


  public Transfer refunds(List<TransferRefund> refunds) {
    
    this.refunds = refunds;
    return this;
  }

  public Transfer addRefundsItem(TransferRefund refundsItem) {
    this.refunds.add(refundsItem);
    return this;
  }

   /**
   * A list of refunds associated with this transfer.
   * @return refunds
  **/
  @ApiModelProperty(required = true, value = "A list of refunds associated with this transfer.")

  public List<TransferRefund> getRefunds() {
    return refunds;
  }


  public void setRefunds(List<TransferRefund> refunds) {
    this.refunds = refunds;
  }


  public Transfer recurringTransferId(String recurringTransferId) {
    
    this.recurringTransferId = recurringTransferId;
    return this;
  }

   /**
   * The id of the recurring transfer if this transfer belongs to a recurring transfer.
   * @return recurringTransferId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The id of the recurring transfer if this transfer belongs to a recurring transfer.")

  public String getRecurringTransferId() {
    return recurringTransferId;
  }


  public void setRecurringTransferId(String recurringTransferId) {
    this.recurringTransferId = recurringTransferId;
  }


  public Transfer expectedSweepSettlementSchedule(List<TransferExpectedSweepSettlementScheduleItem> expectedSweepSettlementSchedule) {
    
    this.expectedSweepSettlementSchedule = expectedSweepSettlementSchedule;
    return this;
  }

  public Transfer addExpectedSweepSettlementScheduleItem(TransferExpectedSweepSettlementScheduleItem expectedSweepSettlementScheduleItem) {
    if (this.expectedSweepSettlementSchedule == null) {
      this.expectedSweepSettlementSchedule = new ArrayList<>();
    }
    this.expectedSweepSettlementSchedule.add(expectedSweepSettlementScheduleItem);
    return this;
  }

   /**
   * The expected sweep settlement schedule of this transfer, assuming this transfer is not &#x60;returned&#x60;. Only applies to ACH debit transfers.
   * @return expectedSweepSettlementSchedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The expected sweep settlement schedule of this transfer, assuming this transfer is not `returned`. Only applies to ACH debit transfers.")

  public List<TransferExpectedSweepSettlementScheduleItem> getExpectedSweepSettlementSchedule() {
    return expectedSweepSettlementSchedule;
  }


  public void setExpectedSweepSettlementSchedule(List<TransferExpectedSweepSettlementScheduleItem> expectedSweepSettlementSchedule) {
    this.expectedSweepSettlementSchedule = expectedSweepSettlementSchedule;
  }


  public Transfer creditFundsSource(TransferCreditFundsSource creditFundsSource) {
    
    this.creditFundsSource = creditFundsSource;
    return this;
  }

   /**
   * Get creditFundsSource
   * @return creditFundsSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public TransferCreditFundsSource getCreditFundsSource() {
    return creditFundsSource;
  }


  public void setCreditFundsSource(TransferCreditFundsSource creditFundsSource) {
    this.creditFundsSource = creditFundsSource;
  }


  public Transfer facilitatorFee(String facilitatorFee) {
    
    this.facilitatorFee = facilitatorFee;
    return this;
  }

   /**
   * The amount to deduct from &#x60;transfer.amount&#x60; and distribute to the platform’s Ledger balance as a facilitator fee (decimal string with two digits of precision e.g. \&quot;10.00\&quot;). The remainder will go to the end-customer’s Ledger balance. This must be less than or equal to the &#x60;transfer.amount&#x60;.
   * @return facilitatorFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount to deduct from `transfer.amount` and distribute to the platform’s Ledger balance as a facilitator fee (decimal string with two digits of precision e.g. \"10.00\"). The remainder will go to the end-customer’s Ledger balance. This must be less than or equal to the `transfer.amount`.")

  public String getFacilitatorFee() {
    return facilitatorFee;
  }


  public void setFacilitatorFee(String facilitatorFee) {
    this.facilitatorFee = facilitatorFee;
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
        Objects.equals(this.authorizationId, transfer.authorizationId) &&
        Objects.equals(this.achClass, transfer.achClass) &&
        Objects.equals(this.accountId, transfer.accountId) &&
        Objects.equals(this.fundingAccountId, transfer.fundingAccountId) &&
        Objects.equals(this.type, transfer.type) &&
        Objects.equals(this.user, transfer.user) &&
        Objects.equals(this.amount, transfer.amount) &&
        Objects.equals(this.description, transfer.description) &&
        Objects.equals(this.created, transfer.created) &&
        Objects.equals(this.status, transfer.status) &&
        Objects.equals(this.sweepStatus, transfer.sweepStatus) &&
        Objects.equals(this.network, transfer.network) &&
        Objects.equals(this.cancellable, transfer.cancellable) &&
        Objects.equals(this.failureReason, transfer.failureReason) &&
        Objects.equals(this.metadata, transfer.metadata) &&
        Objects.equals(this.originationAccountId, transfer.originationAccountId) &&
        Objects.equals(this.guaranteeDecision, transfer.guaranteeDecision) &&
        Objects.equals(this.guaranteeDecisionRationale, transfer.guaranteeDecisionRationale) &&
        Objects.equals(this.isoCurrencyCode, transfer.isoCurrencyCode) &&
        Objects.equals(this.standardReturnWindow, transfer.standardReturnWindow) &&
        Objects.equals(this.unauthorizedReturnWindow, transfer.unauthorizedReturnWindow) &&
        Objects.equals(this.expectedSettlementDate, transfer.expectedSettlementDate) &&
        Objects.equals(this.originatorClientId, transfer.originatorClientId) &&
        Objects.equals(this.refunds, transfer.refunds) &&
        Objects.equals(this.recurringTransferId, transfer.recurringTransferId) &&
        Objects.equals(this.expectedSweepSettlementSchedule, transfer.expectedSweepSettlementSchedule) &&
        Objects.equals(this.creditFundsSource, transfer.creditFundsSource) &&
        Objects.equals(this.facilitatorFee, transfer.facilitatorFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authorizationId, achClass, accountId, fundingAccountId, type, user, amount, description, created, status, sweepStatus, network, cancellable, failureReason, metadata, originationAccountId, guaranteeDecision, guaranteeDecisionRationale, isoCurrencyCode, standardReturnWindow, unauthorizedReturnWindow, expectedSettlementDate, originatorClientId, refunds, recurringTransferId, expectedSweepSettlementSchedule, creditFundsSource, facilitatorFee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transfer {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    authorizationId: ").append(toIndentedString(authorizationId)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    fundingAccountId: ").append(toIndentedString(fundingAccountId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    sweepStatus: ").append(toIndentedString(sweepStatus)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    cancellable: ").append(toIndentedString(cancellable)).append("\n");
    sb.append("    failureReason: ").append(toIndentedString(failureReason)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    guaranteeDecision: ").append(toIndentedString(guaranteeDecision)).append("\n");
    sb.append("    guaranteeDecisionRationale: ").append(toIndentedString(guaranteeDecisionRationale)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    standardReturnWindow: ").append(toIndentedString(standardReturnWindow)).append("\n");
    sb.append("    unauthorizedReturnWindow: ").append(toIndentedString(unauthorizedReturnWindow)).append("\n");
    sb.append("    expectedSettlementDate: ").append(toIndentedString(expectedSettlementDate)).append("\n");
    sb.append("    originatorClientId: ").append(toIndentedString(originatorClientId)).append("\n");
    sb.append("    refunds: ").append(toIndentedString(refunds)).append("\n");
    sb.append("    recurringTransferId: ").append(toIndentedString(recurringTransferId)).append("\n");
    sb.append("    expectedSweepSettlementSchedule: ").append(toIndentedString(expectedSweepSettlementSchedule)).append("\n");
    sb.append("    creditFundsSource: ").append(toIndentedString(creditFundsSource)).append("\n");
    sb.append("    facilitatorFee: ").append(toIndentedString(facilitatorFee)).append("\n");
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

