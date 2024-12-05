import java.util.Arrays;
import java.util.Scanner;

public class _07_Sort_0_1_2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        int czeros = 0 , cones = 0 , ctwos = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] == 0) {
                czeros++;
            }
            else if(arr[i] == 1)
            {
                cones++;
            }
            else
            {
                ctwos++;
            }
        }
        int c = 0;

        while(czeros > 0)
        {
            arr[c++] = 0;
            czeros--;
        }
        while(cones > 0)
        {
            arr[c++] = 1;
            cones--;
        }
        while(ctwos > 0)
        {
            arr[c++] = 2;
            ctwos--;
        }

        System.out.println(Arrays.toString(arr));

    }
}
