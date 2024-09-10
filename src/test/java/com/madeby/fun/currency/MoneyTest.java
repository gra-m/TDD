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
    void TestDollarMultiplication( )
    {
        Money five = Money.dollar(5, "USD");

        assertEquals(Money.dollar(10, "USD"), five.times(2));

        assertEquals(Money.dollar(15, "USD"), five.times(3));
    }

@org.junit.jupiter.api.Test
    void TestFrancMultiplication( )
    {
        Money five = Money.franc(5, "CHF");

        assertEquals(Money.franc(10, "CHF"), five.times(2));

        assertEquals(Money.franc(15, "CHF"), five.times(3));
    }
    @org.junit.jupiter.api.Test
    void testEquality() {

        assertEquals(Money.dollar(5, "USD"), Money.dollar(5, "USD"));
        assertEquals(Money.franc(5, "CHF"), Money.franc(5, "CHF"));

        assertNotEquals(Money.dollar(5, "USD"), Money.dollar(6,"USD" ));
        assertNotEquals(Money.franc(5, "CHF"), Money.franc(6, "CHF"));

        assertNotEquals(Money.dollar(5, "USD"), Money.franc(5, "CHF"));
        assertNotEquals(Money.franc(5, "CHF"), Money.dollar(5, "USD"));
    }


    @org.junit.jupiter.api.Test
    void testDifferentClassEquality() {
        assertEquals(new Money(10, "CHF"), new Franc(10, "CHF"));
    }



}