package com.kn205.smakula.model;


public class CouchetteWagon extends Wagon {




    public CouchetteWagon(int ID, int amountOfPassengers, int luggage){
        super(ID, amountOfPassengers, luggage);
        this.comfortIndex = 10;
    }

    @Override
    public void move() {
        System.out.println("^Скрип^");
        this.reduceComfortIndex(5);
    }

    protected String getWagonType(){
        return "Couchette";
    }

}
