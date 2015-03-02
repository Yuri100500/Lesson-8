package com.mentoring.epam.test.lesson8.model;

/**
 * Created by Iurii_Galias on 3/2/15.
 */
public class Cars {
    private int id;
    private String carName;
    private String ownerName;
    private int mileage;
    private int price;

    public Cars(){}

    public Cars(int id, String carName, String ownerName, int mileage,int price ){
        super();
        this.id = id;
        this.carName = carName;
        this.ownerName = ownerName;
        this.mileage = mileage;
        this.price = price;
    }

    public String toString(){
        return "About car\n" +
                "ID: " + getId()+ "\n"+
                "Car name: " + getCarName() + "\n" +
                "Car owner: " + getOwnerName() + "\n" +
                "Mileage: " + getMileage() + "\n" +
                "Price: " + getPrice() + "\n";
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getCarName(){
        return carName;
    }

    public void setCarName(String carName){
        this.carName = carName;
    }

    public String getOwnerName(){
        return  ownerName;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public int getMileage(){
        return mileage;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }
}
