package com.crustwerk;

/*
Necessità:
    Definire l'ossatura di un algoritmo in un metodo, lasciando alcuni passi a specifiche implementazioni delle sottoclassi.

Quando usarlo:
    Quando hai una sequenza di operazioni comuni che devono essere implementate in modo simile da classi diverse,
    ma con alcuni passaggi personalizzati.
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ConcreteImplementationOne concreteImplementationOne = new ConcreteImplementationOne();
        concreteImplementationOne.templateMethod();
        ConcreteImplementationTwo concreteImplementationTwo = new ConcreteImplementationTwo();
        concreteImplementationTwo.templateMethod();
    }
}