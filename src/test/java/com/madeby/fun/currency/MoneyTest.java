package com.madeby.fun.currency;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest
{

    @org.junit.jupiter.api.Test
    void TestCurrency( )
    {
       assertEquals("USD", Money.dollar(1).currency());
       assertEquals("CHF", Money.franc(1).currency());
    }

    @org.junit.jupiter.api.Test
    void TestDollarMultiplication( )
    {
        Money five = Money.dollar(5);

        assertEquals(Money.dollar(10), five.times(2));

        assertEquals(Money.dollar(15), five.times(3));
    }

@org.junit.jupiter.api.Test
    void TestFrancMultiplication( )
    {
        Money five = Money.franc(5);

        assertEquals(Money.franc(10), five.times(2));

        assertEquals(Money.franc(15), five.times(3));
    }
    @org.junit.jupiter.api.Test
    void testEquality() {

        assertEquals(Money.dollar(5), Money.dollar(5));
        assertEquals(Money.franc(5), Money.franc(5));

        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertNotEquals(Money.franc(5), Money.franc(6));

        assertNotEquals(Money.dollar(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.dollar(5));
        

    }


}