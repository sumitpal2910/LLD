package com.eightbit.learn.lld.solid.ocp.goodcode;

public class InternetBankingPaymentMethod implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Making Payment via Internet Banking: " + amount);
    }
}
