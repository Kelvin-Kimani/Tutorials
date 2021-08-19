public class MemoryOverloadingExample {

    //Memory overloading using different data types
    public int square(int a){
        return a*a;
    }
    public double square(double a){
        return a*a;
    }
    public float square(float a){
        return a*a;
    }

    //Memory overloading using different number of parameters
    public int sum (int a, int b, int c, int d, int e){
        return a+b+c+d+e;
    }
    public float sum (float a, float b, float c, float d, float e){
        return a+b+c+d+e;
    }
    public double sum (double a, double b, double c, double d, double e){
        return a+b+c+d+e;
    }

    public static void main(String[] args) {

        //Create an instance of the class(Object)
        MemoryOverloadingExample obj = new MemoryOverloadingExample();

        //Call squares
        System.out.println(obj.square(5));
        System.out.println(obj.square(5.5));
        System.out.println(obj.square(10));

        //Jump line
        System.out.println("");

        //Call summations
        System.out.println(obj.sum(10,20,30,40,50));
        System.out.println(obj.sum(0.1,0.2,0.3,0.4,0.5));
        System.out.println(obj.sum(15.5,16.5,17.5,18.5,19.5));
    }
}
