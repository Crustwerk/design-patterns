package com.crustwerk;

public class SingleThread {
    private static SingleThread instance;

    private SingleThread() {
    }

    public static SingleThread getInstance() {
        if (instance == null) {
            instance = new SingleThread();
        }
        return instance;
    }
}