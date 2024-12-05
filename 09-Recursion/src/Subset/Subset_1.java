package Subset;

import java.util.ArrayList;
import java.util.List;

public class Subset_1 {

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        subset_rec(arr,0,new ArrayList<>(),true ,new ArrayList<>());

    }

    private static void subset_rec(int[] arr,int i,List<Integer> list,boolean k,List<List<Integer>> ans) {

        if(i == arr.length)
        {
            ans.add(list);
            System.out.println(list);
            list.removeAll(list);
            return;
        }

        subset_rec(arr,i+1,list,list.add(arr[i]),ans);
        subset_rec(arr,i+1,list,false,ans);

    }
}
