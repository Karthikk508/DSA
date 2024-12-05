package Practice;

public class SudukoSolver {

    public static void main(String[] args) {


        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
            System.out.println(solve(board));
        } else {
            System.out.println("Cannot solve");
        }


    }
    public static boolean solve(int[][] board)
    {
        int r = - 1 , c = - 1;
        boolean flag = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 0)
                {
                    r = i;
                    c = j;
                    flag = false;
                    break;
                }
                if(!flag) break;
            }
        }
        if(flag)
        {
            return true;
        }

        for (int num = 1; num <=9 ; num++) {

            if(isValid(board,num,r,c))
            {
                board[r][c] = num;

                if(solve(board))
                {
                    return true;
                }
                else
                {
                    board[r][c] = 0;
                }
            }
        }

        return false;
    }

    private static boolean isValid(int[][] board,int num, int r, int c) {

        //Box
        int n = board.length;
        int sqrt = (int) Math.sqrt(n);
        int rowStart = r - r % sqrt;
        int colStart = c - c % sqrt;

        for (int i = rowStart; i < rowStart+sqrt; i++) {
            for (int j = colStart; j < colStart+sqrt ; j++) {
                if(board[i][j] == num)
                {
                    return false;
                }
            }
        }
        //Vertical
        for (int i = 0; i < n; i++) {
            if(board[i][c] == num)
                return false;
        }
        //Horizontal
        for (int i = 0; i < board[0].length; i++) {
            if(board[r][i] == num)
                return false;
        }
        return true;
    }
    private static void display(int[][] board) {

        for (int[] row : board) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
