package com.vehicles;

public class VehicleService {

    public static void main(String[] args) {

        Bike bike = new Bike("Pulser", "Pulser220", "sportsBike");

        System.out.println("Bike type is " + bike.getVehicleType() + " its speed is " + bike.maxSpeed(bike.getVehicleType()) + "km/h");
        System.out.println(bike.getManufacturerInformation());

        Car car = new Car("Santro", "Santro123", "Sedan");

        System.out.println("Car type is " + car.getVehicleType() + " its speed is " + car.maxSpeed(car.getVehicleType()) + "km/h");
        System.out.println(car.getManufacturerInformation());
    }
}
