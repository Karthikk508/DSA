import java.util.Arrays;

public class Insertion_sort {

    public static void main(String[] args) {

        int[] arr = {4, 1, 3, 9, 7};
        insertionSort(arr,arr.length);
    }
    public static void insertionSort(int[] arr, int n)
    {
        for(int i = 0; i<n-1; i++)
        {
            for(int j = i+1; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
