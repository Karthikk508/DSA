public class ValidPalindrome{

    public static void main(String[] args) {

        System.out.println(isPalindrome("0P"));



    }
    public static boolean isPalindrome(String s) {

        String str = "";

        for(int i = 0; i<s.length(); i++)
        {

            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' ||  s.charAt(i) >= '0' && s.charAt(i) <= '9')
            {
                if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
                {
                    char k = s.charAt(i);
                    k = Character.toLowerCase(k);
                    str += k;
                }
                else if(s.charAt(i) >= '0' && s.charAt(i) <= '9')
                {
                    str += s.charAt(i);
                }
                else
                {
                    str += s.charAt(i);
                }
            }
        }
        boolean flag = check(str);

        return flag;
    }
    public static boolean check(String str)
    {
        int start = 0 , end = str.length() - 1;

        while(start <= end)
        {
            if(str.charAt(start) != str.charAt(end))
            {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
