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
 * Indicates whether the email address top level domain, which is the last part of the domain, is fraudulent or risky if known. In most cases, a suspicious top level domain is also associated with a disposable or high-risk domain.
 */
@JsonAdapter(RiskCheckEmailTopLevelDomainIsSuspicious.Adapter.class)
public enum RiskCheckEmailTopLevelDomainIsSuspicious {
  
  YES("yes"),
  
  NO("no"),
  
  NO_DATA("no_data"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  RiskCheckEmailTopLevelDomainIsSuspicious(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static RiskCheckEmailTopLevelDomainIsSuspicious fromValue(String value) {
    for (RiskCheckEmailTopLevelDomainIsSuspicious b : RiskCheckEmailTopLevelDomainIsSuspicious.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return RiskCheckEmailTopLevelDomainIsSuspicious.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<RiskCheckEmailTopLevelDomainIsSuspicious> {
    @Override
    public void write(final JsonWriter jsonWriter, final RiskCheckEmailTopLevelDomainIsSuspicious enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public RiskCheckEmailTopLevelDomainIsSuspicious read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return RiskCheckEmailTopLevelDomainIsSuspicious.fromValue(value);
    }
  }
}

