package EasyLeetcode;

public class RansomNote {

    public static void main(String[] args) {

        System.out.println(canConstruct("aa","aab"));


    }
    public static boolean canConstruct(String r, String m) {

        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i = 0; i<r.length(); i++)
        {
            arr1[r.charAt(i) - 'a']++;
        }
        for(int j = 0; j<m.length(); j++)
        {
            arr2[m.charAt(j) - 'a']++;
        }

        for(int i = 0; i<r.length(); i++)
        {
            if( arr2[r.charAt(i) - 'a'] == 0 || !(arr1[r.charAt(i) - 'a'] <= arr2[r.charAt(i) - 'a']) )
            {
                return false;
            }
        }
        return true;

    }
}
