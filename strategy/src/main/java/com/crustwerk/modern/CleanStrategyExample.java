package com.crustwerk.modern;

public class CleanStrategyExample {
    public static void main(String[] args) {
        //dichiaro una variabile di tipo interfaccia
        PaymentStrategy strategy;

        //invoco un metodo statico dell'interfaccia che mi restituisce un oggetto di tipo anonimo
        //che implementa l'interfaccia e soprattutto implementa a modo suo il metodo pay() dell'interfaccia
        strategy = PaymentStrategy.creditCard();

        //invoco il metodo pay dell'oggetto appena creato
        strategy.pay(100.0);

        strategy = PaymentStrategy.paypal();
        strategy.pay(200.0);

        strategy = PaymentStrategy.bankTransfer();
        strategy.pay(300.0);
    }
}