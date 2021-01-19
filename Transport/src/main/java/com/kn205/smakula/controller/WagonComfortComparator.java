package com.kn205.smakula.controller;

import com.kn205.smakula.model.Wagon;

import java.util.Comparator;

public class WagonComfortComparator implements Comparator<Wagon> {
    @Override
    public int compare(Wagon o1, Wagon o2) {
        return o1.getComfortIndex() - o2.getComfortIndex();
    }
}
