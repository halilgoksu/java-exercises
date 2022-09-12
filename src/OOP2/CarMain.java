
//Design and implement a class called Car that contains instance data that
//represents the make, model, and year of the car.
//Define the Car constructor to initialize these values.
//Include getter adn setter methods for all instance data, adn a toString method
//that returns a one-line description of the car.
//Create a drive class called CarTest whose main method instantiates adn updates several car objects


package OOP2;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean quit =false;
        String toQuit;
        String model,make;
        int year=0;

        //Create empty object
        Car car=new Car(" "," ",10);

        while (!quit){
            System.out.println("Please enter the Car Make,Model and year: ");
            make=scan.next();
            model=scan.next();
            year=scan.nextInt();

            //assigne data to object
            car.setMake(make);
            car.setModel(model);
            car.setYear(year);
            scan.hasNextLine();

            System.out.println("Here's the data you provided: "+car);
            System.out.println("Press 'Q' to quit or any key to continue");
            toQuit=scan.next();

            if(toQuit.equalsIgnoreCase("Q")){
                quit=true;
            }

        }
        scan.close();
        car.quitScanner();
        System.out.println("Good bye");



    }
}
