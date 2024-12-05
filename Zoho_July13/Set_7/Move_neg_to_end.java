package Set_7;

import java.util.Arrays;

public class Move_neg_to_end {

    public static void main(String[] args) {

        int[] arr = {8,-10,7,-6};

        move(arr);

        System.out.println(Arrays.toString(arr));


    }

    public static void move(int[] arr)
    {

        int i = arr.length - 1,j = arr.length - 1;

        //while(j >= 0 && arr[j] < 0) j--;

        while(i >= 0)
        {

            if(arr[i] < 0)
            {
                swap_to_end(i,j,arr);
                j--;
            }
            i--;

        }

    }

    private static void swap_to_end(int i,int j, int[] arr) {

        while(i < j)
        {
            swap(i,i+1,arr);
            i++;
        }
    }

    public static void swap(int i,int j,int[] arr)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
