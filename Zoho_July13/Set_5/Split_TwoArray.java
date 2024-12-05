package Set_5;

class Split_TwoArray  {

    public static int find(int[] arr)
    {
        int totalSum = 0;

        for(int i : arr)
        {
            totalSum += i;
        }
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {

            leftSum += arr[i];
            totalSum -= arr[i];
            if(leftSum == totalSum)
            {
                return i;
            }
        }
        return -1;
    }


    public static void main (String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,6};
        int n = arr.length;
        int split = find(arr);

        if(split == -1) {
            System.out.println("not found");
            return;
        }

        for (int i = 0; i <= split; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = split+1; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}

// This code is contributed by vt_m
