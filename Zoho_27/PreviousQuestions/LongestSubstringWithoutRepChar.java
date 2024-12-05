package PreviousQuestions;

public class LongestSubstringWithoutRepChar {


    public static void find(String str){


        int[] freq = new int[26];

        int ans = 0;


        for (int i = 0 ,j = 0; i < str.length(); i++) {

            if(freq[str.charAt(i) - 'a'] > 0){

                if(j < freq[str.charAt(i)-'a']){

                    j = freq[str.charAt(i)-'a'];
                }

            }
            freq[str.charAt(i)-'a'] = i+1;

            if(ans < (i-j)+1){
                ans = (i-j) + 1;
            }
        }

        System.out.println(ans);






    }

    public static void main(String[] args) {


        String str = "aabbabcdefghijkaa";

        find(str);

    }
}
