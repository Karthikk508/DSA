public class Distribute_candies {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,67,8,9};
        int type = 1;
        int num = nums[1];
        for(int i=0; i<nums.length; i++)
        {
            if(num != nums[i])
            {
                type++;
                num = nums[i];
            }
        }
        System.out.println(type);
    }
}
