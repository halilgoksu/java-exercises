package OOP2;

import java.util.Scanner;

public class Car {
    //private fields
    private String model;
    private String make;
    private int year;
    Scanner scan=new Scanner(System.in);


    //constructor
    public Car(String make,String model, int year){
        this.year=year;
        this.make=make;
        this.model=model;


    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        //year cannot <1900 or more than 2022
        while (year<1900 || year>2022){
            System.out.println("Please enter valid year");
            year=scan.nextInt();
        }
        this.year = year;
    }
    public void quitScanner(){
        scan.close();
    }

    public String toString(){
        return  make + " "+ model+ " "+ Integer.toString(year);
    }


}
