package SecondRound_2nd_pdfProblems;

//Pattern print

public class Qn_12 {
    // Qn  after 16
    public static void main(String[] args) {


        int[][] matrix = {
                {1, 0, 1, 0, 0},
                {1, 1, 1, 1, 1},
                {0, 0, 0, 1, 0},
                {1, 0, 1, 1, 1},
                {0, 1, 1, 0, 1}
        };

        printPaths("",0,0,matrix);
    }

    private static void printPaths(String path,int row,int col,int[][] matrix) {


        if(row == matrix.length-1 && col == matrix[0].length-1)
        {
            System.out.println(path);
            return;
        }

        if(row == matrix.length || col == matrix[0].length)
        {
            return;
        }
        if(matrix[row][col] == 0){
            return;
        }

        printPaths(path+'D',row+1,col,matrix);     //down
        printPaths(path+'R',row,col+1,matrix);      //right
     }


}

