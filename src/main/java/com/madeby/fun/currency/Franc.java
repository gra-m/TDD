package com.madeby.fun.currency;

public class Franc
{
    public Franc( int amount ) {
        this.amount = amount;
    }
    private int amount;

    public Franc times( int multiplier ) {
        return new Franc(amount * multiplier);
    }

    int getAmount( ) {
        return amount;
    }

    public boolean equals( Object obj ) {
        if(obj == null || obj.getClass() != this.getClass())
            throw new IllegalArgumentException();

        Franc franc = (Franc) obj;
        return this.amount == franc.amount;
    }
}
