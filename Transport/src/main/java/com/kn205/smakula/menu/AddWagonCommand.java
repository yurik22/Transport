package com.kn205.smakula.menu;

import com.kn205.smakula.controller.Train;
import com.kn205.smakula.model.CouchetteWagon;
import com.kn205.smakula.model.CoupeWagon;
import com.kn205.smakula.model.LuxeWagon;
import com.kn205.smakula.model.Wagon;

import java.util.Scanner;

import static com.kn205.smakula.App.train;

public class AddWagonCommand implements MenuItem {
    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        int type;
        int ID;
        int passengers;
        int luggage;


        System.out.print("\nEnter new wagon ID: ");
        ID = scan.nextInt();

        System.out.print("Enter new wagon passengers amount: ");
        passengers = scan.nextInt();

        System.out.print("Enter new wagon luggage amount: ");
        luggage = scan.nextInt();

        System.out.println("1 - couchette");
        System.out.println("2 - coupe");
        System.out.println("3 - luxe");
        System.out.println("Enter wagon type: ");

        switch (scan.nextInt()){
            case 1:
                train.addWagon(new CouchetteWagon(ID, passengers, luggage));
                break;
            case 2:
                train.addWagon(new CoupeWagon(ID, passengers, luggage));
                break;
            case 3:
                train.addWagon(new LuxeWagon(ID, passengers, luggage));
                break;
            default:
                System.out.println("Wrong symbol");
        }






    }
}
