package Strings;


import java.util.*;

class Permutations_with_duplicate {

    public static void main(String[] args) {

        System.out.println(find_permutation("ABC"));
    }
    public static List<String> find_permutation(String S) {
        // Code here
        List<String> ans = new ArrayList<>();
        permute("",S,ans);
        return ans;
    }
    public static void permute(String p,String up,List<String> ans)
    {
        if(up.isEmpty())
        {
            ans.add(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i = 0; i<=p.length(); i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            permute(f+ch+s,up.substring(1),ans);
        }
    }
}