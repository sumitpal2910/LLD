package com.eightbit.learn.lld.solid.ocp.goodcode;

public class CreditCardPaymentMethod implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via CreditCard: " + amount);
    }
}
