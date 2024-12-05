package SecondRound_2nd_pdfProblems;

import java.util.Arrays;

public class Qn_14 {

    //Alternate sorting

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};
        alternateSort(arr);
    }

    public static void alternateSort(int[] arr)
    {
        Arrays.sort(arr);

        int last;

        for(int i = 0; i<arr.length; i+=2)
        {
            last = arr.length - 1;

            while(last > i)
            {
                int temp = arr[last];
                arr[last] = arr[last-1];
                arr[last-1] = temp;
                last--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
