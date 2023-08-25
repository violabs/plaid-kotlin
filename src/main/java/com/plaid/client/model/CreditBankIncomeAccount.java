/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.421.0
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
import com.plaid.client.model.CreditBankIncomeAccountType;
import com.plaid.client.model.DepositoryAccountSubtype;
import com.plaid.client.model.Owner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The Item&#39;s bank accounts that have the selected data.
 */
@ApiModel(description = "The Item's bank accounts that have the selected data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T17:41:29.341032Z[Etc/UTC]")
public class CreditBankIncomeAccount {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_MASK = "mask";
  @SerializedName(SERIALIZED_NAME_MASK)
  private String mask;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OFFICIAL_NAME = "official_name";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_NAME)
  private String officialName;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private DepositoryAccountSubtype subtype;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private CreditBankIncomeAccountType type;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Owner> owners = new ArrayList<>();


  public CreditBankIncomeAccount accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Plaid&#39;s unique identifier for the account.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "Plaid's unique identifier for the account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public CreditBankIncomeAccount mask(String mask) {
    
    this.mask = mask;
    return this;
  }

   /**
   * The last 2-4 alphanumeric characters of an account&#39;s official account number. Note that the mask may be non-unique between an Item&#39;s accounts, and it may also not match the mask that the bank displays to the user.
   * @return mask
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The last 2-4 alphanumeric characters of an account's official account number. Note that the mask may be non-unique between an Item's accounts, and it may also not match the mask that the bank displays to the user.")

  public String getMask() {
    return mask;
  }


  public void setMask(String mask) {
    this.mask = mask;
  }


  public CreditBankIncomeAccount name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the bank account.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the bank account.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreditBankIncomeAccount officialName(String officialName) {
    
    this.officialName = officialName;
    return this;
  }

   /**
   * The official name of the bank account.
   * @return officialName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The official name of the bank account.")

  public String getOfficialName() {
    return officialName;
  }


  public void setOfficialName(String officialName) {
    this.officialName = officialName;
  }


  public CreditBankIncomeAccount subtype(DepositoryAccountSubtype subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @ApiModelProperty(required = true, value = "")

  public DepositoryAccountSubtype getSubtype() {
    return subtype;
  }


  public void setSubtype(DepositoryAccountSubtype subtype) {
    this.subtype = subtype;
  }


  public CreditBankIncomeAccount type(CreditBankIncomeAccountType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditBankIncomeAccountType getType() {
    return type;
  }


  public void setType(CreditBankIncomeAccountType type) {
    this.type = type;
  }


  public CreditBankIncomeAccount owners(List<Owner> owners) {
    
    this.owners = owners;
    return this;
  }

  public CreditBankIncomeAccount addOwnersItem(Owner ownersItem) {
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Data returned by the financial institution about the account owner or owners. Identity information is optional, so field may return an empty array.
   * @return owners
  **/
  @ApiModelProperty(required = true, value = "Data returned by the financial institution about the account owner or owners. Identity information is optional, so field may return an empty array.")

  public List<Owner> getOwners() {
    return owners;
  }


  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditBankIncomeAccount creditBankIncomeAccount = (CreditBankIncomeAccount) o;
    return Objects.equals(this.accountId, creditBankIncomeAccount.accountId) &&
        Objects.equals(this.mask, creditBankIncomeAccount.mask) &&
        Objects.equals(this.name, creditBankIncomeAccount.name) &&
        Objects.equals(this.officialName, creditBankIncomeAccount.officialName) &&
        Objects.equals(this.subtype, creditBankIncomeAccount.subtype) &&
        Objects.equals(this.type, creditBankIncomeAccount.type) &&
        Objects.equals(this.owners, creditBankIncomeAccount.owners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, mask, name, officialName, subtype, type, owners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncomeAccount {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
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

