import java.util.ArrayList;

public class Set_matrix_0 {
    public static void main(String[] args) {

    }
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Write your code here.
        int[] row = new int[n];
        int[] col = new int[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if(matrix.get(i).get(j) == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }

            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if(row[i]==1||col[j]==1)
                {
                    matrix.get(i).set(j, 0);
                }

            }

        }
        return matrix;
    }
}
