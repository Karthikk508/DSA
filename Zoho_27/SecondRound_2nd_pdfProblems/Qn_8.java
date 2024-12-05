package SecondRound_2nd_pdfProblems;

import java.util.ArrayList;

public class Qn_8 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int n = 9;
        ArrayList<Integer> track = new ArrayList<>();
        printSubset(n,0,0,arr,track);
        
    }
    public static void printSubset(int n, int sum, int ind , int[] arr, ArrayList<Integer> track)
    {
        if(ind == arr.length)
        {
            if(sum == n)
            {
                System.out.println(track);
                System.out.println(sum);
            }
            return;
        }
        track.add(arr[ind]);
        printSubset(n,sum+arr[ind],ind+1,arr,track);
        track.removeLast();
        printSubset(n,sum,ind+1,arr,track);
    }
}
