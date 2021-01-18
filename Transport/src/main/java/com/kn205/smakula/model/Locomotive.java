package com.kn205.smakula.model;

public class Locomotive implements movable {

    private int power;
    private int maxSpeed;
    private double fuelConsumption;

    public Locomotive(){};

    public Locomotive(int power, int maxSpeed, int fuelConsumption){
        this.power = power;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Locomotive{" +
                "power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", fuelConsumption=" + fuelConsumption +
                '}';
    }

    public int getPower() {
        return power;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public void move() {
        System.out.println("^Пневмосигнал^");
    }
}
