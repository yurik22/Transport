package com.kn205.smakula.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class LocomotiveTest {

    Locomotive locomotive = new Locomotive(10,20,30);

    @Test
    public void testToString() {
        assertEquals(locomotive.toString(), locomotive.toString());
    }

    @Test
    public void getPower() {
        assertEquals(10, locomotive.getPower());
    }

    @Test
    public void getMaxSpeed() {
        assertEquals(20, locomotive.getMaxSpeed());
    }

    @Test
    public void getFuelConsumption() {
        assertEquals(30, locomotive.getFuelConsumption(),0.5);
    }

    @Test
    public void move() {
        locomotive.move();
    }
}