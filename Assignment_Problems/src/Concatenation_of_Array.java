import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {

        int[] nums = {1,2,3};

        int[] ans = new int[(nums.length)*2];

        for(int i=0; i<nums.length; i++)
        {
            ans[i] = nums[i];
        }
        for(int j=nums.length; j<nums.length*2; j++)
        {
            ans[j] = nums[j-(nums.length)];
        }


        System.out.println(Arrays.toString(ans));
    }
}
