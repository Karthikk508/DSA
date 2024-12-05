import java.util.*;

public class Fibanocci_upto_Nterms_Array {

    public static void main(String[] args) {

        Fibanocci_upto_Nterms_Array solution = new Fibanocci_upto_Nterms_Array();
        int n = 10;
        int[] fibonacciSeries = solution.Series(n);
        System.out.println(Arrays.toString(fibonacciSeries));
    }
    public  int[] Series(int n) {
        if (n == 0)
            return new int[]{0};
        if (n == 1)
            return new int[]{0, 1};

        int[] ans = new int[n + 1]; // Create an array to store Fibonacci series, take (n + 1) because it starts with 0
        int mod = 1000000007; // Modulo value
        ans[0] = 0; // First Fibonacci number
        ans[1] = 1; // Second Fibonacci number
        for (int i = 2; i <= n; i++) {
            ans[i] = (ans[i - 1] + ans[i - 2]) % mod; // Calculate Fibonacci number and take modulo
        }
        return ans;
    }
}




//import java.util.Arrays;
//
//public class Fibanocci {
//    public static void main(String[] args) {
//
//
//        long[] longs = new long[] {1,2,3,4,5};
//        int[] ints = Arrays.stream(longs).mapToInt(Math::toIntExact).toArray();
//
//        int n = 214;
//        if (n == 0) {
//            System.out.println(0);
//        } else {
//            int fib[] = new int[n + 1];
//            fib[0] = 0;
//            fib[1] = 1;
//            for (int i = 2; i <= n; i++) {
//                fib[i] = fib[i - 1] + fib[i - 2];
//            }
//            System.out.println("The Fibonacci Series up to " + n + "th term:");
//            for (int i = 0; i <= n; i++) {
//                System.out.print(fib[i] + " ");
//            }
//        }
//    }
//
//    public static int[] Series(int n) {
//        // code here
//
//        long[] longs = new long[n+1];
//
//        long a = 0 , b = 1 ,c = 0, i = 0;
//
//
//        while(i<n+1)
//        {
//            c = a + b;
//            longs[(int)i] = a;
//            a = b;
//            b = c;
//            i++;
//        }
//        int[] ints = Arrays.stream(longs).mapToInt(Math::toIntExact).toArray();
//
//        return ints;
//    }
//}


