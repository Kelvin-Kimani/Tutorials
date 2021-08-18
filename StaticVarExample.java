public class StaticVarExample {

    public static String staticVar = "Class and not object instance. Any change on me occurs everywhere!";
    public String normalVar = "Any object can change me and won't affect others";

    public static void main(String[] args) {

        StaticVarExample obj1 = new StaticVarExample();
        StaticVarExample obj2 = new StaticVarExample();
        StaticVarExample obj3 = new StaticVarExample();

        //print out static variable
        System.out.println(obj1.staticVar);
        System.out.println(obj2.staticVar);
        System.out.println(obj3.staticVar);

        //print out normal variable
        System.out.println(obj1.normalVar);
        System.out.println(obj2.normalVar);
        System.out.println(obj3.normalVar);

        //Change static variable using object 2
        obj2.staticVar =  "changed static one on object 2 and all changed!";

        System.out.println(obj1.staticVar);
        System.out.println(obj2.staticVar);
        System.out.println(obj3.staticVar);

        //change normal variable using object 2
        obj2.normalVar ="changed normal variable and I haven't affected others";

        System.out.println(obj1.normalVar);
        System.out.println(obj2.normalVar);
        System.out.println(obj3.normalVar);
    }
}
