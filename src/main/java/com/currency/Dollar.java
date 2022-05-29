package com.currency;

public class Dollar {
    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
       return new Dollar(amount * multiplier);
    }

    public boolean equals(Dollar dollar) {
        return this.amount == dollar.amount;
    }
}
