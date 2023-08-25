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
import com.plaid.client.model.CreditFreddieMacPartyVOA24;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A collection of objects that define specific parties to a deal. This includes the direct participating parties, such as borrower and seller and the indirect parties such as the credit report provider.
 */
@ApiModel(description = "A collection of objects that define specific parties to a deal. This includes the direct participating parties, such as borrower and seller and the indirect parties such as the credit report provider.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T17:41:29.341032Z[Etc/UTC]")
public class CreditFreddieMacPartiesVOA24 {
  public static final String SERIALIZED_NAME_P_A_R_T_Y = "PARTY";
  @SerializedName(SERIALIZED_NAME_P_A_R_T_Y)
  private List<CreditFreddieMacPartyVOA24> PARTY = new ArrayList<>();


  public CreditFreddieMacPartiesVOA24 PARTY(List<CreditFreddieMacPartyVOA24> PARTY) {
    
    this.PARTY = PARTY;
    return this;
  }

  public CreditFreddieMacPartiesVOA24 addPARTYItem(CreditFreddieMacPartyVOA24 PARTYItem) {
    this.PARTY.add(PARTYItem);
    return this;
  }

   /**
   * Get PARTY
   * @return PARTY
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CreditFreddieMacPartyVOA24> getPARTY() {
    return PARTY;
  }


  public void setPARTY(List<CreditFreddieMacPartyVOA24> PARTY) {
    this.PARTY = PARTY;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditFreddieMacPartiesVOA24 creditFreddieMacPartiesVOA24 = (CreditFreddieMacPartiesVOA24) o;
    return Objects.equals(this.PARTY, creditFreddieMacPartiesVOA24.PARTY);
  }

  @Override
  public int hashCode() {
    return Objects.hash(PARTY);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditFreddieMacPartiesVOA24 {\n");
    sb.append("    PARTY: ").append(toIndentedString(PARTY)).append("\n");
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

