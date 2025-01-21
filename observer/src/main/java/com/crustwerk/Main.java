package com.crustwerk;

/*
Necessità:
    Consentire la notifica automatica di cambiamenti di stato ad altri oggetti.

Quando usarlo:
    Quando un oggetto cambia e altri devono essere notificati automaticamente.
*/


//https://www.baeldung.com/java-observer-pattern
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);
        observable.setNews("news");
    }
}