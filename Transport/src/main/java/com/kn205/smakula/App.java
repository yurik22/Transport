package com.kn205.smakula;

import com.kn205.smakula.controller.Train;
import com.kn205.smakula.menu.MainMenu;

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




        while(true){
            System.out.println("\nInput your command (type 'help' to see available commands)");
            menu.execute(new Scanner(System.in).next());
        }


    }

    public static int add(int a, int b){
        return a+b;
    }



}
