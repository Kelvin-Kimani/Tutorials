public class StaticBlocks {
    static int num;
    static String name;

    //multiple static blocks
    static {
        num = 10;
        name = "Jay";

        System.out.println("Initial values of num and name are " + num + " " + name);
    }

    //Overrides the block above
    static {
        num = 20;
        name="Mel";

        System.out.println("After changing, these were the values: " + num + " " + name);
    }

    public static void main(String[] args) {

        System.out.println(num + " " + name);
    }
}
