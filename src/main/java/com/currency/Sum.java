package com.currency;

public class Sum implements Expression{
    public Money augend;
    public Money addend;

    public Sum(Money money, Money addend) {
        this.augend = money;
        this.addend = addend;
    }
}
