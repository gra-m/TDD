package com.madeby.fun.currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest
{

    @org.junit.jupiter.api.Test
    void TestCurrency( )
    {
       assertEquals("USD", Money.dollar(1, "USD").currency());
       assertEquals("CHF", Money.franc(1, "CHF").currency());
    }

@org.junit.jupiter.api.Test
    void TestMultiplication( )
    {
        Money fiveFranc = new  Money(5, "CHF");
        Money fiveDollar = new  Money(5, "USD");

        assertEquals(new Money(10, "CHF"), fiveFranc.times(2));
        assertEquals(new Money(15, "USD"), fiveDollar.times(3));
    }
    @org.junit.jupiter.api.Test
    void testEquality() {

        assertEquals(new Money(5, "USD"), new Money(5, "USD"));
        assertEquals(new Money(5, "CHF"), new Money(5, "CHF"));

        assertNotEquals(new Money(5, "USD"), new Money(6,"USD" ));
        assertNotEquals(new Money(5, "CHF"), new Money(6, "CHF"));

        assertNotEquals(new Money(5, "USD"), new Money(5, "CHF"));
        assertNotEquals(new Money(5, "CHF"), new Money(5, "USD"));
    }


    @org.junit.jupiter.api.Test
    void testDifferentClassEquality() {
        assertEquals(new Money(10, "CHF"), new Money(10, "CHF"));
        assertNotEquals(new Money(10, "CHF"), new Money(10, "USD"));
    }



}