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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Describes the last time each datatype was accessed by an application.
 */
@ApiModel(description = "Describes the last time each datatype was accessed by an application.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class LastDataAccessTimes {
  public static final String SERIALIZED_NAME_APPLICATION_ID = "application_id";
  @SerializedName(SERIALIZED_NAME_APPLICATION_ID)
  private String applicationId;

  public static final String SERIALIZED_NAME_ACCOUNT_BALANCE_INFO = "account_balance_info";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BALANCE_INFO)
  private OffsetDateTime accountBalanceInfo;

  public static final String SERIALIZED_NAME_ACCOUNT_ROUTING_NUMBER = "account_routing_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ROUTING_NUMBER)
  private OffsetDateTime accountRoutingNumber;

  public static final String SERIALIZED_NAME_CONTACT_DETAILS = "contact_details";
  @SerializedName(SERIALIZED_NAME_CONTACT_DETAILS)
  private OffsetDateTime contactDetails;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private OffsetDateTime transactions;

  public static final String SERIALIZED_NAME_CREDIT_AND_LOANS = "credit_and_loans";
  @SerializedName(SERIALIZED_NAME_CREDIT_AND_LOANS)
  private OffsetDateTime creditAndLoans;

  public static final String SERIALIZED_NAME_INVESTMENTS = "investments";
  @SerializedName(SERIALIZED_NAME_INVESTMENTS)
  private OffsetDateTime investments;

  public static final String SERIALIZED_NAME_PAYROLL_INFO = "payroll_info";
  @SerializedName(SERIALIZED_NAME_PAYROLL_INFO)
  private OffsetDateTime payrollInfo;

  public static final String SERIALIZED_NAME_TRANSACTION_RISK_INFO = "transaction_risk_info";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_RISK_INFO)
  private OffsetDateTime transactionRiskInfo;


  public LastDataAccessTimes applicationId(String applicationId) {
    
    this.applicationId = applicationId;
    return this;
  }

   /**
   * ID of the application accessing data.
   * @return applicationId
  **/
  @ApiModelProperty(required = true, value = "ID of the application accessing data.")

  public String getApplicationId() {
    return applicationId;
  }


  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }


  public LastDataAccessTimes accountBalanceInfo(OffsetDateTime accountBalanceInfo) {
    
    this.accountBalanceInfo = accountBalanceInfo;
    return this;
  }

   /**
   * The last time account_balance_info was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.
   * @return accountBalanceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-02-08T10:00Z", required = true, value = "The last time account_balance_info was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.")

  public OffsetDateTime getAccountBalanceInfo() {
    return accountBalanceInfo;
  }


  public void setAccountBalanceInfo(OffsetDateTime accountBalanceInfo) {
    this.accountBalanceInfo = accountBalanceInfo;
  }


  public LastDataAccessTimes accountRoutingNumber(OffsetDateTime accountRoutingNumber) {
    
    this.accountRoutingNumber = accountRoutingNumber;
    return this;
  }

   /**
   * The last time account_routing_number was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.
   * @return accountRoutingNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-02-08T10:00Z", required = true, value = "The last time account_routing_number was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.")

  public OffsetDateTime getAccountRoutingNumber() {
    return accountRoutingNumber;
  }


  public void setAccountRoutingNumber(OffsetDateTime accountRoutingNumber) {
    this.accountRoutingNumber = accountRoutingNumber;
  }


  public LastDataAccessTimes contactDetails(OffsetDateTime contactDetails) {
    
    this.contactDetails = contactDetails;
    return this;
  }

   /**
   * The last time contact_details was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.
   * @return contactDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-02-08T10:00Z", required = true, value = "The last time contact_details was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.")

  public OffsetDateTime getContactDetails() {
    return contactDetails;
  }


  public void setContactDetails(OffsetDateTime contactDetails) {
    this.contactDetails = contactDetails;
  }


  public LastDataAccessTimes transactions(OffsetDateTime transactions) {
    
    this.transactions = transactions;
    return this;
  }

   /**
   * The last time transactions was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-02-08T10:00Z", required = true, value = "The last time transactions was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.")

  public OffsetDateTime getTransactions() {
    return transactions;
  }


  public void setTransactions(OffsetDateTime transactions) {
    this.transactions = transactions;
  }


  public LastDataAccessTimes creditAndLoans(OffsetDateTime creditAndLoans) {
    
    this.creditAndLoans = creditAndLoans;
    return this;
  }

   /**
   * The last time credit_and_loans was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.
   * @return creditAndLoans
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-02-08T10:00Z", required = true, value = "The last time credit_and_loans was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.")

  public OffsetDateTime getCreditAndLoans() {
    return creditAndLoans;
  }


  public void setCreditAndLoans(OffsetDateTime creditAndLoans) {
    this.creditAndLoans = creditAndLoans;
  }


  public LastDataAccessTimes investments(OffsetDateTime investments) {
    
    this.investments = investments;
    return this;
  }

   /**
   * The last time investments was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.
   * @return investments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-02-08T10:00Z", required = true, value = "The last time investments was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.")

  public OffsetDateTime getInvestments() {
    return investments;
  }


  public void setInvestments(OffsetDateTime investments) {
    this.investments = investments;
  }


  public LastDataAccessTimes payrollInfo(OffsetDateTime payrollInfo) {
    
    this.payrollInfo = payrollInfo;
    return this;
  }

   /**
   * The last time payroll_info was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.
   * @return payrollInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-02-08T10:00Z", required = true, value = "The last time payroll_info was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.")

  public OffsetDateTime getPayrollInfo() {
    return payrollInfo;
  }


  public void setPayrollInfo(OffsetDateTime payrollInfo) {
    this.payrollInfo = payrollInfo;
  }


  public LastDataAccessTimes transactionRiskInfo(OffsetDateTime transactionRiskInfo) {
    
    this.transactionRiskInfo = transactionRiskInfo;
    return this;
  }

   /**
   * The last time transaction_risk_info was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.
   * @return transactionRiskInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-02-08T10:00Z", required = true, value = "The last time transaction_risk_info was accessed by this application in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format in UTC. null if never accessed.")

  public OffsetDateTime getTransactionRiskInfo() {
    return transactionRiskInfo;
  }


  public void setTransactionRiskInfo(OffsetDateTime transactionRiskInfo) {
    this.transactionRiskInfo = transactionRiskInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastDataAccessTimes lastDataAccessTimes = (LastDataAccessTimes) o;
    return Objects.equals(this.applicationId, lastDataAccessTimes.applicationId) &&
        Objects.equals(this.accountBalanceInfo, lastDataAccessTimes.accountBalanceInfo) &&
        Objects.equals(this.accountRoutingNumber, lastDataAccessTimes.accountRoutingNumber) &&
        Objects.equals(this.contactDetails, lastDataAccessTimes.contactDetails) &&
        Objects.equals(this.transactions, lastDataAccessTimes.transactions) &&
        Objects.equals(this.creditAndLoans, lastDataAccessTimes.creditAndLoans) &&
        Objects.equals(this.investments, lastDataAccessTimes.investments) &&
        Objects.equals(this.payrollInfo, lastDataAccessTimes.payrollInfo) &&
        Objects.equals(this.transactionRiskInfo, lastDataAccessTimes.transactionRiskInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, accountBalanceInfo, accountRoutingNumber, contactDetails, transactions, creditAndLoans, investments, payrollInfo, transactionRiskInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastDataAccessTimes {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    accountBalanceInfo: ").append(toIndentedString(accountBalanceInfo)).append("\n");
    sb.append("    accountRoutingNumber: ").append(toIndentedString(accountRoutingNumber)).append("\n");
    sb.append("    contactDetails: ").append(toIndentedString(contactDetails)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    creditAndLoans: ").append(toIndentedString(creditAndLoans)).append("\n");
    sb.append("    investments: ").append(toIndentedString(investments)).append("\n");
    sb.append("    payrollInfo: ").append(toIndentedString(payrollInfo)).append("\n");
    sb.append("    transactionRiskInfo: ").append(toIndentedString(transactionRiskInfo)).append("\n");
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

