package Subset;

public class test {

    public static void main(String[] args) {


        System.out.println(check(1));


    }
    public static boolean check(int n)
    {
        int temp = n , num = 0;

        while(n > 0)
        {
            int digit = n % 10;
            num = num * 10;
            num += digit;
            n = n / 10;
        }
        return temp == num;
    }
}
