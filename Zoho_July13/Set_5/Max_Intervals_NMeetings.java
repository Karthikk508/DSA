package Set_5;

import java.util.ArrayList;
import java.util.Arrays;

public class Max_Intervals_NMeetings {

    public static void main(String[] args) {

        int[] Entry = {1, 2,10, 5, 5};
        int[] Exit = {4, 5, 12, 9, 12};


        int n = 5;

        meetings(Entry,Exit,n);


    }
    public static void meetings(int[] start, int[] end,int n)
    {

        // Finding maximum starting time
        int maxa = Arrays.stream(start).max().getAsInt();

        // Finding maximum ending time
        int maxb = Arrays.stream(end).max().getAsInt();

        int maxc = Math.max(maxa,maxb);

        int []x = new int[maxc + 2];
        Arrays.fill(x, 0);

        int cur=0,idx=0;

        // Creating an auxiliary array
        for(int i = 0; i < n; i++)
        {
            // Lazy addition
            ++x[start[i]];
            --x[end[i]+1];
        }

        int maxy=Integer.MIN_VALUE;

        //Lazily Calculating value at index i
        for(int i = 0; i <= maxc; i++)
        {
            cur+=x[i];
            if(maxy < cur)
            {
                maxy = cur;
                idx = i;

            }
        }
        System.out.println("Maximum value is:"+
                maxy+" at position: "+idx+"");


    }

    ///Better solution using sorting

//    Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//    ArrayList<Integer> ans = new ArrayList<>();
//
//    int count = 0 , max = 0 ,time = arr1[0];
//    int i = 0 , j = 0;
//
//        while(i<arr1.length && j<arr2.length)
//    {
//        if(arr1[i] <= arr2[j])
//        {
//            count++;
//
//            if(count > max)
//            {
//                max = count;
//                time = arr1[i];
//            }
//            i++;
//        }
//        else {
//            count--;
//            j++;
//        }
//
//    }
//        System.out.println(max + " " + time);

}
