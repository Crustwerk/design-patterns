package com.crustwerk;

public abstract class TemplateClass {
    public void printFirst() {
        System.out.println("First");
    }

    public void printSecond() {
        System.out.println("Second");
    }

    public abstract void printThird();

    public void printFourth() {
        System.out.println("Fourth");
    }

    public void templateMethod() {
        printFirst();
        printSecond();
        printThird();
        printFourth();
    }
}