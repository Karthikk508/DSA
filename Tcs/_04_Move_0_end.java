import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _04_Move_0_end {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0)
            {
              arr[c++] = arr[i];
            }
        }
        for(int i = arr.length - 1; i>=c; i--)
        {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
