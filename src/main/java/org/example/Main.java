package org.example;

import org.example.vehicles.Car;
import org.example.vehicles.Motorcicle;

public class Main {
    private static TypeVehicle typeVehicle;
    private static TypeVehicle typeVehicle01;
    public static void main(String[] args) {
        typeVehicle = TypeVehicle.CAR;
        typeVehicle01 = TypeVehicle.MOTORCYCLE;

        Car car = new Car("White","2025", 5.0, 5);
        Motorcicle moto = new Motorcicle("Black", "2025", 10000,2);

        System.out.println("Car: " + car);
        System.out.println("Moto: " + moto);
    }

}