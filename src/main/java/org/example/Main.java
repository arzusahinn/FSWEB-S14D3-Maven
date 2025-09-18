package org.example.company;

import org.example.arge.*;

public class Main {
    public static void main(String[] args) {
        // Company cars
        Car car = new Car(6, "Toyota");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("------");

        // R&D cars
        CarSkeleton gasCar = new GasPoweredCar("PetrolCar", "Gas vehicle", 12.5, 6);
        CarSkeleton electricCar = new ElectricCar("Tesla", "Electric vehicle", 300, 100);
        CarSkeleton hybridCar = new HybridCar("Prius", "Hybrid vehicle", 15, 80, 4);

        CarSkeleton[] cars = {gasCar, electricCar, hybridCar};
        for (CarSkeleton c : cars) {
            c.printType();
            c.startEngine();
            c.drive();
            System.out.println();
        }
    }
}