package Factorial;

import java.util.Scanner;

public class FactorMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the nth value as integer: ");
        int n= Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("Loop calculation: Factorial of "+n+ " is "+CalculateLoop(n));

    }

    private static int CalculateLoop(int n){
        int factorial=1;
        for(int i =n ;i>=1;i--){
            factorial *=i;
        }

        return factorial;

    }







}
