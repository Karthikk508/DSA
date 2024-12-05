package Striver;

public class Find_out_how_many_times_the_array_has_been_rotated {

    public static void main(String[] args){
        // Write your code here.
        int[] arr = {3, 4, 5, 1, 2};
        int ans = findpivot(arr);
        int count =  0;
        for(int i = 0; i<ans; i++)
        {
            count++;
        }
        System.out.println(count);
    }
    public static int findpivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end)
        {
            int mid = (start + end) / 2;

            if(mid < end && arr[mid] > arr[mid+1])
            {
                return mid+1;
            }

            if(mid > start && arr[mid] < arr[mid-1])
            {
                return mid;
            }

            if(arr[mid] >= arr[start])
            {
                start = mid + 1;
            }
            else
            {
                end = mid - 1;
            }
        }
        return -1;
    }
}