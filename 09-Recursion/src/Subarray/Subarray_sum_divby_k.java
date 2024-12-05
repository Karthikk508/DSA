package Subarray;

import java.util.*;
class Subarray_sum_divby_k {

    public static void main(String[] args) {

        int[] nums = {4,5,0,-2,-3,1};
        System.out.println(subarraysDivByK(nums,5));
    }
    public static int subarraysDivByK(int[] nums, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        subarray(0,nums,k,new ArrayList<>(),true,ans);
        System.out.println(ans);
        return ans.size();

    }
    public static void subarray(int i,int[] nums,int k,List<Integer> arr,boolean s,List<List<Integer>> ans)
    {
        if(i == nums.length)
        {
            int sum = 0;
            for(int l = 0; l<arr.size(); l++)
            {
                sum += arr.get(l);
            }
            if(sum % k == 0)
            {
                ans.add(arr);
            }
            return;
        }
        subarray(i+1,nums,k,arr,arr.add(nums[i]),ans);
        subarray(i+1,nums,k,arr,false,ans);
    }
}