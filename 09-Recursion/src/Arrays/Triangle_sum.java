package Arrays;
import java.util.Arrays;

//public class Triangle_sum {
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        System.out.println(Arrays.toString(arr));
//        sum(arr,0);
//    }
//    public static void sum(int[] arr, int i)
//    {
//        if(arr.length == 1)
//        {
//            return;
//        }
//
//        if(i<arr.length-1)
//        {
//            arr[i] = arr[i]+arr[i+1];
//            sum(arr,i+1);
//        }
//        else
//        {
//            int[] arr1 = Arrays.copyOfRange(arr,0,arr.length-1);
//            System.out.println(Arrays.toString(arr1));
//            sum(arr1,0);
//        }
//    }
//}


class Triangle_sum {

    public static void main(String[] args) {

        long [] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(getTriangle(arr,5)));

    }

    public static long[] getTriangle(long arr[], long n)
    {
        int size = 0;
        for(int i = 0; i<=n; i++)
        {
            size += i;
        }

        long[] arr1 = new long[size];

        return sum(arr,arr1,0,0);
    }

    public static long[] sum(long[] arr, long[] ans, int i,int k)
    {
        if(arr.length == 1)
        {
            return ans;
        }

        if(i<arr.length-1)
        {
            arr[i] = arr[i]+arr[i+1];
            return sum(arr,ans,i+1,k);
        }
        else
        {
            long[] arr1 = Arrays.copyOfRange(arr,0,arr.length-1);

            for(int l = arr1.length-1; l>=0; l--)
            {
                ans[k] = arr1[l];
                k++;
            }
            return sum(arr1,ans,0,k);
        }
    }
}
