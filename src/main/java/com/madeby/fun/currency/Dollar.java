package com.madeby.fun.currency;

public class Dollar extends Money
{
    public Dollar( int amount, String currency )
    {
        super(amount, currency);
    }

    int getAmount( )
    {
        return amount;
    }


}
