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
import com.plaid.client.model.TransferRepaymentReturn;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the response schema for &#x60;/transfer/repayments/return/list&#x60;
 */
@ApiModel(description = "Defines the response schema for `/transfer/repayments/return/list`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T17:52:41.932844Z[Etc/UTC]")
public class TransferRepaymentReturnListResponse {
  public static final String SERIALIZED_NAME_REPAYMENT_RETURNS = "repayment_returns";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_RETURNS)
  private List<TransferRepaymentReturn> repaymentReturns = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public TransferRepaymentReturnListResponse repaymentReturns(List<TransferRepaymentReturn> repaymentReturns) {
    
    this.repaymentReturns = repaymentReturns;
    return this;
  }

  public TransferRepaymentReturnListResponse addRepaymentReturnsItem(TransferRepaymentReturn repaymentReturnsItem) {
    this.repaymentReturns.add(repaymentReturnsItem);
    return this;
  }

   /**
   * Get repaymentReturns
   * @return repaymentReturns
  **/
  @ApiModelProperty(required = true, value = "")

  public List<TransferRepaymentReturn> getRepaymentReturns() {
    return repaymentReturns;
  }


  public void setRepaymentReturns(List<TransferRepaymentReturn> repaymentReturns) {
    this.repaymentReturns = repaymentReturns;
  }


  public TransferRepaymentReturnListResponse requestId(String requestId) {
    
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
    TransferRepaymentReturnListResponse transferRepaymentReturnListResponse = (TransferRepaymentReturnListResponse) o;
    return Objects.equals(this.repaymentReturns, transferRepaymentReturnListResponse.repaymentReturns) &&
        Objects.equals(this.requestId, transferRepaymentReturnListResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(repaymentReturns, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRepaymentReturnListResponse {\n");
    sb.append("    repaymentReturns: ").append(toIndentedString(repaymentReturns)).append("\n");
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

