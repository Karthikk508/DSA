import java.util.Arrays;

public class Transpose_of_matrix {
    public static void main(String[] args) {

        int[][] mat = {{1,2,3},
                       {3,4,5},
                       {6,7,8} };

        int[][] res = transpose(mat);
        System.out.println(Arrays.deepToString(res));
        reverse(mat);
        System.out.println(Arrays.deepToString(res));

    }
    public static int[][] transpose(int[][] arr)
    {
        ////Transpose of matrix
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i; j<arr[0].length; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    public static void reverse(int[][] arr)
    {
        //reverse of 2d matrix
        for(int i=0; i<arr.length; i++)
        {
            int start = 0;
            int end = arr[0].length-1;

            while(start<end)
            {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;
                start++;
                end--;
            }
        }
    }



}
