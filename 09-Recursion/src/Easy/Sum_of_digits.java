package Easy;

public class Sum_of_digits {
    public static void main(String[] args) {

        System.out.println(sum_digits(2111));
        System.out.println(mul_digits(21111));
    }
    public static int sum_digits(int n)
    {
        if(n<=1)
        {
            return n;
        }
        return (n%10) + sum_digits(n/10);
    }
    public static int mul_digits(int n)
    {
        if(n%10 == n)
        {
            return n;
        }
        return (n%10) * mul_digits(n/10);
    }

}
