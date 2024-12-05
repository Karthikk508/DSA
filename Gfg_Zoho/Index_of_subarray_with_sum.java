import java.util.ArrayList;

public class Index_of_subarray_with_sum {

    public static void main(String[] args) {

        int[] A = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(subarraySum(A,5,15));

    }
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here

        ArrayList<Integer> list = new ArrayList<>();

        int i = 0 , j = 1 , sum = arr[0];
        while(i<j)
        {
            if(sum == s)
            {
                list.add(i+1);
                list.add(j);
                break;
            }
            if(sum < s)
            {
                sum += arr[j];
                j++;
            }
            if(sum > s)
            {
                sum -= arr[i];
                i++;
            }
        }
        return list;
    }
}
