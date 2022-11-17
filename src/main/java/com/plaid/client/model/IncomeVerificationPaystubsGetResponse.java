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
import com.plaid.client.model.DocumentMetadata;
import com.plaid.client.model.Paystub;
import com.plaid.client.model.PlaidError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IncomeVerificationPaystubsGetResponse defines the response schema for &#x60;/income/verification/paystubs/get&#x60;.
 */
@ApiModel(description = "IncomeVerificationPaystubsGetResponse defines the response schema for `/income/verification/paystubs/get`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T17:52:41.932844Z[Etc/UTC]")
public class IncomeVerificationPaystubsGetResponse {
  public static final String SERIALIZED_NAME_DOCUMENT_METADATA = "document_metadata";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_METADATA)
  private List<DocumentMetadata> documentMetadata = null;

  public static final String SERIALIZED_NAME_PAYSTUBS = "paystubs";
  @SerializedName(SERIALIZED_NAME_PAYSTUBS)
  private List<Paystub> paystubs = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private PlaidError error;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public IncomeVerificationPaystubsGetResponse documentMetadata(List<DocumentMetadata> documentMetadata) {
    
    this.documentMetadata = documentMetadata;
    return this;
  }

  public IncomeVerificationPaystubsGetResponse addDocumentMetadataItem(DocumentMetadata documentMetadataItem) {
    if (this.documentMetadata == null) {
      this.documentMetadata = new ArrayList<>();
    }
    this.documentMetadata.add(documentMetadataItem);
    return this;
  }

   /**
   * Metadata for an income document.
   * @return documentMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Metadata for an income document.")

  public List<DocumentMetadata> getDocumentMetadata() {
    return documentMetadata;
  }


  public void setDocumentMetadata(List<DocumentMetadata> documentMetadata) {
    this.documentMetadata = documentMetadata;
  }


  public IncomeVerificationPaystubsGetResponse paystubs(List<Paystub> paystubs) {
    
    this.paystubs = paystubs;
    return this;
  }

  public IncomeVerificationPaystubsGetResponse addPaystubsItem(Paystub paystubsItem) {
    this.paystubs.add(paystubsItem);
    return this;
  }

   /**
   * Get paystubs
   * @return paystubs
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Paystub> getPaystubs() {
    return paystubs;
  }


  public void setPaystubs(List<Paystub> paystubs) {
    this.paystubs = paystubs;
  }


  public IncomeVerificationPaystubsGetResponse error(PlaidError error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PlaidError getError() {
    return error;
  }


  public void setError(PlaidError error) {
    this.error = error;
  }


  public IncomeVerificationPaystubsGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationPaystubsGetResponse incomeVerificationPaystubsGetResponse = (IncomeVerificationPaystubsGetResponse) o;
    return Objects.equals(this.documentMetadata, incomeVerificationPaystubsGetResponse.documentMetadata) &&
        Objects.equals(this.paystubs, incomeVerificationPaystubsGetResponse.paystubs) &&
        Objects.equals(this.error, incomeVerificationPaystubsGetResponse.error) &&
        Objects.equals(this.requestId, incomeVerificationPaystubsGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentMetadata, paystubs, error, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationPaystubsGetResponse {\n");
    sb.append("    documentMetadata: ").append(toIndentedString(documentMetadata)).append("\n");
    sb.append("    paystubs: ").append(toIndentedString(paystubs)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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

