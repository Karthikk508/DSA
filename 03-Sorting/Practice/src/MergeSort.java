import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {

        int[] arr = {3,1,2,4,1,5,2,6,4};
        mergeSort(0,8,arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int start,int end,int[] arr)
    {
        if(start == end)
            return;

        int mid = (start+end)/2;
        mergeSort(start,mid,arr);
        mergeSort(mid+1,end,arr);

        merge(start,mid,end,arr);
    }

    private static void merge(int start, int mid, int end, int[] arr) {

        int i = start;
        int j = mid+1;

        int[] temp = new int[start+end+1];

        int ind = 0;

        while(i<=mid && j<=end)
        {
            if(arr[i] <= arr[j])
            {
                temp[ind++] = arr[i];
                i++;
            }
            else
            {
                temp[ind++] = arr[j];
                j++;
            }
        }
        while(i <= mid)
        {
            temp[ind++] = arr[i];
            i++;
        }
        while(j <= end)
        {
            temp[ind++] = arr[j];
            j++;
        }
        ind = 0;
        for (int k = start; k <= end; k++) {

             arr[k] = temp[ind++] ;
        }

    }

}
