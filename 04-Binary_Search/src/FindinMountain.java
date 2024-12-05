public class FindinMountain {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 1};

        int peak = peak(arr);
        System.out.println(peak);

        int target = 3;

        int first;

        if (orderAgnostic(arr, 0, peak, target) != -1) {
            first = orderAgnostic(arr, 0, peak, target);

        }
        else {
            first = orderAgnostic(arr, peak, arr.length - 1, target);
        }
        System.out.println(first);

    }

    public static int peak(int[] arr)
    {


        int start = 0;
        int mid = 0;
        int end =  arr.length - 1;

        while(start < end)
        {
            mid = start + (end-start)/2;

            if(arr[mid] > arr[mid+1])
            {
                end = mid;
            }
            else start = mid+1;

        }

        return start;

    }
    public static int orderAgnostic(int[] arr,int start, int end,int target)
    {



        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    }


