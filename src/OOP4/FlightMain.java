//Flight Classes
//Implement a class Flight
//declare instances of airlineName, flight number, flight's origin and destination
//create constructor that initialize all instances
//create getters and setters for each instance
//test the class using FlightTest driver class


package OOP4;

public class FlightMain {

    public static void main(String[] args) {
        Flight flight1,flight2,flight3;

        flight1 =new Flight("Turkish Airlanes","TR102","Turkiye","NewYork");
        flight2 =new Flight("Pegasus","TR102","Greece","Denver");
        flight3 =new Flight("Ukraine","UK200","Kiev","Istanbul");

        System.out.println(flight1);
        System.out.println("");

        System.out.println(flight2);
        System.out.println("");

        System.out.println(flight3);
        System.out.println("");

        flight2.set_origin("Adiyaman");
        System.out.println(flight2);
        System.out.println("");

        System.out.println(flight2.get_origin());


    }

}
