package com.eightbit.learn.lld.solid.ocp.badcode;

public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount) {

        switch (paymentMethod) {
            case "DebitCard" -> {
                System.out.println("Making Payment via DebitCard: " + amount);
            }
            case "CreditCard" -> {
                System.out.println("Making Payment via CreditCard: " + amount);
            }
            case "Paypal" -> {
                System.out.println("Making Payment via Paypal: " + amount);
            }
            default -> {
                throw new IllegalStateException("Unsupported payment method  " + paymentMethod);
            }
        }
    }
}
