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
 * The object contains a risk score and a risk tier that evaluate the transaction return risk because an account is overdrawn or because an ineligible account is used. Common return codes in this category include: \&quot;R01\&quot;, \&quot;R02\&quot;, \&quot;R03\&quot;, \&quot;R04\&quot;, \&quot;R06\&quot;, \&quot;R08\&quot;,  \&quot;R09\&quot;, \&quot;R13\&quot;, \&quot;R16\&quot;, \&quot;R17\&quot;, \&quot;R20\&quot;, \&quot;R23\&quot;. These returns have a turnaround time of 2 banking days.
 */
@ApiModel(description = "The object contains a risk score and a risk tier that evaluate the transaction return risk because an account is overdrawn or because an ineligible account is used. Common return codes in this category include: \"R01\", \"R02\", \"R03\", \"R04\", \"R06\", \"R08\",  \"R09\", \"R13\", \"R16\", \"R17\", \"R20\", \"R23\". These returns have a turnaround time of 2 banking days.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T17:52:41.932844Z[Etc/UTC]")
public class BankInitiatedReturnRisk {
  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Integer score;

  public static final String SERIALIZED_NAME_RISK_TIER = "risk_tier";
  @SerializedName(SERIALIZED_NAME_RISK_TIER)
  private Integer riskTier;


  public BankInitiatedReturnRisk score(Integer score) {
    
    this.score = score;
    return this;
  }

   /**
   * A score from 1-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.
   * minimum: 1
   * maximum: 99
   * @return score
  **/
  @ApiModelProperty(required = true, value = "A score from 1-99 that indicates the transaction return risk: a higher risk score suggests a higher return likelihood.")

  public Integer getScore() {
    return score;
  }


  public void setScore(Integer score) {
    this.score = score;
  }


  public BankInitiatedReturnRisk riskTier(Integer riskTier) {
    
    this.riskTier = riskTier;
    return this;
  }

   /**
   * In the &#x60;bank_initiated_return_risk&#x60; object, there are eight risk tiers corresponding to the scores:   1: Predicted bank-initiated return incidence rate between 0.0% - 0.5%   2: Predicted bank-initiated return incidence rate between 0.5% - 1.5%   3: Predicted bank-initiated return incidence rate between 1.5% - 3%   4: Predicted bank-initiated return incidence rate between 3% - 5%   5: Predicted bank-initiated return incidence rate between 5% - 10%   6: Predicted bank-initiated return incidence rate between 10% - 15%   7: Predicted bank-initiated return incidence rate between 15% and 50%   8: Predicted bank-initiated return incidence rate greater than 50% 
   * minimum: 1
   * maximum: 8
   * @return riskTier
  **/
  @ApiModelProperty(required = true, value = "In the `bank_initiated_return_risk` object, there are eight risk tiers corresponding to the scores:   1: Predicted bank-initiated return incidence rate between 0.0% - 0.5%   2: Predicted bank-initiated return incidence rate between 0.5% - 1.5%   3: Predicted bank-initiated return incidence rate between 1.5% - 3%   4: Predicted bank-initiated return incidence rate between 3% - 5%   5: Predicted bank-initiated return incidence rate between 5% - 10%   6: Predicted bank-initiated return incidence rate between 10% - 15%   7: Predicted bank-initiated return incidence rate between 15% and 50%   8: Predicted bank-initiated return incidence rate greater than 50% ")

  public Integer getRiskTier() {
    return riskTier;
  }


  public void setRiskTier(Integer riskTier) {
    this.riskTier = riskTier;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankInitiatedReturnRisk bankInitiatedReturnRisk = (BankInitiatedReturnRisk) o;
    return Objects.equals(this.score, bankInitiatedReturnRisk.score) &&
        Objects.equals(this.riskTier, bankInitiatedReturnRisk.riskTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, riskTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankInitiatedReturnRisk {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    riskTier: ").append(toIndentedString(riskTier)).append("\n");
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

