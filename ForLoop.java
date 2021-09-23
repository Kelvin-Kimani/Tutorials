public class ForLoop {
    public static void main(String[] args) {
        //Code for loop
        for (int i = 1; i<=10; i++){
            System.out.print(i + ", ");

        }
        System.out.println();

        //Nested for
        /**
         * Expected output
         *
         * 1
         * 12
         * 123
         * 1234
         * 12345
         * 123456
         * 1234567
         * 12345678
         * 123456789
         * 12345678910
         */
        System.out.println("Next");
        for (int i=1; i<=10;i++){
            //Nested
            for (int y=1; y<i; y++){
                System.out.print(y);
            }
            System.out.println(i);
        }

        /**
         * Expected output
         *
         * 12345678910
         * 123456789
         * 12345678
         * 1234567
         * 123456
         * 12345
         * 1234
         * 123
         * 12
         * 1
         */
        System.out.println("Next");
        for (int i = 10; i >= 1; i--){
            for (int y = 1; y<i; y++){
                System.out.print(y);
            }
            System.out.println(i);
        }

        /**
         * Expected output
         *
         * 10987654321
         * 1098765432
         * 109876543
         * 10987654
         * 1098765
         * 109876
         * 10987
         * 1098
         * 109
         * 10
         */
        System.out.println("Next");
        for (int i = 1; i <= 10; i++){
            for (int y = 10; y>i; y--){
                System.out.print(y);
            }
            System.out.println(i);
        }

        System.out.println("com.datastructure.Arrays.\n");
        //Advanced for loop for arrays
        int[] arr = {1,2954,3,4,999999};
        for (int element : arr){
            System.out.println(element);
        }

        //Break and Continue

        System.out.println();
        for (int i = 1; i<=10;i++){
            if (i == 5){
                System.out.println("Breaking from the loop, and terminates loop");
                break;
            }
            System.out.println(i);
        }

        System.out.println("\n");

        for (int i = 1; i<=10;i++){
            if (i == 5){
                System.out.println("Continuing in the loop, so we jump the number specified(5)");
                continue;
            }
            System.out.println(i);
        }

//        for (;;) System.out.println("Yooh! The brakes are not working!\n");

        System.out.println();
        int day = 7;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("No day");
                break;
        }
    }
}
