package com.mentoring.epam.test.lesson8.Executor;

import com.mentoring.epam.test.lesson8.datareaders.TxtFileReader;
import com.mentoring.epam.test.lesson8.model.Cars;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

/**
 * Created by Iurii_Galias on 3/2/15.
 */
public class Executor {
    public static final String CAR_INFO_TXT = "car_info.txt";
    public static final String CAR_INFO_CSV = "car_info.csv";
   // public static final String DB_PROP = "MySQL.prop";

    static Properties properties = new Properties();

   /* static {
        try{
            FileInputStream inputStream = new FileInputStream(DB_PROP);
            properties.load(inputStream);
            inputStream.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }*/

    /*static String databaseURL = properties.getProperty("dbURL");
    static String driverName = properties.getProperty("mySQLDriver");
    static String user = properties.getProperty("user");
    static String password = properties.getProperty("password");*/

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean entered = true;
        while(entered){
            System.out.println("1 - Read from txt file\n" +
                               "2 - Read from csv file\n" +
                               "0 - Exit\n");
            int action = sc.nextInt();
            switch (action){
                case 0:
                    entered = false;
                    System.out.println("Goodbye");
                    break;
                case 1:
                    System.out.println("Enter ID: ");
                    int id1 = sc.nextInt();
                    TxtFileReader txtFileReader = new TxtFileReader(CAR_INFO_TXT);
                    try{
                        Cars cars  = txtFileReader.readInfo(id1);
                        System.out.println(cars.toString());
                    }catch (NullPointerException ex){
                        System.out.println("There is no car with  id " +id1);
                    }break;
                case 2:
                    System.out.println("Enter ID: ");
                    int id2 = sc.nextInt();
                    TxtFileReader csvFileReader = new TxtFileReader(CAR_INFO_CSV);
                    try{
                        Cars cars = csvFileReader.readInfo(id2);
                        System.out.println(cars.toString());
                    }catch (NullPointerException ex){
                        System.out.println("There is no car with  id " +id2);
                    }
            }
        }
    }
}
