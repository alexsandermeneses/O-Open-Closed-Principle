package org.example.vehicles;

public class Motorcicle implements IVehicleCar{

    private String color;
    private String year;
    private double engine;
    private int seats;

    @Override
    public String toString() {
        return "color = " + color+
                ", year = " + year+
                ", engine = " + engine +
                ", seats = " + seats;
    }

    public Motorcicle(String color, String year, double engine, int seats) {

        configureVehicle(color, year, engine, seats);
    }

    @Override
    public void configureVehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        System.out.println("Creating the motorcicle with interface: " + color + " " + engine);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting");
    }
}
