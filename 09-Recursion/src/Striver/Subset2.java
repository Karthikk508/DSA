package Striver;

import java.util.ArrayList;
import java.util.List;

public class Subset2 {

    public static void main(String[] args) {

        List<List<Integer>> ans = new ArrayList<>();

        int[] arr = {1,2,3,4};


        subset2(0,arr,new ArrayList<>(),ans);

        System.out.println(ans);




    }
    public static void subset2(int ind, int[] arr, List<Integer> ds,List<List<Integer>> ans)
    {
        ans.add(new ArrayList<>(ds));

        for (int i = ind; i < arr.length; i++) {

            if(ind != i && arr[i-1] == arr[i]) continue;
            ds.add(arr[i]);

            subset2(i+1,arr,ds,ans);
            ds.remove(ds.size()-1);
        }
    }
}
