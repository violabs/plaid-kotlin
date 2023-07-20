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
import com.plaid.client.model.CreditFilter;
import com.plaid.client.model.DepositoryFilter;
import com.plaid.client.model.InvestmentFilter;
import com.plaid.client.model.LoanFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The &#x60;account_filters&#x60; specified in the original call to &#x60;/link/token/create&#x60;. 
 */
@ApiModel(description = "The `account_filters` specified in the original call to `/link/token/create`. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-18T21:18:35.789894Z[Etc/UTC]")
public class AccountFiltersResponse {
  public static final String SERIALIZED_NAME_DEPOSITORY = "depository";
  @SerializedName(SERIALIZED_NAME_DEPOSITORY)
  private DepositoryFilter depository;

  public static final String SERIALIZED_NAME_CREDIT = "credit";
  @SerializedName(SERIALIZED_NAME_CREDIT)
  private CreditFilter credit;

  public static final String SERIALIZED_NAME_LOAN = "loan";
  @SerializedName(SERIALIZED_NAME_LOAN)
  private LoanFilter loan;

  public static final String SERIALIZED_NAME_INVESTMENT = "investment";
  @SerializedName(SERIALIZED_NAME_INVESTMENT)
  private InvestmentFilter investment;


  public AccountFiltersResponse depository(DepositoryFilter depository) {
    
    this.depository = depository;
    return this;
  }

   /**
   * Get depository
   * @return depository
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DepositoryFilter getDepository() {
    return depository;
  }


  public void setDepository(DepositoryFilter depository) {
    this.depository = depository;
  }


  public AccountFiltersResponse credit(CreditFilter credit) {
    
    this.credit = credit;
    return this;
  }

   /**
   * Get credit
   * @return credit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditFilter getCredit() {
    return credit;
  }


  public void setCredit(CreditFilter credit) {
    this.credit = credit;
  }


  public AccountFiltersResponse loan(LoanFilter loan) {
    
    this.loan = loan;
    return this;
  }

   /**
   * Get loan
   * @return loan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LoanFilter getLoan() {
    return loan;
  }


  public void setLoan(LoanFilter loan) {
    this.loan = loan;
  }


  public AccountFiltersResponse investment(InvestmentFilter investment) {
    
    this.investment = investment;
    return this;
  }

   /**
   * Get investment
   * @return investment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvestmentFilter getInvestment() {
    return investment;
  }


  public void setInvestment(InvestmentFilter investment) {
    this.investment = investment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFiltersResponse accountFiltersResponse = (AccountFiltersResponse) o;
    return Objects.equals(this.depository, accountFiltersResponse.depository) &&
        Objects.equals(this.credit, accountFiltersResponse.credit) &&
        Objects.equals(this.loan, accountFiltersResponse.loan) &&
        Objects.equals(this.investment, accountFiltersResponse.investment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(depository, credit, loan, investment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountFiltersResponse {\n");
    sb.append("    depository: ").append(toIndentedString(depository)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    loan: ").append(toIndentedString(loan)).append("\n");
    sb.append("    investment: ").append(toIndentedString(investment)).append("\n");
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

