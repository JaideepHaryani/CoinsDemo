package com.accn.currencycount.dao;

import com.accn.currencycount.domain.CurrencyDenomination;

import java.util.List;

public interface CurrencyDao {
    List<CurrencyDenomination> loadCurrencyDenomination();
}
