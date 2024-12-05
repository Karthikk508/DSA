import javax.swing.*;
import java.util.Arrays;

public class Elimination_game {

    public static void main(String[] args) {

        int n = 10;
        System.out.println(lastRemaining(n));

    }
    // function for array
    public static int lastRemaining(int n) {
        int[] arr = new int[n];
        for(int i = 0; i<n; i++)
        {
            arr[i] = i+1;
        }
        System.out.println(Arrays.toString(arr));
        return eliminate(arr,n,1);

    }
    public static int eliminate (int[] arr ,int n,int flag)
    {
        if(arr.length == 1)
        {
            return arr[0];
        }

        int m = (flag % 2 == 0) ? 0 : 1;
        int k = 0;
        if(m == 1)
        {
            for(int i = 1; i<arr.length; i+=2) {
                arr[k] = arr[i];
                k++;

            }
        }
        else {
            k = arr.length-1;
            for(int i = arr.length-2; i>=0; i-=2) {
                arr[k] = arr[i];
                k--;
            }
        }
        if(m==1)
        {
            return eliminate(Arrays.copyOfRange(arr,0,k),n-1,++flag);
        }
        return eliminate(Arrays.copyOfRange(arr,k+1,arr.length),n-1,++flag);
    }
}
