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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An object representing the rate at which an individual is paid.
 */
@ApiModel(description = "An object representing the rate at which an individual is paid.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T17:41:29.341032Z[Etc/UTC]")
public class PayrollIncomeRateOfPay {
  public static final String SERIALIZED_NAME_PAY_RATE = "pay_rate";
  @SerializedName(SERIALIZED_NAME_PAY_RATE)
  private String payRate;

  public static final String SERIALIZED_NAME_PAY_AMOUNT = "pay_amount";
  @SerializedName(SERIALIZED_NAME_PAY_AMOUNT)
  private Double payAmount;


  public PayrollIncomeRateOfPay payRate(String payRate) {
    
    this.payRate = payRate;
    return this;
  }

   /**
   * The rate at which an employee is paid.
   * @return payRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The rate at which an employee is paid.")

  public String getPayRate() {
    return payRate;
  }


  public void setPayRate(String payRate) {
    this.payRate = payRate;
  }


  public PayrollIncomeRateOfPay payAmount(Double payAmount) {
    
    this.payAmount = payAmount;
    return this;
  }

   /**
   * The amount at which an employee is paid.
   * @return payAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount at which an employee is paid.")

  public Double getPayAmount() {
    return payAmount;
  }


  public void setPayAmount(Double payAmount) {
    this.payAmount = payAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayrollIncomeRateOfPay payrollIncomeRateOfPay = (PayrollIncomeRateOfPay) o;
    return Objects.equals(this.payRate, payrollIncomeRateOfPay.payRate) &&
        Objects.equals(this.payAmount, payrollIncomeRateOfPay.payAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payRate, payAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayrollIncomeRateOfPay {\n");
    sb.append("    payRate: ").append(toIndentedString(payRate)).append("\n");
    sb.append("    payAmount: ").append(toIndentedString(payAmount)).append("\n");
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

