package Striver;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_partitions {

    public static void main(String[] args) {

        String s = "aaa";
        System.out.println(isPalindrome(s,0,2));
        List<List<String>> ans = new ArrayList<>();
        partition("aabb",0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
    public static void partition(String s, int ind, List<String> path, List<List<String>> res)
    {

        if(ind == s.length())
        {
            res.add(new ArrayList<>(path));
            System.out.println(path);
            return;
        }
        for (int i = ind; i < s.length(); i++) {
            if(isPalindrome(s,ind,i))
            {
                path.add(s.substring(ind,i+1));
                partition(s,i+1,path,res);
                path.remove(path.size()-1);
            }
        }
    }
    private static boolean isPalindrome(String s,int start,int end) {

        while(start<=end)
        {
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
}
