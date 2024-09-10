package com.madeby.fun.currency;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest
{
    @org.junit.jupiter.api.Test
    void TestMultiplication( )
    {
        Dollar five = new Dollar(5);

        assertEquals(new Dollar(10), five.times(2));

        assertEquals(new Dollar(15), five.times(3));
    }

    @org.junit.jupiter.api.Test
    void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(6));

    }

    @org.junit.jupiter.api.Test
    void TestFrancMultiplication( )
    {
        Franc five = new Franc(5);

        assertEquals(new Franc(10), five.times(2));

        assertEquals(new Franc(15), five.times(3));
    }

}