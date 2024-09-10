package com.madeby.fun.currency;

public class Franc extends Money
{
    public Franc( int amount, String currency )
    {
        super(amount, currency);
    }

    int getAmount( )
    {
        return amount;
    }

}
