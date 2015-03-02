package com.mentoring.epam.test.lesson8.datareaders;

import com.mentoring.epam.test.lesson8.model.Cars;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Iurii_Galias on 3/2/15.
 */
public class TxtFileReader extends AbstractReader {

    private String fullPath;

    public TxtFileReader(String fullPath){
        super();
        this.fullPath =fullPath;
    }

    @Override
    public Cars readInfo(int id){
        File f = new File(getFullPath());
        BufferedReader br = null;
        String str = null;
        Cars cars = null;
        try {
            br = new BufferedReader(new FileReader(f));

            while ((str = br.readLine())!=null){
                String[] info = str.split(":");
                if (Integer.parseInt(info[0])== id){
                    cars = new Cars(Integer.parseInt(info[0]), info[1], info[2], Integer.parseInt(info[3]), Integer.parseInt(info[4]));
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (br!=null){
                    br.close();
                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        return cars;
    }

    public String getFullPath(){
        return fullPath;
    }

    public  void setFullPath(String fullPath){
        this.fullPath = fullPath;
    }
}
