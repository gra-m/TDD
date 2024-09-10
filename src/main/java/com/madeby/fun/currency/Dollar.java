package com.madeby.fun.currency;

public class Dollar
{
    public Dollar( int amount ) {
        this.amount = amount;
    }
    private int amount;

    public Dollar times( int multiplier ) {
        return new Dollar(amount * multiplier);
    }

    int getAmount( ) {
        return amount;
    }

    public boolean equals( Object obj ) {
        if(obj == null || obj.getClass() != this.getClass())
            throw new IllegalArgumentException();

        Dollar Dollar = (Dollar) obj;
        return this.amount == Dollar.amount;
    }
}
