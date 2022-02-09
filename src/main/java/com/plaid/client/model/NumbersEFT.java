/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.64.13
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

/**
 * Identifying information for transferring money to or from a Canadian bank account via EFT.
 */
@ApiModel(description = "Identifying information for transferring money to or from a Canadian bank account via EFT.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-02-09T21:07:26.764Z[GMT]")
public class NumbersEFT {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private String institution;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;


  public NumbersEFT accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid account ID associated with the account numbers
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid account ID associated with the account numbers")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public NumbersEFT account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The EFT account number for the account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "The EFT account number for the account")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public NumbersEFT institution(String institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * The EFT institution number for the account
   * @return institution
  **/
  @ApiModelProperty(required = true, value = "The EFT institution number for the account")

  public String getInstitution() {
    return institution;
  }


  public void setInstitution(String institution) {
    this.institution = institution;
  }


  public NumbersEFT branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * The EFT branch number for the account
   * @return branch
  **/
  @ApiModelProperty(required = true, value = "The EFT branch number for the account")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumbersEFT numbersEFT = (NumbersEFT) o;
    return Objects.equals(this.accountId, numbersEFT.accountId) &&
        Objects.equals(this.account, numbersEFT.account) &&
        Objects.equals(this.institution, numbersEFT.institution) &&
        Objects.equals(this.branch, numbersEFT.branch);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, account, institution, branch);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumbersEFT {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
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

