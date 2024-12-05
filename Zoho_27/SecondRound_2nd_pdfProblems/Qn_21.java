package SecondRound_2nd_pdfProblems;

public class Qn_21 {


    //Snake pattern


    public static void main(String[] args) {

        print();

    }
    public static void print(){

        int k = 1 , n = 8;

        for (int i = 0; i < n; i++) {

            int start = (i%2 == 0) ? 0 : n;

            for (int j = start; j < n; j++) {
                System.out.print(k + " ");
                k++;
            }
            for (int j = start; j > 0; j--) {
                System.out.print(k + " ");
                k--;
            }
            k += (k%2 == 0) ?  (n+1) : (n-1);

            System.out.println();

        }
    }
}
