/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
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
import com.plaid.client.model.MultiDocumentRiskSignal;
import com.plaid.client.model.SingleDocumentRiskSignal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Object containing fraud risk data for a set of income documents
 */
@ApiModel(description = "Object containing fraud risk data for a set of income documents")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T16:58:21.384791Z[Etc/UTC]")
public class DocumentRiskSignalsObject {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SINGLE_DOCUMENT_RISK_SIGNALS = "single_document_risk_signals";
  @SerializedName(SERIALIZED_NAME_SINGLE_DOCUMENT_RISK_SIGNALS)
  private List<SingleDocumentRiskSignal> singleDocumentRiskSignals = new ArrayList<>();

  public static final String SERIALIZED_NAME_MULTI_DOCUMENT_RISK_SIGNALS = "multi_document_risk_signals";
  @SerializedName(SERIALIZED_NAME_MULTI_DOCUMENT_RISK_SIGNALS)
  private List<MultiDocumentRiskSignal> multiDocumentRiskSignals = new ArrayList<>();


  public DocumentRiskSignalsObject accountId(String accountId) {
    
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


  public DocumentRiskSignalsObject singleDocumentRiskSignals(List<SingleDocumentRiskSignal> singleDocumentRiskSignals) {
    
    this.singleDocumentRiskSignals = singleDocumentRiskSignals;
    return this;
  }

  public DocumentRiskSignalsObject addSingleDocumentRiskSignalsItem(SingleDocumentRiskSignal singleDocumentRiskSignalsItem) {
    this.singleDocumentRiskSignals.add(singleDocumentRiskSignalsItem);
    return this;
  }

   /**
   * Array of document metadata and associated risk signals per document
   * @return singleDocumentRiskSignals
  **/
  @ApiModelProperty(required = true, value = "Array of document metadata and associated risk signals per document")

  public List<SingleDocumentRiskSignal> getSingleDocumentRiskSignals() {
    return singleDocumentRiskSignals;
  }


  public void setSingleDocumentRiskSignals(List<SingleDocumentRiskSignal> singleDocumentRiskSignals) {
    this.singleDocumentRiskSignals = singleDocumentRiskSignals;
  }


  public DocumentRiskSignalsObject multiDocumentRiskSignals(List<MultiDocumentRiskSignal> multiDocumentRiskSignals) {
    
    this.multiDocumentRiskSignals = multiDocumentRiskSignals;
    return this;
  }

  public DocumentRiskSignalsObject addMultiDocumentRiskSignalsItem(MultiDocumentRiskSignal multiDocumentRiskSignalsItem) {
    this.multiDocumentRiskSignals.add(multiDocumentRiskSignalsItem);
    return this;
  }

   /**
   * Array of risk signals computed from a set of uploaded documents and the associated documents&#39; metadata
   * @return multiDocumentRiskSignals
  **/
  @ApiModelProperty(required = true, value = "Array of risk signals computed from a set of uploaded documents and the associated documents' metadata")

  public List<MultiDocumentRiskSignal> getMultiDocumentRiskSignals() {
    return multiDocumentRiskSignals;
  }


  public void setMultiDocumentRiskSignals(List<MultiDocumentRiskSignal> multiDocumentRiskSignals) {
    this.multiDocumentRiskSignals = multiDocumentRiskSignals;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentRiskSignalsObject documentRiskSignalsObject = (DocumentRiskSignalsObject) o;
    return Objects.equals(this.accountId, documentRiskSignalsObject.accountId) &&
        Objects.equals(this.singleDocumentRiskSignals, documentRiskSignalsObject.singleDocumentRiskSignals) &&
        Objects.equals(this.multiDocumentRiskSignals, documentRiskSignalsObject.multiDocumentRiskSignals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, singleDocumentRiskSignals, multiDocumentRiskSignals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentRiskSignalsObject {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    singleDocumentRiskSignals: ").append(toIndentedString(singleDocumentRiskSignals)).append("\n");
    sb.append("    multiDocumentRiskSignals: ").append(toIndentedString(multiDocumentRiskSignals)).append("\n");
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

