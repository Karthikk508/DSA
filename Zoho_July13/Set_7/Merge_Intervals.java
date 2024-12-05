package Set_7;

import java.util.*;

public class Merge_Intervals {

    public static void main(String[] args) {

        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};

       // System.out.println(Arrays.deepToString(merge(intervals)));


    }
    public static void merge(int[][] arr) {


        Arrays.sort(arr, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });




        ArrayList<ArrayList<Integer> > x = new ArrayList<ArrayList<Integer> >();

        int ind = 0;


        ArrayList<Integer> row1 = new ArrayList<>();
        row1.add(arr[0][0]);
        row1.add(arr[0][1]);
        x.add(row1);

        for(int i = 1; i<arr.length; i++)
        {

           if( x.get(ind).get(1) > arr[i][0])  //ans[ind][1]
            {
                //ans[ind][1] = arr[i][1];
                x.get(ind).remove(1);
                x.get(ind).add(1,arr[i][1]);
            }
            else
            {
                ind++;
//                ans[ind][0] = arr[i][0];
//                ans[ind][1] = arr[i][1];
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[i][0]);
                temp.add(arr[i][1]);
                x.add(temp);
            }
        }

        //int [][] ans = x.toArray();


        System.out.println(x);


    }
}
