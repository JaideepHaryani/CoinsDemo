package com.accn.currencycount.service;

import com.accn.currencycount.domain.Currency;
import com.accn.currencycount.domain.CurrencyDenominationOutput;
import com.accn.currencycount.factory.CurrencyFactory;

import java.util.List;

/**
 * Service layer.
 */
public class CurrencyCountServiceImpl implements CurrencyCountService {

    @Override
    public List<CurrencyDenominationOutput> getMinDenominations(String inputCurrency, Double inputValue) {
        Currency currency = CurrencyFactory.getCurrency(inputCurrency);

        List<CurrencyDenominationOutput> currencyDenominationOutputList
                = currency.findMinDominationForValue(inputValue);
        return currencyDenominationOutputList;
    }
}
