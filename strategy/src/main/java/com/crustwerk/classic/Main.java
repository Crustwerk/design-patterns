package com.crustwerk.classic;

/*
Necessità:
    Definire una famiglia di algoritmi intercambiabili.

Quando usarlo:
    Quando vuoi scegliere o cambiare dinamicamente il comportamento di un oggetto.
*/

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pagamento con carta di credito
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.pay(100.0);

        // Pagamento con PayPal
        context.setPaymentStrategy(new PayPalPayment("utente@example.com"));
        context.pay(250.0);

        // Pagamento tramite bonifico bancario
        context.setPaymentStrategy(new BankTransferPayment("IT60X0542811101000000123456"));
        context.pay(500.0);
    }
}