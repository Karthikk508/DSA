public class Element_in_InfiniteArray {

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 7;

        System.out.println(findindex(nums,target));

    }
    public static int findindex(int[] nums,int target)
    {
        int start = 0;
        int end = 1;

        while(target > nums[end])
        {
            int newS = end + 1;
            end = end + (end-start+1)*2;
            start = newS;
        }

        return binarysearch(nums,start,end,target);
    }

    public static int binarysearch(int[] arr,int start,int end,int target)
    {
        int mid = 0;
        int ans = 0;

        while (start <= end ) {

            mid = start + (end-start)/2;

            if(target < arr[mid])
            {
                end = mid-1;
            }
            else if(target > arr[mid])
            {
                start = mid+1;
            }
            else
            {
                return mid;
            }

        }

        return -1;
    }

}
