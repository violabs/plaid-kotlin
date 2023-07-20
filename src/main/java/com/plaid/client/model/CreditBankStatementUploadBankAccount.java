/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.390.0
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
import com.plaid.client.model.CreditBankStatementUploadAccountOwner;
import com.plaid.client.model.CreditBankStatementUploadBankAccountPeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object containing data about a user&#39;s bank account related to an uploaded bank statement.
 */
@ApiModel(description = "An object containing data about a user's bank account related to an uploaded bank statement.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-18T21:18:35.789894Z[Etc/UTC]")
public class CreditBankStatementUploadBankAccount {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_BANK_NAME = "bank_name";
  @SerializedName(SERIALIZED_NAME_BANK_NAME)
  private String bankName;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private String accountType;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private CreditBankStatementUploadAccountOwner owner;

  public static final String SERIALIZED_NAME_PERIODS = "periods";
  @SerializedName(SERIALIZED_NAME_PERIODS)
  private List<CreditBankStatementUploadBankAccountPeriod> periods = new ArrayList<>();

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;


  public CreditBankStatementUploadBankAccount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the bank account
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The name of the bank account")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreditBankStatementUploadBankAccount bankName(String bankName) {
    
    this.bankName = bankName;
    return this;
  }

   /**
   * The name of the bank institution.
   * @return bankName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The name of the bank institution.")

  public String getBankName() {
    return bankName;
  }


  public void setBankName(String bankName) {
    this.bankName = bankName;
  }


  public CreditBankStatementUploadBankAccount accountType(String accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * The type of the bank account.
   * @return accountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The type of the bank account.")

  public String getAccountType() {
    return accountType;
  }


  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  public CreditBankStatementUploadBankAccount accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The bank account number.
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The bank account number.")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public CreditBankStatementUploadBankAccount owner(CreditBankStatementUploadAccountOwner owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditBankStatementUploadAccountOwner getOwner() {
    return owner;
  }


  public void setOwner(CreditBankStatementUploadAccountOwner owner) {
    this.owner = owner;
  }


  public CreditBankStatementUploadBankAccount periods(List<CreditBankStatementUploadBankAccountPeriod> periods) {
    
    this.periods = periods;
    return this;
  }

  public CreditBankStatementUploadBankAccount addPeriodsItem(CreditBankStatementUploadBankAccountPeriod periodsItem) {
    this.periods.add(periodsItem);
    return this;
  }

   /**
   * An array of period objects, containing more data on the overall period of the statement.
   * @return periods
  **/
  @ApiModelProperty(required = true, value = "An array of period objects, containing more data on the overall period of the statement.")

  public List<CreditBankStatementUploadBankAccountPeriod> getPeriods() {
    return periods;
  }


  public void setPeriods(List<CreditBankStatementUploadBankAccountPeriod> periods) {
    this.periods = periods;
  }


  public CreditBankStatementUploadBankAccount accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The unique id of the bank account
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unique id of the bank account")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankStatementUploadBankAccount creditBankStatementUploadBankAccount = (CreditBankStatementUploadBankAccount) o;
    return Objects.equals(this.name, creditBankStatementUploadBankAccount.name) &&
        Objects.equals(this.bankName, creditBankStatementUploadBankAccount.bankName) &&
        Objects.equals(this.accountType, creditBankStatementUploadBankAccount.accountType) &&
        Objects.equals(this.accountNumber, creditBankStatementUploadBankAccount.accountNumber) &&
        Objects.equals(this.owner, creditBankStatementUploadBankAccount.owner) &&
        Objects.equals(this.periods, creditBankStatementUploadBankAccount.periods) &&
        Objects.equals(this.accountId, creditBankStatementUploadBankAccount.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, bankName, accountType, accountNumber, owner, periods, accountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankStatementUploadBankAccount {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

