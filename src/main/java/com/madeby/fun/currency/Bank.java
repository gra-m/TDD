package com.madeby.fun.currency;

public class Bank
{
    Money reduce(Expression source, String to) {

        // Since Java 16
        if (source instanceof Money money) {
            return money;
        }

        Sum sum = (Sum) source;
        return sum.reduce(to);
    }
}
