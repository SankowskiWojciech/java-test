package pl.sii.eu;

import org.junit.Test;
import pl.sii.eu.model.Amount;
import pl.sii.eu.model.Currency;

import static org.junit.Assert.*;

public class CurrencyConverterImpTest {

    private final Amount eur10 = new Amount(10, Currency.EUR);
    private final Amount eur100 = new Amount(100, Currency.EUR);

    private final Amount pln10 = new Amount(10, Currency.PLN);
    private final Amount pln100 = new Amount(100, Currency.PLN);

    private final Amount eur10ToPln = new Amount(42.52, Currency.PLN);
    private final Amount eur100ToPln = new Amount(425.18, Currency.PLN);

    private final Amount pln10ToEur = new Amount(2.35, Currency.EUR);
    private final Amount pln100ToEur = new Amount(23.52, Currency.EUR);

    private CurrencyConverter currencyConverter = new CurrencyConverterImp();

    @Test
    public void shouldBeEqual() {
        assertEquals(0, Double.compare(eur10ToPln.getValue(), currencyConverter.convertToPln(eur10).getValue()));
        assertEquals(0, Double.compare(eur100ToPln.getValue(), currencyConverter.convertToPln(eur100).getValue()));
        assertEquals(0, Double.compare(pln10ToEur.getValue(), currencyConverter.convertToEur(pln10).getValue()));
        assertEquals(0, Double.compare(pln100ToEur.getValue(), currencyConverter.convertToEur(pln100).getValue()));
    }
}