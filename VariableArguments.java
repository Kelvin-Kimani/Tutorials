public class VariableArguments {

    //Create method with variable arguments
    public static void fun(int... args) {
        System.out.println("Number of arguments: " + args.length);

        //Get elements of the args array
        for (int i :  args)
            System.out.print(i + " ");
        //Add new line
        System.out.println();

    }
    public static void main(String[] args) {

        //Call method with the wanted number of arguments
        fun();
        fun(1,2,3);
        fun(15,16,17,18,19,20,21,22,23,24,25,26,27,28,29);

    }
}
