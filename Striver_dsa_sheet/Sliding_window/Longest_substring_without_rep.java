package Sliding_window;

public class Longest_substring_without_rep {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcdefb"));


    }
    public static int lengthOfLongestSubstring(String s) {

        int[]  arr = new int[128];
        int res = 0;

        for(int i = 0, j = 0; i<s.length(); i++)
        {
            if(arr[s.charAt(i)] > 0)
            {
                if(j < arr[s.charAt(i)])
                {
                    j = arr[s.charAt(i)];
                }
            }

            arr[s.charAt(i)] = i+1;

            if(res < (i-j)+1)
            {
                res = (i-j)+1;
            }
        }

        return res;
    }
}
