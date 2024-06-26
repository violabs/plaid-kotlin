package com.plaid.client.model.kotlin

import com.google.gson.annotations.JsonAdapter

@JsonAdapter(KInvestmentTransactionSubtype.Adapter::class)
enum class KInvestmentTransactionSubtype(val value: String) : IEnum {
    ACCOUNT_FEE("account fee"),

    ADJUSTMENT("adjustment"),

    ASSIGNMENT("assignment"),

    BUY("buy"),

    BUY_TO_COVER("buy to cover"),

    CONTRIBUTION("contribution"),

    DEPOSIT("deposit"),

    DISTRIBUTION("distribution"),

    DIVIDEND("dividend"),

    DIVIDEND_REINVESTMENT("dividend reinvestment"),

    EXERCISE("exercise"),

    EXPIRE("expire"),

    FUND_FEE("fund fee"),

    INTEREST("interest"),

    INTEREST_RECEIVABLE("interest receivable"),

    INTEREST_REINVESTMENT("interest reinvestment"),

    LEGAL_FEE("legal fee"),

    LOAN_PAYMENT("loan payment"),

    LONG_TERM_CAPITAL_GAIN("long-term capital gain"),

    LONG_TERM_CAPITAL_GAIN_REINVESTMENT("long-term capital gain reinvestment"),

    MANAGEMENT_FEE("management fee"),

    MARGIN_EXPENSE("margin expense"),

    MERGER("merger"),

    MISCELLANEOUS_FEE("miscellaneous fee"),

    NON_QUALIFIED_DIVIDEND("non-qualified dividend"),

    NON_RESIDENT_TAX("non-resident tax"),

    PENDING_CREDIT("pending credit"),

    PENDING_DEBIT("pending debit"),

    QUALIFIED_DIVIDEND("qualified dividend"),

    REBALANCE("rebalance"),

    RETURN_OF_PRINCIPAL("return of principal"),

    REQUEST("request"),

    SELL("sell"),

    SELL_SHORT("sell short"),

    SEND("send"),

    SHORT_TERM_CAPITAL_GAIN("short-term capital gain"),

    SHORT_TERM_CAPITAL_GAIN_REINVESTMENT("short-term capital gain reinvestment"),

    SPIN_OFF("spin off"),

    SPLIT("split"),

    STOCK_DISTRIBUTION("stock distribution"),

    TAX("tax"),

    TAX_WITHHELD("tax withheld"),

    TRADE("trade"),

    TRANSFER("transfer"),

    TRANSFER_FEE("transfer fee"),

    TRUST_FEE("trust fee"),

    UNQUALIFIED_GAIN("unqualified gain"),

    WITHDRAWAL("withdrawal"),

    ENUM_UNKNOWN("ENUM_UNKNOWN");

    override fun toString(): String {
        return value
    }

    companion object {
        fun fromString(value: String): KInvestmentTransactionSubtype = IEnum.fromString(value, ENUM_UNKNOWN, ::valueOf)
    }

    class Adapter : EnumAdapter<KInvestmentTransactionSubtype>() {
        override fun fromString(value: String): KInvestmentTransactionSubtype =
            KInvestmentTransactionSubtype.fromString(value)
    }
}
