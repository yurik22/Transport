package com.kn205.smakula.model;

import java.io.Serializable;

public class Locomotive implements movable, Serializable {

    private int power;
    private int maxSpeed;
    private double fuelConsumption;


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
