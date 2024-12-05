package Subset;

import java.util.ArrayList;

public class Subset_2_with_duplicates {

    public static void main(String[] args) {

        generate(new int[] {1,2,2});



    }
    public static void generate(int[] arr)
    {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        int start = 0;
        int end = 0;

        for(int i = 0; i<arr.length; i++)
        {
            int n = outer.size();

            start = 0;

            if(i>0 && arr[i-1] == arr[i])
            {
                start = end + 1;
            }

            end = n-1;

            for(int j = start; j<n; j++) {
                ArrayList<Integer> inner = new ArrayList<>(outer.get(j));
                inner.add(arr[i]);
                outer.add(inner);
            }
        }

        System.out.println(outer);
    }


}
