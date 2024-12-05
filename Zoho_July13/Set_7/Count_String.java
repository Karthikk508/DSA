package Set_7;

public class Count_String {

    public static void main(String[] args) {

        System.out.println(encode("abcdeeefgggh"));


    }
    public static String encode(String s) {
        // code here

        int count = 1 , i;

        String ans = "";

        for(i = 1; i<s.length(); i++)
        {
            if(s.charAt(i-1) == s.charAt(i))
            {
                count++;
            }
            else {
                ans += (s.charAt(i-1) + "" + count);
                count = 1;
            }
        }
        ans += (s.charAt(i-1) + "" + count);

        return ans;
    }
}
