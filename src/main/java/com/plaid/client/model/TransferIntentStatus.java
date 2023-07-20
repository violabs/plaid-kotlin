/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.390.0
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
 * The status of the transfer intent.  &#x60;PENDING&#x60;: The transfer intent is pending. &#x60;SUCCEEDED&#x60;: The transfer intent was successfully created. &#x60;FAILED&#x60;: The transfer intent was unable to be created.
 */
@JsonAdapter(TransferIntentStatus.Adapter.class)
public enum TransferIntentStatus {
  
  PENDING("PENDING"),
  
  SUCCEEDED("SUCCEEDED"),
  
  FAILED("FAILED"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferIntentStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferIntentStatus fromValue(String value) {
    for (TransferIntentStatus b : TransferIntentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferIntentStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferIntentStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferIntentStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferIntentStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferIntentStatus.fromValue(value);
    }
  }
}

