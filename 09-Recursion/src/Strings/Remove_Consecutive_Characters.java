package Strings;
//
//public class Remove_Consecutive_Characters {
//
//    public static void main(String[] args) {
//
//        String s = "aabbb";
//        String ans = "";
//
//        for(int i = 0; i<s.length()-1; i++)
//        {
//            if(s.charAt(i) != s.charAt(i+1))
//            {
//                ans += s.substring(i,i+1);
//            }
//
//        }
//        System.out.println(ans);
//        System.out.println(s);
//    }
//}


// Java program to remove consecutive
// duplicates from a given string.
import java.util.*;

class GFG {

    // A iterative function that removes
    // consecutive duplicates from string S
    static void removeDuplicates(char[] S)
    {
        int n = S.length;

        // We don't need to do anything for
        // empty or single character string.
        if (n < 2) {
            return;
        }

        // j is used to store index is result
        // string (or index of current distinct
        // character)
        int j = 0;

        // Traversing string
        for (int i = 1; i < n; i++) {
            // If current character S[i]
            // is different from S[j]
            if (S[j] != S[i]) {
                j++;
                S[j] = S[i];
            }
        }

        String string = new String(S);

        System.out.println(string);
        System.out.println(Arrays.copyOfRange(S, 0, j + 1));
    }

    // Driver code
    public static void main(String[] args)
    {
        char S1[] = "geeksforgeeks".toCharArray();
        removeDuplicates(S1);

        char S2[] = "aabcca".toCharArray();
        removeDuplicates(S2);
    }
}

/* This code contributed by PrinciRaj1992 */
