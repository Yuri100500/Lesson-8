package com.mentoring.epam.test.lesson8.Executor;

import com.mentoring.epam.test.lesson8.datareaders.TxtFileReader;
import com.mentoring.epam.test.lesson8.model.Cars;

import java.util.Scanner;

/**
 * Created by Iurii_Galias on 3/2/15.
 */
public class Executor {
    public static final String CAR_INFO_TXT = "car_info.txt";

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean entered = true;
        while(entered){
            System.out.println("1 - Read from txt file\n" +
            "0 - Exit");
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
            }
        }
    }
}
