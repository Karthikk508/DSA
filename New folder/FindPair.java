import java.util.Arrays;
import java.util.Scanner;

public class FindPair {

    public static void main(String[] args) {

        int[][] arr1 = {{1,5,6},
                        {8,10,11},
                        {15,16,18}};
        int[][] arr2 = {{2,4,7},
                        {9,10,12},
                        {13,16,20}};

        Scanner in = new Scanner(System.in);
        int n = 3;
        int[][] input = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the values" + input[i][j]);
            }

        }
        find(arr1,arr2,21);
    }
    public static void find(int[][] arr1,int[][] arr2,int sum)
    {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                search(i,j,arr1,arr2,sum);
            }
        }
    }
    public static void search(int i ,int j,int[][] arr1, int[][] arr2,int target) {

        int row = 0;
        int column = arr2[0].length-1;



        while(row<arr2.length && column>=0)
        {

            if(arr2[row][column] + arr1[i][j] ==target)
            {
                System.out.println(arr1[i][j] + " " + arr2[row][column]);
            }
            if(arr2[row][column] + arr1[i][j] < target  )
            {
                row++;
            }
            else
            {
                column--;
            }
        }
    }
}
