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
 * A string representing the event that has just occurred in the Link flow.
 */
@JsonAdapter(LinkEventName.Adapter.class)
public enum LinkEventName {
  
  BANK_INCOME_INSIGHTS_COMPLETED("BANK_INCOME_INSIGHTS_COMPLETED"),
  
  CLOSE_OAUTH("CLOSE_OAUTH"),
  
  ERROR("ERROR"),
  
  EXIT("EXIT"),
  
  FAIL_OAUTH("FAIL_OAUTH"),
  
  HANDOFF("HANDOFF"),
  
  OPEN("OPEN"),
  
  OPEN_MY_PLAID("OPEN_MY_PLAID"),
  
  OPEN_OAUTH("OPEN_OAUTH"),
  
  SEARCH_INSTITUTION("SEARCH_INSTITUTION"),
  
  SELECT_AUTH_TYPE("SELECT_AUTH_TYPE"),
  
  SELECT_BRAND("SELECT_BRAND"),
  
  SELECT_DEGRADED_INSTITUTION("SELECT_DEGRADED_INSTITUTION"),
  
  SELECT_DOWN_INSTITUTION("SELECT_DOWN_INSTITUTION"),
  
  SELECT_INSTITUTION("SELECT_INSTITUTION"),
  
  SUBMIT_ACCOUNT_NUMBER("SUBMIT_ACCOUNT_NUMBER"),
  
  SUBMIT_CREDENTIALS("SUBMIT_CREDENTIALS"),
  
  SUBMIT_DOCUMENTS("SUBMIT_DOCUMENTS"),
  
  SUBMIT_DOCUMENTS_ERROR("SUBMIT_DOCUMENTS_ERROR"),
  
  SUBMIT_DOCUMENTS_SUCCESS("SUBMIT_DOCUMENTS_SUCCESS"),
  
  SUBMIT_MFA("SUBMIT_MFA"),
  
  SUBMIT_ROUTING_NUMBER("SUBMIT_ROUTING_NUMBER"),
  
  TRANSITION_VIEW("TRANSITION_VIEW"),
  
  VIEW_DATA_TYPES("VIEW_DATA_TYPES"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  LinkEventName(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static LinkEventName fromValue(String value) {
    for (LinkEventName b : LinkEventName.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return LinkEventName.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<LinkEventName> {
    @Override
    public void write(final JsonWriter jsonWriter, final LinkEventName enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public LinkEventName read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return LinkEventName.fromValue(value);
    }
  }
}

