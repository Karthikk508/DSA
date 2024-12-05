package Hard_Imp;
import java.util.*;
public class Longest_Subarray_With_Zero_Sum {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,67,8,9,0};
        int ans = getLongestZeroSumSubarrayLength(arr);
        System.out.println(ans);

    }
    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        // Write your code here.

        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {

                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
