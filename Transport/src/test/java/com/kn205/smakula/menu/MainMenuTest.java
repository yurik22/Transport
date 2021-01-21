package com.kn205.smakula.menu;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainMenuTest {

        MainMenu m = new MainMenu();


    @Test
    public void executeHelp() {
        m.execute("help");
    }

    @Test
    public void executeMove() {
        m.execute("move");
    }

    @Test
    public void executeSort() {
        m.execute("sort");
    }

    @Test
    public void executeShow() {
        m.execute("show");
    }

    @Test
    public void executePassengers() {
        m.execute("passengers");
    }

    @Test
    public void executeLuggage() {
        m.execute("luggage");
    }

    @Test
    public void executeSomeShit() {
        m.execute("some shit");
    }



}