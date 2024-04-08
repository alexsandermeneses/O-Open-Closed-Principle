package org.example.vehicles;

public class Car implements IVehicleCar{
    private String color;
    private String year;
    private double engine;
    private int seats;

    @Override
    public String toString() {
        return "color = " + color +
                ", year = " + year +
                ", engine = " + engine +
                ", seats = " + seats;
    }

    public Car(String color, String year, double engine, int seats){

        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;

        System.out.println("Creating a car with interface: " + color + " " + engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting the engine... with Interface");
    }
}
