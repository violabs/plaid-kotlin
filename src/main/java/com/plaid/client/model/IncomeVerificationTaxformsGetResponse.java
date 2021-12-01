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
import com.plaid.client.model.DocumentMetadata;
import com.plaid.client.model.Error;
import com.plaid.client.model.Taxform;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * IncomeVerificationTaxformsGetResponse defines the response schema for &#x60;/income/verification/taxforms/get&#x60;
 */
@ApiModel(description = "IncomeVerificationTaxformsGetResponse defines the response schema for `/income/verification/taxforms/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-01T18:55:04.982Z[GMT]")
public class IncomeVerificationTaxformsGetResponse {
  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_DOCUMENT_METADATA = "document_metadata";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_METADATA)
  private List<DocumentMetadata> documentMetadata = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAXFORMS = "taxforms";
  @SerializedName(SERIALIZED_NAME_TAXFORMS)
  private List<Taxform> taxforms = new ArrayList<>();

  public static final String SERIALIZED_NAME_ERROR = "error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private Error error;


  public IncomeVerificationTaxformsGetResponse requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public IncomeVerificationTaxformsGetResponse documentMetadata(List<DocumentMetadata> documentMetadata) {
    
    this.documentMetadata = documentMetadata;
    return this;
  }

  public IncomeVerificationTaxformsGetResponse addDocumentMetadataItem(DocumentMetadata documentMetadataItem) {
    this.documentMetadata.add(documentMetadataItem);
    return this;
  }

   /**
   * Get documentMetadata
   * @return documentMetadata
  **/
  @ApiModelProperty(required = true, value = "")

  public List<DocumentMetadata> getDocumentMetadata() {
    return documentMetadata;
  }


  public void setDocumentMetadata(List<DocumentMetadata> documentMetadata) {
    this.documentMetadata = documentMetadata;
  }


  public IncomeVerificationTaxformsGetResponse taxforms(List<Taxform> taxforms) {
    
    this.taxforms = taxforms;
    return this;
  }

  public IncomeVerificationTaxformsGetResponse addTaxformsItem(Taxform taxformsItem) {
    this.taxforms.add(taxformsItem);
    return this;
  }

   /**
   * A list of taxforms.
   * @return taxforms
  **/
  @ApiModelProperty(required = true, value = "A list of taxforms.")

  public List<Taxform> getTaxforms() {
    return taxforms;
  }


  public void setTaxforms(List<Taxform> taxforms) {
    this.taxforms = taxforms;
  }


  public IncomeVerificationTaxformsGetResponse error(Error error) {
    
    this.error = error;
    return this;
  }

   /**
   * Get error
   * @return error
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Error getError() {
    return error;
  }


  public void setError(Error error) {
    this.error = error;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncomeVerificationTaxformsGetResponse incomeVerificationTaxformsGetResponse = (IncomeVerificationTaxformsGetResponse) o;
    return Objects.equals(this.requestId, incomeVerificationTaxformsGetResponse.requestId) &&
        Objects.equals(this.documentMetadata, incomeVerificationTaxformsGetResponse.documentMetadata) &&
        Objects.equals(this.taxforms, incomeVerificationTaxformsGetResponse.taxforms) &&
        Objects.equals(this.error, incomeVerificationTaxformsGetResponse.error);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, documentMetadata, taxforms, error);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncomeVerificationTaxformsGetResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    documentMetadata: ").append(toIndentedString(documentMetadata)).append("\n");
    sb.append("    taxforms: ").append(toIndentedString(taxforms)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
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
