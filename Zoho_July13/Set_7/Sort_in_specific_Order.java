package Set_7;

import java.util.Arrays;

public class Sort_in_specific_Order {


    public static void main(String[] args) {


        long[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};

        segregate(arr);

        System.out.println(Arrays.toString(arr));



    }
    public static void segregate(long[] arr)
    {
        int i = 0 , j = arr.length-1;

        while (i<j)
        {
            while(i<j && arr[i]%2 != 0) i++;
            while(i<j && arr[j]%2 == 0) j--;
            if(i < j)
            {
                swap(i, j, arr);
            }
            i++;j--;
        }
    }
    public static void swap(int i,int j,long[] arr)
    {
            long temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
    }
}
