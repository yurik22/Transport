package com.kn205.smakula.menu;

public class ExitCommand implements com.kn205.smakula.menu.MenuItem {
    @Override
    public void execute() {
        System.exit(0);
    }
}
