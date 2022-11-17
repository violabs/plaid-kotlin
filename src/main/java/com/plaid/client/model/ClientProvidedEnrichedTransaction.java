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
import com.plaid.client.model.EnrichTransactionDirection;
import com.plaid.client.model.Enrichments;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A client-provided transaction that Plaid has enriched.
 */
@ApiModel(description = "A client-provided transaction that Plaid has enriched.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T17:52:41.932844Z[Etc/UTC]")
public class ClientProvidedEnrichedTransaction {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_DIRECTION = "direction";
  @SerializedName(SERIALIZED_NAME_DIRECTION)
  private EnrichTransactionDirection direction;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_ENRICHMENTS = "enrichments";
  @SerializedName(SERIALIZED_NAME_ENRICHMENTS)
  private Enrichments enrichments;


  public ClientProvidedEnrichedTransaction id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID for the transaction as provided by you in the request.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The unique ID for the transaction as provided by you in the request.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ClientProvidedEnrichedTransaction description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The raw description of the transaction.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The raw description of the transaction.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ClientProvidedEnrichedTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The absolute value of the transaction (&gt;&#x3D; 0)
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The absolute value of the transaction (>= 0)")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public ClientProvidedEnrichedTransaction direction(EnrichTransactionDirection direction) {
    
    this.direction = direction;
    return this;
  }

   /**
   * Get direction
   * @return direction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnrichTransactionDirection getDirection() {
    return direction;
  }


  public void setDirection(EnrichTransactionDirection direction) {
    this.direction = direction;
  }


  public ClientProvidedEnrichedTransaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction, e.g., USD.
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the transaction, e.g., USD.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public ClientProvidedEnrichedTransaction enrichments(Enrichments enrichments) {
    
    this.enrichments = enrichments;
    return this;
  }

   /**
   * Get enrichments
   * @return enrichments
  **/
  @ApiModelProperty(required = true, value = "")

  public Enrichments getEnrichments() {
    return enrichments;
  }


  public void setEnrichments(Enrichments enrichments) {
    this.enrichments = enrichments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientProvidedEnrichedTransaction clientProvidedEnrichedTransaction = (ClientProvidedEnrichedTransaction) o;
    return Objects.equals(this.id, clientProvidedEnrichedTransaction.id) &&
        Objects.equals(this.description, clientProvidedEnrichedTransaction.description) &&
        Objects.equals(this.amount, clientProvidedEnrichedTransaction.amount) &&
        Objects.equals(this.direction, clientProvidedEnrichedTransaction.direction) &&
        Objects.equals(this.isoCurrencyCode, clientProvidedEnrichedTransaction.isoCurrencyCode) &&
        Objects.equals(this.enrichments, clientProvidedEnrichedTransaction.enrichments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, amount, direction, isoCurrencyCode, enrichments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientProvidedEnrichedTransaction {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    enrichments: ").append(toIndentedString(enrichments)).append("\n");
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

