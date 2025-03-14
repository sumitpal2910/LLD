package com.eightbit.learn.lld.solid.ocp.goodcode;

public class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod, double amount) {
        paymentMethod.pay(amount);
    }
}
