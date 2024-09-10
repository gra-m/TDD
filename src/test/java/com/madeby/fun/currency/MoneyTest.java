package com.madeby.fun.currency;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class MoneyTest
{
    @org.junit.jupiter.api.Test
    void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();

        Money result = bank.reduce(sum, "USD");
        
        assertEquals(Money.dollar(7), result);


    }

    @org.junit.jupiter.api.Test
    void testPlusReturnSum() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);

        Sum sum = (Sum) result;

        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);

    }

    @org.junit.jupiter.api.Test
    void testSimpleAddition() {
        Money five = Money.dollar(5);

        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }

    @org.junit.jupiter.api.Test
    void TestCurrency( )
    {
       assertEquals("USD", Money.dollar(1).currency());
       assertEquals("CHF", Money.franc(1).currency());
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
        assertEquals(new Money(10, "CHF"), Money.franc(10));
        assertEquals(new Money(15, "USD"), Money.dollar(15));

    }


    @org.junit.jupiter.api.Test
    void testInequality( )
    {
        assertNotEquals(new Money(5, "CHF"), new Money(6, "CHF"));
        assertNotEquals(new Money(10, "CHF"), Money.dollar(10));
        assertNotEquals(new Money(10, "USD"), Money.franc(10));
    }

}