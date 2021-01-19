package com.kn205.smakula.model;

public class CoupeWagon extends Wagon {

    public CoupeWagon(int ID, int amountOfPassengers, int luggage){
        super(ID, amountOfPassengers, luggage);
        this.comfortIndex = 50;
    }


    @Override
    public void move() {
        System.out.println("^Чухчух-чухчух^");
    }

    protected String getWagonType(){
        return "Coupe\t";
    }

}
