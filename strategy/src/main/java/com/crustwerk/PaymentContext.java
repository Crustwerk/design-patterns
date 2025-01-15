package com.crustwerk;

public class PaymentContext {
    public PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment() {

    }
}
