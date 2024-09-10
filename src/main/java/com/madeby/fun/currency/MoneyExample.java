package com.madeby.fun.currency;

public class MoneyExample
{
    private MoneyExample(){}

   public static class StaticDollar {
       public StaticDollar( int amount ) {
           this.amount = amount;
       }
        private int amount;

       public StaticDollar times( int multiplier ) {
           return new StaticDollar(amount * multiplier);
       }

       int getAmount( ) {
           return amount;
       }

       public boolean equals( Object obj ) {
           if(obj == null || obj.getClass() != this.getClass())
               throw new IllegalArgumentException();

           StaticDollar dollar = (StaticDollar) obj;
           return this.amount == dollar.amount;
       }
    }

    public static class StaticFranc {
        public StaticFranc( int amount ) {
            this.amount = amount;
        }
        private int amount;

        public StaticFranc times( int multiplier ) {
            return new StaticFranc(amount * multiplier);
        }

        int getAmount( ) {
            return amount;
        }

        public boolean equals( Object obj ) {
            if(obj == null || obj.getClass() != this.getClass())
                throw new IllegalArgumentException();

            StaticFranc franc = (StaticFranc) obj;
            return this.amount == franc.amount;
        }
    }
}

