package TowerOfHonai;

import java.util.Scanner;

public class TowerOfHonai {
    static int counter=0;
    public static void main(String[] args) {
        int discs=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number of discs: ");
        discs=Integer.parseInt(scanner.nextLine());
        Tower(discs,1,3,2);




    }
    static void Tower(int n,int sourcePeg,int destinationPeg,int sparePeg){
        if (n==1){
            System.out.println(            counter+" "+
            sourcePeg+ "--->"+ destinationPeg);
            counter++;

        }else {
            Tower(n-1,sourcePeg,sparePeg,destinationPeg);
            System.out.println(counter+" "+sourcePeg+ "--->"+ destinationPeg);
            Tower(n-1,sparePeg,destinationPeg,sourcePeg);
            counter++;



        }

    }
}
