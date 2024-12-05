package SecondRound_2nd_pdfProblems;

import java.util.Arrays;

public class ZigZagUpAndDown {


    public static void main(String[] args) {


        int[][] arr ={ {1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16} };
        print(arr);
    }
    public static void print(int[][] arr)
    {

        int n = arr.length * arr[0].length;

        int[] ans = new int[n];

        int row = 3 , col = 3;

        boolean flag;

        //down
        flag = row > arr.length / 2;

        for(int i = 0; i<n; i++)
        {
            ans[i] = arr[row][col];
            //System.out.println(arr[row][col]);
            if(flag){                      // up

                if(row == 0)
                {
                    col++;
                    if(col == arr[0].length)
                    {
                        col = 0;
                    }
                    flag = false;
                }
                else{
                    row--;
                }
            }
            else{

                if(row == arr.length - 1)
                {
                    col++;
                    if(col == arr[0].length)
                    {
                        col = 0;
                    }
                    flag = true;
                }
                else {
                    row++;
                }
            }
        }

        System.out.println(Arrays.toString(ans));

    }
}