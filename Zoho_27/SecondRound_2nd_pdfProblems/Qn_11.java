package SecondRound_2nd_pdfProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qn_11 {

    // input : n ;
    // string

    public static void main(String[] args) {
        printString();
    }

    public static void printString()
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        List<String> list = new ArrayList<>();

        while (n > 0)
        {
            String temp = in.next();
            list.add(temp);
            n--;
        }

        String left = "",right = "";

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j+=2) {
                left += list.get(i).charAt(j);
            }
            for (int j = 1; j < list.get(i).length(); j+=2) {
                right += list.get(i).charAt(j);
            }
            System.out.println(left + " " + right);
            left = "";
            right = "";
        }
    }
}
