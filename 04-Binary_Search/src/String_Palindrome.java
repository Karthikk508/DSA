import java.util.Scanner;

public class String_Palindrome {

    public static void main(String[] args) {

        String in = "aba";
        String rev = "";

        for(int i=0; i<in.length(); i++)
        {
            rev = rev + in.charAt(i);
        }
        System.out.println(rev);

        if(rev.equals(in)) System.out.println("True");
        else System.out.println("false");
    }
}
