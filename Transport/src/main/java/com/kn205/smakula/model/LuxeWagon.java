package com.kn205.smakula.model;

public class LuxeWagon extends Wagon {

    public LuxeWagon(int ID, int amountOfPassengers, int luggage){
        super(ID, amountOfPassengers, luggage);
        this.comfortIndex = 100;
    }

    @Override
    public void move() {
        System.out.println("^Музика^");
    }

    protected String getWagonType(){
        return "Luxe\t";
    }

}
