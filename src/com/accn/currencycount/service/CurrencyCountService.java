package com.accn.currencycount.service;

import com.accn.currencycount.domain.CurrencyDenominationOutput;

import java.util.List;

public interface CurrencyCountService {
    List<CurrencyDenominationOutput> getMinDenominations(String inputCurrency, Double inputValue);
}
