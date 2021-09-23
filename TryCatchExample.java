public class TryCatchExample {
    public static void main(String[] args) {
        try {
            int i = 50/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
            System.out.println("Let's try something else");

            try {

                int [] arrayNo = {1,2,4};
                System.out.println(arrayNo[3]);

            }

            catch (ArrayIndexOutOfBoundsException exception){
                System.out.println(e);
            }
        }
        System.out.println("Let's see if we have continued!");
    }
}
