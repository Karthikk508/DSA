package Arrays;

import java.util.*;

public class Rearrange_array_alt {

    public static void main(String[] args) {

        long[] arr = {1, 2, 3, 4, 5, 6, 7};
        rearrange(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void rearrange(long arr[], int n) {

        long max = arr[n - 1] + 1;
        int j = n - 1;

        for (int i = 0; i < n; i += 2) {
            arr[i] = arr[i] + (arr[j] % max) * max;
            j--;
        }
        j = 0;
        for (int i = 1; i < n; i += 2) {
            arr[i] = arr[i] + (arr[j] % max) * max;
            j++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] /= max;
        }
    }
}