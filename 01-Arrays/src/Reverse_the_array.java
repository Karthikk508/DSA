import java.util.ArrayList;

public class Reverse_the_array {
    public static void main(String[] args) {

    }

    public static void reverse1(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
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
