public class Find_Unique_XOR {

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,5,6,6,7,7};
        System.out.println(unique(arr));
    }
    public static int unique (int[] arr)
    {
        int unique = 0;

        for(int i : arr)
        {
            unique ^= i;
        }
        return unique;
    }
}
