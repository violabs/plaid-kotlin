/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
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
import com.plaid.client.model.LoanIdentifiers;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Information specific to a mortgage loan agreement between one or more borrowers and a mortgage lender.
 */
@ApiModel(description = "Information specific to a mortgage loan agreement between one or more borrowers and a mortgage lender.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T20:14:45.051727Z[Etc/UTC]")
public class Loan {
  public static final String SERIALIZED_NAME_L_O_A_N_I_D_E_N_T_I_F_I_E_R_S = "LOAN_IDENTIFIERS";
  @SerializedName(SERIALIZED_NAME_L_O_A_N_I_D_E_N_T_I_F_I_E_R_S)
  private LoanIdentifiers LOAN_IDENTIFIERS;


  public Loan LOAN_IDENTIFIERS(LoanIdentifiers LOAN_IDENTIFIERS) {
    
    this.LOAN_IDENTIFIERS = LOAN_IDENTIFIERS;
    return this;
  }

   /**
   * Get LOAN_IDENTIFIERS
   * @return LOAN_IDENTIFIERS
  **/
  @ApiModelProperty(required = true, value = "")

  public LoanIdentifiers getLOANIDENTIFIERS() {
    return LOAN_IDENTIFIERS;
  }


  public void setLOANIDENTIFIERS(LoanIdentifiers LOAN_IDENTIFIERS) {
    this.LOAN_IDENTIFIERS = LOAN_IDENTIFIERS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Loan loan = (Loan) o;
    return Objects.equals(this.LOAN_IDENTIFIERS, loan.LOAN_IDENTIFIERS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(LOAN_IDENTIFIERS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Loan {\n");
    sb.append("    LOAN_IDENTIFIERS: ").append(toIndentedString(LOAN_IDENTIFIERS)).append("\n");
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

