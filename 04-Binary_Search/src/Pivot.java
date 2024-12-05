public class Pivot {

    public static void main(String[] args)
    {
        int[] arr = {7,8,9,10,11,12,1,2,3,4,5,6};
        int ans = findpivot(arr);
        System.out.println(ans);
    }
      public static int findpivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1])
            {
                return arr[mid+1];
            }
            if (mid > start && arr[mid] < arr[mid - 1])
            {
                return arr[mid];
            }
            if (arr[mid] <= arr[start])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return -1;
    }
}


