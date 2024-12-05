package Arrays;

import java.util.*;

public class Two_sum {
    public static void main(String[] args) {

        int[] arr = {2,7,11,15};

        System.out.println(Arrays.toString(two_sum(arr,18)));

    }
    public static int[] two_sum(int[] arr, int target)
    {

        for (int i = 1; i < arr.length ; i++) {

            for (int j = 0; i+j < arr.length; j++) {

                if(arr[i+j] + arr[j] == target)
                {
                    return new int[] {i+j,i};
                }

            }
        }
        return new int[] {-1,-1};
    }
}
