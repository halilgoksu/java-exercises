// X Y Z = sum 15
// A B C = sum 15
// Q W R = sum 15
//sum =15

//[row][col]

package MagicSquare;

import java.util.Random;

public class MagicMain {

    private  static int[][] numbers={{1,2,3},{4,5,6},{7,8,9}};
    private static Random rand = new Random();

    public static void main(String[] args) {
        int counter=0;
        do {

            counter++;
            System.out.println(counter);
            SwitchCells();
        }while (!IsMagicSquare());
        DisplayBoard();
        System.out.print("It took "+counter + " tries. ");

    }
    private static void DisplayBoard(){
        for(int i=0;i<3;i++){
            for(int c =0;c<3 ;c++){
                System.out.print(numbers[i][c]+ " ");
            }
            System.out.println("");
        }
    }

    private static boolean IsMagicSquare(){
        int tempSum=numbers[0][0]+ numbers[0][1] + numbers[0][2];
        //compare rows;start from row 1 because tempSum already holds the sum for row 0
        //3 it will generate 3 row
        for(int i=1;i<3;i++){
            if (numbers[i][0]+numbers[i][1]+numbers[i][2] != tempSum){
                return false;
            }
        }
        //compare columns
        for(int i=0;i<3;i++){
            if (numbers[0][i]+numbers[1][i]+numbers[2][i] != tempSum){
                return false;
            }
        }
        return numbers[0][0] +numbers[1][1]+ numbers[2][2]==tempSum
                &&numbers[0][2] +numbers[1][1]+ numbers[2][0]==tempSum ;

    }
//it will switch numbers in array
    private static void SwitchCells(){
        int[] number1 = new int[2];
        int[] number2=new int[2];

        number1[0]= rand.nextInt(3);
        number1[1]= rand.nextInt(3);

        number2[0]=rand.nextInt(3);
        number2[1]= rand.nextInt(3);

        int temp =numbers[number1[0]][number1[1]];
        numbers[number1[0]][number1[1]]=numbers[number2[0]][number2[1]];
        numbers[number2[0]][number2[1]]=temp;



    }




}
