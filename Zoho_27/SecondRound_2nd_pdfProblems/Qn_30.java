package SecondRound_2nd_pdfProblems;

public class Qn_30 {


//                  4 4 4 4 4 4 4
//                  4 3 3 3 3 3 4
//                  4 3 2 2 2 3 4
//                  4 3 2 1 2 3 4
//                  4 3 2 2 2 3 4
//                  4 3 3 3 3 3 4
//                  4 4 4 4 4 4 4

    public static void main(String[] args) {

        print(5);

    }
    public static void print(int n){


        for (int i = 0; i <= (n*2)-2; i++) {
            for (int j = 0; j <= (n*2)-2; j++) {

                int x = (i >= n) ? ((2*n)-2)-i : i;
                int y = (j >= n) ? ((2*n)-2)-j : j;
                int m = n - Math.min(x, y);

                if(m % 2 == 0){
                    System.out.print(0 + " ");
                }
                else {
                    System.out.print(1 + " ");
                }
        }
            System.out.println();
        }
    }
}
