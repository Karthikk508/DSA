package PreviousQuestions;

public class Pattern {

    public static void main(String[] args) {

        String n = "zoho";

        print(n);


    }
    public static void print(String s) {

        if (s.length() % 2 == 0) {
            String ans = s.substring(0, s.length() / 2) + "*" + s.substring(s.length() / 2, s.length());
            s = ans;
        }
        int n = s.length() / 2;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == n) {
                    System.out.print(s.charAt(j));
                } else if (i == j || s.length() - 1 - i == j || j == n) {
                    System.out.print(s.charAt(i));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
