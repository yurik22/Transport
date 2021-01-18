package com.kn205.smakula.menu;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainMenu {

    Map<String, MenuItem> items;

    public MainMenu(){
        items = new LinkedHashMap<>();

        items.put("help", new HelpCommand());
        items.put("create", new CreateTrainCommand());
        items.put("add", new AddWagonCommand());
        items.put("del", new DelWagonCommand());
        items.put("luggage", new getAmountOfLuggageCommand());
        items.put("passengers", new getAmountOfPassengersCommand());
        items.put("sort", new sortWagonsByComfortIndexCommand());
        items.put("interval", new getWagonsByIntervalOfPassengersAmountCommand());
        items.put("exit", new ExitCommand());
        items.put("show", new ShowTrainCommand());
    }

    public void execute(String command){
        if(items.containsKey(command)) {
            items.get(command).execute();
        }
    }

}
