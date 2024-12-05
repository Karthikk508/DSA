import java.util.concurrent.LinkedBlockingDeque;

public class Practice {

    public static void main(String[] args) {
        int n  = 5;
        print(n);
    }
    public static void print(int n)
    {
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < 2*i; j++) {
                System.out.print(j);
            }
            for (int j = (2*i)-2; j >=i; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
