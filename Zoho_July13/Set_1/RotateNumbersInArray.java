package Set_1;
import java.util.Arrays;

public class RotateNumbersInArray {
    public static void main(String[] args) {
        int[] arr = {123,1,4,5,6,7,92};
        rotate(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void rotate(int[] arr)
    {
        int max = 0;
        for (int j : arr) {
            max = Math.max(max, (int) Math.log10(j) + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverse(arr[i],max);
        }
    }
    private static int reverse(int num,int max) {

        int i = 0;
        int rev = 0;

        while(i < max) {
            int l = num % 10;
            rev = rev * 10 + l;
            num /= 10;
            i++;
        }
        return rev;
    }
}
