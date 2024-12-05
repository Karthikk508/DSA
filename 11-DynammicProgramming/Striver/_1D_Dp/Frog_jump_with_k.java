package Striver._1D_Dp;

import java.util.Arrays;

public class Frog_jump_with_k {


    public static void main(String[] args) {

        int[] arr = {10,30,40,50,20};
        int[] dp = new int[arr.length+1];

        Arrays.fill(dp,-1);

        System.out.println(func(dp,arr.length-1,3,arr));

    }
    public static int func(int[] dp,int ind,int k,int[] arr)
    {

        if(ind == 0) return 0;
        int minSteps = Integer.MAX_VALUE;

        for (int i = 1; i <=k; i++) {
            int jump = Integer.MAX_VALUE;
            if(ind - i >= 0 && dp[ind] != -1) return dp[ind];
            if(ind-i >= 0)  jump = func(dp,ind-i,k,arr) + Math.abs(arr[ind] - arr[ind-i]);
            minSteps = Math.min(jump,minSteps);
        }
        return dp[ind] = minSteps;
    }

}
