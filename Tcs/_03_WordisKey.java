import java.util.*;

public class _03_WordisKey {

    public static void main(String[] args) {

        String s[] = {"Break", "case", "continue", "default", "defer", "else", "for","func", "goto", "if", "map", "range", "return", "struct", "type", "var"};


        Scanner in = new Scanner(System.in);

        String n = in.nextLine();

        int flag = 1;

        for(String k : s)
        {
            if(k.equals(n)) {
                flag = 0;
            }
        }

        if(flag == 0)
        {
            System.out.println("Keyword");
        }
        else {

            System.out.println("Not a keyword");
        }

    }
}