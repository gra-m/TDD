package com.madeby.fun;

import static org.junit.jupiter.api.Assertions.*;
import com.madeby.fun.MoneyExample.Dollar;

class MoneyExampleTest
{
    @org.junit.jupiter.api.Test
    void TestMultiplication( )
    {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}
