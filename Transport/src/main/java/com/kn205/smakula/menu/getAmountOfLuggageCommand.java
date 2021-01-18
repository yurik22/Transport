package com.kn205.smakula.menu;

import static com.kn205.smakula.App.train;

public class getAmountOfLuggageCommand implements com.kn205.smakula.menu.MenuItem {
    @Override
    public void execute() {
        System.out.println("Кількість багажу у поїзді: "+train.getNumOfLuggage());
    }
}
