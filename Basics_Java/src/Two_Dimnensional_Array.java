import java.util.Arrays;
import java.util.Scanner;

public class Two_Dimnensional_Array {
    public static void main(String[] args) {

        int [][] arr = new int[3][3];

        Scanner in = new Scanner(System.in);

        for(int i = 0; i< arr.length; i++)
        {
            System.out.print("Enter the values of row "+ i);

            for(int j=0; j<arr[i].length; j++)
            {

                arr[i][j] = in.nextInt();
            }
        }

        for(int i = 0; i< arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j]) ;
                System.out.print(" ");
            }
            System.out.println(" ");
        }


        for(int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }

    }
}
