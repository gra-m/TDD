package com.madeby.fun.currency;

import static org.junit.jupiter.api.Assertions.*;
import com.madeby.fun.currency.MoneyExample.*;

class MoneyExampleTest
{
    @org.junit.jupiter.api.Test
    void TestMultiplication( )
    {
        StaticDollar five = new StaticDollar(5);

        assertEquals(new StaticDollar(10), five.times(2));

        assertEquals(new StaticDollar(15), five.times(3));
    }

    @org.junit.jupiter.api.Test
    void testEquality() {
        assertEquals(new StaticDollar(5), new StaticDollar(5));
        assertNotEquals(new StaticDollar(5), new StaticDollar(6));
        
    }

    @org.junit.jupiter.api.Test
    void TestStaticFrancMultiplication( )
    {
        StaticFranc five = new StaticFranc(5);

        assertEquals(new StaticFranc(10), five.times(2));

        assertEquals(new StaticFranc(15), five.times(3));
    }
}
