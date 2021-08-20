import java.util.Scanner;

/**
 * @author Kimani
 */

public class OperatorsAssignment {
    public static void main(String[] args) {
        //Instantiate Scanner
        Scanner scan = new Scanner(System.in);

        //Prompt for input from user
        System.out.println("Enter the first number: ");
        int a = scan.nextInt();

        System.out.println("Enter the second number: ");
        int b = scan.nextInt();

        System.out.println("Enter the third number: ");
        int c = scan.nextInt();

        System.out.println("The greatest number is " + findGreatestNumber(a,b,c) + " and the smallest number is " +findSmallestNumber(a,b,c));

        System.out.println("Now enter the numbers you want to add and multiply: ");
        int d = scan.nextInt();
        int e = scan.nextInt();

        System.out.println("Addition of " + d + " and " + e + " is " + addition(d,e) + " and multiplication is " + multiplication(d,e));
    }

    static int findGreatestNumber(int a, int b, int c){

        //Nested Ternary operator
        return (a > b && a > c)? a : (b > a ? (b > c? b: c): 0);
    }

    static int findSmallestNumber(int a, int b, int c){

        //Nested Ternary operator
        return (a < b && a < c) ? a : (b < a ? (b < c ? b : c ): 0);

    }

    static int addition(int a, int b){
        return a+b;
    }

    static int multiplication(int a, int b){
        return a*b;
    }
}
