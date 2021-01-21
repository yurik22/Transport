package com.kn205.smakula.menu;

import java.util.Scanner;

import static com.kn205.smakula.App.train;

public class showWagonsByIntervalOfPassengersAmountCommand implements MenuItem {
    @Override
    public void execute() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter minimal passengers amount: ");
        int min = scan.nextInt();
        System.out.println("Enter maximum passengers amount: ");
        int max = scan.nextInt();

        train.showWagonsByIntervalOfPassengersAmount(min, max);

    }
}
