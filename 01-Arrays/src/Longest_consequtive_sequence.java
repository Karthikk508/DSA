import java.util.Arrays;

public class Longest_consequtive_sequence {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,3,3,4,100,100,101,101,102};
        int ans = LCS(arr);
        System.out.println(ans);
    }
    public static int LCS(int[] nums)
    {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int len = 1;
        int lastelement = nums[0];
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i]-1 == nums[i-1])
            {
                count++;
                lastelement = nums[i];
            }
            if(count>len)
            {
                len = count;
            }
            if(nums[i] != lastelement)
            {
                count=1;
                lastelement=nums[i];
            }
        }
        return len;
    }
}



