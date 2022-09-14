//Display integers from 1 to 100
//but every integer divisible by 3 should display word "Fizz";
//and every integer divisible by 5 should display word "Buzz";
// divisible by 3 adn 5 will display FizzBuzz

package FizzBuzz;

public class FizzBuzMain {
    public static void main(String[] args) {
        System.out.println("For Loop solution ");
        String text;

        for(int i=1;i<100;i++){
            if((i%3==0)&&(i%5==0) ){
                text="FizzBuzz";
            }
            else if(i%3==0){
                text="Fizz";
            } else if (i%5==0) {
                text="Buzz";

            }else
                text=Integer.toHexString(i);
            System.out.println(text);
        }
    }
}
