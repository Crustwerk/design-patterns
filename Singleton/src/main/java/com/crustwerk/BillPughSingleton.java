package com.crustwerk;
//si sfruttano le garanzie del ClassLoader sulla generazione della classe di appoggio (holding class)
//in tal modo è impossibile avere due istanze
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHolder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHolder.instance;
    }
}