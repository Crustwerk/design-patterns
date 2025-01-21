package com.crustwerk.classic;

public class BankTransferPayment implements PaymentStrategy {
    private String bankAccount;

    public BankTransferPayment(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagato " + amount + " tramite bonifico bancario: " + bankAccount);
    }
}