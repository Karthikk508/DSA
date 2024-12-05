package Easy;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        //message();
        fun1(5);
    }

    public static void message()
    {
        System.out.println("Recursion");
        message1();
        System.out.println('1');
    }
    public static void message1()
    {
        System.out.println("Recursion");
        message2();
        System.out.println('2');
    }
    public static void message2()
    {
        System.out.println("Recursion");
        message3();
        System.out.println('3');
    }
    public static void message3()
    {
        System.out.println("Recursion");
        message4();
        System.out.println('4');
    }
    public static void message4()
    {
        System.out.println("Recursion");
    }

    public static void fun1(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        fun1(n-1);
        System.out.println(n);
    }

}