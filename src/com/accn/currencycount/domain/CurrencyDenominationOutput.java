package com.accn.currencycount.domain;

/**
 * Currency Denominations Output Pojo.
 */
public class CurrencyDenominationOutput {

    private String currencyDenominationName;
    private Integer numberOfDenominations;

    public CurrencyDenominationOutput(String currencyDenominationName, Integer numberOfDenominations) {
        this.currencyDenominationName = currencyDenominationName;
        this.numberOfDenominations = numberOfDenominations;
    }

    public String getCurrencyDenominationName() {
        return currencyDenominationName;
    }

    public Integer getNumberOfDenominations() {
        return numberOfDenominations;
    }
}
