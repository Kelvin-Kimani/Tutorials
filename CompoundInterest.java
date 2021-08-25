import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;


public class CompoundInterest {
    public static void main(String[] args) {

        System.out.println("\nHey, let's calculate your compound interest. We compounded annually, semiannually, quarterly, and monthly.");

        //Instantiate Object of class Scanner.
        Scanner scan = new Scanner(System.in);

        String rerun = "";
        do{

            //Prompt for principal amount
            System.out.println("What's the principal amount?");
            double principal = scan.nextDouble();

            if (principal == 0){
                System.out.println("Amount can't be zero!");
            }

            else {

                //Prompt for interest rate
                System.out.println("Enter the interest rate");
                double interestRate = scan.nextDouble();

                if (interestRate == 0){
                    System.out.println("Interest rate can't be zero!");
                }

                else {

                    //Prompt for investing time
                    System.out.println("How long do you want to invest(years)?");
                    int time = scan.nextInt();

                    if (time == 0){
                        System.out.println("Can't invest zero years.");
                    }
                    else {

                        System.out.println(
                                "Which compound option do you want? \n Choose 1, 2, 3, 4." +
                                        "\n 1: Annually" +
                                        "\n 2: Semiannually" +
                                        "\n 3: Quarterly" +
                                        "\n 4: Monthly");

                        int noOfTimesCompounded = scan.nextInt();

                        if (noOfTimesCompounded>4){
                            System.out.println("Wrong input");
                        }
                        else if (noOfTimesCompounded == 4){
                            double interest = principal * Math.pow(1+(interestRate/12), time*12) - principal;
                            System.out.println("Investing an original Ksh" + principal + " at " + interestRate + " % rate compounded monthly, after "+ time + " years, the compound interest would be Ksh" + interest + ".");
                        }
                        else {

                            double total = principal * Math.pow(1+(interestRate/noOfTimesCompounded), time*noOfTimesCompounded);

                            double interest = total - principal;

                            System.out.println("Total amount is Ksh" +total);

                            if (noOfTimesCompounded == 1){
                                System.out.println("Investing an original Ksh" + principal + " at " + interestRate + " % rate compounded annually, after "+ time + " years, the compound interest would be Ksh" + interest + ".");
                            }
                            else if (noOfTimesCompounded == 2){
                                System.out.println("Investing an original Ksh" + principal + " at " + interestRate + " % rate compounded semiannually, after "+ time + " years, the compound interest would be Ksh" + interest + ".");
                            }
                            else if (noOfTimesCompounded == 3){
                                System.out.println("Investing an original Ksh" + principal + " at " + interestRate + " % rate compounded quarterly, after "+ time + " years, the compound interest would be Ksh" + interest + ".");
                            }
                        }
                    }
                }
            }

            System.out.println("Want to recalculate? Please enter \"yes\" or \"no\".");
            rerun = scan.next().toLowerCase(Locale.ROOT);

            if (rerun.equals("no")) {System.out.println("Good bye!");}
            else if (!rerun.equals("yes")){
                System.out.println("Follow instructions please!");
                break;
            }

//            scan.close();
        }
        while (!rerun.equals("no"));
    }
}
