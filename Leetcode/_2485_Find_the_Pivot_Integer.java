import java.util.Arrays;

public class _2485_Find_the_Pivot_Integer {

    public static void main(String[] args) {

        System.out.println(find(8));
    }
    public static int find(int n)
    {
        int[] arr = new int[n];
        int index = 0;
        for(int i = 1; i<=n; i++)
        {
            arr[index++] = i;
        }
        System.out.println(Arrays.toString(arr));

        int start = 0 , end = arr.length-1;
        int sum1 = arr[start] , sum2 = arr[end];

        while(start <= end)
        {
            if(sum1 == sum2)
            {
                return arr[start];
            }
            while(sum1 > sum2)
            {
                sum2 += arr[end];
                end--;
            }
            while(sum1 < sum2)
            {
                sum1 += arr[start];
                start++;
            }
        }
        return -1;
    }

}
