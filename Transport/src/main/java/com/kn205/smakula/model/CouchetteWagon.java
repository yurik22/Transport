package com.kn205.smakula.model;


public class CouchetteWagon extends Wagon {


    public CouchetteWagon(){};

    public CouchetteWagon(int ID, int amountOfPassengers, int luggage){
        super(ID, amountOfPassengers, luggage);
        this.comfortIndex = 10;
    }

    public void printSmthng(){
        System.out.println("воно ніхуя не працює");
    }

//    somebody once told me the world's gonna roll me
//    i aint the sharpest tool in the sheeeeeeed

    @Override
    public void move() {
        System.out.println("^Скрип^");
    }

    protected String getWagonType(){
        return "Couchette";
    }

}
