/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.58.1
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
 * The product access being requested. Used to or disallow product access across all accounts. If unset, defaults to all products allowed.
 */
@ApiModel(description = "The product access being requested. Used to or disallow product access across all accounts. If unset, defaults to all products allowed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-08T23:30:31.820Z[GMT]")
public class ProductAccess {
  public static final String SERIALIZED_NAME_STATEMENTS = "statements";
  @SerializedName(SERIALIZED_NAME_STATEMENTS)
  private Boolean statements = true;

  public static final String SERIALIZED_NAME_IDENTITY = "identity";
  @SerializedName(SERIALIZED_NAME_IDENTITY)
  private Boolean identity = true;

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private Boolean auth = true;

  public static final String SERIALIZED_NAME_TRANSACTIONS = "transactions";
  @SerializedName(SERIALIZED_NAME_TRANSACTIONS)
  private Boolean transactions = true;


  public ProductAccess statements(Boolean statements) {
    
    this.statements = statements;
    return this;
  }

   /**
   * Allow access to statements. Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return statements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to statements. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getStatements() {
    return statements;
  }


  public void setStatements(Boolean statements) {
    this.statements = statements;
  }


  public ProductAccess identity(Boolean identity) {
    
    this.identity = identity;
    return this;
  }

   /**
   * Allow access to the Identity product (name, email, phone, address). Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return identity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to the Identity product (name, email, phone, address). Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getIdentity() {
    return identity;
  }


  public void setIdentity(Boolean identity) {
    this.identity = identity;
  }


  public ProductAccess auth(Boolean auth) {
    
    this.auth = auth;
    return this;
  }

   /**
   * Allow access to account number details. Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return auth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to account number details. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getAuth() {
    return auth;
  }


  public void setAuth(Boolean auth) {
    this.auth = auth;
  }


  public ProductAccess transactions(Boolean transactions) {
    
    this.transactions = transactions;
    return this;
  }

   /**
   * Allow access to transaction details. Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return transactions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow access to transaction details. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getTransactions() {
    return transactions;
  }


  public void setTransactions(Boolean transactions) {
    this.transactions = transactions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAccess productAccess = (ProductAccess) o;
    return Objects.equals(this.statements, productAccess.statements) &&
        Objects.equals(this.identity, productAccess.identity) &&
        Objects.equals(this.auth, productAccess.auth) &&
        Objects.equals(this.transactions, productAccess.transactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statements, identity, auth, transactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAccess {\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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

