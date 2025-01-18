package com.eightbit.learn.lld.basic.oops;

public abstract class Card implements PaymentMethod {

    protected final String cardNumber;
    protected final String userName;

    public Card(String cardNumber, String userName) {
        this.cardNumber = cardNumber;
        this.userName = userName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getUserName() {
        return userName;
    }


}
