package Striver;

import java.util.*;

class Combination_sum_2 {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = {1, 1, 1, 2, 2};
        int target = 4;
        Arrays.sort(arr);
        sum(0, target, arr, list, new ArrayList<>());
        System.out.println(list);
    }
    public static void sum(int ind,int target,int[] num,List<List<Integer>> list,List<Integer> ans)
    {
        if(target == 0)
        {
            list.add(new ArrayList<>(ans));
            return;
        }

        for(int i = ind; i<num.length; i++)
        {
            if(i>ind && num[i] == num[i-1]) continue;
            if(num[i] > target) break;

            ans.add(num[i]);
            sum(i+1,target-num[i],num,list,ans);
            ans.remove(ans.size()-1);
        }
    }
}