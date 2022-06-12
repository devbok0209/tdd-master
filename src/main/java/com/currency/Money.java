package com.currency;

public abstract class Money {
    protected int amount;
    protected String currency;
    static Dollar dollar(int amount) {
        return new Dollar(amount);

    }

    static Franc franc(int amount) {
        return new Franc(amount);

    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return this.amount == money.amount
                && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);

    abstract String currency();
}
