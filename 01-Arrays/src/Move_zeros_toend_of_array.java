public class Move_zeros_toend_of_array {

    public static void main(String[] args) {


    }
    public static int[] moveZeros1(int n, int []a) { // Method 1 (optimal)
        int index = 0;
        for(int i=0; i<a.length; i++)
        {
            if(a[i] != 0)
            {
                a[index++] = a[i];
            }
        }
        for(int i=index; i<a.length; i++)
        {
            a[i] = 0;
        }
        return a;
    }
    public static int[] moveZeros2(int n, int []a) { // Method 2 (optimal) // using swap

        int j = -1;
        for(int i=0; i<a.length; i++)
        {
            if(a[i]==0)
            {
                j=i;
                break;
            }
        }
        if(j == -1) return a;

        for(int i=j+1; i<n; i++)
        {
            if(a[i] != 0)
            {
                swap(a,i,j);
                j++;
            }
        }
        return a;
    }
    public static void swap(int[] arr, int first, int second)
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
