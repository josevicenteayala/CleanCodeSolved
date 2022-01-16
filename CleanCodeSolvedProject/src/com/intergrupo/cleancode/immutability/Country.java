package com.intergrupo.cleancode.immutability;

import java.util.Currency;

public final class Country {
    private final String name;
    private final Currency currency;

    public Country(String name, Currency currency) {
        this.name = name;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public Currency getCurrency() {
        return currency;
    }
}
