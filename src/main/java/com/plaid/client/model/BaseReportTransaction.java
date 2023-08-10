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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.BaseReportTransactionType;
import com.plaid.client.model.CreditCategory;
import com.plaid.client.model.Location;
import com.plaid.client.model.PaymentMeta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * A transaction on the Base Report
 */
@ApiModel(description = "A transaction on the Base Report")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T22:39:54.038561Z[Etc/UTC]")
public class BaseReportTransaction {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;

  public static final String SERIALIZED_NAME_ORIGINAL_DESCRIPTION = "original_description";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_DESCRIPTION)
  private String originalDescription;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private List<String> category = null;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CREDIT_CATEGORY = "credit_category";
  @SerializedName(SERIALIZED_NAME_CREDIT_CATEGORY)
  private CreditCategory creditCategory;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "check_number";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_DATE_TRANSACTED = "date_transacted";
  @SerializedName(SERIALIZED_NAME_DATE_TRANSACTED)
  private String dateTransacted;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private Location location;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_PAYMENT_META = "payment_meta";
  @SerializedName(SERIALIZED_NAME_PAYMENT_META)
  private PaymentMeta paymentMeta;

  public static final String SERIALIZED_NAME_PENDING = "pending";
  @SerializedName(SERIALIZED_NAME_PENDING)
  private Boolean pending;

  public static final String SERIALIZED_NAME_ACCOUNT_OWNER = "account_owner";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_OWNER)
  private String accountOwner;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transaction_type";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private BaseReportTransactionType transactionType;


  public BaseReportTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The settled value of the transaction, denominated in the transaction&#39;s currency, as stated in &#x60;iso_currency_code&#x60; or &#x60;unofficial_currency_code&#x60;. Positive values when money moves out of the account; negative values when money moves in. For example, debit card purchases are positive; credit card payments, direct deposits, and refunds are negative.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The settled value of the transaction, denominated in the transaction's currency, as stated in `iso_currency_code` or `unofficial_currency_code`. Positive values when money moves out of the account; negative values when money moves in. For example, debit card purchases are positive; credit card payments, direct deposits, and refunds are negative.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public BaseReportTransaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-null.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the transaction. Always `null` if `unofficial_currency_code` is non-null.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public BaseReportTransaction unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the transaction. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;unofficial_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unofficial currency code associated with the transaction. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `unofficial_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  public BaseReportTransaction originalDescription(String originalDescription) {
    
    this.originalDescription = originalDescription;
    return this;
  }

   /**
   * The string returned by the financial institution to describe the transaction.
   * @return originalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The string returned by the financial institution to describe the transaction.")

  public String getOriginalDescription() {
    return originalDescription;
  }


  public void setOriginalDescription(String originalDescription) {
    this.originalDescription = originalDescription;
  }


  public BaseReportTransaction category(List<String> category) {
    
    this.category = category;
    return this;
  }

  public BaseReportTransaction addCategoryItem(String categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * A hierarchical array of the categories to which this transaction belongs. For a full list of categories, see [&#x60;/categories/get&#x60;](https://plaid.com/docs/api/products/transactions/#categoriesget).
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A hierarchical array of the categories to which this transaction belongs. For a full list of categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).")

  public List<String> getCategory() {
    return category;
  }


  public void setCategory(List<String> category) {
    this.category = category;
  }


  public BaseReportTransaction categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * The ID of the category to which this transaction belongs. For a full list of categories, see [&#x60;/categories/get&#x60;](https://plaid.com/docs/api/products/transactions/#categoriesget).
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the category to which this transaction belongs. For a full list of categories, see [`/categories/get`](https://plaid.com/docs/api/products/transactions/#categoriesget).")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public BaseReportTransaction creditCategory(CreditCategory creditCategory) {
    
    this.creditCategory = creditCategory;
    return this;
  }

   /**
   * Get creditCategory
   * @return creditCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CreditCategory getCreditCategory() {
    return creditCategory;
  }


  public void setCreditCategory(CreditCategory creditCategory) {
    this.creditCategory = creditCategory;
  }


  public BaseReportTransaction checkNumber(String checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * The check number of the transaction. This field is only populated for check transactions.
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The check number of the transaction. This field is only populated for check transactions.")

  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public BaseReportTransaction date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * For pending transactions, the date that the transaction occurred; for posted transactions, the date that the transaction posted. Both dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( &#x60;YYYY-MM-DD&#x60; ).
   * @return date
  **/
  @ApiModelProperty(required = true, value = "For pending transactions, the date that the transaction occurred; for posted transactions, the date that the transaction posted. Both dates are returned in an [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format ( `YYYY-MM-DD` ).")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public BaseReportTransaction dateTransacted(String dateTransacted) {
    
    this.dateTransacted = dateTransacted;
    return this;
  }

   /**
   * The date on which the transaction took place, in IS0 8601 format.
   * @return dateTransacted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the transaction took place, in IS0 8601 format.")

  public String getDateTransacted() {
    return dateTransacted;
  }


  public void setDateTransacted(String dateTransacted) {
    this.dateTransacted = dateTransacted;
  }


  public BaseReportTransaction location(Location location) {
    
    this.location = location;
    return this;
  }

   /**
   * Get location
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Location getLocation() {
    return location;
  }


  public void setLocation(Location location) {
    this.location = location;
  }


  public BaseReportTransaction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The merchant name or transaction description.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The merchant name or transaction description.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public BaseReportTransaction merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * The merchant name, as enriched by Plaid from the &#x60;name&#x60; field. This is typically a more human-readable version of the merchant counterparty in the transaction. For some bank transactions (such as checks or account transfers) where there is no meaningful merchant name, this value will be &#x60;null&#x60;.
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The merchant name, as enriched by Plaid from the `name` field. This is typically a more human-readable version of the merchant counterparty in the transaction. For some bank transactions (such as checks or account transfers) where there is no meaningful merchant name, this value will be `null`.")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public BaseReportTransaction paymentMeta(PaymentMeta paymentMeta) {
    
    this.paymentMeta = paymentMeta;
    return this;
  }

   /**
   * Get paymentMeta
   * @return paymentMeta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaymentMeta getPaymentMeta() {
    return paymentMeta;
  }


  public void setPaymentMeta(PaymentMeta paymentMeta) {
    this.paymentMeta = paymentMeta;
  }


  public BaseReportTransaction pending(Boolean pending) {
    
    this.pending = pending;
    return this;
  }

   /**
   * When &#x60;true&#x60;, identifies the transaction as pending or unsettled. Pending transaction details (name, type, amount, category ID) may change before they are settled.
   * @return pending
  **/
  @ApiModelProperty(required = true, value = "When `true`, identifies the transaction as pending or unsettled. Pending transaction details (name, type, amount, category ID) may change before they are settled.")

  public Boolean getPending() {
    return pending;
  }


  public void setPending(Boolean pending) {
    this.pending = pending;
  }


  public BaseReportTransaction accountOwner(String accountOwner) {
    
    this.accountOwner = accountOwner;
    return this;
  }

   /**
   * The name of the account owner. This field is not typically populated and only relevant when dealing with sub-accounts.
   * @return accountOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the account owner. This field is not typically populated and only relevant when dealing with sub-accounts.")

  public String getAccountOwner() {
    return accountOwner;
  }


  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }


  public BaseReportTransaction transactionType(BaseReportTransactionType transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BaseReportTransactionType getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(BaseReportTransactionType transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseReportTransaction baseReportTransaction = (BaseReportTransaction) o;
    return Objects.equals(this.amount, baseReportTransaction.amount) &&
        Objects.equals(this.isoCurrencyCode, baseReportTransaction.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, baseReportTransaction.unofficialCurrencyCode) &&
        Objects.equals(this.originalDescription, baseReportTransaction.originalDescription) &&
        Objects.equals(this.category, baseReportTransaction.category) &&
        Objects.equals(this.categoryId, baseReportTransaction.categoryId) &&
        Objects.equals(this.creditCategory, baseReportTransaction.creditCategory) &&
        Objects.equals(this.checkNumber, baseReportTransaction.checkNumber) &&
        Objects.equals(this.date, baseReportTransaction.date) &&
        Objects.equals(this.dateTransacted, baseReportTransaction.dateTransacted) &&
        Objects.equals(this.location, baseReportTransaction.location) &&
        Objects.equals(this.name, baseReportTransaction.name) &&
        Objects.equals(this.merchantName, baseReportTransaction.merchantName) &&
        Objects.equals(this.paymentMeta, baseReportTransaction.paymentMeta) &&
        Objects.equals(this.pending, baseReportTransaction.pending) &&
        Objects.equals(this.accountOwner, baseReportTransaction.accountOwner) &&
        Objects.equals(this.transactionType, baseReportTransaction.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, isoCurrencyCode, unofficialCurrencyCode, originalDescription, category, categoryId, creditCategory, checkNumber, date, dateTransacted, location, name, merchantName, paymentMeta, pending, accountOwner, transactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseReportTransaction {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
    sb.append("    originalDescription: ").append(toIndentedString(originalDescription)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    creditCategory: ").append(toIndentedString(creditCategory)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dateTransacted: ").append(toIndentedString(dateTransacted)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    paymentMeta: ").append(toIndentedString(paymentMeta)).append("\n");
    sb.append("    pending: ").append(toIndentedString(pending)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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

