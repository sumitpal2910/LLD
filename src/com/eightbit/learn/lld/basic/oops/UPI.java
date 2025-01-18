package com.eightbit.learn.lld.basic.oops;

public class UPI implements PaymentMethod {

    private final String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public void pay() {
        System.out.println("Making Payment via UPI. UpiId: " + upiId);
    }

}