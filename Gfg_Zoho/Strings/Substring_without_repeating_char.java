package Strings;

public class Substring_without_repeating_char {

    public static void main(String[] args) {

        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        int[] arr = new int[128];
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] > 0) {
                if (j < arr[s.charAt(i)]) {
                    j = arr[s.charAt(i)];
                }
            }
            arr[s.charAt(i)] = i + 1;
            if (result < i - j + 1) {
                result = i - j + 1;
            }
        }
        return result;
    }
}





//    public static int lengthOfLongestSubstring(String s) {
//        int result = 0;
//        int[] arr = new int[128];
//        for (int i = 0, j = 0; i < s.length(); i++) {
//            j = (arr[s.charAt(i)] > 0) ? Math.max(j, arr[s.charAt(i)]) : j;
//            arr[s.charAt(i)] = i + 1;
//            result = Math.max(result, i - j + 1);
//        }
//        return result;
//    }
//}


