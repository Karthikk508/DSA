package Set_7;

public class K_Panagrams {


    public static void main(String[] args) {

        String str = "abcdefaaaaaaaaaaaaaaaaaaaa";

        System.out.println(str.length());


        System.out.println(find(20,str));




    }
    public static boolean find(int k , String str )
    {


        int[] freq = new int[26];

        int count = 0 , unique = 0;

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {

                if(freq[str.charAt(i)-'a'] == 0) unique++;

                freq[str.charAt(i)-'a']++;
                count++;
            }

        }

        if(count < 26)
        {
            return false;
        }

        int missing = 26 - unique;


        return missing <= k;


    }

}
