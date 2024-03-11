/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.499.0
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
import com.plaid.client.model.InvestmentTransactionSubtype;
import com.plaid.client.model.InvestmentTransactionType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;

/**
 * A transaction within an investment account.
 */
@ApiModel(description = "A transaction within an investment account.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-11T17:59:43.087249Z[Etc/UTC]")
public class InvestmentTransaction {
  public static final String SERIALIZED_NAME_INVESTMENT_TRANSACTION_ID = "investment_transaction_id";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_TRANSACTION_ID)
  private String investmentTransactionId;

  public static final String SERIALIZED_NAME_CANCEL_TRANSACTION_ID = "cancel_transaction_id";
  @SerializedName(SERIALIZED_NAME_CANCEL_TRANSACTION_ID)
  private String cancelTransactionId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_SECURITY_ID = "security_id";
  @SerializedName(SERIALIZED_NAME_SECURITY_ID)
  private String securityId;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private LocalDate date;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Double quantity;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Double amount;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price;

  public static final String SERIALIZED_NAME_FEES = "fees";
  @SerializedName(SERIALIZED_NAME_FEES)
  private Double fees;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private InvestmentTransactionType type;

  public static final String SERIALIZED_NAME_SUBTYPE = "subtype";
  @SerializedName(SERIALIZED_NAME_SUBTYPE)
  private InvestmentTransactionSubtype subtype;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE = "unofficial_currency_code";
  @SerializedName(SERIALIZED_NAME_UNOFFICIAL_CURRENCY_CODE)
  private String unofficialCurrencyCode;


  public InvestmentTransaction investmentTransactionId(String investmentTransactionId) {
    
    this.investmentTransactionId = investmentTransactionId;
    return this;
  }

   /**
   * The ID of the Investment transaction, unique across all Plaid transactions. Like all Plaid identifiers, the &#x60;investment_transaction_id&#x60; is case sensitive.
   * @return investmentTransactionId
  **/
  @ApiModelProperty(required = true, value = "The ID of the Investment transaction, unique across all Plaid transactions. Like all Plaid identifiers, the `investment_transaction_id` is case sensitive.")

  public String getInvestmentTransactionId() {
    return investmentTransactionId;
  }


  public void setInvestmentTransactionId(String investmentTransactionId) {
    this.investmentTransactionId = investmentTransactionId;
  }


  public InvestmentTransaction cancelTransactionId(String cancelTransactionId) {
    
    this.cancelTransactionId = cancelTransactionId;
    return this;
  }

   /**
   * A legacy field formerly used internally by Plaid to identify certain canceled transactions.
   * @return cancelTransactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A legacy field formerly used internally by Plaid to identify certain canceled transactions.")

  public String getCancelTransactionId() {
    return cancelTransactionId;
  }


  public void setCancelTransactionId(String cancelTransactionId) {
    this.cancelTransactionId = cancelTransactionId;
  }


  public InvestmentTransaction accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The &#x60;account_id&#x60; of the account against which this transaction posted.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The `account_id` of the account against which this transaction posted.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public InvestmentTransaction securityId(String securityId) {
    
    this.securityId = securityId;
    return this;
  }

   /**
   * The &#x60;security_id&#x60; to which this transaction is related.
   * @return securityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The `security_id` to which this transaction is related.")

  public String getSecurityId() {
    return securityId;
  }


  public void setSecurityId(String securityId) {
    this.securityId = securityId;
  }


  public InvestmentTransaction date(LocalDate date) {
    
    this.date = date;
    return this;
  }

   /**
   * The [ISO 8601](https://wikipedia.org/wiki/ISO_8601) posting date for the transaction.
   * @return date
  **/
  @ApiModelProperty(required = true, value = "The [ISO 8601](https://wikipedia.org/wiki/ISO_8601) posting date for the transaction.")

  public LocalDate getDate() {
    return date;
  }


  public void setDate(LocalDate date) {
    this.date = date;
  }


  public InvestmentTransaction name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The institution’s description of the transaction.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The institution’s description of the transaction.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InvestmentTransaction quantity(Double quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * The number of units of the security involved in this transaction. Positive for buy transactions; negative for sell transactions.
   * @return quantity
  **/
  @ApiModelProperty(required = true, value = "The number of units of the security involved in this transaction. Positive for buy transactions; negative for sell transactions.")

  public Double getQuantity() {
    return quantity;
  }


  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }


  public InvestmentTransaction amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The complete value of the transaction. Positive values when cash is debited, e.g. purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains the same for cash-only movements unassociated with securities.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The complete value of the transaction. Positive values when cash is debited, e.g. purchases of stock; negative values when cash is credited, e.g. sales of stock. Treatment remains the same for cash-only movements unassociated with securities.")

  public Double getAmount() {
    return amount;
  }


  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public InvestmentTransaction price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * The price of the security at which this transaction occurred.
   * @return price
  **/
  @ApiModelProperty(required = true, value = "The price of the security at which this transaction occurred.")

  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public InvestmentTransaction fees(Double fees) {
    
    this.fees = fees;
    return this;
  }

   /**
   * The combined value of all fees applied to this transaction
   * @return fees
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The combined value of all fees applied to this transaction")

  public Double getFees() {
    return fees;
  }


  public void setFees(Double fees) {
    this.fees = fees;
  }


  public InvestmentTransaction type(InvestmentTransactionType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public InvestmentTransactionType getType() {
    return type;
  }


  public void setType(InvestmentTransactionType type) {
    this.type = type;
  }


  public InvestmentTransaction subtype(InvestmentTransactionSubtype subtype) {
    
    this.subtype = subtype;
    return this;
  }

   /**
   * Get subtype
   * @return subtype
  **/
  @ApiModelProperty(required = true, value = "")

  public InvestmentTransactionSubtype getSubtype() {
    return subtype;
  }


  public void setSubtype(InvestmentTransactionSubtype subtype) {
    this.subtype = subtype;
  }


  public InvestmentTransaction isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The ISO-4217 currency code of the transaction. Always &#x60;null&#x60; if &#x60;unofficial_currency_code&#x60; is non-&#x60;null&#x60;.
   * @return isoCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The ISO-4217 currency code of the transaction. Always `null` if `unofficial_currency_code` is non-`null`.")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public InvestmentTransaction unofficialCurrencyCode(String unofficialCurrencyCode) {
    
    this.unofficialCurrencyCode = unofficialCurrencyCode;
    return this;
  }

   /**
   * The unofficial currency code associated with the holding. Always &#x60;null&#x60; if &#x60;iso_currency_code&#x60; is non-&#x60;null&#x60;. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported &#x60;iso_currency_code&#x60;s.
   * @return unofficialCurrencyCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "The unofficial currency code associated with the holding. Always `null` if `iso_currency_code` is non-`null`. Unofficial currency codes are used for currencies that do not have official ISO currency codes, such as cryptocurrencies and the currencies of certain countries.  See the [currency code schema](https://plaid.com/docs/api/accounts#currency-code-schema) for a full listing of supported `iso_currency_code`s.")

  public String getUnofficialCurrencyCode() {
    return unofficialCurrencyCode;
  }


  public void setUnofficialCurrencyCode(String unofficialCurrencyCode) {
    this.unofficialCurrencyCode = unofficialCurrencyCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvestmentTransaction investmentTransaction = (InvestmentTransaction) o;
    return Objects.equals(this.investmentTransactionId, investmentTransaction.investmentTransactionId) &&
        Objects.equals(this.cancelTransactionId, investmentTransaction.cancelTransactionId) &&
        Objects.equals(this.accountId, investmentTransaction.accountId) &&
        Objects.equals(this.securityId, investmentTransaction.securityId) &&
        Objects.equals(this.date, investmentTransaction.date) &&
        Objects.equals(this.name, investmentTransaction.name) &&
        Objects.equals(this.quantity, investmentTransaction.quantity) &&
        Objects.equals(this.amount, investmentTransaction.amount) &&
        Objects.equals(this.price, investmentTransaction.price) &&
        Objects.equals(this.fees, investmentTransaction.fees) &&
        Objects.equals(this.type, investmentTransaction.type) &&
        Objects.equals(this.subtype, investmentTransaction.subtype) &&
        Objects.equals(this.isoCurrencyCode, investmentTransaction.isoCurrencyCode) &&
        Objects.equals(this.unofficialCurrencyCode, investmentTransaction.unofficialCurrencyCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(investmentTransactionId, cancelTransactionId, accountId, securityId, date, name, quantity, amount, price, fees, type, subtype, isoCurrencyCode, unofficialCurrencyCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentTransaction {\n");
    sb.append("    investmentTransactionId: ").append(toIndentedString(investmentTransactionId)).append("\n");
    sb.append("    cancelTransactionId: ").append(toIndentedString(cancelTransactionId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    securityId: ").append(toIndentedString(securityId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subtype: ").append(toIndentedString(subtype)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    unofficialCurrencyCode: ").append(toIndentedString(unofficialCurrencyCode)).append("\n");
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

