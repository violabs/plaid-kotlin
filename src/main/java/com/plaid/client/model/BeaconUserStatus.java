/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.406.1
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
 * A status of a Beacon User.  &#x60;rejected&#x60;: The Beacon User has been rejected for fraud. Users can be automatically or manually rejected.  &#x60;pending_review&#x60;: The Beacon User has been marked for review.  &#x60;cleared&#x60;: The Beacon User has been cleared of fraud.
 */
@JsonAdapter(BeaconUserStatus.Adapter.class)
public enum BeaconUserStatus {
  
  REJECTED("rejected"),
  
  PENDING_REVIEW("pending_review"),
  
  CLEARED("cleared"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  BeaconUserStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static BeaconUserStatus fromValue(String value) {
    for (BeaconUserStatus b : BeaconUserStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return BeaconUserStatus.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<BeaconUserStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final BeaconUserStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public BeaconUserStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return BeaconUserStatus.fromValue(value);
    }
  }
}

