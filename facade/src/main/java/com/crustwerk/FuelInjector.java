package com.crustwerk;

class FuelInjector {
    public void on() {
        System.out.println("Fuel Injector on");
    }

    public void off() {
        System.out.println("Fuel Injector off");
    }

    public void inject() {
        System.out.println("Injecting fuel");
    }
}

class AirFlowController {
    public void takeAir() {
        System.out.println("Taking air");
    }

    public void off() {
        System.out.println("Air flow off");
    }
}

class Starter {
    public void start() {
        System.out.println("Starting engine");
    }
}

class CoolingController {
    public void setTemperatureUpperLimit(int temperature) {
        System.out.println("Setting cooling temperature upper limit: " + temperature);
    }

    public void run() {
        System.out.println("Cooling system running");
    }

    public void cool(int temperature) {
        System.out.println("Cooling engine to " + temperature + "°C");
    }

    public void stop() {
        System.out.println("Cooling system stopped");
    }
}

class CatalyticConverter {
    public void on() {
        System.out.println("Catalytic Converter on");
    }

    public void off() {
        System.out.println("Catalytic Converter off");
    }
}