package com.eightbit.learn.lld.solid.badcode;

public class Invoice {
    private double amount;
    private String userEmail;

    public Invoice(double amount, String userEmail) {
        this.amount = amount;
        this.userEmail = userEmail;
    }

    public void generateInvoice() {
        System.out.println("Invoice generated && price is $" + amount + ".");
    }

    public void saveToDatabase() {
        System.out.println("Invoice saved to database.");
    }

    public void sendInvoiceEmail() {
        System.out.println("Invoice sent to " + userEmail);
    }
}
