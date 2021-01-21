package com.kn205.smakula.menu;

import com.kn205.smakula.model.CouchetteWagon;
import com.kn205.smakula.model.CoupeWagon;
import com.kn205.smakula.model.LuxeWagon;
import org.apache.log4j.Logger;

import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;
import static com.kn205.smakula.App.train;


public class ReadFromFileCommand implements MenuItem {

    private final Logger log = Logger.getLogger(ReadFromFileCommand.class);

    @Override
    public void execute() {

        int type = 0;
        int ID = 0;
        int passengers = 0;
        int leggage = 0;

        try {
            File file = new File("D:\\Transport_logs\\init.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                String temp = "";
                type = (int)data.toCharArray()[0] - 48;
                for(int i = 0; i < data.toCharArray().length; i++){
                    int probil = 0;

                    if(data.toCharArray()[i] == ' ' && probil == 0){
                        temp = "";
                        for(int j = i+1; j < data.toCharArray().length; j++){
                            if(data.toCharArray()[j] == ' '){
                                i = j;
                                break;
                            }
                            temp += data.toCharArray()[j];

                        }
                        ID = Integer.parseInt(temp);
                        probil++;

                    }


                    if(data.toCharArray()[i] == ' ' && probil == 1){ // passengers
                        temp = "";
                        for(int j = i+1; j < data.toCharArray().length; j++){
                            if(data.toCharArray()[j] == ' '){
                                i = j;
                                break;
                            }
                            temp += data.toCharArray()[j];

                        }
                        passengers = Integer.parseInt(temp);
                        probil++;
                    }

                    if(data.toCharArray()[i] == ' ' && probil == 2){
                        temp = "";
                        for(int j = i+1; j < data.toCharArray().length; j++){
                            if(data.toCharArray()[j] == ' '){
                                i = j;
                                break;
                            }
                            temp += data.toCharArray()[j];

                        }
                        leggage = Integer.parseInt(temp);
                        probil++;
                    }




                }

                switch (type){
                    case 1:
                        train.addWagon(new CouchetteWagon(ID, passengers,leggage));
                        break;

                    case 2:
                        train.addWagon(new CoupeWagon(ID, passengers, leggage));
                        break;

                    case 3:
                        train.addWagon(new LuxeWagon(ID, passengers, leggage));
                        break;
                }

//                System.out.println(data);
            }   // this shit rly works...

            myReader.close();

        } catch (FileNotFoundException e) {
            log.error("FileNotFoundException");
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

}
