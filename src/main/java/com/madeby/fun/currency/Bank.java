package com.madeby.fun.currency;

public class Bank
{
    Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
}
