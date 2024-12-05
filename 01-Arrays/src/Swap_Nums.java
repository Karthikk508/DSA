import java.util.Arrays;

public class Swap_Nums {
    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,6,7};
         swap(arr, 1,3);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
