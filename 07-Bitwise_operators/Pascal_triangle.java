public class Pascal_triangle {

    public static void main(String[] args) {

        int n = 5;


        for (int i = 1; i <= n; i++) {
            int c = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
                c = c * (i-j)/j;
            }
            System.out.println();
        }
    }
}
