/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.457.0
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
 * A description of whether the associated document was expired when the verification was performed.  Note: In the case where an expiration date is not present on the document or failed to be extracted, this value will be &#x60;no_data&#x60;.
 */
@JsonAdapter(ExpirationDate.Adapter.class)
public enum ExpirationDate {
  
  NOT_EXPIRED("not_expired"),
  
  EXPIRED("expired"),
  
  NO_DATA("no_data"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  ExpirationDate(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ExpirationDate fromValue(String value) {
    for (ExpirationDate b : ExpirationDate.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return ExpirationDate.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<ExpirationDate> {
    @Override
    public void write(final JsonWriter jsonWriter, final ExpirationDate enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ExpirationDate read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ExpirationDate.fromValue(value);
    }
  }
}

