package com.madeby.fun;

public class MoneyExample
{
    private MoneyExample(){}

   static class Dollar {
       public Dollar( int amount ) {
           this.amount = amount;
       }
        int amount = 10;

       void times(int multiplier) {
           amount *= multiplier;
       }
    }
}

