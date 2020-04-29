package com.accn.currencycount.repository;

import com.accn.currencycount.domain.CurrencyDenomination;

import java.util.List;

public interface CurrencyRepository {
    public List<CurrencyDenomination> loadCurrencyDenomination();
}
