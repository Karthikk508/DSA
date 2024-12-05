package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class All_subseq {

    public static void main(String[] args) {

        int[] arr = {1,2,1};
        //print(0,new ArrayList<>(),0,2,arr,arr.length);
        System.out.println(only_one(0,new ArrayList<>(),0,20,arr,arr.length));

        System.out.println(count(0,new ArrayList<>(),0,2,arr,arr.length));
    }
    public static void print(int ind, List<Integer> ds, int s, int sum, int[] arr, int n)
    {
        if(ind == n)
        {
            if(s == sum)
            {
                System.out.println(ds);
            }
            return;
        }
        ds.add(arr[ind]);
        s += arr[ind];

        print(ind+1,ds,s,sum,arr,n);

        s -= arr[ind];
        ds.remove(ds.size()-1);

        print(ind+1,ds,s,sum,arr,n);
    }
    public static boolean only_one(int ind, List<Integer> ds, int s, int sum, int[] arr, int n)
    {
        if(ind == n)
        {
            if(s == sum)
            {
                System.out.println(ds);
                return true;
            }
            return false;
        }
        ds.add(arr[ind]);
        s += arr[ind];

        if(only_one(ind+1,ds,s,sum,arr,n))
            return true;

        s -= arr[ind];
        ds.remove(ds.size()-1);

        if(only_one(ind+1,ds,s,sum,arr,n))
            return true;

        return false;
    }
    public static int count(int ind, List<Integer> ds, int s, int sum, int[] arr, int n)
    {
        if(ind == n)
        {
            if(s == sum)
            {
                System.out.println(ds);
                return 1;
            }
            return 0;
        }
        ds.add(arr[ind]);
        s += arr[ind];

        int first = count(ind+1,ds,s,sum,arr,n);


        s -= arr[ind];
        ds.remove(ds.size()-1);

        int second = count(ind+1,ds,s,sum,arr,n);


        return first + second;
    }
}
