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
import com.plaid.client.model.HealthIncident;
import com.plaid.client.model.ProductStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * The status of an institution is determined by the health of its Item logins, Transactions updates, Investments updates, Liabilities updates, Auth requests, Balance requests, Identity requests, Investments requests, and Liabilities requests. A login attempt is conducted during the initial Item add in Link. If there is not enough traffic to accurately calculate an institution&#39;s status, Plaid will return null rather than potentially inaccurate data.  Institution status is accessible in the Dashboard and via the API using the &#x60;/institutions/get_by_id&#x60; endpoint with the &#x60;include_status&#x60; option set to true. Note that institution status is not available in the Sandbox environment. 
 */
@ApiModel(description = "The status of an institution is determined by the health of its Item logins, Transactions updates, Investments updates, Liabilities updates, Auth requests, Balance requests, Identity requests, Investments requests, and Liabilities requests. A login attempt is conducted during the initial Item add in Link. If there is not enough traffic to accurately calculate an institution's status, Plaid will return null rather than potentially inaccurate data.  Institution status is accessible in the Dashboard and via the API using the `/institutions/get_by_id` endpoint with the `include_status` option set to true. Note that institution status is not available in the Sandbox environment. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-09-15T21:50:59.429Z[GMT]")
public class InstitutionStatus {
  public static final String SERIALIZED_NAME_ITEM_LOGINS = "item_logins";
  @SerializedName(SERIALIZED_NAME_ITEM_LOGINS)
  private ProductStatus itemLogins;

  public static final String SERIALIZED_NAME_TRANSACTIONS_UPDATES = "transactions_updates";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS_UPDATES)
  private ProductStatus transactionsUpdates;

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private ProductStatus auth;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private ProductStatus balance;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private ProductStatus identity;

  public static final String SERIALIZED_NAME_INVESTMENTS_UPDATES = "investments_updates";
  @SerializedName(SERIALIZED_NAME_INVESTMENTS_UPDATES)
  private ProductStatus investmentsUpdates;

  public static final String SERIALIZED_NAME_LIABILITIES_UPDATES = "liabilities_updates";
  @SerializedName(SERIALIZED_NAME_LIABILITIES_UPDATES)
  private ProductStatus liabilitiesUpdates;

  public static final String SERIALIZED_NAME_LIABILITIES = "liabilities";
  @SerializedName(SERIALIZED_NAME_LIABILITIES)
  private ProductStatus liabilities;

  public static final String SERIALIZED_NAME_INVESTMENTS = "investments";
  @SerializedName(SERIALIZED_NAME_INVESTMENTS)
  private ProductStatus investments;

  public static final String SERIALIZED_NAME_HEALTH_INCIDENTS = "health_incidents";
  @SerializedName(SERIALIZED_NAME_HEALTH_INCIDENTS)
  private List<HealthIncident> healthIncidents = null;


  public InstitutionStatus itemLogins(ProductStatus itemLogins) {
    
    this.itemLogins = itemLogins;
    return this;
  }

   /**
   * Get itemLogins
   * @return itemLogins
  **/
  @ApiModelProperty(required = true, value = "")

  public ProductStatus getItemLogins() {
    return itemLogins;
  }


  public void setItemLogins(ProductStatus itemLogins) {
    this.itemLogins = itemLogins;
  }


  public InstitutionStatus transactionsUpdates(ProductStatus transactionsUpdates) {
    
    this.transactionsUpdates = transactionsUpdates;
    return this;
  }

   /**
   * Get transactionsUpdates
   * @return transactionsUpdates
  **/
  @ApiModelProperty(required = true, value = "")

  public ProductStatus getTransactionsUpdates() {
    return transactionsUpdates;
  }


  public void setTransactionsUpdates(ProductStatus transactionsUpdates) {
    this.transactionsUpdates = transactionsUpdates;
  }


  public InstitutionStatus auth(ProductStatus auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Get auth
   * @return auth
  **/
  @ApiModelProperty(required = true, value = "")

  public ProductStatus getAuth() {
    return auth;
  }


  public void setAuth(ProductStatus auth) {
    this.auth = auth;
  }


  public InstitutionStatus balance(ProductStatus balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  @ApiModelProperty(required = true, value = "")

  public ProductStatus getBalance() {
    return balance;
  }


  public void setBalance(ProductStatus balance) {
    this.balance = balance;
  }


  public InstitutionStatus identity(ProductStatus identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Get identity
   * @return identity
  **/
  @ApiModelProperty(required = true, value = "")

  public ProductStatus getIdentity() {
    return identity;
  }


  public void setIdentity(ProductStatus identity) {
    this.identity = identity;
  }


  public InstitutionStatus investmentsUpdates(ProductStatus investmentsUpdates) {
    
    this.investmentsUpdates = investmentsUpdates;
    return this;
  }

   /**
   * Get investmentsUpdates
   * @return investmentsUpdates
  **/
  @ApiModelProperty(required = true, value = "")

  public ProductStatus getInvestmentsUpdates() {
    return investmentsUpdates;
  }


  public void setInvestmentsUpdates(ProductStatus investmentsUpdates) {
    this.investmentsUpdates = investmentsUpdates;
  }


  public InstitutionStatus liabilitiesUpdates(ProductStatus liabilitiesUpdates) {
    
    this.liabilitiesUpdates = liabilitiesUpdates;
    return this;
  }

   /**
   * Get liabilitiesUpdates
   * @return liabilitiesUpdates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductStatus getLiabilitiesUpdates() {
    return liabilitiesUpdates;
  }


  public void setLiabilitiesUpdates(ProductStatus liabilitiesUpdates) {
    this.liabilitiesUpdates = liabilitiesUpdates;
  }


  public InstitutionStatus liabilities(ProductStatus liabilities) {
    
    this.liabilities = liabilities;
    return this;
  }

   /**
   * Get liabilities
   * @return liabilities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductStatus getLiabilities() {
    return liabilities;
  }


  public void setLiabilities(ProductStatus liabilities) {
    this.liabilities = liabilities;
  }


  public InstitutionStatus investments(ProductStatus investments) {
    
    this.investments = investments;
    return this;
  }

   /**
   * Get investments
   * @return investments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ProductStatus getInvestments() {
    return investments;
  }


  public void setInvestments(ProductStatus investments) {
    this.investments = investments;
  }


  public InstitutionStatus healthIncidents(List<HealthIncident> healthIncidents) {
    
    this.healthIncidents = healthIncidents;
    return this;
  }

  public InstitutionStatus addHealthIncidentsItem(HealthIncident healthIncidentsItem) {
    if (this.healthIncidents == null) {
      this.healthIncidents = new ArrayList<>();
    }
    this.healthIncidents.add(healthIncidentsItem);
    return this;
  }

   /**
   * Details of recent health incidents associated with the institution.
   * @return healthIncidents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Details of recent health incidents associated with the institution.")

  public List<HealthIncident> getHealthIncidents() {
    return healthIncidents;
  }


  public void setHealthIncidents(List<HealthIncident> healthIncidents) {
    this.healthIncidents = healthIncidents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionStatus institutionStatus = (InstitutionStatus) o;
    return Objects.equals(this.itemLogins, institutionStatus.itemLogins) &&
        Objects.equals(this.transactionsUpdates, institutionStatus.transactionsUpdates) &&
        Objects.equals(this.auth, institutionStatus.auth) &&
        Objects.equals(this.balance, institutionStatus.balance) &&
        Objects.equals(this.identity, institutionStatus.identity) &&
        Objects.equals(this.investmentsUpdates, institutionStatus.investmentsUpdates) &&
        Objects.equals(this.liabilitiesUpdates, institutionStatus.liabilitiesUpdates) &&
        Objects.equals(this.liabilities, institutionStatus.liabilities) &&
        Objects.equals(this.investments, institutionStatus.investments) &&
        Objects.equals(this.healthIncidents, institutionStatus.healthIncidents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemLogins, transactionsUpdates, auth, balance, identity, investmentsUpdates, liabilitiesUpdates, liabilities, investments, healthIncidents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionStatus {\n");
    sb.append("    itemLogins: ").append(toIndentedString(itemLogins)).append("\n");
    sb.append("    transactionsUpdates: ").append(toIndentedString(transactionsUpdates)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    investmentsUpdates: ").append(toIndentedString(investmentsUpdates)).append("\n");
    sb.append("    liabilitiesUpdates: ").append(toIndentedString(liabilitiesUpdates)).append("\n");
    sb.append("    liabilities: ").append(toIndentedString(liabilities)).append("\n");
    sb.append("    investments: ").append(toIndentedString(investments)).append("\n");
    sb.append("    healthIncidents: ").append(toIndentedString(healthIncidents)).append("\n");
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

