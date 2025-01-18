package com.eightbit.learn.lld.basic.oops;

public class Wallet implements PaymentMethod {

    private final String walletId;
    private final Double walletBalance;

    public Wallet(String walletId, Double walletBalance) {
        this.walletId = walletId;
        this.walletBalance = walletBalance;
    }

    public String getWalletId() {
        return walletId;
    }

    public Double getWalletBalance() {
        return walletBalance;
    }

    @Override
    public void pay() {
        System.out.println("Making Payment via Wallet. id: " + walletId);
    }
}
