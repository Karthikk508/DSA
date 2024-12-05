package Recursion.Medium;

import java.util.ArrayList;
import java.util.List;

public class Print_all_subseq {

    public static void main(String[] args) {

        int[] arr = {1,2,1};
        List<Integer> ds = new ArrayList<>();

        prints(0,0,2,arr,false,ds);
    }
    public static void prints(int ind,int sum, int target, int[] arr, boolean k, List<Integer> ds)
    {
        if(ind == arr.length)
        {
            if(sum == target)
            {
                System.out.println(ds);
            }
            return;
        }
        prints(ind+1,sum+arr[ind],target,arr,ds.add(arr[ind]),ds);
        ds.remove(ds.size()-1);

        prints(ind+1,sum,target,arr,true,ds);
    }
}
