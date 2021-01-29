package com.kn205.smakula.menu;

import com.kn205.smakula.controller.Train;
import org.apache.log4j.Logger;

import java.io.*;

import static com.kn205.smakula.App.train;


public class ReadFromFileCommand implements MenuItem {

    private final Logger log = Logger.getLogger(ReadFromFileCommand.class);

    @Override
    public void execute() {


//        try{
//            OutputStream object = new FileOutputStream("D:\\Transport_logs\\init2.txt");
//            ObjectOutputStream out = new ObjectOutputStream(object);
//            out.writeObject(train);
//        } catch (Exception e) {
//            log.error(e.getMessage());
//            e.printStackTrace();
//        }

        try {

            FileInputStream fileIn = new FileInputStream("D:\\\\Transport_logs\\\\init2.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            train = (Train)objectIn.readObject();

            System.out.println("The Object has been read from the file");
            objectIn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        





    }
}
