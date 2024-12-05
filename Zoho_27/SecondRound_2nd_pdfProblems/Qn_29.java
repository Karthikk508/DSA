package SecondRound_2nd_pdfProblems;

public class Qn_29 {

    public static void main(String[] args) {

        print(5);
        
    }
    public static void print(int n){

        int m = 1, num = n * (n-1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < ((n-1)-i) ; j++) {
                System.out.print((m++) + " ");
            }
            int k = num - (m-2);
            for (int j = 0; j < ((n-1)-i) ; j++) {
                System.out.print((k++) + " ");
            }
            System.out.println();
        }
    }
}
