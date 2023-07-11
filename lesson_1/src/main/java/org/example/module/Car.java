package org.example.module;

public class Car {
    public String brand;
    public String carName;
    public String vin;
    public Worker owner;

    public String startEngine () {
        return "Engine start...";
    }

    public String stopEngine () {
        return "Engine stop...";
    }
}
