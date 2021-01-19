package com.kn205.smakula.controller;

import com.kn205.smakula.model.*;

import java.util.ArrayList;
import java.util.List;

import static com.kn205.smakula.menu.MainMenu.log;

public class Train implements movable{

    private Locomotive locomotive = new Locomotive(1000, 140, 5);
    private List<Wagon> wagons = new ArrayList<>();
    private int numOfPassengers = 0;
    private int numOfLuggage = 0;


    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public int getNumOfLuggage() {
        return numOfLuggage;
    }

    public void addWagon(Wagon wagon){
        wagons.add(wagon);
        numOfPassengers += wagon.getAmountOfPassengers();
        numOfLuggage += wagon.getLuggage();
        log.info("Wagon added: \t " + wagon.toString());
    }

    public boolean delWagon(int id){
        for(int i = 0; i < wagons.size(); i++){
            if (wagons.get(i).getID() == id){
                numOfPassengers -= wagons.get(i).getAmountOfPassengers();
                numOfLuggage -= wagons.get(i).getLuggage();
                wagons.remove(i);

                log.info("Wagon " + id + " deleted");
                return true;
            }
        }
        log.error("Tried to delete wagon with id " + id);
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

    // TODO: 18.01.2021 sort this shit
    public void sortWagons(){
        wagons.sort(new WagonComfortComparator());
    }

    public void showWagonsByIntervalOfPassengersAmount(int min, int max){
        for (Wagon w : wagons){
            int amountOfPassengers = w.getAmountOfPassengers();
            if(amountOfPassengers >= min && amountOfPassengers <= max){
                System.out.println(w.toString());
            }
        }
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
