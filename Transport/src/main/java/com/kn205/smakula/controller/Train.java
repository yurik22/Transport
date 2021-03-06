package com.kn205.smakula.controller;

import com.kn205.smakula.model.*;
import org.apache.log4j.Logger;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Train implements movable, Serializable {

    private Locomotive locomotive = new Locomotive(1000, 140, 5);
    private List<Wagon> wagons = new ArrayList<>();
    private int numOfPassengers = 0;
    private int numOfLuggage = 0;



    private static transient Logger log = Logger.getLogger(Train.class);

//    static{
//        log = Logger.getLogger(Train.class);
//    }

    public int getNumOfPassengers() {
        return numOfPassengers;
    }

    public int getNumOfLuggage() {
        return numOfLuggage;
    }

    public boolean addWagon(Wagon wagon) {
        boolean res = true;

        for (Wagon w : wagons) {
            if (w.getID() == wagon.getID()) {

                log.error("ID duplicating: " + wagon.getID());
                try {
                    GoogleMail.Send("kn.205.transport",
                            "123456Yurii",
                            "yurii.smakula.knm.2019@lpnu.ua",
                            "Transport ERROR!",
                            "ID duplicating: " + wagon.getID()+"\n first wagon - "
                                    + w.toString()+"\n second wagon - "+wagon.toString());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                res = false;
            }
        }
        wagons.add(wagon);
        numOfPassengers += wagon.getAmountOfPassengers();
        numOfLuggage += wagon.getLuggage();
        log.info("Wagon added: \t " + wagon.toString());
        return res;
    }

//    public boolean delWagon(int id){
//        for(int i = 0; i < wagons.size(); i++){
//            if (wagons.get(i).getID() == id){
//                numOfPassengers -= wagons.get(i).getAmountOfPassengers();
//                numOfLuggage -= wagons.get(i).getLuggage();
//                wagons.remove(i);
//
//                log.info("Wagon " + id + " deleted");
//                return true;
//            }
//        }
//        log.error("Tried to delete wagon with id " + id);
//        return false;
//    }

    public boolean delWagon(int id) {
        for (Wagon wagon : wagons) {
            if (wagon.getID() == id) {
                numOfPassengers -= wagon.getAmountOfPassengers();
                numOfLuggage -= wagon.getLuggage();
                wagons.remove(wagon);
                return true;
            }
        }
        return false;
    }

    // TODO: 18.01.2021 sort this shit
    public void sortWagons() {
        wagons.sort(new WagonComfortComparator());
    }

    public void showWagonsByIntervalOfPassengersAmount(int min, int max) {
        for (Wagon w : wagons) {
            int amountOfPassengers = w.getAmountOfPassengers();
            if (amountOfPassengers >= min && amountOfPassengers <= max) {
                System.out.println(w.toString());
            }
        }
    }

    public void showTrain() {
        System.out.println(locomotive.toString());
        for (Wagon wagon : wagons) {
            System.out.println(wagon.toString());
        }
    }

    public boolean setComfortIndex(int ID, int cIndex) {
        for(Wagon w : wagons){
            if(w.getID() == ID){
                w.setComfortIndex(cIndex);
                log.info("New comfort index: "+w.toString());
                return true;
            }
        }
        log.error("setComfortIndex to non-existing wagon (ID "+ID+")");
        return false;
    }

    @Override
    public void move() {
        locomotive.move();
        List<Integer> wagonsToDelete = new ArrayList<>();
        for (Wagon wagon : wagons) {
            wagon.move();
            if(wagon.getComfortIndex() <= 0){
                wagonsToDelete.add(wagon.getID());
            }
        }



        for(Integer ID : wagonsToDelete) {
            delWagon(ID);
        }
  //      wagons.removeIf(wagon -> wagon.getComfortIndex() <= 0);

    }




}
