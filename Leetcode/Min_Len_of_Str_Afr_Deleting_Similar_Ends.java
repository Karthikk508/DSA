public class Min_Len_of_Str_Afr_Deleting_Similar_Ends {

    public static void main(String[] args) {

         String ans = "bbbbbbbbbbbbbbbbbbb";
        System.out.println(count(ans));

    }
    public static int count(String s)
    {
        int start = 0 , end = s.length()-1;
        int size = s.length();
        int mid = size/2;
        int cnt1 = 0 , cnt2 = 0;

        while(start<end && s.charAt(start) == s.charAt(end))
        {


            if(s.charAt(start) == s.charAt(start+1))
            {
                start++; cnt1++;
                continue;
            }
            if(s.charAt(end) == s.charAt(end-1))
            {
                end--; cnt2++;
                continue;
            }
            if(s.charAt(start) == s.charAt(end))
            {
                size = size - 2;
            }
            start++;
            end--;
        }
        return size - (cnt1+cnt2);
    }
}


