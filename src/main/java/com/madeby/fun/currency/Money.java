package com.madeby.fun.currency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Money
{
    private static final Logger logger = LoggerFactory.getLogger(Money.class);
    protected int amount;

    public static Money dollar( int amount ) {
        return new Dollar(amount);
    }

    public static Money franc( int amount ) {
        return new Franc(amount);
    }

    abstract Money times( int multiplier );

    public boolean equals( Object obj )
    {
       boolean result = false;
        try {
            if ( obj == null)
                throw new NullPointerException("Null Object obj");
            else if ( this.getClass()!= obj.getClass() ) {
                throw new IllegalArgumentException(String.format("Different classes passed this:%s obj:%s",
                        this.getClass( ),
                        obj.getClass()));
            }
            result = this.amount == ((Money) obj).amount;
        } catch ( NullPointerException e ) {
            logger.error("NullPointerException {}", e.getMessage( ));
        } catch ( IllegalArgumentException e ) {
            logger.error("IllegalArgumentException {}",  e.getMessage());
        }
        return result;

    }
}
