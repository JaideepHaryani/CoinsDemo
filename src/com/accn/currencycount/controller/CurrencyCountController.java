package com.accn.currencycount.controller;

import com.accn.currencycount.domain.CurrencyDenominationOutput;
import com.accn.currencycount.service.CurrencyCountService;
import com.accn.currencycount.service.CurrencyCountServiceImpl;

import java.util.List;

/**
 * I created this controller as I initially thought of creating a REST interface, but ended up doing a standalone
 * Java project.
 */
public class CurrencyCountController {

    public CurrencyCountService currencyCountService = new CurrencyCountServiceImpl();

    public List<CurrencyDenominationOutput> getMinDenominations(String inputCurrency, Double inputValue) {
        return currencyCountService.getMinDenominations(inputCurrency, inputValue);
    }
}
