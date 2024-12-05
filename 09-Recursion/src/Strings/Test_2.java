package Strings;

public class Test_2 {

    public static void main(String[] args) {
        System.out.println(check(121));
    }
    public static boolean check(long n)
    {
        long num = 0 , temp = n ;
        while(n > 0)
        {
            num += n%10;
            n /= 10;
            num *= 10;
        }
        num /= 10;

        return num == temp;
    }
}
