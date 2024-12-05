package Set_1;

import java.util.ArrayList;
import java.util.List;


public class WordsFromNumbers {

    public static void main(String[] args) {

        generate(0, "", "2618");
    }

    public static void generate(int ind, String p, String s) {
        if (ind == s.length()) {
            System.out.println(p);
            return;
        }
        for (int i = ind; i < s.length(); i++) {
            if (isValid(s, ind, i)) {
                String next = p + convert(s.substring(ind, i + 1));
                generate(i + 1, next, s);
            }
        }
    }

    public static boolean isValid(String s, int ind, int i) {
        int in = Integer.parseInt(s.substring(ind, i + 1));
        return in >= 1 && in <= 26;
    }

    public static String convert(String s) {
        int in = Integer.parseInt(s);
        char c = (char) (64 + in);
        return String.valueOf(c);
    }
}
