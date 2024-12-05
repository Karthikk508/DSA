package Assignment_problems;

public class Check_Array_sorted_or_Not {

    public static void main(String[] args) {


    }
    public static boolean check (int[] arr, int n)
    {
        if( n == 0 || n == 1) {
            return true;
        }
        if(arr[n-1] < arr[n-2])
        {
            return false;
        }
        return check(arr, n-1);
    }
}
