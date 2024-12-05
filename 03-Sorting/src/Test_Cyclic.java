import java.util.Arrays;
import java.util.Scanner;

public class Test_Cyclic
{
    int x = 10;
    public static void main(String[] args)
    {
        //System.out.println(x);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array: ");
        for(int i=0;i<n;i++)
        {
            //System.out.println("ji");
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        sort(arr);

        //display array elements
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
    }

    static void sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i]-1)!=i)
            {
                int temp = arr[i];
                arr[i] = arr[arr[i]-1];
                arr[temp-1] = temp;
                i--;
            }
        }
    }
}
