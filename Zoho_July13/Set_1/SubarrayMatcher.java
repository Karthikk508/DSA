package Set_1;

public class SubarrayMatcher {

    public static void main(String[] args) {

        int[] arr1 = {4,5,6,3,2,1,8,7,9,1,2,3};
        int[] arr2 = {1,2,3};
        find(arr1,arr2);
    }
    public static void find(int[] arr1, int[] arr2)
    {
        int i = 0 , j = 0;

        boolean flag = false;

        while(i < arr1.length)
        {
            if(check(arr1[i],arr2))
            {
                j = i;
                while(j < arr1.length && check(arr1[j],arr2) )
                {
                    flag = true;
                    j++;
                }
                for (int k = i; k < j; k++) {
                    System.out.print(arr1[k]);
                }
            }
            else
            {
                flag =  false;
            }
            if(flag)
            {
                i += j-1;
            }
            else
            {
                i++;
            }
        }

    }
    public static boolean check(int num , int[] arr2)
    {
        for (int j : arr2) {
            if (num == j) {
                return true;
            }
        }
        return false;
    }
}
