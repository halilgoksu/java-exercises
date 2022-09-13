package QuestionTest;

import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        final int SIZE=20;
        char [] correctAnswer ={'A','C','C','D','B','A','A','C','C','D','B','A','A','C','C','D','B','A','D','B'};
        char singleAnswer=' ';
        char[] incorrectAnswer=new char[SIZE];
        int wrongAnswerCounter=0;
        boolean wrongAnswer;


        for(int i=0;i<SIZE;i++){
            do{
                wrongAnswer=false;
                System.out.println("Please enter your answer to question #"+(i+1)+": ");
                singleAnswer=scan.nextLine().toUpperCase().charAt(0);

                if(singleAnswer != 'A' && singleAnswer !='B' && singleAnswer != 'C'&& singleAnswer!= 'D'){
                    System.out.println("Invalid Input Please re-enter your answer .\n");
                    wrongAnswer=true;

                }
            }while (wrongAnswer);
            if(correctAnswer[i] !=singleAnswer){
                incorrectAnswer[i]=singleAnswer;
                wrongAnswerCounter++;
            }
        }
        scan.close();
        System.out.println(wrongAnswerCounter>=5 ? "Sorry, you have failed. ": "Congratulations, you have passed ");
        System.out.println("You have answered "+ (SIZE-wrongAnswerCounter)+" correctly and "+
        wrongAnswerCounter+" incorrectly. ");

        for(int i=0; i<SIZE;i++){
            if(incorrectAnswer[i] != '\u0000'){
                System.out.println("You answered question #"+(i+1)+" incorrectly. Your answer was "+
                        incorrectAnswer[i] + ". Correct answer is "+ correctAnswer[i]+ ".");
            }

        }

    }
}
