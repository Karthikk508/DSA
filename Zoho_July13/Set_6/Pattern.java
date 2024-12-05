package Set_6;

public class Pattern {

    public static void main(String[] args) {

        //pattern1(5);
        //pattern2(5);
        pattern6(7);


    }
    public static void pattern1(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n)
    {
        for (int i = 0; i < 2*n; i++) {
            int col = (i>n) ? n-(i-n) : i;
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n)
    {
        for (int i = 0; i < 2*n; i++) {
            int col = (i>n) ? n-(i-n) : i;
            for (int j = 0; j < n-col; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n)
    {
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }
    public static void pattern6(int n)
    {
        for (int i = 1; i < 2*n; i++) {

            int spaces = (i>=n) ? ((2*n) - i ) : i;
            int first = (i>=n) ? n+1:i;
            for(int k = 0; k<=spaces; k++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j <= n-first; j++) {
                System.out.print( j+i +" ");
            }
            for (int j = (2*n)-i; j <= n; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
