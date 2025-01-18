package com.eightbit.learn.lld.basic.oops;

public class CreditCard extends Card {
    public CreditCard(String cardNumber, String userName) {
        super(cardNumber, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making Payment via Credit Card");
    }
}
