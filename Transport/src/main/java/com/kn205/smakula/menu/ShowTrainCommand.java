package com.kn205.smakula.menu;

import static com.kn205.smakula.App.train;

public class ShowTrainCommand implements com.kn205.smakula.menu.MenuItem {
    @Override
    public void execute() {
        train.showTrain();
    }
}
