package Subset;

public class Subset_sum {
    public static void main(String[] args) {
        int[] arr = {5,2,1};
        sum(0,0,arr);
    }
    public static void sum(int i, int sum, int[] arr)
    {
        if(i == arr.length)
        {
            System.out.println(sum);
            return;
        }
        sum(i+1,sum+arr[i],arr);
        sum(i+1,sum,arr);
    }
}
