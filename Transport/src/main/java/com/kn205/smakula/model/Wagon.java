package com.kn205.smakula.model;

public abstract class Wagon implements movable {


    protected int ID;
    protected int maxPassengers;
    protected int maxLuggage;
    protected int amountOfPassengers;
    protected int luggage;
    protected int comfortIndex;


    public Wagon(){};

    public Wagon(int ID, int amountOfPassengers, int luggage){
        this.ID = ID;
        this.amountOfPassengers = amountOfPassengers;
        this.luggage = luggage;
    }



    public void setComfortIndex(int comfortIndex){
        this.comfortIndex = comfortIndex;
    }

    public int getID(){
        return this.ID;
    }

    public int getAmountOfPassengers() {
        return amountOfPassengers;
    }

    public int getLuggage() {
        return luggage;
    }

    public int getComfortIndex() {
        return comfortIndex;
    }
}
