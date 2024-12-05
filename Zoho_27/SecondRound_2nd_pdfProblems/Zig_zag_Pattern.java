package SecondRound_2nd_pdfProblems;

import java.util.Arrays;

public class Zig_zag_Pattern {

    public static void main(String[] args) {

        int[][] arr = { {1,2,3},
                        {4,5,6},
                        {7,8,9}};

        //printZigZag(arr);

        System.out.println(Arrays.toString(findDiagonalOrder(arr)));
    }

    public static int[] findDiagonalOrder(int[][] mat) {

        int row = 0 , col = 0 ;
        int[] ans = new int[mat.length * mat[0].length];

        for(int i = 0; i<ans.length; i++)
        {
            ans[i] = mat[row][col];

            if((row+col) % 2 == 0)
            {
                if(col == mat[0].length-1)
                {
                    row++;
                }
                else if(row == 0)
                {
                    col++;
                }
                else{
                    col++;
                    row--;
                }
            }
            else{

                if(row == mat.length - 1)
                {
                    col++;
                }
                else if(col == 0)
                {
                    row++;
                }
                else
                {
                    row++;
                    col--;
                }
            }
        }

        return ans;

    }


    public static void printZigZag(int[][] arr)
    {
        int row = 0 , col = 0 , ind = 0 , size = arr.length * arr[0].length;

        while(ind < size-1)
        {

            if(row < 0) row = 0;
            if(col < 0) col = 0;

            System.out.println(arr[row][col]);

            if((row + col) % 2 != 0)
            {
                row++;
                col--;
            }
            else{
                col++;
                row--;
            }

            if(col == arr[0].length )
            {
                row = 1;
                col--;
            }

            ind++;
        }
    }
}
