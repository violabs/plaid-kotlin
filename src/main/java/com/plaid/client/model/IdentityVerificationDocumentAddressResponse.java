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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The address extracted from the document. The address must at least contain the following fields to be a valid address: &#x60;street&#x60;, &#x60;city&#x60;, &#x60;country&#x60;. If any are missing or unable to be extracted, the address will be null.  &#x60;region&#x60;, and &#x60;postal_code&#x60; may be null based on the addressing system. For example:  Addresses from the United Kingdom will not include a region  Addresses from Hong Kong will not include postal code  Note: Optical Character Recognition (OCR) technology may sometimes extract incorrect data from a document.
 */
@ApiModel(description = "The address extracted from the document. The address must at least contain the following fields to be a valid address: `street`, `city`, `country`. If any are missing or unable to be extracted, the address will be null.  `region`, and `postal_code` may be null based on the addressing system. For example:  Addresses from the United Kingdom will not include a region  Addresses from Hong Kong will not include postal code  Note: Optical Character Recognition (OCR) technology may sometimes extract incorrect data from a document.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-10T20:14:45.051727Z[Etc/UTC]")
public class IdentityVerificationDocumentAddressResponse {
  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private String region;

  public static final String SERIALIZED_NAME_POSTAL_CODE = "postal_code";
  @SerializedName(SERIALIZED_NAME_POSTAL_CODE)
  private String postalCode;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public IdentityVerificationDocumentAddressResponse street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * The full street address extracted from the document.
   * @return street
  **/
  @ApiModelProperty(example = "123 Main St. Unit 42", required = true, value = "The full street address extracted from the document.")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public IdentityVerificationDocumentAddressResponse city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * City extracted from the document.
   * @return city
  **/
  @ApiModelProperty(example = "Pawnee", required = true, value = "City extracted from the document.")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public IdentityVerificationDocumentAddressResponse region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * An ISO 3166-2 subdivision code extracted from the document. Related terms would be \&quot;state\&quot;, \&quot;province\&quot;, \&quot;prefecture\&quot;, \&quot;zone\&quot;, \&quot;subdivision\&quot;, etc.
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IN", required = true, value = "An ISO 3166-2 subdivision code extracted from the document. Related terms would be \"state\", \"province\", \"prefecture\", \"zone\", \"subdivision\", etc.")

  public String getRegion() {
    return region;
  }


  public void setRegion(String region) {
    this.region = region;
  }


  public IdentityVerificationDocumentAddressResponse postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * The postal code extracted from the document. Between 2 and 10 alphanumeric characters. For US-based addresses this must be 5 numeric digits.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "46001", required = true, value = "The postal code extracted from the document. Between 2 and 10 alphanumeric characters. For US-based addresses this must be 5 numeric digits.")

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public IdentityVerificationDocumentAddressResponse country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Valid, capitalized, two-letter ISO code representing the country extracted from the document. Must be in ISO 3166-1 alpha-2 form.
   * @return country
  **/
  @ApiModelProperty(example = "US", required = true, value = "Valid, capitalized, two-letter ISO code representing the country extracted from the document. Must be in ISO 3166-1 alpha-2 form.")

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
    IdentityVerificationDocumentAddressResponse identityVerificationDocumentAddressResponse = (IdentityVerificationDocumentAddressResponse) o;
    return Objects.equals(this.street, identityVerificationDocumentAddressResponse.street) &&
        Objects.equals(this.city, identityVerificationDocumentAddressResponse.city) &&
        Objects.equals(this.region, identityVerificationDocumentAddressResponse.region) &&
        Objects.equals(this.postalCode, identityVerificationDocumentAddressResponse.postalCode) &&
        Objects.equals(this.country, identityVerificationDocumentAddressResponse.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, city, region, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationDocumentAddressResponse {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
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

