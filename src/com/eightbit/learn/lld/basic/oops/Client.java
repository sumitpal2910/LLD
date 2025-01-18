package com.eightbit.learn.lld.basic.oops;

public class Client {
    public static void main(String[] args) {
        PaymentService ps = new PaymentService();

        ps.add("SumitHDFCDebitCard", new DebitCard("1234_1234_1234_1234", "Sumit Pal"));
        ps.add("SumitSBIUPI", new UPI("sumit@oksbi"));
        ps.add("SumitSBICreditCard", new CreditCard("1234_1234_1234_1234", "Sumit Pal"));
        ps.add("SumitWallet", new Wallet("sumitpal2810", 1000d));


        ps.makePayment("SumitSBIUPI", 10);

    }
}
