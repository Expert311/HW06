package com.company;

public class Car extends Vehicle implements Costable {

    private int doorsCount;
    private int carCost;

    Car(int wheelCount, int doorsCount, int carCost) {
        super(wheelCount);
        this.doorsCount = doorsCount;
        this.carCost = carCost;
    }

    @Override
    protected void printInfo() {
        super.printInfo();
        System.out.println("Транспортное средство: Машина - Количество дверей: " + doorsCount + " - Количество колес: " + wheelCount + " - Цена: " + getCost());
    }

    @Override
    public int getCost() {
        return carCost;
    }
}
