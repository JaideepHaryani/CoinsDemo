package com.accn.currencycount.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Abstract Currency class.
 */
public abstract class Currency {
    List<CurrencyDenomination> listCurrencyDenominations = new ArrayList<CurrencyDenomination>();
    Map<Integer, CurrencyDenomination> mapCurrencyDenominations =
            new TreeMap<Integer, CurrencyDenomination>(Comparator.reverseOrder());

    public abstract String getSymbol();
    public abstract List<CurrencyDenomination> getCurrencyDenominationList();

    public List<CurrencyDenominationOutput> findMinDominationForValue(Double inputValue) {

        Double sourceInputValue = Double.valueOf(inputValue);

        List<CurrencyDenominationOutput> currencyDenominationOutputList = new ArrayList<>();

        for (CurrencyDenomination currencyDenomination : mapCurrencyDenominations.values()) {
            Double currencyVal = Double.valueOf(currencyDenomination.getValue());
            Double divValue = sourceInputValue/currencyVal;
            if (divValue >= BigDecimal.ONE.doubleValue() && sourceInputValue > BigDecimal.ZERO.doubleValue()) {
                Integer intValue = divValue.intValue();
                currencyDenominationOutputList.add(
                        new CurrencyDenominationOutput(currencyDenomination.getName(), intValue));
                sourceInputValue = sourceInputValue - (intValue * currencyDenomination.getValue());
            }
        }

        return currencyDenominationOutputList;
    }
}
