package cubes;
import java.util.Scanner;
import java.util.Scanner;

//Write a program that print the sum of cubes.
//Prompt for and read two integer values and print the sum
//of each value raised to the third power


public class CubesMain {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        int num1=0;
        int num2=0;
        double cube=0;

        System.out.println("Please enter first number: ");
        num1=scan.nextInt();


        System.out.println("Please enter second number: ");
        num2=scan.nextInt();


        cube=Math.pow(num1,3)+Math.pow(num2,3);

        System.out.println("Cube of "+num1+ " and "+ num2+ " = "+ cube);

    }
}
