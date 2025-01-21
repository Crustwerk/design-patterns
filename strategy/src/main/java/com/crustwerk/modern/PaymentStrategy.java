package com.crustwerk.modern;

@FunctionalInterface
public interface PaymentStrategy {
    void pay(double amount);

    static PaymentStrategy creditCard() {
        return new PaymentStrategy() {
            @Override
            public void pay(double amount) {
                System.out.println("Pagato " + amount + " con carta di credito");
            }
        };
    }

    static PaymentStrategy paypal() {
        return amount -> System.out.println("Pagato " + amount + " con PayPal");
    }

    static PaymentStrategy bankTransfer() {
        return amount -> System.out.println("Pagato " + amount + " tramite bonifico bancario");
    }
}