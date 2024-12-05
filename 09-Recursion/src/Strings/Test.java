package Strings;

public class Test {

    public static char[] getString()
    {
        char[] str = {'?'};
        return str;
    }
    public static void main(String[] args)
    {
          //System.out.println(getString());
          //System.out.println(fun());
          fib();
          //func(32);

        String s = "abc";

        System.out.println(s.substring(0,3));


          double n = 12345;

          int  m = (int) Math.log10(n);

          System.out.println(m + 1);
          System.out.println("" + 1);
    }
    public static void fib()
    {
        int f = 0, g = 1;
        int i;
        for(i = 0; i < 15; i++)
        {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
    public static int func(int i)
    {
        System.out.println(i);
        if(i  > 32)
        {
            return 1;
        }
        return func(i++);
    }
    static int i = 5;
    public static int test() {
        i = 5;

        if (true/*i--*/) {
            test();
            System.out.println(i);
        }
        return 0;
    }
    static int x = 0;
    static int fun() {

         x= 0;
        return ++x;
    }
}


