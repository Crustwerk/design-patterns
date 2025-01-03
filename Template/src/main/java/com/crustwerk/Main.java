package com.crustwerk;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ConcreteImplementationOne concreteImplementationOne = new ConcreteImplementationOne();
        concreteImplementationOne.templateMethod();
        ConcreteImplementationTwo concreteImplementationTwo = new ConcreteImplementationTwo();
        concreteImplementationTwo.templateMethod();
    }
}