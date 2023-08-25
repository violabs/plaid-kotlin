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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An optional object to be used with the request.
 */
@ApiModel(description = "An optional object to be used with the request.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-25T17:41:29.341032Z[Etc/UTC]")
public class TransactionsEnrichRequestOptions {
  public static final String SERIALIZED_NAME_INCLUDE_LEGACY_CATEGORY = "include_legacy_category";
  @SerializedName(SERIALIZED_NAME_INCLUDE_LEGACY_CATEGORY)
  private Boolean includeLegacyCategory = false;


  public TransactionsEnrichRequestOptions includeLegacyCategory(Boolean includeLegacyCategory) {
    
    this.includeLegacyCategory = includeLegacyCategory;
    return this;
  }

   /**
   * Include &#x60;legacy_category&#x60; and &#x60;legacy_category_id&#x60; in the response (in addition to the default &#x60;personal_finance_category&#x60;).  Categories are based on Plaid&#39;s legacy taxonomy. For a full list of legacy categories, see [&#x60;/categories/get&#x60;](https://plaid.com/docs/api/products/transactions/#categoriesget).
   * @return includeLegacyCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include `legacy_category` and `legacy_category_id` in the response (in addition to the default `personal_finance_category`).  Categories are based on Plaid's legacy taxonomy. For a full list of legacy categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).")

  public Boolean getIncludeLegacyCategory() {
    return includeLegacyCategory;
  }


  public void setIncludeLegacyCategory(Boolean includeLegacyCategory) {
    this.includeLegacyCategory = includeLegacyCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsEnrichRequestOptions transactionsEnrichRequestOptions = (TransactionsEnrichRequestOptions) o;
    return Objects.equals(this.includeLegacyCategory, transactionsEnrichRequestOptions.includeLegacyCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeLegacyCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsEnrichRequestOptions {\n");
    sb.append("    includeLegacyCategory: ").append(toIndentedString(includeLegacyCategory)).append("\n");
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

