public class Pascal_triangle {
    public static void main(String[] args) {

        printPascal(5);

    }
    public static void printPascal(int n)
    {
        for(int row = 1; row <= n; row++)
        {
            for (int s = 0; s < n-row; s++) {
                System.out.print(" ");
            }
            int C=1;
            for(int col = 1; col <= row; col++)
            {
                System.out.print(C+" ");
                C = C * (row - col) / col;
            }
            System.out.println();
        }
    }
}
