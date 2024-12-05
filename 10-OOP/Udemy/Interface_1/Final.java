package Udemy.Interface_1;

public class Final {

    final int a  = 10;


    public static void main(String[] args) {

        int a = 10;
        // a = 10; you can't reassign
        System.out.println(a);

    }
}
class Derived extends Final{

//    double MILES_TO_KM = 1.60934;
//    final double MILES_TO_KM = 1.60934;
//    public final double MILES_TO_KM = 1.60934;
//    public static final double MILES_TO_KM = 1.60934;

    public static void main(String[] args) {
        Derived d = new Derived();
        System.out.println(d.a);
    }
}
