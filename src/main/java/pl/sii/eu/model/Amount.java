package pl.sii.eu.model;

import java.util.Objects;

public class Amount {
    public static final int PRECISION = 2;

    private final double value;
    private final Currency currency;

    public Amount(double value, Currency currency) {
        this.value = value;
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Amount amount = (Amount) o;

        return value == amount.value && currency == amount.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, currency);
    }
}

