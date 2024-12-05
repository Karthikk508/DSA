package Arrays;

import java.util.*;

public class Geek_onacci_Number {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T>0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();

            System.out.println(fib1(a,b,c,n));
            T--;
        }
    }

    public static int fib1(int a ,int b , int c, int n)
    {
        int i = 0;
        while(i<=n)
        {
            c = a+b;
            a = b;
            b = c;
            i++;
        }
        System.out.print(c);
        return c;
    }
}