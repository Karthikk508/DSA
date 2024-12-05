import java.util.Arrays;

public class Max_product_of_Threenum {
    public static void main(String[] args) {
          int[] nums = {1,2,3,4,5,46,66,4,58,5,8,5};
          int ans = three(nums);
          System.out.println(ans);
    }
    public static int three(int[] nums)
    {
        Arrays.sort(nums);
        int n = nums.length - 1;
        int a = nums[0] * nums[1] * nums[n];
        int b = nums[n] * nums[n - 1] * nums[n - 2];
        return Math.max(a, b);
    }

}
