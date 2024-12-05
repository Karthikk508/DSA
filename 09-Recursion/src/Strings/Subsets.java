package Strings;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String[] args) {

        int[] arr = {1,2,2};
        System.out.println(subset(arr));
        System.out.println(subset_with_duplicates(arr));
        System.out.println(recursive(arr));

    }
    static List<List<Integer>> subset (int[] arr)
    {
       List<List<Integer>> outer = new ArrayList<>();
       outer.add(new ArrayList<>());

       for (int num : arr)
       {
           int n = outer.size();
           for (int i = 0; i < n; i++) {
               List<Integer> inner = new ArrayList<>(outer.get(i));
               inner.add(num);
               outer.add(inner);
           }
       }

       return outer;
    }

    ///With duplicates
    static List<List<Integer>> subset_with_duplicates(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for (int i = 0; i < arr.length; i++) {
            start = 0;
            int n = outer.size();
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
    public static List<List<Integer>> recursive(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private static void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}

//
//List<List<Integer>> outer = new ArrayList<>();
//        outer.add(new ArrayList<>());
//
//        for(int num : arr)
//        {
//int n = outer.size();
//            for (int i = 0; i < n; i++) {
//
//ArrayList<Integer> inner = new ArrayList<>(outer.get(i));
//                inner.add(num);
////              System.out.println(inner);
//                System.out.println(outer);
//                outer.add(inner);
//            }
//          }
//
//         return outer;