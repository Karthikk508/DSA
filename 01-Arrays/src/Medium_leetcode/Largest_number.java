package Medium_leetcode;

import java.util.Arrays;

public class Largest_number {

    public static void main(String[] args) {


        int[] arr = {0,9,8,7,6,5,4,3,2,1};

        System.out.println(largestNumber(arr));


    }
    public static String largestNumber(int[] nums) {

        int flag = 0;

        do{

            flag = 0;

            for(int i = 0; i<nums.length-1; i++)
            {
                long digits = (long)Math.log10(nums[i]);
                long left =  (nums[i+1] * (long)Math.pow(10,digits+1)) + nums[i];

                long Rdigits = (long)Math.log10(nums[i+1]);
                long right =  (nums[i] * (long)Math.pow(10,Rdigits+1)) + nums[i+1];

                if(nums[i+1] == 0) left = 0;
                if(nums[i] == 0) right=0;

                if(digits <= 0 && Rdigits <= 0)
                {
                    left =nums[i+1];
                    right = nums[i];
                }


                if(left > right)
                {
                    flag = 1;
                    swap(nums,i,i+1);
                }
            }
        }
        while(flag == 1);

        System.out.println(Arrays.toString(nums));

        String ans = "";

        for(int i = 0; i<nums.length; i++)
        {
            ans += nums[i];
        }

        return ans;
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
