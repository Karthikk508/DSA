package Easy;

public class Test {

    public static void main(String[] args) {
        //fun(5);
        //fun1(5);
        //fun2(5);
        System.out.println(fact(5));
        System.out.println(digit_sum(542131));
    }
    public static void fun2(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun2(n-1);
        System.out.println(n);
    }
    public static int digit_sum(int digit)
    {
        if(digit % 10 == 0)
        {
            return digit;
        }
        return (digit%10) + digit_sum(digit/10);
    }

    public static void fun(int n)
    {
        if(n<=1)
        {
            return ;
        }
        System.out.println(n);
        fun(n--);
    }
    public static int fact(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        return n*fact(n-1);
    }

    public static void fun1(int x) {
        if (x == 0) {
            System.out.println(x);
            return;
        }
        System.out.println(x);
        fun1(x - 1);
        System.out.println(x);

    }
}
//        int j;
//
//        int N = 6 , K = 6;
//        for(int i = 1; i<=N;)
//        {
//            for( j = 1; j<=K; j++)
//            {
//                System.out.println(i);
//            }
//            i = i+K;
//        }