import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        int n = 8;
        //pattern11(n);
//        int l = binomialCoeff(8,4);
//        System.out.println(l);

        pattern30(2,6);
    }
    public static void pattern1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n) {

        for (int i = 1; i <= 2*n; i++) {
           int total_column = i>=n ? (2*n)-i:i;
            for (int j = 1; j <= total_column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n)
    {
        for (int row = 0; row <= n; row++) {
            int spaces = n-row;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                int spaces = n - i;
                for (int s = 0; s < spaces; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    int mid = i/2;
                    if(j<=mid)
                    System.out.print((mid+1)-j+" ");
                    else {
                        System.out.print(j-(mid+1)+" ");
                    }

                }
                System.out.println();
            }
        }
    }

    public static void pattern8(int n)
    {
        for (int row = 0; row < n; row++) {
            int spaces = n-row;
            for(int s=0; s<spaces; s++)
            {
                System.out.print("  ");
            }
            for (int col = row; col >=0 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    public static void pattern9(int n)
    {
        int original = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int at_Every_index = original-Math.min(Math.min(row,col),Math.min(n-col,n-row));

                System.out.print(at_Every_index);
            }
            System.out.println();
        }
    }
    public static void pattern10(int n)
    {
        for (int row = 0; row <= n; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= n-row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n)
    {
        for (int row = 0; row <= n; row++) {
            int spaces = n-row;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row+row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern12(int n)
    {
        System.out.println(12);
        for (int row = 0; row <= n; row++) {
            for (int s = 0; s < row; s++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= 2*n-(row+row); col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern13(int n)
    {
        System.out.println(13);
        for (int row = 0; row <= 2*n; row++) {

            int index = row>n ? (2*n)-row : row;
            for (int s = 0; s < 2*n-index; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= index; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern14(int n)
    {
        for (int row = 0; row < 2*n; row++) {

            int index = row<=n ? (2*n)-row : row;

            for (int s = 0; s < 2*n-index; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= index-n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern_a11(int n)
    {
        for(int row = 0; row<n; row++)
        {
            int spaces = n-row;
            for (int s = 0; s <= spaces; s++) {
                System.out.print("  ");
            }
            for (int col = 0; col <= row+row; col++) {
                if(row == n-1)
                    System.out.print("* ");
                else if(col==0 || col == row+row )
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void pattern_a15(int n)
    {
        for(int row = 1; row<=2*n; row++)
        {
            int c = row>n ? 2*n-row : row;

            for (int s = 0; s < n-c; s++) {
                System.out.print("  ");
            }
            for(int col = c; col >= 1; col--)
            {
                if(col == c) {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            for(int col = 1; col<c; col++)
            {
                if(col == c-1) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern_a16 (int n)
    {
        for (int row = 0; row < n; row++) {

            for (int s = 0; s < n-row; s++) {
                System.out.print(" ");
            }
            for (int i = 0; i <= row; i++)
                System.out.print(binomialCoeff(row, i)+" ");

            System.out.println();
        }
    }
    public static int binomialCoeff(int n, int k)
    {
        int res = 1;

        if (k > n - k)
            k = n - k;

        for (int i = 0; i < k; ++i)
        {
            res *= (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void patterna_17(int n)
    {

        for (int row = 1; row < 2*n; row++) {
            
            int c = row > n ? 2*n-row : row ;

            for (int spaces = 0; spaces < n-c; spaces++) {
                System.out.print("  ");
            }

            for (int col = c; col > 0; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <=c ; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    public static void pattern28(int n) {
        System.out.println(28);
        for (int i = 1; i <= 2*n; i++) {
            int total_column = i>=n ? (2*n)-i:i;
            int spaces = n-total_column;
            for (int s = 0; s<spaces; s++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= total_column; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n, int m) {
        for (int i = 0; i < n * 2 - 1; i++) {
            for (int j = 0; j < m * 2 - 1; j++) {
                //int left = j;
                //int top = i;
                int right = m * 2 - j - 2;
                int bottom = n * 2 - i - 2;

                int min = Math.min(Math.min(j, i), Math.min(right, bottom));
                if (min % 2 == 0) {
                    System.out.print("X ");
                } else {
                    System.out.print("O ");
                }

            }

            System.out.println();
        }
    }
}

