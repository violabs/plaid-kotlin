/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.345.1
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
import com.plaid.client.model.CreditBankEmployment;
import com.plaid.client.model.CreditBankIncomeAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * The details and metadata for an end user&#39;s Item.
 */
@ApiModel(description = "The details and metadata for an end user's Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-04-17T21:11:54.856293Z[Etc/UTC]")
public class CreditBankEmploymentItem {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_LAST_UPDATED_TIME = "last_updated_time";
  @SerializedName(SERIALIZED_NAME_LAST_UPDATED_TIME)
  private OffsetDateTime lastUpdatedTime;

  public static final String SERIALIZED_NAME_INSTITUTION_ID = "institution_id";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_ID)
  private String institutionId;

  public static final String SERIALIZED_NAME_INSTITUTION_NAME = "institution_name";
  @SerializedName(SERIALIZED_NAME_INSTITUTION_NAME)
  private String institutionName;

  public static final String SERIALIZED_NAME_BANK_EMPLOYMENTS = "bank_employments";
  @SerializedName(SERIALIZED_NAME_BANK_EMPLOYMENTS)
  private List<CreditBankEmployment> bankEmployments = new ArrayList<>();

  public static final String SERIALIZED_NAME_BANK_EMPLOYMENT_ACCOUNTS = "bank_employment_accounts";
  @SerializedName(SERIALIZED_NAME_BANK_EMPLOYMENT_ACCOUNTS)
  private List<CreditBankIncomeAccount> bankEmploymentAccounts = new ArrayList<>();


  public CreditBankEmploymentItem itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * The unique identifier for the Item.
   * @return itemId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier for the Item.")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public CreditBankEmploymentItem lastUpdatedTime(OffsetDateTime lastUpdatedTime) {
    
    this.lastUpdatedTime = lastUpdatedTime;
    return this;
  }

   /**
   * The time when this Item&#39;s data was last retrieved from the financial institution, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (e.g. \&quot;2018-04-12T03:32:11Z\&quot;).
   * @return lastUpdatedTime
  **/
  @ApiModelProperty(required = true, value = "The time when this Item's data was last retrieved from the financial institution, in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (e.g. \"2018-04-12T03:32:11Z\").")

  public OffsetDateTime getLastUpdatedTime() {
    return lastUpdatedTime;
  }


  public void setLastUpdatedTime(OffsetDateTime lastUpdatedTime) {
    this.lastUpdatedTime = lastUpdatedTime;
  }


  public CreditBankEmploymentItem institutionId(String institutionId) {
    
    this.institutionId = institutionId;
    return this;
  }

   /**
   * The unique identifier of the institution associated with the Item.
   * @return institutionId
  **/
  @ApiModelProperty(required = true, value = "The unique identifier of the institution associated with the Item.")

  public String getInstitutionId() {
    return institutionId;
  }


  public void setInstitutionId(String institutionId) {
    this.institutionId = institutionId;
  }


  public CreditBankEmploymentItem institutionName(String institutionName) {
    
    this.institutionName = institutionName;
    return this;
  }

   /**
   * The name of the institution associated with the Item.
   * @return institutionName
  **/
  @ApiModelProperty(required = true, value = "The name of the institution associated with the Item.")

  public String getInstitutionName() {
    return institutionName;
  }


  public void setInstitutionName(String institutionName) {
    this.institutionName = institutionName;
  }


  public CreditBankEmploymentItem bankEmployments(List<CreditBankEmployment> bankEmployments) {
    
    this.bankEmployments = bankEmployments;
    return this;
  }

  public CreditBankEmploymentItem addBankEmploymentsItem(CreditBankEmployment bankEmploymentsItem) {
    this.bankEmployments.add(bankEmploymentsItem);
    return this;
  }

   /**
   * The bank employment information for this Item. Each entry in the array is a different employer found.
   * @return bankEmployments
  **/
  @ApiModelProperty(required = true, value = "The bank employment information for this Item. Each entry in the array is a different employer found.")

  public List<CreditBankEmployment> getBankEmployments() {
    return bankEmployments;
  }


  public void setBankEmployments(List<CreditBankEmployment> bankEmployments) {
    this.bankEmployments = bankEmployments;
  }


  public CreditBankEmploymentItem bankEmploymentAccounts(List<CreditBankIncomeAccount> bankEmploymentAccounts) {
    
    this.bankEmploymentAccounts = bankEmploymentAccounts;
    return this;
  }

  public CreditBankEmploymentItem addBankEmploymentAccountsItem(CreditBankIncomeAccount bankEmploymentAccountsItem) {
    this.bankEmploymentAccounts.add(bankEmploymentAccountsItem);
    return this;
  }

   /**
   * The Item&#39;s accounts that have Bank Employment data.
   * @return bankEmploymentAccounts
  **/
  @ApiModelProperty(required = true, value = "The Item's accounts that have Bank Employment data.")

  public List<CreditBankIncomeAccount> getBankEmploymentAccounts() {
    return bankEmploymentAccounts;
  }


  public void setBankEmploymentAccounts(List<CreditBankIncomeAccount> bankEmploymentAccounts) {
    this.bankEmploymentAccounts = bankEmploymentAccounts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankEmploymentItem creditBankEmploymentItem = (CreditBankEmploymentItem) o;
    return Objects.equals(this.itemId, creditBankEmploymentItem.itemId) &&
        Objects.equals(this.lastUpdatedTime, creditBankEmploymentItem.lastUpdatedTime) &&
        Objects.equals(this.institutionId, creditBankEmploymentItem.institutionId) &&
        Objects.equals(this.institutionName, creditBankEmploymentItem.institutionName) &&
        Objects.equals(this.bankEmployments, creditBankEmploymentItem.bankEmployments) &&
        Objects.equals(this.bankEmploymentAccounts, creditBankEmploymentItem.bankEmploymentAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, lastUpdatedTime, institutionId, institutionName, bankEmployments, bankEmploymentAccounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankEmploymentItem {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    lastUpdatedTime: ").append(toIndentedString(lastUpdatedTime)).append("\n");
    sb.append("    institutionId: ").append(toIndentedString(institutionId)).append("\n");
    sb.append("    institutionName: ").append(toIndentedString(institutionName)).append("\n");
    sb.append("    bankEmployments: ").append(toIndentedString(bankEmployments)).append("\n");
    sb.append("    bankEmploymentAccounts: ").append(toIndentedString(bankEmploymentAccounts)).append("\n");
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
