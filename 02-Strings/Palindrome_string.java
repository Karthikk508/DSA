public class Palindrome_string {

    public static void main(String[] args) {

        String str = "abba";
        System.out.println(isPalindrome(str));
    }
    public static int isPalindrome(String s) {
        // code here

        char[] arr = s.toCharArray();

        int st = 0 , e = s.length()-1;

        while(st<e)
        {
            char temp = arr[st];
            arr[st] = arr[e];
            arr[e] = temp;
            st++; e--;
        }

        String str = String.copyValueOf(arr);

        if(str.equals(s)) return 1;

        return 0;
    }
}