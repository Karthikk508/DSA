import java.util.ArrayList;
public class Rotate_Array_by_D_places {

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.size()-1);
        reverse(arr, 0, arr.size()-1);
        return arr;

    }
    public static void reverse(ArrayList<Integer> list, int start, int end) {
        while (start <= end) {
            int temp = list.get(start);
            list.set(start, list.get(end));
            list.set(end, temp);
            start++;
            end--;
        }
    }
}
