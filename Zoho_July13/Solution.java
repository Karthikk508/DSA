


public class Solution {

    public static void main(String[] args) {

        int[] arr = {75,5,-5,75,-2,-3,88,10,10,87};

        System.out.println(canArrange(arr,85));


    }
    public static boolean canArrange(int[] arr, int k) {

        int n = arr.length;

        for(int i = 0; i<n/2; i++)
        {
            boolean flag = true;
            for(int j = n/2; j<arr.length; j++)
            {
                int val = arr[i]+arr[j];

                if(val < 0) val = -1 * val;

                if(val % k == 0)
                {
                    flag = false;
                    break;
                }
            }
            if(flag) return false;
        }

        return true;

    }
}