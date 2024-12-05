package Strings;

public class Change_to_Uppercase {

    public static void main(String[] args) {

        String s = "cg ax uv dm snjc ws a x nkr wdh ofni x bgxod m m r x kus a yap ajil bvmckzgnonlwuz azuvb";
        System.out.println(s.length());
        System.out.println(transform(s));


    }

    public static String transform(String s)
    {
        // code here
        return upper(s,"",0);
    }
    public static String upper(String k,String ans ,int i)
    {
        if(k.length() == i)
        {
            return ans;
        }
        else
        {
            ans += Character.toUpperCase(k.charAt(i));
            return upper(k,ans,i+1);
        }
    }

}
