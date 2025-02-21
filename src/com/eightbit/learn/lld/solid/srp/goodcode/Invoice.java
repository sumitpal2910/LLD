package com.eightbit.learn.lld.solid.srp.goodcode;

public class Invoice {
    private double amount;
    private String email;

    public Invoice(double amount, String email) {
        this.amount = amount;
        this.email = email;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated && price is $" + amount + ".");
    }
}
