package com.kn205.smakula.menu;

import com.kn205.smakula.model.CouchetteWagon;
import com.kn205.smakula.model.CoupeWagon;
import com.kn205.smakula.model.LuxeWagon;

import java.util.Scanner;

import static com.kn205.smakula.App.train;

public class MoveTrainCommand implements MenuItem {
    @Override
    public void execute() {
        train.move();
    }
}
