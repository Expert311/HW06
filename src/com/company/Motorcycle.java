package com.company;

public class Motorcycle extends Vehicle {

    private int maxSpeed;

    Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Транспортное средство: Мотоцикл - Количество колес: " + wheelCount + " - Максимальная скорость: " + maxSpeed + " км/ч");
    }
}
