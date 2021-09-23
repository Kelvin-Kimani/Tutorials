import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {

        System.out.println("Enter number to get its fibonacci series");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int start = 0;
        int next = 1;

        System.out.println("Fibonacci series of count "+ num + " is ");

        for (int i = 1; i <= num; ++i){
            /*
            x = (x - 1) + (x - 2)
            */

            System.out.print(start + " ");

            int sumofprevtwo = start + next;
            start = next;
            next = sumofprevtwo;
        }
    }
}
