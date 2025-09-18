package org.example.company;

public class Car {
    private boolean engine;
    private Integer cylinders;
    private String name;
    private Integer wheels;

    public Car(Integer cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public Integer getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{name='" + name + "', cylinders=" + cylinders + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders.equals(car.cylinders) && name.equals(car.name);
    }

    public String startEngine() {
        String msg = "the car's engine is starting";
        System.out.println(getClass().getSimpleName() + ": " + msg);
        return msg;
    }

    public String accelerate() {
        String msg = "the car is accelerating";
        System.out.println(getClass().getSimpleName() + ": " + msg);
        return msg;
    }

    public String brake() {
        String msg = "the car is braking";
        System.out.println(getClass().getSimpleName() + ": " + msg);
        return msg;
    }
}
