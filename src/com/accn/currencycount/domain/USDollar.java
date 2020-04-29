package com.accn.currencycount.domain;

import com.accn.currencycount.repository.CurrencyRepository;
import com.accn.currencycount.repository.CurrencyRepositoryImpl;

import java.util.List;

/**
 * Concrete USDollar class extending asbtract Currency.
 */
public class USDollar extends Currency {

    private CurrencyRepository currencyRepository = new CurrencyRepositoryImpl();

    public USDollar () {
        initializeCurrencyDenominationList();
    }

    @Override
    public String getSymbol() {
        return "USD";
    }

    @Override
    public List<CurrencyDenomination> getCurrencyDenominationList() {
        return this.listCurrencyDenominations;
    }

    public void initializeCurrencyDenominationList() {

        listCurrencyDenominations = currencyRepository.loadCurrencyDenomination();

        for (CurrencyDenomination currencyDenomination : listCurrencyDenominations) {
            mapCurrencyDenominations.put(currencyDenomination.getValue(), currencyDenomination);
        }
    }
}
