public class Max_consecutive_ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        int ans = findMaxConsecutiveOnes(nums);
        System.out.println(ans);
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ans = 0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != 0){
                count++;
                if(count>ans) ans=count;
            }
            else
                count=0;
        }

        for (int i = 0; i < 5; ++i) {
            System.out.println(i);
        }

        return ans;
    }
}
