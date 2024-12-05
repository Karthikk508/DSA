import java.util.*;
public class Selection_Sort {

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        selection_sort(arr, n);
    }
    static void selection_sort(int[] arr, int n) {

        for (int i = 0; i < n - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

