package Set_3;

import java.util.Arrays;

public class DiagonalSnakePattern {

    public static void main(String[] args) {


        int[][] arr ={ {1,2,3},
                       {4,5,6},
                       {7,8,9} };

        System.out.println(Arrays.toString(findDiagonalOrder(arr)));

    }
    public static int[] findDiagonalOrder(int[][] matrix) {

        if (matrix.length == 0) return new int[0];

        int r = 0, c = 0, m = matrix.length, n = matrix[0].length, arr[] = new int[m * n];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = matrix[r][c];

            if ((r + c) % 2 == 0)
            {
                // moving up
                if(c == n - 1)
                {
                    r++;
                }
                else if(r == 0)
                {
                    c++;
                }
                else
                {
                    r--; c++;
                }
            }
            else
            {
                // moving down
                if(r == m - 1)
                {
                    c++;
                }
                else if(c == 0)
                {
                    r++;
                }
                else{
                    r++; c--;
                }
            }
        }
        return arr;
    }
}
