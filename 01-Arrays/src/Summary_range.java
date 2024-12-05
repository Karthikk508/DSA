public class Summary_range {
    public static void main(String[] args) {

        int[] arr = {0,2,3,4,6,8,9};

        range(arr);

    }
    public static void range(int[] arr)
    {
        int i;
        int j;

        for(i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
            for(j=i+1; j< arr.length-1; j++)
            {
                if(arr[j+1]-arr[j] != 1)
                {
                    System.out.println(arr[j]);
                    i=j+1;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }

}
