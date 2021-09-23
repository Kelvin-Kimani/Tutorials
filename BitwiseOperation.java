/**
 *
 * @author Kimani
 *
 */
public class BitwiseOperation {
    public static void main(String[] args) {

        int a = 20; //In binary 0001 0100
        byte c = -5; // In binary 1000 0101
        int b = 15; //In binary 0000 1111
        int result;

        // & operator
        result = a & b;
        System.out.println("a & b is: " + result);

        // | operator
        result = a | b;
        System.out.println("a | b is: " + result);

        // ^ operator
        result = a ^ b;
        System.out.println("a ^ b is: " + result);

        // ~ operator
        result = ~ a;
        System.out.println("The compliment (~) of a is: " + result);

        // ~ operator
        result = ~ b;
        System.out.println("The compliment (~) of b is: " + result);

        // ~ operator
        result = ~ c;
        System.out.println("The compliment (~) of c is: " + result);

        // Left shift (<<) operator
        result = a << 2;
        System.out.println("The result of shifting a to the left by 2 is: " + result);

        // Right shift (<<) operator
        result = b >> 3;
        System.out.println("The result of shifting b to the right by 3 is: " + result);

    }
}
