//Write an app that generates a random integer in the range of 20
//to 40 inclusive, and displays the sine, cosine, adn tangent of that number


package randomNumber;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random rand= new Random();

        double number;
        number=rand.nextInt(21)+20;
        System.out.println("The number is:  "+number);
        System.out.println("Sin = "+ Math.sin(number));
        System.out.println("Cos = "+Math.cos(number));
        System.out.println("Tan = "+Math.tan(number));



    }
}
