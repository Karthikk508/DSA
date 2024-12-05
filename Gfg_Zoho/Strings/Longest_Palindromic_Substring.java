package Strings;

public class Longest_Palindromic_Substring {

    public static void main(String[] args) {

        String s = "a";

        System.out.println(longestPalindrome(s));


    }
    public static String solve(String s, int start, int end) {

        while (start >= 0 && end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                start--;
                end++;
            } else {
                break;
            }
        }
        String ans = s.substring(start + 1, end);

        return ans;


    }

    public static String longestPalindrome(String s) {
        // code here

        int size = 0;
        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            String temp = solve(s, i, i);

            if (temp.length() > size) {
                ans = temp;
                size = temp.length();
            }

            temp = solve(s, i, i + 1);

            if (temp.length() > size) {
                ans = temp;
                size = temp.length();
            }
        }

        return ans;
    }
}