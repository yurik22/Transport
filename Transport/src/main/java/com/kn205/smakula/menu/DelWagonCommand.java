package com.kn205.smakula.menu;

import com.kn205.smakula.model.CouchetteWagon;
import com.kn205.smakula.model.CoupeWagon;
import com.kn205.smakula.model.LuxeWagon;

import java.util.Scanner;

import static com.kn205.smakula.App.train;

public class DelWagonCommand implements MenuItem {
    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter wagon ID to delete: ");
        int ID = scan.nextInt();


        if (train.delWagon(ID)) {
            System.out.println("Wagon " + ID + " deleted");
        } else {
            System.out.println("There is no wagon with ID " + ID);
        }


    }
}
