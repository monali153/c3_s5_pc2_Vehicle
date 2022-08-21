package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {

    public Car(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {
        int speed = 0;
        if (getVehicleType() == "SportsCar") {
            speed = 250;
            return speed;
        } else if (getVehicleType() == "Sedan") {
            speed = 170;
            return speed;
        }

        return speed;
    }

    @Override
    public String getManufacturerInformation() {
        return "Car{ Manufacturer name: " + getVehicleName() + "," +
                "Model Name: " + getVehicleModelName() + ",Type: " + getVehicleType() + "}";
    }
}
