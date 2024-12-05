import java.sql.SQLOutput;
import java.util.Arrays;

public class Testing {
    public static void main(String[] args) {
        xor();
        numbers();

    }
    public static void test()
    {
        int[] nums = {-100,-98,-1,2,3,4};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }


        public static int[] getSecondOrderElements1(int n, int []a) {
            // Write your code here.
            Arrays.sort(a);
            return new int[]{a[n - 2], a[1]};
        }


        public static int[] getSecondOrderElements2(int n, int []a) {
            // Write your code here.
            int secondmax =  max(a);
            int secondmin = min(a);
            return new int[] {secondmax,secondmin};

        }
        public static int max(int[] arr)
        {
            int firstmax = 0;
            int secondmax = 0;
            for(int i=0; i<arr.length; i++)
            {   if(arr[i]>firstmax)
            {
                secondmax = firstmax;
                firstmax = arr[i];
            }
            }
            return secondmax;
        }
        public static int min(int[] arr)
        {
            int firstmin = -1;
            int secondmin = 0;
            for(int i=0; i<arr.length; i++)
            {   if(arr[i]<firstmin)
            {
                secondmin = firstmin;
                firstmin = arr[i];
            }
            }
            return secondmin;
        }
        public static void xor()
        {
           int[] arr = {1,2,4,5};
           int xor1 = 0;
           int xor2 = 0;
           int n = arr.length+1;  // n=5
           for(int i=0; i<arr.length; i++)
           {
               xor2 = xor2 ^ i+1;
               xor1 = xor1 ^ arr[i];
           }
                xor2 = xor2 ^ n;
            //  System.out.println(xor1);
            //  System.out.println(xor2);
                System.out.println(xor1^xor2);
            //  System.out.println(1^2^3^4^5^6);
            //  System.out.println(1^2^3^5^6);
            //  System.out.println(7^3);
        }
        public static void numbers()
        {

            if(-1>-2) System.out.println(true);
          // char a = chr(ord('A'));
            int lastSmaller = Integer.MIN_VALUE;

        }


}
