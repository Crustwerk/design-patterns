package com.crustwerk;

/*
Necessità:
    Fornire un sostituto o un intermediario per controllare l'accesso a un oggetto.

Quando usarlo:
    Quando vuoi aggiungere un livello di controllo o sicurezza.
*/

public class Main {
    public static void main(String[] args) {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        //object.process();
    }
}