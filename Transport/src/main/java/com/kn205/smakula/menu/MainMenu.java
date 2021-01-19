package com.kn205.smakula.menu;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.util.LinkedHashMap;
import java.util.Map;

public class MainMenu {

    //  private static final Logger log = Logger.getLogger(OrderLogic.class);

    //String log4jConfPath = "D:\\java_projects\\Transport\\Transport\\src\\main\\java\\resources/log4j.properties";
    // PropertyConfigurator.configure(log4jConfPath);
    public static final Logger log = Logger.getLogger(MainMenu.class);


    Map<String, MenuItem> items;

    public MainMenu() {

        log.info("Menu created");
        items = new LinkedHashMap<>();

        items.put("help", new HelpCommand());
        items.put("add", new AddWagonCommand());
        items.put("del", new DelWagonCommand());
        items.put("move", new MoveTrainCommand());
        items.put("luggage", new getAmountOfLuggageCommand());
        items.put("passengers", new getAmountOfPassengersCommand());
        items.put("sort", new sortWagonsByComfortIndexCommand());
        items.put("interval", new getWagonsByIntervalOfPassengersAmountCommand());
        items.put("show", new ShowTrainCommand());
        items.put("exit", new ExitCommand());
    }

    public void execute(String command) {

        if (items.containsKey(command)) {
            log.info("Executing command: " + command);
            items.get(command).execute();
        } else {
            log.error("Undefined command: " + command);
            System.out.println("Undefined command!");
        }
    }


}
