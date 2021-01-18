package com.kn205.smakula.model;

public class CoupeWagon extends Wagon {

    public CoupeWagon(int ID, int amountOfPassengers, int luggage){
        super(ID, amountOfPassengers, luggage);
        this.maxPassengers = 50;
        this.maxLuggage = 10000;
        this.comfortIndex = 50;
    }


    @Override
    public void move() {
        System.out.println("^Чухчух-чухчух^");
    }

    @Override
    public String toString() {
        return "Coupe wagon{" +
                "ID=" + ID +
                ", maxPassengers=" + maxPassengers +
                ", amountOfPassengers=" + amountOfPassengers +
                ", maxLuggage=" + maxLuggage +
                ", luggage=" + luggage +
                ", comfortIndex=" + comfortIndex +
                '}';
    }

}
