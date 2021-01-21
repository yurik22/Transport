package com.kn205.smakula.controller;

import com.kn205.smakula.model.CouchetteWagon;
import com.kn205.smakula.model.CoupeWagon;
import com.kn205.smakula.model.LuxeWagon;
import org.junit.Test;

import static org.junit.Assert.*;

public class WagonComfortComparatorTest {

    @Test
    public void compare() {
        WagonComfortComparator comp = new WagonComfortComparator();

        int expected = 40;
        int actual = comp.compare(new CoupeWagon(15,16,78), new CouchetteWagon(16,48,52));

        assertEquals(expected, actual);
    }

    @Test
    public void compare2() {
        WagonComfortComparator comp = new WagonComfortComparator();

        int expected = 50;
        int actual = comp.compare(new LuxeWagon(16,48,52),new CoupeWagon(15,16,78));

        assertEquals(expected, actual);
    }
}