import java.util.Arrays;

public class Longest_Increasing_subsequence_BS {
    public static void main(String[] args) {

        int[] nums = {10,9,2,5,3,7,101,18};
        int[] result = new int[nums.length];
        int size = 0;
        for(int i=0; i<nums.length-1; i++)
        {
            if(nums[i]<result[i])
            {
                result[i]=nums[i];
                size++;
            }
            else
            {
                int start = 0;
                int end = size;
                int target = nums[i+1];
                while(start<end)
                {
                    int mid = start + (end-start)/2;
                    if(target<result[mid])
                    {
                        end = mid;
                    }
                    else //if(target>result[mid])
                    {
                        start = mid+1;
                    }
                }
                result[start]=nums[i+1];
            }
        }
        int res = 0;
        for(int i=result.length-1; i>0; i--)
        {
            if(result[i] != 0) break;
            res++;
        }

        System.out.println(Arrays.toString(result));

    }
}
