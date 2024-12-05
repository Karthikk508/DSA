package Striver;

class Test {

    public static void main(String[] args) {

        String str = "CCCCDDDD";

        System.out.println(minLength(str));
    }
    public static int minLength(String s) {

        int[] ans = {0};

        if(s.length() == 1) return 1;

        operation008(ans,false,s);

        return ans[0];

    }
    public static void operation008(int[] ans,boolean flag,String s)
    {
        if(flag)
        {
            System.out.println(s);
            ans[0] = s.length();
            return;
        }

        String str = "";
        flag = true;

        for(int i = 0; i<s.length()-1; i++)
        {
            if(s.charAt(i) == 'A' && s.charAt(i+1) == 'B')
            {
                i++;
                flag = false;
                continue;
            }
            if(s.charAt(i) == 'C' && s.charAt(i+1) == 'D')
            {
                i++;
                flag = false;
                continue;
            }
            str += s.charAt(i);
            if(i+1 == s.length()-1) str += s.charAt(i+1);
        }
        operation008(ans,flag,str);
    }
}