package com.madeby.fun.currency;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Money
{
    private static final Logger logger = LoggerFactory.getLogger(Money.class);
    protected int amount;
    protected String currency;

    protected Money( int amount, String currency ) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar( int amount, String currency ) {
        return new Dollar(amount, currency);
    }

    public static Money franc( int amount, String currency ) {
        return new Franc(amount, currency);
    }

  public Money times( int multiplier )
    {
        return new Money(amount * multiplier, currency);
    }

    public boolean equals( Object obj )
    {
       boolean amountAndCurrencyEqual = false;
        try {
            if ( obj == null) {
                throw new NullPointerException("Null Object obj");
            } else if ( obj.getClass() != this.getClass()) {
                throw new IllegalArgumentException( "Class mismatch" );
            }
            Money money = (Money) obj;
            amountAndCurrencyEqual = amount == money.amount && currency.equals(money.currency);
        } catch ( NullPointerException e ) {
            logger.error("NullPointerException {}", e.getMessage( ));
        } catch ( IllegalArgumentException e ) {
            logger.error("IllegalArgumentException {}",  e.getMessage());
        }
        return amountAndCurrencyEqual;

    }

    public String currency( ) {
        return currency;
    }

    public String toString( ) {
        return amount + " " + currency;
    }
}
