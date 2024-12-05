package Striver;

public class Floor_and_Ceil_in_Sorted_Array{
    public static int floor(int[] arr, int x)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end)
        {
            int mid = start + ((end-start)/2);
            if(arr[mid]<=x)
            {
                ans = arr[mid];
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return ans;
    }
    public static int ceil(int[] arr, int x)
    {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;

        while(start <= end)
        {
            int mid = start + ((end-start)/2);

            if(arr[mid] >= x)
            {
                ans = arr[mid];
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return ans;
    }
    public static int[] getFloorAndCeil(int[] arr, int n, int x) {
        int f = floor(arr, x);
        int c = ceil(arr, x);
        return new int[]{f, c};
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 5;
        int[] ans = getFloorAndCeil(arr, n, x);
        System.out.println("The floor and ceil are: " + ans[0]
                + " " + ans[1]);
    }
}

