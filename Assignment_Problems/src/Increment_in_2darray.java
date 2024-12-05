import java.util.Arrays;

public class Increment_in_2darray {

    public static void main(String[] args) {

        int m=48;
        int n=37;
        int[][] indices = {{40,5}};
        int[][] result = new int[m][n];
        int row1 = 0;
        int col1 = 0;



        for(int row=0; row<indices.length; row++)
        {
            for(int col=0; col<indices.length; col++) {
                row1 = indices[row][0];
                for (int i = 0; i < result[0].length; i++) {
                    result[row1][i]++;
                }
                col1 = indices[row][1];
                for (int j = 0; j < result.length; j++) {
                    result[j][col1]++;
                }
            }
        }

        System.out.println(result[1][1]);
        System.out.println(Arrays.deepToString(result));
    }
}
