package com.kn205.smakula.menu;

import java.util.Scanner;

import static com.kn205.smakula.App.train;

public class setComfortIndexCommand implements MenuItem {
    @Override
    public void execute() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter ID of wagon to change comfort index: ");
        int ID = scan.nextInt();
        System.out.println("Enter new comfort index: ");
        int cIndex = scan.nextInt();

        train.setComfortIndex(ID, cIndex);

    }
}
