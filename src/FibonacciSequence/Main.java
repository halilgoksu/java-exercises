package FibonacciSequence;

public class Main {
    public static void main(String[] args) {
        System.out.println("Fibonacci loop solution");
        int number1=0;
        int number2=1;
        System.out.println(number1);
        System.out.println(number2);

        for (int i=0;i<=15;i++){
            int next=number1+number2;
            number1=number2;
            number2=next;

            System.out.println(next);

        }

        System.out.println("#######");
        System.out.println("Fibonacci recursive solution with return value");
        for (int i=0;i<=15;i++){
            System.out.println(RecursiveSolution(i));
        }
    }

    private static int RecursiveSolution(int n) {

        if (n <= 1) {
            return 1;


        }
        return RecursiveSolution(n - 2) + RecursiveSolution(n - 1);
    }


}
