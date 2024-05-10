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
 * The ACH networks used for the funds flow.  For requests submitted as either &#x60;ach&#x60; or &#x60;same-day-ach&#x60; the cutoff for same-day is 3:30 PM Eastern Time and the cutoff for next-day transfers is 5:30 PM Eastern Time. It is recommended to submit a request at least 15 minutes before the cutoff time in order to ensure that it will be processed before the cutoff. Any request that is indicated as &#x60;same-day-ach&#x60; and that misses the same-day cutoff, but is submitted in time for the next-day cutoff, will be sent over next-day rails and will not incur same-day charges.
 */
@JsonAdapter(TransferACHNetwork.Adapter.class)
public enum TransferACHNetwork {
  
  ACH("ach"),
  
  SAME_DAY_ACH("same-day-ach"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  TransferACHNetwork(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TransferACHNetwork fromValue(String value) {
    for (TransferACHNetwork b : TransferACHNetwork.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return TransferACHNetwork.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<TransferACHNetwork> {
    @Override
    public void write(final JsonWriter jsonWriter, final TransferACHNetwork enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public TransferACHNetwork read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return TransferACHNetwork.fromValue(value);
    }
  }
}

