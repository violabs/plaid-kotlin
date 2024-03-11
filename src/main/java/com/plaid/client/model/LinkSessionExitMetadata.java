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
import com.plaid.client.model.LinkSessionExitMetadataInstitution;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Displayed if a user exits Link without successfully linking an Item.
 */
@ApiModel(description = "Displayed if a user exits Link without successfully linking an Item.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:59:43.087249Z[Etc/UTC]")
public class LinkSessionExitMetadata {
  public static final String SERIALIZED_NAME_INSTITUTION = "institution";
  @SerializedName(SERIALIZED_NAME_INSTITUTION)
  private LinkSessionExitMetadataInstitution institution;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_LINK_SESSION_ID = "link_session_id";
  @SerializedName(SERIALIZED_NAME_LINK_SESSION_ID)
  private String linkSessionId;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public LinkSessionExitMetadata institution(LinkSessionExitMetadataInstitution institution) {
    
    this.institution = institution;
    return this;
  }

   /**
   * Get institution
   * @return institution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LinkSessionExitMetadataInstitution getInstitution() {
    return institution;
  }


  public void setInstitution(LinkSessionExitMetadataInstitution institution) {
    this.institution = institution;
  }


  public LinkSessionExitMetadata status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * The point at which the user exited the Link flow. One of the following values.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The point at which the user exited the Link flow. One of the following values.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public LinkSessionExitMetadata linkSessionId(String linkSessionId) {
    
    this.linkSessionId = linkSessionId;
    return this;
  }

   /**
   * A unique identifier associated with a user&#39;s actions and events through the Link flow. Include this identifier when opening a support ticket for faster turnaround.
   * @return linkSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique identifier associated with a user's actions and events through the Link flow. Include this identifier when opening a support ticket for faster turnaround.")

  public String getLinkSessionId() {
    return linkSessionId;
  }


  public void setLinkSessionId(String linkSessionId) {
    this.linkSessionId = linkSessionId;
  }


  public LinkSessionExitMetadata requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * The request ID for the last request made by Link. This can be shared with Plaid Support to expedite investigation.
   * @return requestId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The request ID for the last request made by Link. This can be shared with Plaid Support to expedite investigation.")

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
    LinkSessionExitMetadata linkSessionExitMetadata = (LinkSessionExitMetadata) o;
    return Objects.equals(this.institution, linkSessionExitMetadata.institution) &&
        Objects.equals(this.status, linkSessionExitMetadata.status) &&
        Objects.equals(this.linkSessionId, linkSessionExitMetadata.linkSessionId) &&
        Objects.equals(this.requestId, linkSessionExitMetadata.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(institution, status, linkSessionId, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkSessionExitMetadata {\n");
    sb.append("    institution: ").append(toIndentedString(institution)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    linkSessionId: ").append(toIndentedString(linkSessionId)).append("\n");
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

