/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
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
 * A list of products that an institution can support. All Items must be initialized with at least one product. The Balance product is always available and does not need to be specified during initialization.
 */
@JsonAdapter(Products.Adapter.class)
public enum Products {
  
  ASSETS("assets"),
  
  AUTH("auth"),
  
  BALANCE("balance"),
  
  IDENTITY("identity"),
  
  INVESTMENTS("investments"),
  
  LIABILITIES("liabilities"),
  
  PAYMENT_INITIATION("payment_initiation"),
  
  IDENTITY_VERIFICATION("identity_verification"),
  
  TRANSACTIONS("transactions"),
  
  CREDIT_DETAILS("credit_details"),
  
  INCOME("income"),
  
  INCOME_VERIFICATION("income_verification"),
  
  DEPOSIT_SWITCH("deposit_switch"),
  
  STANDING_ORDERS("standing_orders"),
  
  TRANSFER("transfer"),
  
  EMPLOYMENT("employment"),
  
  RECURRING_TRANSACTIONS("recurring_transactions"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  Products(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static Products fromValue(String value) {
    for (Products b : Products.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return Products.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<Products> {
    @Override
    public void write(final JsonWriter jsonWriter, final Products enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public Products read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return Products.fromValue(value);
    }
  }
}

