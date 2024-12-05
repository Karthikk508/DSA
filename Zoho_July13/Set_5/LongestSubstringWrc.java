package Set_5;

public class LongestSubstringWrc {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcde"));

    }
    public static int lengthOfLongestSubstring(String s) {

        int[] arr = new int[128];

        int ans = 0;

        for(int i = 0, j = 0; i<s.length(); i++)
        {
            if(arr[s.charAt(i)] > 0)
            {
                if(j < arr[s.charAt(i)])
                {
                    j = arr[s.charAt(i)];
                }
            }
            arr[s.charAt(i)] = i + 1;

            if(ans < (i-j)+1)
            {
                ans = (i-j)+1;
            }
        }
        return ans;
    }
}
