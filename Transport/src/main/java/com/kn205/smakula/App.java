package com.kn205.smakula;

import com.kn205.smakula.controller.Train;
import com.kn205.smakula.menu.MainMenu;
import com.kn205.smakula.model.CouchetteWagon;
import com.kn205.smakula.model.CoupeWagon;
import com.kn205.smakula.model.LuxeWagon;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static Train train = new Train();

    public static void main( String[] args ){
        System.out.println( "Hello World!" );


        MainMenu menu = new MainMenu();

        train.addWagon(new CoupeWagon(1,250,1500));
        train.addWagon(new CouchetteWagon(2,350,1400));
        train.addWagon(new CouchetteWagon(2,400,1400));
        train.addWagon(new CouchetteWagon(2,370,1400));
        train.addWagon(new CouchetteWagon(2,360,1400));
        train.addWagon(new CouchetteWagon(2,390,1400));
        train.addWagon(new CoupeWagon(3,200,1200));
        train.addWagon(new LuxeWagon(4,120,1300));
        train.addWagon(new LuxeWagon(5,110,1100));


        while(true){
            System.out.println("\nInput your command (type 'help' to see available commands)");
            menu.execute(new Scanner(System.in).next());
        }


    }

    public static int add(int a, int b){
        return a+b;
    }



}
