package com.crustwerk;

/*
Necessità:
    Passare una richiesta lungo una catena di gestori, permettendo a ciascun gestore di elaborarla
    o di passarla al successivo.

Quando usarlo:
    Quando una richiesta può essere gestita da diversi oggetti in una sequenza
    e non vuoi che il mittente debba sapere quale oggetto nella catena effettuerà l'elaborazione.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}