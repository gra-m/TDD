package com.madeby.fun.currency;

public class Franc extends Money
{
    public Franc( int amount, String currency )
    {
        super(amount, currency);
    }

    public Money times( int multiplier )
    {
        return new Money(amount * multiplier, currency);
    }

    int getAmount( )
    {
        return amount;
    }

}
