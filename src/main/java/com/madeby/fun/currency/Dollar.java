package com.madeby.fun.currency;

public class Dollar extends Money
{
    public Dollar( int amount )
    {
        this.amount = amount;
    }


    public Dollar times( int multiplier )
    {
        return new Dollar(amount * multiplier);
    }

    int getAmount( )
    {
        return amount;
    }


}
