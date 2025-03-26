package com.crustwerk;

public class TruckFactory extends MotorVehicleFactory {
    @Override
    protected MotorVehicle createMotorVehicle() {
        return new Truck();
    }
}
