package Strings;

public class Check_if_frequencies_can_be_equal {

    public static void main(String[] args) {

        String s = "aabccdd";
        System.out.println(sameFreq(s));

    }
    public static boolean sameFreq(String s) {

        int n = s.length();
        int[] arr = new int[26];
        int max = 0;
        int unique = 0;

        for (int i = 0; i < n; i++) {
            if (arr[s.charAt(i) - 'a'] == 0) {
                unique++;
            }
            arr[s.charAt(i) - 'a']++;
            max = Math.max(max, arr[s.charAt(i) - 'a']);
        }

        int x = 0, y = 0, z = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                if (arr[i] == max) {
                    x++;
                }
                if (arr[i] == 1) {
                    z++;
                }
                if (arr[i] == max - 1) {
                    y++;
                }
            }
        }

        if (x == unique || y == unique - 1 || ((x == unique - 1) && (z == 1))) {
            return true;
        }
        return false;
    }

}
