package com.eightbit.learn.lld.solid.ocp.goodcode;

public class Main {

    public static void main(String[] args) {

        PaymentProcessor processor = new PaymentProcessor();
        PaymentMethod creditCard = new CreditCardPaymentMethod();


        processor.processPayment(creditCard, 100);

    }
}
