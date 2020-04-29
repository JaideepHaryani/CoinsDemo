package com.accn.currencycount.factory;

import com.accn.currencycount.domain.Currency;
import com.accn.currencycount.domain.USDollar;

/**
 * Factory to support multiple currencies possible & keep the logic isolated from the client call.
 */
public class CurrencyFactory {

    public static Currency getCurrency (String currency) {

        switch (currency) {
            case "USD":
                return new USDollar();
            // likewise other currencies (INR/EURO) )can be returned by this factory.
            default:
                throw new IllegalArgumentException("No such Currency");
        }
    }
}
