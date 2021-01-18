package com.kn205.smakula.controller;

import com.kn205.smakula.model.*;

import java.util.ArrayList;
import java.util.List;

public class Train implements movable{

    private Locomotive locomotive = new Locomotive(1000, 140, 5);
    private List<Wagon> wagons = new ArrayList<>();
    private static int numOfPassengers = 0;
    private static int numOfLuggage = 0;

    public void addWagon(Wagon wagon){
        wagons.add(wagon);
        numOfPassengers += wagon.getAmountOfPassengers();
        numOfLuggage += wagon.getLuggage();
    }

    public boolean delWagon(int id){
        for(int i = 0; i < wagons.size(); i++){
            if (wagons.get(i).getID() == id){
                numOfPassengers -= wagons.get(i).getAmountOfPassengers();
                numOfLuggage -= wagons.get(i).getLuggage();
                wagons.remove(i);
                return true;
            }
        }
        return false;
    }

//    public boolean delWagon(int id){
//        for(Wagon wagon : wagons){
//            if (wagon.getID() == id){
//                numOfPassengers -= wagon.getAmountOfPassengers();
//                numOfLuggage -= wagon.getLuggage();
//                wagons.remove(wagon);
//                return true;
//            }
//        }
//        return false;
//    }


    public void sortWagons(){   // TODO: 18.01.2021 sort this shit

    }

    public void showTrain(){
        System.out.println(locomotive.toString());
        for(Wagon wagon : wagons){
            System.out.println(wagon.toString());
        }
    }

    @Override
    public void move() {
        locomotive.move();
        for(Wagon wagon : wagons){
            wagon.move();
        }
    }
}
