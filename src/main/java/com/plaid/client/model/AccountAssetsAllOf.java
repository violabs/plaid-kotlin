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
import com.plaid.client.model.AssetReportTransaction;
import com.plaid.client.model.HistoricalBalance;
import com.plaid.client.model.Owner;
import com.plaid.client.model.OwnershipType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * AccountAssetsAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-18T21:18:35.789894Z[Etc/UTC]")
public class AccountAssetsAllOf {
  public static final String SERIALIZED_NAME_DAYS_AVAILABLE = "days_available";
  @SerializedName(SERIALIZED_NAME_DAYS_AVAILABLE)
  private Double daysAvailable;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private List<AssetReportTransaction> transactions = null;

  public static final String SERIALIZED_NAME_OWNERS = "owners";
  @SerializedName(SERIALIZED_NAME_OWNERS)
  private List<Owner> owners = null;

  public static final String SERIALIZED_NAME_OWNERSHIP_TYPE = "ownership_type";
  @SerializedName(SERIALIZED_NAME_OWNERSHIP_TYPE)
  private OwnershipType ownershipType;

  public static final String SERIALIZED_NAME_HISTORICAL_BALANCES = "historical_balances";
  @SerializedName(SERIALIZED_NAME_HISTORICAL_BALANCES)
  private List<HistoricalBalance> historicalBalances = null;


  public AccountAssetsAllOf daysAvailable(Double daysAvailable) {
    
    this.daysAvailable = daysAvailable;
    return this;
  }

   /**
   * The duration of transaction history available for this Item, typically defined as the time since the date of the earliest transaction in that account. Only returned by Assets endpoints.
   * @return daysAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The duration of transaction history available for this Item, typically defined as the time since the date of the earliest transaction in that account. Only returned by Assets endpoints.")

  public Double getDaysAvailable() {
    return daysAvailable;
  }


  public void setDaysAvailable(Double daysAvailable) {
    this.daysAvailable = daysAvailable;
  }


  public AccountAssetsAllOf transactions(List<AssetReportTransaction> transactions) {
    
    this.transactions = transactions;
    return this;
  }

  public AccountAssetsAllOf addTransactionsItem(AssetReportTransaction transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Transaction history associated with the account. Only returned by Assets endpoints. Transaction history returned by endpoints such as &#x60;/transactions/get&#x60; or &#x60;/investments/transactions/get&#x60; will be returned in the top-level &#x60;transactions&#x60; field instead.
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Transaction history associated with the account. Only returned by Assets endpoints. Transaction history returned by endpoints such as `/transactions/get` or `/investments/transactions/get` will be returned in the top-level `transactions` field instead.")

  public List<AssetReportTransaction> getTransactions() {
    return transactions;
  }


  public void setTransactions(List<AssetReportTransaction> transactions) {
    this.transactions = transactions;
  }


  public AccountAssetsAllOf owners(List<Owner> owners) {
    
    this.owners = owners;
    return this;
  }

  public AccountAssetsAllOf addOwnersItem(Owner ownersItem) {
    if (this.owners == null) {
      this.owners = new ArrayList<>();
    }
    this.owners.add(ownersItem);
    return this;
  }

   /**
   * Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same &#x60;owner&#x60; object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the &#x60;owners&#x60; object is not returned, and instead identity information is returned in the top level &#x60;identity&#x60; object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)
   * @return owners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Data returned by the financial institution about the account owner or owners. Only returned by Identity or Assets endpoints. For business accounts, the name reported may be either the name of the individual or the name of the business, depending on the institution. Multiple owners on a single account will be represented in the same `owner` object, not in multiple owner objects within the array. In API versions 2018-05-22 and earlier, the `owners` object is not returned, and instead identity information is returned in the top level `identity` object. For more details, see [Plaid API versioning](https://plaid.com/docs/api/versioning/#version-2019-05-29)")

  public List<Owner> getOwners() {
    return owners;
  }


  public void setOwners(List<Owner> owners) {
    this.owners = owners;
  }


  public AccountAssetsAllOf ownershipType(OwnershipType ownershipType) {
    
    this.ownershipType = ownershipType;
    return this;
  }

   /**
   * Get ownershipType
   * @return ownershipType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OwnershipType getOwnershipType() {
    return ownershipType;
  }


  public void setOwnershipType(OwnershipType ownershipType) {
    this.ownershipType = ownershipType;
  }


  public AccountAssetsAllOf historicalBalances(List<HistoricalBalance> historicalBalances) {
    
    this.historicalBalances = historicalBalances;
    return this;
  }

  public AccountAssetsAllOf addHistoricalBalancesItem(HistoricalBalance historicalBalancesItem) {
    if (this.historicalBalances == null) {
      this.historicalBalances = new ArrayList<>();
    }
    this.historicalBalances.add(historicalBalancesItem);
    return this;
  }

   /**
   * Calculated data about the historical balances on the account. Only returned by Assets endpoints and currently not supported by &#x60;brokerage&#x60; or &#x60;investment&#x60; accounts.
   * @return historicalBalances
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Calculated data about the historical balances on the account. Only returned by Assets endpoints and currently not supported by `brokerage` or `investment` accounts.")

  public List<HistoricalBalance> getHistoricalBalances() {
    return historicalBalances;
  }


  public void setHistoricalBalances(List<HistoricalBalance> historicalBalances) {
    this.historicalBalances = historicalBalances;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountAssetsAllOf accountAssetsAllOf = (AccountAssetsAllOf) o;
    return Objects.equals(this.daysAvailable, accountAssetsAllOf.daysAvailable) &&
        Objects.equals(this.transactions, accountAssetsAllOf.transactions) &&
        Objects.equals(this.owners, accountAssetsAllOf.owners) &&
        Objects.equals(this.ownershipType, accountAssetsAllOf.ownershipType) &&
        Objects.equals(this.historicalBalances, accountAssetsAllOf.historicalBalances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysAvailable, transactions, owners, ownershipType, historicalBalances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountAssetsAllOf {\n");
    sb.append("    daysAvailable: ").append(toIndentedString(daysAvailable)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    ownershipType: ").append(toIndentedString(ownershipType)).append("\n");
    sb.append("    historicalBalances: ").append(toIndentedString(historicalBalances)).append("\n");
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

