package org.example.company;

public class Ford extends Car {

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Car: the car engine is starting";
    }

    @Override
    public String accelerate() {
        return "Car: the car is accelerating";
    }

    @Override
    public String brake() {
        return "Car: the car is braking";
    }
}