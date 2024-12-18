package Hard_Imp;
import java.util.*;
public class Three_sum  {

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4};
        int n = arr.length;
        List<List<Integer>> ans = triplet(n, arr);
        for (List<Integer> it : ans) {
            System.out.print("[");
            for (Integer i : it) {
                System.out.print(i + " ");
            }
            System.out.print("] ");
        }
        System.out.println();
    }
    public static List<List<Integer>> triplet(int n, int []arr) {

        // Write your code here.
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++)
        {
            if(i>0 && arr[i] == arr[i-1]) continue;
            int j = i+1;
            int k = n-1;

            while(j<k)
            {
                int sum = arr[i]+arr[j]+arr[k];

                if(sum>0) k--;
                else if(sum<0) j++;
                else
                {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    // skipping the duplicates
                    while(j<k && arr[j] == arr[j-1]) j++;
                    while(j<k && arr[k] == arr[k-1]) k--;
                }
            }

        }
        return ans;
    }
}