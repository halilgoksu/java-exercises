//Heron's Formula
//Write an app that read the lengths of the sides of a triangle form the user.
//Compute the area of the triangle using Heron's formula in which 's' represents
//half of the perimeter of the triangle, and 'a' and 'b' and 'c' are the lengths of
//the three sides. Print area ti tree decimal places.



package TriangleCal;

import java.util.Scanner;
import java.text.DecimalFormat;
public class TriangleMain {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        DecimalFormat decForm=new DecimalFormat("0.###");

        int a,b,c; //sides
        double s;//half perimeter
        double area;
        System.out.println("Please enter the sides if the triangle: ");
        a=scan.nextInt();
        b=scan.nextInt();
        c=scan.nextInt();
        scan.close();

        s= ((a+b+c) /2.00);
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of the triangle using Heron's formula is: "+decForm.format(area));

    }
}
