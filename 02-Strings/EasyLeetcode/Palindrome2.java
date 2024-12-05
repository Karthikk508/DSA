package EasyLeetcode;

class Palindrome2  {

    public static void main(String[] args) {

        System.out.println(validPalindrome("cbbcc"));


    }
    public static boolean validPalindrome(String s) {

        int start = 0 , end = s.length()-1;

        boolean flag = true;
        int count = 1;

        while(start < end)
        {
            if(s.charAt(start) == s.charAt(end))
            {
                start++;
                end--;
            }
            else if(count != 0 && s.charAt(start) != s.charAt(end))
            {
                count--;
                start++;
            }
            else if(count == 0 && s.charAt(start) != s.charAt(end))
            {
                flag = false;
                break;
            }
        }

        if(flag) return true;

        start = 0 ; end = s.length()-1;
        count = 1;

        flag = true;

        while(start < end)
        {
            if(s.charAt(start) == s.charAt(end))
            {
                start++;
                end--;
            }
            else if(count != 0 && s.charAt(start) != s.charAt(end))
            {
                count--;
                end--;
            }
            else if(count == 0 && s.charAt(start) != s.charAt(end))
            {
                flag = false;
                break;
            }
        }

        return flag;

    }
}