package com.kn205.smakula.menu;

import static com.kn205.smakula.menu.MainMenu.log;

public class HelpCommand implements com.kn205.smakula.menu.MenuItem {
    @Override
    public void execute() {

        System.out.println("Available commands: ");
        System.out.println("read - initialize from file");
        System.out.println("add - add new wagon");
        System.out.println("del - del existing wagon");
        System.out.println("move - move train");
        System.out.println("luggage - show amount of luggage in train");
        System.out.println("passengers - show amount of passengers in train");
        System.out.println("sort - sort wagons by comfort");
        System.out.println("interval - show wagons by interval of passengers amount");
        System.out.println("show - show train");
        System.out.println("exit");
        System.out.println();






    }
}
