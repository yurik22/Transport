package com.kn205.smakula.menu;

import static com.kn205.smakula.App.train;

public class getAmountOfPassengersCommand implements MenuItem {
    @Override
    public void execute() {
        System.out.println("Кількість пасажирів у поїзді: "+train.getNumOfPassengers());
    }
}
