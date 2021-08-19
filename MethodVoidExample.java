import java.util.Scanner;

/**
 * @author Kimani
 */

public class MethodVoidExample {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your cumulative score: ");

        //Requests for user input
        double points = scan.nextDouble();

        //Calls method
        rankingWithMarks(points);
    }

    static void rankingWithMarks(double points){
        if ( points >= 70 && points <= 100 ){
            System.out.println("Rank: First Class Honours!");
        }
        else if (points >= 60 && points < 70){
            System.out.println("Rank: Second Class Honours, Upper Division!");
        }
        else if (points >= 50 && points < 60){
            System.out.println("Rank: Second Class Honours, Lower Division!");
        }
        else if (points >= 40 && points < 50){
            System.out.println("Rank: Pass!");
        }
        else System.out.println("Fail!");
    }
}
