import java.util.Arrays;

public class Transpose_of_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,5},
                       {4,5,6,7},
                       {7,8,9,4} };

        for(int i=0; i<arr.length; i++)
        {
            for (int j = i; j < arr[0].length; j++) {

                   int temp = arr[i][j];
                   arr[i][j] = arr[j][i];
                   arr[j][i] = temp;

            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
