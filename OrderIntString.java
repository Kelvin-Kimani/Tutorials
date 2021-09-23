public class OrderIntString {
    public static void main(String[] args) {
        //Expected = 60Hello World (Correct)
        System.out.println(30+30+"Hello world");

        //Expected = Hello World 3030 (correct)
        System.out.println("Hello World " + 30+30);

        //Expected = Hello World 60 (correct)
        System.out.println("Hello World " + (30+30));
    }
}
