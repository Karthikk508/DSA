package Striver.Intro;

import java.util.Arrays;

public class Fibanooci {


    public static void main(String[] args) {

        int n = 10000;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        System.out.println(fib(dp,n));

    }
    public static int fib(int[] dp,int n)
    {
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        return dp[n] = fib(dp,n-1) + fib(dp,n-2);
    }
}
