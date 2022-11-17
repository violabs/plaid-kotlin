/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.205.3
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
 * Requested disbursement (i.e. sending money) limits for the end customer.
 */
@ApiModel(description = "Requested disbursement (i.e. sending money) limits for the end customer.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T17:52:41.932844Z[Etc/UTC]")
public class DisbursementLimits {
  public static final String SERIALIZED_NAME_AVERAGE_AMOUNT = "average_amount";
  @SerializedName(SERIALIZED_NAME_AVERAGE_AMOUNT)
  private Integer averageAmount;

  public static final String SERIALIZED_NAME_MAXIMUM_AMOUNT = "maximum_amount";
  @SerializedName(SERIALIZED_NAME_MAXIMUM_AMOUNT)
  private Integer maximumAmount;

  public static final String SERIALIZED_NAME_MONTHLY_AMOUNT = "monthly_amount";
  @SerializedName(SERIALIZED_NAME_MONTHLY_AMOUNT)
  private Integer monthlyAmount;


  public DisbursementLimits averageAmount(Integer averageAmount) {
    
    this.averageAmount = averageAmount;
    return this;
  }

   /**
   * Average disbursement amount in a single transaction, in dollars.
   * @return averageAmount
  **/
  @ApiModelProperty(required = true, value = "Average disbursement amount in a single transaction, in dollars.")

  public Integer getAverageAmount() {
    return averageAmount;
  }


  public void setAverageAmount(Integer averageAmount) {
    this.averageAmount = averageAmount;
  }


  public DisbursementLimits maximumAmount(Integer maximumAmount) {
    
    this.maximumAmount = maximumAmount;
    return this;
  }

   /**
   * Maximum disbursement amount in a single transaction, in dollars.
   * @return maximumAmount
  **/
  @ApiModelProperty(required = true, value = "Maximum disbursement amount in a single transaction, in dollars.")

  public Integer getMaximumAmount() {
    return maximumAmount;
  }


  public void setMaximumAmount(Integer maximumAmount) {
    this.maximumAmount = maximumAmount;
  }


  public DisbursementLimits monthlyAmount(Integer monthlyAmount) {
    
    this.monthlyAmount = monthlyAmount;
    return this;
  }

   /**
   * Monthly disbursement amount, in dollars.
   * @return monthlyAmount
  **/
  @ApiModelProperty(required = true, value = "Monthly disbursement amount, in dollars.")

  public Integer getMonthlyAmount() {
    return monthlyAmount;
  }


  public void setMonthlyAmount(Integer monthlyAmount) {
    this.monthlyAmount = monthlyAmount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisbursementLimits disbursementLimits = (DisbursementLimits) o;
    return Objects.equals(this.averageAmount, disbursementLimits.averageAmount) &&
        Objects.equals(this.maximumAmount, disbursementLimits.maximumAmount) &&
        Objects.equals(this.monthlyAmount, disbursementLimits.monthlyAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageAmount, maximumAmount, monthlyAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisbursementLimits {\n");
    sb.append("    averageAmount: ").append(toIndentedString(averageAmount)).append("\n");
    sb.append("    maximumAmount: ").append(toIndentedString(maximumAmount)).append("\n");
    sb.append("    monthlyAmount: ").append(toIndentedString(monthlyAmount)).append("\n");
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

