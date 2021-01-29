package com.kn205.smakula.menu;

import org.apache.log4j.Logger;

import java.io.*;

import static com.kn205.smakula.App.train;


public class WriteToFileCommand implements MenuItem {

    private final Logger log = Logger.getLogger(WriteToFileCommand.class);

    @Override
    public void execute() {


        try{
            OutputStream object = new FileOutputStream("D:\\Transport_logs\\init2.txt");
            ObjectOutputStream out = new ObjectOutputStream(object);
            out.writeObject(train);
        } catch (Exception e) {
            log.error(e.getMessage());
            e.printStackTrace();
        }







    }
}
