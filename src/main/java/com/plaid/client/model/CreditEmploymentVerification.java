/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.499.0
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
import com.plaid.client.model.CreditEmployerVerification;
import com.plaid.client.model.CreditPlatformIds;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * The object containing proof of employment data for an individual.
 */
@ApiModel(description = "The object containing proof of employment data for an individual.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:59:43.087249Z[Etc/UTC]")
public class CreditEmploymentVerification {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_EMPLOYER = "employer";
  @SerializedName(SERIALIZED_NAME_EMPLOYER)
  private CreditEmployerVerification employer;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_PLATFORM_IDS = "platform_ids";
  @SerializedName(SERIALIZED_NAME_PLATFORM_IDS)
  private CreditPlatformIds platformIds;

  public static final String SERIALIZED_NAME_EMPLOYEE_TYPE = "employee_type";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_TYPE)
  private String employeeType;

  public static final String SERIALIZED_NAME_LAST_PAYSTUB_DATE = "last_paystub_date";
  @SerializedName(SERIALIZED_NAME_LAST_PAYSTUB_DATE)
  private LocalDate lastPaystubDate;


  public CreditEmploymentVerification accountId(String accountId) {
    
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


  public CreditEmploymentVerification status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Current employment status.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Current employment status.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public CreditEmploymentVerification startDate(LocalDate startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * Start of employment in ISO 8601 format (YYYY-MM-DD).
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Start of employment in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getStartDate() {
    return startDate;
  }


  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }


  public CreditEmploymentVerification endDate(LocalDate endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * End of employment, if applicable. Provided in ISO 8601 format (YYY-MM-DD).
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "End of employment, if applicable. Provided in ISO 8601 format (YYY-MM-DD).")

  public LocalDate getEndDate() {
    return endDate;
  }


  public void setEndDate(LocalDate endDate) {
    this.endDate = endDate;
  }


  public CreditEmploymentVerification employer(CreditEmployerVerification employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * Get employer
   * @return employer
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditEmployerVerification getEmployer() {
    return employer;
  }


  public void setEmployer(CreditEmployerVerification employer) {
    this.employer = employer;
  }


  public CreditEmploymentVerification title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Current title of employee.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "Current title of employee.")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CreditEmploymentVerification platformIds(CreditPlatformIds platformIds) {
    
    this.platformIds = platformIds;
    return this;
  }

   /**
   * Get platformIds
   * @return platformIds
  **/
  @ApiModelProperty(required = true, value = "")

  public CreditPlatformIds getPlatformIds() {
    return platformIds;
  }


  public void setPlatformIds(CreditPlatformIds platformIds) {
    this.platformIds = platformIds;
  }


  public CreditEmploymentVerification employeeType(String employeeType) {
    
    this.employeeType = employeeType;
    return this;
  }

   /**
   * The type of employment for the individual. &#x60;\&quot;FULL_TIME\&quot;&#x60;: A full-time employee. &#x60;\&quot;PART_TIME\&quot;&#x60;: A part-time employee. &#x60;\&quot;CONTRACTOR\&quot;&#x60;: An employee typically hired externally through a contracting group. &#x60;\&quot;TEMPORARY\&quot;&#x60;: A temporary employee. &#x60;\&quot;OTHER\&quot;&#x60;: The employee type is not one of the above defined types.
   * @return employeeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The type of employment for the individual. `\"FULL_TIME\"`: A full-time employee. `\"PART_TIME\"`: A part-time employee. `\"CONTRACTOR\"`: An employee typically hired externally through a contracting group. `\"TEMPORARY\"`: A temporary employee. `\"OTHER\"`: The employee type is not one of the above defined types.")

  public String getEmployeeType() {
    return employeeType;
  }


  public void setEmployeeType(String employeeType) {
    this.employeeType = employeeType;
  }


  public CreditEmploymentVerification lastPaystubDate(LocalDate lastPaystubDate) {
    
    this.lastPaystubDate = lastPaystubDate;
    return this;
  }

   /**
   * The date of the employee&#39;s most recent paystub in ISO 8601 format (YYYY-MM-DD).
   * @return lastPaystubDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The date of the employee's most recent paystub in ISO 8601 format (YYYY-MM-DD).")

  public LocalDate getLastPaystubDate() {
    return lastPaystubDate;
  }


  public void setLastPaystubDate(LocalDate lastPaystubDate) {
    this.lastPaystubDate = lastPaystubDate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditEmploymentVerification creditEmploymentVerification = (CreditEmploymentVerification) o;
    return Objects.equals(this.accountId, creditEmploymentVerification.accountId) &&
        Objects.equals(this.status, creditEmploymentVerification.status) &&
        Objects.equals(this.startDate, creditEmploymentVerification.startDate) &&
        Objects.equals(this.endDate, creditEmploymentVerification.endDate) &&
        Objects.equals(this.employer, creditEmploymentVerification.employer) &&
        Objects.equals(this.title, creditEmploymentVerification.title) &&
        Objects.equals(this.platformIds, creditEmploymentVerification.platformIds) &&
        Objects.equals(this.employeeType, creditEmploymentVerification.employeeType) &&
        Objects.equals(this.lastPaystubDate, creditEmploymentVerification.lastPaystubDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, status, startDate, endDate, employer, title, platformIds, employeeType, lastPaystubDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditEmploymentVerification {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    platformIds: ").append(toIndentedString(platformIds)).append("\n");
    sb.append("    employeeType: ").append(toIndentedString(employeeType)).append("\n");
    sb.append("    lastPaystubDate: ").append(toIndentedString(lastPaystubDate)).append("\n");
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

