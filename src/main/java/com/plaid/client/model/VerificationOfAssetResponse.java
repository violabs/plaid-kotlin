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
import com.plaid.client.model.Assets;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * No documentation available
 */
@ApiModel(description = "No documentation available")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T17:52:41.932844Z[Etc/UTC]")
public class VerificationOfAssetResponse {
  public static final String SERIALIZED_NAME_A_S_S_E_T_S = "ASSETS";
  @SerializedName(SERIALIZED_NAME_A_S_S_E_T_S)
  private Assets ASSETS;


  public VerificationOfAssetResponse ASSETS(Assets ASSETS) {
    
    this.ASSETS = ASSETS;
    return this;
  }

   /**
   * Get ASSETS
   * @return ASSETS
  **/
  @ApiModelProperty(required = true, value = "")

  public Assets getASSETS() {
    return ASSETS;
  }


  public void setASSETS(Assets ASSETS) {
    this.ASSETS = ASSETS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VerificationOfAssetResponse verificationOfAssetResponse = (VerificationOfAssetResponse) o;
    return Objects.equals(this.ASSETS, verificationOfAssetResponse.ASSETS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ASSETS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VerificationOfAssetResponse {\n");
    sb.append("    ASSETS: ").append(toIndentedString(ASSETS)).append("\n");
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

