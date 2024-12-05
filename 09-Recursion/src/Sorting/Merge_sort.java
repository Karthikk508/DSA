package Sorting;
import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        //System.out.println(Arrays.toString(mergeSort(arr)));
        mergeInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    // Merge sort using extra arrays
     public static int[] mergeSort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr , 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));

        return merge1(left , right);
    }
    private static int[] merge1(int[] first, int[] second) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] mix = new int[first.length + second.length];

        while(i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i < first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    // Merge sort In_place without using extra arrays
    public static void mergeInPlace(int[] arr,int s,int e)
    {
        if(e - s == 1)
        {
            return;
        }
        int mid = (s+e)/2;

        mergeInPlace(arr , s , mid);
        mergeInPlace(arr, mid , e);

        merge2(arr,s,mid,e);
    }
    private static void merge2(int[] arr , int s , int m , int e) {

        int i = s;
        int j = m;
        int k = 0;

        int[] mix = new int[e - s];

        while(i< m && j< e)
        {
            if(arr[i] < arr[j])
            {
                mix[k] = arr[i];
                i++;
            }
            else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<m)
        {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e)
        {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}
