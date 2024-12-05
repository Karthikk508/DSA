package Binary_search.TwoDarrays;

public class RowWithMax1 {

    public static void main(String[] args) {

        int[][] arr = {{0, 1, 1, 1},{0, 0, 1, 1},{1, 1, 1, 1},{0, 0, 0, 0}};

        System.out.println(rowWithMax1s(arr));


    }
    public static int rowWithMax1s(int[][] arr) {
        // code here
        int ind = -1 , ans = 0;

        for(int i = 0; i<arr.length; i++)
        {

            int count = arr[0].length - find(arr[i]);

            if(count > ans)
            {
                ind = i;
                ans = count;

            }
        }

        return ind;
    }
    public static int find(int[] arr)
    {
        int ans = arr.length;
        int target = 1;

        int start = 0 , end = arr.length-1;

        while(start <= end)
        {
            int mid = (start+end)/2;

            if(arr[mid] >= target)
            {
                ans = mid;
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }

        return ans;
    }

}
