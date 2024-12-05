import java.util.ArrayList;
import java.util.Iterator;

public class Matrix_to_adj {

    public static void main(String[] args) {

        int[][] mat = {{1, 1, 0},
                       {1, 1, 0},
                       {0, 0, 1}};

        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            adjLs.add(new ArrayList<>());
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1 && i != j) {
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }

        System.out.println(adjLs);

    }
}
