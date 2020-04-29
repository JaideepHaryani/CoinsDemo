package com.accn.currencycount.domain;

/**
 * POJO to hold Currency Denomination.
 */
public class CurrencyDenomination {

    private String name;
    private Integer value;

    public CurrencyDenomination(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
