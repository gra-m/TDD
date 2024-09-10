package com.madeby.fun.currency;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest
{
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
        Franc five = new Franc(5);

        assertEquals(new Franc(10), five.times(2));

        assertEquals(new Franc(15), five.times(3));
    }
    @org.junit.jupiter.api.Test
    void testEquality() {

        assertEquals(Money.dollar(5), Money.dollar(5));
        assertEquals(new Franc(5), new Franc(5));

        assertNotEquals(Money.dollar(5), Money.dollar(6));
        assertNotEquals(new Franc(5), new Franc(6));

        assertNotEquals(Money.dollar(5), new Franc(5));
        assertNotEquals(new Franc(5), Money.dollar(5));
        

    }


}