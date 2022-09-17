package SieveOfEratoshenes;

import java.util.Scanner;

public class Main {
    static  boolean[] allNumbers;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number 'n': ");
        int n=Integer.parseInt(scanner.nextLine());
        scanner.close();
        int arrSize=n+1;
        createArray(arrSize);
        Sieve(arrSize);
    }

    static  void  Sieve(int n){
        for (int i=2;i<n;i++){
            if (allNumbers[i]){
                for (int c=i;i*c<n;c++){
                    allNumbers[i*c]=false;

                }
            }
        }
        int counter=0;
        for (int i=2;i<n;i++){
            if (allNumbers[i]){
                System.out.println(i+ " ");
                counter++;

            }
        }if (counter==10){
            System.out.println("\n");
            counter=0;

        }
    }

    static void createArray(int n){
        allNumbers=new boolean[n];
        for (int i=0;i<n;i++){
            allNumbers[i]=true;

        }
    }
}
