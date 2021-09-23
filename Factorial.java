import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Enter the number you want to get factorial for");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        /*
        Incremental
         */
//        int result = 1;

//        for (int i = 1; i <= number; i++){
//            result = result * i;
//        }

        /*
        Decremental
         */
        int result = number;
        for (int i = number - 1 ; i > 1; i--){
            result *= i;
        }

        System.out.println("The factorial of " + number + " is " + result);
    }
}
