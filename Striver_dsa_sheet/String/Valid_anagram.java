package String;
class Valid_anagram {

    public static void main(String[] args) {

        System.out.println(isAnagram("anagram","nagaram"));
    }
    public static boolean isAnagram(String s, String t) {

        int[] map = new int[26];

        for(int i = 0; i<s.length(); i++)
        {
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }

        for(int i = 0; i<s.length(); i++)
        {
            if(map[s.charAt(i)-'a'] != 0)
            {
                return false;
            }
        }

        return true;

    }
}