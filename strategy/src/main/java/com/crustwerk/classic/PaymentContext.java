package com.crustwerk.classic;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Metodo per impostare la strategia di pagamento
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Strategia di pagamento non impostata!");
        }
        paymentStrategy.pay(amount);
    }
}