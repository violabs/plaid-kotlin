/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.54.2
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
import com.plaid.client.model.PaystubVerificationStatus;
import com.plaid.client.model.VerificationAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * An object containing details on the paystub&#39;s verification status. This object will only be populated if the [&#x60;income_verification.access_tokens&#x60;](/docs/api/tokens/#link-token-create-request-income-verification-access-tokens) parameter was provided during the &#x60;/link/token/create&#x60; call or if a problem was detected with the information supplied by the user; otherwise it will be &#x60;null&#x60;.
 */
@ApiModel(description = "An object containing details on the paystub's verification status. This object will only be populated if the [`income_verification.access_tokens`](/docs/api/tokens/#link-token-create-request-income-verification-access-tokens) parameter was provided during the `/link/token/create` call or if a problem was detected with the information supplied by the user; otherwise it will be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-01T18:55:04.982Z[GMT]")
public class PaystubVerification {
  public static final String SERIALIZED_NAME_VERIFICATION_STATUS = "verification_status";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_STATUS)
  private PaystubVerificationStatus verificationStatus;

  public static final String SERIALIZED_NAME_VERIFICATION_ATTRIBUTES = "verification_attributes";
  @SerializedName(SERIALIZED_NAME_VERIFICATION_ATTRIBUTES)
  private List<VerificationAttribute> verificationAttributes = new ArrayList<>();


  public PaystubVerification verificationStatus(PaystubVerificationStatus verificationStatus) {
    
    this.verificationStatus = verificationStatus;
    return this;
  }

   /**
   * Get verificationStatus
   * @return verificationStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public PaystubVerificationStatus getVerificationStatus() {
    return verificationStatus;
  }


  public void setVerificationStatus(PaystubVerificationStatus verificationStatus) {
    this.verificationStatus = verificationStatus;
  }


  public PaystubVerification verificationAttributes(List<VerificationAttribute> verificationAttributes) {
    
    this.verificationAttributes = verificationAttributes;
    return this;
  }

  public PaystubVerification addVerificationAttributesItem(VerificationAttribute verificationAttributesItem) {
    this.verificationAttributes.add(verificationAttributesItem);
    return this;
  }

   /**
   * Get verificationAttributes
   * @return verificationAttributes
  **/
  @ApiModelProperty(required = true, value = "")

  public List<VerificationAttribute> getVerificationAttributes() {
    return verificationAttributes;
  }


  public void setVerificationAttributes(List<VerificationAttribute> verificationAttributes) {
    this.verificationAttributes = verificationAttributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaystubVerification paystubVerification = (PaystubVerification) o;
    return Objects.equals(this.verificationStatus, paystubVerification.verificationStatus) &&
        Objects.equals(this.verificationAttributes, paystubVerification.verificationAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(verificationStatus, verificationAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaystubVerification {\n");
    sb.append("    verificationStatus: ").append(toIndentedString(verificationStatus)).append("\n");
    sb.append("    verificationAttributes: ").append(toIndentedString(verificationAttributes)).append("\n");
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
