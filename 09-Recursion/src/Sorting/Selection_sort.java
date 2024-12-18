package Sorting;

import java.util.Arrays;

public class Selection_sort {

    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1,0};
        //bubble(arr,8,0);
        selection(arr,6,0,0);
        System.out.println(Arrays.toString(arr));

    }
    public static void selection(int[] arr , int r , int c , int max)
    {
        if(r == 0)
        {
            return;
        }
        if(c < r)
        {
            if(arr[c] > arr[max]) {
                selection(arr,r,c+1,c);
            }
            else
            {
                selection(arr,r,c+1,max);
            }
        }
        else
        {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0,0);
        }
    }


}
