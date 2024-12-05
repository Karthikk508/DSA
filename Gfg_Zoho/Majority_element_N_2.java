public class Majority_element_N_2 {
    public static void main(String[] args) {

        int[] n = {1,2,3,4,4};
        System.out.println(majorityElement(n));

    }
    public static int majorityElement(int[] nums) {

        int  count = 0;
        int element = nums[0];
        for(int i=0; i<nums.length; i++)
        {
            if(element == nums[i])
            {
                count++;
            }
            else if(count==0)
            {
                element = nums[i];
            }
            else{
                count--;
            }
        }
        System.out.println(count);
        return element;

    }
}
