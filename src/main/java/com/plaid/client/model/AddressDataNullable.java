/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.205.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.AddressData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data about the components comprising an address.
 */
@ApiModel(description = "Data about the components comprising an address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-17T17:52:41.932844Z[Etc/UTC]")
public class AddressDataNullable {
  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public AddressDataNullable city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The full city name
   * @return city
  **/
  @ApiModelProperty(required = true, value = "The full city name")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public AddressDataNullable region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region or state. In API versions 2018-05-22 and earlier, this field is called &#x60;state&#x60;. Example: &#x60;\&quot;NC\&quot;&#x60;
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The region or state. In API versions 2018-05-22 and earlier, this field is called `state`. Example: `\"NC\"`")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public AddressDataNullable street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The full street address Example: &#x60;\&quot;564 Main Street, APT 15\&quot;&#x60;
   * @return street
  **/
  @ApiModelProperty(required = true, value = "The full street address Example: `\"564 Main Street, APT 15\"`")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public AddressDataNullable postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code. In API versions 2018-05-22 and earlier, this field is called &#x60;zip&#x60;.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The postal code. In API versions 2018-05-22 and earlier, this field is called `zip`.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public AddressDataNullable country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The ISO 3166-1 alpha-2 country code
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO 3166-1 alpha-2 country code")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressDataNullable addressDataNullable = (AddressDataNullable) o;
    return Objects.equals(this.city, addressDataNullable.city) &&
        Objects.equals(this.region, addressDataNullable.region) &&
        Objects.equals(this.street, addressDataNullable.street) &&
        Objects.equals(this.postalCode, addressDataNullable.postalCode) &&
        Objects.equals(this.country, addressDataNullable.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, region, street, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressDataNullable {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

