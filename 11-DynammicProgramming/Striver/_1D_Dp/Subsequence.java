package Striver._1D_Dp;

import java.util.Arrays;

public class Subsequence {

    public static void main(String[] args) {

        int[] arr = {1,2,1,1};
        System.out.println(rob(arr));
        //print(0,0,arr);


    }
    public static void print(int ind,int sum,int[] arr)
    {
        if(ind >= arr.length )
        {
            System.out.println(sum);
            return;
        }
        sum += arr[ind];
        print(ind+2,sum,arr);
        sum -= arr[ind];
        print(ind+1,sum,arr);
    }
    public static int rob(int[] nums) {

        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return robb(0,dp,0,nums);

    }
    public static int robb(int ind,int[] dp,int sum,int[] arr)
    {
        if(ind > arr.length-1)
        {
            return sum;
        }

        if(dp[ind] != -1) return dp[ind];

        sum += arr[ind];
        int left = robb(ind+2,dp,sum,arr);
        sum -= arr[ind];
        int right = robb(ind+1,dp,sum,arr);


        return dp[ind] = Math.max(left,right);
    }
}
