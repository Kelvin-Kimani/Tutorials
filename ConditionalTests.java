import java.util.Scanner;

/**
 *
 * @author Kimani
 *
 */

public class ConditionalTests {
    public static void main(String[] args) {
        //if, if - else, if - else-if- else, Nested ifs

        //Instantiate Scanner
        Scanner scan = new Scanner(System.in);

        System.out.println("Please fill in the details below: ");
        System.out.println("How old are you? ");

        int age = scan.nextInt();

        do{
            //if
            if ( age >= 20 ){
                System.out.println("Good! You are eligible for the spot");

            }
            else{
                System.out.println("Unfortunately, we can't be able to take you in.");
                break;
            }

            System.out.println("We are looking for two slots. Fill in \"Java\" or \"Python\" for slot applying to: ");

            while (!scan.hasNext());
            String whichLanguageGuy = scan.next();


            // if, else-if, else

            if (whichLanguageGuy.equals("Java")){
                System.out.println("You would be good for our program as we use spring boot. We will be in contact");
                break;
            }
            else if (whichLanguageGuy.equals("Python")) {
                System.out.println("You'd be good in Machine Learning a lot my friend! \nUnfortunately, we don't offer that here!");
                break;
            }
            else if (!whichLanguageGuy.equals("Java") && !whichLanguageGuy.equals("Python")){
                System.out.println("Please type correctly.");
            }
        }
        while (age >= 20);

























//        //if
//        if (age > 20) System.out.println("You're not a teenager no more!");
//
//        //if - else
//        System.out.println((age > 20) ? "Man up!" : "Still a baby");
//
//        //if - else-if - else
//        if (age > 20 ) System.out.println("You're not a teenager no more!");
//        else if (age == 20 ) System.out.println("Just the right age for us!");
//        else System.out.println("Get out of here, kid!");

        //Nested if(if,if) - else
//        if (age == 20){
//            if (javaGuy.contains("Java") && pyGuy.contains("Java")){
//                System.out.println("You would be good for our program as we use spring boot");
//            }
//            if (javaGuy.contains("Python") && pyGuy.contains("Python")){
//                System.out.println("You'd be good in Machine Learning a lot my friend!");
//            }
//        }
    }
}