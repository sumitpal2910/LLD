package com.eightbit.learn.lld.basic.oops;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PaymentService {

    // Storing  + Making Payments


    Map<String, PaymentMethod> paymentMethods;

    public PaymentService() {
        paymentMethods = new HashMap<>();
    }

    /**
     * Add a new payment method to payment service to save for future.
     *
     * @param name          alias name of user payment method
     * @param paymentMethod object of payment method
     */
    public void add(String name, PaymentMethod paymentMethod) {
        paymentMethods.put(name, paymentMethod);
    }


    public void makePayment(String name, int amount) {

        PaymentMethod pm = paymentMethods.get(name);
        if (pm == null) throw new RuntimeException("Invalid payment method");

        pm.pay();
    }

}
