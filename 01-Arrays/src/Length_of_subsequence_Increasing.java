public class Length_of_subsequence_Increasing {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,2,3,4,5,6,7,8,9,10,11,12,13};
        int ans = findLengthOfLCIS(arr);
        System.out.println(ans);

    }
    public static int findLengthOfLCIS(int[] nums) {
        int max = 1;
        int count = 1;
        for(int i = 0; i<nums.length-1; i++)
        {
            if(nums[i]<nums[i+1])
            {
                count++;
            }
            else
            {
                count = 1;
            }
            if(count>max) max = count;
        }
        return max;
    }

}
