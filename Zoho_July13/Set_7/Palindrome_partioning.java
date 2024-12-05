package Set_7;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_partioning {

    public static void main(String[] args) {


        String str = "aabb";

        List<String> ans = new ArrayList<>();
        palindrome(0,str,new ArrayList<>(),ans);



    }
    public static void palindrome(int ind, String str,List<String> path, List<String> ans)
    {
        if(ind == str.length())
        {
            System.out.println(path);
            return;
        }

        for (int i = ind; i < str.length(); i++) {

            if(isValid(ind,i,str))
            {
                path.add(str.substring(ind,i+1));
                palindrome(i+1,str,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    public static boolean isValid(int i ,int j,String s)
    {
        while (i <= j)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
