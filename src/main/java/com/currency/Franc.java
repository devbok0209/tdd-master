package com.currency;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = "CHF";
    }

    Money times(int multiplier) {
        return Money.franc(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
