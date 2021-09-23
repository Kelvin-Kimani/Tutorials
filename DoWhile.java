import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String exit = "";

        do {
            System.out.println("Let's get started!\nType a letter an lets see its category");
            char c = scanner.next().toLowerCase().charAt(0);
            String output = "";

            switch (c){
                case 'a':
                    System.out.println("That's a vowel");
                    break;

                case 'e':
                    System.out.println("That's a vowel");
                    break;

                case 'i':
                    System.out.println("That's a vowel");
                    break;

                case 'o':
                    System.out.println("That's a vowel");
                    break;

                case 'u':
                    System.out.println("That's a vowel");
                    break;

                default:
                    System.out.println("That's a consonant");
                    break;
            }

            System.out.println("\nWanna try this again?\nInput \"yes\" or \"no\".");

           exit = scanner.next().toLowerCase();

           if (exit.equals("no")) System.out.println("See you again friend! :(");

        }while (!exit.equals("no"));
    }
}
