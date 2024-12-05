package Set_5;
class WordPattern {

    public static void main(String[] args) {

        System.out.println(wordPattern("abba","dog cat cat dog"));
    }
    public static boolean wordPattern(String p, String s) {

        String[] arr = new String[26];
        int k  = 0;

        for(int i = 0; i<p.length(); i++)
        {

            String temp = "";

            while(k< s.length() && s.charAt(k) != ' ')
            {
                temp += s.charAt(k);
                k++;
            }

            if(arr[p.charAt(i) - 'a'] == null)
            {
                arr[p.charAt(i) - 'a'] = temp;
            }
            else
            {
                if(arr[p.charAt(i) - 'a'].equals(temp))
                {
                    arr[p.charAt(i) - 'a'] = temp;
                }
                else
                {
                    return false;
                }
            }
            k++;

        }
        return true;
    }
}