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
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The frequency at which the employee is paid. Possible values: &#x60;MONTHLY&#x60;, &#x60;BI-WEEKLY&#x60;, &#x60;WEEKLY&#x60;, &#x60;SEMI-MONTHLY&#x60;.
 */
@JsonAdapter(PaystubPayFrequency.Adapter.class)
public enum PaystubPayFrequency {
  
  MONTHLY("MONTHLY"),
  
  BI_WEEKLY("BI-WEEKLY"),
  
  WEEKLY("WEEKLY"),
  
  SEMI_MONTHLY("SEMI-MONTHLY"),
  
  NULL("null"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaystubPayFrequency(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaystubPayFrequency fromValue(String value) {
    for (PaystubPayFrequency b : PaystubPayFrequency.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<PaystubPayFrequency> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaystubPayFrequency enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaystubPayFrequency read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaystubPayFrequency.fromValue(value);
    }
  }
}

