package SecondRound_2nd_pdfProblems;

public class Qn_22 {

    //Latin square

    public static void main(String[] args) {


        printLatin(5);


    }
    public static void printLatin(int n){

        int k = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j < i ; j++) {
                System.out.print(k++ + " ");
            }
            int  j, l=1;
            for (j = i; j <= n; j++) {
                System.out.print(l++ + " ");
            }
            k = l-1;
            System.out.println();
        }
    }
}
