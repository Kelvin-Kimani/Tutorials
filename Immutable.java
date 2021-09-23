public class Immutable {
    public static void main(String[] args) {
        String s = "a";
        int no = 5;

        //Invoke methods

        //Immutable
        myNames(s);

        //Mutable
        myNumber(no);

        //String is an example of an immutable type. A String object always represents the same string.
        //So will print 'a'
        System.out.println(s);
        System.out.println(no);
    }
    static void myNames(String s){
        s = "Kimani";
    }

    static void myNumber(int no){no = 10;}
}
