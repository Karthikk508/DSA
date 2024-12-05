package Striver.Binary_search_on_numbers;
import java.util.*;




public class Koko_eating_bananas {
    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;;
        int n = v.length;
        //find the maximum:
        for (int j : v) {
            maxi = Math.max(maxi, j);
        }
        return maxi;
    }
    public static int calculateTotalHours(int[] v, int hourly) {
        int totalH = 0;
        //find total hours:
        for (int j : v) {

            totalH += (int) Math.ceil((double) j / (double) (hourly));
        }
        return totalH;
    }
    public static int minimumRateToEatBananas(int[] v, int h) {
        int low = 1, high = findMax(v);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = calculateTotalHours(v, mid);
            if (totalH <= h) {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = minimumRateToEatBananas(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.");
    }
    /// Optimized from leetcode solution
    public static int minEatingSpeed(int[] piles, int h) {
        long totalBananas = 0;
        for (int p : piles) {
            totalBananas += p;
        }
        int left = (int) ((totalBananas - 1) / h) + 1;
        int right = (int) ((totalBananas - piles.length) / (h - piles.length + 1)) + 1;

        while (left < right) {

            int mid = left + (right - left) / 2;
            int totalHours = 0;
            for (int p : piles) {
                totalHours += (p - 1) / mid + 1;
            }
            if (totalHours > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}