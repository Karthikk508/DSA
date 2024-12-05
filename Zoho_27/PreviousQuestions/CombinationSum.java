package PreviousQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {


    public static void findSum(int target,int ind, int sum, int[] arr, ArrayList<Integer> track, ArrayList<ArrayList<Integer>> list){


        if(sum == target){
            list.add(new ArrayList<>(track));
            return;
        }

        if(ind == arr.length){
            return;
        }


        track.add(arr[ind]);

        findSum(target,ind+1,sum+arr[ind],arr,track,list);
        track.removeLast();
        findSum(target,ind+1,sum,arr,track,list);
    }

    public static void main(String[] args) {


        int[] arr = {2,3,5,8,3};

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        findSum(8,0,0,arr,new ArrayList<>(),list);

        System.out.println(list);

    }
}
