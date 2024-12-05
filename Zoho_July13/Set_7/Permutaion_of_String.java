package Set_7;

import java.util.*;

public class Permutaion_of_String {

    public static List<String> find_permutation(int ind,char[] s) {
        // Code here

        Set<String> res = new TreeSet<>();
        find(0, s, res);
        System.out.println(res);
        return new ArrayList<>(res);

    }

    public static void find(int ind,char[] s,Set<String> res)
    {

        if(ind == s.length)
        {
            String ans = String.valueOf(s);
            res.add(ans);
            return;
        }

        for (int i = ind; i<s.length; i++)
        {
            swap(ind,i,s);
            find(ind+1,s,res);
            swap(ind,i,s);
        }
    }
    public static void swap(int i,int j,char[] arr)
    {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        String str = "ABC";

        find_permutation(0,str.toCharArray());
    }
}





//
//
//
//
//   if(p.length() == unique+1) {
//        ans.add(p);
//            return;
//                    }
//
//
//                    for(int i = 0; i<=p.length(); i++)
//        {
//        if(ind > 0 && up.charAt(ind-1) == up.charAt(ind)) continue;
//char ch = up.charAt(ind);
//String f = p.substring(0,i);
//String s = p.substring(i,p.length());
//
//find(ind+1,unique,f+ch+s,up,ans);
//        }
//                }
//public static void main(String[] args) {
//
//
//    System.out.println(find_permutation("ABCC"));
//
//
////
//
//List<String> ans = new ArrayList<>();
//int unique = 0;
//        for (int i = 0; i < S.length()-1; i++) {
//        if(S.charAt(i) != S.charAt(i+1)) unique++;
//        }
//find(0,unique,"",S,ans);
//        Collections.sort(ans);
//        return ans;