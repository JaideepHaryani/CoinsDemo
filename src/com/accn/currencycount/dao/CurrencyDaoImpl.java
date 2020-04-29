package com.accn.currencycount.dao;

import com.accn.currencycount.domain.CurrencyDenomination;

import java.util.ArrayList;
import java.util.List;

public class CurrencyDaoImpl implements CurrencyDao {

    /**
     * DAO to load currency denominations. In enterprise application, this can be loaded/initialized  from database or
     *  loaded from properties file.
     * @return
     */
    @Override
    public List<CurrencyDenomination> loadCurrencyDenomination() {

        List<CurrencyDenomination> listCurrencyDenominations = new ArrayList<>();
        CurrencyDenomination hundredDollar = new CurrencyDenomination("100 Dollar", 10000);
        CurrencyDenomination fiftyDollar = new CurrencyDenomination("50 Dollar", 5000);
        CurrencyDenomination twentyDollar = new CurrencyDenomination("20 Dollar", 2000);
        CurrencyDenomination tenDollar = new CurrencyDenomination("10 Dollar", 1000);
        CurrencyDenomination fiveDollar = new CurrencyDenomination("5 Dollar", 500);
        CurrencyDenomination dollar = new CurrencyDenomination("1 Dollar", 100);
        CurrencyDenomination quarterDollar = new CurrencyDenomination("Quarter", 25);
        CurrencyDenomination dime = new CurrencyDenomination("Dime", 10);
        CurrencyDenomination nickel = new CurrencyDenomination("Nickel", 5);
        CurrencyDenomination penny = new CurrencyDenomination("Penny", 1);

        listCurrencyDenominations.add(hundredDollar);
        listCurrencyDenominations.add(fiftyDollar);
        listCurrencyDenominations.add(twentyDollar);
        listCurrencyDenominations.add(tenDollar);
        listCurrencyDenominations.add(fiveDollar);
        listCurrencyDenominations.add(dollar);
        listCurrencyDenominations.add(quarterDollar);
        listCurrencyDenominations.add(dime);
        listCurrencyDenominations.add(nickel);
        listCurrencyDenominations.add(penny);

        return listCurrencyDenominations;
    }
}
