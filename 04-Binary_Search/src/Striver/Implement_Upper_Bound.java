package Striver;

public class Implement_Upper_Bound {

    public static int upperBound(int[] arr, int x, int n) {
        int start = 0, end = n - 1;
        int ans = n;

        while (start <= end) {
            int mid = (start + end) / 2;
            // maybe an answer
            if (arr[mid] > x) {
                ans = mid;
                //look for smaller index on the left
                end = mid - 1;
            } else {
                start = mid + 1; // look on the right
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9, 15, 19};
        int n = 6, x = 9;
        int ind = upperBound(arr, x, n);
        System.out.println("The upper bound is the index: " + ind);
    }
}

