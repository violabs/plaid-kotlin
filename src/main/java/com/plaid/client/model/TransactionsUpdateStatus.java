/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.517.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * A description of the update status for transaction pulls of an Item.  &#x60;TRANSACTIONS_UPDATE_STATUS_UNKNOWN&#x60;: Unable to fetch transactions update status for Item. &#x60;NOT_READY&#x60;: The Item is pending transaction pull. &#x60;INITIAL_UPDATE_COMPLETE&#x60;: Initial pull for the Item is complete, historical pull is pending. &#x60;HISTORICAL_UPDATE_COMPLETE&#x60;: Both initial and historical pull for Item are complete.
 */
@JsonAdapter(TransactionsUpdateStatus.Adapter.class)
public enum TransactionsUpdateStatus {
  
  TRANSACTIONS_UPDATE_STATUS_UNKNOWN("TRANSACTIONS_UPDATE_STATUS_UNKNOWN"),
  
  NOT_READY("NOT_READY"),
  
  INITIAL_UPDATE_COMPLETE("INITIAL_UPDATE_COMPLETE"),
  
  HISTORICAL_UPDATE_COMPLETE("HISTORICAL_UPDATE_COMPLETE"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransactionsUpdateStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransactionsUpdateStatus fromValue(String value) {
    for (TransactionsUpdateStatus b : TransactionsUpdateStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransactionsUpdateStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransactionsUpdateStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransactionsUpdateStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransactionsUpdateStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransactionsUpdateStatus.fromValue(value);
    }
  }
}

