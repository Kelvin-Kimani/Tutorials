import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Write something that you want printed: ");

        String yourStuff = myScanner.nextLine();

        System.out.println("Enter your age: ");

        int age = myScanner.nextInt();

        myScanner.close();

        System.out.println("You typed: " + yourStuff + " you " + age + " year old!");

        myAddition(5, 10);

    }

    public static void myAddition(int a, int b){
        int c = a+b;
        System.out.println("Ooow I was to forgot your addition method.");
        System.out.println("Here it is: "+ c);
    }


}
