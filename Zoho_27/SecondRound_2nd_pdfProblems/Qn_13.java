package SecondRound_2nd_pdfProblems;

import java.util.Arrays;

public class Qn_13 {

    public static void main(String[] args) {

        print();

    }
    public static void print()
    {
        String str = "geeksforgeeks";

        int ind = 0 , ind1 = 0 , n = str.length()-1;


        for (int i = 0; i < str.length(); i++) {

            int x = (i < n / 2) ? i : n - i;

            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            System.out.print(str.charAt(ind++));

            int y = (i < n /2) ? n - i : (n - (x+(n-i)));

            int z = (i < n /2) ? x : 0;

            for (int j = z; j < y-1; j++) {
                System.out.print(" ");
            }
            if(ind1 != (str.length() / 2) + (str.length() % 2)-1)
            {
                System.out.println(str.charAt(ind1++));
            }
            else {
                ind1++;
                System.out.println();
            }
        }
    }
}


//
//int x = (i > n /2) ? i : n - i;
//
//
//
//            for (int j = 0; j < i ; j++) {
//        System.out.print(" ");
//            }
//                    System.out.print(str.charAt(ind++));
//
//        for (int j = i; j <= x ; j++) {
//        System.out.print(" ");
//            }
//                    System.out.println(str.charAt(ind1++));
