public class Fibanocci_Num {

    public static void main(String[] args) {
        fib1(6);
    }
    public static int fib(int n)
    {
        if(n<2)
        {
            return n;
        }

        return fib(n-1) + fib(n-2);
    }
    public static void fib1(int n)
    {
        int a = 0 , b = 1 , c = 0;

        while(a<=n)
        {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}
