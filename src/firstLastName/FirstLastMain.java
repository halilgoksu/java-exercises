
//Write a program that prompts for and reads the user's first and last name(separately).
//Then print a string composed of the first letter of the user's first name, followed by
//the first five characters of the user's last name, followed by a random number
//in the range 10 to 99. Assume the last name is at least five letters long.

package firstLastName;
import  java.util.Scanner;
import java.util.Random;

public class FirstLastMain {
    public static void main(String[] args) {


        String firstName, lastName, finalName;
        Random rand =new Random();
        Scanner scam=new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        firstName=scam.next();
        System.out.println("Please enter your last name: ");
        lastName=scam.next();

        while (lastName.length()<5){
            System.out.println("Last name must be at leest 5 characters long. Try again: ");
            lastName=scam.next();
        }

        scam.close();
        finalName=firstName.substring(0,1);
        finalName+=lastName.substring(0,5);
        finalName +=rand.nextInt(99)+10;
        System.out.println(finalName);

    }
}
