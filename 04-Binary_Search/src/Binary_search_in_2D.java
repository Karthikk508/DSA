import java.util.Arrays;

public class Binary_search_in_2D {

    public static void main(String[] args) {

        int[][] arr = { {10,20,30,40},
                        {15,25,35,45},
                        {28,29,37,49},
                        {33,34,38,50} };

        int target = 50;

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        int[] a = search(arr,target);

        System.out.println(Arrays.toString(a));


    }

    public static int[] search(int[][] arr,int target) {

        int row = 0;
        int column = arr[0].length-1;

        System.out.println(column);

        while(row<arr.length && column>=0)
        {

            if(arr[row][column]==target)
            {
                return new int[] {row,column};
            }
            if(arr[row][column] < target  )
            {
                row++;
            }
            else
            {
                column--;
            }

        }

        return new int[] {-1,-1};
    }
}
