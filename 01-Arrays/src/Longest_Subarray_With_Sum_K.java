public class Longest_Subarray_With_Sum_K {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,5,1,1,1,1,1,2};
        System.out.println(longestSubarrayWithSumK(arr,6));
    }
    public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        long sum = 0;
        int start = 0,end = 0,len=0,max = 0;
        while(start<a.length)
        {
            if(start<a.length) sum += a[start];
            while(sum>k && start>=end){
                sum-=a[end];
                end++;
            }
            if(sum == k)
            {
                len = (start - end) + 1;
                if(len>max)
                {
                    max = len;
                }
            }
            start++;

        }
        return max;
    }
}
