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
 * The kind of official document represented by this object.  &#x60;birth_certificate&#x60; - A certificate of birth  &#x60;drivers_license&#x60; - A license to operate a motor vehicle  &#x60;immigration_number&#x60; - Immigration or residence documents  &#x60;military_id&#x60; - Identification issued by a military group  &#x60;other&#x60; - Any document not covered by other categories  &#x60;passport&#x60; - An official passport issue by a government  &#x60;personal_identification&#x60; - Any generic personal identification that is not covered by other categories  &#x60;ration_card&#x60; - Identification that entitles the holder to rations  &#x60;ssn&#x60; - United States Social Security Number  &#x60;student_id&#x60; - Identification issued by an educational institution  &#x60;tax_id&#x60; - Identification issued for the purpose of collecting taxes  &#x60;travel_document&#x60; - Visas, entry permits, refugee documents, etc.  &#x60;voter_id&#x60; - Identification issued for the purpose of voting
 */
@JsonAdapter(WatchlistScreeningDocumentType.Adapter.class)
public enum WatchlistScreeningDocumentType {
  
  BIRTH_CERTIFICATE("birth_certificate"),
  
  DRIVERS_LICENSE("drivers_license"),
  
  IMMIGRATION_NUMBER("immigration_number"),
  
  MILITARY_ID("military_id"),
  
  OTHER("other"),
  
  PASSPORT("passport"),
  
  PERSONAL_IDENTIFICATION("personal_identification"),
  
  RATION_CARD("ration_card"),
  
  SSN("ssn"),
  
  STUDENT_ID("student_id"),
  
  TAX_ID("tax_id"),
  
  TRAVEL_DOCUMENT("travel_document"),
  
  VOTER_ID("voter_id"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  WatchlistScreeningDocumentType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static WatchlistScreeningDocumentType fromValue(String value) {
    for (WatchlistScreeningDocumentType b : WatchlistScreeningDocumentType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return WatchlistScreeningDocumentType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<WatchlistScreeningDocumentType> {
    @Override
    public void write(final JsonWriter jsonWriter, final WatchlistScreeningDocumentType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public WatchlistScreeningDocumentType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return WatchlistScreeningDocumentType.fromValue(value);
    }
  }
}

