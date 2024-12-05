package SecondRound_2nd_pdfProblems;

public class Qn_20 {

    //Josephus problem

    public static void main(String[] args) {

        int n = 7;
        int k = 2;

        System.out.println(recursion(n, k) + 1);
    }

    private static int recursion(int n, int k) {
        
        if (n == 1) {
            return 0;
        }

        return (recursion(n - 1, k) + k) % n;

    }


}
