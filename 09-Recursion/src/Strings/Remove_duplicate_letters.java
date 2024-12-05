package Strings;

public class Remove_duplicate_letters {

    public static void main(String[] args) {

        String s = "abacdefc";
        System.out.println(removeDuplicateLetters(s));
    }
    public static String removeDuplicateLetters(String s) {

        int[] cnt = new int[26];
        int[] used = new int[26];
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()) {
            cnt[ch - 'a']++;
        }

        for (char ch : s.toCharArray()) {
            cnt[ch - 'a']--;
            if (used[ch - 'a']++ > 0) continue;
            while (!res.isEmpty() && res.charAt(res.length() - 1) > ch && cnt[res.charAt(res.length() - 1) - 'a'] > 0)
            {
                used[res.charAt(res.length() - 1) - 'a'] = 0;
                res.deleteCharAt(res.length() - 1);
            }
            res.append(ch);
        }
        return res.toString();
    }
}