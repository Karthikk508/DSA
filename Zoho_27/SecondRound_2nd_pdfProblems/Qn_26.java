package SecondRound_2nd_pdfProblems;

public class Qn_26 {

    public static void main(String[] args) {


        System.out.println(is_palindrome(121));


    }
    public static String is_palindrome(int n)
    {
        // Code here
        int num = 0 , temp = n;

        while(temp > 0){
            int digit = temp % 10;
            num = (num*10)+digit;
            temp /= 10;
        }

        if(num == n) return "Yes";

        return "No";
    }
}
