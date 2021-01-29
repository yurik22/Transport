package com.kn205.smakula.model;

import java.io.Serializable;
import java.util.Comparator;

public abstract class Wagon implements movable, Serializable {


    protected int ID;
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

    protected abstract String getWagonType();

    protected void reduceComfortIndex(int i){
        comfortIndex -= i;
    }

    public String toString() {
        return this.getWagonType()+" wagon\t\t{" +
                "ID=" + ID +
                ", amountOfPassengers=" + amountOfPassengers +
                ", luggage=" + luggage +
                ", comfortIndex=" + comfortIndex +
                '}';
    }
}
