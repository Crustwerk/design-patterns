package com.crustwerk;

/*
Necessità:
    - Definire un'interfaccia per creare oggetti, delegando l'implementazione alle sottoclassi.

Vantaggi:
    - Disaccoppiamento: il codice che usa l'oggetto non dipende dalla sua implementazione concreta.
        Il codice non dipende più direttamente dalle classi specifiche (Tesla, Toyota), ma solo dall'interfaccia comune (Car) e dalla factory.
        Questo rende il codice più flessibile e facile da mantenere.

    - Facile estensione: possiamo modificare la creazione dell'oggetto senza cambiare il codice che lo utilizza.

    - Migliore manutenibilità: se la logica di creazione cambia, dobbiamo modificarla solo nella factory.
*/

public class Main {
    public static void main(String[] args) {
        // Creiamo una fabbrica di motociclette
        MotorVehicleFactory motorcycleFactory = new MotorcycleFactory();
        MotorVehicle motorcycle = motorcycleFactory.create(); // Output: Build Motorcycle

        // Creiamo una fabbrica di auto
        MotorVehicleFactory carFactory = new CarFactory();
        MotorVehicle car = carFactory.create(); // Output: Build Car
    }
}