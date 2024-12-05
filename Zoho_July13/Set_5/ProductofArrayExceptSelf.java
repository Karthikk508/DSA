package Set_5;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(product(nums)  ));
    }
    public static int[] product(int[] nums)
    {
        int product = 1;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = product;
            product = product * nums[i];
        }
        product = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            ans[i] = ans[i] * product;
            product = product * nums[i];
        }
        return ans;
    }
}
