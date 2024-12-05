import java.util.*;
public class Find_Polygon_With_the_Largest_Perimeter {

    public static void main(String[] args)
    {
        int[] arr = {1,12,1,2,5,50,3};
        long ans = largestPerimeter(arr);
        System.out.println(ans);
    }

    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        long ans = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < sum) {
                ans = nums[i] + sum;
            }
            sum += nums[i];
        }

        return ans;
    }
}
