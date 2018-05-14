package pl.sii.eu;

import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

public class CurrencyConverterDemo {

    public static void main(String[] args) {
        CurrencyConverterImp currencyConverterImp = new CurrencyConverterImp();

        //10 EUR -> PLN
        System.out.println(currencyConverterImp.convertToPln(new Amount(10.0, Currency.EUR)).getValue());
        //100 EUR -> PLN
        System.out.println(currencyConverterImp.convertToPln(new Amount(100.0, Currency.EUR)).getValue());

        //10 PLN -> EUR
        System.out.println(currencyConverterImp.convertToEur(new Amount(10.0, Currency.PLN)).getValue());
        //100 PLN -> EUR
        System.out.println(currencyConverterImp.convertToEur(new Amount(100.0, Currency.PLN)).getValue());
    }

}
