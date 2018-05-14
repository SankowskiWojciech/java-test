package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

public class CurrencyConverterImp implements CurrencyConverter {

    @Override
    public Amount convertToPln(Amount euroAmount) {
        double pln = euroAmount.getValue() * EURO_TO_PLN_RATIO;
        pln = Math.round(pln * 100);
        pln /= 100;
        return new Amount(pln, Currency.PLN);
    }

    @Override
    public Amount convertToEur(Amount plnAmount) {
        double euro = plnAmount.getValue() / EURO_TO_PLN_RATIO;
        euro = Math.round(euro * 100);
        euro /= 100;
        return new Amount(euro, Currency.EUR);
    }
}
