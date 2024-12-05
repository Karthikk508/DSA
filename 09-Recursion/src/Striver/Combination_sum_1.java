package Striver;

import java.util.ArrayList;

public class Combination_sum_1 {

    public static void main(String[] args) {

        int[] arr = {2,3,6,7};
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        sum(0,7,arr,list,new ArrayList<>());
        System.out.println(list);
    }


    public static void sum(int ind, int target, int[] num ,ArrayList<ArrayList<Integer>> list, ArrayList<Integer> ans)
    {
        if(ind == num.length)
        {
            if(target == 0) {
                list.add(new ArrayList<>(ans));
            }
            return;
        }
        if(target >= num[ind])
        {
            ans.add(num[ind]);
            sum(ind,target-num[ind],num,list,ans);
            ans.remove(ans.size()-1);
        }
        sum(ind+1,target,num,list,ans);
    }
}


