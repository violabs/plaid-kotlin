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
import com.plaid.client.model.Credit1099;
import com.plaid.client.model.CreditPayStub;
import com.plaid.client.model.CreditW2;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object representing payroll data.
 */
@ApiModel(description = "An object representing payroll data.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-18T21:18:35.789894Z[Etc/UTC]")
public class PayrollIncomeObject {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_PAY_STUBS = "pay_stubs";
  @SerializedName(SERIALIZED_NAME_PAY_STUBS)
  private List<CreditPayStub> payStubs = new ArrayList<>();

  public static final String SERIALIZED_NAME_W2S = "w2s";
  @SerializedName(SERIALIZED_NAME_W2S)
  private List<CreditW2> w2s = new ArrayList<>();

  public static final String SERIALIZED_NAME_FORM1099S = "form1099s";
  @SerializedName(SERIALIZED_NAME_FORM1099S)
  private List<Credit1099> form1099s = new ArrayList<>();


  public PayrollIncomeObject accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * ID of the payroll provider account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "ID of the payroll provider account.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public PayrollIncomeObject payStubs(List<CreditPayStub> payStubs) {
    
    this.payStubs = payStubs;
    return this;
  }

  public PayrollIncomeObject addPayStubsItem(CreditPayStub payStubsItem) {
    this.payStubs.add(payStubsItem);
    return this;
  }

   /**
   * Array of pay stubs for the user.
   * @return payStubs
  **/
  @ApiModelProperty(required = true, value = "Array of pay stubs for the user.")

  public List<CreditPayStub> getPayStubs() {
    return payStubs;
  }


  public void setPayStubs(List<CreditPayStub> payStubs) {
    this.payStubs = payStubs;
  }


  public PayrollIncomeObject w2s(List<CreditW2> w2s) {
    
    this.w2s = w2s;
    return this;
  }

  public PayrollIncomeObject addW2sItem(CreditW2 w2sItem) {
    this.w2s.add(w2sItem);
    return this;
  }

   /**
   * Array of tax form W-2s.
   * @return w2s
  **/
  @ApiModelProperty(required = true, value = "Array of tax form W-2s.")

  public List<CreditW2> getW2s() {
    return w2s;
  }


  public void setW2s(List<CreditW2> w2s) {
    this.w2s = w2s;
  }


  public PayrollIncomeObject form1099s(List<Credit1099> form1099s) {
    
    this.form1099s = form1099s;
    return this;
  }

  public PayrollIncomeObject addForm1099sItem(Credit1099 form1099sItem) {
    this.form1099s.add(form1099sItem);
    return this;
  }

   /**
   * Array of tax form 1099s.
   * @return form1099s
  **/
  @ApiModelProperty(required = true, value = "Array of tax form 1099s.")

  public List<Credit1099> getForm1099s() {
    return form1099s;
  }


  public void setForm1099s(List<Credit1099> form1099s) {
    this.form1099s = form1099s;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayrollIncomeObject payrollIncomeObject = (PayrollIncomeObject) o;
    return Objects.equals(this.accountId, payrollIncomeObject.accountId) &&
        Objects.equals(this.payStubs, payrollIncomeObject.payStubs) &&
        Objects.equals(this.w2s, payrollIncomeObject.w2s) &&
        Objects.equals(this.form1099s, payrollIncomeObject.form1099s);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, payStubs, w2s, form1099s);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollIncomeObject {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    payStubs: ").append(toIndentedString(payStubs)).append("\n");
    sb.append("    w2s: ").append(toIndentedString(w2s)).append("\n");
    sb.append("    form1099s: ").append(toIndentedString(form1099s)).append("\n");
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

