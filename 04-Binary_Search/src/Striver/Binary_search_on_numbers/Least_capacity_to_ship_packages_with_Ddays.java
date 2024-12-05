package Striver.Binary_search_on_numbers;   // IMPORTANT  // AMAZON
public class Least_capacity_to_ship_packages_with_Ddays {

    public static int cap(int[] arr , int cap)
    {
        int load = 0 , days = 1;

        for(int i = 0; i<arr.length; i++)
        {
            if(load+arr[i] > cap)
            {
                days++;
                load = arr[i];
            }
            else
            {
                load += arr[i];
            }
        }
        return days;
    }
    public static int leastWeightCapacity(int[] arr, int d) {
        // Write your code here.

        // Range = [sum,max]
        int sum = 0 , max = 0;
        for(int i : arr)
        {
            sum += i;
            max = Math.max(max,i);
        }

        int start = max , end = sum;

        while(start<=end)
        {
            int mid = (start+(end-start)/2);

            if(cap(arr,mid)<=d)
            {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return start;

    }
}