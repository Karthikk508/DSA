package SecondRound_2nd_pdfProblems;

import java.util.Arrays;

public class Qn_15 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 4};
        int limit = 4;

        System.out.println(find(limit,arr));

    }
    public static int find(int limit,int[] arr)
    {

        Arrays.sort(arr);

        int start = 0 , end = arr.length-1;

        int count = 0;

        while(start <= end)
        {
            if(arr[start] + arr[end] <= limit)
            {
                start++;
                end--;
                count++;
            }
            else
            {
                end--;
                count++;
            }
        }
        return count;

    }
}
