package Easy;
public class Reverse_number {
    public static void main(String[] args) {

        //fun(1234);
        //System.out.println(sum);
        System.out.println(rev2(654321));
    }
    static int sum = 0;
    public static void fun( int n ) {
        if (n == 0) {
            return;
        }
        sum = sum * 10 + (n % 10);
        fun(n / 10);
    }

    /// Method 2 // Using Helper function
    static int rev2 (int n)
    {
        int digits = (int) (Math.log10(n))+ 1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits) {

        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int)((Math.pow(10,digits-1))) + helper(n/10,digits-1);
    }
}
