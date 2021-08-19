import java.util.Scanner;

public class GravityCalculator {


    public static void main(String[] args) {

        String basicText = "";
        //For user input
        Scanner scan = new Scanner(System.in);

        //Declare the initial values
        double earthGravity = -9.81;
        double fallingTime = 10;
        double initialVelocity = 0;
        double initialPosition = 0;
        double finalPosition = 0;

        do {

            System.out.println("Earth's Gravity force is -9.81");

            System.out.println("Initial position is: " +initialPosition + " ."
                    + "Input \"pos\" to change it. ");
            System.out.println("Initial velocity is: " +initialVelocity + " ."
                    + "Input \"vel\" to change it. ");
            System.out.println("Initial falling time is: " +fallingTime + " ."
                    + "Input \"time\" to change it. ");

            finalPosition = 0.5*earthGravity*fallingTime*fallingTime+initialVelocity*fallingTime+initialPosition;

            System.out.println("The final position after " + fallingTime + " is "
            + finalPosition + " ms.");

            System.out.println("Input \"quit\" to exit application");

            //input what you want to change
            basicText = scan.next();

            if ("pos".equals(basicText)){
                System.out.println("Enter new position: ");

                while (!scan.hasNextDouble())

                //get next complete token from scanner
                scan.next();
                initialPosition = scan.nextDouble();
            }

            else if ("vel".equals(basicText)){

                System.out.println("Enter new velocity: ");

                while (!scan.hasNextDouble())

                //get next complete token from scanner
                scan.next();
                initialVelocity = scan.nextDouble();


            }

            else if ("time".equals(basicText)){

                System.out.println("Enter new time: ");

                while (!scan.hasNextDouble())

                //get next complete token from scanner
                scan.next();
                fallingTime = scan.nextDouble();

            }

            else if ("quit".equals(basicText)){

                System.out.println("\b");

            }

        }
        while (!("quit").equals(basicText));
    }
}
