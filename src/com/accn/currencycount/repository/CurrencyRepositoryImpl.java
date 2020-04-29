package com.accn.currencycount.repository;

import com.accn.currencycount.dao.CurrencyDao;
import com.accn.currencycount.dao.CurrencyDaoImpl;
import com.accn.currencycount.domain.CurrencyDenomination;

import java.util.List;

public class CurrencyRepositoryImpl implements CurrencyRepository {

    private CurrencyDao currencyDao = new CurrencyDaoImpl();

    public List<CurrencyDenomination> loadCurrencyDenomination() {
        return currencyDao.loadCurrencyDenomination();
    }
}
