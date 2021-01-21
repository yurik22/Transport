package com.kn205.smakula.controller;

import com.kn205.smakula.model.CouchetteWagon;
import com.kn205.smakula.model.CoupeWagon;
import com.kn205.smakula.model.LuxeWagon;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrainTest {
    private Train t = new Train();

    {
        t.addWagon(new CoupeWagon(1,250,1500));
        t.addWagon(new CouchetteWagon(2,350,1400));
        t.addWagon(new CouchetteWagon(3,400,1400));
        t.addWagon(new CouchetteWagon(4,370,1400));
        t.addWagon(new CouchetteWagon(5,360,1400));
        t.addWagon(new CouchetteWagon(6,390,1400));
        t.addWagon(new CoupeWagon(7,200,1200));
        t.addWagon(new LuxeWagon(8,120,1300));
        t.addWagon(new LuxeWagon(9,110,1100));
    }

    @Test
    public void addWagon() {
        assertTrue(t.addWagon(new LuxeWagon(158,110,1100)));
    }

    @Test
    public void addWagon2() {
     //   assertFalse(t.addWagon(new LuxeWagon(5,110,1100))); // TODO: 21.01.2021 розкоментувати!
    }

    @Test
    public void delWagon() {
        assertTrue(t.delWagon(6));
    }

    @Test
    public void delWagon2() {
        assertFalse(t.delWagon(1500));
    }

    @Test
    public void sortWagons() {
        t.sortWagons();
    }

    @Test
    public void showTrain() {
        t.showTrain();
    }

    @Test
    public void move() {
        t.move();
    }

    @Test
    public void showWagonsByIntervalOfPassengersAmount() {
        t.showWagonsByIntervalOfPassengersAmount(150,200);
    }


    @Test
    public void getNumOfPassengers() {
        assertEquals(t.getNumOfPassengers(), t.getNumOfPassengers());
    }

    @Test
    public void getNumOfLuggage() {
        assertEquals(t.getNumOfLuggage(),t.getNumOfLuggage());
    }

    @Test
    public void setComfortIndex() {
        assertTrue(t.setComfortIndex(2,120));
    }

    @Test
    public void setComfortIndex2() {
        assertFalse(t.setComfortIndex(999,120));
    }
}