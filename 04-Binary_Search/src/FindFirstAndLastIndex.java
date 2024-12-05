import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstAndLastIndex {
    public static void main(String[] args) {

        int[] ans = {-1,-1};
        int[] nums = {1,2,3,4,5,6,7,8,9};

        int target = 1;

        int start = startendI(nums,target, true);
        int end = startendI(nums,target, false);

        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
    }

    public static int startendI(int[] nums,int target,boolean findindex)
    {
        int start=0;
        int mid=0;
        int ans = -1;
        int end=nums.length-1;

        while( start <= end)
        {
            mid = start + (end-start/2);

            if(target < nums[mid]) end = mid-1;

            else if(target > nums[mid]) start = mid+1;

            else
            {
                ans = mid;

                if(findindex) end = mid-1;
                else start = mid+1;

            }
        }
        return ans;


    }

};