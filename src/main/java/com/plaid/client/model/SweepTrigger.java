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
 * The trigger of the sweep  &#x60;\&quot;manual\&quot;&#x60; - The sweep is created manually by the customer &#x60;\&quot;incoming\&quot;&#x60; - The sweep is created by incoming funds flow (e.g. Incoming Wire) &#x60;\&quot;balance_threshold\&quot;&#x60; - The sweep is created by balance threshold setting &#x60;\&quot;automatic_aggregate\&quot;&#x60; - The sweep is created by the Plaid automatic aggregation process. These funds did not pass through the Plaid Ledger balance.
 */
@JsonAdapter(SweepTrigger.Adapter.class)
public enum SweepTrigger {
  
  MANUAL("manual"),
  
  INCOMING("incoming"),
  
  BALANCE_THRESHOLD("balance_threshold"),
  
  AUTOMATIC_AGGREGATE("automatic_aggregate"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  SweepTrigger(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static SweepTrigger fromValue(String value) {
    for (SweepTrigger b : SweepTrigger.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;  }

  public static class Adapter extends TypeAdapter<SweepTrigger> {
    @Override
    public void write(final JsonWriter jsonWriter, final SweepTrigger enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public SweepTrigger read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return SweepTrigger.fromValue(value);
    }
  }
}

