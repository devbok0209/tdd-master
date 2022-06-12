package com.currency;

public abstract class Money {
    protected int amount;
    protected String currency;
    static Money dollar(int amount) {
        return new Dollar(amount, "USD");

    }

    static Money franc(int amount) {
        return new Franc(amount, "CHF");

    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);

    abstract String currency();
}
