package com.currency;

public class Sum implements Expression{
    public Expression augend;
    public Expression addend;

    public Sum(Expression money, Expression addend) {
        this.augend = money;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amount = augend.reduce(bank, to).amount
                + addend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
}
