package Striver;

public class SubsetSum1 {

    public static void main(String[] args) {

        subset1(0,new int[] {1,2,3,4},0);


    }
    public static void subset1(int i, int[] arr,int sum)
    {
        if(i == arr.length-1)
        {
            System.out.println(sum);
            return;
        }

        subset1(i+1, arr,sum);
        subset1(i+1,arr,sum+arr[i]);

        //1, 3, 6, 10, 2, 5, 9, 3, 7, 4.
    }
}
