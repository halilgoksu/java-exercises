package Factorial;

import java.util.Scanner;

public class FactorialSecond {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the nth value as integer: ");
        int n= Integer.parseInt(scanner.nextLine());
        scanner.close();
        System.out.println("Loop calculation: Factorial of "+n+ " is "+CalculateRecursion(n));

    }

    private static int CalculateRecursion(int n){
        if(n==1)
        return 1;
        return n * CalculateRecursion(n-1);
    }

}
