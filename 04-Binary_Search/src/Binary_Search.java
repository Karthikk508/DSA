public class Binary_Search {
    public static void main(String[] args) {

        int[] arr = {2,3,5,9,14,16,18};
        int a = binarysearch(arr,6);
        System.out.println(a);
    }
    static int binarysearch(int[] arr,int target)
    {
        int mid = 0,start=0,end=7,ans=0;

        while (start <= end ) {

            mid = (start+end)/2;

            if(arr[mid] < target)
            {
                start = mid+1;
            }
            else if(arr[mid] > target)
            {
                end = mid-1;
            }
            else
            {
                return mid;
            }

        }

       return -1;
    }
}
