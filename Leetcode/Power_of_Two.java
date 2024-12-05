public class Power_of_Two {

    public static void main(String[] args) {

        int n = 16;
        double ans = isPowerOfTwo(n);
        System.out.println(ans);
        double val = ans % 1;
        System.out.println(val);

        int val1 = optmized(n);
        System.out.println(val1);

    }
    public static double isPowerOfTwo(int n) {
        return (Math.log(n) / Math.log(2));
    }
    public static int optmized(int n) {          
        return ((n&(n-1)));
    }
}
