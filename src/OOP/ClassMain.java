//Design an implement a class called Dog that contains instance data that
//represents the dog's  name and age.
//Define the Dog constructor to accept and initialize instance data.
//Include a method to compute adn return the age of the dog in "person years"(x7).
//Include a toString method that returns a one-line description of the dog.
//Create a driver class called Kennal, whose main method instantiates and updates several Dog objects.


package OOP;


import java.util.Scanner;

public class ClassMain {
    public static void main(String[] args) {
        String name;
        int age=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the dog's name and age: ");
        name=scan.next();
        age=scan.nextInt();
        scan.close();

        Dog dog=new Dog(name,age);
        System.out.println(dog);

        Dog dog1=new Dog("name",24);
        System.out.println(dog1);
        Dog dog2=new Dog("monik",7);
        System.out.println(dog2);


    }
}
