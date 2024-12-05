package Arrays;

public class Sum_of_digits {

    public static void main(String[] args) {

        System.out.println(SumofDigits(560188,6000));

    }
    public static int SumofDigits(int A, int B)
    {
        // Code here
        double x = Math.pow(A,B);

        long a = (long) x;

        while (a % 10 != a)
        {
            long sum1 = sum_of_digit(a);
            a = sum1;
        }

        int ans = (int)a;
        return ans;


    }
    public static long sum_of_digit(long n)
    {
        if (n < 10)
            return n;
        return (n % 10 + sum_of_digit(n / 10));
    }

}
