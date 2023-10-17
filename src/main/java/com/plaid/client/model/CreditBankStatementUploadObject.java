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
import com.plaid.client.model.CreditBankStatementUploadBankAccount;
import com.plaid.client.model.CreditBankStatementUploadTransaction;
import com.plaid.client.model.CreditDocumentMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object containing data that has been parsed from a user-uploaded bank statement.
 */
@ApiModel(description = "An object containing data that has been parsed from a user-uploaded bank statement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-10-17T22:44:09.100608Z[Etc/UTC]")
public class CreditBankStatementUploadObject {
  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<CreditBankStatementUploadTransaction> transactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_DOCUMENT_METADATA = "document_metadata";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_METADATA)
  private CreditDocumentMetadata documentMetadata;

  public static final String SERIALIZED_NAME_DOCUMENT_ID = "document_id";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_ID)
  private String documentId;

  public static final String SERIALIZED_NAME_BANK_ACCOUNTS = "bank_accounts";
  @SerializedName(SERIALIZED_NAME_BANK_ACCOUNTS)
  private List<CreditBankStatementUploadBankAccount> bankAccounts = new ArrayList<>();


  public CreditBankStatementUploadObject transactions(List<CreditBankStatementUploadTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public CreditBankStatementUploadObject addTransactionsItem(CreditBankStatementUploadTransaction transactionsItem) {
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * An array of transactions appearing on the bank statement.
   * @return transactions
  **/
  @ApiModelProperty(required = true, value = "An array of transactions appearing on the bank statement.")

  public List<CreditBankStatementUploadTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<CreditBankStatementUploadTransaction> transactions) {
    this.transactions = transactions;
  }


  public CreditBankStatementUploadObject documentMetadata(CreditDocumentMetadata documentMetadata) {
    
    this.documentMetadata = documentMetadata;
    return this;
  }

   /**
   * Get documentMetadata
   * @return documentMetadata
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditDocumentMetadata getDocumentMetadata() {
    return documentMetadata;
  }


  public void setDocumentMetadata(CreditDocumentMetadata documentMetadata) {
    this.documentMetadata = documentMetadata;
  }


  public CreditBankStatementUploadObject documentId(String documentId) {
    
    this.documentId = documentId;
    return this;
  }

   /**
   * An identifier of the document referenced by the document metadata.
   * @return documentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "An identifier of the document referenced by the document metadata.")

  public String getDocumentId() {
    return documentId;
  }


  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }


  public CreditBankStatementUploadObject bankAccounts(List<CreditBankStatementUploadBankAccount> bankAccounts) {
    
    this.bankAccounts = bankAccounts;
    return this;
  }

  public CreditBankStatementUploadObject addBankAccountsItem(CreditBankStatementUploadBankAccount bankAccountsItem) {
    this.bankAccounts.add(bankAccountsItem);
    return this;
  }

   /**
   * An array of bank accounts associated with the uploaded bank statement.
   * @return bankAccounts
  **/
  @ApiModelProperty(required = true, value = "An array of bank accounts associated with the uploaded bank statement.")

  public List<CreditBankStatementUploadBankAccount> getBankAccounts() {
    return bankAccounts;
  }


  public void setBankAccounts(List<CreditBankStatementUploadBankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankStatementUploadObject creditBankStatementUploadObject = (CreditBankStatementUploadObject) o;
    return Objects.equals(this.transactions, creditBankStatementUploadObject.transactions) &&
        Objects.equals(this.documentMetadata, creditBankStatementUploadObject.documentMetadata) &&
        Objects.equals(this.documentId, creditBankStatementUploadObject.documentId) &&
        Objects.equals(this.bankAccounts, creditBankStatementUploadObject.bankAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactions, documentMetadata, documentId, bankAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankStatementUploadObject {\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    documentMetadata: ").append(toIndentedString(documentMetadata)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    bankAccounts: ").append(toIndentedString(bankAccounts)).append("\n");
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

