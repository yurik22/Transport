package com.kn205.smakula.menu;

public class HelpCommand implements com.kn205.smakula.menu.MenuItem {
    @Override
    public void execute() {

        System.out.println("Available commands: ");
        System.out.println("create - create train");
        System.out.println("luggage - show amount of luggage in train");
        System.out.println("passengers - show amount of passengers in train");
        System.out.println("sort - sort wagons by comfort");
        System.out.println("interval - show wagons by interval of passengers amount");
        System.out.println("show");
        System.out.println("exit");
        System.out.println();






    }
}
