package com.accn.currencycount;

import com.accn.currencycount.controller.CurrencyCountController;
import com.accn.currencycount.domain.CurrencyDenominationOutput;

import java.util.List;

public class CurrencyCountMain {

    /**
     * Main method. Expects 2 program args. Currency name (Example: USD) & input value (Example: 287)
     *
     * @param args
     */
    public static void main(String args[]) {

        String inputCurrency = args[0];
        Double inputValue = Double.parseDouble(args[1]);

        CurrencyCountController currencyCountController = new CurrencyCountController();

        List<CurrencyDenominationOutput> currencyDenominationOutputList =
                currencyCountController.getMinDenominations(inputCurrency, inputValue);

        for (CurrencyDenominationOutput currencyDenominationOutput: currencyDenominationOutputList) {
                System.out.println(currencyDenominationOutput.getCurrencyDenominationName()
                        + " - " + currencyDenominationOutput.getNumberOfDenominations());
        }
    }
}
