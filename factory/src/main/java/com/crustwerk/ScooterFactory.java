package com.crustwerk;

public class ScooterFactory extends MotorVehicleFactory{
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Scooter();
    }
}
