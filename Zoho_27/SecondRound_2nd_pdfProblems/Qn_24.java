package SecondRound_2nd_pdfProblems;

public class Qn_24 {


    public static void main(String[] args) {



        permutation("","abcd");


    }
    public static void permutation(String p,String up){


        if(up.isEmpty()){

            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i = 0; i < p.length()+1; i++) {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            permutation(f+ch+s,up.substring(1));
        }
    }
}