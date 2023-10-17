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
 * A globally unique and human readable ID type, specific to the country and document category. For more context on this field, see [Hybrid Input Validation](https://plaid.com/docs/identity-verification/hybrid-input-validation).
 */
@JsonAdapter(IDNumberType.Adapter.class)
public enum IDNumberType {
  
  AR_DNI("ar_dni"),
  
  AU_DRIVERS_LICENSE("au_drivers_license"),
  
  AU_PASSPORT("au_passport"),
  
  BR_CPF("br_cpf"),
  
  CA_SIN("ca_sin"),
  
  CL_RUN("cl_run"),
  
  CN_RESIDENT_CARD("cn_resident_card"),
  
  CO_NIT("co_nit"),
  
  DK_CPR("dk_cpr"),
  
  EG_NATIONAL_ID("eg_national_id"),
  
  ES_DNI("es_dni"),
  
  ES_NIE("es_nie"),
  
  HK_HKID("hk_hkid"),
  
  IN_PAN("in_pan"),
  
  IT_CF("it_cf"),
  
  JO_CIVIL_ID("jo_civil_id"),
  
  JP_MY_NUMBER("jp_my_number"),
  
  KE_HUDUMA_NAMBA("ke_huduma_namba"),
  
  KW_CIVIL_ID("kw_civil_id"),
  
  MX_CURP("mx_curp"),
  
  MX_RFC("mx_rfc"),
  
  MY_NRIC("my_nric"),
  
  NG_NIN("ng_nin"),
  
  NZ_DRIVERS_LICENSE("nz_drivers_license"),
  
  OM_CIVIL_ID("om_civil_id"),
  
  PH_PSN("ph_psn"),
  
  PL_PESEL("pl_pesel"),
  
  RO_CNP("ro_cnp"),
  
  SA_NATIONAL_ID("sa_national_id"),
  
  SE_PIN("se_pin"),
  
  SG_NRIC("sg_nric"),
  
  TR_TC_KIMLIK("tr_tc_kimlik"),
  
  US_SSN("us_ssn"),
  
  US_SSN_LAST_4("us_ssn_last_4"),
  
  ZA_SMART_ID("za_smart_id"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  IDNumberType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static IDNumberType fromValue(String value) {
    for (IDNumberType b : IDNumberType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return IDNumberType.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<IDNumberType> {
    @Override
    public void write(final JsonWriter jsonWriter, final IDNumberType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public IDNumberType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return IDNumberType.fromValue(value);
    }
  }
}

