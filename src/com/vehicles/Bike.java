package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {


    public Bike(String vehicleName, String vehicleModelName, String vehicleType) {
        super(vehicleName, vehicleModelName, vehicleType);
    }

    @Override
    public String getManufacturerInformation() {
        return "Bike{ Manufacturer name: " + getVehicleName() + "," +
                "Model Name: " + getVehicleModelName() + ",Type: " + getVehicleType() + "}";
    }

    @Override
    public int maxSpeed(String vehicleType) {

        int speed = 0;
        if (getVehicleType() == "sportsBike") {
            speed = 300;
            return speed;
        } else if (getVehicleType() == "cruiser") {
            speed = 170;
            return speed;
        }
        return speed;
    }
}
