package SecondRound_2nd_pdfProblems;

public class Qn_18 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, -1, -1, 1},
                {-1, -1, 1, -1},
                {-1, -1, -1, -1},
                {-1, 1, -1, -1}
        };

        printIslands(matrix);

    }
    public static void printIslands(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == 1) {
                    if (checkIsland(i,j,matrix)) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }

    private static boolean checkIsland(int i,int j,int[][] matrix) {

        int row = i , col = j;

        // up
        row--;
        if(row < 0 || matrix[row][col] == 1){
            return false;
        }
        row = i;

        // down
        row++;
        if(row >= matrix.length || matrix[row][col] == 1){
            return false;
        }
        row = i;

        //left
        col--;
        if(col < 0 || matrix[row][col] == 1){
            return false;
        }
        col = j;

        //right

        col++;
        if (col >= matrix[0].length || matrix[row][col] == 1) {
            return false;
        }

        return true;
    }
}
