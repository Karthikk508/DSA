package Round_2;

import java.util.Arrays;

public class _10_Find_firstMax_firstMin {

    public static void main(String[] args) {

        int[] arr = {467,742 ,8 ,32, 8, 489 ,26};

        findArr(arr);


    }
    public static void findArr(int[] arr)
    {

        Arrays.sort(arr);

        int ind = 0;

        int[] ans = new int[arr.length];

        int start =  0, end = arr.length-1;

        while(start<=end)
        {

            if(ind < arr.length)
            {
                ans[ind++] = arr[end];
            }

            if(ind < arr.length)
            {
                ans[ind++] = arr[start];
            }


            end--;
            start++;

        }

        System.out.println(Arrays.toString(ans));
    }

}
