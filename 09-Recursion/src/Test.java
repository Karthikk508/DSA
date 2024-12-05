import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        fun(3);

        int[] arr = {1,2,3,4,5,6,7,8};

        rev(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    public static void fun(int i)
    {
        if(i<1) return;
        fun(i-1);
        System.out.println(i);
    }

    public static void rev(int[] arr,int s,int e)
    {
        if(s>e) return;
        swap(arr,s,e);
        rev(arr,s+1,e-1);

    }
    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
