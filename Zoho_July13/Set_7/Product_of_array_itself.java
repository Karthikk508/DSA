package Set_7;

import java.util.Arrays;

public class Product_of_array_itself {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        find(arr);



    }
    public static void find(int[] arr)
    {

        int[] arr1 = new int[arr.length];

        int pre = 1;

        for (int i = 0; i < arr.length; i++) {

            if(i>0) pre *= arr[i-1];
            arr1[i] = pre;

        }

        System.out.println(Arrays.toString(arr1));

        int post = 1;

        for (int i = arr.length-1; i >=0 ; i--) {

            arr1[i] = post * arr1[i];
            post *= arr[i];

        }

        System.out.println(Arrays.toString(arr1));


    }

}
