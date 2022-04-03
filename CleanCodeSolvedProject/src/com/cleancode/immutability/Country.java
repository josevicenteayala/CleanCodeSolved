package com.cleancode.immutability;

import java.util.Currency;

/**
 * Write an immutable class named Country, which has two attributes: name as String and currency as java.util.Currency and explain the key elements to be immutable.
 * */
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
